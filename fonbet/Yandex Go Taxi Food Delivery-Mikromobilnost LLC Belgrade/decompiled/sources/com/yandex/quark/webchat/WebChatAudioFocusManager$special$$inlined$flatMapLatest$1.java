package com.yandex.quark.webchat;

import defpackage.ap41;
import defpackage.g801;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sc41;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.WebChatAudioFocusManager$special$$inlined$flatMapLatest$1", f = "WebChatAudioFocusManager.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class WebChatAudioFocusManager$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ sc41 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebChatAudioFocusManager$special$$inlined$flatMapLatest$1(Continuation continuation, sc41 sc41Var) {
        super(3, continuation);
        this.this$0 = sc41Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WebChatAudioFocusManager$special$$inlined$flatMapLatest$1 webChatAudioFocusManager$special$$inlined$flatMapLatest$1 = new WebChatAudioFocusManager$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        webChatAudioFocusManager$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        webChatAudioFocusManager$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return webChatAudioFocusManager$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            Set set = (Set) this.L$1;
            sc41 sc41Var = this.this$0;
            Set set2 = set;
            sc41Var.getClass();
            ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(new n(((ap41) it.next()).a(), new WebChatAudioFocusManager$getAudioFocusStateFlow$1$1()));
            }
            Object[] array = kotlin.collections.a.J0(arrayList).toArray(new tpr[0]);
            if (array == null) {
                ny61.t("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                return null;
            }
            kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new g801(7, (tpr[]) array, sc41Var)), new WebChatAudioFocusManager$getAudioFocusStateFlow$$inlined$flatMapLatest$1(null, sc41Var));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(X, vprVar, this) == coroutineSingletons) {
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
