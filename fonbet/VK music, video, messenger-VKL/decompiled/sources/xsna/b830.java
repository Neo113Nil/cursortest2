package xsna;

import android.view.View;
import com.vk.money.MoneyTransfersFragment;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b830 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = MoneyTransfersFragment.b1;
        r6m.a.getClass();
        if (!r6m.j()) {
            cvk.u(R.string.common_network_error, false);
        } else {
            rwi.d().e().a(view.getContext(), y57.a("https://m.", a0a.d, "/landings/moneysend?lang=", ply.a()));
        }
    }
}
