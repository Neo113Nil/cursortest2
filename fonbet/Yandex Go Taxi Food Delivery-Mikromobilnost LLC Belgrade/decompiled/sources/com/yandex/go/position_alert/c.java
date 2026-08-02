package com.yandex.go.position_alert;

import com.yandex.go.position_alert.WarningModalView;
import defpackage.wnb0;

/* loaded from: classes13.dex */
public final class c implements WarningModalView.a {
    public final /* synthetic */ wnb0 a;

    public c(wnb0 wnb0Var) {
        this.a = wnb0Var;
    }

    @Override // com.yandex.go.position_alert.WarningModalView.a
    public final void f() {
    }

    @Override // com.yandex.go.position_alert.WarningModalView.a
    public final void onBackPressed() {
    }

    @Override // com.yandex.go.position_alert.WarningModalView.a
    public final void onDismiss() {
        this.a.run();
    }
}
