package com.yandex.go.feedback_common.services;

import defpackage.cxq0;
import defpackage.hzk;
import defpackage.klv;
import defpackage.lvq;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.nsq;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.wmq;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llvq;", "<anonymous>", "()Llvq;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.feedback_common.services.FeedbackTaskQueueCachingFactory$taskQueue$1", f = "FeedbackTaskQueueCachingFactory.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class FeedbackTaskQueueCachingFactory$taskQueue$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Llvq;", "<anonymous>", "(Ltse;)Llvq;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.feedback_common.services.FeedbackTaskQueueCachingFactory$taskQueue$1$1", f = "FeedbackTaskQueueCachingFactory.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.feedback_common.services.FeedbackTaskQueueCachingFactory$taskQueue$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
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
            hzk hzkVar = new hzk(this.this$0.b, FeedbackTask.Companion.serializer());
            File file = new File(this.this$0.a.getFilesDir(), "feedback_task_queue");
            try {
                return new lvq(new cxq0(file, hzkVar), this.this$0.a);
            } catch (Exception e) {
                this.this$0.d.b("taskQueue", e, new wmq(25));
                b bVar = this.this$0;
                bVar.getClass();
                if (!file.delete()) {
                    bVar.d.b("deleteFile", e, new nsq(18));
                }
                try {
                    return new lvq(new cxq0(file, hzkVar), this.this$0.a);
                } catch (IOException e2) {
                    this.this$0.d.b("taskQueue", e2, new wmq(26));
                    return new lvq(new klv(), this.this$0.a);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackTaskQueueCachingFactory$taskQueue$1(b bVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FeedbackTaskQueueCachingFactory$taskQueue$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FeedbackTaskQueueCachingFactory$taskQueue$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.c.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 1;
        Object k0 = tje.k0(mdhVar, anonymousClass1, this);
        return k0 == coroutineSingletons ? coroutineSingletons : k0;
    }
}
