package yads;

import android.net.Uri;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;
import xsna.yga0;

/* loaded from: classes10.dex */
public final class gn1 implements xq {
    public static final wq h;
    public final String b;
    public final bn1 c;
    public final zm1 d;
    public final kn1 e;
    public final vm1 f;
    public final dn1 g;

    static {
        s51.g();
        tn2 tn2Var = tn2.f;
        dn1 dn1Var = dn1.d;
        kn1 kn1Var = kn1.H;
        h = new yga0(9);
    }

    public gn1(String str, vm1 vm1Var, bn1 bn1Var, zm1 zm1Var, kn1 kn1Var, dn1 dn1Var) {
        this.b = str;
        this.c = bn1Var;
        this.d = zm1Var;
        this.e = kn1Var;
        this.f = vm1Var;
        this.g = dn1Var;
    }

    public static gn1 a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        zm1 zm1Var = bundle2 == null ? zm1.g : (zm1) zm1.h.fromBundle(bundle2);
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        kn1 kn1Var = bundle3 == null ? kn1.H : (kn1) kn1.I.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        vm1 vm1Var = bundle4 == null ? vm1.h : (vm1) um1.g.fromBundle(bundle4);
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        return new gn1(string, vm1Var, null, zm1Var, kn1Var, bundle5 == null ? dn1.d : (dn1) dn1.e.fromBundle(bundle5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn1)) {
            return false;
        }
        gn1 gn1Var = (gn1) obj;
        return mc3.a(this.b, gn1Var.b) && this.f.equals(gn1Var.f) && mc3.a(this.c, gn1Var.c) && mc3.a(this.d, gn1Var.d) && mc3.a(this.e, gn1Var.e) && mc3.a(this.g, gn1Var.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        bn1 bn1Var = this.c;
        return this.g.hashCode() + ((this.e.hashCode() + ((this.f.hashCode() + ((this.d.hashCode() + ((hashCode + (bn1Var != null ? bn1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public static gn1 a(String str) {
        bn1 bn1Var;
        tm1 tm1Var = new tm1();
        wm1 wm1Var = new wm1();
        List list = Collections.EMPTY_LIST;
        tn2 tn2Var = tn2.f;
        dn1 dn1Var = dn1.d;
        Uri parse = str == null ? null : Uri.parse(str);
        if (wm1Var.b != null && wm1Var.a == null) {
            throw new IllegalStateException();
        }
        xm1 xm1Var = null;
        if (parse != null) {
            if (wm1Var.a != null) {
                xm1Var = new xm1(wm1Var);
            }
            bn1Var = new bn1(parse, null, xm1Var, list, null, tn2Var, null);
        } else {
            bn1Var = null;
        }
        return new gn1("", new vm1(tm1Var), bn1Var, new zm1(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), kn1.H, dn1Var);
    }
}
