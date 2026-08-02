package com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui;

import defpackage.jx41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.WheelDatePickerKt$WheelDatePicker$5$1", f = "WheelDatePicker.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class WheelDatePickerKt$WheelDatePicker$5$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<jx41> $items;
    final /* synthetic */ tls $onItemSelected;
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ c $wheelState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WheelDatePickerKt$WheelDatePicker$5$1(c cVar, List list, int i, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$wheelState = cVar;
        this.$items = list;
        this.$selectedIndex = i;
        this.$onItemSelected = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WheelDatePickerKt$WheelDatePicker$5$1(this.$wheelState, this.$items, this.$selectedIndex, this.$onItemSelected, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WheelDatePickerKt$WheelDatePicker$5$1 wheelDatePickerKt$WheelDatePicker$5$1 = (WheelDatePickerKt$WheelDatePicker$5$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        wheelDatePickerKt$WheelDatePicker$5$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!this.$wheelState.c.j.a() && !((Boolean) this.$wheelState.f.getValue()).booleanValue() && (b = this.$wheelState.b(this.$items.size())) >= 0 && b < this.$items.size() && b != this.$selectedIndex) {
            this.$onItemSelected.invoke(new Integer(b));
        }
        return zy11.a;
    }
}
