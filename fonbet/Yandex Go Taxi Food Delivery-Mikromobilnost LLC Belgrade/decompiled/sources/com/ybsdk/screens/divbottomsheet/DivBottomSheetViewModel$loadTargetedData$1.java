package com.ybsdk.screens.divbottomsheet;

import defpackage.ehk;
import defpackage.f42;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.divbottomsheet.DivBottomSheetViewModel$loadTargetedData$1", f = "DivBottomSheetViewModel.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DivBottomSheetViewModel$loadTargetedData$1 extends SuspendLambda implements wls {
    final /* synthetic */ ehk $this_loadTargetedData;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivBottomSheetViewModel$loadTargetedData$1(c cVar, ehk ehkVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$this_loadTargetedData = ehkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivBottomSheetViewModel$loadTargetedData$1(this.this$0, this.$this_loadTargetedData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivBottomSheetViewModel$loadTargetedData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f42 f42Var = this.this$0.C;
            String str = this.$this_loadTargetedData.c;
            f42Var.getClass();
            TargetType targetType = TargetType.QR_CREDLIM_PAYMENT_TERM;
            if (!jl40.l(str, targetType.getTarget())) {
                targetType = TargetType.CUSTOM;
            }
            int i2 = d.a[targetType.ordinal()];
            if (i2 == 1) {
                f42Var.b.Y.a.a("qr.payment_split_shutter.initiated", null);
            } else if (i2 != 2) {
                w511.b();
                return null;
            }
            c cVar2 = this.this$0;
            a aVar = cVar2.A;
            ehk ehkVar = this.$this_loadTargetedData;
            String str2 = ehkVar.c;
            String str3 = ehkVar.w;
            Map map = ehkVar.y;
            this.L$0 = cVar2;
            this.label = 1;
            Object a = aVar.a(str2, str3, map, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            cVar = cVar2;
            obj2 = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar = (c) this.L$0;
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        cVar.W(obj2, this.$this_loadTargetedData.c);
        return zy11.a;
    }
}
