package xsna;

import android.content.Context;
import androidx.preference.Preference;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.toggle.features.FeedFeatures;
import io.reactivex.rxjava3.internal.disposables.CancellableDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.maybe.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.CoroutineStart;
import org.jsoup.select.Elements;
import xsna.o2z0;
import xsna.oxp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class k5g implements h570, io.reactivex.rxjava3.core.a0, Preference.c, io.reactivex.rxjava3.core.n {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k5g(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.h570
    public void b(org.jsoup.nodes.j jVar, int i) {
        oxp.a aVar = (oxp.a) this.b;
        Elements elements = (Elements) this.c;
        if (jVar instanceof org.jsoup.nodes.g) {
            org.jsoup.nodes.g gVar = (org.jsoup.nodes.g) jVar;
            if (gVar.e.c.equals(aVar.a)) {
                elements.add(gVar);
            }
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        Preference.c cVar = (Preference.c) this.b;
        Preference preference2 = (Preference) this.c;
        boolean z = cVar != null && cVar.eh(preference);
        czc0.b(preference2, null);
        return z;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) this.b;
        zix zixVar = (zix) this.c;
        String str = myTargetNativeAdEntry.o;
        String str2 = myTargetNativeAdEntry.n;
        boolean f = epx.f(str, "static");
        String str3 = myTargetNativeAdEntry.o;
        boolean z = epx.f(str3, "video") && com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_INTERNAL_NATIVE_AD_VIDEO);
        boolean f2 = epx.f(str3, "carousel");
        if (!f && !z && !f2) {
            bp50 bp50Var = new bp50();
            Context context = e43.a;
            zu50 zu50Var = new zu50(0, bp50Var, context != null ? context : null);
            zu50Var.b("VK_NEWS_FEED");
            u6z0 u6z0Var = zu50Var.a;
            u6z0Var.a.g("stories_playhead_v2", "1");
            zu50Var.i = new tp50(yVar, bp50Var, myTargetNativeAdEntry);
            if (com.vk.toggle.b.A.a(FeedFeatures.ADS_SDK_NON_CACHE_POLICY)) {
                u6z0Var.f = 3;
                u6z0Var.j.g = 3;
            } else {
                u6z0Var.f = 1;
                u6z0Var.j.g = 1;
            }
            zu50Var.f(str2);
            return;
        }
        final p5z0 a = zixVar.a().a(str2, null, null);
        wjz0 wjz0Var = a.d;
        if (wjz0Var == null) {
            up50.b(yVar, null, null, a, up50.d(myTargetNativeAdEntry.p, str3));
            return;
        }
        List I = rl3.I(new ehx[]{wjz0Var.d, wjz0Var.e});
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ArrayList arrayList = (ArrayList) I;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ehx ehxVar = (ehx) arrayList.get(i);
            final sp50 sp50Var = new sp50(atomicBoolean, I, yVar, myTargetNativeAdEntry);
            if (ehxVar instanceof kbz0) {
                final kbz0 kbz0Var = (kbz0) ehxVar;
                final ocz0 ocz0Var = a.a;
                final kbz0 kbz0Var2 = (kbz0) ehxVar;
                p5z0 p5z0Var = a;
                a = p5z0Var;
                final ou9 ou9Var = new ou9(kbz0Var2, new p6z0(kbz0Var, sp50Var, p5z0Var, kbz0Var2, 0));
                o8z0.a(new Runnable() { // from class: xsna.q6z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        final sp50 sp50Var2 = sp50.this;
                        final gjx gjxVar = a;
                        final ehx ehxVar2 = kbz0Var2;
                        o8z0.d(new df6(sp50Var2, gjxVar, ehxVar2, 11));
                        final kiw kiwVar = kbz0Var.a;
                        giy0 giy0Var = ocz0Var.T;
                        WeakHashMap weakHashMap = o2z0.c;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(kiwVar);
                        o2z0 b = o2z0.b(arrayList2, 999, giy0Var);
                        final ou9 ou9Var2 = ou9Var;
                        b.b = new o2z0.b(ou9Var2, kiwVar, sp50Var2, gjxVar, ehxVar2) { // from class: xsna.r6z0
                            public final /* synthetic */ kiw b;
                            public final /* synthetic */ sp50 c;
                            public final /* synthetic */ gjx d;
                            public final /* synthetic */ ehx e;

                            {
                                this.b = kiwVar;
                                this.c = sp50Var2;
                                this.d = gjxVar;
                                this.e = ehxVar2;
                            }

                            @Override // xsna.o2z0.b
                            public final void a(boolean z2) {
                                sp50 sp50Var3 = this.c;
                                io.reactivex.rxjava3.core.y<bs50> yVar2 = sp50Var3.c;
                                AtomicBoolean atomicBoolean2 = sp50Var3.a;
                                if (this.b.a() == null) {
                                    atomicBoolean2.set(true);
                                    yVar2.onError(new Exception(com.vk.movika.sdk.base.model.history.b.b(3, "Loading Error [", "] ", "Error while loading the media")));
                                    return;
                                }
                                if (atomicBoolean2.get()) {
                                    return;
                                }
                                List<ehx> list = sp50Var3.b;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator<T> it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((ehx) it.next()).getBitmap() == null) {
                                            return;
                                        }
                                    }
                                }
                                MyTargetNativeAdEntry myTargetNativeAdEntry2 = sp50Var3.d;
                                up50.b(yVar2, null, null, this.d, up50.d(myTargetNativeAdEntry2.p, myTargetNativeAdEntry2.o));
                            }
                        };
                        if (!b.a.isEmpty()) {
                            b.f(new uxb0(b, 23));
                        } else {
                            if (b.b == null) {
                                return;
                            }
                            o8z0.d(new vb(b, 22));
                        }
                    }
                });
            } else {
                atomicBoolean.set(true);
                yVar.onError(new Exception("Loading Error [1] Media has invalid format"));
            }
        }
    }

    public /* synthetic */ k5g(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj3;
    }

    @Override // io.reactivex.rxjava3.core.n
    public void subscribe(io.reactivex.rxjava3.core.l lVar) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) this.b;
        kvg0 kvg0Var = (kvg0) this.c;
        kotlin.coroutines.d a = mvj.a(EmptyCoroutineContext.b, dVar, true);
        xll xllVar = bdn.b;
        if (a != xllVar && a.get(c.a.b) == null) {
            a = a.plus(xllVar);
        }
        xd xug0Var = new xug0(a, lVar);
        zsg0 zsg0Var = new zsg0(xug0Var);
        c.a aVar = (c.a) lVar;
        aVar.getClass();
        DisposableHelper.d(aVar, new CancellableDisposable(zsg0Var));
        xug0Var.w0(CoroutineStart.DEFAULT, xug0Var, kvg0Var);
    }
}
