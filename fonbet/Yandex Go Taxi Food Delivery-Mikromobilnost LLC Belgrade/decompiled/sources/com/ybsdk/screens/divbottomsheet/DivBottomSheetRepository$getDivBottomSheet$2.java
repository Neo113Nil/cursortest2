package com.ybsdk.screens.divbottomsheet;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/screens/divbottomsheet/DivBottomSheetResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.screens.divbottomsheet.DivBottomSheetRepository$getDivBottomSheet$2", f = "DivBottomSheetRepository.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DivBottomSheetRepository$getDivBottomSheet$2 extends SuspendLambda implements tls {
    final /* synthetic */ Map<String, String> $additionalData;
    final /* synthetic */ String $agreementId;
    final /* synthetic */ String $target;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivBottomSheetRepository$getDivBottomSheet$2(a aVar, String str, String str2, Map map, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$target = str;
        this.$agreementId = str2;
        this.$additionalData = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DivBottomSheetRepository$getDivBottomSheet$2(this.this$0, this.$target, this.$agreementId, this.$additionalData, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DivBottomSheetRepository$getDivBottomSheet$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            DivBottomSheetApi divBottomSheetApi = this.this$0.a;
            DivBottomSheetRequest divBottomSheetRequest = new DivBottomSheetRequest(this.$target, this.$agreementId, this.$additionalData);
            this.label = 1;
            b = divBottomSheetApi.b(divBottomSheetRequest, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
