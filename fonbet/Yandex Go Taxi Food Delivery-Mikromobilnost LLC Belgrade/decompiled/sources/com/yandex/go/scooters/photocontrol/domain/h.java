package com.yandex.go.scooters.photocontrol.domain;

import android.net.Uri;
import defpackage.ijo0;
import defpackage.ny61;
import defpackage.qan0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.w;

/* loaded from: classes13.dex */
public final class h {
    public final w a;
    public final ijo0 b;

    public h(w wVar, ijo0 ijo0Var) {
        this.a = wVar;
        this.b = ijo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qan0 qan0Var, ContinuationImpl continuationImpl) {
        ScootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1 scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1;
        int i;
        if (continuationImpl instanceof ScootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1) {
            scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1 = (ScootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1) continuationImpl;
            int i2 = scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1.L$0 = null;
                    scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1.label = 1;
                    obj = this.a.a(qan0Var, scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1);
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
                this.b.a = (Uri) obj;
                return zy11.a;
            }
        }
        scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1 = new ScootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1(this, continuationImpl);
        Object obj2 = scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotocontrolTakePhotoInteractor$takeAndSavePhoto$1.label;
        if (i != 0) {
        }
        this.b.a = (Uri) obj2;
        return zy11.a;
    }
}
