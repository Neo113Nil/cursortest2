package com.ybsdk.feature.status.screen.internal.ui;

import android.net.Uri;
import defpackage.esl;
import defpackage.tls;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.z2z;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class DivkitCommonFragment$initToolbarDivViews$divView$1$1 extends FunctionReferenceImpl implements tls {
    public DivkitCommonFragment$initToolbarDivViews$divView$1$1(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onDivAction", "onDivAction(Landroid/net/Uri;)Z", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        z2z c = ((esl) ((a) this.receiver).G).a.c(((Uri) obj).toString());
        return Boolean.valueOf(c.b || (c.a instanceof v0h));
    }
}
