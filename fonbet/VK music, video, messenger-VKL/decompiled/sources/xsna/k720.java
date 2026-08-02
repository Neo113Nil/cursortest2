package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.vk.api.generated.superApp.dto.SuperAppItemDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.data.ApiApplication;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.menu.data.network.response.StreamParcelableSuperAppMenu;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.SuperAppFeatures;
import com.vk.superapp.api.dto.menu.Animation;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.superapp.api.dto.menu.UpdateOptions;
import com.vk.superapp.api.dto.widgets.actions.WebActionRequestPermission;
import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionGridWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.menu.CustomMenuInfo;
import com.vk.superapp.ui.widgets.menu.SuperAppWidgetCustomMenu;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.superapp.ui.widgets.miniwidgets.SuperAppMiniWidget;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.tabbar.core.api.domain.TabbarItem;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.n9n0;

/* compiled from: MenuInteractor.kt */
/* loaded from: classes.dex */
public final class k720 implements com.vk.superapp.b {
    public static volatile io.reactivex.rxjava3.disposables.c A;
    public static volatile io.reactivex.rxjava3.disposables.c B;
    public static volatile io.reactivex.rxjava3.disposables.c C;
    public static volatile io.reactivex.rxjava3.disposables.c D;
    public static final io.reactivex.rxjava3.subjects.h E;
    public static final io.reactivex.rxjava3.subjects.h F;
    public static final io.reactivex.rxjava3.subjects.h G;
    public static final io.reactivex.rxjava3.subjects.h H;
    public static final io.reactivex.rxjava3.subjects.h I;
    public static final io.reactivex.rxjava3.subjects.h J;
    public static final io.reactivex.rxjava3.subjects.h K;
    public static final io.reactivex.rxjava3.internal.operators.observable.y L;
    public static final io.reactivex.rxjava3.subjects.h M;
    public static final io.reactivex.rxjava3.subjects.h N;
    public static volatile boolean O;
    public static final Object P;
    public static final LinkedHashSet Q;
    public static volatile n9n0 R;
    public static volatile Throwable S;
    public static final io.reactivex.rxjava3.subjects.d<QueueParams> T;
    public static final k720 a = new k720();
    public static final bpn0 b = new bpn0(new aq0(6));
    public static final bpn0 c = new bpn0(new mn8(4));
    public static final bpn0 d = new bpn0(new xb3(7));
    public static final bpn0 e;
    public static final bpn0 f;
    public static final bpn0 g;
    public static final bpn0 h;
    public static int i;
    public static int j;
    public static int k;
    public static String l;
    public static SuperAppMiniWidget m;
    public static volatile long n;
    public static final bpn0 o;
    public static final bpn0 p;
    public static final bpn0 q;
    public static final bpn0 r;
    public static final bpn0 s;
    public static final io.reactivex.rxjava3.subjects.f<List<ApiApplication>> t;
    public static final io.reactivex.rxjava3.subjects.h u;
    public static final io.reactivex.rxjava3.subjects.h v;
    public static final LinkedHashSet w;
    public static final LinkedHashSet x;
    public static final LinkedHashSet y;
    public static final LinkedHashMap z;

    /* compiled from: MenuInteractor.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebActionRequestPermission.Permission.values().length];
            try {
                iArr[WebActionRequestPermission.Permission.GEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebActionRequestPermission.Permission.CONTACTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Double.valueOf(((SuperAppWidget) t2).f()), Double.valueOf(((SuperAppWidget) t).f()));
        }
    }

    static {
        new bpn0(new zfl(3));
        new bpn0(new rwe(3));
        e = new bpn0(new y45(5));
        f = new bpn0(new zfl(2));
        g = new bpn0(new m(4));
        h = new bpn0(new yp6(6));
        i = -1;
        j = -1;
        k = -1;
        o = new bpn0(new s65(5));
        bpn0 bpn0Var = new bpn0(new nb8(10));
        p = new bpn0(new g58(4));
        q = new bpn0(new knf(10));
        bpn0 bpn0Var2 = new bpn0(new z58(5));
        r = bpn0Var2;
        s = new bpn0(new u35(5));
        t = new io.reactivex.rxjava3.subjects.f<>();
        ((mui0) bpn0Var.getValue()).f(new e720());
        io.reactivex.rxjava3.internal.operators.observable.z0 c2 = ((rvn0) bpn0Var2.getValue()).c();
        b720 b720Var = new b720(new b1v(2), 0);
        new iej(3);
        c2.subscribe(b720Var, new c720());
        io.reactivex.rxjava3.subjects.h M0 = io.reactivex.rxjava3.subjects.d.N0().M0();
        u = M0;
        v = M0;
        w = new LinkedHashSet();
        x = new LinkedHashSet();
        y = new LinkedHashSet();
        z = new LinkedHashMap();
        io.reactivex.rxjava3.subjects.h M02 = io.reactivex.rxjava3.subjects.d.N0().M0();
        E = M02;
        F = M02;
        io.reactivex.rxjava3.subjects.h M03 = new io.reactivex.rxjava3.subjects.f().M0();
        G = M03;
        H = M03;
        io.reactivex.rxjava3.subjects.h M04 = io.reactivex.rxjava3.subjects.d.N0().M0();
        I = M04;
        J = M04;
        io.reactivex.rxjava3.subjects.h M05 = io.reactivex.rxjava3.subjects.d.N0().M0();
        K = M05;
        L = new io.reactivex.rxjava3.internal.operators.observable.y(M05, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        io.reactivex.rxjava3.subjects.h M06 = new io.reactivex.rxjava3.subjects.f().M0();
        M = M06;
        N = M06;
        P = new Object();
        Q = new LinkedHashSet();
        T = io.reactivex.rxjava3.subjects.d.N0();
    }

    public static void G(boolean z2) {
        if (P()) {
            io.reactivex.rxjava3.subjects.d<QueueParams> dVar = T;
            Parcelable.Creator<QueueParams> creator = QueueParams.CREATOR;
            dVar.onNext(QueueParams.a.a());
            i0q0.j(new xzl(1));
            return;
        }
        QueueParams P0 = T.P0();
        if ((P0 == null || drm0.N(P0.d())) && z2) {
            io.reactivex.rxjava3.disposables.c cVar = C;
            if (cVar == null || cVar.h()) {
                C = new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.y0(yfb.x(atv0.h().m()), null, null, 3), new io.reactivex.rxjava3.functions.a() { // from class: xsna.i720
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        k720.C = null;
                    }
                }).subscribe(new j720(new f6w(8), 0), new st0(new k220(2), 25));
            }
        }
    }

    public static void H() {
        w.clear();
        x.clear();
        y.clear();
        z.clear();
    }

    public static io.reactivex.rxjava3.core.q I(Location location, List list) {
        abn0 abn0Var = (abn0) p.getValue();
        List<String> a2 = ((g80) h.getValue()).a(SuperAppFeatures.RequestName.GET_SHOWCASE);
        ArrayList arrayList = new ArrayList(3);
        WebActionRequestPermission.Permission[] values = WebActionRequestPermission.Permission.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                ayu0 ayu0Var = (ayu0) s.getValue();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                ayu0Var.j(context, RequestedMiniApp.VK_STEPS, null, new ekh(arrayList, 18));
                List<TabbarItem> h2 = ((rvn0) r.getValue()).h();
                ArrayList arrayList2 = new ArrayList(c5g.u(h2, 10));
                Iterator<T> it = h2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((TabbarItem) it.next()).d());
                }
                QueueParams P0 = T.P0();
                if (P0 != null && !drm0.N(P0.d()) && !P()) {
                    n9n0 n9n0Var = R;
                    if (epx.f(n9n0Var != null ? n9n0Var.c() : null, n9n0.a.b.a)) {
                        z2 = false;
                    }
                }
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                LocationCommon.a.getClass();
                return abn0Var.a(location, list, a2, arrayList, arrayList2, z2, LocationCommon.b(context2), r6m.i());
            }
            WebActionRequestPermission.Permission permission = values[i2];
            int i3 = a.$EnumSwitchMapping$0[permission.ordinal()];
            if (i3 == 1) {
                PermissionHelper.a.getClass();
                String[] strArr = PermissionHelper.h;
                Handler handler = x93.a;
                c63 c63Var = c63.a;
                Activity b2 = c63.b();
                if (b2 != null && PermissionHelper.p(b2, strArr) == PermissionHelper.PermissionResult.ALLOWED) {
                    arrayList.add(permission.name().toLowerCase(Locale.ROOT));
                }
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2++;
        }
    }

    public static ArrayList J(Collection collection) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (!Q.contains(((SuperAppWidget) obj).d().d())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static q9n0 K(q9n0 q9n0Var) {
        return new q9n0(J(q9n0Var.m()), q9n0Var.c(), q9n0Var.g(), q9n0Var.e(), q9n0Var.l(), q9n0Var.h(), q9n0Var.j(), q9n0Var.i(), q9n0Var.d(), q9n0Var.f(), q9n0Var.k(), q9n0Var.b());
    }

    public static SuperAppShowcaseSectionGridWidget L(ArrayList arrayList) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof SuperAppShowcaseSectionGridWidget) {
                break;
            }
        }
        return (SuperAppShowcaseSectionGridWidget) (obj instanceof SuperAppShowcaseSectionGridWidget ? obj : null);
    }

    public static String M(String str, String str2) {
        String s2;
        StringBuilder e2 = fw3.e(str);
        e2.append(BuildInfo.e);
        String sb = e2.toString();
        SharedPreferences f2 = Preference.f("menu_items");
        ArrayList arrayList = new ArrayList();
        Preference.Type type = Preference.Type.String;
        Preference preference = Preference.a;
        preference.getClass();
        arrayList.add(Preference.c(f2, type, "menu_items", str2, ""));
        Preference.Type type2 = Preference.Type.Number;
        preference.getClass();
        arrayList.add(Preference.c(f2, type2, "menu_items", sb, -1));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Preference.f) it.next()).a();
        }
        s2 = Preference.s("menu_items", str2, new String());
        if (!s2.equals(sb)) {
            Preference.H("menu_items", str2, sb);
            if (!TextUtils.isEmpty(s2)) {
                SharedPreferences f3 = Preference.f("menu_items");
                ArrayList arrayList2 = new ArrayList();
                Preference.a.getClass();
                arrayList2.add(Preference.c(f3, type, "menu_items", s2, ""));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((Preference.f) it2.next()).a();
                }
                Preference.C("menu_items", s2);
            }
        }
        return sb;
    }

    public static void N(List list) {
        n9n0 n9n0Var = R;
        if (n9n0Var != null) {
            List<SuperAppWidget> e2 = n9n0Var.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : e2) {
                if (!list.contains(((SuperAppWidget) obj).d().d())) {
                    arrayList.add(obj);
                }
            }
            q9n0 a2 = q9n0.a(n9n0Var.b(), J(arrayList));
            W(a2);
            K(a2);
            X(new n9n0(a2, n9n0.a.c.a));
        }
    }

    public static boolean O() {
        if (j < 0) {
            j = (int) Preference.m(-1L, "menu_items", (String) c.getValue());
        }
        return (System.currentTimeMillis() / ((long) 1000)) - ((long) j) < TimeUnit.HOURS.toSeconds(24L);
    }

    public static boolean P() {
        n9n0 n9n0Var = R;
        if (n9n0Var == null) {
            return true;
        }
        UpdateOptions d2 = n9n0Var.d();
        if (j < 0) {
            j = (int) Preference.m(-1L, "menu_items", (String) c.getValue());
        }
        return (System.currentTimeMillis() / ((long) 1000)) - ((long) j) > ((long) d2.d());
    }

    public static boolean Q(String str, ArrayList arrayList) {
        SuperAppShowcaseSectionGridWidget.Payload j2;
        List<SuperAppWidget> d2;
        SuperAppShowcaseSectionGridWidget L2 = L(arrayList);
        Object obj = null;
        if (L2 != null && (j2 = L2.j()) != null && (d2 = j2.d()) != null) {
            Iterator<T> it = d2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((SuperAppWidget) next).d().d(), str)) {
                    obj = next;
                    break;
                }
            }
            obj = (SuperAppWidget) obj;
        }
        return obj != null;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.b0 R() {
        qft qftVar = new qft();
        qftVar.k = true;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.y0(qftVar, null, null, 3).U(new vp(new pyz(5), 25));
        tts ttsVar = new tts(new qcw(6), 10);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(ttsVar, lVar, kVar, kVar);
    }

    public static io.reactivex.rxjava3.core.x S(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return io.reactivex.rxjava3.core.x.k(new Triple("", "", ""));
        }
        Animation animation = (Animation) arrayList.get(0);
        Pair pair = new Pair(animation.f(), animation.g());
        wex0 wex0Var = e370.n;
        if (wex0Var == null) {
            wex0Var = null;
        }
        return new io.reactivex.rxjava3.internal.operators.single.e0(new io.reactivex.rxjava3.internal.operators.single.r(wex0Var.a((String) pair.i()).K().l(new k73(new oey(4), 19)), new r2v(new bbw(pair, 6), 4)).l(new tp1(new eqq(animation, 16), 15)), new bk1(new g720(arrayList, 0), 23));
    }

    @SuppressLint({"CheckResult"})
    public static void T(boolean z2) {
        n9n0 n9n0Var = R;
        if (n9n0Var != null) {
            n9n0.a c2 = n9n0Var.c();
            if ((!(c2 instanceof n9n0.a.C3389a) || !((n9n0.a.C3389a) c2).a()) && !z2) {
                G(false);
                return;
            }
        }
        if (O()) {
            wmi0.a.l("key_supper_app_menu_cache_serialization", io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cx00(new a720(z2), 1));
        } else {
            pro0.e(new Runnable() { // from class: xsna.z620
                @Override // java.lang.Runnable
                public final void run() {
                    k720 k720Var = k720.a;
                    k720.U();
                }
            });
        }
    }

    @SuppressLint({"CheckResult"})
    public static void U() {
        io.reactivex.rxjava3.core.q a2;
        if (A != null) {
            return;
        }
        L.e("Loading SuperApp menu remote");
        byz byzVar = (byz) o.getValue();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        a2 = byzVar.a(context);
        io.reactivex.rxjava3.core.q L2 = a2.L(new yi2(new p7x(2), 27), false);
        wx00 wx00Var = new wx00(new d37(24), 1);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        L2.getClass();
        A = new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(L2, wx00Var, kVar), new io.reactivex.rxjava3.functions.a() { // from class: xsna.t620
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                k720 k720Var = k720.a;
                pro0.f(new y620(false, 0));
                k720.n = System.currentTimeMillis();
            }
        }).L(new h8(new svz(3), 23), false).subscribe(new gn0(new y8m(10), 28), new f5y(new u620(0), 2));
    }

    public static void V(List list) {
        if (list.isEmpty()) {
            return;
        }
        rsg0.y0(new dj70(list), null, null, 3).subscribe(new a2u(new zsw(7), 1), new rt10(new uuz(5), 1));
    }

    public static void W(q9n0 q9n0Var) {
        L.e("Saving SuperApp menu");
        wmi0.a.a("key_supper_app_menu_cache_serialization", new StreamParcelableSuperAppMenu(q9n0Var));
    }

    public static void X(n9n0 n9n0Var) {
        pro0.f(new vex(n9n0Var, 3));
    }

    public static void Y(Throwable th) {
        pro0.f(new nly(th, 5));
    }

    public static void Z(SuperAppAnimationConfig superAppAnimationConfig, Triple triple) {
        Object obj;
        Iterator<T> it = superAppAnimationConfig.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((Animation) obj).f(), triple.i())) {
                    break;
                }
            }
        }
        Animation animation = (Animation) obj;
        if (animation != null) {
            animation.h((String) triple.j());
            animation.i((String) triple.k());
        }
    }

    public static void a0(n9n0 n9n0Var) {
        Object obj;
        int i2;
        BadgeInfo d2;
        List<SuperAppWidget> e2 = n9n0Var.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : e2) {
            if (obj2 instanceof SuperAppWidgetCustomMenu) {
                arrayList.add(obj2);
            }
        }
        Collection collection = EmptyList.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            collection = j5g.u0(((SuperAppWidgetCustomMenu) it.next()).j(), collection);
        }
        Iterator it2 = collection.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (epx.f(((CustomMenuInfo) obj).e(), "friends")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CustomMenuInfo customMenuInfo = (CustomMenuInfo) obj;
        if (customMenuInfo != null && (d2 = customMenuInfo.d()) != null) {
            g620.y(d2.d());
        }
        List<SuperAppWidget> e3 = n9n0Var.e();
        boolean z2 = true;
        if (!e3.isEmpty()) {
            Iterator<T> it3 = e3.iterator();
            while (it3.hasNext()) {
                if (((SuperAppWidget) it3.next()).e().d()) {
                    i2 = 1;
                    break;
                }
            }
        }
        i2 = 0;
        synchronized (g620.D) {
            try {
                if (g620.u != i2) {
                    g620.u = Math.max(i2, 0);
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            g620.j();
        }
    }

    @Override // com.vk.superapp.b
    public final io.reactivex.rxjava3.core.q<it80<Throwable>> A() {
        return J;
    }

    @Override // com.vk.superapp.b
    public final io.reactivex.rxjava3.core.q<Boolean> B() {
        return L;
    }

    @Override // com.vk.superapp.b
    public final boolean C() {
        return ((long) BuildInfo.e) == Preference.m(0L, "menu_items", "vk_app_cache_from_version");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0003, B:6:0x0007, B:11:0x0020, B:12:0x0026, B:14:0x002c, B:21:0x004b, B:24:0x008b, B:26:0x0091, B:27:0x0099, B:28:0x00b1, B:30:0x004f, B:32:0x0053, B:34:0x0059, B:36:0x005f, B:40:0x006c, B:43:0x007f, B:44:0x0085, B:16:0x0041), top: B:3:0x0003 }] */
    @Override // com.vk.superapp.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(SuperAppWidget superAppWidget) {
        q9n0 b2;
        Integer d2;
        synchronized (P) {
            try {
                n9n0 n9n0Var = R;
                if (n9n0Var != null) {
                    String d3 = superAppWidget.d().d();
                    ArrayList arrayList = new ArrayList(n9n0Var.e());
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    boolean z2 = false;
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (epx.f(((SuperAppWidget) it.next()).d().d(), d3)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                        arrayList.set(i2, superAppWidget);
                    } else {
                        n9n0 n9n0Var2 = R;
                        if (!(((n9n0Var2 == null || (b2 = n9n0Var2.b()) == null || (d2 = b2.d()) == null) ? 0 : d2.intValue()) == 0) && ((SuperAppWidget) j5g.i0(arrayList)).f() > superAppWidget.f()) {
                            y.add(superAppWidget);
                            if (z2) {
                                if (arrayList.size() > 1) {
                                    g5g.L(arrayList, new b());
                                }
                                q9n0 a2 = q9n0.a(n9n0Var.b(), arrayList);
                                W(a2);
                                K(a2);
                                X(new n9n0(a2, n9n0.a.c.a));
                            }
                            y.removeIf(new brp(new kf5(d3, 5), 1));
                            w.removeIf(new s620(new r45(d3, 1), 0));
                        }
                        arrayList.add(superAppWidget);
                    }
                    z2 = true;
                    if (z2) {
                    }
                    y.removeIf(new brp(new kf5(d3, 5), 1));
                    w.removeIf(new s620(new r45(d3, 1), 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.superapp.b
    public final void E(SuperAppWidget superAppWidget) {
        synchronized (P) {
            try {
                n9n0 n9n0Var = R;
                if (n9n0Var != null) {
                    String d2 = superAppWidget.d().d();
                    ArrayList arrayList = new ArrayList(n9n0Var.e());
                    Iterator it = arrayList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (epx.f(((SuperAppWidget) it.next()).d().d(), superAppWidget.d().d())) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                        arrayList.set(i2, ((SuperAppWidget) arrayList.get(i2)).g(superAppWidget));
                        q9n0 a2 = q9n0.a(n9n0Var.b(), arrayList);
                        W(a2);
                        K(a2);
                        X(new n9n0(a2, n9n0.a.c.a));
                    } else {
                        k720 k720Var = a;
                        if (Q(d2, arrayList) && (superAppWidget instanceof enx0)) {
                            SuperAppShowcaseSectionGridWidget L2 = L(arrayList);
                            if (L2 != null) {
                                k720Var.p(L2.d().d(), (enx0) superAppWidget);
                            }
                        } else {
                            y.add(superAppWidget);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.vk.superapp.b
    public final io.reactivex.rxjava3.core.q<QueueParams> F() {
        io.reactivex.rxjava3.subjects.d<QueueParams> dVar = T;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    @Override // com.vk.superapp.b
    public final String a(SuperAppFeatures.RequestName requestName) {
        List<String> a2 = ((g80) h.getValue()).a(requestName);
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{go9.c("ActiveFeatures=", a2)});
        }
        if (a2.isEmpty()) {
            return null;
        }
        return j5g.g0(a2, StringUtils.COMMA, null, null, 0, null, 62);
    }

    @Override // com.vk.superapp.b
    public final boolean b(SuperAppWidget superAppWidget) {
        Set<String> a2;
        n9n0 n9n0Var = R;
        if (n9n0Var == null || (a2 = n9n0Var.a()) == null) {
            return false;
        }
        return a2.contains(String.valueOf(superAppWidget.d().getId()));
    }

    @Override // com.vk.superapp.b
    public final io.reactivex.rxjava3.core.q<it80<n9n0>> c() {
        return F;
    }

    @Override // com.vk.superapp.b
    public final void d(List<? extends MiniWidgetItem> list) {
        Object obj;
        Object obj2;
        n9n0 n9n0Var = R;
        if (n9n0Var == null) {
            return;
        }
        ArrayList arrayList = null;
        if (list.isEmpty()) {
            Iterator<T> it = n9n0Var.e().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (obj2 instanceof SuperAppMiniWidget) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (!(obj2 instanceof SuperAppMiniWidget)) {
                obj2 = null;
            }
            SuperAppMiniWidget superAppMiniWidget = (SuperAppMiniWidget) obj2;
            if (superAppMiniWidget != null) {
                m = superAppMiniWidget;
                List<SuperAppWidget> e2 = n9n0Var.e();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : e2) {
                    if (!(((SuperAppWidget) obj3) instanceof SuperAppMiniWidget)) {
                        arrayList2.add(obj3);
                    }
                }
                arrayList = J(arrayList2);
            }
        } else {
            Iterator<T> it2 = n9n0Var.e().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (obj instanceof SuperAppMiniWidget) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (!(obj instanceof SuperAppMiniWidget)) {
                obj = null;
            }
            if (((SuperAppMiniWidget) obj) != null) {
                List<SuperAppWidget> e3 = n9n0Var.e();
                ArrayList arrayList3 = new ArrayList(c5g.u(e3, 10));
                Iterator<T> it3 = e3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        arrayList = arrayList3;
                        break;
                    }
                    Parcelable parcelable = (SuperAppWidget) it3.next();
                    if (parcelable instanceof SuperAppMiniWidget) {
                        SuperAppMiniWidget superAppMiniWidget2 = (SuperAppMiniWidget) parcelable;
                        if (f870.k(superAppMiniWidget2.j().d(), list)) {
                            break;
                        }
                        ArrayList q2 = p4g.q(list);
                        MiniWidgetItem miniWidgetItem = (MiniWidgetItem) j5g.b0(q2.size(), superAppMiniWidget2.j().d());
                        if (miniWidgetItem != null) {
                            q2.add(miniWidgetItem);
                        }
                        parcelable = SuperAppMiniWidget.i(superAppMiniWidget2, null, SuperAppMiniWidget.Payload.a(superAppMiniWidget2.j(), q2), 47);
                    }
                    arrayList3.add(parcelable);
                }
            } else if (m != null) {
                arrayList = new ArrayList();
                SuperAppMiniWidget superAppMiniWidget3 = m;
                if (superAppMiniWidget3 != null) {
                    arrayList.add(superAppMiniWidget3);
                }
                arrayList.addAll(n9n0Var.e());
            } else {
                h(Collections.singletonList(SuperAppItemDto.TypeDto.MINI_WIDGETS.i()));
            }
        }
        if (arrayList != null) {
            q9n0 a2 = q9n0.a(n9n0Var.b(), arrayList);
            W(a2);
            K(a2);
            X(new n9n0(a2, n9n0.a.c.a));
        }
    }

    @Override // com.vk.superapp.b
    public final boolean e() {
        return O;
    }

    @Override // com.vk.superapp.b
    public final io.reactivex.rxjava3.core.q<it80<n9n0>> f(String str) {
        q9n0 b2;
        q9n0 b3;
        n9n0 n9n0Var = R;
        Integer i2 = (n9n0Var == null || (b3 = n9n0Var.b()) == null) ? null : b3.i();
        n9n0 n9n0Var2 = R;
        String f2 = (n9n0Var2 == null || (b2 = n9n0Var2.b()) == null) ? null : b2.f();
        Integer m2 = str != null ? arm0.m(10, str) : null;
        if (epx.f(str, "0") || n == 0) {
            return io.reactivex.rxjava3.internal.operators.observable.l1.b;
        }
        if (m2 == null || i2 == null) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        long max = Math.max(0L, 300 - (System.currentTimeMillis() - n));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.core.q<R> L2 = io.reactivex.rxjava3.core.q.B0(max, timeUnit).L(new d810(new xld(i2, m2, f2, 1), 2), false);
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.b0 G2 = L2.a0(asu0.i()).G(new io.reactivex.rxjava3.functions.a() { // from class: xsna.v620
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                k720.n = System.currentTimeMillis();
            }
        });
        c120 c120Var = new c120(new xsq(14), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return G2.E(c120Var, lVar, kVar, kVar).A(300L, timeUnit).U(new iw3(new wh1(23), 19));
    }

    @Override // com.vk.superapp.b
    public final void g(SuperAppWidget superAppWidget) {
        j(Collections.singletonList(superAppWidget));
    }

    @Override // com.vk.superapp.b
    @SuppressLint({"CheckResult"})
    public final void h(List<String> list) {
        io.reactivex.rxjava3.core.q a2;
        String k2 = p4g.k(list, StringUtils.COMMA, null);
        if (A != null) {
            if (drm0.N(k2) || epx.f(l, k2)) {
                return;
            } else {
                l = k2;
            }
        }
        L l2 = L.a;
        l2.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l2, L.LogType.d, new Object[]{go9.c("Partially updating SuperApp menu remote: widgets=", list)});
        }
        byz byzVar = (byz) o.getValue();
        Context context = e43.a;
        a2 = byzVar.a(context != null ? context : null);
        a2.L(new q40(new d720(list, 0), 24), false).subscribe(new ljs(new nj(28), 9), new j3z(new viu(7), 3));
    }

    @Override // com.vk.superapp.b
    public final void i(List<qnx0> list) {
        Object obj;
        n9n0 n9n0Var = R;
        if (n9n0Var != null) {
            List<SuperAppWidget> e2 = n9n0Var.e();
            ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
            boolean z2 = false;
            for (SuperAppWidget superAppWidget : e2) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (epx.f(((qnx0) obj).a(), superAppWidget.d().d())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                qnx0 qnx0Var = (qnx0) obj;
                SuperAppWidget b2 = (qnx0Var == null || drm0.N(superAppWidget.d().d()) || superAppWidget.e().e() == qnx0Var.b()) ? superAppWidget : superAppWidget.b(qnx0Var.b());
                if (!epx.f(superAppWidget, b2)) {
                    z2 = true;
                }
                arrayList.add(b2);
            }
            if (z2) {
                q9n0 a2 = q9n0.a(n9n0Var.b(), arrayList);
                W(a2);
                K(a2);
                X(new n9n0(a2, n9n0.a.c.a));
            }
        }
    }

    @Override // com.vk.superapp.b
    public final void j(List list) {
        n9n0 n9n0Var;
        if (list.isEmpty() || (n9n0Var = R) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(n9n0Var.e());
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            SuperAppWidget superAppWidget = (SuperAppWidget) it.next();
            Iterator it2 = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                }
                SuperAppWidget superAppWidget2 = (SuperAppWidget) it2.next();
                if (epx.f(superAppWidget2.getType(), superAppWidget.getType()) && superAppWidget2.d().getId() == superAppWidget.d().getId()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                arrayList.set(i2, superAppWidget);
                z2 = true;
            }
        }
        if (z2) {
            if (arrayList.size() > 1) {
                g5g.L(arrayList, new l720(0));
            }
            q9n0 a2 = q9n0.a(n9n0Var.b(), J(arrayList));
            W(a2);
            K(a2);
            X(new n9n0(a2, n9n0.a.c.a));
        }
    }

    @Override // com.vk.superapp.b
    public final void k() {
        if (x()) {
            return;
        }
        Preference.I("menu_items", "vk_app_opened_from_menu", true);
    }

    @Override // com.vk.superapp.b
    public final void l(long j2) {
        io.reactivex.rxjava3.subjects.d<QueueParams> dVar = T;
        QueueParams P0 = dVar.P0();
        if (P0 != null) {
            dVar.onNext(QueueParams.a(P0, j2));
        }
    }

    @Override // com.vk.superapp.b
    public final SuperAppAnimationConfig m() {
        String s2;
        s2 = Preference.s("menu_items", (String) f.getValue(), new String());
        if (s2.length() == 0 || drm0.N(s2)) {
            return null;
        }
        try {
            return (SuperAppAnimationConfig) ((Gson) g.getValue()).fromJson(s2, SuperAppAnimationConfig.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.vk.superapp.b
    public final void n() {
        io.reactivex.rxjava3.disposables.c cVar = A;
        if (cVar != null) {
            cVar.dispose();
        }
        A = null;
        U();
    }

    @Override // com.vk.superapp.b
    public final io.reactivex.rxjava3.core.q<SuperAppAnimationConfig> o() {
        return H;
    }

    @Override // com.vk.superapp.b
    public final void p(String str, enx0 enx0Var) {
        synchronized (P) {
            try {
                n9n0 n9n0Var = R;
                if (n9n0Var != null) {
                    ArrayList arrayList = new ArrayList(n9n0Var.e());
                    Iterator it = arrayList.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else if (epx.f(((SuperAppWidget) it.next()).d().d(), str)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                        Parcelable parcelable = (SuperAppWidget) arrayList.get(i2);
                        if (parcelable instanceof ctx0) {
                            arrayList.set(i2, ((ctx0) parcelable).a(Collections.singletonList(enx0Var)));
                            q9n0 a2 = q9n0.a(n9n0Var.b(), arrayList);
                            W(a2);
                            K(a2);
                            X(new n9n0(a2, n9n0.a.c.a));
                        }
                    } else {
                        LinkedHashMap linkedHashMap = z;
                        HashSet hashSet = (HashSet) linkedHashMap.get(str);
                        if (hashSet != null) {
                            hashSet.add(enx0Var);
                        } else {
                            hashSet = izi0.d(enx0Var);
                        }
                        linkedHashMap.put(str, hashSet);
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.vk.superapp.b
    public final void q(String str, boolean z2) {
        if (z2) {
            io.reactivex.rxjava3.subjects.d<QueueParams> dVar = T;
            QueueParams P0 = dVar.P0();
            if (P0 == null || epx.f(P0.d(), str)) {
                Parcelable.Creator<QueueParams> creator = QueueParams.CREATOR;
                dVar.onNext(QueueParams.a.a());
                G(true);
            }
        }
    }

    @Override // com.vk.superapp.b
    public final void r(String str) {
        N(Collections.singletonList(str));
    }

    @Override // com.vk.superapp.b
    public final void s(boolean z2) {
        T(z2);
    }

    @Override // com.vk.superapp.b
    public final void t(String str) {
        Object obj;
        n9n0 n9n0Var = R;
        if (n9n0Var != null) {
            Iterator<T> it = n9n0Var.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (epx.f(((SuperAppWidget) obj).d().d(), str)) {
                        break;
                    }
                }
            }
            if (obj != null) {
                a.r(str);
            } else {
                w.add(str);
            }
            y.removeIf(new taw(new h720(str, 0), 1));
            x.removeIf(new d86(new com.vk.movika.sdk.base.logic.processor.c(str, 4), 2));
        }
    }

    @Override // com.vk.superapp.b
    public final void u() {
        String s2;
        SuperAppAnimationConfig m2 = m();
        if (m2 != null) {
            pro0.f(new wzh(m2, 20));
        }
        s2 = Preference.s("menu_items", (String) f.getValue(), new String());
        if (s2.length() > 0 && !drm0.N(s2)) {
            SuperAppAnimationConfig m3 = m2 == null ? m() : m2;
            if (m3 != null) {
                int b2 = m3.b();
                if (k < 0) {
                    k = (int) Preference.m(-1L, "menu_items", (String) d.getValue());
                }
                if ((System.currentTimeMillis() / 1000) - k <= b2) {
                    return;
                }
            }
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        B = new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.r(vdx0Var.u().a().l(new dg1(new w620(m2, 0), 26)), new z8(new x620(0), 19)), new rj4(new y510(2), 22)).subscribe(new tz(new vd1(23), 23), new c40(new b40(25), 29));
    }

    @Override // com.vk.superapp.b
    public final io.reactivex.rxjava3.core.q<s3q0> v() {
        return N;
    }

    @Override // com.vk.superapp.b
    public final void w() {
        BuildInfo.Client client = BuildInfo.a;
        Preference.F(BuildInfo.e, "menu_items", "vk_app_cache_from_version");
    }

    @Override // com.vk.superapp.b
    public final boolean x() {
        return Preference.d("menu_items", "vk_app_opened_from_menu", false);
    }

    @Override // com.vk.superapp.b
    public final void y(String str) {
        if (Q.add(str)) {
            N(Collections.singletonList(str));
        }
    }

    @Override // com.vk.superapp.b
    public final n9n0 z() {
        return R;
    }
}
