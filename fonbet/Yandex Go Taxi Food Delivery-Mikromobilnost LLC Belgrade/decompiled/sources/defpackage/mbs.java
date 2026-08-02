package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.i;
import androidx.core.view.b;
import androidx.customview.widget.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.x0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.yandex.go.flex.common.api.ui.theme.DivKitThemedFrameLayout;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.ui.FragmentBackground;

/* loaded from: classes.dex */
public final class mbs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public mbs(jya1 jya1Var) {
        this.a = 14;
        Objects.requireNonNull(jya1Var);
        this.b = jya1Var;
    }

    private final void a() {
        wsx0 b;
        long j;
        wsx0 b2;
        mtx0 mtx0Var = (mtx0) this.b;
        synchronized (mtx0Var) {
            mtx0Var.g++;
            b = mtx0Var.b();
        }
        if (b == null) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        while (true) {
            try {
                currentThread.setName(b.a);
                Logger logger = ((mtx0) this.b).b;
                htx0 htx0Var = b.c;
                boolean isLoggable = logger.isLoggable(Level.FINE);
                if (isLoggable) {
                    j = System.nanoTime();
                    vkb1.a(logger, b, htx0Var, "starting");
                } else {
                    j = -1;
                }
                try {
                    long a = b.a();
                    if (isLoggable) {
                        vkb1.a(logger, b, htx0Var, "finished run in " + vkb1.b(System.nanoTime() - j));
                    }
                    mtx0 mtx0Var2 = (mtx0) this.b;
                    synchronized (mtx0Var2) {
                        mtx0.a(mtx0Var2, b, a, true);
                        b2 = mtx0Var2.b();
                    }
                    if (b2 == null) {
                        return;
                    } else {
                        b = b2;
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        vkb1.a(logger, b, htx0Var, "failed a run in " + vkb1.b(System.nanoTime() - j));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    mtx0 mtx0Var3 = (mtx0) this.b;
                    synchronized (mtx0Var3) {
                        mtx0.a(mtx0Var3, b, -1L, false);
                        if (!(th2 instanceof InterruptedException)) {
                            throw th2;
                        }
                        Thread.currentThread().interrupt();
                        return;
                    }
                } finally {
                    currentThread.setName(name);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02af  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        v66 blurDelegate;
        cgw0 binding;
        int i;
        int i2;
        x0 x0Var;
        Object obj;
        int i3 = 0;
        switch (this.a) {
            case 0:
                ((Fragment) this.b).startPostponedEnterTransition();
                return;
            case 1:
                ((FragmentManager) this.b).z(true);
                return;
            case 2:
                FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView = (FullscreenSuperappSuggestModalView) this.b;
                blurDelegate = fullscreenSuperappSuggestModalView.getBlurDelegate();
                if (blurDelegate != null) {
                    binding = fullscreenSuperappSuggestModalView.getBinding();
                    blurDelegate.b(binding.e);
                    return;
                }
                return;
            case 3:
                synchronized (((qst) this.b).a) {
                    while (((qst) this.b).a.get() == null) {
                        try {
                            ((qst) this.b).a.wait();
                        } catch (InterruptedException e) {
                            Log.e("FA-W", "Error waiting for a FirebaseAnalytics instance.", e);
                        }
                    }
                }
                return;
            case 4:
                s sVar = (s) this.b;
                if (sVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = sVar.U;
                    long j2 = j != Long.MIN_VALUE ? currentTimeMillis - j : 0L;
                    RecyclerView.e layoutManager = sVar.K.getLayoutManager();
                    if (sVar.T == null) {
                        sVar.T = new Rect();
                    }
                    layoutManager.m(sVar.c.a, sVar.T);
                    if (layoutManager.I()) {
                        int i4 = (int) (sVar.C + sVar.A);
                        int paddingLeft = (i4 - sVar.T.left) - sVar.K.getPaddingLeft();
                        float f = sVar.A;
                        if ((f < 0.0f && paddingLeft < 0) || (f > 0.0f && (paddingLeft = ((sVar.c.a.getWidth() + i4) + sVar.T.right) - (sVar.K.getWidth() - sVar.K.getPaddingRight())) > 0)) {
                            i = paddingLeft;
                            if (layoutManager.J()) {
                                int i5 = (int) (sVar.D + sVar.B);
                                int paddingTop = (i5 - sVar.T.top) - sVar.K.getPaddingTop();
                                float f2 = sVar.B;
                                if ((f2 < 0.0f && paddingTop < 0) || (f2 > 0.0f && (paddingTop = ((sVar.c.a.getHeight() + i5) + sVar.T.bottom) - (sVar.K.getHeight() - sVar.K.getPaddingBottom())) > 0)) {
                                    i3 = paddingTop;
                                }
                            }
                            if (i != 0) {
                                i = sVar.F.h(sVar.K, sVar.c.a.getWidth(), i, sVar.K.getWidth(), j2);
                            }
                            i2 = i;
                            if (i3 == 0) {
                                i3 = sVar.F.h(sVar.K, sVar.c.a.getHeight(), i3, sVar.K.getHeight(), j2);
                            }
                            if (i2 != 0 && i3 == 0) {
                                sVar.U = Long.MIN_VALUE;
                                return;
                            }
                            if (sVar.U == Long.MIN_VALUE) {
                                sVar.U = currentTimeMillis;
                            }
                            sVar.K.scrollBy(i2, i3);
                            x0Var = sVar.c;
                            if (x0Var != null) {
                                sVar.n(x0Var);
                            }
                            sVar.K.removeCallbacks(sVar.L);
                            RecyclerView recyclerView = sVar.K;
                            WeakHashMap weakHashMap = b.a;
                            recyclerView.postOnAnimation(this);
                            return;
                        }
                    }
                    i = 0;
                    if (layoutManager.J()) {
                    }
                    if (i != 0) {
                    }
                    i2 = i;
                    if (i3 == 0) {
                    }
                    if (i2 != 0) {
                    }
                    if (sVar.U == Long.MIN_VALUE) {
                    }
                    sVar.K.scrollBy(i2, i3);
                    x0Var = sVar.c;
                    if (x0Var != null) {
                    }
                    sVar.K.removeCallbacks(sVar.L);
                    RecyclerView recyclerView2 = sVar.K;
                    WeakHashMap weakHashMap2 = b.a;
                    recyclerView2.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                i iVar = (i) this.b;
                DropDownListView dropDownListView = iVar.c;
                if (dropDownListView == null || !dropDownListView.isAttachedToWindow() || iVar.c.getCount() <= iVar.c.getChildCount() || iVar.c.getChildCount() > iVar.F) {
                    return;
                }
                iVar.S.setInputMethodMode(2);
                iVar.show();
                return;
            case 6:
                synchronized (((v) this.b).a) {
                    obj = ((v) this.b).f;
                    ((v) this.b).f = v.k;
                }
                ((v) this.b).l(obj);
                return;
            case 7:
                ru.yandex.taxi.viewholder.b bVar = (ru.yandex.taxi.viewholder.b) this.b;
                bVar.getClass();
                ybs ybsVar = FragmentBackground.Companion;
                Fragment a = ((ics) bVar.f).a();
                ybsVar.getClass();
                FragmentBackground a2 = ybs.a(a);
                TaxiMapView d = bVar.d();
                if (d != null) {
                    bVar.i(d, a2);
                    return;
                }
                return;
            case 8:
                a();
                return;
            case 9:
                ((Toolbar) this.b).showOverflowMenu();
                return;
            case 10:
                ((a) this.b).q(0);
                return;
            case 11:
                ViewPager viewPager = (ViewPager) this.b;
                viewPager.setScrollState(0);
                viewPager.populate();
                return;
            case 12:
                Context context = ((com.google.android.gms.internal.appset.b) this.b).a;
                long j3 = com.google.android.gms.internal.appset.b.a(context).getLong("app_set_id_last_used_time", -1L);
                long j4 = j3 != -1 ? j3 + 33696000000L : -1L;
                if (j4 == -1 || System.currentTimeMillis() <= j4) {
                    return;
                }
                if (!com.google.android.gms.internal.appset.b.a(context).edit().remove(CommonUrlParts.APP_SET_ID).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 13:
                j jVar = (j) this.b;
                jVar.Gg();
                g gVar = (g) jVar.b;
                o5a1 o5a1Var = gVar.x;
                y1a1 y1a1Var = gVar.y;
                g.e(o5a1Var);
                g4a1 g4a1Var = o5a1Var.N;
                if (g4a1Var.a()) {
                    g.g(y1a1Var);
                    y1a1Var.G.a("Deferred Deep Link already retrieved. Not fetching again.");
                    return;
                }
                u4a1 u4a1Var = o5a1Var.O;
                long a3 = u4a1Var.a();
                u4a1Var.b(1 + a3);
                if (a3 >= 5) {
                    g.g(y1a1Var);
                    y1a1Var.C.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                    g4a1Var.b(true);
                    return;
                } else {
                    if (jVar.N == null) {
                        jVar.N = new vma1(jVar, gVar, 1);
                    }
                    jVar.N.b(0L);
                    return;
                }
            case 14:
                ((jya1) this.b).D = null;
                return;
            case 15:
                Context context2 = (Context) this.b;
                AtomicReference atomicReference = kst0.e;
                try {
                    tvb1 b = tvb1.b(context2);
                    synchronized (b) {
                        b.f = true;
                        b.a();
                    }
                    return;
                } catch (SecurityException unused) {
                    Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    return;
                }
            default:
                try {
                    ((kst0) this.b).a.g();
                    return;
                } catch (Exception e2) {
                    Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e2);
                    return;
                }
        }
    }

    public mbs(DivKitThemedFrameLayout divKitThemedFrameLayout, FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        this.a = 2;
        this.b = fullscreenSuperappSuggestModalView;
    }

    public /* synthetic */ mbs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
