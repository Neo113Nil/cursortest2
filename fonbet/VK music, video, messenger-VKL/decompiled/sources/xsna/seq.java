package xsna;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.vk.core.files.ExternalDirType;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExternalFileUtils.kt */
/* loaded from: classes.dex */
public final class seq {

    /* compiled from: ExternalFileUtils.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExternalDirType.values().length];
            try {
                iArr[ExternalDirType.DOWNLOADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExternalDirType.IMAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExternalDirType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static String a(String str, ExternalDirType externalDirType) {
        String path = d(str, externalDirType).getPath();
        if (path == null) {
            path = "";
        }
        return new File(path).exists() ? a(eqm0.b(str), externalDirType) : str;
    }

    public static File b(ExternalDirType externalDirType) {
        File file = new File(Environment.getExternalStoragePublicDirectory(externalDirType.h()).getAbsolutePath() + File.separator + externalDirType.i());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static Uri c(Context context, String str, ExternalDirType externalDirType) {
        Uri uri;
        if (!gz80.a(29)) {
            return d(str, externalDirType);
        }
        int i = a.$EnumSwitchMapping$0[externalDirType.ordinal()];
        if (i == 1) {
            uri = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
        } else if (i == 2) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        ContentResolver contentResolver = context.getContentResolver();
        String str2 = externalDirType.h() + File.separator + externalDirType.i();
        String a2 = a(str, externalDirType);
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", a2);
        contentValues.put("relative_path", str2);
        if (gz80.a == 29) {
            contentValues.put("mime_type", MimeTypeMap.getSingleton().getMimeTypeFromExtension(com.vk.core.files.a.g(str)));
        }
        Uri insert = contentResolver.insert(uri, contentValues);
        return insert == null ? d(a2, externalDirType) : insert;
    }

    public static Uri d(String str, ExternalDirType externalDirType) {
        return Uri.fromFile(new File(Uri.fromFile(b(externalDirType)).getPath(), str));
    }
}
