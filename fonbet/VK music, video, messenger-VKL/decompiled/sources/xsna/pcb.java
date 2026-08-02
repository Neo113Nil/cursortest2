package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vk.feature.uxpolls.modalpoll.UxPollsModalFragment;
import com.vk.uxpolls.presentation.view.PollsWebView;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pcb implements DialogInterface.OnShowListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ androidx.fragment.app.d c;

    public /* synthetic */ pcb(androidx.fragment.app.d dVar, int i) {
        this.b = i;
        this.c = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        ww50<?> Y;
        ww50<?> Y2;
        ww50<?> Y3;
        int i = this.b;
        androidx.fragment.app.d dVar = this.c;
        switch (i) {
            case 0:
                qcb qcbVar = (qcb) dVar;
                int i2 = qcb.h1;
                Context mo2getContext = qcbVar.mo2getContext();
                ey50 ey50Var = mo2getContext instanceof ey50 ? (ey50) mo2getContext : null;
                if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                    Y.S(qcbVar);
                    s3q0 s3q0Var = s3q0.a;
                    break;
                }
                break;
            case 1:
                nxb nxbVar = (nxb) dVar;
                int i3 = nxb.k1;
                Context mo2getContext2 = nxbVar.mo2getContext();
                ey50 ey50Var2 = mo2getContext2 instanceof ey50 ? (ey50) mo2getContext2 : null;
                if (ey50Var2 != null && (Y2 = ey50Var2.Y()) != null) {
                    Y2.S(nxbVar);
                    s3q0 s3q0Var2 = s3q0.a;
                    break;
                }
                break;
            case 2:
                com.vk.ecomm.product_list.presentation.a aVar = (com.vk.ecomm.product_list.presentation.a) dVar;
                Context mo2getContext3 = aVar.mo2getContext();
                ey50 ey50Var3 = mo2getContext3 instanceof ey50 ? (ey50) mo2getContext3 : null;
                if (ey50Var3 != null && (Y3 = ey50Var3.Y()) != null) {
                    Y3.S(aVar);
                    s3q0 s3q0Var3 = s3q0.a;
                    break;
                }
                break;
            default:
                UxPollsModalFragment uxPollsModalFragment = (UxPollsModalFragment) dVar;
                PollsWebView pollsWebView = uxPollsModalFragment.X;
                (pollsWebView != null ? pollsWebView : null).j(Collections.singletonList(Long.valueOf(((Number) uxPollsModalFragment.W.getValue()).longValue())));
                break;
        }
    }
}
