package com.google.ar.core;

import android.view.View;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* loaded from: classes11.dex */
final class s implements View.OnClickListener {
    final /* synthetic */ InstallActivity a;
    private final /* synthetic */ int b;

    public s(InstallActivity installActivity, int i) {
        this.b = i;
        this.a = installActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            this.a.c(new UnavailableUserDeclinedInstallationException());
        } else {
            this.a.b();
            this.a.d();
        }
    }
}
