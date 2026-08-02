package xsna;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.n7r0;
import xsna.qr9;

/* compiled from: SakCaptchaFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class uzg0 implements or9, g0t {
    public final /* synthetic */ vzg0 b;

    public uzg0(vzg0 vzg0Var) {
        this.b = vzg0Var;
    }

    @Override // xsna.or9
    public final void a(qr9 qr9Var) {
        boolean z = qr9Var instanceof qr9.b;
        int i = 10;
        vzg0 vzg0Var = this.b;
        if (z) {
            EditText editText = vzg0Var.f1;
            if (editText != null) {
                editText.requestFocus();
            }
            View view = vzg0Var.h1;
            if (view != null) {
                view.post(new ou5(vzg0Var, i));
            }
            FragmentActivity activity = vzg0Var.getActivity();
            if (activity != null) {
                activity.setVolumeControlStream(Integer.MIN_VALUE);
            }
            vzg0Var.k1 = false;
        } else {
            n7r0.c cVar = vzg0.p1;
            FragmentActivity activity2 = vzg0Var.getActivity();
            if (activity2 != null) {
                activity2.setVolumeControlStream(10);
            }
            vzg0Var.k1 = true;
        }
        if (qr9Var instanceof qr9.a) {
            vzg0.p1 = new n7r0.c(((qr9.a) qr9Var).b, true, false, false);
            vzg0Var.j1 = true;
            yhr0.b();
            Dialog dialog = vzg0Var.s;
            if (dialog != null) {
                dialog.cancel();
            }
        }
        qfk0 qfk0Var = vzg0Var.l1;
        if (qfk0Var != null) {
            qfk0Var.a(qr9Var);
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
        return new FunctionReferenceImpl(1, this.b, vzg0.class, "onSoundCaptchaStatusChanged", "onSoundCaptchaStatusChanged(Lcom/vk/auth/captcha/impl/base/CaptchaStatus;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
