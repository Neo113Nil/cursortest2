package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import org.chromium.net.NetError;

/* compiled from: CommunityReplyStatusItem.kt */
/* loaded from: classes5.dex */
public final class exh extends we6 {
    public final fxh g;
    public final b4h h;
    public final int i = NetError.ERR_CERT_WEAK_KEY;

    /* compiled from: CommunityReplyStatusItem.kt */
    public static final class a extends vif0<exh> {
        public final TextView n;
        public final View o;
        public final LinearLayout p;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.item_community_reply_status, 0);
            this.n = (TextView) this.itemView.findViewById(R.id.community_reply_status_text);
            this.o = this.itemView.findViewById(R.id.community_reply_status_separator);
            this.p = (LinearLayout) this.itemView.findViewById(R.id.community_reply_status_container);
            bwt0.i0(this.itemView, new dxh(this, 0));
        }

        @Override // xsna.vif0
        public final void i6(exh exhVar) {
            fxh fxhVar = exhVar.g;
            mp80 mp80Var = fxhVar.b;
            if (mp80Var == null) {
                return;
            }
            boolean z = mp80Var.a == 1;
            boolean z2 = fxhVar.c;
            View view = this.o;
            bwt0.p0(view, z2);
            int a = e3m.a(R.dimen.vk_ui_base_padding_horizontal, this.itemView.getContext());
            bwt0.f0(view, a, 0, a, 0, 10);
            int a2 = e3m.a(R.dimen.vk_ui_spacing_size_m, this.itemView.getContext());
            int a3 = e3m.a(R.dimen.vk_ui_spacing_size_m, this.itemView.getContext());
            int a4 = e3m.a(R.dimen.vk_ui_spacing_size_s, this.itemView.getContext());
            bwt0.f0(this.p, 0, a2, 0, a2, 5);
            f4m.q(a3, view);
            TextView textView = this.n;
            f4m.t(a4, textView);
            textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext()));
            textView.setTextAppearance(R.style.VkUiTypography_Paragraph);
            textView.setText(z ? this.itemView.getContext().getString(R.string.community_reply_status_online) : enj.f(R.plurals.community_reply_minutes, mp80Var.b, this.itemView.getContext()));
        }
    }

    public exh(fxh fxhVar, b4h b4hVar) {
        this.g = fxhVar;
        this.h = b4hVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
