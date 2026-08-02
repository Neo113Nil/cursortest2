package yads;

import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class mk3 {
    public final c13 a;

    public mk3(c13 c13Var, c13 c13Var2) {
        this.a = c13Var;
    }

    public final Matrix a(float f, float f2, kk3 kk3Var) {
        int ordinal = kk3Var.ordinal();
        if (ordinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return matrix;
        }
        if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        c13 c13Var = this.a;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f, f2, c13Var.b / 2.0f, c13Var.c / 2.0f);
        return matrix2;
    }
}
