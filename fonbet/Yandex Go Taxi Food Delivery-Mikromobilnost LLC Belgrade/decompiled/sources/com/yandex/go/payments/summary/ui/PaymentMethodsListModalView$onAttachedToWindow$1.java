package com.yandex.go.payments.summary.ui;

import com.yandex.go.payments.paymentlist.data.EditModeState;
import com.yandex.go.payments.paymentlist.domain.converter.i;
import com.yandex.go.payments.paymentlist.domain.k;
import defpackage.lba0;
import defpackage.omn;
import defpackage.pmn;
import defpackage.qmn;
import defpackage.s9a0;
import defpackage.sls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class PaymentMethodsListModalView$onAttachedToWindow$1 extends FunctionReferenceImpl implements sls {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // defpackage.sls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        EditModeState editModeState;
        boolean a;
        k kVar = (k) this.receiver;
        pmn pmnVar = kVar.N;
        qmn qmnVar = pmnVar.a;
        int i = omn.a[((EditModeState) qmnVar.a.getValue()).ordinal()];
        if (i == 1) {
            editModeState = EditModeState.ENABLED;
        } else {
            if (i != 2) {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                a = pmnVar.a();
                lba0 lba0Var = kVar.M;
                if (a) {
                    i iVar = lba0Var.a;
                    s9a0 s9a0Var = lba0Var.b;
                    iVar.a = s9a0Var;
                    iVar.k.a = s9a0Var;
                } else {
                    i iVar2 = lba0Var.a;
                    s9a0 s9a0Var2 = lba0Var.c;
                    iVar2.a = s9a0Var2;
                    iVar2.k.a = s9a0Var2;
                }
                return zy11.a;
            }
            editModeState = EditModeState.DISABLED;
        }
        qmnVar.a.l(editModeState);
        a = pmnVar.a();
        lba0 lba0Var2 = kVar.M;
        if (a) {
        }
        return zy11.a;
    }
}
