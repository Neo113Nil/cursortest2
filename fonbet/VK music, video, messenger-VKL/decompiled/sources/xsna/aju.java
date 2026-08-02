package xsna;

import android.util.Size;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupCardItemVh;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class aju implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Group c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ GroupCardItemVh e;

    public /* synthetic */ aju(boolean z, Group group, boolean z2, GroupCardItemVh groupCardItemVh) {
        this.b = z;
        this.c = group;
        this.d = z2;
        this.e = groupCardItemVh;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = this.b;
        Group group = this.c;
        if ((!z && group.n()) || group.C()) {
            cvk.u(R.string.community_send_request_toast, false);
        } else if (this.d) {
            GroupCardItemVh groupCardItemVh = this.e;
            View view = groupCardItemVh.r;
            if (view == null) {
                view = null;
            }
            ikv0.a aVar = new ikv0.a(view.getContext());
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_28, Integer.valueOf(R.attr.vk_ui_text_accent), (Size) null, 12);
            View view2 = groupCardItemVh.r;
            if (view2 == null) {
                view2 = null;
            }
            aVar.u = new ikv0.d(view2.getContext().getString(R.string.community_catalog_unsubscribed), (String) null, (ikv0.d.a) null, 6);
            aVar.n();
        }
        return s3q0.a;
    }
}
