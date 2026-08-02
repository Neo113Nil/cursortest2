package com.yandex.go.scooters.photocontrol.domain;

import android.graphics.Rect;
import android.media.Image;
import defpackage.gp60;
import defpackage.gwk0;
import defpackage.hp60;
import defpackage.jdv;
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
public final class f implements zho0 {
    public final tt2 a;
    public final gp60 b;
    public final ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a c;
    public final g d;

    public f(tt2 tt2Var, gp60 gp60Var, ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar, g gVar) {
        this.a = tt2Var;
        this.b = gp60Var;
        this.c = aVar;
        this.d = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:12:0x0041, B:13:0x00a8, B:23:0x005e, B:24:0x008d, B:26:0x0091, B:32:0x0065, B:36:0x006f), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.AutoCloseable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(f fVar, jdv jdvVar, ContinuationImpl continuationImpl) {
        ScootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1 scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1;
        int i;
        jdv jdvVar2;
        jdv jdvVar3;
        hp60 hp60Var;
        fVar.getClass();
        try {
            if (continuationImpl instanceof ScootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1) {
                scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1 = (ScootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1) continuationImpl;
                int i2 = scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.label;
                    Collection collection = EmptyList.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Image f = jdvVar.f();
                        if (f == null) {
                            gwk0.m(jdvVar, null);
                            return collection;
                        }
                        gp60 gp60Var = fVar.b;
                        int e = jdvVar.G0().e();
                        scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$0 = jdvVar;
                        scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$1 = jdvVar;
                        scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$2 = null;
                        scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$3 = null;
                        scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.label = 1;
                        obj = gp60Var.a.a(f, e, scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1);
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
                            ?? r9 = (AutoCloseable) scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$1;
                            kotlin.b.b(obj);
                            jdvVar = r9;
                            Collection collection2 = (List) obj;
                            if (collection2 != null) {
                                collection = collection2;
                            }
                            gwk0.m(jdvVar, null);
                            return collection;
                        }
                        ?? r92 = (AutoCloseable) scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$1;
                        jdvVar2 = (jdv) scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$0;
                        kotlin.b.b(obj);
                        jdvVar3 = r92;
                    }
                    hp60Var = (hp60) obj;
                    if (hp60Var != null) {
                        gwk0.m(jdvVar3, null);
                        return collection;
                    }
                    Rect rect = hp60Var.a;
                    g gVar = fVar.d;
                    scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$0 = null;
                    scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$1 = jdvVar3;
                    scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$2 = null;
                    scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$3 = null;
                    scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.L$4 = null;
                    scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.label = 2;
                    obj = gVar.b(jdvVar2, rect, scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1);
                    jdvVar = jdvVar3;
                }
            }
            if (i != 0) {
            }
            hp60Var = (hp60) obj;
            if (hp60Var != null) {
            }
        } finally {
        }
        scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1 = new ScootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1(fVar, continuationImpl);
        Object obj2 = scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotocontrolObjectDetectionInteractor$findAndGetObjectPointsIfAny$1.label;
        Collection collection3 = EmptyList.a;
    }

    @Override // defpackage.zho0
    public final tpr a() {
        ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar = this.c;
        e eVar = new e(kotlinx.coroutines.flow.e.o(kotlinx.coroutines.flow.e.p(kotlinx.coroutines.flow.e.X(aVar.b, new CameraControlRepository$listenImageStream$$inlined$flatMapLatest$1(null, aVar)), 200L)), this);
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(eVar, uyj.a);
    }
}
