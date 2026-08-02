package com.yandex.go.flex.common.loader;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y4j0;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.loader.LinkedDocumentLoader$enqueue$3$1", f = "LinkedDocumentLoader.kt", l = {226}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class LinkedDocumentLoader$enqueue$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ y4j0 $it;
    final /* synthetic */ Ref$ObjectRef<Object> $key;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedDocumentLoader$enqueue$3$1(a aVar, Ref$ObjectRef ref$ObjectRef, y4j0 y4j0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$key = ref$ObjectRef;
        this.$it = y4j0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkedDocumentLoader$enqueue$3$1(this.this$0, this.$key, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkedDocumentLoader$enqueue$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        g050 g050Var;
        Ref$ObjectRef<Object> ref$ObjectRef;
        y4j0 y4j0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar3 = aVar2.c;
            Ref$ObjectRef<Object> ref$ObjectRef2 = this.$key;
            y4j0 y4j0Var2 = this.$it;
            this.L$0 = aVar3;
            this.L$1 = aVar2;
            this.L$2 = ref$ObjectRef2;
            this.L$3 = y4j0Var2;
            this.label = 1;
            if (aVar3.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            g050Var = aVar3;
            ref$ObjectRef = ref$ObjectRef2;
            y4j0Var = y4j0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y4j0Var = (y4j0) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            aVar = (a) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            LinkedHashSet linkedHashSet = (LinkedHashSet) aVar.w.get(ref$ObjectRef.element);
            if (linkedHashSet != null) {
                linkedHashSet.remove(y4j0Var);
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
