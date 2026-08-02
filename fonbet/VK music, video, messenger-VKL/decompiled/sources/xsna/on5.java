package xsna;

import androidx.annotation.Nullable;

/* compiled from: AutoValue_ProductData.java */
/* loaded from: classes12.dex */
public final class on5 extends wnd0 {
    public final Integer a;

    public on5(@Nullable Integer num) {
        this.a = num;
    }

    @Override // xsna.wnd0
    @Nullable
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wnd0)) {
            return false;
        }
        Integer num = this.a;
        Integer a = ((wnd0) obj).a();
        return num == null ? a == null : num.equals(a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return oq.b(new StringBuilder("ProductData{productId="), this.a, "}");
    }
}
