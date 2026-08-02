package xsna;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.common.cadre.CadreTarget;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StickerUtils.kt */
/* loaded from: classes15.dex */
public final class x7l0 implements w8i {
    public static final x7l0 b = new x7l0();
    public static final Object c = msy.a(LazyThreadSafetyMode.NONE, new xqi0(2));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public static List a(View view, Matrix matrix) {
        RectF G = bwt0.G(view);
        G.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -kz8.b((kz8) c.getValue(), view.getRootView(), false, CadreTarget.EDITOR, 10).c);
        float[] b2 = b(G);
        matrix.mapPoints(b2);
        return e43.l(new PointF(b2[0], b2[1]), new PointF(b2[2], b2[3]), new PointF(b2[4], b2[5]), new PointF(b2[6], b2[7]));
    }

    public static float[] b(RectF rectF) {
        Float[] fArr = {Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.bottom), Float.valueOf(rectF.left), Float.valueOf(rectF.bottom)};
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }
}
