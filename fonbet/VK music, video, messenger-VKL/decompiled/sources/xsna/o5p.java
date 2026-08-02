package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.imageloader.ImageScreenSize;
import com.vk.media.MediaUtils;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.io.File;
import ru.ok.proto.PublisherConfiguration;
import xsna.u440;

/* compiled from: EditorVideoDelegate.kt */
/* loaded from: classes16.dex */
public abstract class o5p {
    public final u440.b a;
    public final mny b;

    public o5p(u440.b bVar, mny mnyVar) {
        this.a = bVar;
        this.b = mnyVar;
    }

    public final synchronized Bitmap a(mat0 mat0Var, boolean z, boolean z2) {
        try {
            if (mat0Var.i == null) {
                boolean z3 = mat0Var.b;
                Bitmap a = z2 ? mcr0.j(Uri.fromFile(new File(mat0Var.a.getPath())), ImageScreenSize.VERY_BIG).a() : MediaUtils.a.k(mat0Var.c, mat0Var.a.getPath());
                if (a != null) {
                    com.vk.stories.b.a.getClass();
                    int width = a.getWidth();
                    int height = a.getHeight();
                    int i = z ? 1080 : PublisherConfiguration.DEFAULT_MAX_RES;
                    int i2 = z ? 1920 : CoverVideoUploadTask.y;
                    if (width * height > 0) {
                        i = (int) Math.min(i, width);
                        i2 = (int) Math.min(i2, height);
                    }
                    MediaUtils.d h = com.vk.stories.b.h(0.5625f, i, i2);
                    mat0Var.h = a;
                    mat0Var.i = kd7.b(a, h.a, h.b, z3, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return mat0Var.i;
    }
}
