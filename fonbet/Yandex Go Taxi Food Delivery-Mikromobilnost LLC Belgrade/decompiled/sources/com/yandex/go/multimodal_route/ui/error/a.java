package com.yandex.go.multimodal_route.ui.error;

import com.yandex.go.multimodal_route.experiement.c;
import defpackage.fao;
import defpackage.kyh0;
import defpackage.mja1;
import defpackage.ny61;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MultimodalRouteErrorUiStateInteractor$getUiState$1 multimodalRouteErrorUiStateInteractor$getUiState$1;
        int i;
        if (continuationImpl instanceof MultimodalRouteErrorUiStateInteractor$getUiState$1) {
            multimodalRouteErrorUiStateInteractor$getUiState$1 = (MultimodalRouteErrorUiStateInteractor$getUiState$1) continuationImpl;
            int i2 = multimodalRouteErrorUiStateInteractor$getUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteErrorUiStateInteractor$getUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteErrorUiStateInteractor$getUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteErrorUiStateInteractor$getUiState$1.label;
                if (i != 0) {
                    b.b(obj);
                    multimodalRouteErrorUiStateInteractor$getUiState$1.label = 1;
                    obj = this.a.a(multimodalRouteErrorUiStateInteractor$getUiState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                String str = (String) obj;
                return new fao(kyh0.mt_mosmetro_otp_error_popup_title, kyh0.mt_mosmetro_otp_error_popup_button_text, kyh0.mt_mosmetro_otp_error_popup_subtitle, str != null ? mja1.a(str, null, 6) : null);
            }
        }
        multimodalRouteErrorUiStateInteractor$getUiState$1 = new MultimodalRouteErrorUiStateInteractor$getUiState$1(this, continuationImpl);
        Object obj2 = multimodalRouteErrorUiStateInteractor$getUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteErrorUiStateInteractor$getUiState$1.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        return new fao(kyh0.mt_mosmetro_otp_error_popup_title, kyh0.mt_mosmetro_otp_error_popup_button_text, kyh0.mt_mosmetro_otp_error_popup_subtitle, str2 != null ? mja1.a(str2, null, 6) : null);
    }
}
