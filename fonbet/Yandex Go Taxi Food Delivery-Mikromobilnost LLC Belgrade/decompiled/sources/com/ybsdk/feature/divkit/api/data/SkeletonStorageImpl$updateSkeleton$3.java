package com.ybsdk.feature.divkit.api.data;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.g3r;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.divkit.api.data.SkeletonStorageImpl$updateSkeleton$3", f = "SkeletonStorageImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SkeletonStorageImpl$updateSkeleton$3 extends SuspendLambda implements tls {
    final /* synthetic */ String $rawSkeletonId;
    final /* synthetic */ DivDataDto $skeleton;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonStorageImpl$updateSkeleton$3(a aVar, String str, DivDataDto divDataDto, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$rawSkeletonId = str;
        this.$skeleton = divDataDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SkeletonStorageImpl$updateSkeleton$3(this.this$0, this.$rawSkeletonId, this.$skeleton, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        SkeletonStorageImpl$updateSkeleton$3 skeletonStorageImpl$updateSkeleton$3 = (SkeletonStorageImpl$updateSkeleton$3) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        skeletonStorageImpl$updateSkeleton$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.f.remove(RawSkeletonId.m431boximpl(this.$rawSkeletonId));
        File a = a.a(this.this$0, this.$rawSkeletonId);
        String json2 = this.this$0.c.toJson(this.$skeleton);
        if (!a.exists()) {
            a.createNewFile();
        }
        g3r.g(a, json2);
        return zy11.a;
    }
}
