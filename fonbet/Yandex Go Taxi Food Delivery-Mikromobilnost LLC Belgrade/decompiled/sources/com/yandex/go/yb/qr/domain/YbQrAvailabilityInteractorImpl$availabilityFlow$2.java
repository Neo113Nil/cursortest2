package com.yandex.go.yb.qr.domain;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.yb.api.domain.model.YbActivationStatus;
import defpackage.bms;
import defpackage.gu51;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class YbQrAvailabilityInteractorImpl$availabilityFlow$2 extends AdaptedFunctionReference implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        YbActivationStatus ybActivationStatus = (YbActivationStatus) obj;
        Screen screen = (Screen) obj2;
        gu51 gu51Var = (gu51) obj3;
        ((c) this.receiver).getClass();
        return Boolean.valueOf(ybActivationStatus == YbActivationStatus.ACTIVATED && screen == Screen.MAIN_V4 && gu51Var != null);
    }
}
