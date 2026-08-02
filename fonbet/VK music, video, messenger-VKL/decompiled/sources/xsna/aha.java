package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.o7x0;

/* compiled from: CatalogSnackbarManager.kt */
/* loaded from: classes16.dex */
public final class aha {
    public static final /* synthetic */ qcy<Object>[] l;
    public static final String m;
    public final Context a;
    public final ih80 b;
    public final o7x0 c;
    public final edt0 e;
    public final long h;
    public final Object i;
    public final Object j;
    public boolean k;
    public final i560 d = new i560();
    public final pgn f = new pgn();
    public final boolean g = fxc0.B().J().u0();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(aha.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        l = new qcy[]{mutablePropertyReference1Impl};
        m = UUID.randomUUID().toString();
    }

    public aha(FragmentActivity fragmentActivity, ih80 ih80Var, rcg0 rcg0Var) {
        this.a = fragmentActivity;
        this.b = ih80Var;
        this.c = new o7x0(fragmentActivity, new o7x0.a(0), ih80Var);
        this.e = new edt0(fragmentActivity);
        this.h = BuildInfo.q() ? 3000L : 1000L;
        se0 se0Var = new se0(5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, se0Var);
        this.j = msy.a(lazyThreadSafetyMode, new l1(this, 13));
        com.vk.core.utils.newtork.b.a.getClass();
        this.k = com.vk.core.utils.newtork.b.d();
    }

    public final void a(final boolean z) {
        com.vk.core.utils.newtork.b.a.getClass();
        this.k = com.vk.core.utils.newtork.b.d();
        io.reactivex.rxjava3.subjects.d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
        com.vk.movika.sdk.base.flow.binding.c cVar = new com.vk.movika.sdk.base.flow.binding.c(new k9(this, 19), 10);
        dVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(dVar, cVar).U(new ed(new sd4(4), 8));
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.y(U, qVar, aVar).y(this.h, TimeUnit.MILLISECONDS), qVar, aVar);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.disposables.c h = hg1.h(yVar.r0(asu0.i()).a0(asu0Var.d()), new izs() { // from class: xsna.yga
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                aha ahaVar = aha.this;
                if (booleanValue) {
                    ahaVar.d.a();
                    if (!ahaVar.g || ahaVar.k) {
                        eqy<bek0> eqyVar = com.vk.toggle.d.a;
                        if (!(BuildInfo.q() ? VideoFeatures.VIDEO_KBH_DETECT : CoreFeatures.KBH_DETECT).h()) {
                            o7x0 o7x0Var = ahaVar.c;
                            o7x0Var.getClass();
                            io.reactivex.rxjava3.internal.operators.completable.o oVar = new io.reactivex.rxjava3.internal.operators.completable.o(new xab(o7x0Var, 12));
                            asu0 asu0Var2 = asu0.a;
                            asu0Var2.getClass();
                            io.reactivex.rxjava3.disposables.c g = hg1.g(oVar.q(asu0.i()).o(asu0Var2.d()), new v5n0(o7x0Var, 29));
                            pgn pgnVar = o7x0Var.e;
                            qcy<Object> qcyVar = o7x0.g[0];
                            pgnVar.b(g);
                        }
                    } else {
                        ahaVar.e.a();
                    }
                } else {
                    o7x0 o7x0Var2 = ahaVar.c;
                    pgn pgnVar2 = o7x0Var2.e;
                    qcy<Object> qcyVar2 = o7x0.g[0];
                    pgnVar2.b(null);
                    ikv0 ikv0Var = o7x0Var2.f;
                    if (ikv0Var != null) {
                        ikv0Var.a();
                    }
                    o7x0Var2.f = null;
                    if (!z) {
                        ih80.b(ahaVar.b, aha.m, new qm1(ahaVar, 14), 2);
                    }
                }
                ahaVar.k = bool.booleanValue();
                return s3q0.a;
            }
        });
        qcy<Object> qcyVar = l[0];
        this.f.b(h);
    }
}
