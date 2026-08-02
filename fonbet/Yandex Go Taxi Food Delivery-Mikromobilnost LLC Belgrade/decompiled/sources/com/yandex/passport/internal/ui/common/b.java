package com.yandex.passport.internal.ui.common;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import defpackage.ins0;
import defpackage.shd;

/* loaded from: classes2.dex */
public final class b extends ins0 {
    public final ComposeView D;

    static {
        shd shdVar = ComposeView.Companion;
    }

    public b(ComposeView composeView) {
        this.D = composeView;
    }

    @Override // defpackage.ins0
    public final View e() {
        return this.D;
    }
}
