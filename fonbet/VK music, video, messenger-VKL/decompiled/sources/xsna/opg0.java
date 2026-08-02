package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: RowColumnImpl.kt */
/* loaded from: classes11.dex */
public final class opg0 {
    public float a;
    public boolean b;
    public ejk c;

    public opg0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opg0)) {
            return false;
        }
        opg0 opg0Var = (opg0) obj;
        return Float.compare(this.a, opg0Var.a) == 0 && this.b == opg0Var.b && epx.f(this.c, opg0Var.c);
    }

    public final int hashCode() {
        int b = qoy.b(Float.hashCode(this.a) * 31, 31, this.b);
        ejk ejkVar = this.c;
        return (b + (ejkVar == null ? 0 : ejkVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }

    public opg0(int i) {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = true;
        this.c = null;
    }
}
