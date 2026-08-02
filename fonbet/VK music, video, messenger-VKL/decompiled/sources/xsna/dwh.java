package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vkontakte.android.R;
import xsna.ewh;

/* compiled from: CommunityReBookingBannerItem.kt */
/* loaded from: classes5.dex */
public final class dwh extends we6 {
    public final ewh g;
    public final t3h h;

    /* compiled from: CommunityReBookingBannerItem.kt */
    public static final class a extends vif0<dwh> {
        public final izs<ewh.a, s3q0> n;
        public final wh50 o;

        public a(ViewGroup viewGroup, ComposeView composeView, ewh ewhVar, t3h t3hVar) {
            super(composeView, viewGroup);
            this.n = t3hVar;
            this.o = androidx.compose.runtime.k.b(ewhVar);
            bwt0.Z(R.attr.vk_ui_background_content, composeView);
            composeView.setTag("community_rebooking_banner_item");
            composeView.setContent(new jai(599432137, new com.vk.movika.tools.controls.seekbar.w(this, 3), true));
        }

        @Override // xsna.vif0
        public final void i6(dwh dwhVar) {
            dwh dwhVar2 = dwhVar;
            if (dwhVar2 != null) {
                ((zak0) this.o).setValue(dwhVar2.g);
            }
        }
    }

    public dwh(ewh ewhVar, t3h t3hVar) {
        this.g = ewhVar;
        this.h = t3hVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        ComposeView e = sv1.e(viewGroup.getContext());
        e.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new a(viewGroup, e, this.g, this.h);
    }

    @Override // xsna.we6
    public final int h() {
        return -238;
    }
}
