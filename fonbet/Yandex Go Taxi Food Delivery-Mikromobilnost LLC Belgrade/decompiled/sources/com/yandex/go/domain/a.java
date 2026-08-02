package com.yandex.go.domain;

import com.yandex.go.data.api.UserPhotoUploadingApi;
import com.yandex.go.data.entities.network.UserUploadPhotoResponse;
import defpackage.brb1;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.kr21;
import defpackage.lr21;
import defpackage.m5j0;
import defpackage.ny61;
import defpackage.on2;
import defpackage.sq21;
import defpackage.tq21;
import defpackage.wms;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements sq21 {
    public final i3y a;

    public a(on2 on2Var) {
        this.a = kotlin.a.a(new tq21(on2Var, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(byte[] bArr, Boolean bool, Boolean bool2, ContinuationImpl continuationImpl) {
        UserPhotoUploadApiInteractorImpl$upload$1 userPhotoUploadApiInteractorImpl$upload$1;
        int i;
        if (continuationImpl instanceof UserPhotoUploadApiInteractorImpl$upload$1) {
            userPhotoUploadApiInteractorImpl$upload$1 = (UserPhotoUploadApiInteractorImpl$upload$1) continuationImpl;
            int i2 = userPhotoUploadApiInteractorImpl$upload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userPhotoUploadApiInteractorImpl$upload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userPhotoUploadApiInteractorImpl$upload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userPhotoUploadApiInteractorImpl$upload$1.label;
                if (i != 0) {
                    b.b(obj);
                    int i3 = m5j0.a;
                    cmt<UserUploadPhotoResponse> a = ((UserPhotoUploadingApi) this.a.getValue()).a(brb1.b("image", "image", wms.b(7, null, bArr)), bool, bool2);
                    userPhotoUploadApiInteractorImpl$upload$1.L$0 = null;
                    userPhotoUploadApiInteractorImpl$upload$1.L$1 = null;
                    userPhotoUploadApiInteractorImpl$upload$1.L$2 = null;
                    userPhotoUploadApiInteractorImpl$upload$1.L$3 = null;
                    userPhotoUploadApiInteractorImpl$upload$1.L$4 = null;
                    userPhotoUploadApiInteractorImpl$upload$1.L$5 = this;
                    userPhotoUploadApiInteractorImpl$upload$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.d(a, userPhotoUploadApiInteractorImpl$upload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) userPhotoUploadApiInteractorImpl$upload$1.L$5;
                    b.b(obj);
                }
                UserUploadPhotoResponse userUploadPhotoResponse = (UserUploadPhotoResponse) obj;
                this.getClass();
                String a2 = userUploadPhotoResponse.getA();
                String b = userUploadPhotoResponse.getB();
                UserUploadPhotoResponse.Bdui c = userUploadPhotoResponse.getC();
                return new lr21(a2, b, c != null ? new kr21(c.getA()) : null);
            }
        }
        userPhotoUploadApiInteractorImpl$upload$1 = new UserPhotoUploadApiInteractorImpl$upload$1(this, continuationImpl);
        Object obj2 = userPhotoUploadApiInteractorImpl$upload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userPhotoUploadApiInteractorImpl$upload$1.label;
        if (i != 0) {
        }
        UserUploadPhotoResponse userUploadPhotoResponse2 = (UserUploadPhotoResponse) obj2;
        this.getClass();
        String a22 = userUploadPhotoResponse2.getA();
        String b2 = userUploadPhotoResponse2.getB();
        UserUploadPhotoResponse.Bdui c2 = userUploadPhotoResponse2.getC();
        return new lr21(a22, b2, c2 != null ? new kr21(c2.getA()) : null);
    }
}
