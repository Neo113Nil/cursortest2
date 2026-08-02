package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.ivm.autoenhance.AutoEnhanceMessage$Source;

/* compiled from: AutoEnhanceState.kt */
/* loaded from: classes4.dex */
public final class cg5 implements nwx {
    public final float a;
    public final AutoEnhanceMessage$Source b;

    public cg5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg5)) {
            return false;
        }
        cg5 cg5Var = (cg5) obj;
        return Float.compare(this.a, cg5Var.a) == 0 && this.b == cg5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AutoEnhanceState(intensity=" + this.a + ", messageSource=" + this.b + ")";
    }

    public cg5(float f, AutoEnhanceMessage$Source autoEnhanceMessage$Source) {
        this.a = f;
        this.b = autoEnhanceMessage$Source;
    }

    public /* synthetic */ cg5(int i) {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, AutoEnhanceMessage$Source.Synthetic);
    }
}
