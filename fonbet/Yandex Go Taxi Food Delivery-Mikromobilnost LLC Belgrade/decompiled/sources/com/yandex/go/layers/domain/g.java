package com.yandex.go.layers.domain;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.domain.LayersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$flatMapLatest$1;
import com.yandex.go.layers.domain.d;
import com.yandex.go.layers.domain.g;
import com.yandex.go.taxi.order.recenter.n;
import defpackage.ah00;
import defpackage.ffx;
import defpackage.gh00;
import defpackage.hst;
import defpackage.i3y;
import defpackage.iu8;
import defpackage.jl40;
import defpackage.jst;
import defpackage.nm00;
import defpackage.pm00;
import defpackage.pvn;
import defpackage.qoi0;
import defpackage.rol0;
import defpackage.scc;
import defpackage.sfu0;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tse;
import defpackage.uud0;
import defpackage.wjm;
import defpackage.ysd0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.common_models.net.map_object.d0;
import ru.yandex.taxi.common_models.net.map_object.f0;
import ru.yandex.taxi.common_models.net.map_object.g0;
import ru.yandex.taxi.common_models.net.map_object.h0;
import ru.yandex.taxi.common_models.net.map_object.j;
import ru.yandex.taxi.common_models.net.map_object.k0;
import ru.yandex.taxi.common_models.net.map_object.m;
import ru.yandex.taxi.common_models.net.map_object.o;
import ru.yandex.taxi.common_models.net.map_object.p;
import ru.yandex.taxi.common_models.net.map_object.p0;
import ru.yandex.taxi.common_models.net.map_object.q;
import ru.yandex.taxi.common_models.net.map_object.q0;
import ru.yandex.taxi.common_models.net.map_object.r;
import ru.yandex.taxi.common_models.net.map_object.r0;
import ru.yandex.taxi.common_models.net.map_object.s;
import ru.yandex.taxi.common_models.net.map_object.t;
import ru.yandex.taxi.common_models.net.map_object.t0;
import ru.yandex.taxi.common_models.net.map_object.u;
import ru.yandex.taxi.common_models.net.map_object.v;
import ru.yandex.taxi.common_models.net.map_object.w;
import ru.yandex.taxi.common_models.net.map_object.w0;
import ru.yandex.taxi.common_models.net.map_object.x;
import ru.yandex.taxi.common_models.net.map_object.y;
import ru.yandex.taxi.common_models.net.map_object.z;

/* loaded from: classes.dex */
public final class g {
    public final tse a;
    public final ysd0 b;
    public final a c;
    public final iu8 d;
    public final n e;
    public final ah00 f;
    public final i3y j;
    public final i3y k;
    public final Pair g = new Pair(null, null);
    public final n0 h = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final i3y i = kotlin.a.a(new sls() { // from class: com.yandex.go.layers.domain.b
        @Override // defpackage.sls
        public final Object invoke() {
            g gVar = g.this;
            return kotlinx.coroutines.flow.e.X(new j0(gVar.g, new f(gVar.h, gVar), new LayersActionsInteractorImpl$switchStateChangeListener$2$2(3, null)), new LayersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$flatMapLatest$1(null, gVar));
        }
    });
    public final List l = scc.g(qoi0.a(w0.class), qoi0.a(y.class));

    public g(tse tseVar, ysd0 ysd0Var, a aVar, iu8 iu8Var, n nVar, ah00 ah00Var) {
        this.a = tseVar;
        this.b = ysd0Var;
        this.c = aVar;
        this.d = iu8Var;
        this.e = nVar;
        this.f = ah00Var;
        final int i = 0;
        final int i2 = 1;
        this.j = kotlin.a.a(new sls(this) { // from class: rxx
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        return e.X(new d(gVar.h, gVar), new LayersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$flatMapLatest$1(null, gVar));
                    default:
                        return e.O(e.K((tpr[]) Arrays.copyOf(new tpr[]{(tpr) gVar.i.getValue(), (tpr) gVar.j.getValue()}, 2)), gVar.a, wsr0.a(xsr0.a, 3), 0);
                }
            }
        });
        this.k = kotlin.a.a(new sls(this) { // from class: rxx
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                g gVar = this.b;
                switch (i3) {
                    case 0:
                        return e.X(new d(gVar.h, gVar), new LayersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$flatMapLatest$1(null, gVar));
                    default:
                        return e.O(e.K((tpr[]) Arrays.copyOf(new tpr[]{(tpr) gVar.i.getValue(), (tpr) gVar.j.getValue()}, 2)), gVar.a, wsr0.a(xsr0.a, 3), 0);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [rol0] */
    /* JADX WARN: Type inference failed for: r1v16, types: [rol0] */
    /* JADX WARN: Type inference failed for: r1v17, types: [rol0] */
    /* JADX WARN: Type inference failed for: r1v19, types: [rol0] */
    /* JADX WARN: Type inference failed for: r1v21, types: [rol0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [rol0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [rol0] */
    /* JADX WARN: Type inference failed for: r2v24, types: [rol0] */
    /* JADX WARN: Type inference failed for: r2v26, types: [rol0] */
    /* JADX WARN: Type inference failed for: r2v28, types: [rol0] */
    /* JADX WARN: Type inference failed for: r2v30, types: [rol0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [rol0] */
    /* JADX WARN: Type inference failed for: r3v10, types: [rol0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [rol0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [rol0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [rol0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [rol0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [rol0] */
    public static final ArrayList a(g gVar, nm00 nm00Var, nm00 nm00Var2, uud0 uud0Var) {
        pvn pvnVar;
        pvn pvnVar2;
        pvn pvnVar3;
        g gVar2 = gVar;
        nm00 nm00Var3 = nm00Var;
        nm00 nm00Var4 = nm00Var2;
        gVar2.getClass();
        List<z> a = uud0Var.getA();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        for (z zVar : a) {
            String a2 = nm00Var4.d.a();
            pvn pvnVar4 = pvn.a;
            if (zVar != null) {
                if (zVar instanceof sfu0) {
                    pvnVar3 = new rol0(new LayersActionsInteractorImpl$handleAction$1(nm00Var3, null));
                } else {
                    pm00 pm00Var = new pm00(nm00Var4.b, nm00Var4.a, a2, zVar, nm00Var4.e, nm00Var4.f, nm00Var4.d, nm00Var4.g, nm00Var4.h);
                    if (zVar instanceof d0) {
                        pvnVar3 = new rol0(new LayersActionsInteractorImpl$handleAction$2(nm00Var3, pm00Var, gVar2, null));
                    } else {
                        if ((zVar instanceof q) || (zVar instanceof r)) {
                            pvnVar = new rol0(new LayersActionsInteractorImpl$handleAction$3(nm00Var3, nm00Var2, pm00Var, gVar2, null));
                        } else if (zVar instanceof q0) {
                            pvnVar3 = new rol0(new LayersActionsInteractorImpl$handleAction$4(nm00Var3, pm00Var, gVar2, null));
                        } else if (zVar instanceof o) {
                            pvnVar3 = new rol0(new LayersActionsInteractorImpl$handleAction$5(nm00Var4, pm00Var, gVar2, null));
                        } else {
                            if ((zVar instanceof r0) || (zVar instanceof p) || (zVar instanceof ru.yandex.taxi.common_models.net.map_object.n)) {
                                pvnVar2 = new rol0(new LayersActionsInteractorImpl$handleAction$6(nm00Var3, pm00Var, gVar2, null));
                            } else if (zVar instanceof j) {
                                pvnVar3 = jl40.l(((j) zVar).b, Mode.DELIVERY_INTERCITY.getSerializedName()) ? new rol0(new LayersActionsInteractorImpl$handleAction$7(gVar2, zVar, nm00Var3, null)) : new rol0(new LayersActionsInteractorImpl$handleAction$8(nm00Var3, pm00Var, gVar2, null));
                            } else if (zVar instanceof t) {
                                pvnVar = new rol0(new LayersActionsInteractorImpl$handleAction$9(nm00Var3, nm00Var4, pm00Var, gVar2, null));
                            } else if (zVar instanceof ru.yandex.taxi.common_models.net.map_object.j0) {
                                pvnVar2 = new rol0(new LayersActionsInteractorImpl$handleAction$10(nm00Var, nm00Var2, pm00Var, gVar, null));
                            } else if (zVar instanceof p0) {
                                pvnVar2 = new rol0(new LayersActionsInteractorImpl$handleAction$11(nm00Var, pm00Var, gVar, null));
                            } else if (zVar instanceof s) {
                                pvnVar = new rol0(new LayersActionsInteractorImpl$handleAction$12(nm00Var, nm00Var2, pm00Var, gVar, null));
                            } else if (zVar instanceof t0) {
                                pvnVar2 = new rol0(new LayersActionsInteractorImpl$handleAction$13(nm00Var, nm00Var2, pm00Var, gVar, null));
                            } else if (zVar instanceof u) {
                                wjm i = ((gh00) gVar.f).i();
                                gVar.e.a(scc.g(i.r(), i.i()));
                                pvnVar2 = new rol0(new LayersActionsInteractorImpl$handleAction$14(nm00Var, pm00Var, gVar, null));
                            } else if ((zVar instanceof k0) || (zVar instanceof x) || (zVar instanceof v) || (zVar instanceof f0) || (zVar instanceof g0) || (zVar instanceof y) || (zVar instanceof ru.yandex.taxi.common_models.net.map_object.n0) || (zVar instanceof m)) {
                                pvnVar2 = new rol0(new LayersActionsInteractorImpl$handleAction$15(nm00Var, nm00Var2, pm00Var, gVar, null));
                            } else if (zVar instanceof w) {
                                pvnVar = new rol0(new LayersActionsInteractorImpl$handleAction$16(nm00Var, nm00Var2, pm00Var, gVar, null));
                            } else if (zVar instanceof w0) {
                                pvnVar = new rol0(new LayersActionsInteractorImpl$handleAction$17(nm00Var, nm00Var2, pm00Var, gVar, null));
                            } else if (zVar instanceof h0) {
                                pvnVar = new rol0(new LayersActionsInteractorImpl$handleAction$18(nm00Var, nm00Var2, pm00Var, gVar, null));
                            } else {
                                hst hstVar = jst.e;
                                zVar.toString();
                                hstVar.getClass();
                            }
                            pvnVar4 = pvnVar2;
                        }
                        pvnVar4 = pvnVar;
                    }
                }
                pvnVar4 = pvnVar3;
            }
            arrayList.add(pvnVar4);
            gVar2 = gVar;
            nm00Var3 = nm00Var;
            nm00Var4 = nm00Var2;
        }
        return arrayList;
    }

    public static final boolean b(g gVar, nm00 nm00Var) {
        List a;
        z zVar;
        uud0 uud0Var = (uud0) kotlin.collections.a.R(nm00Var.c);
        return uud0Var != null && (a = uud0Var.getA()) != null && (zVar = (z) kotlin.collections.a.R(a)) != null && nm00Var.c.size() == 1 && a.size() == 1 && gVar.l.contains(qoi0.a(zVar.getClass()));
    }

    public final void c(nm00 nm00Var) {
        this.h.g(nm00Var);
    }
}
