package ru.ok.gl.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.jsonwebtoken.JwtParser;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.gl.util.IoHelper;
import xsna.atv0;
import xsna.fo8;
import xsna.fw3;
import xsna.ho8;

/* loaded from: classes9.dex */
public final class IoHelper {
    private IoHelper() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] convertToBytesAndCloseStream(@NonNull InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyAndCloseStreams(byteArrayOutputStream, inputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void copyAndCloseStreams(@NonNull OutputStream outputStream, @NonNull InputStream inputStream) throws IOException {
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            }
        } finally {
            closeQuietly(outputStream);
            closeQuietly(inputStream);
        }
    }

    public static void copyBinaryFromAssets(@NonNull Context context, @NonNull String str, @NonNull File file) throws IOException {
        InputStream open = context.getAssets().open(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[65536];
                while (true) {
                    int read = open.read(bArr);
                    if (-1 == read) {
                        fileOutputStream.close();
                        open.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static File createNewFile(@NonNull File file, @NonNull String str, @NonNull String str2) {
        try {
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Failed to create target dir: " + file);
            }
            return File.createTempFile(str + new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()) + BundleUtil.UNDERLINE_TAG, str2, file);
        } catch (Exception unused) {
            return null;
        }
    }

    public static File createNewFileInEnvironmentDir(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return createNewFile(Environment.getExternalStoragePublicDirectory(str), str2, str3);
    }

    public static void deleteRecursively(@NonNull File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteRecursively(file2);
            }
        }
        file.delete();
    }

    @NonNull
    public static String getDrawableResourceUrl(@NonNull Context context, int i) {
        return getResourceIdUrl(context, i);
    }

    @NonNull
    public static String getExtension(File file) {
        String name = file != null ? file.getName() : null;
        int lastIndexOf = name != null ? name.lastIndexOf(46) : -1;
        if (Math.max(name != null ? name.lastIndexOf(47) : -1, name != null ? name.lastIndexOf(92) : -1) > lastIndexOf) {
            lastIndexOf = -1;
        }
        return lastIndexOf != -1 ? name.substring(lastIndexOf + 1) : "";
    }

    @NonNull
    public static String[] getFiles(File file, String str) {
        final Pattern compile = Pattern.compile(globToRegex(str));
        String[] list = file.list(new FilenameFilter() { // from class: xsna.ssx
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                boolean lambda$getFiles$0;
                lambda$getFiles$0 = IoHelper.lambda$getFiles$0(compile, file2, str2);
                return lambda$getFiles$0;
            }
        });
        if (list == null) {
            return new String[0];
        }
        Arrays.sort(list);
        return list;
    }

    public static int getImageRotation(@NonNull File file) throws IOException {
        if (!file.exists() || !file.isFile()) {
            return -1;
        }
        int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
        if (attributeInt == 1) {
            return 0;
        }
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt == 6) {
            return 90;
        }
        if (attributeInt != 8) {
            return -1;
        }
        return atv0.b;
    }

    public static int getResId(String str, Class<?> cls) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            return declaredField.getInt(declaredField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    @NonNull
    private static String getResourceIdUrl(@NonNull Context context, int i) {
        return "android.resource://" + context.getPackageName() + DomExceptionUtils.SEPARATOR + i;
    }

    public static int getSafeImageRotation(@NonNull File file) {
        try {
            return getImageRotation(file);
        } catch (IOException unused) {
            return -1;
        }
    }

    private static String globToRegex(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            if (c == '*') {
                sb.append(".*");
            } else if (c == '.') {
                sb.append("\\.");
            } else if (c != '?') {
                sb.append(c);
            } else {
                sb.append(JwtParser.SEPARATOR_CHAR);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getFiles$0(Pattern pattern, File file, String str) {
        return pattern.matcher(str).matches();
    }

    public static Bitmap loadBitmap(File file) {
        if (file == null || !file.exists() || !file.isFile() || file.length() == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    public static Uri makeContentFileUri(@NonNull Context context, @NonNull File file, @NonNull String str) {
        return FileProvider.getUriForFile(context, str, file);
    }

    public static boolean move(@NonNull File file, @NonNull File file2) {
        StringBuilder e = fw3.e(file.getParentFile().getAbsolutePath().toString());
        String str = File.separator;
        e.append(str);
        e.append(file.getName());
        File file3 = new File(e.toString());
        StringBuilder b = ho8.b(file2.getParentFile().getAbsolutePath().toString(), str);
        b.append(file2.getName());
        return file3.renameTo(new File(b.toString()));
    }

    public static Uri publishImageInGallery(@NonNull Context context, @NonNull Bitmap bitmap, Long l, String str) {
        String insertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, fo8.a(str, DateFormat.getDateTimeInstance().format(l != null ? new Date(l.longValue()) : new Date())), (String) null);
        if (insertImage != null) {
            return Uri.parse(insertImage);
        }
        return null;
    }

    public static Uri publishVideoInGallery(@NonNull Context context, @NonNull String str, @NonNull File file, Long l, String str2) throws IOException {
        if (!file.exists() || !file.isFile() || file.length() == 0) {
            return null;
        }
        String a = fo8.a(str2, DateFormat.getDateTimeInstance().format(l != null ? new Date(l.longValue()) : new Date()));
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", a);
        contentValues.put("mime_type", str);
        contentValues.put("_data", file.getAbsolutePath());
        return contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    public static void pushMediaScanner(@NonNull Context context, @NonNull Uri uri) {
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
    }

    public static byte[] readBytesFromRaw(@NonNull Context context, int i) throws IOException {
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read < 0) {
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        openRawResource.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @NonNull
    public static JSONObject readFromFile(@NonNull File file) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            StringBuffer stringBuffer = new StringBuffer();
            char[] cArr = new char[1024];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read <= 0) {
                    JSONObject jSONObject = new JSONObject(stringBuffer.toString());
                    bufferedReader.close();
                    return jSONObject;
                }
                stringBuffer.append(cArr, 0, read);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String readTextFrom(@NonNull InputStream inputStream, String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            return new String(bArr, Charset.forName(C.UTF8_NAME));
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
                sb.append(readLine);
                sb.append(str);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String readTextFromAssets(@NonNull Context context, @NonNull String str, String str2) throws IOException {
        InputStream open = context.getAssets().open(str);
        try {
            String readTextFrom = readTextFrom(open, str2);
            if (open != null) {
                open.close();
            }
            return readTextFrom;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static String readTextFromRaw(@NonNull Context context, int i, String str) throws IOException {
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            String readTextFrom = readTextFrom(openRawResource, str);
            if (openRawResource != null) {
                openRawResource.close();
            }
            return readTextFrom;
        } catch (Throwable th) {
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void readToEndOfStream(@NonNull InputStream inputStream) throws IOException {
        while (inputStream.read(new byte[1024], 0, 1024) != -1) {
        }
    }

    public static byte[] safeConvertToBytesAndCloseStream(@NonNull InputStream inputStream) {
        try {
            return convertToBytesAndCloseStream(inputStream);
        } catch (IOException unused) {
            return null;
        }
    }

    public static Bitmap safeLoadBitmap(File file) {
        try {
            return loadBitmap(file);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Uri safePublishImageInGallery(@NonNull Context context, @NonNull Bitmap bitmap, Long l, String str) {
        try {
            return publishImageInGallery(context, bitmap, l, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Uri safePublishVideoInGallery(@NonNull Context context, @NonNull String str, @NonNull File file, Long l, String str2) {
        try {
            return publishVideoInGallery(context, str, file, l, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] safeReadBytesFromRaw(@NonNull Context context, int i) {
        try {
            return readBytesFromRaw(context, i);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String safeReadTextFromAssets(@NonNull Context context, @NonNull String str) {
        return safeReadTextFromAssets(context, str, null);
    }

    public static String safeReadTextFromRaw(@NonNull Context context, int i) {
        return safeReadTextFromRaw(context, i, (String) null);
    }

    public static byte[] safeConvertToBytesAndCloseStream(@NonNull File file) {
        try {
            return safeConvertToBytesAndCloseStream(new FileInputStream(file));
        } catch (IOException unused) {
            return null;
        }
    }

    public static Uri safePublishImageInGallery(@NonNull Context context, @NonNull File file, Long l, String str) {
        try {
            return publishImageInGallery(context, file, l, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String safeReadTextFromAssets(@NonNull Context context, @NonNull String str, String str2) {
        try {
            return readTextFromAssets(context, str, str2);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String safeReadTextFromRaw(@NonNull Context context, int i, String str) {
        try {
            return readTextFromRaw(context, i, str);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String safeReadTextFromRaw(@NonNull Context context, @NonNull String str, String str2) {
        try {
            return readTextFromAssets(context, str, str2);
        } catch (IOException unused) {
            return null;
        }
    }

    public static Uri publishImageInGallery(@NonNull Context context, @NonNull File file, Long l, String str) throws IOException {
        if (file.exists() && file.isFile() && file.length() != 0) {
            String insertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), file.getAbsolutePath(), fo8.a(str, DateFormat.getDateTimeInstance().format(l != null ? new Date(l.longValue()) : new Date())), (String) null);
            if (insertImage != null) {
                return Uri.parse(insertImage);
            }
        }
        return null;
    }
}
