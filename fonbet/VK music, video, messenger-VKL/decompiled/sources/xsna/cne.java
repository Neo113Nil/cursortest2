package xsna;

/* compiled from: ClipsNotInterestedActionItem.kt */
/* loaded from: classes17.dex */
public final class cne {
    public final int a;
    public final String b;
    public final wzs<androidx.compose.runtime.a, Integer, lg90> c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public cne(int i, String str, wzs<? super androidx.compose.runtime.a, ? super Integer, ? extends lg90> wzsVar, boolean z) {
        this.a = i;
        this.b = str;
        this.c = wzsVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cne)) {
            return false;
        }
        cne cneVar = (cne) obj;
        return this.a == cneVar.a && epx.f(this.b, cneVar.b) && epx.f(this.c, cneVar.c) && this.d == cneVar.d;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        wzs<androidx.compose.runtime.a, Integer, lg90> wzsVar = this.c;
        return Boolean.hashCode(this.d) + ((a + (wzsVar == null ? 0 : wzsVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsNotInterestedActionItem(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
