package xsna;

import android.view.ViewGroup;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gxw0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ gxw0(ViewGroup viewGroup, int i) {
        this.b = i;
        this.c = viewGroup;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ViewGroup viewGroup = this.c;
        switch (i) {
            case 0:
                hxw0 hxw0Var = (hxw0) viewGroup;
                return new qyo0(hxw0Var.t, hxw0Var.u);
            default:
                int i2 = WriteBar.h0;
                return ((WriteBar) viewGroup).findViewById(R.id.write_bar_attach_divider);
        }
    }
}
