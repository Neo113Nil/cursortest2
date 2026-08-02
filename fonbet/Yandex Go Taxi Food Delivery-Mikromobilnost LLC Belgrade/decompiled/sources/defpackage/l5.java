package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class l5 {
    public final fa31 a;
    public final String b;
    public final String c;
    public final List d;

    public l5(fa31 fa31Var, String str, String str2, List list) {
        this.a = fa31Var;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof l5) {
            l5 l5Var = (l5) obj;
            if (this.a.equals(l5Var.a)) {
                String str = l5Var.b;
                String str2 = this.b;
                if (str2 == null) {
                    if (str == null) {
                        equals = true;
                        if (equals) {
                            String str3 = l5Var.c;
                            String str4 = this.c;
                            if (str4 == null) {
                                if (str3 == null) {
                                    equals2 = true;
                                    if (equals2 && this.d.equals(l5Var.d)) {
                                        return true;
                                    }
                                }
                                equals2 = false;
                                if (equals2) {
                                    return true;
                                }
                            } else {
                                if (str3 != null) {
                                    equals2 = str4.equals(str3);
                                    if (equals2) {
                                    }
                                }
                                equals2 = false;
                                if (equals2) {
                                }
                            }
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                } else {
                    if (str != null) {
                        equals = str2.equals(str);
                        if (equals) {
                        }
                    }
                    equals = false;
                    if (equals) {
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Boolean.hashCode(false) + unr0.e(unr0.e(unr0.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, true), 31, false);
    }

    public final String toString() {
        String str = this.b;
        String p = str == null ? "null" : oyr.p("CopyrightEntity(string=", str, Extension.C_BRAKE);
        String str2 = this.c;
        String p2 = str2 != null ? oyr.p("LegalInfoEntity(string=", str2, Extension.C_BRAKE) : "null";
        StringBuilder sb = new StringBuilder("AboutInfoEntity(versionInfo=");
        sb.append(this.a);
        sb.append(", copyright=");
        sb.append(p);
        sb.append(", legalInfo=");
        return tse0.j(p2, ", policies=", ", showLicenceAgreement=true, showTermsOfService=false, showOtherYandexApps=false)", sb, this.d);
    }
}
