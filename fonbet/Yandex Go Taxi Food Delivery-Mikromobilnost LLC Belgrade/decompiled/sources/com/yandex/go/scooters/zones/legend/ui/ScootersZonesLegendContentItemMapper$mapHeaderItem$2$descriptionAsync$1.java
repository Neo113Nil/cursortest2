package com.yandex.go.scooters.zones.legend.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tap0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.zones.legend.ui.ScootersZonesLegendContentItemMapper$mapHeaderItem$2$descriptionAsync$1", f = "ScootersZonesLegendContentItemMapper.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersZonesLegendContentItemMapper$mapHeaderItem$2$descriptionAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ tap0 $scootersZonesLegendScreen;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersZonesLegendContentItemMapper$mapHeaderItem$2$descriptionAsync$1(tap0 tap0Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$scootersZonesLegendScreen = tap0Var;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersZonesLegendContentItemMapper$mapHeaderItem$2$descriptionAsync$1(this.$scootersZonesLegendScreen, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersZonesLegendContentItemMapper$mapHeaderItem$2$descriptionAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            FormattedText formattedText = this.$scootersZonesLegendScreen.b;
            if (formattedText == null) {
                return "";
            }
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.a;
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
        CharSequence charSequence = (CharSequence) obj;
        return charSequence != null ? charSequence : "";
    }
}
