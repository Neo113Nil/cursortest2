package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.newsfeed.api.posting.SettingsPostingContract$Mode;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.community.PostingSettingsCommunityView;
import com.vk.newsfeed.impl.posting.viewpresenter.settings.user.PostingSettingsUserView;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vkontakte.android.R;
import xsna.bmc0;

/* compiled from: PostingSettingsViewNew.kt */
/* loaded from: classes4.dex */
public final class dmc0 implements jk6, w8i {
    public ylc0 c;
    public PostingSettingsUserView h;
    public PostingSettingsCommunityView i;
    public PostingMetricsCreationEntryPoint b = PostingMetricsCreationEntryPoint.Other;
    public final bpn0 d = new bpn0(new x84(27));
    public final bpn0 e = new bpn0(new lbc0(this, 2));
    public final bpn0 f = new bpn0(new m130(this, 25));
    public final bpn0 g = new bpn0(new p5y(this, 27));

    /* compiled from: PostingSettingsViewNew.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SettingsPostingContract$Mode.values().length];
            try {
                iArr[SettingsPostingContract$Mode.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingsPostingContract$Mode.Community.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PostingSettingsViewNew.kt */
    public static final class b implements fkc0 {
        public b() {
        }

        @Override // xsna.fkc0
        public final void d() {
            ylc0 ylc0Var = dmc0.this.c;
            if (ylc0Var != null) {
                xch b = ylc0Var.b();
                b.c.e(b.f);
                ckc0 ckc0Var = b.e;
                if (ckc0Var != null) {
                    ckc0.c(ckc0Var, b.d.Um(), null, null, 6);
                }
            }
        }

        @Override // xsna.fkc0
        public final void e() {
            ylc0 ylc0Var = dmc0.this.c;
            if (ylc0Var != null) {
                xch b = ylc0Var.b();
                b.c.d(0L, b.f);
                b.d.e1(null);
            }
        }
    }

    /* compiled from: PostingSettingsViewNew.kt */
    public static final class d implements PostingSettingsUserView.a {
        public d() {
        }

        @Override // com.vk.newsfeed.impl.posting.viewpresenter.settings.user.PostingSettingsUserView.a
        public final void b() {
            ylc0 ylc0Var = dmc0.this.c;
            if (ylc0Var != null) {
                ylc0Var.g2();
            }
        }

        @Override // com.vk.newsfeed.impl.posting.viewpresenter.settings.user.PostingSettingsUserView.a
        public final void c() {
            ylc0 ylc0Var = dmc0.this.c;
            if (ylc0Var != null) {
                ylc0Var.R6();
            }
        }
    }

    public final void b(bmc0 bmc0Var) {
        PostingSettingsUserView postingSettingsUserView = this.h;
        if (postingSettingsUserView != null) {
            int i = postingSettingsUserView.t;
            int i2 = postingSettingsUserView.u;
            bmc0.a aVar = bmc0Var.b;
            TextView textView = postingSettingsUserView.z;
            int i3 = aVar.b ? i2 : i;
            bwt0.p0(textView, aVar.a);
            textView.setTextColor(i3);
            hno0.a(textView, ColorStateList.valueOf(i3));
            bmc0.b bVar = bmc0Var.a;
            TextView textView2 = postingSettingsUserView.y;
            boolean z = bVar.a;
            PostingVisibilityMode postingVisibilityMode = bVar.c;
            boolean z2 = z && bVar.b;
            int[] iArr = PostingSettingsUserView.b.$EnumSwitchMapping$0;
            int i4 = iArr[postingVisibilityMode.ordinal()];
            if (i4 == 1) {
                i = i2;
            } else if (i4 == 2) {
                i = postingSettingsUserView.v;
            }
            int i5 = iArr[postingVisibilityMode.ordinal()] == 3 ? R.drawable.vk_icon_unlock_outline_20 : R.drawable.vk_icon_lock_outline_20;
            int i6 = iArr[postingVisibilityMode.ordinal()];
            int i7 = i6 != 1 ? i6 != 2 ? R.string.newsfeed_newpost_for_all : R.string.newsfeed_newpost_for_best_friends : R.string.newsfeed_newpost_for_friends;
            bwt0.p0(textView2, z2);
            his0.v(textView2, i5, 0);
            textView2.setTextColor(i);
            textView2.setText(i7);
            hno0.a(textView2, ColorStateList.valueOf(i));
        }
    }

    public final void c(boolean z) {
        PostingSettingsUserView postingSettingsUserView = this.h;
        if (postingSettingsUserView != null) {
            bwt0.p0(postingSettingsUserView, z);
        }
    }

    @Override // xsna.jk6
    public final void d3(View view) {
        this.h = (PostingSettingsUserView) view.findViewById(R.id.posting_settings_user);
        this.i = (PostingSettingsCommunityView) view.findViewById(R.id.posting_settings_community);
        PostingSettingsUserView postingSettingsUserView = this.h;
        if (postingSettingsUserView != null) {
            postingSettingsUserView.setCallback(new d());
        }
        PostingSettingsCommunityView postingSettingsCommunityView = this.i;
        if (postingSettingsCommunityView != null) {
            postingSettingsCommunityView.setCallback(new cmc0(this, 0));
        }
        ekc0 a2 = ((lyk) this.f.getValue()).a(R.string.timer, view.getContext());
        view.getContext();
        ylc0 ylc0Var = this.c;
        if (ylc0Var != null) {
            xch b2 = ylc0Var.b();
            b2.e = a2;
            a2.a(new j9(b2, 29));
        }
        ylc0 ylc0Var2 = this.c;
        if (ylc0Var2 != null) {
            ylc0Var2.onStart();
        }
    }

    /* compiled from: PostingSettingsViewNew.kt */
    public static final class c implements sdc0 {
        @Override // xsna.sdc0
        public final void q0() {
        }

        @Override // xsna.sdc0
        public final void y0() {
        }
    }

    @Override // xsna.jk6
    public final void onDestroyView() {
    }
}
