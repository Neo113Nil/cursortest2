package com.yandex.go.pickup_from_photo.domain;

import android.graphics.Bitmap;
import android.net.Uri;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpSource;
import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import defpackage.d6z;
import defpackage.epb0;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.opb0;
import defpackage.pav;
import defpackage.ppb0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f {
    public final epb0 a;
    public final com.yandex.go.pickup_from_photo.experiment.p b;
    public final pav c;
    public final tt2 d;

    public f(epb0 epb0Var, com.yandex.go.pickup_from_photo.experiment.p pVar, pav pavVar, tt2 tt2Var) {
        this.a = epb0Var;
        this.b = pVar;
        this.c = pavVar;
        this.d = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, boolean z, Uri uri, boolean z2, PhotoPickUpAnalytics$PhotoPickUpSource photoPickUpAnalytics$PhotoPickUpSource, ContinuationImpl continuationImpl) {
        CameraScreenUiStateInteractor$createCameraState$1 cameraScreenUiStateInteractor$createCameraState$1;
        CoroutineSingletons coroutineSingletons;
        int i2;
        String Y;
        String Y2;
        Uri uri2;
        PhotoPickUpAnalytics$PhotoPickUpSource photoPickUpAnalytics$PhotoPickUpSource2;
        boolean z3;
        boolean z4;
        String str;
        Object b;
        int i3;
        Bitmap bitmap;
        Uri uri3;
        String str2;
        PhotoPickUpAnalytics$PhotoPickUpSource photoPickUpAnalytics$PhotoPickUpSource3;
        boolean z5;
        boolean z6;
        epb0 epb0Var;
        String Y3;
        int i4 = i;
        if (continuationImpl instanceof CameraScreenUiStateInteractor$createCameraState$1) {
            cameraScreenUiStateInteractor$createCameraState$1 = (CameraScreenUiStateInteractor$createCameraState$1) continuationImpl;
            int i5 = cameraScreenUiStateInteractor$createCameraState$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cameraScreenUiStateInteractor$createCameraState$1.label = i5 - Integer.MIN_VALUE;
                Object obj = cameraScreenUiStateInteractor$createCameraState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cameraScreenUiStateInteractor$createCameraState$1.label;
                pav pavVar = this.c;
                com.yandex.go.pickup_from_photo.experiment.p pVar = this.b;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    PickupPhotoRecognitionExperiment b2 = pVar.b();
                    Y = d6z.Y(b2, b2.f.a);
                    PickupPhotoRecognitionExperiment b3 = pVar.b();
                    PickupPhotoRecognitionExperiment.CameraScreen cameraScreen = b3.f;
                    String Y4 = i4 < cameraScreen.b.size() ? d6z.Y(b3, ((PickupPhotoRecognitionExperiment.Step) cameraScreen.b.get(i4)).a) : "";
                    PickupPhotoRecognitionExperiment b4 = pVar.b();
                    PickupPhotoRecognitionExperiment.CameraScreen cameraScreen2 = b4.f;
                    Y2 = i4 < cameraScreen2.b.size() ? d6z.Y(b4, ((PickupPhotoRecognitionExperiment.Step) cameraScreen2.b.get(i4)).b) : "";
                    String a = ((m7x0) pVar.b).a(pVar.b().f.c.b);
                    uri2 = uri;
                    cameraScreenUiStateInteractor$createCameraState$1.L$0 = uri2;
                    photoPickUpAnalytics$PhotoPickUpSource2 = photoPickUpAnalytics$PhotoPickUpSource;
                    cameraScreenUiStateInteractor$createCameraState$1.L$1 = photoPickUpAnalytics$PhotoPickUpSource2;
                    cameraScreenUiStateInteractor$createCameraState$1.L$2 = Y;
                    cameraScreenUiStateInteractor$createCameraState$1.L$3 = Y4;
                    cameraScreenUiStateInteractor$createCameraState$1.L$4 = Y2;
                    cameraScreenUiStateInteractor$createCameraState$1.I$0 = i4;
                    z3 = z;
                    cameraScreenUiStateInteractor$createCameraState$1.Z$0 = z3;
                    z4 = z2;
                    cameraScreenUiStateInteractor$createCameraState$1.Z$1 = z4;
                    cameraScreenUiStateInteractor$createCameraState$1.label = 1;
                    Object b5 = ru.yandex.taxi.utils.a.b(pavVar.b().b(a), cameraScreenUiStateInteractor$createCameraState$1);
                    if (b5 != coroutineSingletons) {
                        str = Y4;
                        obj = b5;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z7 = cameraScreenUiStateInteractor$createCameraState$1.Z$1;
                    z5 = cameraScreenUiStateInteractor$createCameraState$1.Z$0;
                    int i6 = cameraScreenUiStateInteractor$createCameraState$1.I$0;
                    bitmap = (Bitmap) cameraScreenUiStateInteractor$createCameraState$1.L$5;
                    String str3 = (String) cameraScreenUiStateInteractor$createCameraState$1.L$4;
                    str = (String) cameraScreenUiStateInteractor$createCameraState$1.L$3;
                    PhotoPickUpAnalytics$PhotoPickUpSource photoPickUpAnalytics$PhotoPickUpSource4 = (PhotoPickUpAnalytics$PhotoPickUpSource) cameraScreenUiStateInteractor$createCameraState$1.L$1;
                    Uri uri4 = (Uri) cameraScreenUiStateInteractor$createCameraState$1.L$0;
                    kotlin.b.b(obj);
                    z6 = z7;
                    uri3 = uri4;
                    i3 = i6;
                    str2 = str3;
                    photoPickUpAnalytics$PhotoPickUpSource3 = photoPickUpAnalytics$PhotoPickUpSource4;
                    String str4 = str;
                    PickupPhotoRecognitionExperiment b6 = pVar.b();
                    opb0 opb0Var = new opb0(bitmap, (Bitmap) obj, d6z.Y(b6, b6.f.c.a), z5);
                    epb0Var = this.a;
                    boolean z8 = epb0Var.b;
                    k7x0 k7x0Var = pVar.b;
                    String a2 = !z8 ? ((m7x0) k7x0Var).a(pVar.b().f.d.a) : ((m7x0) k7x0Var).a(pVar.b().f.d.b);
                    if (epb0Var.b) {
                        PickupPhotoRecognitionExperiment b7 = pVar.b();
                        Y3 = d6z.Y(b7, b7.f.d.d);
                    } else {
                        PickupPhotoRecognitionExperiment b8 = pVar.b();
                        Y3 = d6z.Y(b8, b8.f.d.c);
                    }
                    return new ppb0(str4, str2, opb0Var, z6, a2, Y3, i3, epb0Var.d, epb0Var.b, uri3, photoPickUpAnalytics$PhotoPickUpSource3);
                }
                boolean z9 = cameraScreenUiStateInteractor$createCameraState$1.Z$1;
                boolean z10 = cameraScreenUiStateInteractor$createCameraState$1.Z$0;
                int i7 = cameraScreenUiStateInteractor$createCameraState$1.I$0;
                String str5 = (String) cameraScreenUiStateInteractor$createCameraState$1.L$4;
                String str6 = (String) cameraScreenUiStateInteractor$createCameraState$1.L$3;
                Y = (String) cameraScreenUiStateInteractor$createCameraState$1.L$2;
                photoPickUpAnalytics$PhotoPickUpSource2 = (PhotoPickUpAnalytics$PhotoPickUpSource) cameraScreenUiStateInteractor$createCameraState$1.L$1;
                Uri uri5 = (Uri) cameraScreenUiStateInteractor$createCameraState$1.L$0;
                kotlin.b.b(obj);
                z4 = z9;
                i4 = i7;
                str = str6;
                Y2 = str5;
                uri2 = uri5;
                z3 = z10;
                Bitmap bitmap2 = (Bitmap) obj;
                String a3 = ((m7x0) pVar.b).a(pVar.b().f.c.c);
                cameraScreenUiStateInteractor$createCameraState$1.L$0 = uri2;
                cameraScreenUiStateInteractor$createCameraState$1.L$1 = photoPickUpAnalytics$PhotoPickUpSource2;
                cameraScreenUiStateInteractor$createCameraState$1.L$2 = Y;
                cameraScreenUiStateInteractor$createCameraState$1.L$3 = str;
                cameraScreenUiStateInteractor$createCameraState$1.L$4 = Y2;
                cameraScreenUiStateInteractor$createCameraState$1.L$5 = bitmap2;
                cameraScreenUiStateInteractor$createCameraState$1.I$0 = i4;
                cameraScreenUiStateInteractor$createCameraState$1.Z$0 = z3;
                cameraScreenUiStateInteractor$createCameraState$1.Z$1 = z4;
                cameraScreenUiStateInteractor$createCameraState$1.label = 2;
                b = ru.yandex.taxi.utils.a.b(pavVar.b().b(a3), cameraScreenUiStateInteractor$createCameraState$1);
                if (b != coroutineSingletons) {
                    i3 = i4;
                    bitmap = bitmap2;
                    obj = b;
                    uri3 = uri2;
                    str2 = Y2;
                    photoPickUpAnalytics$PhotoPickUpSource3 = photoPickUpAnalytics$PhotoPickUpSource2;
                    z5 = z3;
                    z6 = z4;
                    String str42 = str;
                    PickupPhotoRecognitionExperiment b62 = pVar.b();
                    opb0 opb0Var2 = new opb0(bitmap, (Bitmap) obj, d6z.Y(b62, b62.f.c.a), z5);
                    epb0Var = this.a;
                    boolean z82 = epb0Var.b;
                    k7x0 k7x0Var2 = pVar.b;
                    String a22 = !z82 ? ((m7x0) k7x0Var2).a(pVar.b().f.d.a) : ((m7x0) k7x0Var2).a(pVar.b().f.d.b);
                    if (epb0Var.b) {
                    }
                    return new ppb0(str42, str2, opb0Var2, z6, a22, Y3, i3, epb0Var.d, epb0Var.b, uri3, photoPickUpAnalytics$PhotoPickUpSource3);
                }
                return coroutineSingletons;
            }
        }
        cameraScreenUiStateInteractor$createCameraState$1 = new CameraScreenUiStateInteractor$createCameraState$1(this, continuationImpl);
        Object obj2 = cameraScreenUiStateInteractor$createCameraState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cameraScreenUiStateInteractor$createCameraState$1.label;
        pav pavVar2 = this.c;
        com.yandex.go.pickup_from_photo.experiment.p pVar2 = this.b;
        if (i2 != 0) {
        }
        Bitmap bitmap22 = (Bitmap) obj2;
        String a32 = ((m7x0) pVar2.b).a(pVar2.b().f.c.c);
        cameraScreenUiStateInteractor$createCameraState$1.L$0 = uri2;
        cameraScreenUiStateInteractor$createCameraState$1.L$1 = photoPickUpAnalytics$PhotoPickUpSource2;
        cameraScreenUiStateInteractor$createCameraState$1.L$2 = Y;
        cameraScreenUiStateInteractor$createCameraState$1.L$3 = str;
        cameraScreenUiStateInteractor$createCameraState$1.L$4 = Y2;
        cameraScreenUiStateInteractor$createCameraState$1.L$5 = bitmap22;
        cameraScreenUiStateInteractor$createCameraState$1.I$0 = i4;
        cameraScreenUiStateInteractor$createCameraState$1.Z$0 = z3;
        cameraScreenUiStateInteractor$createCameraState$1.Z$1 = z4;
        cameraScreenUiStateInteractor$createCameraState$1.label = 2;
        b = ru.yandex.taxi.utils.a.b(pavVar2.b().b(a32), cameraScreenUiStateInteractor$createCameraState$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final tpr b() {
        e eVar = new e(this.a.a, this);
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(eVar, mdh.b);
    }
}
