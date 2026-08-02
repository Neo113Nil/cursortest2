package com.yandex.go.chargers.error;

import com.yandex.go.chargers.error.api.ChargersErrorCode;
import defpackage.avj0;
import defpackage.cy9;
import defpackage.dy9;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.error.ChargersErrorMapperImpl$mapToUiState$2$subtitleAsync$1", f = "ChargersErrorMapperImpl.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersErrorMapperImpl$mapToUiState$2$subtitleAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChargersErrorCode $chargersErrorCode;
    final /* synthetic */ cy9 $chargersErrorDetails;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersErrorMapperImpl$mapToUiState$2$subtitleAsync$1(a aVar, ChargersErrorCode chargersErrorCode, cy9 cy9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$chargersErrorCode = chargersErrorCode;
        this.$chargersErrorDetails = cy9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersErrorMapperImpl$mapToUiState$2$subtitleAsync$1(this.this$0, this.$chargersErrorCode, this.$chargersErrorDetails, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersErrorMapperImpl$mapToUiState$2$subtitleAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
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
        a aVar = this.this$0;
        ChargersErrorCode chargersErrorCode = this.$chargersErrorCode;
        FormattedText formattedText = this.$chargersErrorDetails.c;
        this.label = 1;
        aVar.getClass();
        if (formattedText.d()) {
            h = ru.yandex.taxi.widget.c.e(aVar.b, formattedText, null, false, this, 30);
        } else {
            int i2 = dy9.a[chargersErrorCode.ordinal()];
            zuj0 zuj0Var = aVar.a;
            h = i2 == 1 ? ((avj0) zuj0Var).h(kyh0.chargers_error_network_subtitle) : ((avj0) zuj0Var).h(kyh0.chargers_error_common_subtitle);
        }
        return h == coroutineSingletons ? coroutineSingletons : h;
    }
}
