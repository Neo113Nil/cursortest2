package com.yandex.passport.common.network;

import defpackage.dcx;
import defpackage.myi;
import defpackage.qcx;
import defpackage.qoi0;
import defpackage.w511;
import kotlinx.serialization.KSerializer;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class l extends dcx {
    public final KSerializer d;
    public final KSerializer e;

    public l(KSerializer kSerializer, KSerializer kSerializer2) {
        super(qoi0.a(j.class));
        this.d = kSerializer;
        this.e = kSerializer2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r4.equals(com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks.OK) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return new com.yandex.passport.common.network.q(r3.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r4.equals("success") != false) goto L22;
     */
    @Override // defpackage.dcx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final myi c(kotlinx.serialization.json.b bVar) {
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) qcx.m(bVar).get(ACSPConstants.STATUS);
        String a = bVar2 != null ? qcx.n(bVar2).a() : null;
        if (a != null) {
            int hashCode = a.hashCode();
            if (hashCode != -1867169789) {
                if (hashCode != 3548) {
                    if (hashCode == 96784904 && a.equals("error")) {
                        return new n(this.e);
                    }
                }
            }
        }
        w511.s("Unknown Module: key 'type' not found or does not matches any module type");
        return null;
    }
}
