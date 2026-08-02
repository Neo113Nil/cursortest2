package com.ybsdk.widgets.common.snackbar;

import android.widget.PopupWindow;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class Snackbar$Companion$show$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        ((PopupWindow) this.receiver).dismiss();
        return zy11.a;
    }
}
