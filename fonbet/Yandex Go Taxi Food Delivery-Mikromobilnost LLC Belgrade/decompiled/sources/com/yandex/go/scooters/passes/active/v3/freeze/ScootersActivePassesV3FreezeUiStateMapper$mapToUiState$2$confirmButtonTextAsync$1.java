package com.yandex.go.scooters.passes.active.v3.freeze;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xum0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.freeze.ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1", f = "ScootersActivePassesV3FreezeUiStateMapper.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ xum0 $freezeInfo;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1(d dVar, xum0 xum0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$freezeInfo = xum0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1(this.this$0, this.$freezeInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActivePassesV3FreezeUiStateMapper$mapToUiState$2$confirmButtonTextAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.widget.c cVar = this.this$0.a;
        FormattedText formattedText = this.$freezeInfo.f;
        this.label = 1;
        Object e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
        return e == coroutineSingletons ? coroutineSingletons : e;
    }
}
