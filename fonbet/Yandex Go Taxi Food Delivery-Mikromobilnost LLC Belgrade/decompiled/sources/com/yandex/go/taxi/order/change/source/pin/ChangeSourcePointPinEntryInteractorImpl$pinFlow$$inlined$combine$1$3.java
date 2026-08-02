package com.yandex.go.taxi.order.change.source.pin;

import com.yandex.go.coroutines.g;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.an8;
import defpackage.cg9;
import defpackage.dg9;
import defpackage.eg9;
import defpackage.gg9;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.qdx;
import defpackage.rme0;
import defpackage.vpr;
import defpackage.wh70;
import defpackage.xf9;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.source.pin.ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3", f = "ChangeSourcePointPinEntryInteractorImpl.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ DriveState $driveState$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3(Continuation continuation, b bVar, DriveState driveState) {
        super(3, continuation);
        this.this$0 = bVar;
        this.$driveState$inlined = driveState;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3 changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3 = new ChangeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0, this.$driveState$inlined);
        changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return changeSourcePointPinEntryInteractorImpl$pinFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            long longValue = ((Number) objArr[6]).longValue();
            long longValue2 = ((Number) obj7).longValue();
            boolean booleanValue = ((Boolean) obj6).booleanValue();
            o2y0 o2y0Var = (o2y0) obj5;
            List list = (List) obj4;
            Screen screen = (Screen) obj3;
            xf9 xf9Var = (xf9) obj2;
            Object obj8 = cg9.a;
            if (booleanValue) {
                boolean z2 = xf9Var.f;
                int i2 = xf9Var.d;
                if (z2) {
                    b bVar = this.this$0;
                    int i3 = xf9Var.e;
                    gg9 gg9Var = (gg9) bVar.d.c;
                    qdx qdxVar = gg9Var.a;
                    kgx[] kgxVarArr = gg9.e;
                    if (((Number) qdxVar.getValue(gg9Var, kgxVarArr[0])).intValue() < i3) {
                        b bVar2 = this.this$0;
                        TaxiOrder b = o2y0Var != null ? o2y0Var.b() : null;
                        DriveState driveState = this.$driveState$inlined;
                        if (b == null) {
                            bVar2.getClass();
                            z = false;
                        } else {
                            an8 an8Var = bVar2.d;
                            String str2 = b.a;
                            gg9 gg9Var2 = (gg9) an8Var.c;
                            gg9Var2.getClass();
                            z = !(driveState == DriveState.DRIVING ? ((List) gg9Var2.d.getValue(gg9Var2, kgxVarArr[3])).contains(str2) : ((List) gg9Var2.c.getValue(gg9Var2, kgxVarArr[2])).contains(str2));
                        }
                        if (z && (screen != Screen.ORDERS_LIST || list.size() <= 1)) {
                            if (new wh70(o2y0Var != null ? o2y0Var.b() : null).b()) {
                                if (!xf9Var.equals((xf9) this.this$0.d.w)) {
                                    an8 an8Var2 = this.this$0.d;
                                    ((g) an8Var2.x).a(i2 * 1000);
                                    ((g) this.this$0.d.b).a((i2 + xf9Var.c) * 1000);
                                    an8Var2.w = xf9Var;
                                } else if (longValue2 > 0) {
                                    obj8 = new eg9(xf9.g);
                                } else if (!xf9Var.equals((xf9) this.this$0.d.w) || longValue > 0) {
                                    obj8 = new eg9(xf9Var);
                                } else {
                                    b bVar3 = this.this$0;
                                    TaxiOrder b2 = o2y0Var != null ? o2y0Var.b() : null;
                                    DriveState driveState2 = this.$driveState$inlined;
                                    bVar3.getClass();
                                    if (b2 != null && (str = b2.a) != null) {
                                        gg9 gg9Var3 = (gg9) bVar3.d.c;
                                        gg9Var3.getClass();
                                        rme0 rme0Var = gg9Var3.c;
                                        rme0 rme0Var2 = gg9Var3.d;
                                        if (driveState2 == DriveState.DRIVING) {
                                            List list2 = (List) rme0Var2.getValue(gg9Var3, kgxVarArr[3]);
                                            if (!list2.contains(str)) {
                                                rme0Var2.setValue(gg9Var3, kgxVarArr[3], kotlin.collections.a.m0(Collections.singletonList(str), kotlin.collections.a.B0(10, list2)));
                                            }
                                        } else {
                                            List list3 = (List) rme0Var.getValue(gg9Var3, kgxVarArr[2]);
                                            if (!list3.contains(str)) {
                                                rme0Var.setValue(gg9Var3, kgxVarArr[2], kotlin.collections.a.m0(Collections.singletonList(str), kotlin.collections.a.B0(10, list3)));
                                            }
                                        }
                                    }
                                    obj8 = dg9.a;
                                }
                            }
                        }
                    }
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(obj8, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
