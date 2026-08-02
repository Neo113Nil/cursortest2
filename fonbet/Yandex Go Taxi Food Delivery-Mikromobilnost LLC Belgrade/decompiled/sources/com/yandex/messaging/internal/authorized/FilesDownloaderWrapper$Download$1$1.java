package com.yandex.messaging.internal.authorized;

import defpackage.a1r;
import defpackage.c3r;
import defpackage.g6u;
import defpackage.iyj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qa2;
import defpackage.tje;
import defpackage.tse;
import defpackage.v0r;
import defpackage.wls;
import defpackage.xo3;
import defpackage.ydz;
import defpackage.z6m;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$Download$1$1", f = "FilesDownloaderWrapper.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FilesDownloaderWrapper$Download$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Throwable $cause;
    final /* synthetic */ String $fileId;
    int label;
    final /* synthetic */ d this$0;
    final /* synthetic */ f this$1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$Download$1$1$3", f = "FilesDownloaderWrapper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$Download$1$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c3r c3rVar = this.this$0.a;
            if (c3rVar == null) {
                return null;
            }
            c3rVar.g = true;
            a1r a1rVar = c3rVar.i;
            a1rVar.d.post(new v0r(a1rVar, c3rVar.d, 0));
            xo3 xo3Var = c3rVar.h;
            if (xo3Var != null) {
                xo3Var.cancel();
                c3rVar.h = null;
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesDownloaderWrapper$Download$1$1(d dVar, f fVar, Throwable th, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.this$1 = fVar;
        this.$cause = th;
        this.$fileId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FilesDownloaderWrapper$Download$1$1(this.this$0, this.this$1, this.$cause, this.$fileId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FilesDownloaderWrapper$Download$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        z6m z6mVar = z6m.a;
        if (i == 0) {
            kotlin.b.b(obj);
            qa2 qa2Var = ydz.a;
            if (qa2Var.a()) {
                ydz.d();
            }
            if (!this.this$0.c.isCancelled()) {
                if (this.$cause != null && !this.this$0.b.k0()) {
                    this.this$0.b.T(new iyj0(z6mVar));
                }
                this.this$1.g.remove(this.$fileId);
                return zy11.a;
            }
            if (qa2Var.a()) {
                ydz.d();
            }
            g6u g6uVar = this.this$1.h;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
            this.label = 1;
            if (tje.k0(g6uVar, anonymousClass3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (!this.this$0.b.k0()) {
            this.this$0.b.T(new iyj0(z6mVar));
        }
        this.this$1.g.remove(this.$fileId);
        return zy11.a;
    }
}
