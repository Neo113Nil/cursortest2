package xsna;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import xsna.kz20;

/* compiled from: ReplayConfirmationDialog.kt */
/* loaded from: classes2.dex */
public final class q1g0 {
    public final ebs0 a;
    public final dz20 b;

    /* compiled from: ReplayConfirmationDialog.kt */
    public final class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* compiled from: ReplayConfirmationDialog.kt */
    public final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            q1g0.this.a.bk(yct0.a);
        }
    }

    public q1g0(FragmentActivity fragmentActivity, ebs0 ebs0Var, kz20.b bVar) {
        this.a = ebs0Var;
        this.b = bVar;
    }
}
