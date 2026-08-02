package com.ybsdk.feature.transfer.api;

import android.os.Bundle;
import com.ybsdk.feature.transfer.api.TransferTargetSelectionResult;
import defpackage.bgc;
import defpackage.jl40;
import defpackage.sls;
import defpackage.tls;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final class a implements wls {
    public final tls a;
    public final sls b;

    public /* synthetic */ a(tls tlsVar) {
        this(new bgc(12), tlsVar);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransferTargetSelectionResult.Companion.getClass();
        TransferTargetSelectionResult transferTargetSelectionResult = (TransferTargetSelectionResult) ((Bundle) obj2).getParcelable("TransferResult");
        if (jl40.l(transferTargetSelectionResult, TransferTargetSelectionResult.Close.INSTANCE)) {
            this.b.invoke();
        } else if (transferTargetSelectionResult instanceof TransferTargetSelectionResult.Success) {
            this.a.invoke(((TransferTargetSelectionResult.Success) transferTargetSelectionResult).getTarget());
        } else if (transferTargetSelectionResult != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    public a(sls slsVar, tls tlsVar) {
        this.a = tlsVar;
        this.b = slsVar;
    }
}
