package com.yandex.go.summary.ui.compose.expanded.content.tariffcard;

import androidx.compose.runtime.f;
import defpackage.gr5;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.t24;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.expanded.content.tariffcard.TariffCardItemKt$SendLastItemVisibleChangedUiActionEffect$1$1", f = "TariffCardItem.kt", l = {629}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffCardItemKt$SendLastItemVisibleChangedUiActionEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $handleTariffCardUiAction;
    final /* synthetic */ m3u0 $isLastItemFullyVisibleState;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardItemKt$SendLastItemVisibleChangedUiActionEffect$1$1(tls tlsVar, m3u0 m3u0Var, Continuation continuation) {
        super(2, continuation);
        this.$isLastItemFullyVisibleState = m3u0Var;
        this.$handleTariffCardUiAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffCardItemKt$SendLastItemVisibleChangedUiActionEffect$1$1(this.$handleTariffCardUiAction, this.$isLastItemFullyVisibleState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffCardItemKt$SendLastItemVisibleChangedUiActionEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = f.o(new gr5(this.$isLastItemFullyVisibleState, 17));
            tls tlsVar = this.$handleTariffCardUiAction;
            o oVar = new o(o, new TariffCardItemKt$SendLastItemVisibleChangedUiActionEffect$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            t24 t24Var = new t24(20, tlsVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(t24Var, this) == coroutineSingletons) {
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
