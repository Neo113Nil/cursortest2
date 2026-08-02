package com.ybsdk.feature.educations.internal.domain;

import com.ybsdk.di.modules.features.i;
import defpackage.d6v;
import defpackage.dsg;
import defpackage.jqp0;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.trp0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.educations.internal.domain.EducationsPersistenceInteractorImpl$markAsRead$1", f = "EducationsPersistenceInteractorImpl.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EducationsPersistenceInteractorImpl$markAsRead$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $eventId;
    final /* synthetic */ d6v $idempotencyTokenProvider;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.educations.internal.domain.EducationsPersistenceInteractorImpl$markAsRead$1$1", f = "EducationsPersistenceInteractorImpl.kt", l = {48}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.educations.internal.domain.EducationsPersistenceInteractorImpl$markAsRead$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $eventId;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$eventId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$eventId, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                String str = (String) this.L$0;
                i iVar = this.this$0.b;
                String str2 = this.$eventId;
                this.label = 1;
                a = iVar.a(str2, str, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                a = ((Result) obj).getValue();
            }
            return new Result(a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationsPersistenceInteractorImpl$markAsRead$1(d6v d6vVar, String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$idempotencyTokenProvider = d6vVar;
        this.$eventId = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EducationsPersistenceInteractorImpl$markAsRead$1(this.$idempotencyTokenProvider, this.$eventId, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EducationsPersistenceInteractorImpl$markAsRead$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object O;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            b.b(obj);
            d6v d6vVar = this.$idempotencyTokenProvider;
            String str2 = this.$eventId;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, str2, null);
            this.label = 1;
            O = d6vVar.O(anonymousClass1, str2, this);
            if (O == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            O = ((Result) obj).getValue();
        }
        String str3 = this.$eventId;
        Throwable a = Result.a(O);
        if (a != null) {
            List singletonList = Collections.singletonList(lrp0.j);
            boolean isEmpty = singletonList.isEmpty();
            if (!isEmpty) {
                if (isEmpty) {
                    w511.b();
                    return null;
                }
                str = kotlin.collections.a.X(singletonList, "", null, null, new dsg(16), 30);
            }
            trp0 trp0Var = trp0.a;
            trp0.e(new jqp0(a, "Failed to mark event", str3, str));
        }
        return zy11.a;
    }
}
