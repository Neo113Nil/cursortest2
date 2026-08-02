package com.arkivanov.mvikotlin.extensions.coroutines;

import defpackage.mvg;
import defpackage.n1k;
import defpackage.ny61;
import defpackage.rq60;
import defpackage.sls;
import defpackage.tls;
import defpackage.wkh;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.arkivanov.mvikotlin.extensions.coroutines.StoreExtKt$special$$inlined$toFlow$2", f = "StoreExt.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class StoreExtKt$special$$inlined$toFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ Object $this_toFlow;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.arkivanov.mvikotlin.extensions.coroutines.StoreExtKt$special$$inlined$toFlow$2$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            n1k n1kVar = (n1k) this.receiver;
            n1kVar.a.invoke(n1kVar);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreExtKt$special$$inlined$toFlow$2(Object obj, Continuation continuation) {
        super(2, continuation);
        this.$this_toFlow = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StoreExtKt$special$$inlined$toFlow$2 storeExtKt$special$$inlined$toFlow$2 = new StoreExtKt$special$$inlined$toFlow$2(this.$this_toFlow, continuation);
        storeExtKt$special$$inlined$toFlow$2.L$0 = obj;
        return storeExtKt$special$$inlined$toFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StoreExtKt$special$$inlined$toFlow$2) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.arkivanov.mvikotlin.extensions.coroutines.StoreExtKt$special$$inlined$toFlow$2$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            final y6f0 y6f0Var = (y6f0) this.L$0;
            Object obj2 = this.$this_toFlow;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(0, ((wkh) obj2).g.d(new rq60(new sls() { // from class: com.arkivanov.mvikotlin.extensions.coroutines.StoreExtKt$special$$inlined$toFlow$2.1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    x6f0 x6f0Var = (x6f0) y6f0.this;
                    x6f0Var.getClass();
                    x6f0Var.l(null);
                    return zy11.a;
                }
            }, new tls() { // from class: com.arkivanov.mvikotlin.extensions.coroutines.StoreExtKt$special$$inlined$toFlow$2.2
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj3) {
                    x6f0 x6f0Var = (x6f0) y6f0.this;
                    x6f0Var.getClass();
                    x6f0Var.d(obj3);
                    return zy11.a;
                }
            })), n1k.class, "dispose", "dispose()V", 0);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, anonymousClass3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
