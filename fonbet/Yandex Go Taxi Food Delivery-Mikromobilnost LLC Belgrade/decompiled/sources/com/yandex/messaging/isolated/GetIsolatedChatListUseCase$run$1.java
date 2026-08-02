package com.yandex.messaging.isolated;

import com.yandex.messaging.internal.storage.h;
import com.yandex.messaging.sdk.ChatFilterParams;
import defpackage.fi9;
import defpackage.g6u;
import defpackage.h2r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lp4b;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.isolated.GetIsolatedChatListUseCase$run$1", f = "GetIsolatedChatListUseCase.kt", l = {29, 29, 34}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetIsolatedChatListUseCase$run$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatFilterParams $filterBy;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lp4b;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.isolated.GetIsolatedChatListUseCase$run$1$1", f = "GetIsolatedChatListUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.isolated.GetIsolatedChatListUseCase$run$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ChatFilterParams $filterBy;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, ChatFilterParams chatFilterParams, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$filterBy = chatFilterParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$filterBy, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b bVar = this.this$0;
            return bVar.b.B(new h2r(2, bVar, this.$filterBy));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lp4b;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.isolated.GetIsolatedChatListUseCase$run$1$2", f = "GetIsolatedChatListUseCase.kt", l = {35, 36}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.isolated.GetIsolatedChatListUseCase$run$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ ChatFilterParams $filterBy;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, ChatFilterParams chatFilterParams, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$filterBy = chatFilterParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$filterBy, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vpr vprVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                vprVar = (vpr) this.L$0;
                ArrayList d = b.d(this.this$0, this.$filterBy);
                this.L$0 = vprVar;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar = (vpr) this.L$0;
                kotlin.b.b(obj);
            }
            fi9 a = h.a(this.this$0.c);
            b bVar = this.this$0;
            ChatFilterParams chatFilterParams = this.$filterBy;
            this.L$0 = null;
            this.label = 2;
            kotlinx.coroutines.flow.e.w(vprVar);
            Object collect = a.collect(new a(vprVar, bVar, chatFilterParams), this);
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            if (collect != coroutineSingletons) {
                collect = zy11Var;
            }
            return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetIsolatedChatListUseCase$run$1(b bVar, ChatFilterParams chatFilterParams, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$filterBy = chatFilterParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetIsolatedChatListUseCase$run$1 getIsolatedChatListUseCase$run$1 = new GetIsolatedChatListUseCase$run$1(this.this$0, this.$filterBy, continuation);
        getIsolatedChatListUseCase$run$1.L$0 = obj;
        return getIsolatedChatListUseCase$run$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetIsolatedChatListUseCase$run$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r10, r1, r9) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        vpr vprVar2;
        vpr vprVar3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            b bVar = this.this$0;
            g6u g6uVar = bVar.d.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, this.$filterBy, null);
            this.L$0 = vprVar;
            this.L$1 = vprVar;
            this.label = 1;
            obj = tje.k0(g6uVar, anonymousClass1, this);
            if (obj != coroutineSingletons) {
                vprVar2 = vprVar;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            vprVar = (vpr) this.L$1;
            vprVar2 = (vpr) this.L$0;
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar3 = (vpr) this.L$0;
            kotlin.b.b(obj);
            tpr F = kotlinx.coroutines.flow.e.F(new rol0(new AnonymousClass2(this.this$0, this.$filterBy, null)), this.this$0.d.e);
            this.L$0 = null;
            this.label = 3;
        }
        this.L$0 = vprVar2;
        this.L$1 = null;
        this.label = 2;
        if (vprVar.emit(obj, this) != coroutineSingletons) {
            vprVar3 = vprVar2;
            tpr F2 = kotlinx.coroutines.flow.e.F(new rol0(new AnonymousClass2(this.this$0, this.$filterBy, null)), this.this$0.d.e);
            this.L$0 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
