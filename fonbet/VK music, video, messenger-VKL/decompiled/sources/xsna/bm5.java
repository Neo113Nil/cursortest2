package xsna;

import androidx.annotation.Nullable;
import xsna.lfq;

/* compiled from: AutoValue_ExternalPRequestContext.java */
/* loaded from: classes.dex */
public final class bm5 extends lfq {
    public final Integer a;

    /* compiled from: AutoValue_ExternalPRequestContext.java */
    /* loaded from: classes12.dex */
    public static final class a extends lfq.a {
        public Integer a;

        public final bm5 a() {
            return new bm5(this.a);
        }

        public final a b(@Nullable Integer num) {
            this.a = num;
            return this;
        }
    }

    public bm5(Integer num) {
        this.a = num;
    }

    @Override // xsna.lfq
    @Nullable
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lfq)) {
            return false;
        }
        Integer num = this.a;
        Integer a2 = ((lfq) obj).a();
        return num == null ? a2 == null : num.equals(a2);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return oq.b(new StringBuilder("ExternalPRequestContext{originAssociatedProductId="), this.a, "}");
    }
}
