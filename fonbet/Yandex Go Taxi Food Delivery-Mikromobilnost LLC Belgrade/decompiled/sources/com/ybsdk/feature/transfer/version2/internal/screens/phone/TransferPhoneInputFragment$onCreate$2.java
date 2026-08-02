package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransferPhoneInputFragment$onCreate$2 extends FunctionReferenceImpl implements tls {
    public TransferPhoneInputFragment$onCreate$2(uc5 uc5Var) {
        super(1, uc5Var, c.class, "onBankSelected", "onBankSelected(Lcom/ybsdk/feature/partnerselection/api/SelectedPartner;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((c) this.receiver).l0((SelectedPartner) obj);
        return zy11.a;
    }
}
