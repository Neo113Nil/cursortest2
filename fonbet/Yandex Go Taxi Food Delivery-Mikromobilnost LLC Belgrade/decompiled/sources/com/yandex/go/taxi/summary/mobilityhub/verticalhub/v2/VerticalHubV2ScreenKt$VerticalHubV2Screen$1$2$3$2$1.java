package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2;

import defpackage.ed31;
import defpackage.fe31;
import defpackage.ms40;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wg6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$2$1", f = "VerticalHubV2Screen.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ tls $onAnchoredHeightChanged;
    final /* synthetic */ wg6 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$2$1(tls tlsVar, wg6 wg6Var, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.$action = tlsVar;
        this.$state = wg6Var;
        this.$onAnchoredHeightChanged = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$2$1(this.$action, this.$state, this.$onAnchoredHeightChanged, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VerticalHubV2ScreenKt$VerticalHubV2Screen$1$2$3$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.$action.invoke(fe31.a);
            tpr t = kotlinx.coroutines.flow.e.t(new mth(androidx.compose.runtime.f.o(new ed31(this.$state, 0)), 6));
            ms40 ms40Var = new ms40(4, this.$state, this.$onAnchoredHeightChanged);
            this.label = 1;
            if (t.collect(ms40Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
