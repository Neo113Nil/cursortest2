package com.yandex.go.tariffcard.ui.adapter.header;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import defpackage.efx0;
import defpackage.hxx;
import defpackage.iix0;
import defpackage.m950;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class HeaderViewHolderDelegateFactory$create$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        iix0 iix0Var = (iix0) this.receiver;
        pex0 m = ((k) iix0Var.z).m();
        if (m != null) {
            Zone zone = ((k) iix0Var.P).j().c;
            ((pep0) iix0Var.D).f((m950) iix0Var.B.get(), new efx0(zone, m), hxx.a);
        }
        return zy11.a;
    }
}
