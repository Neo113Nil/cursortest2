package ru.mail.libverify.f0;

import java.util.List;
import xsna.drm0;
import xsna.epx;

/* loaded from: classes9.dex */
public final class a {
    private final Integer a;
    private final Integer b;
    private final b c;
    private final List<b> d;
    private String e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Integer num, Integer num2, b bVar, List<? extends b> list) {
        this.a = num;
        this.b = num2;
        this.c = bVar;
        this.d = list;
    }

    public final b a() {
        return this.c;
    }

    public final String b() {
        String str;
        b bVar = this.c;
        if (bVar != null && (str = bVar.b) != null) {
            if (drm0.N(str)) {
                str = null;
            }
            if (str != null) {
                return ru.mail.libverify.n0.e.f(ru.mail.libverify.n0.e.f(str));
            }
        }
        return null;
    }

    public final String c() {
        String str;
        b bVar = this.c;
        if (bVar != null && (str = bVar.a) != null) {
            if (drm0.N(str)) {
                str = null;
            }
            if (str != null) {
                return ru.mail.libverify.n0.e.f(ru.mail.libverify.n0.e.f(str));
            }
        }
        return null;
    }

    public final String d() {
        String str;
        b bVar = this.c;
        if (bVar != null && (str = bVar.b) != null) {
            if (drm0.N(str)) {
                str = null;
            }
            if (str != null) {
                return ru.mail.libverify.n0.e.f(str);
            }
        }
        return null;
    }

    public final String e() {
        String str;
        b bVar = this.c;
        if (bVar != null && (str = bVar.a) != null) {
            if (drm0.N(str)) {
                str = null;
            }
            if (str != null) {
                return ru.mail.libverify.n0.e.f(str);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
    }

    public final String f() {
        b bVar = this.c;
        if (bVar == null || bVar.b() == null || bVar.c() == null) {
            return null;
        }
        return bVar.b() + '-' + bVar.c();
    }

    public final Boolean g() {
        b bVar = this.c;
        if (bVar != null) {
            return Boolean.valueOf(bVar.g);
        }
        return null;
    }

    public final Boolean h() {
        b bVar = this.c;
        if (bVar != null) {
            return Boolean.valueOf(bVar.h);
        }
        return null;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        b bVar = this.c;
        return this.d.hashCode() + ((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final Integer i() {
        return this.b;
    }

    public final String j() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.c;
        }
        return null;
    }

    public final List<b> k() {
        return this.d;
    }

    public final String l() {
        b bVar = this.c;
        if (bVar == null || bVar.g() == null || bVar.h() == null) {
            return null;
        }
        return bVar.g() + '-' + bVar.h();
    }

    public final String m() {
        if (this.e == null) {
            b bVar = this.c;
            this.e = bVar != null ? bVar.e : null;
        }
        return this.e;
    }

    public final Integer n() {
        return this.a;
    }

    public final boolean o() {
        b bVar;
        if (!p() || (bVar = this.c) == null) {
            return false;
        }
        return bVar.f;
    }

    public final boolean p() {
        b bVar = this.c;
        String str = bVar != null ? bVar.e : null;
        return (str == null || drm0.N(str) || str.equals("no_permission")) ? false : true;
    }

    public final void q() {
        this.e = "no_permission";
    }

    public final String toString() {
        return "";
    }
}
