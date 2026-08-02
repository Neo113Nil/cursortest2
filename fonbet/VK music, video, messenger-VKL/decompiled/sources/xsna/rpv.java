package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.geo.api.data.IconDrawConfig;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import xsna.cpv;
import xsna.lc7;
import xsna.wqv;

/* compiled from: IconCache.kt */
/* loaded from: classes2.dex */
public final class rpv {
    public final float a;
    public final IconDrawConfig b;
    public final boolean c;
    public final int d;
    public final Context e;
    public fqv<?> f;
    public final ConcurrentHashMap<Integer, Bitmap> g;
    public final wqv h;
    public final wqv i;
    public final wqv j;
    public cpv k;
    public final x500<Bitmap> l;
    public final x500<Bitmap> m;
    public volatile Bitmap n;
    public volatile Bitmap o;

    /* compiled from: IconCache.kt */
    public static final class a implements lc7.a<cpv> {
        public a() {
        }

        @Override // xsna.lc7.a
        public final boolean a(md7 md7Var) {
            cpv cpvVar = (cpv) md7Var;
            if (cpvVar.b || cpvVar.d == rpv.this.n || cpvVar.d == rpv.this.o) {
                return true;
            }
            return VisibleStyle.l(cpvVar.c) && VisibleStyle.b(cpvVar.c);
        }
    }

    /* compiled from: IconCache.kt */
    public static final class b implements wqv.a {
        public b() {
        }

        public final String a(int i, String str) {
            wqv.a.a.getClass();
            int h = rpv.this.h(i);
            wqv.a.C3950a.C3951a.b.getClass();
            StringBuilder a = t33.a("id=", str, ";type=");
            a.append(VisibleStyle.i(h));
            a.append(";dark=");
            a.append(VisibleStyle.n(h));
            a.append(";title");
            a.append(VisibleStyle.f(h));
            a.append(";subtitle");
            a.append(VisibleStyle.e(h));
            a.append(";subtitle_changed=");
            a.append((h & 8192) != 0);
            return a.toString();
        }
    }

    public rpv(Context context, float f, IconDrawConfig iconDrawConfig, int i) {
        this(context, f, iconDrawConfig, (i & 8) == 0, R.drawable.geo_unknown_category_icon);
    }

    public static cpv d(rpv rpvVar, String str, int i, CharSequence charSequence, CharSequence charSequence2, int i2) {
        cpv e;
        CharSequence charSequence3 = (i2 & 4) != 0 ? null : charSequence;
        CharSequence charSequence4 = (i2 & 8) != 0 ? null : charSequence2;
        cpv c = rpvVar.c(i, str);
        if (c != null && VisibleStyle.e(i) && epx.f(c.i, charSequence4)) {
            return c;
        }
        if (VisibleStyle.C(i)) {
            e = rpvVar.e(str, i, charSequence3, charSequence4);
        } else if (VisibleStyle.l(i) || (VisibleStyle.p(i) && VisibleStyle.D(i))) {
            e = rpvVar.e(str, i, charSequence3, charSequence4);
        } else {
            int i3 = rpvVar.f.b.p;
            ConcurrentHashMap<Integer, Bitmap> concurrentHashMap = rpvVar.g;
            Integer valueOf = Integer.valueOf(i3);
            Bitmap bitmap = concurrentHashMap.get(valueOf);
            if (bitmap == null) {
                Bitmap a2 = fqv.a(rpvVar.f, i3, 0, 6);
                Bitmap putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, a2);
                bitmap = putIfAbsent == null ? a2 : putIfAbsent;
            }
            e = new cpv("placeholder;dot;#" + ((Object) StringId.a(str)) + ";style=" + ((Object) VisibleStyle.K(rpvVar.h(i))) + ";ttl=" + ((Object) charSequence3) + ";sbt=" + ((Object) charSequence4), true, i, bitmap, gqr.a(0.5f, 0.5f), false, false, charSequence3, charSequence4);
        }
        if (VisibleStyle.D(i)) {
            rpvVar.j.f(str, i, e);
            return e;
        }
        rpvVar.i.f(str, i, e);
        return e;
    }

    public final void a(boolean z) {
        L.e(Boolean.valueOf(z));
        this.i.d(z);
        this.j.d(z);
        this.h.d(z);
        x500<Bitmap> x500Var = this.m;
        int size = x500Var.size();
        for (int i = 0; i < size; i++) {
            x500Var.keyAt(i);
            if (x500Var.valueAt(i) != null) {
                ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
            }
        }
        this.m.clear();
        x500<Bitmap> x500Var2 = this.l;
        int size2 = x500Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            x500Var2.keyAt(i2);
            if (x500Var2.valueAt(i2) != null) {
                ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap2 = vc7.a;
            }
        }
        this.l.clear();
        if (z) {
            Iterator<Bitmap> it = this.g.values().iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.g.clear();
            cpv cpvVar = this.k;
            if (cpvVar != null) {
                cpvVar.a();
            }
            this.k = null;
            Bitmap bitmap = this.n;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.n = null;
            Bitmap bitmap2 = this.o;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.o = null;
            vc7.a.clear();
        }
    }

    public final Bitmap b(boolean z) {
        elr0 a2 = elr0.a(this.d, null, this.e.getResources());
        int G = z ? VisibleStyle.G(67108868) : 67108868;
        Bitmap f = this.f.f(a2, G);
        fqv<?> fqvVar = this.f;
        return fqvVar.b(f, VisibleStyle.F(G), fqvVar.b.b ? -824163 : -11155041);
    }

    public final cpv c(int i, String str) {
        wqv wqvVar = this.h;
        cpv a2 = wqvVar.a(i, str);
        if (a2 != null) {
            return a2;
        }
        if (VisibleStyle.D(i)) {
            return this.j.a(i, str);
        }
        cpv a3 = this.i.a(i, str);
        return a3 == null ? wqvVar.a(i, str) : a3;
    }

    public final cpv e(String str, int i, CharSequence charSequence, CharSequence charSequence2) {
        cpv c = c(i, str);
        if (c != null && VisibleStyle.e(i) && epx.f(c.i, charSequence2) && VisibleStyle.f(i) && epx.f(c.h, charSequence) && ((charSequence == null || charSequence.length() == 0) && !c.f && ((charSequence2 == null || charSequence2.length() == 0) && !c.g))) {
            return c;
        }
        Bitmap bitmap = VisibleStyle.D(i) ? this.n : this.o;
        if (bitmap == null) {
            bitmap = b(VisibleStyle.D(i));
        }
        Bitmap bitmap2 = bitmap;
        fqv<?> fqvVar = this.f;
        cpv b2 = fqvVar.c(bitmap2, fqvVar.b.b ? -824163 : -11155041, VisibleStyle.D(i), charSequence, charSequence2).b("cat;#" + ((Object) StringId.a(str)) + ";style=" + ((Object) VisibleStyle.K(h(i))) + ";ttl=" + ((Object) charSequence) + ";sbt=" + ((Object) charSequence2), true, i, charSequence, charSequence2);
        ConcurrentHashMap<Integer, RuntimeException> concurrentHashMap = vc7.a;
        vc7.a(b2.d);
        return b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cpv f(do00 do00Var, int i, String str) {
        rpv rpvVar;
        int i2;
        int i3;
        String str2 = do00Var.b;
        CharSequence charSequence = (VisibleStyle.D(i) || VisibleStyle.f(i)) ? do00Var.m : null;
        String str3 = (VisibleStyle.D(i) || VisibleStyle.e(i)) ? str : null;
        cpv c = c(i, str2);
        if (c != null) {
            boolean f = VisibleStyle.e(i) ? epx.f(c.i, str3) : true;
            if (VisibleStyle.f(i)) {
                f = epx.f(c.h, charSequence);
            }
            if (f) {
                return c;
            }
        }
        boolean z = (c == null || !VisibleStyle.e(i) || epx.f(c.i, str3)) ? false : true;
        if (VisibleStyle.l(i) || VisibleStyle.D(i)) {
            c = e(str2, i, charSequence, str3);
        }
        if (c == null) {
            if (VisibleStyle.o(i)) {
                c = this.h.a(i, str2);
            } else {
                c = c(i, str2);
                if (c == null) {
                    rpvVar = this;
                    i2 = i;
                    c = d(rpvVar, str2, i2, charSequence, str3, 16);
                    if (c != null) {
                        L l = L.a;
                        l.getClass();
                        if (L.m(LoggerOutputTarget.NONE)) {
                            return null;
                        }
                        L.u(l, L.LogType.w, new Object[]{"failed when prepare icon"});
                        return null;
                    }
                    boolean D = VisibleStyle.D(i2);
                    wqv wqvVar = rpvVar.i;
                    wqv wqvVar2 = rpvVar.j;
                    wqv wqvVar3 = D ? wqvVar2 : wqvVar;
                    if (wqvVar3.a(i2, str2) != c) {
                        cpv a2 = wqvVar3.a(i2, str2);
                        if ((a2 != null ? a2.d : null) != c.d) {
                            if (z) {
                                if (!((i2 & 8192) != 0)) {
                                    i3 = i2 | 8192;
                                    if (!VisibleStyle.D(i2)) {
                                        wqvVar2.f(str2, i3, c);
                                    } else if (!VisibleStyle.p(c.c)) {
                                        wqvVar.f(str2, i3, c);
                                    }
                                    c.c = i3;
                                }
                            }
                            i3 = i2;
                            if (!VisibleStyle.D(i2)) {
                            }
                            c.c = i3;
                        }
                    }
                    return c;
                }
            }
        }
        rpvVar = this;
        i2 = i;
        if (c != null) {
        }
    }

    public final void g(do00 do00Var, Bitmap bitmap, int i, CharSequence charSequence) {
        CharSequence charSequence2;
        CharSequence charSequence3;
        cpv.a d;
        String str = do00Var.b;
        CharSequence charSequence4 = (VisibleStyle.D(i) || VisibleStyle.f(i)) ? do00Var.m : null;
        CharSequence charSequence5 = (charSequence == null || !(VisibleStyle.D(i) || VisibleStyle.e(i))) ? null : charSequence;
        fqv<?> fqvVar = this.f;
        if (fqvVar instanceof j270) {
            float F = VisibleStyle.F(i);
            CharSequence charSequence6 = VisibleStyle.f(i) ? charSequence4 : null;
            CharSequence charSequence7 = VisibleStyle.e(i) ? charSequence5 : null;
            Regex regex = fqv.j;
            d = fqvVar.e(bitmap, F, charSequence6, charSequence7);
            charSequence2 = charSequence4;
            charSequence3 = charSequence5;
        } else {
            boolean z = (fqvVar instanceof bev) && VisibleStyle.D(i);
            Bitmap bitmap2 = z ? this.n : this.o;
            if (bitmap2 == null) {
                bitmap2 = b(z);
            }
            fqv<?> fqvVar2 = this.f;
            charSequence2 = charSequence4;
            charSequence3 = charSequence5;
            d = fqvVar2.d(bitmap, new cpv.a(bitmap2, 0.5f, 120), fqvVar2.b.b ? -824163 : -11155041, VisibleStyle.F(i), VisibleStyle.D(i), charSequence2, charSequence3);
        }
        cpv.a aVar = d;
        StringBuilder sb = new StringBuilder("#");
        sb.append(new StringId(str));
        sb.append(";style=");
        sb.append(new VisibleStyle(h(i)));
        if (aVar.d) {
            sb.append(";ttl=");
            sb.append(charSequence2);
            sb.append(';');
        }
        if (aVar.e) {
            sb.append(";sbt=");
            sb.append(charSequence3);
        }
        cpv b2 = aVar.b(sb.toString(), false, i, charSequence2, charSequence3);
        if (VisibleStyle.D(i)) {
            this.j.f(str, i, b2);
        } else {
            this.i.f(str, i, b2);
        }
    }

    public final int h(int i) {
        return (VisibleStyle.p(i) && VisibleStyle.b(i)) ? i : this.f.b.b ? (VisibleStyle.n(i) && VisibleStyle.n(i)) ? i & (-4097) : i : (VisibleStyle.n(i) || VisibleStyle.n(i)) ? i : i | 4096;
    }

    public final String toString() {
        return "IconCache--->\nicons=" + this.i + ",\nselected_icons=" + this.j + ",\ncolored_dots=" + this.g.size() + ",\ndistrict_icons=" + this.h + ",\n<---";
    }

    public rpv(Context context, float f, IconDrawConfig iconDrawConfig, boolean z, int i) {
        this.a = f;
        this.b = iconDrawConfig;
        this.c = z;
        this.d = i;
        this.e = context.getApplicationContext();
        this.f = z ? new j270(f, iconDrawConfig, new k270(iconDrawConfig)) : new bev(context, f, iconDrawConfig, new cev(iconDrawConfig));
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"drawer is ".concat(this.f.getClass().getSimpleName())});
        }
        this.g = new ConcurrentHashMap<>(20);
        int i2 = m300.b;
        this.l = new x500<>(22);
        this.m = new x500<>(22);
        L.e("init");
        a aVar = new a();
        b bVar = new b();
        this.i = new wqv(aVar, bVar);
        this.j = new wqv(aVar, bVar);
        this.h = new wqv(100, new oq(14), bVar);
    }
}
