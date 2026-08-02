package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.dto.menu.TabBarItem;
import com.vk.dto.menu.TabBarItems;
import com.vk.dto.menu.a;
import com.vk.log.L;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;

/* compiled from: BottomNavigationState.kt */
/* loaded from: classes.dex */
public final class b68 implements w8i {
    public static volatile dlj0 d;
    public static final Object i;
    public static final Object j;
    public static final b68 b = new b68();
    public static final int[] c = {TabMenuItemUiData.HOME.h(), TabMenuItemUiData.HUB.h(), TabMenuItemUiData.IM.h(), TabMenuItemUiData.CLIPS.h(), TabMenuItemUiData.PROFILE.h()};
    public static final Map<Class<? extends FragmentImpl>, Integer> e = Collections.synchronizedMap(new LinkedHashMap());
    public static final Set<Integer> f = Collections.synchronizedSet(new LinkedHashSet());
    public static final Set<Integer> g = Collections.synchronizedSet(new LinkedHashSet());
    public static final Set<lz50> h = Collections.synchronizedSet(new LinkedHashSet());

    /* compiled from: BottomNavigationState.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    static {
        z58 z58Var = new z58(0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        i = msy.a(lazyThreadSafetyMode, z58Var);
        j = msy.a(lazyThreadSafetyMode, new a68(0));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(int i2) {
        Class<? extends FragmentImpl> a2;
        Set<Integer> set = f;
        if (set.size() < 6 && (a2 = m820.a(i2, ((wtn0) i.getValue()).e("community_id_arg"))) != null) {
            e.put(a2, Integer.valueOf(i2));
            set.add(Integer.valueOf(i2));
            gaq gaqVar = i2 == TabMenuItemUiData.OVERVIEW.h() ? new gaq() : null;
            if (gaqVar != null) {
                h.add(gaqVar);
            }
            StringBuilder sb = new StringBuilder("tab added - ");
            Context context = e43.a;
            sb.append(gbg0.b((context != null ? context : null).getResources(), i2));
            L.e("bnts", sb.toString());
        }
    }

    public static void b() {
        d = null;
        f.clear();
        e.clear();
        g.clear();
        Set<lz50> set = h;
        Iterator<lz50> it = set.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        set.clear();
        L.e("bnts", "State cleared without navigation");
    }

    public static void c() {
        L.e("bnts", "creating fallback tabs");
        int[] iArr = c;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            boolean z = i3 != TabMenuItemUiData.PROFILE.h() && (i3 != TabMenuItemUiData.CLIPS.h() || g620.f().getExperiments().a());
            StringBuilder sb = new StringBuilder("is fallback ");
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            sb.append(gbg0.b(context.getResources(), i3));
            sb.append(" available - ");
            sb.append(z);
            L.e("bnts", sb.toString());
            if (z) {
                a(i3);
            }
        }
    }

    public static final synchronized Class<? extends FragmentImpl> d() {
        Class<? extends FragmentImpl> cls;
        synchronized (b68.class) {
            cls = (Class) j5g.X(f().keySet());
        }
        return cls;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public static h58 e() {
        return (h58) j.getValue();
    }

    public static final synchronized LinkedHashMap f() {
        LinkedHashMap linkedHashMap;
        synchronized (b68.class) {
            try {
                Map<Class<? extends FragmentImpl>, Integer> map = e;
                if (map.isEmpty()) {
                    b.m();
                }
                linkedHashMap = new LinkedHashMap(map);
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public static final synchronized boolean h() {
        boolean contains;
        synchronized (b68.class) {
            contains = f.contains(Integer.valueOf(TabMenuItemUiData.OVERVIEW.h()));
        }
        return contains;
    }

    public static final synchronized boolean i() {
        boolean contains;
        synchronized (b68.class) {
            contains = f.contains(Integer.valueOf(TabMenuItemUiData.FEEDBACK.h()));
        }
        return contains;
    }

    public static boolean j(int i2) {
        boolean a2 = i2 == TabMenuItemUiData.CLIPS.h() ? tyx.a().getExperiments().a() : true;
        StringBuilder sb = new StringBuilder("is ");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        sb.append(gbg0.b(context.getResources(), i2));
        sb.append(" available - ");
        sb.append(a2);
        L.e("bnts", sb.toString());
        return a2;
    }

    public static final void k(Activity activity, boolean z) {
        ww50 v = s200.v(activity);
        nx50 nx50Var = v instanceof nx50 ? (nx50) v : null;
        if (nx50Var == null) {
            return;
        }
        nx50Var.P0(false, z);
        Iterator<WeakReference<a>> it = e().g.iterator();
        while (it.hasNext()) {
            a aVar = it.next().get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.a();
            }
        }
    }

    public static final void l(String str, boolean z) {
        h58 e2 = e();
        e2.c();
        com.vk.dto.menu.a a2 = e2.a();
        a.C0910a c0910a = a2.c;
        if (c0910a != null) {
            c0910a.d(z);
        }
        a.C0910a c0910a2 = a2.c;
        if (c0910a2 != null) {
            c0910a2.e();
        }
        e2.a.b(a2);
        Preference.I("NavigationUtils", "cached_is_enabled", z);
        Preference.H("NavigationUtils", "cached_source", str);
    }

    public final synchronized LinkedHashSet g() {
        Set<Integer> set;
        try {
            set = f;
            if (set.isEmpty()) {
                m();
            }
        } catch (Throwable th) {
            throw th;
        }
        return new LinkedHashSet(set);
    }

    public final synchronized void m() {
        try {
            if (!e.isEmpty()) {
                b();
            }
            d = e().a().b().d;
            TabBarItems b2 = e().b();
            L.e("bnts", "creating server tabs: " + j5g.g0(b2, null, null, null, 0, null, 63));
            Iterator<TabBarItem> it = b2.iterator();
            while (it.hasNext()) {
                TabBarItem next = it.next();
                TabMenuItemUiData.a aVar = TabMenuItemUiData.Companion;
                String str = next.b;
                aVar.getClass();
                TabMenuItemUiData b3 = TabMenuItemUiData.a.b(str);
                if (b3 != null && j(b3.h())) {
                    a(b3.h());
                }
            }
            if (e.isEmpty()) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
