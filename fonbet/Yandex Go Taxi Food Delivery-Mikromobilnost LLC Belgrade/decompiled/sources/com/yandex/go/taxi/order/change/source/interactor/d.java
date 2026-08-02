package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.taxi.order.change.source.interactor.d;
import defpackage.ag9;
import defpackage.bc9;
import defpackage.bg9;
import defpackage.cc9;
import defpackage.d0y0;
import defpackage.dc9;
import defpackage.f28;
import defpackage.fc9;
import defpackage.gtq0;
import defpackage.h55;
import defpackage.hc9;
import defpackage.hxx;
import defpackage.l3e;
import defpackage.m950;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.sls;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class d {
    public final oep0 a;
    public final b b;
    public final hc9 c;
    public final l3e d;
    public Pair e;

    public d(oep0 oep0Var, b bVar, hc9 hc9Var, l3e l3eVar) {
        this.a = oep0Var;
        this.b = bVar;
        this.c = hc9Var;
        this.d = l3eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d0y0 d0y0Var, o2y0 o2y0Var, wls wlsVar, sls slsVar, ContinuationImpl continuationImpl) {
        ChangeSourcePointNavigator$changeSourceAddress$1 changeSourcePointNavigator$changeSourceAddress$1;
        int i;
        dc9 dc9Var;
        if (continuationImpl instanceof ChangeSourcePointNavigator$changeSourceAddress$1) {
            changeSourcePointNavigator$changeSourceAddress$1 = (ChangeSourcePointNavigator$changeSourceAddress$1) continuationImpl;
            int i2 = changeSourcePointNavigator$changeSourceAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointNavigator$changeSourceAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeSourcePointNavigator$changeSourceAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointNavigator$changeSourceAddress$1.label;
                final int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    changeSourcePointNavigator$changeSourceAddress$1.L$0 = null;
                    changeSourcePointNavigator$changeSourceAddress$1.L$1 = null;
                    changeSourcePointNavigator$changeSourceAddress$1.L$2 = wlsVar;
                    changeSourcePointNavigator$changeSourceAddress$1.L$3 = slsVar;
                    changeSourcePointNavigator$changeSourceAddress$1.label = 1;
                    obj = this.b.a(o2y0Var, d0y0Var, changeSourcePointNavigator$changeSourceAddress$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slsVar = (sls) changeSourcePointNavigator$changeSourceAddress$1.L$3;
                    wlsVar = (wls) changeSourcePointNavigator$changeSourceAddress$1.L$2;
                    kotlin.b.b(obj);
                }
                dc9Var = (dc9) obj;
                zy11 zy11Var = zy11.a;
                if (dc9Var != null) {
                    Pair pair = this.e;
                    if (pair != null) {
                        dc9 dc9Var2 = (dc9) pair.getFirst();
                        m950 m950Var = (m950) pair.getSecond();
                        if (gtq0.u(m950Var)) {
                            if (!dc9Var.equals(dc9Var2)) {
                                ((h55) m950Var).i();
                            }
                        }
                    }
                    boolean z = dc9Var instanceof cc9;
                    final int i4 = 0;
                    oep0 oep0Var = this.a;
                    if (z) {
                        f28 f28Var = (f28) this.d.get();
                        ru.yandex.taxi.lifecycle.c.a(f28Var.getLifecycle(), new Runnable(this) { // from class: zf9
                            public final /* synthetic */ d b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i5 = i4;
                                d dVar = this.b;
                                switch (i5) {
                                    case 0:
                                        dVar.e = null;
                                        break;
                                    default:
                                        dVar.e = null;
                                        break;
                                }
                            }
                        });
                        this.e = new Pair(dc9Var, f28Var);
                        ((pep0) oep0Var).f(f28Var, dc9Var, hxx.a);
                        return zy11Var;
                    }
                    if (!(dc9Var instanceof bc9)) {
                        w511.b();
                        return null;
                    }
                    fc9 fc9Var = new fc9((com.yandex.go.mainscreen.superapp.impl.fragment.a) this.c.a.a.get(), new bg9(wlsVar), new ag9(slsVar), 0);
                    ru.yandex.taxi.lifecycle.c.a(fc9Var.getLifecycle(), new Runnable(this) { // from class: zf9
                        public final /* synthetic */ d b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i5 = i3;
                            d dVar = this.b;
                            switch (i5) {
                                case 0:
                                    dVar.e = null;
                                    break;
                                default:
                                    dVar.e = null;
                                    break;
                            }
                        }
                    });
                    this.e = new Pair(dc9Var, fc9Var);
                    ((pep0) oep0Var).f(fc9Var, dc9Var, hxx.a);
                    return zy11Var;
                }
                return zy11Var;
            }
        }
        changeSourcePointNavigator$changeSourceAddress$1 = new ChangeSourcePointNavigator$changeSourceAddress$1(this, continuationImpl);
        Object obj2 = changeSourcePointNavigator$changeSourceAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointNavigator$changeSourceAddress$1.label;
        final int i32 = 1;
        if (i != 0) {
        }
        dc9Var = (dc9) obj2;
        zy11 zy11Var2 = zy11.a;
        if (dc9Var != null) {
        }
        return zy11Var2;
    }
}
