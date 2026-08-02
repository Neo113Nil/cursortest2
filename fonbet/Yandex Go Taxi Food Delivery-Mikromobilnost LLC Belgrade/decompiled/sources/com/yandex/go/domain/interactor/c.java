package com.yandex.go.domain.interactor;

import defpackage.ejb0;
import defpackage.fjb0;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vq21;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final fjb0 a;
    public final ru.yandex.taxi.widget.c b;
    public final tt2 c;

    public c(fjb0 fjb0Var, ru.yandex.taxi.widget.c cVar, tt2 tt2Var) {
        this.a = fjb0Var;
        this.b = cVar;
        this.c = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UserPhotoUploadingEulaInteractor$getEula$1 userPhotoUploadingEulaInteractor$getEula$1;
        int i;
        ejb0 ejb0Var;
        if (continuationImpl instanceof UserPhotoUploadingEulaInteractor$getEula$1) {
            userPhotoUploadingEulaInteractor$getEula$1 = (UserPhotoUploadingEulaInteractor$getEula$1) continuationImpl;
            int i2 = userPhotoUploadingEulaInteractor$getEula$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadingEulaInteractor$getEula$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPhotoUploadingEulaInteractor$getEula$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadingEulaInteractor$getEula$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ejb0 b = ((com.yandex.go.agreement.photoupload.a) this.a).b();
                    if (b == null) {
                        return null;
                    }
                    this.c.getClass();
                    sjh sjhVar = uyj.a;
                    UserPhotoUploadingEulaInteractor$getEula$text$1 userPhotoUploadingEulaInteractor$getEula$text$1 = new UserPhotoUploadingEulaInteractor$getEula$text$1(this, b, null);
                    userPhotoUploadingEulaInteractor$getEula$1.L$0 = b;
                    userPhotoUploadingEulaInteractor$getEula$1.label = 1;
                    Object k0 = tje.k0(sjhVar, userPhotoUploadingEulaInteractor$getEula$text$1, userPhotoUploadingEulaInteractor$getEula$1);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = k0;
                    ejb0Var = b;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ejb0Var = (ejb0) userPhotoUploadingEulaInteractor$getEula$1.L$0;
                    kotlin.b.b(obj);
                }
                return new vq21((CharSequence) obj, ejb0Var.a, ejb0Var.c, ejb0Var.d);
            }
        }
        userPhotoUploadingEulaInteractor$getEula$1 = new UserPhotoUploadingEulaInteractor$getEula$1(this, continuationImpl);
        Object obj2 = userPhotoUploadingEulaInteractor$getEula$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadingEulaInteractor$getEula$1.label;
        if (i != 0) {
        }
        return new vq21((CharSequence) obj2, ejb0Var.a, ejb0Var.c, ejb0Var.d);
    }
}
