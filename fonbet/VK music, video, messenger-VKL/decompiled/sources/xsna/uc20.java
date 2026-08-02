package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* compiled from: MessageViewsRouterImpl.kt */
/* loaded from: classes2.dex */
public final class uc20 implements tc20 {
    @Override // xsna.tc20
    public final void a(FragmentManager fragmentManager, int i, long j) {
        mc20 mc20Var = new mc20();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_message_id", i);
        bundle.putLong("arg_dialog_id", j);
        mc20Var.setArguments(bundle);
        mc20Var.Wn(fragmentManager, null);
    }
}
