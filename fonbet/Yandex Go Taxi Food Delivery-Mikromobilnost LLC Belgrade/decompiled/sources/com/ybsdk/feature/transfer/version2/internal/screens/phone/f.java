package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import android.os.Bundle;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneSelectionResult;
import defpackage.uj01;
import defpackage.vj01;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final class f implements wls {
    public final uj01 a;
    public final vj01 b;

    public f(uj01 uj01Var, vj01 vj01Var) {
        this.a = uj01Var;
        this.b = vj01Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransferPhoneSelectionResult.Companion.getClass();
        TransferPhoneSelectionResult transferPhoneSelectionResult = (TransferPhoneSelectionResult) ((Bundle) obj2).getParcelable("TransferPhoneSelectionResult");
        if (transferPhoneSelectionResult != null) {
            if (transferPhoneSelectionResult.equals(TransferPhoneSelectionResult.Close.INSTANCE)) {
                this.b.invoke();
            } else {
                if (!(transferPhoneSelectionResult instanceof TransferPhoneSelectionResult.Success)) {
                    w511.b();
                    return null;
                }
                TransferPhoneSelectionResult.Success success = (TransferPhoneSelectionResult.Success) transferPhoneSelectionResult;
                this.a.invoke(success.getPartner(), success.getInputSource());
            }
        }
        return zy11.a;
    }
}
