package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation;

import android.os.Bundle;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResult;
import defpackage.jl40;
import defpackage.tj01;
import defpackage.vj01;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final class a implements wls {
    public final tj01 a;
    public final vj01 b;

    public a(tj01 tj01Var, vj01 vj01Var) {
        this.a = tj01Var;
        this.b = vj01Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TransferRequisiteResult.Companion.getClass();
        TransferRequisiteResult transferRequisiteResult = (TransferRequisiteResult) ((Bundle) obj2).getParcelable("TransferRequisiteResult");
        if (jl40.l(transferRequisiteResult, TransferRequisiteResult.Close.INSTANCE)) {
            this.b.invoke();
        } else if (transferRequisiteResult instanceof TransferRequisiteResult.Success) {
            this.a.invoke(((TransferRequisiteResult.Success) transferRequisiteResult).getRequisiteResult());
        } else if (transferRequisiteResult != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
