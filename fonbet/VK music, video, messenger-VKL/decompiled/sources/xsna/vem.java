package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import xsna.uem;

/* compiled from: DialogHeaderEditVc.kt */
/* loaded from: classes2.dex */
public final class vem {
    public final View a;
    public uem.a b;

    public vem(ViewGroup viewGroup, ViewStub viewStub) {
        if (viewGroup != null) {
            viewGroup.getContext();
        }
        ImFeatures imFeatures = ImFeatures.IM_CHAT_TOOLBAR_REDESIGN;
        imFeatures.getClass();
        viewStub.setLayoutResource(com.vk.toggle.b.A.a(imFeatures) ? R.layout.vkim_dialog_header_edit_milkshake : R.layout.vkim_dialog_header_edit_old);
        View inflate = viewStub.inflate();
        this.a = inflate;
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        abg0 abg0Var = dhr0.t;
        toolbar.setNavigationIcon(new baf0(abg0Var.d(R.attr.im_ic_cancel), abg0Var.c(R.attr.vk_ui_text_accent_themed)));
        toolbar.setNavigationOnClickListener(new qa6(this, 3));
    }
}
