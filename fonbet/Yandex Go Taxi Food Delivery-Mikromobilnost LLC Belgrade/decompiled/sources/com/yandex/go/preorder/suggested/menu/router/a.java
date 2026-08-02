package com.yandex.go.preorder.suggested.menu.router;

import android.content.Context;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.pin.api.v2.PinV2Component;
import com.yandex.go.preorder.suggested.menu.experiment.g;
import com.yandex.go.preorder.suggested.menu.presenter.b;
import com.yandex.go.preorder.suggested.menu.ui.SuggestMenuModalView;
import com.yandex.go.preorder.suggested.menu.ui.c;
import defpackage.c6v0;
import defpackage.e8b0;
import defpackage.hwo0;
import defpackage.ip11;
import defpackage.lx4;
import defpackage.m950;
import defpackage.mc;
import defpackage.n1d;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.oep0;
import defpackage.pav;
import defpackage.q6v0;
import defpackage.qmp;
import defpackage.t6v0;
import defpackage.tig0;
import defpackage.tt2;
import defpackage.v6v0;
import defpackage.vd;
import defpackage.w030;
import defpackage.xvf0;
import defpackage.z0s0;
import defpackage.z6v0;
import defpackage.ze0;
import defpackage.zxs0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes13.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a implements m950 {
    public final w030 F;
    public final q6v0 G;
    public final z6v0 H;
    public final oep0 I;
    public final c6v0 J;
    public final vd K;
    public final c L;
    public final ze0 M;
    public final boolean N;

    public a(w030 w030Var, q6v0 q6v0Var, z6v0 z6v0Var, oep0 oep0Var, c6v0 c6v0Var, vd vdVar, c cVar, ze0 ze0Var) {
        super(null);
        this.F = w030Var;
        this.G = q6v0Var;
        this.H = z6v0Var;
        this.I = oep0Var;
        this.J = c6v0Var;
        this.K = vdVar;
        this.L = cVar;
        this.M = ze0Var;
        this.N = true;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ((t6v0) ((v6v0) obj).c.a).a(PlainAddress.a);
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.N;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(v6v0 v6v0Var, ContinuationImpl continuationImpl) {
        SuggestMenuRouterImpl$provideModalView$1 suggestMenuRouterImpl$provideModalView$1;
        int i;
        b bVar;
        q6v0 q6v0Var;
        if (continuationImpl instanceof SuggestMenuRouterImpl$provideModalView$1) {
            suggestMenuRouterImpl$provideModalView$1 = (SuggestMenuRouterImpl$provideModalView$1) continuationImpl;
            int i2 = suggestMenuRouterImpl$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuRouterImpl$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                SuggestMenuRouterImpl$provideModalView$1 suggestMenuRouterImpl$provideModalView$12 = suggestMenuRouterImpl$provideModalView$1;
                Object obj = suggestMenuRouterImpl$provideModalView$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuRouterImpl$provideModalView$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zxs0 zxs0Var = new zxs0();
                    zxs0Var.b = this;
                    zxs0Var.a = v6v0Var;
                    EntryPoint entryPoint = v6v0Var.e;
                    tig0 tig0Var = this.J.a;
                    hwo0 hwo0Var = new hwo0(entryPoint, (lx4) ((xvf0) tig0Var.a).get(), (o7r0) ((z0s0) tig0Var.b).get());
                    n1d n1dVar = this.H.a;
                    b bVar2 = new b(zxs0Var, v6v0Var, hwo0Var, (Context) ((xvf0) n1dVar.a).get(), (ru.yandex.taxi.map_common.image.a) ((e8b0) n1dVar.b).get(), (pav) ((xvf0) n1dVar.c).get(), (g) ((xvf0) n1dVar.d).get(), (tt2) ((xvf0) n1dVar.e).get(), (com.yandex.go.mainscreen.superapp.impl.foundation.domain.g) ((xvf0) n1dVar.f).get(), (qmp) ((xvf0) n1dVar.g).get());
                    PointType pointType = v6v0Var.b;
                    suggestMenuRouterImpl$provideModalView$12.L$0 = null;
                    q6v0 q6v0Var2 = this.G;
                    suggestMenuRouterImpl$provideModalView$12.L$1 = q6v0Var2;
                    suggestMenuRouterImpl$provideModalView$12.L$2 = bVar2;
                    suggestMenuRouterImpl$provideModalView$12.label = 1;
                    Object a = this.L.a(pointType, suggestMenuRouterImpl$provideModalView$12);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    bVar = bVar2;
                    q6v0Var = q6v0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = (b) suggestMenuRouterImpl$provideModalView$12.L$2;
                    q6v0Var = (q6v0) suggestMenuRouterImpl$provideModalView$12.L$1;
                    kotlin.b.b(obj);
                }
                mc mcVar = q6v0Var.a;
                return new SuggestMenuModalView((Context) mcVar.a.get(), (ip11) mcVar.b.get(), (PinV2Component) obj, bVar);
            }
        }
        suggestMenuRouterImpl$provideModalView$1 = new SuggestMenuRouterImpl$provideModalView$1(this, continuationImpl);
        SuggestMenuRouterImpl$provideModalView$1 suggestMenuRouterImpl$provideModalView$122 = suggestMenuRouterImpl$provideModalView$1;
        Object obj2 = suggestMenuRouterImpl$provideModalView$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuRouterImpl$provideModalView$122.label;
        if (i != 0) {
        }
        mc mcVar2 = q6v0Var.a;
        return new SuggestMenuModalView((Context) mcVar2.a.get(), (ip11) mcVar2.b.get(), (PinV2Component) obj2, bVar);
    }
}
