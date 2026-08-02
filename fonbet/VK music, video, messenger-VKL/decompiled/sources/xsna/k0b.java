package xsna;

import android.view.ViewGroup;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;

/* compiled from: ChannelItemAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class k0b extends p1u0<j0b> {
    public final lgb a;

    public k0b(lgb lgbVar) {
        this.a = lgbVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends j0b> b(ViewGroup viewGroup) {
        return new n0b((DialogItemView) bwt0.I(R.layout.vkim_dialogs_list_item_dialog, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof j0b;
    }
}
