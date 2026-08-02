package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ntr implements ptr {
    public final boolean a;
    public final Integer b;

    public ntr(boolean z, Integer num) {
        this.a = z;
        this.b = num;
    }

    @Override // defpackage.ptr
    public final Integer a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntr)) {
            return false;
        }
        ntr ntrVar = (ntr) obj;
        return this.a == ntrVar.a && jl40.l(this.b, ntrVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // defpackage.ptr
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        return "MyLocationState(isVisible=" + this.a + ", overrideSizeDp=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ ntr() {
        this(true, null);
    }
}
