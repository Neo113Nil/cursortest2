package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ic90 {
    public final String a;

    public /* synthetic */ ic90(String str) {
        this.a = str;
    }

    public static final /* synthetic */ ic90 a(String str) {
        return new ic90(str);
    }

    public final /* synthetic */ String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ic90) {
            return this.a.equals(((ic90) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Param(name=", this.a, Extension.C_BRAKE);
    }
}
