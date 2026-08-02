package com.yandex.go.beginners.safety.photo.upload.ui;

import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import defpackage.ayl0;
import defpackage.bvf0;
import defpackage.byl0;
import defpackage.dyl0;
import defpackage.fyl0;
import defpackage.gbv;
import defpackage.gyl0;
import defpackage.ny61;
import defpackage.qxl0;
import defpackage.rxl0;
import defpackage.tbv;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.yxl0;
import defpackage.zxl0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class b {
    public final tt2 a;
    public final c b;
    public final r0 c = bvf0.c(new fyl0(0));

    public b(tt2 tt2Var, c cVar) {
        this.a = tt2Var;
        this.b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v14, types: [tbv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, qxl0 qxl0Var, fyl0 fyl0Var, ContinuationImpl continuationImpl) {
        SafetyPhotoUploadUiStateInteractor$mapState$1 safetyPhotoUploadUiStateInteractor$mapState$1;
        int i;
        SafetyNewbiesVerificationExperiment.PhotoStep photoStep;
        gbv gbvVar;
        SafetyNewbiesVerificationExperiment.PhotoStep photoStep2;
        gbv gbvVar2;
        bVar.getClass();
        if (continuationImpl instanceof SafetyPhotoUploadUiStateInteractor$mapState$1) {
            safetyPhotoUploadUiStateInteractor$mapState$1 = (SafetyPhotoUploadUiStateInteractor$mapState$1) continuationImpl;
            int i2 = safetyPhotoUploadUiStateInteractor$mapState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyPhotoUploadUiStateInteractor$mapState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyPhotoUploadUiStateInteractor$mapState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyPhotoUploadUiStateInteractor$mapState$1.label;
                CharSequence charSequence = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    photoStep = fyl0Var.a;
                    int i3 = gyl0.a[qxl0Var.a.ordinal()];
                    if (i3 == 1) {
                        return new yxl0(fyl0Var.a(photoStep.b.a));
                    }
                    if (i3 == 2) {
                        return new ayl0(fyl0Var.a(photoStep.c.a));
                    }
                    if (i3 == 3) {
                        return new zxl0(fyl0Var.a(photoStep.d.a), fyl0Var.a(photoStep.d.b));
                    }
                    if (i3 == 4) {
                        return new byl0(fyl0Var.a(photoStep.e.a), fyl0Var.a(photoStep.e.b));
                    }
                    if (i3 != 5) {
                        w511.b();
                        return null;
                    }
                    gbvVar = new gbv(qxl0Var.b);
                    FormattedText formattedText = qxl0Var.c;
                    if (formattedText != null) {
                        c cVar = bVar.b;
                        safetyPhotoUploadUiStateInteractor$mapState$1.L$0 = null;
                        safetyPhotoUploadUiStateInteractor$mapState$1.L$1 = fyl0Var;
                        safetyPhotoUploadUiStateInteractor$mapState$1.L$2 = photoStep;
                        safetyPhotoUploadUiStateInteractor$mapState$1.L$3 = null;
                        safetyPhotoUploadUiStateInteractor$mapState$1.L$4 = gbvVar;
                        safetyPhotoUploadUiStateInteractor$mapState$1.label = 1;
                        Object i4 = c.i(cVar, formattedText, null, safetyPhotoUploadUiStateInteractor$mapState$1, 30);
                        if (i4 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        photoStep2 = photoStep;
                        obj = i4;
                        gbvVar2 = gbvVar;
                    }
                    return new dyl0(gbvVar, charSequence, fyl0Var.a(photoStep.f.a), fyl0Var.a(photoStep.f.b));
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r6 = (tbv) safetyPhotoUploadUiStateInteractor$mapState$1.L$4;
                photoStep2 = (SafetyNewbiesVerificationExperiment.PhotoStep) safetyPhotoUploadUiStateInteractor$mapState$1.L$2;
                fyl0Var = (fyl0) safetyPhotoUploadUiStateInteractor$mapState$1.L$1;
                kotlin.b.b(obj);
                gbvVar2 = r6;
                charSequence = (CharSequence) obj;
                gbvVar = gbvVar2;
                photoStep = photoStep2;
                return new dyl0(gbvVar, charSequence, fyl0Var.a(photoStep.f.a), fyl0Var.a(photoStep.f.b));
            }
        }
        safetyPhotoUploadUiStateInteractor$mapState$1 = new SafetyPhotoUploadUiStateInteractor$mapState$1(bVar, continuationImpl);
        Object obj2 = safetyPhotoUploadUiStateInteractor$mapState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyPhotoUploadUiStateInteractor$mapState$1.label;
        CharSequence charSequence2 = null;
        if (i != 0) {
        }
        charSequence2 = (CharSequence) obj2;
        gbvVar = gbvVar2;
        photoStep = photoStep2;
        return new dyl0(gbvVar, charSequence2, fyl0Var.a(photoStep.f.a), fyl0Var.a(photoStep.f.b));
    }

    public final tpr b(rxl0 rxl0Var) {
        tpr t = e.t(new m0(rxl0Var.a, this.c, new SafetyPhotoUploadUiStateInteractor$getUiStateFlow$1(this, null)));
        this.a.getClass();
        return e.F(t, uyj.a);
    }
}
