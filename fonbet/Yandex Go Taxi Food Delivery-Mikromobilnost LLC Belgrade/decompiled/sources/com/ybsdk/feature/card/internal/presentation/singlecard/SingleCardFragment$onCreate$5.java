package com.ybsdk.feature.card.internal.presentation.singlecard;

import defpackage.rgs0;
import defpackage.tls;
import defpackage.uc5;
import defpackage.x4c;
import defpackage.zqj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class SingleCardFragment$onCreate$5 extends FunctionReferenceImpl implements tls {
    public SingleCardFragment$onCreate$5(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onRequisites2faSuccess", "onRequisites2faSuccess(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        a aVar = (a) this.receiver;
        zqj0 zqj0Var = ((rgs0) aVar.X()).e;
        if (zqj0Var == null) {
            x4c.g("Failed to process requisites 2fa requisites2faData null", null, null, null, 14);
        } else {
            aVar.n0(zqj0Var.b, zqj0Var.c, str, zqj0Var.a, zqj0Var.d);
        }
        return zy11.a;
    }
}
