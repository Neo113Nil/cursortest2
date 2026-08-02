package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e7r0 {
    public final String a;
    public final String b;
    public final o8r0 c;

    public /* synthetic */ e7r0(String str, String str2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (o8r0) null);
    }

    public static e7r0 a(e7r0 e7r0Var, o8r0 o8r0Var) {
        String str = e7r0Var.a;
        String str2 = e7r0Var.b;
        e7r0Var.getClass();
        return new e7r0(str, str2, o8r0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7r0)) {
            return false;
        }
        e7r0 e7r0Var = (e7r0) obj;
        return jl40.l(this.a, e7r0Var.a) && jl40.l(this.b, e7r0Var.b) && jl40.l(this.c, e7r0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        o8r0 o8r0Var = this.c;
        return hashCode2 + (o8r0Var != null ? o8r0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SettingsChanging(changingSettingCardId=", this.a, ", changingSettingKey=", this.b, ", settingWaitingFor2fa=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e7r0() {
        this(r0, r0, 7);
        String str = null;
    }

    public e7r0(String str, String str2, o8r0 o8r0Var) {
        this.a = str;
        this.b = str2;
        this.c = o8r0Var;
    }
}
