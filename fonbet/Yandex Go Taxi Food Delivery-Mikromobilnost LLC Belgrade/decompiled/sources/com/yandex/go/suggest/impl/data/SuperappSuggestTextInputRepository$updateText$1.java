package com.yandex.go.suggest.impl.data;

import defpackage.bwp0;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u7r;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.SuperappSuggestTextInputRepository$updateText$1", f = "SuperappSuggestTextInputRepository.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappSuggestTextInputRepository$updateText$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSuggestTextInputRepository$updateText$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSuggestTextInputRepository$updateText$1(this.this$0, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSuggestTextInputRepository$updateText$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            r0 r0Var = this.this$0.j;
            bwp0 bwp0Var = new bwp0(evu0.k0(this.$text).toString());
            this.label = 1;
            r0Var.emit(bwp0Var, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.this$0.d(this.$text);
        a aVar = this.this$0;
        u7r u7rVar = aVar.d;
        String str = this.$text;
        LinkedHashMap linkedHashMap = aVar.c.e;
        String str2 = aVar.i;
        u7rVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("user_input", str);
        hashMap.put("trace_ids", linkedHashMap);
        if (str2 != null) {
            hashMap.put("search_session_id", str2);
        }
        u7rVar.a.a("FindInGoSearch.SuggestSearch.UserInputChanged", hashMap, 2, new HashMap());
        return zy11Var;
    }
}
