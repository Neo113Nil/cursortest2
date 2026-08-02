package com.yandex.go.scooters.photocontrol.data;

import com.yandex.go.scooters.photocontrol.api.ScootersExamStatus;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolStatusResponse;
import defpackage.ajo0;
import defpackage.bjo0;
import defpackage.cjo0;
import defpackage.cmt;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rkn0;
import defpackage.s8o;
import defpackage.scc;
import defpackage.w511;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b implements bjo0 {
    public final ru.yandex.taxi.scooters.data.a a;
    public final ScootersPhotocontrolStatusApi b;

    public b(ru.yandex.taxi.scooters.data.a aVar, ScootersPhotocontrolStatusApi scootersPhotocontrolStatusApi) {
        this.a = aVar;
        this.b = scootersPhotocontrolStatusApi;
    }

    public static List b(ScootersPhotocontrolStatusResponse scootersPhotocontrolStatusResponse) {
        Object obj;
        Object obj2;
        Iterator it = scootersPhotocontrolStatusResponse.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((ScootersPhotocontrolStatusResponse.Exam) obj).a, ScootersExamType.SELFIE.getDocumentType())) {
                break;
            }
        }
        ScootersPhotocontrolStatusResponse.Exam exam = (ScootersPhotocontrolStatusResponse.Exam) obj;
        Iterator it2 = scootersPhotocontrolStatusResponse.a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (jl40.l(((ScootersPhotocontrolStatusResponse.Exam) obj2).a, ScootersExamType.PASSPORT.getDocumentType())) {
                break;
            }
        }
        ScootersPhotocontrolStatusResponse.Exam exam2 = (ScootersPhotocontrolStatusResponse.Exam) obj2;
        return scc.g(new rkn0(ScootersExamType.SELFIE, c(exam != null ? exam.b : null)), new rkn0(ScootersExamType.PASSPORT, c(exam2 != null ? exam2.b : null)));
    }

    public static ScootersExamStatus c(ScootersPhotocontrolStatusResponse.PhotocontrolStatus photocontrolStatus) {
        int i = photocontrolStatus == null ? -1 : cjo0.a[photocontrolStatus.ordinal()];
        if (i == -1) {
            return ScootersExamStatus.NOT_REQUIRED;
        }
        if (i == 1) {
            return ScootersExamStatus.SUCCESS;
        }
        if (i == 2) {
            return ScootersExamStatus.FAILED;
        }
        if (i == 3) {
            return ScootersExamStatus.IN_PROGRESS;
        }
        if (i == 4) {
            return ScootersExamStatus.IMPOSSIBLE;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1 scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1;
        int i;
        ScootersPhotocontrolStatusApi scootersPhotocontrolStatusApi;
        try {
            if (continuationImpl instanceof ScootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1) {
                scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1 = (ScootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1) continuationImpl;
                int i2 = scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ScootersPhotocontrolStatusApi scootersPhotocontrolStatusApi2 = this.b;
                        ru.yandex.taxi.scooters.data.a aVar = this.a;
                        scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.L$0 = scootersPhotocontrolStatusApi2;
                        scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.label = 1;
                        Object a = aVar.a(false, scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = a;
                        scootersPhotocontrolStatusApi = scootersPhotocontrolStatusApi2;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                kotlin.b.b(obj);
                                return new ajo0(b((ScootersPhotocontrolStatusResponse) obj));
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        scootersPhotocontrolStatusApi = (ScootersPhotocontrolStatusApi) scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.L$0;
                        kotlin.b.b(obj);
                    }
                    cmt<ScootersPhotocontrolStatusResponse> a2 = scootersPhotocontrolStatusApi.a((Map) obj);
                    scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.L$0 = null;
                    scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.d(a2, scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1);
                }
            }
            if (i != 0) {
            }
            cmt<ScootersPhotocontrolStatusResponse> a22 = scootersPhotocontrolStatusApi.a((Map) obj);
            scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.L$0 = null;
            scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.d(a22, scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (s8o.C(th)) {
                return new ajo0(scc.g(new rkn0(ScootersExamType.SELFIE, ScootersExamStatus.FAILED), new rkn0(ScootersExamType.PASSPORT, ScootersExamStatus.NOT_REQUIRED)));
            }
            throw th;
        }
        scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1 = new ScootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1(this, continuationImpl);
        Object obj2 = scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotocontrolStateRepositoryImpl$getPhotoControlState$1.label;
    }
}
