package defpackage;

import android.net.Uri;
import android.os.Build;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.home.feature.webviews.internal.uri.a;
import com.yandex.plus.pay.adapter.internal.q;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o0h {
    public final v920 a;
    public final pgz b;
    public final Uri c;
    public final ec31 d;
    public final String e;
    public final String f;
    public final String g;
    public final p5z h;
    public final x75 i;
    public final lzs j;
    public final String k;
    public final bfd0 l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    public o0h(v920 v920Var, rkd0 rkd0Var, Uri uri, ec31 ec31Var, String str, String str2, String str3, p5z p5zVar, x75 x75Var, lzs lzsVar, String str4, bfd0 bfd0Var, int i, boolean z, boolean z2, boolean z3) {
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        this.a = v920Var;
        this.b = rkd0Var;
        this.c = uri;
        this.d = ec31Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = p5zVar;
        this.i = x75Var;
        this.j = lzsVar;
        this.k = str4;
        this.l = bfd0Var;
        this.m = i;
        this.n = z;
        this.o = z2;
        this.p = z3;
    }

    public final a a(boolean z, String str, String str2, Map map, sgs sgsVar, dtt dttVar) {
        Locale locale = this.h.getLocale();
        x75 x75Var = this.i;
        String a = x75Var.a();
        String b = x75Var.b();
        jzs a2 = this.j.a();
        PlusSdkBrandType b2 = ((q) this.l).b();
        String str3 = Build.MANUFACTURER;
        String str4 = Build.MODEL;
        return new a(new n0h(z, (cmd0) this.d.invoke(), str, map, this.o, this.e, this.f, this.g, this.n, locale, a, b, a2, str2, this.p, this.k, sgsVar, dttVar, b2, this.m, this.c, this.b, this.a));
    }
}
