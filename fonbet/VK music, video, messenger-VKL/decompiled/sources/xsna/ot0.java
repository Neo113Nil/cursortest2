package xsna;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes13.dex */
public final class ot0 implements uuj {
    public final uuj a;
    public final float b;

    public ot0(float f, @NonNull uuj uujVar) {
        while (uujVar instanceof ot0) {
            uujVar = ((ot0) uujVar).a;
            f += ((ot0) uujVar).b;
        }
        this.a = uujVar;
        this.b = f;
    }

    @Override // xsna.uuj
    public final float a(@NonNull RectF rectF) {
        return Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot0)) {
            return false;
        }
        ot0 ot0Var = (ot0) obj;
        return this.a.equals(ot0Var.a) && this.b == ot0Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
