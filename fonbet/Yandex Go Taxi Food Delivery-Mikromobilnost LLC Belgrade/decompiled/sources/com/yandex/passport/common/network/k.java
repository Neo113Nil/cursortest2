package com.yandex.passport.common.network;

import defpackage.dcx;
import defpackage.myi;
import defpackage.qcx;
import defpackage.qoi0;
import kotlinx.serialization.KSerializer;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes15.dex */
public final class k extends dcx {
    public final /* synthetic */ int d;
    public final KSerializer e;
    public final KSerializer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        super(qoi0.a(j.class));
        this.d = i;
        switch (i) {
            case 1:
                super(qoi0.a(j.class));
                this.e = kSerializer;
                this.f = kSerializer2;
                break;
            default:
                this.e = kSerializer;
                this.f = kSerializer2;
                break;
        }
    }

    @Override // defpackage.dcx
    public final myi c(kotlinx.serialization.json.b bVar) {
        int i = this.d;
        KSerializer kSerializer = this.f;
        KSerializer kSerializer2 = this.e;
        switch (i) {
            case 0:
                kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) qcx.m(bVar).get(ACSPConstants.STATUS);
                if (bVar2 != null) {
                    kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) qcx.m(bVar2).get(ACSPConstants.STATUS);
                    if (!String.valueOf(bVar3 != null ? qcx.n(bVar3) : null).equals("1")) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                if (qcx.m(bVar).get("error") != null) {
                    break;
                } else {
                    break;
                }
        }
        return new n(kSerializer);
    }
}
