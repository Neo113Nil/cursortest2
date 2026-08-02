package xsna;

import android.graphics.Bitmap;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: Utils.kt */
/* loaded from: classes4.dex */
public final class s3r0 {
    public static final File a(Bitmap bitmap) {
        PrivateFiles.a b;
        b = e8r.a.b(r1, PrivateSubdir.PHOTO_EDITOR.h(), true);
        File file = new File(b.a, "overlay_menu_screenshot_" + System.currentTimeMillis() + ".png");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            return file;
        } finally {
        }
    }
}
