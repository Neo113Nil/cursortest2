package xsna;

import android.view.View;
import android.widget.ImageButton;
import com.vk.core.ui.themes.VKTheme;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.MutableCameraBounds;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.geo.impl.presentation.a;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aiz;
import xsna.byf0;
import xsna.dhr0;
import xsna.zv50;

/* compiled from: MapViewBinding.kt */
/* loaded from: classes2.dex */
public abstract class mm00<AddOn extends zv50, Rendered extends byf0> extends aiz implements gm50 {
    public static final a A;
    public static final /* synthetic */ qcy<Object>[] B;
    public static final String C;
    public final com.vk.geo.impl.presentation.b d;
    public final f5z e;
    public final rpv f;
    public final s6r g;
    public final aiz.a h = b(R.id.geo_map_zoom_controls_layout);
    public final aiz.a i = b(R.id.geo_map_zoom_in_button);
    public final aiz.a j = b(R.id.geo_map_zoom_out_button);
    public final aiz.a k = b(R.id.geo_map_my_location_button);
    public cil l;
    public int m;
    public final int n;
    public final int o;
    public final int p;
    public int q;
    public final Map<StringId, Runnable> r;
    public final Map<StringId, AddOn> s;
    public final xj00<StringId, Rendered> t;
    public final zk3<StringId, VisibleStyle> u;
    public Rendered v;
    public final ArrayList w;
    public long x;
    public final b y;
    public final tnf z;

    /* compiled from: MapViewBinding.kt */
    public static final class a {
    }

    /* compiled from: MapViewBinding.kt */
    public static final class b implements dhr0.e {
        public final /* synthetic */ yv50 b;

        public b(yv50 yv50Var) {
            this.b = yv50Var;
        }

        @Override // xsna.dhr0.e
        public final void sb(VKTheme vKTheme) {
            boolean z = vKTheme.b;
            yv50 yv50Var = this.b;
            yv50Var.E(z);
            View view = yv50Var.b;
            if (view != null) {
                dhr0.W(view);
            }
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(mm00.class, "zoomControlsLayout", "getZoomControlsLayout()Landroid/view/View;", 0);
        hpf0 hpf0Var = fpf0.a;
        B = new qcy[]{propertyReference1Impl, fp.c(0, mm00.class, "zoomInButton", "getZoomInButton()Landroid/widget/ImageButton;", hpf0Var), ep.a(0, mm00.class, "zoomOutButton", "getZoomOutButton()Landroid/widget/ImageButton;", hpf0Var), ep.a(0, mm00.class, "myLocationButton", "getMyLocationButton()Landroid/widget/ImageButton;", hpf0Var)};
        A = new a();
        C = "user_location";
    }

    public mm00(com.vk.geo.impl.presentation.b bVar, f5z f5zVar, rpv rpvVar, s6r s6rVar) {
        this.d = bVar;
        this.e = f5zVar;
        this.f = rpvVar;
        this.g = s6rVar;
        cn70.b(8);
        this.n = cn70.b(16);
        this.o = cn70.b(66);
        this.p = cn70.b(12);
        this.r = sni.d(16, 2);
        this.s = sni.d(1000, 2);
        this.t = new xj00<>(sni.d(1000, 2));
        this.u = new zk3<>(100);
        this.w = new ArrayList();
        this.x = Coordinate.b;
        yv50 yv50Var = (yv50) this;
        this.y = new b(yv50Var);
        this.z = new tnf(yv50Var, 4);
    }

    public static float f(do00 do00Var, int i) {
        float k = VisibleStyle.k(i);
        if (k < Float.MAX_VALUE) {
            double a2 = do00Var.e.a(1);
            if (a2 != Double.MAX_VALUE) {
                double d = Float.MAX_VALUE;
                if (a2 < d && Float.MAX_VALUE - k >= a2 && d - a2 >= k) {
                    return k + ((float) a2);
                }
            }
        }
        return Float.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(mm00 mm00Var, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        zk3<StringId, VisibleStyle> zk3Var = mm00Var.u;
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"remove #" + ((Object) StringId.a(str))});
        }
        VisibleStyle a2 = qqm0.a(zk3Var, str);
        if (a2 != null) {
            int i2 = a2.b;
            if (!VisibleStyle.u(i2)) {
                i2 |= 1;
            }
            qqm0.b(zk3Var, str, i2);
        }
        mm00Var.s.remove(new StringId(str));
        byf0 l2 = mm00Var.l(str);
        if (l2 != null) {
            mm00Var.q(l2, z, new com.vk.movika.sdk.base.ui.k(14, mm00Var, l2));
        } else if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.w, new Object[]{"render #" + ((Object) StringId.a(str)) + " is null"});
        }
        mm00Var.t.remove(new StringId(str));
    }

    public abstract aw50 c(zv50 zv50Var, boolean z);

    public abstract void d(byf0 byf0Var);

    public abstract zv50 g(do00 do00Var);

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(do00 do00Var, int i) {
        cpv c;
        int i2;
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"decorateAddOn #" + ((Object) StringId.a(do00Var.b))});
        }
        zv50 g = g(do00Var);
        g.b.o = f(do00Var, i);
        rpv rpvVar = this.f;
        rpvVar.getClass();
        String str = do00Var.b;
        CharSequence charSequence = do00Var.m;
        if (VisibleStyle.o(i)) {
            c = rpvVar.h.a(i, str);
        } else {
            c = rpvVar.c(i, str);
            if (c == null) {
                i2 = i;
                c = rpv.d(rpvVar, str, i2, charSequence, null, 16);
                if (c != null && c.c != i2) {
                    l.getClass();
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.w, new Object[]{"decorateAddOn !!!! visibleStyle = " + ((Object) VisibleStyle.K(i2)) + ", icon?.visibleStyle=" + ((Object) VisibleStyle.K(c.c))});
                    }
                }
                g.b(c);
            }
        }
        i2 = i;
        if (c != null) {
            l.getClass();
            if (!L.m(loggerOutputTarget)) {
            }
        }
        g.b(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(do00 do00Var, int i) {
        cpv c;
        int i2;
        String str = do00Var.b;
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"decorateRendered #" + ((Object) StringId.a(str))});
        }
        Rendered l2 = l(str);
        if (l2 == null) {
            return;
        }
        l2.c(f(do00Var, i));
        rpv rpvVar = this.f;
        rpvVar.getClass();
        String str2 = do00Var.b;
        CharSequence charSequence = do00Var.m;
        if (VisibleStyle.o(i)) {
            c = rpvVar.h.a(i, str2);
        } else {
            c = rpvVar.c(i, str2);
            if (c == null) {
                i2 = i;
                c = rpv.d(rpvVar, str2, i2, charSequence, null, 16);
                if (c != null && c.c != i2) {
                    l.getClass();
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.w, new Object[]{"decorateRendered !!!! visibleStyle = " + ((Object) VisibleStyle.K(i2)) + ", icon?.visibleStyle=" + ((Object) VisibleStyle.K(c.c))});
                    }
                }
                l2.b(c);
                if (VisibleStyle.B(i2) || c != null) {
                }
                cpv c2 = rpvVar.c(i2, str);
                if (c2 != null) {
                    u(l2, c2);
                    return;
                }
                String str3 = do00Var.l;
                if (str3 == null) {
                    return;
                }
                myc0.h(g5z.a(this.e), hqu0.b(), null, new nm00(this, i2, do00Var, str3, l2, null), 2);
                return;
            }
        }
        i2 = i;
        if (c != null) {
            l.getClass();
            if (!L.m(loggerOutputTarget)) {
            }
        }
        l2.b(c);
        if (VisibleStyle.B(i2)) {
        }
    }

    public abstract MutableCameraBounds j();

    public final ImageButton k() {
        return (ImageButton) this.k.getValue(this, B[3]);
    }

    public final Rendered l(String str) {
        return this.t.b.get(new StringId(str));
    }

    public final View m() {
        return (View) this.h.getValue(this, B[0]);
    }

    public void n() {
        s();
        this.v = null;
        this.l = null;
        dhr0.a.getClass();
        dhr0.X(this.y);
    }

    public final void o(long j) {
        int i = m300.b;
        if (j != -1) {
            this.d.C(new a.f(j));
        }
    }

    public final void p(Rendered rendered) {
        cpv icon = rendered.getIcon();
        if (icon != null) {
            String a2 = rendered.a();
            rpv rpvVar = this.f;
            rpvVar.i.e(a2, icon);
            rpvVar.j.e(a2, icon);
        }
        this.d.C(new a.C1080a(rendered.a()));
    }

    public abstract void q(Rendered rendered, boolean z, gzs<s3q0> gzsVar);

    public abstract void s();

    public final void t() {
        MutableCameraBounds j = j();
        if (j == null) {
            return;
        }
        cil cilVar = this.l;
        if (cilVar != null) {
            cilVar.d(j);
        }
        this.d.getClass();
    }

    public abstract void u(Rendered rendered, cpv cpvVar);

    public final void v(boolean z) {
        L.e(Boolean.valueOf(z));
        ImageButton k = k();
        if (z) {
            k.setContentDescription(k.getContext().getString(R.string.geo_my_location_granted));
            k().setImageResource(R.drawable.vk_icon_location_outline_28);
        } else {
            k.setContentDescription(k.getContext().getString(R.string.geo_my_location_not_granted));
            k().setImageResource(R.drawable.vk_icon_location_slash_24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(final do00 do00Var, int i, boolean z) {
        boolean z2;
        String str = do00Var.b;
        String str2 = do00Var.b;
        rpv rpvVar = this.f;
        final int h = rpvVar.h(i);
        L l = L.a;
        l.getClass();
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        if (!L.m(loggerOutputTarget)) {
            L.u(l, L.LogType.d, new Object[]{"updateVisibleStyle #" + ((Object) StringId.a(str)) + ' ' + VisibleStyle.i(h)});
        }
        zk3<StringId, VisibleStyle> zk3Var = this.u;
        VisibleStyle a2 = qqm0.a(zk3Var, str);
        cpv c = rpvVar.c(h, str);
        if (!VisibleStyle.o(h) && a2 != null && a2.b == h) {
            if (epx.g(h, c != null ? c.c : 33554434) < 0) {
                l.getClass();
                if (L.m(loggerOutputTarget)) {
                    return;
                }
                L.u(l, L.LogType.d, new Object[]{"updateVisibleStyle: oldStyle == style"});
                return;
            }
        }
        StringId stringId = new StringId(str);
        Map<StringId, Runnable> map = this.r;
        map.remove(stringId);
        if (VisibleStyle.u(h)) {
            r(this, str2, true, 4);
            return;
        }
        Rendered l2 = l(str);
        if (a2 != null) {
            int i2 = a2.b;
            if (VisibleStyle.p(i2) && epx.g(i2, h) > 0) {
                z2 = true;
                if (l2 == null && z2) {
                    l.getClass();
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"updateVisibleStyle #" + ((Object) StringId.a(str)) + ' ' + VisibleStyle.i(h) + " downgrade"});
                    }
                    r(this, str2, false, 6);
                    map.put(new StringId(str), new Runnable() { // from class: xsna.lm00
                        @Override // java.lang.Runnable
                        public final void run() {
                            mm00 mm00Var = mm00.this;
                            zk3<StringId, VisibleStyle> zk3Var2 = mm00Var.u;
                            rpv rpvVar2 = mm00Var.f;
                            do00 do00Var2 = do00Var;
                            int i3 = h;
                            try {
                                String str3 = do00Var2.b;
                                String str4 = do00Var2.b;
                                if (mm00Var.l(str3) == null) {
                                    zv50 g = mm00Var.g(do00Var2);
                                    int h2 = rpvVar2.h(i3);
                                    qqm0.b(zk3Var2, str4, h2);
                                    mm00Var.h(do00Var2, h2);
                                    L l3 = L.a;
                                    l3.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l3, L.LogType.d, new Object[]{"updateVisibleStyle 1: #" + ((Object) StringId.a(str3))});
                                    }
                                    aw50 c2 = mm00Var.c(g, false);
                                    if (c2 != null) {
                                        mm00Var.t.put(new StringId(str3), c2);
                                    }
                                    int h3 = rpvVar2.h(i3);
                                    qqm0.b(zk3Var2, str4, h3);
                                    mm00Var.i(do00Var2, h3);
                                }
                            } catch (Throwable th) {
                                L.i(th);
                            }
                        }
                    });
                    q(l2, z, new y6q(this, l2, do00Var, h));
                    return;
                }
                zv50 g = g(do00Var);
                int h2 = rpvVar.h(h);
                qqm0.b(zk3Var, str2, h2);
                h(do00Var, h2);
                if (l2 == null) {
                    l.getClass();
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"updateVisibleStyle 2: #" + ((Object) StringId.a(str))});
                    }
                    l2 = c(g, z);
                }
                if (l2 != null) {
                    this.t.put(new StringId(str), l2);
                }
                int h3 = rpvVar.h(h);
                qqm0.b(zk3Var, str2, h3);
                i(do00Var, h3);
                if (z || l2 == null) {
                }
                if (a2 == null || (VisibleStyle.p(h) && epx.g(a2.b, h) < 0)) {
                    l.getClass();
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{"updateVisibleStyle #" + ((Object) StringId.a(str)) + ' ' + VisibleStyle.i(h) + " animate showing"});
                    }
                    d(l2);
                    return;
                }
                return;
            }
        }
        z2 = false;
        if (l2 == null) {
        }
        zv50 g2 = g(do00Var);
        int h22 = rpvVar.h(h);
        qqm0.b(zk3Var, str2, h22);
        h(do00Var, h22);
        if (l2 == null) {
        }
        if (l2 != null) {
        }
        int h32 = rpvVar.h(h);
        qqm0.b(zk3Var, str2, h32);
        i(do00Var, h32);
        if (z) {
        }
    }
}
