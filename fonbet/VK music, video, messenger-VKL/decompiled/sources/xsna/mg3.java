package xsna;

import android.view.ViewGroup;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;
import xsna.fi3;

/* compiled from: ArchiveChannelItemAsDefaultDialogItemAdapterDelegate.kt */
/* loaded from: classes15.dex */
public final class mg3 extends p1u0<fi3.d> {
    public final m0g0 a;

    public mg3(m0g0 m0g0Var) {
        this.a = m0g0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends fi3.d> b(ViewGroup viewGroup) {
        return new xh3((DialogItemView) tf3.b(viewGroup, R.layout.vkim_dialogs_list_item_dialog, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof fi3.d;
    }
}
