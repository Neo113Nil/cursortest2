package com.yandex.go.trusted_contacts.ui;

import defpackage.jl40;
import defpackage.sh11;
import defpackage.vh11;
import defpackage.wh11;
import defpackage.wls;
import defpackage.xh11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class TrustedContactsPresenter$attachView$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        xh11 xh11Var = (xh11) obj;
        xh11 xh11Var2 = (xh11) obj2;
        ((sh11) this.receiver).getClass();
        return Boolean.valueOf(((xh11Var instanceof vh11) && (xh11Var2 instanceof vh11)) ? jl40.l(((vh11) xh11Var).a, ((vh11) xh11Var2).a) : (xh11Var instanceof wh11) && (xh11Var2 instanceof wh11));
    }
}
