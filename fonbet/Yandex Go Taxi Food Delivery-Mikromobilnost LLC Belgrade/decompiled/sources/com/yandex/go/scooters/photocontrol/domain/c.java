package com.yandex.go.scooters.photocontrol.domain;

import android.media.Image;
import defpackage.gwk0;
import defpackage.jdv;
import defpackage.k7p;
import defpackage.l7p;
import defpackage.m7p;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zho0;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.CameraControlRepository$listenImageStream$$inlined$flatMapLatest$1;

/* loaded from: classes13.dex */
public final class c implements zho0 {
    public final tt2 a;
    public final k7p b;
    public final ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a c;
    public final g d;

    public c(tt2 tt2Var, k7p k7pVar, ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar, g gVar) {
        this.a = tt2Var;
        this.b = k7pVar;
        this.c = aVar;
        this.d = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:12:0x0041, B:13:0x00b7, B:23:0x005f, B:24:0x008e, B:26:0x0092, B:28:0x009c, B:30:0x00a2, B:37:0x0066, B:41:0x0070), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.AutoCloseable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, jdv jdvVar, ContinuationImpl continuationImpl) {
        ScootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1 scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1;
        int i;
        jdv jdvVar2;
        jdv jdvVar3;
        m7p m7pVar;
        cVar.getClass();
        try {
            if (continuationImpl instanceof ScootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1) {
                scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1 = (ScootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1) continuationImpl;
                int i2 = scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.label;
                    Collection collection = EmptyList.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Image f = jdvVar.f();
                        if (f == null) {
                            gwk0.m(jdvVar, null);
                            return collection;
                        }
                        k7p k7pVar = cVar.b;
                        int e = jdvVar.G0().e();
                        scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$0 = jdvVar;
                        scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$1 = jdvVar;
                        scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$2 = null;
                        scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$3 = null;
                        scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.label = 1;
                        obj = k7pVar.a.a(f, e, scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        jdvVar2 = jdvVar;
                        jdvVar3 = jdvVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ?? r9 = (AutoCloseable) scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$1;
                            kotlin.b.b(obj);
                            jdvVar = r9;
                            Collection collection2 = (List) obj;
                            if (collection2 != null) {
                                collection = collection2;
                            }
                            gwk0.m(jdvVar, null);
                            return collection;
                        }
                        ?? r92 = (AutoCloseable) scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$1;
                        jdvVar2 = (jdv) scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$0;
                        kotlin.b.b(obj);
                        jdvVar3 = r92;
                    }
                    m7pVar = (m7p) obj;
                    if (m7pVar != null) {
                        l7p l7pVar = (l7p) kotlin.collections.a.R(m7pVar.a);
                        List list = l7pVar != null ? l7pVar.a : null;
                        if (list != null) {
                            g gVar = cVar.d;
                            scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$0 = null;
                            scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$1 = jdvVar3;
                            scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$2 = null;
                            scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$3 = null;
                            scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.L$4 = null;
                            scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.label = 2;
                            obj = gVar.a(jdvVar2, list, scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1);
                            jdvVar = jdvVar3;
                        }
                    }
                    gwk0.m(jdvVar3, null);
                    return collection;
                }
            }
            if (i != 0) {
            }
            m7pVar = (m7p) obj;
            if (m7pVar != null) {
            }
            gwk0.m(jdvVar3, null);
            return collection;
        } finally {
        }
        scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1 = new ScootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1(cVar, continuationImpl);
        Object obj2 = scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotocontrolFaceDetectionInteractor$findAndGetFaceOvalPointsIfAny$1.label;
        Collection collection3 = EmptyList.a;
    }

    @Override // defpackage.zho0
    public final tpr a() {
        ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar = this.c;
        b bVar = new b(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.X(aVar.b, new CameraControlRepository$listenImageStream$$inlined$flatMapLatest$1(null, aVar)), 200L), this);
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(bVar, uyj.a);
    }
}
