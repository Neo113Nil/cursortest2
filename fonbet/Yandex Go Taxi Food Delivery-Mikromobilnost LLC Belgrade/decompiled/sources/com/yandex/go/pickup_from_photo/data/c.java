package com.yandex.go.pickup_from_photo.data;

import com.yandex.go.pickup_from_photo.data.api.PickupPhotoRecognitionApi;
import com.yandex.go.pickup_from_photo.data.model.PhotoRecognitionStatus;
import com.yandex.go.pickup_from_photo.data.model.PickupFromPhotoGetResultResponse;
import com.yandex.go.pickup_from_photo.domain.exception.RecognitionEmptyResultException;
import com.yandex.go.pickup_from_photo.domain.exception.RecognitionFailedException;
import com.yandex.go.pickup_from_photo.domain.exception.StatusPollingException;
import com.yandex.go.pickup_from_photo.experiment.p;
import defpackage.cmt;
import defpackage.ffx;
import defpackage.i3y;
import defpackage.lr40;
import defpackage.mdh;
import defpackage.nhb0;
import defpackage.ny61;
import defpackage.on2;
import defpackage.pzt0;
import defpackage.r1e0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.umb0;
import defpackage.uyj;
import defpackage.vmb0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class c {
    public final tt2 a;
    public final p b;
    public final umb0 c;
    public final vmb0 d;
    public final i3y e;
    public final n0 f = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);
    public pzt0 g;

    public c(on2 on2Var, tt2 tt2Var, p pVar, umb0 umb0Var, vmb0 vmb0Var) {
        this.a = tt2Var;
        this.b = pVar;
        this.c = umb0Var;
        this.d = vmb0Var;
        this.e = kotlin.a.a(new lr40(on2Var, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {all -> 0x0067, blocks: (B:20:0x0063, B:21:0x0094, B:50:0x0076), top: B:19:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0132 -> B:47:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, String str, ContinuationImpl continuationImpl) {
        PickupFromPhotoUploadRepository$pollResult$1 pickupFromPhotoUploadRepository$pollResult$1;
        int i;
        Object failure;
        cVar.getClass();
        if (continuationImpl instanceof PickupFromPhotoUploadRepository$pollResult$1) {
            pickupFromPhotoUploadRepository$pollResult$1 = (PickupFromPhotoUploadRepository$pollResult$1) continuationImpl;
            int i2 = pickupFromPhotoUploadRepository$pollResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pickupFromPhotoUploadRepository$pollResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pickupFromPhotoUploadRepository$pollResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pickupFromPhotoUploadRepository$pollResult$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    if (i == 1) {
                        str = (String) pickupFromPhotoUploadRepository$pollResult$1.L$0;
                        try {
                            kotlin.b.b(obj);
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        failure = (r1e0) obj;
                        if (Result.a(failure) != null) {
                            kotlin.b.b(failure);
                            r1e0 r1e0Var = (r1e0) failure;
                            List list = ((PickupFromPhotoGetResultResponse) r1e0Var.a).b;
                            List M = list != null ? kotlin.collections.a.M(list) : null;
                            PhotoRecognitionStatus photoRecognitionStatus = ((PickupFromPhotoGetResultResponse) r1e0Var.a).a;
                            PhotoRecognitionStatus photoRecognitionStatus2 = PhotoRecognitionStatus.DONE;
                            if (photoRecognitionStatus == photoRecognitionStatus2 && (M == null || M.isEmpty())) {
                                throw new RecognitionEmptyResultException();
                            }
                            if (photoRecognitionStatus == photoRecognitionStatus2 && M != null && (!M.isEmpty())) {
                                nhb0 nhb0Var = cVar.c.a;
                                nhb0Var.getClass();
                                nhb0Var.a.a("PhotoPickUp.Loading.Finished", new HashMap(), 1, new HashMap());
                                n0 n0Var = cVar.f;
                                pickupFromPhotoUploadRepository$pollResult$1.L$0 = null;
                                pickupFromPhotoUploadRepository$pollResult$1.L$1 = null;
                                pickupFromPhotoUploadRepository$pollResult$1.L$2 = null;
                                pickupFromPhotoUploadRepository$pollResult$1.L$3 = null;
                                pickupFromPhotoUploadRepository$pollResult$1.label = 2;
                                if (n0Var.emit(M, pickupFromPhotoUploadRepository$pollResult$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                return zy11Var;
                            }
                            if (photoRecognitionStatus == PhotoRecognitionStatus.FAILED) {
                                throw new RecognitionFailedException();
                            }
                            Long l = r1e0Var.b;
                            long longValue = l != null ? l.longValue() : cVar.b.b().j.c * 1000;
                            pickupFromPhotoUploadRepository$pollResult$1.L$0 = str;
                            pickupFromPhotoUploadRepository$pollResult$1.L$1 = null;
                            pickupFromPhotoUploadRepository$pollResult$1.L$2 = null;
                            pickupFromPhotoUploadRepository$pollResult$1.L$3 = null;
                            pickupFromPhotoUploadRepository$pollResult$1.label = 3;
                            if (kotlinx.coroutines.a.i(longValue, pickupFromPhotoUploadRepository$pollResult$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            if (kotlinx.coroutines.a.p(pickupFromPhotoUploadRepository$pollResult$1.get_context())) {
                                cmt<PickupFromPhotoGetResultResponse> a = ((PickupPhotoRecognitionApi) cVar.e.getValue()).a(str);
                                pickupFromPhotoUploadRepository$pollResult$1.L$0 = str;
                                pickupFromPhotoUploadRepository$pollResult$1.L$1 = null;
                                pickupFromPhotoUploadRepository$pollResult$1.L$2 = null;
                                pickupFromPhotoUploadRepository$pollResult$1.L$3 = null;
                                pickupFromPhotoUploadRepository$pollResult$1.label = 1;
                                obj = ru.yandex.taxi.network.api.a.c(a, null, pickupFromPhotoUploadRepository$pollResult$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                failure = (r1e0) obj;
                                if (Result.a(failure) != null) {
                                    throw new StatusPollingException();
                                }
                            }
                            return zy11Var;
                        }
                    } else {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) pickupFromPhotoUploadRepository$pollResult$1.L$0;
                    }
                }
                kotlin.b.b(obj);
                if (kotlinx.coroutines.a.p(pickupFromPhotoUploadRepository$pollResult$1.get_context())) {
                }
                return zy11Var;
            }
        }
        pickupFromPhotoUploadRepository$pollResult$1 = new PickupFromPhotoUploadRepository$pollResult$1(cVar, continuationImpl);
        Object obj2 = pickupFromPhotoUploadRepository$pollResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pickupFromPhotoUploadRepository$pollResult$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        kotlin.b.b(obj2);
        if (kotlinx.coroutines.a.p(pickupFromPhotoUploadRepository$pollResult$1.get_context())) {
        }
        return zy11Var2;
    }

    public final Object b(List list, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new PickupFromPhotoUploadRepository$uploadPhotos$2(this, list, null), continuation);
    }
}
