package xsna;

import android.content.Context;
import android.content.DialogInterface;
import androidx.preference.Preference;
import com.ironsource.C4504q2;
import com.vk.api.comments.CommentsOrder;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;
import java.util.List;

/* compiled from: SettingsAccountInnerFragment.java */
/* loaded from: classes7.dex */
public final class o0j0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Preference d;
    public final /* synthetic */ SettingsAccountInnerFragment e;

    public o0j0(SettingsAccountInnerFragment settingsAccountInnerFragment, List list, String str, Preference preference) {
        this.e = settingsAccountInnerFragment;
        this.b = list;
        this.c = str;
        this.d = preference;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        CommentsOrder.Item item = (CommentsOrder.Item) this.b.get(i);
        String str = item.b;
        if (!str.equals(this.c)) {
            Preference preference = this.d;
            CharSequence m = preference.m();
            int i2 = SettingsAccountInnerFragment.r0;
            SettingsAccountInnerFragment settingsAccountInnerFragment = this.e;
            Context mo2getContext = settingsAccountInnerFragment.mo2getContext();
            if (mo2getContext != null) {
                fs fsVar = new fs("account.setCommentOrder");
                fsVar.K(C4504q2.u, str);
                io.reactivex.rxjava3.core.q m2 = hg1.m(rsg0.y0(fsVar, null, null, 3), mo2getContext, 0L, false, 62);
                int i3 = kwg0.a;
                settingsAccountInnerFragment.n0.b(m2.subscribe(new iwg0(), new h0j0(settingsAccountInnerFragment, m, mo2getContext)));
            }
            preference.I(item.c);
            settingsAccountInnerFragment.m0.i.b = str;
        }
        dialogInterface.dismiss();
    }
}
