package com.ybsdk.screens.divbottomsheet;

import com.ybsdk.api.pro.entities.ProTopupMethod;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.divbottomsheet.DivBottomSheetRepository$getProTopUpBottomSheet$2", f = "DivBottomSheetRepository.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DivBottomSheetRepository$getProTopUpBottomSheet$2 extends SuspendLambda implements tls {
    final /* synthetic */ List<ProTopupMethod> $methods;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivBottomSheetRepository$getProTopUpBottomSheet$2(a aVar, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$methods = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DivBottomSheetRepository$getProTopUpBottomSheet$2(this.this$0, this.$methods, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DivBottomSheetRepository$getProTopUpBottomSheet$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            DivBottomSheetApi divBottomSheetApi = aVar.a;
            List<ProTopupMethod> list = this.$methods;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (ProTopupMethod proTopupMethod : list) {
                aVar.getClass();
                arrayList.add(new ProTopupBottomSheet(proTopupMethod.getTitle(), proTopupMethod.getSubtitle(), proTopupMethod.getDeeplink()));
            }
            ProTopupBottomSheetRequest proTopupBottomSheetRequest = new ProTopupBottomSheetRequest(arrayList);
            this.label = 1;
            a = divBottomSheetApi.a(proTopupBottomSheetRequest, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
