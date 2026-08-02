package defpackage;

import com.yandex.quark.webchat.cookie.Cookie$SameSite;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class bne {
    public static final i3y j = a.b(LazyThreadSafetyMode.SYNCHRONIZED, new m3e(17));
    public final String a;
    public final String b;
    public final Date c;
    public final r5z0 d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final Cookie$SameSite i;

    public /* synthetic */ bne(String str, String str2, Date date, r5z0 r5z0Var, String str3, String str4, boolean z, int i) {
        this(str, str2, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : r5z0Var, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, false, (i & 128) != 0 ? false : z, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bne)) {
            return false;
        }
        bne bneVar = (bne) obj;
        return jl40.l(this.a, bneVar.a) && jl40.l(this.b, bneVar.b) && jl40.l(this.c, bneVar.c) && jl40.l(this.d, bneVar.d) && jl40.l(this.e, bneVar.e) && jl40.l(this.f, bneVar.f) && this.g == bneVar.g && this.h == bneVar.h && this.i == bneVar.i;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Date date = this.c;
        int hashCode = (b + (date == null ? 0 : date.hashCode())) * 31;
        r5z0 r5z0Var = this.d;
        int hashCode2 = (hashCode + (r5z0Var == null ? 0 : r5z0Var.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int e = unr0.e(unr0.e((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g), 31, this.h);
        Cookie$SameSite cookie$SameSite = this.i;
        return e + (cookie$SameSite != null ? cookie$SameSite.hashCode() : 0);
    }

    public final String toString() {
        ListBuilder a = rcc.a();
        Date date = this.c;
        if (date != null) {
            a.add("expires=" + ((SimpleDateFormat) j.getValue()).format(date));
        }
        r5z0 r5z0Var = this.d;
        if (r5z0Var != null) {
            a.add("max-age=" + r5z0Var.b.toSeconds(r5z0Var.a));
        }
        String str = this.e;
        if (str != null) {
            a.add("domain=".concat(str));
        }
        String str2 = this.f;
        if (str2 != null) {
            a.add("path=".concat(str2));
        }
        if (this.g) {
            a.add("httponly");
        }
        if (this.h) {
            a.add("secure");
        }
        Cookie$SameSite cookie$SameSite = this.i;
        if (cookie$SameSite != null) {
            a.add("samesite=" + cookie$SameSite.getHeaderValue());
        }
        ListBuilder j2 = a.j();
        return unr0.o(this.a, "=", this.b, !j2.isEmpty() ? Extension.SEMICOLON_SPACE.concat(kotlin.collections.a.X(j2, Extension.SEMICOLON_SPACE, null, null, null, 62)) : "");
    }

    public bne(String str, String str2, Date date, r5z0 r5z0Var, String str3, String str4, boolean z, boolean z2, Cookie$SameSite cookie$SameSite) {
        this.a = str;
        this.b = str2;
        this.c = date;
        this.d = r5z0Var;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = cookie$SameSite;
        if (cookie$SameSite != Cookie$SameSite.NONE || z2) {
            return;
        }
        ny61.g("Cookies with SameSite=None must have Secure attribute");
        throw null;
    }
}
