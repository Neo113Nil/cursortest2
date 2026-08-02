package xsna;

import android.view.ViewGroup;
import com.vk.im.ui.views.dialogs.DialogItemView;
import com.vkontakte.android.R;

/* compiled from: RecommendedChannelVkMeItemAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class qcf0 extends p1u0<pcf0> {
    public final com.vk.channels.impl.list.f a;

    public qcf0(com.vk.channels.impl.list.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends pcf0> b(ViewGroup viewGroup) {
        return new rcf0((DialogItemView) bwt0.I(R.layout.vkim_dialogs_list_item_dialog, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof pcf0;
    }
}
