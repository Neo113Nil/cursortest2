package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class hz30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ hz30(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ViewGroup) this.c.findViewById(R.id.writebar_text_and_actions_container);
            default:
                return Integer.valueOf(e3m.d(R.attr.im_msg_box_margin_start_no_avatar, this.c.getContext()));
        }
    }
}
