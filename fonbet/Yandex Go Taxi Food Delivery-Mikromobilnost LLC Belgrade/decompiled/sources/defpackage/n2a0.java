package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import com.yandex.fintechsdk.core.nfc.impl.api.fragment.NfcDialogFragment;

/* loaded from: classes12.dex */
public final class n2a0 {
    public final /* synthetic */ r2a0 a;

    public n2a0(r2a0 r2a0Var) {
        this.a = r2a0Var;
    }

    public final void a() {
        r2a0 r2a0Var = this.a;
        NfcDialogFragment nfcDialogFragment = r2a0Var.i;
        if (nfcDialogFragment == null || !nfcDialogFragment.isVisible()) {
            NfcDialogFragment nfcDialogFragment2 = r2a0Var.i;
            if (nfcDialogFragment2 == null || !nfcDialogFragment2.isAdded()) {
                ((a) r2a0Var.d().b).a(ba60.c);
                NfcDialogFragment nfcDialogFragment3 = new NfcDialogFragment();
                r2a0Var.i = nfcDialogFragment3;
                nfcDialogFragment3.show(r2a0Var.a.getSupportFragmentManager(), "NfcDialogFragmentTag");
            }
        }
    }
}
