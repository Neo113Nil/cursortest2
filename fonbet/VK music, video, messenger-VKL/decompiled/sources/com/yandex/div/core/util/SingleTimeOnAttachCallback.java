package com.yandex.div.core.util;

import android.view.View;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: Views.kt */
/* loaded from: classes7.dex */
public final class SingleTimeOnAttachCallback {
    private gzs<s3q0> onAttachAction;

    public SingleTimeOnAttachCallback(View view, gzs<s3q0> gzsVar) {
        this.onAttachAction = gzsVar;
        if (view.isAttachedToWindow()) {
            onAttach();
        }
    }

    public final void cancel() {
        this.onAttachAction = null;
    }

    public final void onAttach() {
        gzs<s3q0> gzsVar = this.onAttachAction;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        this.onAttachAction = null;
    }
}
