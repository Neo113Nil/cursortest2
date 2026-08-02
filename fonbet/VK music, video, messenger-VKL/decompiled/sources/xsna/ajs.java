package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.ui.swipes.ButtonsSwipeView;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.ProgressButton;
import com.vk.core.view.ProgressIconButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.RequestUserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.cq5;
import xsna.hss;
import xsna.kr5;

/* compiled from: FriendRequestHolderRedesign3LinesText.kt */
/* loaded from: classes16.dex */
public final class ajs extends ld6 {
    public static final /* synthetic */ int M = 0;
    public final PhotoStackView A;
    public final TextView B;
    public final ProgressButton C;
    public final ProgressIconButton D;
    public final ProgressButton E;
    public final TextView F;
    public final UserId G;
    public boolean H;
    public boolean I;
    public final hjs J;
    public final mis K;
    public final VKAvatarView L;
    public final String p;
    public final cis q;
    public final hss r;
    public final bpn0 s;
    public final View t;
    public final TextView u;
    public final ImageView v;
    public final TextView w;
    public final VKAvatarView x;
    public final VKImageView y;
    public final ViewGroup z;

    public ajs(ViewGroup viewGroup, String str, mss mssVar, cis cisVar, hss hssVar) {
        super(new ButtonsSwipeView(viewGroup.getContext(), null, 6), viewGroup, mssVar);
        this.p = str;
        this.q = cisVar;
        this.r = hssVar;
        this.s = new bpn0(new z4f(this, 24));
        View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.vk_redesign_friend_request_item_3_lines_compact_text, viewGroup, false);
        this.t = inflate;
        this.u = (TextView) inflate.findViewById(R.id.title);
        this.v = (ImageView) inflate.findViewById(R.id.icon);
        this.w = (TextView) inflate.findViewById(R.id.subtitle);
        VKAvatarView vKAvatarView = (VKAvatarView) inflate.findViewById(R.id.photo);
        this.x = vKAvatarView;
        this.y = (VKImageView) inflate.findViewById(R.id.online);
        this.z = (ViewGroup) inflate.findViewById(R.id.common_friends_container);
        PhotoStackView photoStackView = (PhotoStackView) inflate.findViewById(R.id.common_friends);
        float f = 2;
        photoStackView.setPadding(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
        photoStackView.setOverlapOffset(0.8f);
        this.A = photoStackView;
        this.B = (TextView) inflate.findViewById(R.id.common_friends_title);
        ProgressButton progressButton = (ProgressButton) inflate.findViewById(R.id.positive_button);
        progressButton.setText(hssVar instanceof hss.b ? R.string.subscribe : R.string.friends_add);
        this.C = progressButton;
        ProgressIconButton progressIconButton = new ProgressIconButton(this.itemView.getContext(), null, 6);
        progressIconButton.setId(R.id.negative_button);
        progressIconButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        f4m.x(cn70.b(10), progressIconButton);
        f4m.w(cn70.b(22), progressIconButton);
        progressIconButton.setContentDescription(progressIconButton.getContext().getString(R.string.suggest_hide));
        progressIconButton.setClickable(true);
        progressIconButton.setIconSize(cn70.b(24));
        progressIconButton.setIconPadding(cn70.b(4));
        progressIconButton.setIconDrawable(dhr0.t.b(R.drawable.vk_icon_hide_24, R.attr.vk_legacy_counter_secondary_text));
        Drawable a = m33.a(R.drawable.catalog_bg_counter_secondary, progressIconButton.getContext());
        if (a != null) {
            progressIconButton.setIconBackground(a);
        }
        progressIconButton.setProgressBarSize(cn70.b(24));
        progressIconButton.setProgressBarPadding(cn70.b(4));
        this.D = progressIconButton;
        ProgressButton progressButton2 = (ProgressButton) inflate.findViewById(R.id.actions_button);
        this.E = progressButton2;
        TextView textView = (TextView) inflate.findViewById(R.id.message_button);
        this.F = textView;
        this.G = vx2.d.c();
        this.I = cisVar.d;
        this.J = new hjs(progressButton, progressIconButton, progressButton2);
        zis zisVar = new zis(this, this.n, new pxo0(400L));
        zisVar.e = inflate;
        zisVar.f = progressButton;
        zisVar.g = progressIconButton;
        zisVar.h = progressButton2;
        zisVar.i = textView;
        zisVar.k = vKAvatarView;
        this.K = new mis();
        this.L = vKAvatarView;
        new com.vk.core.ui.swipes.a(this.itemView.getContext()).a(q6());
        q6().setContentView(inflate);
        q6().setRightViews(Collections.singletonList(progressIconButton));
        inflate.setOnClickListener(zisVar);
        vKAvatarView.setOnClickListener(zisVar);
        progressButton.setOnClickListener(zisVar);
        progressIconButton.setOnClickListener(zisVar);
        progressButton2.setOnClickListener(zisVar);
        textView.setOnClickListener(zisVar);
        if (cisVar.i) {
            progressButton.setBackgroundResource(R.drawable.vkui_bg_button_outline);
            dhr0 dhr0Var = dhr0.a;
            dhr0Var.getClass();
            progressButton.setTextColor(anj.b(R.color.vkui_outline_button_text, dhr0.E()));
            progressButton2.setBackgroundResource(R.drawable.vkui_bg_button_outline);
            dhr0Var.getClass();
            progressButton2.setTextColor(anj.b(R.color.vkui_outline_button_text, dhr0.E()));
            textView.setBackgroundResource(R.drawable.vkui_bg_button_outline);
            dhr0Var.getClass();
            textView.setTextColor(anj.b(R.color.vkui_outline_button_text, dhr0.E()));
            return;
        }
        progressButton.setBackgroundResource(R.drawable.vkui_bg_button_secondary);
        dhr0 dhr0Var2 = dhr0.a;
        dhr0Var2.getClass();
        progressButton.setTextColor(anj.b(R.color.vkui_secondary_button_text, dhr0.E()));
        progressButton2.setBackgroundResource(R.drawable.vkui_bg_button_secondary);
        dhr0Var2.getClass();
        progressButton2.setTextColor(anj.b(R.color.vkui_secondary_button_text, dhr0.E()));
        textView.setBackgroundResource(R.drawable.vkui_bg_button_secondary);
        dhr0Var2.getClass();
        textView.setTextColor(anj.b(R.color.vkui_secondary_button_text, dhr0.E()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pss
    public final void D2(boolean z) {
        this.J.k((RequestUserProfile) this.m);
    }

    @Override // xsna.pss
    public final hss H5() {
        return this.r;
    }

    @Override // xsna.vif0
    public final void i6(RequestUserProfile requestUserProfile) {
        ProfileDescription profileDescription;
        ProfileDescription profileDescription2;
        RequestUserProfile requestUserProfile2 = requestUserProfile;
        if (!this.I) {
            q6().q = false;
        }
        this.u.setText(requestUserProfile2.e);
        Context context = this.itemView.getContext();
        this.K.getClass();
        mis.c(context, requestUserProfile2, this.v);
        List<ProfileDescription> list = requestUserProfile2.E;
        String str = null;
        String str2 = (list == null || (profileDescription2 = list.get(0)) == null) ? null : profileDescription2.e;
        if (str2 == null || drm0.N(str2)) {
            String str3 = requestUserProfile2.r;
            if (str3 != null && !drm0.N(str3)) {
                str = requestUserProfile2.r;
            }
        } else {
            List<ProfileDescription> list2 = requestUserProfile2.E;
            if (list2 != null && (profileDescription = list2.get(0)) != null) {
                str = profileDescription.e;
            }
        }
        TextView textView = this.w;
        textView.setText(str);
        textView.setVisibility((str == null || drm0.N(str)) ? 8 : 0);
        Context context2 = this.itemView.getContext();
        kr5.a aVar = new kr5.a(new dqz0(requestUserProfile2));
        aVar.c = requestUserProfile2.T ? cq5.h.a : cq5.b.a;
        aVar.b(R.drawable.user_placeholder);
        s3q0 s3q0Var = s3q0.a;
        kr5 a = aVar.a();
        VKAvatarView vKAvatarView = this.x;
        vKAvatarView.Y0(a);
        vKAvatarView.setClickable(requestUserProfile2.T);
        vKAvatarView.setContentDescription(context2.getString(R.string.accessibility_catalog_story_at_avatar));
        this.itemView.getContext();
        Integer a2 = zts.a(requestUserProfile2.n);
        VKImageView vKImageView = this.y;
        if (a2 != null) {
            vKImageView.setVisibility(0);
            vKImageView.setImageResource(a2.intValue());
        } else {
            f4m.j(vKImageView);
        }
        mis.a(requestUserProfile2, this.z, this.A, this.B);
        int i = 0;
        int i2 = 0;
        mis.b(requestUserProfile2, this.J, new y24(i2, this, ajs.class, "positiveRequestUI", "positiveRequestUI()V", i, 3), new z24(i2, this, ajs.class, "negativeRequestUI", "negativeRequestUI()V", i, 2), new a34(i2, this, ajs.class, "noneRequestUI", "noneRequestUI()V", i, 3));
        mis.d(requestUserProfile2, this.p);
    }

    @Override // xsna.pss
    public final View m4() {
        return this.L;
    }

    public final ButtonsSwipeView q6() {
        return (ButtonsSwipeView) this.s.getValue();
    }

    @Override // xsna.pss
    public final void I1() {
    }

    @Override // xsna.pss
    public final void x5() {
    }
}
