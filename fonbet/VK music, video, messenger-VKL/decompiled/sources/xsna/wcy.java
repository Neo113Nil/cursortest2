package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;

/* compiled from: KTypeProjection.kt */
/* loaded from: classes8.dex */
public final class wcy {
    public static final /* synthetic */ int c = 0;
    public final KVariance a;
    public final vcy b;

    /* compiled from: KTypeProjection.kt */
    public static final class a {
        public static wcy a(utp0 utp0Var) {
            return new wcy(KVariance.INVARIANT, utp0Var);
        }
    }

    /* compiled from: KTypeProjection.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        new wcy(null, null);
    }

    public wcy(KVariance kVariance, utp0 utp0Var) {
        String str;
        this.a = kVariance;
        this.b = utp0Var;
        if ((kVariance == null) == (utp0Var == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcy)) {
            return false;
        }
        wcy wcyVar = (wcy) obj;
        return this.a == wcyVar.a && epx.f(this.b, wcyVar.b);
    }

    public final int hashCode() {
        KVariance kVariance = this.a;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        vcy vcyVar = this.b;
        return hashCode + (vcyVar != null ? vcyVar.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.a;
        int i = kVariance == null ? -1 : b.$EnumSwitchMapping$0[kVariance.ordinal()];
        if (i == -1) {
            return "*";
        }
        vcy vcyVar = this.b;
        if (i == 1) {
            return String.valueOf(vcyVar);
        }
        if (i == 2) {
            return "in " + vcyVar;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + vcyVar;
    }
}
