package xsna;

import android.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import kotlin.NoWhenBranchMatchedException;
import xsna.wrg;

/* compiled from: CommunityAppButtonItem.kt */
/* loaded from: classes5.dex */
public final class vrg extends we6 {
    public final wrg g;
    public final fg1 h;
    public final int i = -22;

    /* compiled from: CommunityAppButtonItem.kt */
    public final class a extends vif0<vrg> {
        public final TextView n;
        public final VKImageView o;

        public a(View view) {
            super(view);
            this.n = (TextView) view.findViewById(R.id.text1);
            VKImageView vKImageView = (VKImageView) view.findViewById(com.vkontakte.android.R.id.iv_icon);
            this.o = vKImageView;
            bwt0.i0((LinearLayout) view.findViewById(com.vkontakte.android.R.id.profile_button), new dkg(this, 2));
            vKImageView.setBackgroundResource(com.vkontakte.android.R.drawable.bg_community_app_placeholder);
        }

        @Override // xsna.vif0
        public final void i6(vrg vrgVar) {
            int a;
            wrg wrgVar = vrgVar.g;
            this.n.setText(wrgVar.a());
            boolean z = wrgVar instanceof wrg.a;
            VKImageView vKImageView = this.o;
            if (z) {
                a = iah0.a(24);
                String str = ((wrg.a) wrgVar).d;
                if (TextUtils.isEmpty(str)) {
                    bwt0.o0(vKImageView, dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_icon_accent));
                    vKImageView.setImageResource(com.vkontakte.android.R.drawable.vk_icon_link_circle_filled_24);
                } else {
                    vKImageView.load(str);
                }
                vKImageView.setBackgroundResource(com.vkontakte.android.R.drawable.bg_community_app_placeholder);
            } else {
                if (!(wrgVar instanceof wrg.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i = ((wrg.b) wrgVar).e;
                bwt0.o0(vKImageView, dhr0.t.c(com.vkontakte.android.R.attr.vk_ui_icon_accent));
                vKImageView.setImageResource(i);
                vKImageView.setBackground(null);
                a = iah0.a(20);
            }
            bwt0.r0(a, vKImageView);
            bwt0.c0(a, vKImageView);
        }
    }

    public vrg(wrg wrgVar, fg1 fg1Var) {
        this.g = wrgVar;
        this.h = fg1Var;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(tf3.b(viewGroup, com.vkontakte.android.R.layout.community_app_button_layout, viewGroup, false));
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
