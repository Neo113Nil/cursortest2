package com.yandex.go.scooters.passes.data.mapper;

import defpackage.b0g0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.data.mapper.ScootersPassPurchaseMapper$mapIconStatus$2$expirationStatus$1", f = "ScootersPassPurchaseMapper.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassPurchaseMapper$mapIconStatus$2$expirationStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ b0g0 $info;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassPurchaseMapper$mapIconStatus$2$expirationStatus$1(b0g0 b0g0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$info = b0g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassPurchaseMapper$mapIconStatus$2$expirationStatus$1(this.$info, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassPurchaseMapper$mapIconStatus$2$expirationStatus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        e eVar = this.this$0.a;
        FormattedText formattedText = this.$info.b;
        this.label = 1;
        Object x = eVar.x(formattedText, this);
        return x == coroutineSingletons ? coroutineSingletons : x;
    }
}
