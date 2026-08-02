package com.yandex.go.scooters.super_passes.upsale_on_book;

import defpackage.abo0;
import defpackage.mvg;
import defpackage.n2p0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.super_passes.upsale_on_book.ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1", f = "ScootersSuperPassesUpsaleOnBookUiStateMapper.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ n2p0 $buttonsTexts;
    final /* synthetic */ boolean $isComeFromQr;
    Object L$0;
    int label;
    final /* synthetic */ abo0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1(boolean z, n2p0 n2p0Var, abo0 abo0Var, Continuation continuation) {
        super(2, continuation);
        this.$isComeFromQr = z;
        this.$buttonsTexts = n2p0Var;
        this.this$0 = abo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1(this.$isComeFromQr, this.$buttonsTexts, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesUpsaleOnBookUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        boolean z = this.$isComeFromQr;
        n2p0 n2p0Var = this.$buttonsTexts;
        FormattedText formattedText = z ? n2p0Var.d : n2p0Var.c;
        ru.yandex.taxi.widget.c cVar = this.this$0.b;
        this.L$0 = null;
        this.label = 1;
        Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
