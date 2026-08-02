package com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui;

import defpackage.jx41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.WheelDatePickerKt$WheelDatePicker$4$1", f = "WheelDatePicker.kt", l = {100}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class WheelDatePickerKt$WheelDatePicker$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<jx41> $items;
    final /* synthetic */ int $selectedIndex;
    final /* synthetic */ c $wheelState;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WheelDatePickerKt$WheelDatePicker$4$1(List list, int i, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$items = list;
        this.$selectedIndex = i;
        this.$wheelState = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WheelDatePickerKt$WheelDatePicker$4$1(this.$items, this.$selectedIndex, this.$wheelState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WheelDatePickerKt$WheelDatePicker$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0107 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int b;
        int i2;
        Object obj2;
        Pair pair;
        int intValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        zy11 zy11Var = zy11.a;
        if (i3 != 0) {
            if (i3 == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!this.$items.isEmpty() && (i = this.$selectedIndex) >= 0 && i < this.$items.size() && (i2 = this.$selectedIndex) != (b = this.$wheelState.b(this.$items.size()))) {
            c cVar = this.$wheelState;
            int size = this.$items.size();
            this.I$0 = b;
            this.label = 1;
            if (i2 >= 0) {
                if (cVar.a) {
                    int intValue2 = ((Number) cVar.e.getValue()).intValue() + 1073741823;
                    int b2 = cVar.b(size);
                    if (b2 != i2) {
                        if (size <= 0) {
                            pair = new Pair(0, 0);
                        } else {
                            int i4 = ((b2 % size) + size) % size;
                            int i5 = ((i2 % size) + size) % size;
                            if (i4 == i5) {
                                pair = new Pair(0, 0);
                            } else {
                                int i6 = ((i5 - i4) + size) % size;
                                int i7 = i6 - size;
                                pair = i6 <= (-i7) ? new Pair(Integer.valueOf(i6), Integer.valueOf(i7)) : new Pair(Integer.valueOf(i7), Integer.valueOf(i6));
                            }
                        }
                        if (((Number) pair.c()).intValue() > 0) {
                            intValue = ((Number) (((Number) pair.c()).intValue() + intValue2 < Integer.MAX_VALUE ? pair.c() : pair.f())).intValue();
                        } else {
                            intValue = ((Number) (((Number) pair.c()).intValue() + intValue2 > 0 ? pair.c() : pair.f())).intValue();
                        }
                        obj2 = cVar.a(intValue2 + intValue, this);
                    }
                } else {
                    obj2 = cVar.a(i2, this);
                }
                if (obj2 != coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                cVar.getClass();
            }
            obj2 = zy11Var;
            if (obj2 != coroutineSingletons) {
            }
        }
        return zy11Var;
    }
}
