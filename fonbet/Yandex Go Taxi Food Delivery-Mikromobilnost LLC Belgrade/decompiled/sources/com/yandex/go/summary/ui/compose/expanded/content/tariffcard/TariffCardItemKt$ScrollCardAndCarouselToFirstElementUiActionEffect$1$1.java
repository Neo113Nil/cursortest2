package com.yandex.go.summary.ui.compose.expanded.content.tariffcard;

import defpackage.jl40;
import defpackage.lz40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ob5;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.ui.compose.expanded.content.tariffcard.TariffCardItemKt$ScrollCardAndCarouselToFirstElementUiActionEffect$1$1", f = "TariffCardItem.kt", l = {371, 372}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffCardItemKt$ScrollCardAndCarouselToFirstElementUiActionEffect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ob5 $baseTariffInfoUiStateAnimated;
    final /* synthetic */ ob5 $baseTariffInfoUiStateCompleted;
    final /* synthetic */ lz40 $carouselComposeActionFlow;
    final /* synthetic */ androidx.compose.foundation.lazy.b $tariffCardLazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardItemKt$ScrollCardAndCarouselToFirstElementUiActionEffect$1$1(ob5 ob5Var, ob5 ob5Var2, androidx.compose.foundation.lazy.b bVar, lz40 lz40Var, Continuation continuation) {
        super(2, continuation);
        this.$baseTariffInfoUiStateAnimated = ob5Var;
        this.$baseTariffInfoUiStateCompleted = ob5Var2;
        this.$tariffCardLazyListState = bVar;
        this.$carouselComposeActionFlow = lz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffCardItemKt$ScrollCardAndCarouselToFirstElementUiActionEffect$1$1(this.$baseTariffInfoUiStateAnimated, this.$baseTariffInfoUiStateCompleted, this.$tariffCardLazyListState, this.$carouselComposeActionFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffCardItemKt$ScrollCardAndCarouselToFirstElementUiActionEffect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r5.emit(defpackage.jx8.a, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (com.yandex.go.summary.ui.compose.common.animation.c.i(r5, 0, 0, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!jl40.l(this.$baseTariffInfoUiStateAnimated, this.$baseTariffInfoUiStateCompleted)) {
                androidx.compose.foundation.lazy.b bVar = this.$tariffCardLazyListState;
                this.label = 1;
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        lz40 lz40Var = this.$carouselComposeActionFlow;
        this.label = 2;
    }
}
