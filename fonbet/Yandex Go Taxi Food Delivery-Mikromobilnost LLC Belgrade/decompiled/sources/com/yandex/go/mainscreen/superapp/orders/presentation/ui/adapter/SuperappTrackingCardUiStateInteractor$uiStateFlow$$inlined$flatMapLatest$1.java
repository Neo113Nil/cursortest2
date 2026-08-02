package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import defpackage.cxu0;
import defpackage.g92;
import defpackage.ha2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w201;
import defpackage.wn70;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.styling.g;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.SuperappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1", f = "SuperappTrackingCardUiStateInteractor.kt", l = {223, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class SuperappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ wn70 $style$inlined;
    final /* synthetic */ w201 $tracking$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(wn70 wn70Var, w201 w201Var, e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
        this.$tracking$inlined = w201Var;
        this.$style$inlined = wn70Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e eVar = this.this$0;
        w201 w201Var = this.$tracking$inlined;
        SuperappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 superappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1 = new SuperappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1(this.$style$inlined, w201Var, eVar, (Continuation) obj3);
        superappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        superappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return superappTrackingCardUiStateInteractor$uiStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00aa, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r14, r3, r13) == r2) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tpr rol0Var;
        vpr vprVar;
        boolean z;
        vpr vprVar2 = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean equals = ((g) this.this$0.h).a().c.equals("ultima");
            e eVar = this.this$0;
            w201 w201Var = this.$tracking$inlined;
            wn70 wn70Var = this.$style$inlined;
            ThemeType themeType = ((cxu0) obj2).a;
            eVar.getClass();
            rol0Var = new rol0(new SuperappTrackingCardUiStateInteractor$getHeaderStateFlow$1(w201Var, eVar, wn70Var, equals, null));
            e eVar2 = this.this$0;
            w201 w201Var2 = this.$tracking$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar2;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = rol0Var;
            this.Z$0 = equals;
            this.label = 1;
            obj = e.l(eVar2, w201Var2, equals, this);
            if (obj != coroutineSingletons) {
                vprVar = vprVar2;
                z = equals;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = this.Z$0;
        rol0Var = (tpr) this.L$5;
        vprVar = (vpr) this.L$2;
        kotlin.b.b(obj);
        g92 g92Var = new g92(2, Boolean.valueOf(z));
        e eVar3 = this.this$0;
        ha2 n = kotlinx.coroutines.flow.e.n(rol0Var, (tpr) obj, g92Var, new SuperappTrackingCardUiStateInteractor$uiStateFlow$1$1(this.$style$inlined, this.$tracking$inlined, eVar3, null));
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 2;
    }
}
