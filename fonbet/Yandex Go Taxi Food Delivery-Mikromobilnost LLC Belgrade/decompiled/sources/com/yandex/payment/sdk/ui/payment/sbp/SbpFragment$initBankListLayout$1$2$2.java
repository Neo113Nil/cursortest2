package com.yandex.payment.sdk.ui.payment.sbp;

import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.w511;
import defpackage.wls;
import defpackage.y22;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class SbpFragment$initBankListLayout$1$2$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        ((Number) obj2).intValue();
        d dVar = (d) this.receiver;
        rwo rwoVar = dVar.A;
        dVar.G = str;
        int i = b.a[dVar.J.ordinal()];
        if (i != 1) {
            if (i == 2) {
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.p0(str));
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.q0(str));
            }
        }
        return zy11.a;
    }
}
