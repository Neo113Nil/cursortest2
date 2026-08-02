package com.yandex.go.scooters.offers.v2.surge.info;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y2p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.info.ScootersSurgeInfoContentItemMapper$mapHeaderItem$2$title$1", f = "ScootersSurgeInfoContentItemMapper.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSurgeInfoContentItemMapper$mapHeaderItem$2$title$1 extends SuspendLambda implements wls {
    final /* synthetic */ y2p0 $scootersSurge;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSurgeInfoContentItemMapper$mapHeaderItem$2$title$1(e eVar, y2p0 y2p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$scootersSurge = y2p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSurgeInfoContentItemMapper$mapHeaderItem$2$title$1(this.this$0, this.$scootersSurge, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSurgeInfoContentItemMapper$mapHeaderItem$2$title$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        ru.yandex.taxi.widget.utils.e eVar = this.this$0.b;
        FormattedText formattedText = (FormattedText) this.$scootersSurge.g.c;
        this.label = 1;
        Object t = eVar.t(formattedText, this);
        return t == coroutineSingletons ? coroutineSingletons : t;
    }
}
