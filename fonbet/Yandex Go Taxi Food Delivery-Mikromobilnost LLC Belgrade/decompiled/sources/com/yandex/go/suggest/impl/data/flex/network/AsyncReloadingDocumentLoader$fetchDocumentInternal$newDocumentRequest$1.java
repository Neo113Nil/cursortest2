package com.yandex.go.suggest.impl.data.flex.network;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.i7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u1m;
import defpackage.wls;
import defpackage.ywl;
import defpackage.zy11;
import flex.core.loader.network.e;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lwzl;", "<anonymous>", "(Ltse;)Lwzl;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.data.flex.network.AsyncReloadingDocumentLoader$fetchDocumentInternal$newDocumentRequest$1", f = "AsyncReloadingDocumentLoader.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class AsyncReloadingDocumentLoader$fetchDocumentInternal$newDocumentRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ ywl $document;
    final /* synthetic */ boolean $force;
    final /* synthetic */ u1m $query;
    final /* synthetic */ boolean $restoreTagsIfError;
    final /* synthetic */ boolean $retriedAfterError;
    final /* synthetic */ i7x0 $tagRegistry;
    final /* synthetic */ boolean $usePassedCoroutineContext;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncReloadingDocumentLoader$fetchDocumentInternal$newDocumentRequest$1(a aVar, u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, i7x0 i7x0Var, boolean z4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$query = u1mVar;
        this.$document = ywlVar;
        this.$retriedAfterError = z;
        this.$force = z2;
        this.$restoreTagsIfError = z3;
        this.$tagRegistry = i7x0Var;
        this.$usePassedCoroutineContext = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AsyncReloadingDocumentLoader$fetchDocumentInternal$newDocumentRequest$1(this.this$0, this.$query, this.$document, this.$retriedAfterError, this.$force, this.$restoreTagsIfError, this.$tagRegistry, this.$usePassedCoroutineContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncReloadingDocumentLoader$fetchDocumentInternal$newDocumentRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        e eVar = this.this$0.b;
        u1m u1mVar = this.$query;
        ywl ywlVar = this.$document;
        boolean z = this.$retriedAfterError;
        boolean z2 = this.$force;
        boolean z3 = this.$restoreTagsIfError;
        i7x0 i7x0Var = this.$tagRegistry;
        boolean z4 = this.$usePassedCoroutineContext;
        this.label = 1;
        Object f = eVar.f(u1mVar, ywlVar, z, z2, z3, i7x0Var, z4, this);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
