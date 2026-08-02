package xsna;

import android.content.DialogInterface;
import android.util.TypedValue;
import androidx.fragment.app.FragmentManager;
import xsna.lrv0;

/* compiled from: BaseModalDialogFragment.kt */
/* loaded from: classes17.dex */
public abstract class dh6 extends c33 {
    public a x;
    public boolean y;
    public final ch6 z = new lrv0.a() { // from class: xsna.ch6
        @Override // xsna.lrv0.a
        public final void xb() {
            dh6.this.tn();
        }
    };

    /* compiled from: BaseModalDialogFragment.kt */
    public interface a {
        void a();

        void b();
    }

    public final void Dn() {
        if (this.y) {
            return;
        }
        this.y = true;
        a aVar = this.x;
        if (aVar != null) {
            aVar.b();
        }
        TypedValue typedValue = krv0.a;
        krv0.k(this.z);
    }

    @Override // androidx.fragment.app.d
    public final void Td(FragmentManager fragmentManager, String str) {
        if (fragmentManager.T()) {
            return;
        }
        super.Td(fragmentManager, str);
        this.y = false;
        a aVar = this.x;
        if (aVar != null) {
            aVar.a();
        }
        TypedValue typedValue = krv0.a;
        krv0.a(this.z);
    }

    @Override // androidx.fragment.app.d
    public void dismiss() {
        un(false, false);
        Dn();
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Dn();
    }

    @Override // androidx.fragment.app.d
    public void tn() {
        super.tn();
        Dn();
    }
}
