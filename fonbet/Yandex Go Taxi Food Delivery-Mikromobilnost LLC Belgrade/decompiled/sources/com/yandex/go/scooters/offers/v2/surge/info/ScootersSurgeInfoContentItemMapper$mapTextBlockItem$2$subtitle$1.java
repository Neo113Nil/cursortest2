package com.yandex.go.scooters.offers.v2.surge.info;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w2p0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.info.ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2$subtitle$1", f = "ScootersSurgeInfoContentItemMapper.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2$subtitle$1 extends SuspendLambda implements wls {
    final /* synthetic */ w2p0 $item;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2$subtitle$1(w2p0 w2p0Var, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$item = w2p0Var;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2$subtitle$1(this.$item, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersSurgeInfoContentItemMapper$mapTextBlockItem$2$subtitle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            FormattedText formattedText = this.$item.c;
            if (formattedText == null) {
                return null;
            }
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.b;
            this.L$0 = null;
            this.label = 1;
            obj = eVar.t(formattedText, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return (CharSequence) obj;
    }
}
