package com.yandex.go.suggest.impl.data.flex.variables;

import com.yandex.payment.common.result.ResultType;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.flex.variables.SuperappSuggestSectionsStateRepository$enableSearchSectionLoading$1", f = "SuperappSuggestSectionsStateRepository.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappSuggestSectionsStateRepository$enableSearchSectionLoading$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $sectionId;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestSectionsStateRepository$enableSearchSectionLoading$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$sectionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSuggestSectionsStateRepository$enableSearchSectionLoading$1(this.this$0, this.$sectionId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestSectionsStateRepository$enableSearchSectionLoading$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        JSONObject c = this.this$0.c();
        if (c.has(this.$sectionId)) {
            c.getJSONObject(this.$sectionId).put("loading_state", ResultType.RESULT_TYPE_LOADING);
            b bVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            b.a(bVar, c);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
