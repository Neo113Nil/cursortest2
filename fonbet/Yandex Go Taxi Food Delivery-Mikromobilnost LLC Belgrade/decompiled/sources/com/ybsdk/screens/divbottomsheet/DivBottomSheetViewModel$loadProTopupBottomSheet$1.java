package com.ybsdk.screens.divbottomsheet;

import defpackage.fhk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.divbottomsheet.DivBottomSheetViewModel$loadProTopupBottomSheet$1", f = "DivBottomSheetViewModel.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DivBottomSheetViewModel$loadProTopupBottomSheet$1 extends SuspendLambda implements wls {
    final /* synthetic */ fhk $this_loadProTopupBottomSheet;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivBottomSheetViewModel$loadProTopupBottomSheet$1(c cVar, fhk fhkVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$this_loadProTopupBottomSheet = fhkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivBottomSheetViewModel$loadProTopupBottomSheet$1(this.this$0, this.$this_loadProTopupBottomSheet, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivBottomSheetViewModel$loadProTopupBottomSheet$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar2 = this.this$0;
            a aVar = cVar2.A;
            List list = this.$this_loadProTopupBottomSheet.c;
            this.L$0 = cVar2;
            this.label = 1;
            Object b = aVar.b(list, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = b;
            cVar = cVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar = (c) this.L$0;
            kotlin.b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        cVar.W(obj2, null);
        return zy11.a;
    }
}
