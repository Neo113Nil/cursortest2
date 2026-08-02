package com.yandex.passport.internal.ui.bouncer.error;

import android.content.Intent;
import com.yandex.passport.data.models.PhoneConfirmationResult;
import com.yandex.passport.internal.ui.bouncer.v;
import com.yandex.passport.internal.ui.domik.call.CallConfirmFragment;
import com.yandex.passport.internal.ui.router.GlobalRouterBackground;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import defpackage.f530;
import defpackage.fid;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 onViewCreated$lambda$4;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                o.a((v) obj3, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.ui.challenge.delete.g.b((tls) obj3, (fid) obj, vng.O(1));
                break;
            case 2:
                onViewCreated$lambda$4 = CallConfirmFragment.onViewCreated$lambda$4((CallConfirmFragment) obj3, (String) obj, ((Boolean) obj2).booleanValue());
                break;
            case 3:
                ((com.yandex.passport.internal.ui.domik.common.e) obj3).C.m((PhoneConfirmationResult) obj2);
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.ui.router.f.a((GlobalRouterBackground) obj3, (fid) obj, vng.O(1));
                break;
            case 5:
                BiometricVerificationActivity biometricVerificationActivity = (BiometricVerificationActivity) obj3;
                int intValue = ((Integer) obj).intValue();
                Intent intent = new Intent();
                intent.putExtra("track_id", (String) obj2);
                biometricVerificationActivity.setResult(intValue, intent);
                biometricVerificationActivity.finish();
                break;
            case 6:
                RegisterWebAuthNActivity registerWebAuthNActivity = (RegisterWebAuthNActivity) obj3;
                registerWebAuthNActivity.setResult(((Integer) obj).intValue(), (Intent) obj2);
                registerWebAuthNActivity.finish();
                break;
            default:
                ((Integer) obj2).getClass();
                com.yandex.passport.user_id.ui.f.a((f530) obj3, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ n(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
