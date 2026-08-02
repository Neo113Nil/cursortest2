package com.ybsdk.feature.kyc.internal.screens.photo;

import com.ybsdk.core.analytics.generated.delegates.KycEvents$KycOnlineErrorPhotoDownloadOpenRequest;
import defpackage.em3;
import defpackage.if8;
import defpackage.inx;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.onx;
import defpackage.pz40;
import defpackage.tnx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoViewModel$checkPhotoUploadsStatuses$2", f = "KycPhotoViewModel.kt", l = {380}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class KycPhotoViewModel$checkPhotoUploadsStatuses$2 extends SuspendLambda implements wls {
    final /* synthetic */ l8x $progressStateUpdateJob;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycPhotoViewModel$checkPhotoUploadsStatuses$2(b bVar, l8x l8xVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$progressStateUpdateJob = l8xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KycPhotoViewModel$checkPhotoUploadsStatuses$2(this.this$0, this.$progressStateUpdateJob, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((KycPhotoViewModel$checkPhotoUploadsStatuses$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long uploadTimeoutThresholdMs = ((if8) this.this$0.F).a.e().getUploadTimeoutThresholdMs();
            KycPhotoViewModel$checkPhotoUploadsStatuses$2$completedUploads$1 kycPhotoViewModel$checkPhotoUploadsStatuses$2$completedUploads$1 = new KycPhotoViewModel$checkPhotoUploadsStatuses$2$completedUploads$1(this.this$0, null);
            this.label = 1;
            obj = kotlinx.coroutines.a.w(uploadTimeoutThresholdMs, kycPhotoViewModel$checkPhotoUploadsStatuses$2$completedUploads$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List<Pair> list = (List) obj;
        if (list == null) {
            list = this.this$0.O.b();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : list) {
            tnx tnxVar = (tnx) pair.getFirst();
            if (((Throwable) pair.getSecond()) != null) {
                tnxVar = null;
            }
            if (tnxVar != null) {
                arrayList.add(tnxVar);
            }
        }
        ArrayList arrayList2 = this.this$0.L;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!arrayList.contains((tnx) obj2)) {
                arrayList3.add(obj2);
            }
        }
        this.$progressStateUpdateJob.a(null);
        this.this$0.O.f();
        this.this$0.M.clear();
        boolean isEmpty = arrayList3.isEmpty();
        b bVar = this.this$0;
        if (isEmpty) {
            bVar.p0();
        } else {
            em3 em3Var = bVar.I.F;
            KycEvents$KycOnlineErrorPhotoDownloadOpenRequest kycEvents$KycOnlineErrorPhotoDownloadOpenRequest = KycEvents$KycOnlineErrorPhotoDownloadOpenRequest.UPLOAD_TIMEOUT;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("request", kycEvents$KycOnlineErrorPhotoDownloadOpenRequest.getOriginalValue());
            em3Var.a.a("kyc_online.error.photo.download.open", linkedHashMap);
            b bVar2 = this.this$0;
            bVar2.L = arrayList3;
            pz40 Y = bVar2.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, onx.a((onx) value, new inx(null), null, null, null, false, 0, false, 252)));
        }
        return zy11.a;
    }
}
