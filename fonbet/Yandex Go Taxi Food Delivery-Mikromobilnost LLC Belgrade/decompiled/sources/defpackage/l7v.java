package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.utils.a;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class l7v {
    public final Object a(Object obj) {
        Throwable th;
        Bitmap createBitmap;
        k590 k590Var = (k590) obj;
        mdl0 mdl0Var = null;
        try {
            try {
                int e = k590Var.e();
                if (e == 35) {
                    jdv jdvVar = (jdv) k590Var.c();
                    boolean z = k590Var.f() % SubsamplingScaleImageView.ORIENTATION_180 != 0;
                    mdl0 mdl0Var2 = new mdl0(c5b1.a(z ? jdvVar.getHeight() : jdvVar.getWidth(), z ? jdvVar.getWidth() : jdvVar.getHeight(), 1, 2));
                    try {
                        e8v d = ImageProcessingUtil.d(jdvVar, mdl0Var2, ByteBuffer.allocateDirect(jdvVar.getWidth() * jdvVar.getHeight() * 4), k590Var.f(), false);
                        jdvVar.close();
                        if (d == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        createBitmap = a.a(d);
                        d.close();
                        mdl0Var = mdl0Var2;
                    } catch (UnsupportedOperationException e2) {
                        e = e2;
                        throw new ImageCaptureException(0, "Can't convert " + (k590Var.e() == 35 ? "YUV" : "JPEG") + " to bitmap", e);
                    } catch (Throwable th2) {
                        th = th2;
                        mdl0Var = mdl0Var2;
                        if (mdl0Var == null) {
                            throw th;
                        }
                        mdl0Var.close();
                        throw th;
                    }
                } else {
                    if (e != 256 && e != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + k590Var.e());
                    }
                    jdv jdvVar2 = (jdv) k590Var.c();
                    Bitmap a = a.a(jdvVar2);
                    jdvVar2.close();
                    int f = k590Var.f();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(f);
                    createBitmap = Bitmap.createBitmap(a, 0, 0, a.getWidth(), a.getHeight(), matrix, true);
                }
                if (mdl0Var != null) {
                    mdl0Var.close();
                }
                return createBitmap;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (UnsupportedOperationException e3) {
            e = e3;
        }
    }
}
