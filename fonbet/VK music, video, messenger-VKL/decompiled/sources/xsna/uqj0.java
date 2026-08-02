package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: SimpleHeaderAdapterDelegate.kt */
/* loaded from: classes16.dex */
public final class uqj0 extends p1u0<vqj0> {
    @Override // xsna.p1u0
    public final vfz<? extends vqj0> b(ViewGroup viewGroup) {
        return new wqj0(bwt0.I(R.layout.vkapp_channels_simple_header_item, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof vqj0;
    }
}
