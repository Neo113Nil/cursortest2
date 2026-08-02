package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.bms;
import defpackage.ck11;
import defpackage.f22;
import defpackage.gxg;
import defpackage.jl40;
import defpackage.lah;
import defpackage.lxv;
import defpackage.n62;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.o62;
import defpackage.oz40;
import defpackage.qxi;
import defpackage.sls;
import defpackage.tls;
import defpackage.tx40;
import defpackage.y6i0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class e {
    public final tls a;
    public tls b;
    public sls c;
    public ck11 d;
    public gxg e;
    public final oz40 g;
    public final oz40 h;
    public final tx40 k;
    public final oz40 l;
    public final oz40 m;
    public final o62 n;
    public final androidx.compose.foundation.j f = new androidx.compose.foundation.j();
    public final qxi i = androidx.compose.runtime.f.d(new n62(this, 0));
    public final tx40 j = androidx.compose.runtime.f.f(Float.NaN);

    public e(tls tlsVar, Object obj) {
        this.a = new f22(5);
        this.g = androidx.compose.runtime.f.j(obj);
        this.h = androidx.compose.runtime.f.j(obj);
        androidx.compose.runtime.f.e(new n62(this, 1), ngd0.F);
        this.k = androidx.compose.runtime.f.f(0.0f);
        this.l = androidx.compose.runtime.f.j(null);
        this.m = androidx.compose.runtime.f.j(new lah(EmptyList.a, new float[0]));
        this.n = new o62(this);
        this.a = tlsVar;
    }

    public static Object b(e eVar, zls zlsVar, ContinuationImpl continuationImpl) {
        Object b = eVar.f.b(MutatePriority.Default, new AnchoredDraggableState$anchoredDrag$2(zlsVar, eVar, null), continuationImpl);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }

    public static void l(e eVar, lah lahVar) {
        Object value;
        tx40 tx40Var = eVar.j;
        qxi qxiVar = eVar.i;
        if (Float.isNaN(tx40Var.getFloatValue())) {
            value = qxiVar.getValue();
        } else {
            value = lahVar.a(eVar.j.getFloatValue());
            if (value == null) {
                value = qxiVar.getValue();
            }
        }
        eVar.k(lahVar, value);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, MutatePriority mutatePriority, bms bmsVar, ContinuationImpl continuationImpl) {
        AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        int i;
        oz40 oz40Var;
        try {
            if (continuationImpl instanceof AnchoredDraggableState$anchoredDrag$3) {
                anchoredDraggableState$anchoredDrag$3 = (AnchoredDraggableState$anchoredDrag$3) continuationImpl;
                int i2 = anchoredDraggableState$anchoredDrag$3.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableState$anchoredDrag$3.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = anchoredDraggableState$anchoredDrag$3.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anchoredDraggableState$anchoredDrag$3.label;
                    oz40Var = this.l;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        if (!d().c(obj)) {
                            if (((Boolean) this.a.invoke(obj)).booleanValue()) {
                                this.h.setValue(obj);
                                h(obj);
                            }
                            return zy11.a;
                        }
                        androidx.compose.foundation.j jVar = this.f;
                        AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new AnchoredDraggableState$anchoredDrag$4(this, obj, bmsVar, null);
                        anchoredDraggableState$anchoredDrag$3.label = 1;
                        if (jVar.b(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } finally {
            oz40Var.setValue(null);
        }
        anchoredDraggableState$anchoredDrag$3 = new AnchoredDraggableState$anchoredDrag$3(this, continuationImpl);
        Object obj22 = anchoredDraggableState$anchoredDrag$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableState$anchoredDrag$3.label;
        oz40Var = this.l;
    }

    public final float c(float f) {
        float f2 = f(f);
        float g = f2 - g();
        this.n.a(f2, 0.0f);
        return g;
    }

    public final lah d() {
        return (lah) this.m.getValue();
    }

    public final boolean e() {
        return (this.b == null || this.c == null || this.d == null || this.e == null) ? false : true;
    }

    public final float f(float f) {
        tx40 tx40Var = this.j;
        return y6i0.c((Float.isNaN(tx40Var.getFloatValue()) ? 0.0f : tx40Var.getFloatValue()) + f, d().e(), d().d());
    }

    public final float g() {
        tx40 tx40Var = this.j;
        if (Float.isNaN(tx40Var.getFloatValue())) {
            lxv.c("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return tx40Var.getFloatValue();
    }

    public final void h(Object obj) {
        this.g.setValue(obj);
    }

    public final Object i(float f, ContinuationImpl continuationImpl) {
        if (!e()) {
            lxv.a("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        Object value = this.g.getValue();
        lah d = d();
        float g = g();
        tls tlsVar = this.b;
        if (tlsVar == null) {
            tlsVar = null;
        }
        sls slsVar = this.c;
        Object b = c.b(d, g, f, tlsVar, slsVar != null ? slsVar : null);
        return ((Boolean) this.a.invoke(b)).booleanValue() ? c.j(this, b, f, continuationImpl) : c.j(this, value, f, continuationImpl);
    }

    public final boolean j(Object obj) {
        androidx.compose.foundation.j jVar = this.f;
        kotlinx.coroutines.sync.a aVar = jVar.b;
        kotlinx.coroutines.sync.a aVar2 = jVar.b;
        boolean h = aVar.h();
        if (!h) {
            return h;
        }
        try {
            o62 o62Var = this.n;
            float f = d().f(obj);
            if (!Float.isNaN(f)) {
                o62Var.a(f, 0.0f);
                this.l.setValue(null);
            }
            h(obj);
            this.h.setValue(obj);
            aVar2.d(null);
            return h;
        } catch (Throwable th) {
            aVar2.d(null);
            throw th;
        }
    }

    public final void k(lah lahVar, Object obj) {
        if (jl40.l(d(), lahVar)) {
            return;
        }
        this.m.setValue(lahVar);
        if (j(obj)) {
            return;
        }
        this.l.setValue(obj);
    }
}
