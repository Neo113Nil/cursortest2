package com.yandex.messaging.internal.authorized;

import defpackage.c3r;
import defpackage.d3r;
import defpackage.g6u;
import defpackage.ijg0;
import defpackage.iyj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tje;
import defpackage.to3;
import defpackage.tse;
import defpackage.wls;
import defpackage.z83;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$Download$job$1", f = "FilesDownloaderWrapper.kt", l = {212, 216}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FilesDownloaderWrapper$Download$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $fileId;
    final /* synthetic */ String $fileName;
    final /* synthetic */ boolean $ignoreCache;
    final /* synthetic */ List<ijg0> $queryParams;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;
    final /* synthetic */ d this$1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lc3r;", "<anonymous>", "(Ltse;)Lc3r;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$Download$job$1$1", f = "FilesDownloaderWrapper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$Download$job$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $fileId;
        final /* synthetic */ String $fileName;
        final /* synthetic */ boolean $ignoreCache;
        final /* synthetic */ List<ijg0> $queryParams;
        final /* synthetic */ d3r $responseHandler;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, String str, String str2, List list, boolean z, d3r d3rVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$fileId = str;
            this.$fileName = str2;
            this.$queryParams = list;
            this.$ignoreCache = z;
            this.$responseHandler = d3rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$fileId, this.$fileName, this.$queryParams, this.$ignoreCache, this.$responseHandler, continuation);
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
            to3 to3Var = this.this$0.b;
            return new c3r(this.$fileId, this.$fileName, this.$queryParams, this.$ignoreCache, to3Var.c, to3Var.a, to3Var.d, this.$responseHandler, to3Var.e, to3Var.j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesDownloaderWrapper$Download$job$1(f fVar, d dVar, String str, String str2, List list, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.this$1 = dVar;
        this.$fileId = str;
        this.$fileName = str2;
        this.$queryParams = list;
        this.$ignoreCache = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FilesDownloaderWrapper$Download$job$1 filesDownloaderWrapper$Download$job$1 = new FilesDownloaderWrapper$Download$job$1(this.this$0, this.this$1, this.$fileId, this.$fileName, this.$queryParams, this.$ignoreCache, continuation);
        filesDownloaderWrapper$Download$job$1.L$0 = obj;
        return filesDownloaderWrapper$Download$job$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FilesDownloaderWrapper$Download$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (r14 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        d3r d3rVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d3r d3rVar2 = new d3r(((tse) this.L$0).getCoroutineContext());
            dVar = this.this$1;
            f fVar = this.this$0;
            g6u g6uVar = fVar.h;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(fVar, this.$fileId, this.$fileName, this.$queryParams, this.$ignoreCache, d3rVar2, null);
            this.L$0 = d3rVar2;
            this.L$1 = dVar;
            this.label = 1;
            obj = tje.k0(g6uVar, anonymousClass1, this);
            if (obj != coroutineSingletons) {
                d3rVar = d3rVar2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            oyj0 oyj0Var = (oyj0) obj;
            this.this$1.b.T(oyj0Var);
            boolean z = oyj0Var instanceof iyj0;
            zy11 zy11Var = zy11.a;
            if (z) {
                return zy11Var;
            }
            z83.b(null, this.$fileId, oyj0Var.b());
            return zy11Var;
        }
        dVar = (d) this.L$1;
        d3rVar = (d3r) this.L$0;
        kotlin.b.b(obj);
        dVar.a = (c3r) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = d3rVar.a.s(this);
    }
}
