package defpackage;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.i750;
import defpackage.j750;
import defpackage.jx60;
import defpackage.l750;
import defpackage.ny61;
import defpackage.p750;
import defpackage.q750;
import defpackage.r750;
import defpackage.rrb1;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public abstract class jx60 extends o750 {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public jx60(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.c = onBackInvokedDispatcher;
        this.d = i;
        this.e = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: ix60
            public final void onBackInvoked() {
                jx60.this.a();
            }
        } : new OnBackAnimationCallback() { // from class: androidx.navigationevent.OnBackInvokedInput$createOnBackAnimationCallback$1
            public void onBackCancelled() {
                jx60 jx60Var = jx60.this;
                j750 j750Var = jx60Var.a;
                if (j750Var == null) {
                    ny61.r("This input is not added to any dispatcher.");
                    return;
                }
                if (!jx60Var.b) {
                    j750Var.d(jx60Var, null);
                }
                if (j750Var.b) {
                    p750 p750Var = j750Var.c;
                    if (jx60Var.equals(p750Var.h) && -1 == p750Var.g) {
                        l750 l750Var = p750Var.f;
                        if (l750Var == null) {
                            l750Var = p750Var.c(-1);
                        }
                        p750Var.f = null;
                        p750Var.g = 0;
                        p750Var.h = null;
                        if (l750Var != null) {
                            l750Var.b();
                        }
                        r0 r0Var = p750Var.a;
                        q750 q750Var = q750.f;
                        r0Var.getClass();
                        r0Var.m(null, q750Var);
                    }
                }
                jx60Var.b = false;
            }

            public void onBackInvoked() {
                jx60.this.a();
            }

            public void onBackProgressed(BackEvent backEvent) {
                jx60 jx60Var = jx60.this;
                i750 a = rrb1.a(backEvent);
                j750 j750Var = jx60Var.a;
                if (j750Var == null) {
                    ny61.r("This input is not added to any dispatcher.");
                    return;
                }
                if (jx60Var.b && j750Var.b) {
                    p750 p750Var = j750Var.c;
                    if (jx60Var.equals(p750Var.h) && -1 == p750Var.g) {
                        l750 l750Var = p750Var.f;
                        if (l750Var == null) {
                            l750Var = p750Var.c(-1);
                        }
                        if (l750Var != null) {
                            l750Var.d(a);
                        }
                        r0 r0Var = p750Var.a;
                        r750 r750Var = new r750(a);
                        r0Var.getClass();
                        r0Var.m(null, r750Var);
                    }
                }
            }

            public void onBackStarted(BackEvent backEvent) {
                jx60 jx60Var = jx60.this;
                i750 a = rrb1.a(backEvent);
                j750 j750Var = jx60Var.a;
                if (j750Var == null) {
                    ny61.r("This input is not added to any dispatcher.");
                } else {
                    if (jx60Var.b) {
                        return;
                    }
                    j750Var.d(jx60Var, a);
                    jx60Var.b = true;
                }
            }
        };
    }

    @Override // defpackage.o750
    public final void b(boolean z) {
        if (z && !this.f) {
            this.c.registerOnBackInvokedCallback(this.d, this.e);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            this.c.unregisterOnBackInvokedCallback(this.e);
            this.f = false;
        }
    }
}
