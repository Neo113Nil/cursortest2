package com.ybsdk.screens.upgrade.presentation.edit;

import defpackage.ca21;
import defpackage.tls;
import defpackage.uc5;
import defpackage.z921;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class UpgradeEditFragment$getViewHelperFor$adapter$1 extends FunctionReferenceImpl implements tls {
    public UpgradeEditFragment$getViewHelperFor$adapter$1(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onSuggestClicked", "onSuggestClicked(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        b bVar = (b) this.receiver;
        ca21 ca21Var = bVar.I;
        bVar.I = ca21Var != null ? new ca21(ca21Var.a, true, ca21Var.c) : null;
        bVar.B.c(((z921) bVar.X()).a, str);
        return zy11.a;
    }
}
