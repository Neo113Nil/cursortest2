package xsna;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.vk.profile.community.impl.ui.view.CommunityHeaderContentItemView;
import com.vkontakte.android.R;
import org.chromium.net.NetError;

/* compiled from: CommunityPrivateInfoItem.kt */
/* loaded from: classes5.dex */
public final class xdh extends we6 {
    public final int g = NetError.ERR_CERT_KNOWN_INTERCEPTION_BLOCKED;

    /* compiled from: CommunityPrivateInfoItem.kt */
    public static final class a extends vif0<xdh> {
        public static final /* synthetic */ int o = 0;
        public final CommunityHeaderContentItemView n;

        public a(CommunityHeaderContentItemView communityHeaderContentItemView) {
            super(communityHeaderContentItemView);
            this.n = (CommunityHeaderContentItemView) this.itemView;
        }

        @Override // xsna.vif0
        public final void i6(xdh xdhVar) {
            CommunityHeaderContentItemView communityHeaderContentItemView = this.n;
            int f = e3m.f(R.attr.vk_ui_icon_secondary, communityHeaderContentItemView.getContext());
            Drawable a = m33.a(R.drawable.vk_icon_lock_outline_20, communityHeaderContentItemView.getContext());
            if (a != null) {
                sjo.b(a, f, PorterDuff.Mode.SRC_IN);
            } else {
                a = null;
            }
            communityHeaderContentItemView.t.setCompoundDrawablesWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
            communityHeaderContentItemView.setContentText(communityHeaderContentItemView.getContext().getString(R.string.open_group));
        }
    }

    public xdh(ydh ydhVar) {
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        int i = a.o;
        return new a(new CommunityHeaderContentItemView(viewGroup.getContext(), null, 6, 0));
    }

    @Override // xsna.we6
    public final int h() {
        return this.g;
    }
}
