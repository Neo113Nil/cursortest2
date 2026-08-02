package com.ybsdk.feature.autotopup.internal.presentation.saver;

import android.net.Uri;
import defpackage.iw3;
import defpackage.sv3;
import defpackage.tls;
import defpackage.uc5;
import defpackage.v0h;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class RoundingFragment$renderDivView$1$3 extends FunctionReferenceImpl implements tls {
    public RoundingFragment$renderDivView$1$3(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onDivAction", "onDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        iw3 iw3Var = ((b) this.receiver).H;
        return Boolean.valueOf(((sv3) iw3Var).a.c(((Uri) obj).toString()).a instanceof v0h);
    }
}
