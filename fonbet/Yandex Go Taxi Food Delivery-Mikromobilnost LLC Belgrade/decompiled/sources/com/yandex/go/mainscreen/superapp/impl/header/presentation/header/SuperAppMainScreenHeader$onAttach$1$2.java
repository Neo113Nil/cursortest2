package com.yandex.go.mainscreen.superapp.impl.header.presentation.header;

import com.yandex.go.address.models.Address;
import defpackage.h0w0;
import defpackage.jxx;
import defpackage.pep0;
import defpackage.sls;
import defpackage.u9w0;
import defpackage.v9w0;
import defpackage.y9y0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class SuperAppMainScreenHeader$onAttach$1$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        h0w0 h0w0Var = (h0w0) this.receiver;
        h0w0Var.A.a();
        Address h = ((y9y0) h0w0Var.z.j.get()).h();
        if (h != null) {
            ((pep0) h0w0Var.C).f((v9w0) h0w0Var.D.getValue(), new u9w0(h), new jxx(true));
        }
        return zy11.a;
    }
}
