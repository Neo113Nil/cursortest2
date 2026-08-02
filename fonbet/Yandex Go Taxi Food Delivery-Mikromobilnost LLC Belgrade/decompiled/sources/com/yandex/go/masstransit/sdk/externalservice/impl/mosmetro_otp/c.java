package com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp;

import com.yandex.go.masstransit.sdk.externalservice.api.mosmetro_otp.model.MosmetroOtpError;
import defpackage.ny61;
import defpackage.s930;
import defpackage.t930;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository.a a;

    public c(com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.repository.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, t930 t930Var, ContinuationImpl continuationImpl) {
        MosmetroOtpUiActionInteractor$handleExchangingOtp$1 mosmetroOtpUiActionInteractor$handleExchangingOtp$1;
        Object obj;
        int i;
        if (continuationImpl instanceof MosmetroOtpUiActionInteractor$handleExchangingOtp$1) {
            mosmetroOtpUiActionInteractor$handleExchangingOtp$1 = (MosmetroOtpUiActionInteractor$handleExchangingOtp$1) continuationImpl;
            int i2 = mosmetroOtpUiActionInteractor$handleExchangingOtp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mosmetroOtpUiActionInteractor$handleExchangingOtp$1.label = i2 - Integer.MIN_VALUE;
                obj = mosmetroOtpUiActionInteractor$handleExchangingOtp$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mosmetroOtpUiActionInteractor$handleExchangingOtp$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mosmetroOtpUiActionInteractor$handleExchangingOtp$1.L$0 = null;
                    mosmetroOtpUiActionInteractor$handleExchangingOtp$1.L$1 = t930Var;
                    mosmetroOtpUiActionInteractor$handleExchangingOtp$1.label = 1;
                    obj = this.a.a(str, mosmetroOtpUiActionInteractor$handleExchangingOtp$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t930Var = (t930) mosmetroOtpUiActionInteractor$handleExchangingOtp$1.L$1;
                    kotlin.b.b(obj);
                }
                if (((MosmetroOtpError) obj) == null) {
                    b bVar = t930Var.a;
                    bVar.r(new s930(bVar, i3));
                }
                return zy11.a;
            }
        }
        mosmetroOtpUiActionInteractor$handleExchangingOtp$1 = new MosmetroOtpUiActionInteractor$handleExchangingOtp$1(this, continuationImpl);
        obj = mosmetroOtpUiActionInteractor$handleExchangingOtp$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mosmetroOtpUiActionInteractor$handleExchangingOtp$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        if (((MosmetroOtpError) obj) == null) {
        }
        return zy11.a;
    }
}
