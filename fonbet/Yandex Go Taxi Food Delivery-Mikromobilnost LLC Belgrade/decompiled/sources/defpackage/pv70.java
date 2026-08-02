package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.orderforanother.model.FormedFrom;

@gsq0
/* loaded from: classes9.dex */
public final class pv70 {
    public static final ov70 Companion = new ov70();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new fs70(13))};
    public final String a;
    public final String b;
    public final FormedFrom c;

    public /* synthetic */ pv70(int i, String str, String str2, FormedFrom formedFrom) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formedFrom;
        }
    }

    public final String a() {
        return c().length() > 0 ? c() : d().length() > 0 ? b() : "";
    }

    public final String b() {
        return d().length() > 0 ? bgb0.e(this.a) : "";
    }

    public final String c() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public final String d() {
        String str = this.a;
        return str == null ? "" : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pv70.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pv70 pv70Var = (pv70) obj;
        return jl40.l(this.a, pv70Var.a) && jl40.l(this.b, pv70Var.b) && this.c == pv70Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        FormedFrom formedFrom = this.c;
        return hashCode2 + (formedFrom != null ? formedFrom.hashCode() : 0);
    }

    public final String toString() {
        String d2 = d();
        String c = c();
        FormedFrom formedFrom = this.c;
        if (formedFrom == null) {
            formedFrom = FormedFrom.UNKNOWN;
        }
        StringBuilder v = b64.v("OrderForAnother(phone='", d2, "', name='", c, "', formedFrom=");
        v.append(formedFrom);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public pv70(String str, String str2, FormedFrom formedFrom) {
        this.a = str;
        this.b = str2;
        this.c = formedFrom;
    }
}
