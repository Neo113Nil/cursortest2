package com.yandex.mobile.drive.view;

import com.yandex.mobile.drive.view.AlertView;
import defpackage.mx60;

/* loaded from: classes15.dex */
public final class a extends mx60 {
    public final /* synthetic */ AlertView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AlertView alertView) {
        super(true);
        this.d = alertView;
    }

    @Override // defpackage.mx60
    public final void d() {
        AlertView.State state;
        AlertView alertView = this.d;
        state = alertView.state;
        if (state != AlertView.State.Closed) {
            alertView.dismissWithCancellation();
        }
    }
}
