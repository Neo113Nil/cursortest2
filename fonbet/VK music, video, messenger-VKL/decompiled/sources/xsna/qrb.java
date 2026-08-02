package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.channelrestrictions.RestrictionBadge;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.amw;
import xsna.hbo0;
import xsna.ks5;
import xsna.q720;
import xsna.wup0;

/* compiled from: ChatHeaderInfoVcOld.kt */
/* loaded from: classes16.dex */
public final class qrb implements prb {
    public static final int x = cn70.b(9);
    public static final int y = cn70.b(4);
    public final tw0 a;
    public final rrb b;
    public final kkm c;
    public final View d;
    public final Toolbar e;
    public final View f;
    public final AvatarView g;
    public final TextView h;
    public final VKImageView i;
    public final ImageView j;
    public final ImageView k;
    public final ImageView l;
    public final AppCompatImageView m;
    public final AppCompatImageView n;
    public final ImageView o;
    public final TextView p;
    public final ViewGroup q;
    public final VkContentBadge r;
    public final ImageView s;
    public final ImageView t;
    public final VkCounter u;
    public final yri v;
    public mrb w;

    /* compiled from: ChatHeaderInfoVcOld.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RestrictionBadge.values().length];
            try {
                iArr[RestrictionBadge.OVER_16.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RestrictionBadge.OVER_18.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qrb(Context context, ViewStub viewStub, tw0 tw0Var, vza vzaVar, kkm kkmVar, int i) {
        this.a = tw0Var;
        this.b = vzaVar;
        this.c = kkmVar;
        viewStub.setLayoutResource(R.layout.chat_header_info_old);
        View inflate = viewStub.inflate();
        this.d = inflate;
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.e = toolbar;
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.content);
        View findViewById = toolbar.findViewById(R.id.avatar_wrapper);
        this.f = findViewById;
        this.g = (AvatarView) toolbar.findViewById(R.id.avatar_content);
        this.h = (TextView) toolbar.findViewById(R.id.vkim_title_text);
        this.i = (VKImageView) toolbar.findViewById(R.id.title_emoji);
        ImageView imageView = (ImageView) toolbar.findViewById(R.id.title_donut);
        this.j = imageView;
        this.k = (ImageView) toolbar.findViewById(R.id.avatar_verified);
        this.l = (ImageView) toolbar.findViewById(R.id.title_muted);
        AppCompatImageView appCompatImageView = (AppCompatImageView) toolbar.findViewById(R.id.title_casper);
        this.m = appCompatImageView;
        this.n = (AppCompatImageView) toolbar.findViewById(R.id.title_writing_disabled);
        ImageView imageView2 = (ImageView) toolbar.findViewById(R.id.title_dropdown);
        this.o = imageView2;
        this.p = (TextView) toolbar.findViewById(R.id.subtitle_text);
        this.q = (ViewGroup) toolbar.findViewById(R.id.subtitle_container);
        VkContentBadge vkContentBadge = (VkContentBadge) toolbar.findViewById(R.id.title_age_badge);
        this.r = vkContentBadge;
        this.s = (ImageView) toolbar.findViewById(R.id.subtitle_online_mobile);
        ImageView imageView3 = (ImageView) toolbar.findViewById(R.id.typing_progress);
        this.t = imageView3;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) toolbar.findViewById(R.id.vkim_back_button);
        this.u = (VkCounter) toolbar.findViewById(R.id.vkim_unread_counter);
        yri yriVar = new yri(context, e3m.f(R.attr.vk_ui_text_secondary, context));
        this.v = yriVar;
        bwt0.i0(appCompatImageButton, new t40(this, 14));
        appCompatImageButton.setImageDrawable(dhr0.t.d(i));
        appCompatImageButton.setImageTintList(ColorStateList.valueOf(kkmVar.f(R.attr.vk_ui_text_accent_themed)));
        toolbar.setOnMenuItemClickListener(new s41(this, 10));
        bwt0.i0(viewGroup, new pd(this, 20));
        bwt0.i0(findViewById, new tl0(this, 24));
        bwt0.i0(vkContentBadge, new ns1(this, 19));
        yriVar.setAlpha(127);
        imageView3.setImageDrawable(yriVar);
        imageView.setImageResource(R.drawable.vk_icon_donut_color_12);
        kkmVar.b(toolbar, R.attr.vk_ui_text_accent_themed);
        kkmVar.d(imageView2, R.attr.im_dropdown_arrow_tint);
        kkmVar.d(appCompatImageButton, R.attr.vk_ui_text_accent_themed);
        kkmVar.e(toolbar, new nq2((byte) 0, 2));
        kkmVar.e(appCompatImageView, new nw6(this, 3));
    }

    @Override // xsna.prb
    public final void a(mrb mrbVar) {
        ks5 ks5Var = mrbVar.a;
        boolean z = ks5Var instanceof ks5.d;
        View view = this.d;
        AvatarView avatarView = this.g;
        if (z) {
            bwt0.p0(avatarView, false);
        } else if (ks5Var instanceof ks5.a) {
            bwt0.p0(avatarView, true);
            Drawable drawable = view.getContext().getDrawable(((ks5.a) ks5Var).a);
            AvatarView.a aVar = AvatarView.y;
            avatarView.T0(null, drawable);
        } else if (ks5Var instanceof ks5.b) {
            bwt0.p0(avatarView, true);
            ImageList imageList = ((ks5.b) ks5Var).a;
            AvatarView.a aVar2 = AvatarView.y;
            avatarView.T0(imageList, null);
        } else {
            if (!epx.f(ks5Var, ks5.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(avatarView, true);
            avatarView.Z0();
        }
        amw amwVar = mrbVar.b;
        boolean z2 = amwVar instanceof amw.a;
        VKImageView vKImageView = this.i;
        if (z2) {
            bwt0.p0(vKImageView, false);
        } else {
            if (!(amwVar instanceof amw.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(vKImageView, true);
            ((amw.b) amwVar).getClass();
            vKImageView.load(null);
            vKImageView.setContentDescription(null);
        }
        uzo0 uzo0Var = mrbVar.c;
        hbo0 hbo0Var = uzo0Var.a;
        boolean z3 = hbo0Var != null;
        TextView textView = this.h;
        bwt0.p0(textView, z3);
        boolean z4 = textView.getText().length() > 0 && !epx.f(textView.getText(), hbo0Var);
        textView.setText(hbo0Var instanceof hbo0.a ? view.getContext().getText(((hbo0.a) hbo0Var).a) : hbo0Var instanceof hbo0.b ? ((hbo0.b) hbo0Var).a : "");
        if (z4) {
            textView.requestLayout();
        }
        bwt0.p0(this.m, false);
        bwt0.p0(this.n, false);
        bwt0.p0(this.l, uzo0Var.c);
        bwt0.p0(this.o, false);
        a86 a86Var = new a86(uzo0Var, 3);
        kkm kkmVar = this.c;
        kkmVar.e(this.k, a86Var);
        c1n0 c1n0Var = mrbVar.d;
        boolean z5 = (c1n0Var != null ? c1n0Var.a : null) != null;
        TextView textView2 = this.p;
        bwt0.p0(textView2, z5);
        boolean z6 = (c1n0Var != null ? c1n0Var.a : null) != null;
        ViewGroup viewGroup = this.q;
        bwt0.p0(viewGroup, z6);
        if (c1n0Var == null) {
            ((ConstraintLayout.b) textView.getLayoutParams()).F = 0.5f;
            f4m.t(y, textView);
        } else {
            wup0 wup0Var = c1n0Var.b;
            CharSequence charSequence = c1n0Var.a;
            textView2.setText(charSequence);
            if (!(wup0Var instanceof wup0.a)) {
                if (!(wup0Var instanceof wup0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((wup0.b) wup0Var).getClass();
                throw null;
            }
            this.v.setVisible(false, false);
            f4m.j(this.t);
            bwt0.p0(this.s, false);
            boolean h = f4m.h(viewGroup);
            boolean z7 = charSequence != null || wup0Var == null;
            if (h != z7) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                AutoTransition autoTransition = new AutoTransition();
                autoTransition.setDuration(100L);
                TransitionManager.beginDelayedTransition(viewGroup2, autoTransition);
                int i = x;
                if (!z7) {
                    i /= 2;
                }
                f4m.t(i, textView);
                ((ConstraintLayout.b) textView.getLayoutParams()).F = z7 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.5f;
                bwt0.p0(viewGroup, z7);
            }
        }
        lrb lrbVar = mrbVar.e;
        Toolbar toolbar = this.e;
        Menu menu = toolbar.getMenu();
        menu.clear();
        for (srb srbVar : lrbVar.a) {
            MenuItem add = menu.add(0, srbVar.a, 0, srbVar.b.a);
            q720 q720Var = srbVar.c;
            if (q720Var instanceof q720.a) {
                add.setIcon((Drawable) null);
            } else if (q720Var instanceof q720.b) {
                add.setIcon(((q720.b) q720Var).a);
            } else {
                if (!(q720Var instanceof q720.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                q720.c cVar = (q720.c) q720Var;
                add.setActionView(R.layout.chat_header_menu_item_with_counter_old);
                View actionView = add.getActionView();
                if (actionView != null) {
                    ImageView imageView = (ImageView) actionView.findViewById(R.id.menu_item_icon);
                    if (imageView != null) {
                        imageView.setImageResource(cVar.a);
                        kkmVar.d(imageView, R.attr.vk_ui_text_accent_themed);
                    }
                    VkCounter vkCounter = (VkCounter) actionView.findViewById(R.id.menu_item_icon_counter);
                    if (vkCounter != null) {
                        vkCounter.setCounterWithoutAnimation(cVar.b);
                    }
                    bwt0.i0(actionView, new na7(7, this, add));
                }
                kkmVar.b(toolbar, R.attr.vk_ui_text_accent_themed);
                s3q0 s3q0Var = s3q0.a;
            }
            add.setShowAsAction(2);
        }
        kkmVar.b(toolbar, R.attr.vk_ui_text_accent_themed);
        int i2 = mrbVar.g;
        VkCounter vkCounter2 = this.u;
        if (i2 > 0) {
            if (bwt0.K(vkCounter2)) {
                vkCounter2.setCounterWithAnimation(i2);
            } else {
                vkCounter2.setCounterWithoutAnimation(i2);
            }
            bwt0.p0(vkCounter2, true);
        } else {
            bwt0.p0(vkCounter2, false);
        }
        bwt0.p0(this.j, false);
        RestrictionBadge restrictionBadge = mrbVar.f;
        int i3 = restrictionBadge == null ? -1 : a.$EnumSwitchMapping$0[restrictionBadge.ordinal()];
        VkContentBadge vkContentBadge = this.r;
        if (i3 == 1) {
            vkContentBadge.setText("16+");
            vkContentBadge.setVisibility(0);
        } else if (i3 != 2) {
            vkContentBadge.setVisibility(8);
        } else {
            vkContentBadge.setText("18+");
            vkContentBadge.setVisibility(0);
        }
        this.w = mrbVar;
    }

    @Override // xsna.prb
    public final View getView() {
        return this.d;
    }
}
