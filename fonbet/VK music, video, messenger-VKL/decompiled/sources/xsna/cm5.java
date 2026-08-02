package xsna;

import androidx.annotation.Nullable;
import xsna.mfq;

/* compiled from: AutoValue_ExternalPrivacyContext.java */
/* loaded from: classes.dex */
public final class cm5 extends mfq {
    public final lfq a;

    /* compiled from: AutoValue_ExternalPrivacyContext.java */
    /* loaded from: classes12.dex */
    public static final class a extends mfq.a {
        public bm5 a;

        public final cm5 a() {
            return new cm5(this.a);
        }

        public final a b(@Nullable bm5 bm5Var) {
            this.a = bm5Var;
            return this;
        }
    }

    public cm5(bm5 bm5Var) {
        this.a = bm5Var;
    }

    @Override // xsna.mfq
    @Nullable
    public final lfq a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mfq)) {
            return false;
        }
        lfq lfqVar = this.a;
        lfq a2 = ((mfq) obj).a();
        return lfqVar == null ? a2 == null : lfqVar.equals(a2);
    }

    public final int hashCode() {
        lfq lfqVar = this.a;
        return (lfqVar == null ? 0 : lfqVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
