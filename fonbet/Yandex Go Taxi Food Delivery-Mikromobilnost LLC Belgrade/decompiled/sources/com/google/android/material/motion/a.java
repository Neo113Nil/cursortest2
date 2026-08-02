package com.google.android.material.motion;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import defpackage.b710;
import defpackage.c710;
import defpackage.je4;

/* loaded from: classes11.dex */
public final class a extends c710 {
    @Override // defpackage.c710
    public final OnBackInvokedCallback a(final b710 b710Var) {
        return new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate$1
            public void onBackCancelled() {
                if (a.this.a != null) {
                    b710Var.cancelBackProgress();
                }
            }

            public void onBackInvoked() {
                b710Var.handleBackInvoked();
            }

            public void onBackProgressed(BackEvent backEvent) {
                if (a.this.a != null) {
                    b710Var.updateBackProgress(new je4(backEvent));
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                if (a.this.a != null) {
                    b710Var.startBackProgress(new je4(backEvent));
                }
            }
        };
    }
}
