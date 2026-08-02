package xsna;

import android.view.View;
import com.vk.im.ui.views.StencilLayout;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class krs implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ krs(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return f4m.b(this.c);
            case 1:
                return (StencilLayout) this.c.findViewById(R.id.stencil);
            default:
                return Integer.valueOf(e3m.d(R.attr.im_msg_box_margin_start_with_avatar, this.c.getContext()));
        }
    }
}
