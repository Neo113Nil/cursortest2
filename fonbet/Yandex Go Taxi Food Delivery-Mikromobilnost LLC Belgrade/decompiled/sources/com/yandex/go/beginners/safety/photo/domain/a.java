package com.yandex.go.beginners.safety.photo.domain;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.go.beginners.safety.photo.main.c;
import defpackage.a60;
import defpackage.m950;
import defpackage.ny61;
import defpackage.rwl0;
import defpackage.swl0;
import defpackage.v7j0;
import defpackage.y50;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.g;

/* loaded from: classes12.dex */
public final class a {
    public final Context a;
    public final g b;
    public final y50 c;
    public final com.yandex.go.navigation.activity.b d;
    public final v7j0 e;

    public a(Context context, g gVar, y50 y50Var, com.yandex.go.navigation.activity.b bVar, v7j0 v7j0Var) {
        this.a = context;
        this.b = gVar;
        this.c = y50Var;
        this.d = bVar;
        this.e = v7j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(swl0 swl0Var, ContinuationImpl continuationImpl) {
        SafetyPhotoPickerInteractor$launchSelfie$1 safetyPhotoPickerInteractor$launchSelfie$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof SafetyPhotoPickerInteractor$launchSelfie$1) {
            safetyPhotoPickerInteractor$launchSelfie$1 = (SafetyPhotoPickerInteractor$launchSelfie$1) continuationImpl;
            int i2 = safetyPhotoPickerInteractor$launchSelfie$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyPhotoPickerInteractor$launchSelfie$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyPhotoPickerInteractor$launchSelfie$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyPhotoPickerInteractor$launchSelfie$1.label;
                v7j0 v7j0Var = this.e;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    safetyPhotoPickerInteractor$launchSelfie$1.L$0 = swl0Var;
                    safetyPhotoPickerInteractor$launchSelfie$1.label = 1;
                    obj = ((com.yandex.go.permission.b) v7j0Var).d(3, safetyPhotoPickerInteractor$launchSelfie$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    swl0Var = (swl0) safetyPhotoPickerInteractor$launchSelfie$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                zy11 zy11Var = zy11.a;
                if (!booleanValue) {
                    switch (swl0Var.a) {
                        case 0:
                            c cVar = (c) swl0Var.b;
                            cVar.z((m950) cVar.I.get(), new rwl0(cVar, 0));
                            return zy11Var;
                        default:
                            com.yandex.go.beginners.safety.photo.upload.b bVar = (com.yandex.go.beginners.safety.photo.upload.b) swl0Var.b;
                            bVar.z((m950) bVar.K.get(), new rwl0(bVar, i3));
                            return zy11Var;
                    }
                }
                if (!((com.yandex.go.permission.b) v7j0Var).f(3)) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    Context context = this.a;
                    intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        a60 a60Var = (a60) this.c;
                        a60Var.getClass();
                        try {
                            a60Var.e(HProv.PP_DELETE_SAVED_PASSWD, intent);
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                }
                swl0Var.getClass();
                return zy11Var;
            }
        }
        safetyPhotoPickerInteractor$launchSelfie$1 = new SafetyPhotoPickerInteractor$launchSelfie$1(this, continuationImpl);
        Object obj2 = safetyPhotoPickerInteractor$launchSelfie$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyPhotoPickerInteractor$launchSelfie$1.label;
        v7j0 v7j0Var2 = this.e;
        int i32 = 1;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        zy11 zy11Var2 = zy11.a;
        if (!booleanValue) {
        }
    }
}
