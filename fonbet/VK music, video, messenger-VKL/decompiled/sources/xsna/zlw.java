package xsna;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.ExifInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.toggle.Features;
import java.io.File;
import java.io.IOException;

/* compiled from: ImageState.java */
/* loaded from: classes15.dex */
public final class zlw {

    @Nullable
    public final MediaStoreEntry a;

    @Nullable
    public final File b;
    public final boolean c;

    @Nullable
    public Bitmap d;

    public zlw(@NonNull MediaStoreEntry mediaStoreEntry) {
        this.a = mediaStoreEntry;
        this.b = null;
        this.c = com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_IMAGE_LOADING_NATIVE_RES);
    }

    @Nullable
    public static Bitmap b(@Nullable Bitmap bitmap, @NonNull String str) {
        if (bitmap == null) {
            return null;
        }
        try {
            ExifInterface exifInterface = new ExifInterface(str);
            Matrix matrix = new Matrix();
            switch (exifInterface.getAttributeInt("Orientation", 0)) {
                case 2:
                    matrix.setScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.postRotate(180.0f);
                    break;
                case 4:
                    matrix.postRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 5:
                    matrix.postRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix.postRotate(90.0f);
                    break;
                case 7:
                    matrix.postRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix.postRotate(-90.0f);
                    break;
            }
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (IOException unused) {
            return null;
        }
    }

    public final String a() {
        File file = this.b;
        if (file != null) {
            return file.getPath();
        }
        MediaStoreEntry mediaStoreEntry = this.a;
        if (mediaStoreEntry != null) {
            return mediaStoreEntry.f().getPath();
        }
        throw new IllegalStateException("Unexpectedly file & entry are null");
    }

    public zlw(@NonNull File file) {
        this.b = file;
        this.a = null;
        this.c = com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_IMAGE_LOADING_NATIVE_RES);
    }
}
