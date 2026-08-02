package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.ProgressIconButton;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cq5;
import xsna.kr5;

/* compiled from: FriendRequestHolderRedesign2LinesIcons.kt */
/* loaded from: classes16.dex */
public final class wis extends ld6 {
    public static final /* synthetic */ int P = 0;
    public final ProgressIconButton A;
    public final ProgressIconButton B;
    public final ImageView C;
    public final ImageView D;
    public final baf0 E;
    public final baf0 F;
    public final baf0 G;
    public final baf0 H;
    public final UserId I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final hjs M;
    public final sis N;
    public final VKAvatarView O;
    public final String p;
    public final cis q;
    public final hss r;
    public final TextView s;
    public final ImageView t;
    public final VKAvatarView u;
    public final VKImageView v;
    public final ViewGroup w;
    public final PhotoStackView x;
    public final TextView y;
    public final ProgressIconButton z;

    public wis(ViewGroup viewGroup, String str, mss mssVar, cis cisVar, hss hssVar) {
        super(R.layout.vk_redesign_friend_request_item_2_lines, viewGroup, mssVar);
        this.p = str;
        this.q = cisVar;
        this.r = hssVar;
        this.s = (TextView) this.itemView.findViewById(R.id.title);
        this.t = (ImageView) this.itemView.findViewById(R.id.icon);
        VKAvatarView vKAvatarView = (VKAvatarView) this.itemView.findViewById(R.id.photo);
        this.u = vKAvatarView;
        this.v = (VKImageView) this.itemView.findViewById(R.id.online);
        this.w = (ViewGroup) this.itemView.findViewById(R.id.friends_and_subtitle_container);
        PhotoStackView photoStackView = (PhotoStackView) this.itemView.findViewById(R.id.common_friends);
        int a = iah0.a(2);
        photoStackView.setPadding(a, a, a, a);
        photoStackView.setOverlapOffset(0.8f);
        this.x = photoStackView;
        this.y = (TextView) this.itemView.findViewById(R.id.subtitle);
        ProgressIconButton progressIconButton = (ProgressIconButton) this.itemView.findViewById(R.id.positive_button);
        this.z = progressIconButton;
        ProgressIconButton progressIconButton2 = (ProgressIconButton) this.itemView.findViewById(R.id.negative_button);
        this.A = progressIconButton2;
        ProgressIconButton progressIconButton3 = (ProgressIconButton) this.itemView.findViewById(R.id.actions_button);
        this.B = progressIconButton3;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.call_button);
        this.C = imageView;
        ImageView imageView2 = (ImageView) this.itemView.findViewById(R.id.message_button);
        this.D = imageView2;
        abg0 abg0Var = dhr0.t;
        this.E = abg0Var.b(R.drawable.vk_icon_user_added_outline_28, R.attr.vk_legacy_icon_secondary);
        this.F = abg0Var.b(R.drawable.vk_icon_user_add_outline_28, R.attr.vk_legacy_accent);
        this.G = abg0Var.b(R.drawable.vk_icon_add_square_outline_28, R.attr.vk_legacy_accent);
        this.H = abg0Var.b(R.drawable.vk_icon_done_outline_28, R.attr.vk_legacy_icon_outline_secondary);
        this.I = vx2.d.c();
        this.L = cisVar.d;
        int c = abg0Var.c(R.attr.vk_legacy_accent);
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_enabled}, new int[0]}, new int[]{c, n8g.l(c, 102)});
        this.M = new hjs(progressIconButton, progressIconButton2, progressIconButton3);
        tis tisVar = new tis(this, this.n, new pxo0(400L));
        View view = this.itemView;
        tisVar.e = view;
        tisVar.f = progressIconButton;
        tisVar.g = progressIconButton2;
        tisVar.h = progressIconButton3;
        tisVar.i = imageView2;
        tisVar.j = imageView;
        tisVar.k = vKAvatarView;
        this.N = new sis(this);
        this.O = vKAvatarView;
        view.setOnClickListener(tisVar);
        vKAvatarView.setOnClickListener(tisVar);
        progressIconButton.setOnClickListener(tisVar);
        progressIconButton2.setOnClickListener(tisVar);
        progressIconButton3.setOnClickListener(tisVar);
        imageView.setOnClickListener(tisVar);
        imageView2.setOnClickListener(tisVar);
        imageView.setImageTintList(colorStateList);
        imageView2.setImageTintList(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pss
    public final void D2(boolean z) {
        this.M.k((RequestUserProfile) this.m);
    }

    @Override // xsna.pss
    public final hss H5() {
        return this.r;
    }

    @Override // xsna.vif0
    public final void i6(RequestUserProfile requestUserProfile) {
        Integer num;
        ProfileDescription profileDescription;
        ProfileDescription profileDescription2;
        RequestUserProfile requestUserProfile2 = requestUserProfile;
        this.s.setText(requestUserProfile2.e);
        Context context = this.itemView.getContext();
        sis sisVar = this.N;
        sisVar.getClass();
        mis.c(context, requestUserProfile2, this.t);
        Context context2 = this.itemView.getContext();
        kr5.a aVar = new kr5.a(new dqz0(requestUserProfile2));
        boolean z = true;
        aVar.c = requestUserProfile2.T ? cq5.h.a : cq5.b.a;
        aVar.b(R.drawable.user_placeholder);
        s3q0 s3q0Var = s3q0.a;
        kr5 a = aVar.a();
        VKAvatarView vKAvatarView = this.u;
        vKAvatarView.Y0(a);
        vKAvatarView.setClickable(requestUserProfile2.T);
        vKAvatarView.setContentDescription(context2.getString(R.string.accessibility_catalog_story_at_avatar));
        this.itemView.getContext();
        Integer a2 = zts.a(requestUserProfile2.n);
        VKImageView vKImageView = this.v;
        if (a2 != null) {
            vKImageView.setVisibility(0);
            vKImageView.setImageResource(a2.intValue());
        } else {
            f4m.j(vKImageView);
        }
        sisVar.getClass();
        PhotoStackView photoStackView = this.x;
        String str = null;
        mis.a(requestUserProfile2, photoStackView, photoStackView, null);
        UserProfile[] userProfileArr = requestUserProfile2.j0;
        if (userProfileArr != null && userProfileArr.length != 0) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        if (!z) {
            sb.append(" · ");
        }
        List<ProfileDescription> list = requestUserProfile2.E;
        if (myc0.f((list == null || (profileDescription2 = list.get(0)) == null) ? null : profileDescription2.e)) {
            List<ProfileDescription> list2 = requestUserProfile2.E;
            if (list2 != null && (profileDescription = list2.get(0)) != null) {
                str = profileDescription.e;
            }
            sb.append(str);
        } else if (myc0.f(requestUserProfile2.r)) {
            sb.append(requestUserProfile2.r);
        } else if (!z) {
            Context context3 = sisVar.a.itemView.getContext();
            MutualInfo mutualInfo = requestUserProfile2.d0;
            sb.append(enj.f(R.plurals.friends_catalog_mutual_friends, (mutualInfo == null || (num = mutualInfo.b) == null) ? requestUserProfile2.k0 : num.intValue(), context3));
        }
        TextView textView = this.y;
        textView.setText(sb);
        textView.setVisibility(drm0.N(sb) ? 8 : 0);
        this.w.setVisibility(textView.getVisibility() == 0 ? 0 : 8);
        this.A.setVisibility(this.L ? 0 : 8);
        int i = 0;
        int i2 = 0;
        uis uisVar = new uis(i2, this, wis.class, "positiveRequestUI", "positiveRequestUI()V", i, 0);
        vis visVar = new vis(0, this, wis.class, "negativeRequestUI", "negativeRequestUI()V", 0);
        nih nihVar = new nih(i2, this, wis.class, "noneRequestUI", "noneRequestUI()V", i, 1);
        sisVar.getClass();
        mis.b(requestUserProfile2, this.M, uisVar, visVar, nihVar);
        mis.d(requestUserProfile2, this.p);
    }

    @Override // xsna.pss
    public final View m4() {
        return this.O;
    }

    @Override // xsna.pss
    public final void I1() {
    }

    @Override // xsna.pss
    public final void x5() {
    }
}
