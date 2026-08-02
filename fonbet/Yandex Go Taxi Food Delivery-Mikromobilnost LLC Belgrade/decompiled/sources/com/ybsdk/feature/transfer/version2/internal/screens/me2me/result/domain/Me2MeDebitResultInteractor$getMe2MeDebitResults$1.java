package com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.domain.Me2MeResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultScreenParams;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.g0e0;
import defpackage.h910;
import defpackage.iyd0;
import defpackage.k910;
import defpackage.mjb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tq11;
import defpackage.w511;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lk910;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultInteractor$getMe2MeDebitResults$1", f = "Me2MeDebitResultInteractor.kt", l = {85, HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Me2MeDebitResultInteractor$getMe2MeDebitResults$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $transferId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldqg;", "Lh910;", "", "<anonymous>", "(Ldqg;)Z"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultInteractor$getMe2MeDebitResults$1$1", f = "Me2MeDebitResultInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultInteractor$getMe2MeDebitResults$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        private /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((dqg) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            dqg dqgVar = (dqg) this.L$0;
            boolean z = true;
            if (dqgVar instanceof cqg) {
                if (((h910) ((cqg) dqgVar).a).a == Me2MeDebitResultEntity$Status.PROCESSING) {
                    z = false;
                }
            } else if (!(dqgVar instanceof bqg)) {
                w511.b();
                return null;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Ldqg;", "Lh910;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultInteractor$getMe2MeDebitResults$1$2", f = "Me2MeDebitResultInteractor.kt", l = {69, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultInteractor$getMe2MeDebitResults$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ y6f0 $$this$channelFlow;
        final /* synthetic */ Ref$ObjectRef<k910> $lastState;
        final /* synthetic */ String $transferId;
        /* synthetic */ int I$0;
        Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, String str, y6f0 y6f0Var, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$transferId = str;
            this.$$this$channelFlow = y6f0Var;
            this.$lastState = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$transferId, this.$$this$channelFlow, this.$lastState, continuation);
            anonymousClass2.I$0 = ((tq11) obj).a;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            int i = ((tq11) obj).a;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$transferId, this.$$this$channelFlow, this.$lastState, (Continuation) obj2);
            anonymousClass2.I$0 = i;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
        
            if (r2 == r1) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object c;
            T t;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                int i2 = this.I$0;
                com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.data.a aVar = this.this$0.b;
                String str = this.$transferId;
                this.label = 1;
                c = aVar.c(i2, str, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Result result = (Result) this.L$0;
                    b.b(obj);
                    return result;
                }
                b.b(obj);
                c = ((Result) obj).getValue();
            }
            Result result2 = new Result(c);
            y6f0 y6f0Var = this.$$this$channelFlow;
            a aVar2 = this.this$0;
            Ref$ObjectRef<k910> ref$ObjectRef = this.$lastState;
            Object value = result2.getValue();
            Me2MeDebitResultScreenParams me2MeDebitResultScreenParams = aVar2.c;
            Throwable a = Result.a(value);
            if (a == null) {
                Object obj3 = (dqg) ((iyd0) value).a;
                if (obj3 instanceof bqg) {
                    t = mjb1.e(me2MeDebitResultScreenParams.getUndefinedResultPage(), (ct11) obj3);
                } else {
                    if (!(obj3 instanceof cqg)) {
                        w511.b();
                        return null;
                    }
                    Me2MeResultPageEntity resultLoaderPage = me2MeDebitResultScreenParams.getResultLoaderPage();
                    h910 h910Var = (h910) ((cqg) obj3).a;
                    String str2 = h910Var.b;
                    if (str2 == null) {
                        str2 = resultLoaderPage.getTitle();
                    }
                    String str3 = str2;
                    String str4 = h910Var.c;
                    if (str4 == null) {
                        str4 = resultLoaderPage.getDescription();
                    }
                    t = new k910(Me2MeResultPageEntity.copy$default(resultLoaderPage, null, null, str3, str4, 3, null), h910Var.a, h910Var.d, null, 120);
                }
            } else {
                t = mjb1.f(me2MeDebitResultScreenParams.getUndefinedResultPage(), c.b(a) ? Me2MeDebitResultEntity$Status.FAILED : Me2MeDebitResultEntity$Status.PROCESSING);
            }
            ref$ObjectRef.element = t;
            this.L$0 = result2;
            this.label = 2;
            return ((x6f0) y6f0Var).y.o(t, this) == obj2 ? obj2 : result2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me2MeDebitResultInteractor$getMe2MeDebitResults$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$transferId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Me2MeDebitResultInteractor$getMe2MeDebitResults$1 me2MeDebitResultInteractor$getMe2MeDebitResults$1 = new Me2MeDebitResultInteractor$getMe2MeDebitResults$1(this.this$0, this.$transferId, continuation);
        me2MeDebitResultInteractor$getMe2MeDebitResults$1.L$0 = obj;
        return me2MeDebitResultInteractor$getMe2MeDebitResults$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Me2MeDebitResultInteractor$getMe2MeDebitResults$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (((defpackage.x6f0) r3).y.o(r13, r12) == r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var;
        Ref$ObjectRef ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            y6f0 y6f0Var2 = (y6f0) this.L$0;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            com.ybsdk.utils.poller.c c = this.this$0.x.c(g0e0.b, new AnonymousClass1(2, null), new AnonymousClass2(this.this$0, this.$transferId, y6f0Var2, ref$ObjectRef2, null));
            this.L$0 = y6f0Var2;
            this.L$1 = ref$ObjectRef2;
            this.label = 1;
            if (c.e(this) != coroutineSingletons) {
                y6f0Var = y6f0Var2;
                ref$ObjectRef = ref$ObjectRef2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$ObjectRef = (Ref$ObjectRef) this.L$1;
        y6f0Var = (y6f0) this.L$0;
        b.b(obj);
        ((Result) obj).getClass();
        k910 k910Var = (k910) ref$ObjectRef.element;
        if (k910Var != null) {
            a aVar = this.this$0;
            if (k910Var.b == Me2MeDebitResultEntity$Status.PROCESSING) {
                k910 f = mjb1.f(aVar.c.getUndefinedResultPage(), Me2MeDebitResultEntity$Status.TIMEOUT);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
            }
        }
        return zy11.a;
    }
}
