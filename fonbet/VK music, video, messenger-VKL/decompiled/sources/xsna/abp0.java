package xsna;

/* compiled from: TopshelfCardBackground.kt */
/* loaded from: classes2.dex */
public final class abp0 {
    public final boolean a;
    public final yzs<q630, androidx.compose.runtime.a, Integer, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public abp0(boolean z, yzs<? super q630, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar) {
        this.a = z;
        this.b = yzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abp0)) {
            return false;
        }
        abp0 abp0Var = (abp0) obj;
        return this.a == abp0Var.a && epx.f(this.b, abp0Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        yzs<q630, androidx.compose.runtime.a, Integer, s3q0> yzsVar = this.b;
        return hashCode + (yzsVar == null ? 0 : yzsVar.hashCode());
    }

    public final String toString() {
        return "TopshelfCardMediaSlot(showCover=" + this.a + ", content=" + this.b + ')';
    }
}
