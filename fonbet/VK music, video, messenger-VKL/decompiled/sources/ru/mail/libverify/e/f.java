package ru.mail.libverify.e;

import java.util.Map;
import ru.mail.libverify.api.VerificationParameters;
import xsna.epx;

/* loaded from: classes9.dex */
public final class f {
    private final String a;
    private final g b;
    private final String c;
    private final String d;
    private final Map<String, String> e;
    private final String f;
    private final VerificationParameters g;

    public f(String str, g gVar, String str2, String str3, Map<String, String> map, String str4, VerificationParameters verificationParameters) {
        this.a = str;
        this.b = gVar;
        this.c = str2;
        this.d = str3;
        this.e = map;
        this.f = str4;
        this.g = verificationParameters;
    }

    public final Map<String, String> a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final VerificationParameters e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f) && epx.f(this.g, fVar.g);
    }

    public final String f() {
        return this.a;
    }

    public final g g() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.e;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        VerificationParameters verificationParameters = this.g;
        return hashCode5 + (verificationParameters != null ? verificationParameters.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
