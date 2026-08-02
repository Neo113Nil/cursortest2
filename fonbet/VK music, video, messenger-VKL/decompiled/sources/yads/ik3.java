package yads;

import android.graphics.Matrix;
import android.view.TextureView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.jza0;
import xsna.xgt0;

/* loaded from: classes10.dex */
public final class ik3 implements jza0.b {
    public c13 a;
    public c13 b;
    public TextureView c;
    public ok3 d;

    public final void a() {
        Matrix matrix;
        c13 c13Var = this.b;
        ok3 ok3Var = this.d;
        c13 c13Var2 = this.a;
        TextureView textureView = this.c;
        if (c13Var2 == null || c13Var == null || ok3Var == null || textureView == null) {
            return;
        }
        mk3 mk3Var = new mk3(c13Var, c13Var2);
        if (c13Var2.b <= 0 || c13Var2.c <= 0 || c13Var.b <= 0 || c13Var.c <= 0) {
            matrix = null;
        } else {
            int ordinal = ok3Var.ordinal();
            if (ordinal == 0) {
                matrix = mk3Var.a(1.0f, 1.0f, kk3.b);
            } else if (ordinal == 1) {
                float f = c13Var.b / c13Var2.b;
                float f2 = c13Var.c / c13Var2.c;
                float min = Math.min(f, f2);
                matrix = mk3Var.a(min / f, min / f2, kk3.c);
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float f3 = c13Var.b / c13Var2.b;
                float f4 = c13Var.c / c13Var2.c;
                float max = Math.max(f3, f4);
                matrix = mk3Var.a(max / f3, max / f4, kk3.c);
            }
        }
        if (matrix != null) {
            textureView.setTransform(matrix);
        }
    }

    public final void b() {
        TextureView textureView = this.c;
        if (this.d == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        textureView.setTransform(matrix);
    }

    @Override // xsna.jza0.b
    public final void onSurfaceSizeChanged(int i, int i2) {
        this.b = new c13(i, i2);
        a();
    }

    @Override // xsna.jza0.b
    public final void onVideoSizeChanged(xgt0 xgt0Var) {
        int i = xgt0Var.a;
        float f = xgt0Var.c;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = an10.b(i * f);
        }
        this.a = new c13(i, xgt0Var.b);
        a();
    }
}
