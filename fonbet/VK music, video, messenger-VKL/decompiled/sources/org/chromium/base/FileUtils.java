package org.chromium.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.function.Function;
import xsna.abr;
import xsna.fo8;

/* loaded from: classes8.dex */
public class FileUtils {
    public static Function<String, Boolean> DELETE_ALL = new abr(0);
    private static final String TAG = "FileUtils";

    public interface Natives {
        String getAbsoluteFilePath(String str);
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void copyStreamToFile(InputStream inputStream, File file) throws IOException {
        File file2 = new File(fo8.a(file.getPath(), ".tmp"));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            Log.i(TAG, "Writing to %s", file);
            copyStream(inputStream, fileOutputStream);
            fileOutputStream.close();
            if (!file2.renameTo(file)) {
                throw new IOException();
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String getAbsoluteFilePath(String str) {
        return FileUtilsJni.get().getAbsoluteFilePath(str);
    }

    public static String getExtension(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        int lastIndexOf2 = str.lastIndexOf(46);
        return lastIndexOf >= lastIndexOf2 ? "" : str.substring(lastIndexOf2 + 1).toLowerCase(Locale.US);
    }

    public static long getFileSizeBytes(File file) {
        long j = 0;
        if (file == null) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0L;
        }
        for (File file2 : listFiles) {
            j += getFileSizeBytes(file2);
        }
        return j;
    }

    public static Uri getUriForFile(File file) {
        Uri uri;
        try {
            uri = FileProviderUtils.getContentUriFromFile(file);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Could not create content uri: ".concat(String.valueOf(e)));
            uri = null;
        }
        return uri == null ? Uri.fromFile(file) : uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$static$0(String str) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r6 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap queryBitmapFromContentProvider(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            try {
                if (openFileDescriptor == null) {
                    Log.w(TAG, "Null ParcelFileDescriptor from uri ".concat(String.valueOf(uri)));
                } else {
                    FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                    if (fileDescriptor == null) {
                        Log.w(TAG, "Null FileDescriptor from uri ".concat(String.valueOf(uri)));
                    } else {
                        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                        if (decodeFileDescriptor != null) {
                            openFileDescriptor.close();
                            return decodeFileDescriptor;
                        }
                        Log.w(TAG, "Failed to decode image from uri ".concat(String.valueOf(uri)));
                    }
                }
                openFileDescriptor.close();
                return null;
            } finally {
            }
        } catch (IOException unused) {
            Log.w(TAG, "IO exception when reading uri ".concat(String.valueOf(uri)));
            return null;
        }
    }

    public static byte[] readStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean recursivelyDeleteFile(File file, Function<String, Boolean> function) {
        File[] listFiles;
        if (!file.exists()) {
            file.delete();
            return true;
        }
        if (function != null && !function.apply(file.getPath()).booleanValue()) {
            return true;
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                recursivelyDeleteFile(file2, function);
            }
        }
        boolean delete = file.delete();
        if (!delete) {
            Log.e(TAG, "Failed to delete: %s", file);
        }
        return delete;
    }
}
