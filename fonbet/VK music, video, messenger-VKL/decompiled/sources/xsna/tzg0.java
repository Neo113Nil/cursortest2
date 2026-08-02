package xsna;

import android.app.Dialog;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.n7r0;
import xsna.qr9;

/* compiled from: SakCaptchaFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class tzg0 implements or9, g0t {
    public final /* synthetic */ vzg0 b;

    public tzg0(vzg0 vzg0Var) {
        this.b = vzg0Var;
    }

    @Override // xsna.or9
    public final void a(qr9 qr9Var) {
        boolean z = qr9Var instanceof qr9.a;
        vzg0 vzg0Var = this.b;
        if (z) {
            n7r0.c cVar = vzg0.p1;
            vzg0.p1 = new n7r0.c(((qr9.a) qr9Var).b, false, false, false);
            vzg0Var.j1 = true;
            yhr0.b();
            Dialog dialog = vzg0Var.s;
            if (dialog != null) {
                dialog.cancel();
            }
        }
        ogw ogwVar = vzg0Var.o1;
        if (ogwVar != null) {
            View view = ogwVar.k;
            View view2 = ogwVar.j;
            if (qr9Var instanceof qr9.c) {
                ogwVar.a(false);
                ogwVar.c(false);
                ogwVar.b(((qr9.c) qr9Var).b);
                view2.setVisibility(0);
                view.setVisibility(8);
                return;
            }
            if (qr9Var instanceof qr9.d) {
                ogwVar.c(qr9Var.a() == 0);
                ogwVar.a(false);
                ogwVar.b(((qr9.d) qr9Var).b);
                view2.setVisibility(8);
                view.setVisibility(0);
                return;
            }
            if (qr9Var instanceof qr9.e) {
                ogwVar.c(qr9Var.a() == 0);
                ogwVar.a(qr9Var.a() == 0);
                ogwVar.b(((qr9.e) qr9Var).c);
                view2.setVisibility(8);
                view.setVisibility(8);
                return;
            }
            if (z) {
                ogwVar.c(false);
                ogwVar.a(false);
                ogwVar.b(((qr9.a) qr9Var).c);
            } else {
                if (!(qr9Var instanceof qr9.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ogwVar.c(false);
                ogwVar.a(false);
                ogwVar.b(((qr9.b) qr9Var).b);
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof or9) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, vzg0.class, "onImageCaptchaStatusChanged", "onImageCaptchaStatusChanged(Lcom/vk/auth/captcha/impl/base/CaptchaStatus;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
