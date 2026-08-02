package androidx.biometric;

import android.content.DialogInterface;
import android.os.Looper;
import defpackage.ay5;
import defpackage.cy5;
import defpackage.dy40;
import defpackage.gx5;
import defpackage.md6;
import defpackage.mrj;
import defpackage.yr31;
import defpackage.yx5;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public class BiometricViewModel extends yr31 {
    public DialogInterface.OnClickListener A;
    public String B;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public dy40 I;
    public dy40 J;
    public dy40 K;
    public dy40 L;
    public dy40 M;
    public dy40 O;
    public dy40 Q;
    public dy40 R;
    public Executor b;
    public yx5 c;
    public cy5 w;
    public ay5 x;
    public mrj y;
    public md6 z;
    public int C = 0;
    public boolean N = true;
    public int P = 0;

    public static class NegativeButtonListener implements DialogInterface.OnClickListener {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        public NegativeButtonListener(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().Z(true);
            }
        }
    }

    public static void a0(dy40 dy40Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dy40Var.l(obj);
        } else {
            dy40Var.m(obj);
        }
    }

    public final void W(gx5 gx5Var) {
        if (this.J == null) {
            this.J = new dy40();
        }
        a0(this.J, gx5Var);
    }

    public final void X(CharSequence charSequence) {
        if (this.R == null) {
            this.R = new dy40();
        }
        a0(this.R, charSequence);
    }

    public final void Y(int i) {
        if (this.Q == null) {
            this.Q = new dy40();
        }
        a0(this.Q, Integer.valueOf(i));
    }

    public final void Z(boolean z) {
        if (this.M == null) {
            this.M = new dy40();
        }
        a0(this.M, Boolean.valueOf(z));
    }
}
