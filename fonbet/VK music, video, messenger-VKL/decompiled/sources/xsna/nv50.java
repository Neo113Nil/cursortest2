package xsna;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class nv50 {
    public final String a;
    public final String b;
    public final float c;
    public final int d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final l0n k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final kiw q;
    public final kiw r;
    public final String s;
    public final List t;

    public nv50(x1z0 x1z0Var) {
        this.f = x1z0Var.F;
        this.a = x1z0Var.p;
        this.b = x1z0Var.q;
        this.c = x1z0Var.c();
        this.d = x1z0Var.f();
        String str = x1z0Var.f;
        this.g = TextUtils.isEmpty(str) ? null : str;
        String n = x1z0Var.n();
        this.h = TextUtils.isEmpty(n) ? null : n;
        String str2 = x1z0Var.c;
        this.i = TextUtils.isEmpty(str2) ? null : str2;
        String str3 = x1z0Var.g;
        this.j = !TextUtils.isEmpty(str3) ? str3 : null;
        l0n l0nVar = x1z0Var.A;
        this.k = l0nVar == null ? !TextUtils.isEmpty(str3) ? new l0n(x1z0Var.z, str3) : null : l0nVar;
        String str4 = x1z0Var.h;
        this.l = TextUtils.isEmpty(str4) ? null : str4;
        String str5 = x1z0Var.i;
        this.m = TextUtils.isEmpty(str5) ? null : str5;
        String str6 = x1z0Var.o;
        this.n = TextUtils.isEmpty(str6) ? null : str6;
        String str7 = x1z0Var.r;
        this.o = TextUtils.isEmpty(str7) ? null : str7;
        this.q = x1z0Var.u;
        String str8 = x1z0Var.H;
        this.p = TextUtils.isEmpty(str8) ? null : str8;
        wty0 wty0Var = x1z0Var.L;
        if (wty0Var == null) {
            this.e = false;
            this.r = null;
            this.s = null;
            return;
        }
        this.e = true;
        this.r = wty0Var.a;
        this.s = wty0Var.e;
        List list = wty0Var.d;
        if (list == null) {
            list = wty0.a(wty0Var.c);
            wty0Var.d = list;
        }
        this.t = list.isEmpty() ? null : list;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("NativeBanner{id='");
        sb.append(this.f);
        sb.append("', navigationType='");
        sb.append(this.a);
        sb.append("', storeType='");
        sb.append(this.b);
        sb.append("', rating=");
        sb.append(this.c);
        sb.append(", votes=");
        sb.append(this.d);
        sb.append(", hasAdChoices=");
        sb.append(this.e);
        sb.append(", title='");
        sb.append(this.g);
        sb.append("', ctaText='");
        sb.append(this.h);
        sb.append("', description='");
        sb.append(this.i);
        sb.append("', disclaimer='");
        sb.append(this.j);
        sb.append("', disclaimerInfo=");
        sb.append(this.k);
        sb.append(", ageRestrictions='");
        sb.append(this.l);
        sb.append("', erid='");
        sb.append(this.m);
        sb.append("', domain='");
        sb.append(this.n);
        sb.append("', advertisingLabel='");
        sb.append(this.o);
        sb.append("', bundleId='");
        sb.append(this.p);
        sb.append("', icon=");
        sb.append(this.q);
        sb.append(", adChoicesIcon=");
        sb.append(this.r);
        sb.append(", aboutCompanyInfo='");
        return i5s.a(sb, this.s, "'}");
    }
}
