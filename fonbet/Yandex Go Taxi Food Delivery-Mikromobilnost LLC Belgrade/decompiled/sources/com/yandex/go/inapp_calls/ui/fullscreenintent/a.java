package com.yandex.go.inapp_calls.ui.fullscreenintent;

import android.content.Context;
import defpackage.ad5;
import defpackage.f9j0;
import defpackage.g9j0;
import defpackage.h9j0;
import defpackage.mjv;
import defpackage.njv;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.sue0;
import defpackage.y50;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.g;

/* loaded from: classes12.dex */
public final class a extends ad5 {
    public final y50 A;
    public final g B;
    public final o8g0 C;
    public final com.yandex.go.inapp_calls.interactor.permissions.a D;
    public final njv E;
    public pzt0 F;
    public final sue0 x;
    public final h9j0 y;
    public final Context z;

    public a(sue0 sue0Var, h9j0 h9j0Var, Context context, y50 y50Var, g gVar, o8g0 o8g0Var, com.yandex.go.inapp_calls.interactor.permissions.a aVar, njv njvVar) {
        super(g9j0.class);
        this.x = sue0Var;
        this.y = h9j0Var;
        this.z = context;
        this.A = y50Var;
        this.B = gVar;
        this.C = o8g0Var;
        this.D = aVar;
        this.E = njvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(a aVar, ContinuationImpl continuationImpl) {
        RequestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1 requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof RequestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1) {
            requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1 = (RequestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1) continuationImpl;
            int i2 = requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1.label;
                if (i != 0) {
                    b.b(obj);
                    g gVar = aVar.B;
                    requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1.label = 1;
                    if (gVar.d(HProv.PP_DELETE_SAVED_PASSWD, requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (aVar.C.c()) {
                    ((f9j0) aVar.x.b).r(new qu(9));
                }
                return zy11.a;
            }
        }
        requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1 = new RequestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1(aVar, continuationImpl);
        Object obj2 = requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1.label;
        if (i != 0) {
        }
        if (aVar.C.c()) {
        }
        return zy11.a;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        mjv mjvVar = this.E.b;
        mjvVar.getClass();
        mjvVar.a.a("InAppCalls.NotificationPermissionModal.Closed", new HashMap(), 1, new HashMap());
    }
}
