package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.channelrestrictions.RestrictionBadge;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.VerifyInfo;
import com.vk.im.ui.views.avatars.VkImAvatar;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.amw;
import xsna.hbo0;
import xsna.ks5;
import xsna.q720;
import xsna.wup0;

/* compiled from: ChatHeaderInfoVc.kt */
/* loaded from: classes16.dex */
public final class orb implements prb {
    public final tw0 a;
    public final rrb b;
    public final kkm c;
    public final View d;
    public final Toolbar e;
    public final View f;
    public final VkImAvatar g;
    public final VkFadeText h;
    public final VkEnhancedImageView i;
    public final VkImageSimple j;
    public final VkImageSimple k;
    public final VkImageSimple l;
    public final VkImageSimple m;
    public final VkImageSimple n;
    public final VkFadeText o;
    public final ViewGroup p;
    public final VkContentBadge q;
    public final VkImageSimple r;
    public final VkCounter s;
    public final yri t;
    public mrb u;

    /* compiled from: ChatHeaderInfoVc.kt */
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

    public orb(Context context, ViewStub viewStub, tw0 tw0Var, vza vzaVar, kkm kkmVar) {
        this.a = tw0Var;
        this.b = vzaVar;
        this.c = kkmVar;
        viewStub.setLayoutResource(R.layout.chat_header_info_milkshake);
        View inflate = viewStub.inflate();
        this.d = inflate;
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.e = toolbar;
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.content);
        View findViewById = toolbar.findViewById(R.id.avatar_wrapper);
        this.f = findViewById;
        this.g = (VkImAvatar) toolbar.findViewById(R.id.avatar_content);
        VkFadeText vkFadeText = (VkFadeText) toolbar.findViewById(R.id.vkim_title_text);
        this.h = vkFadeText;
        this.i = (VkEnhancedImageView) toolbar.findViewById(R.id.title_emoji);
        VkImageSimple vkImageSimple = (VkImageSimple) toolbar.findViewById(R.id.title_donut);
        this.j = vkImageSimple;
        this.k = (VkImageSimple) toolbar.findViewById(R.id.title_muted);
        VkImageSimple vkImageSimple2 = (VkImageSimple) toolbar.findViewById(R.id.title_casper);
        this.l = vkImageSimple2;
        this.m = (VkImageSimple) toolbar.findViewById(R.id.title_writing_disabled);
        VkImageSimple vkImageSimple3 = (VkImageSimple) toolbar.findViewById(R.id.title_dropdown);
        this.n = vkImageSimple3;
        VkFadeText vkFadeText2 = (VkFadeText) toolbar.findViewById(R.id.subtitle_text);
        this.o = vkFadeText2;
        this.p = (ViewGroup) toolbar.findViewById(R.id.subtitle_container);
        VkContentBadge vkContentBadge = (VkContentBadge) toolbar.findViewById(R.id.title_age_badge);
        this.q = vkContentBadge;
        VkImageSimple vkImageSimple4 = (VkImageSimple) toolbar.findViewById(R.id.typing_progress);
        this.r = vkImageSimple4;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) toolbar.findViewById(R.id.vkim_back_button);
        this.s = (VkCounter) toolbar.findViewById(R.id.vkim_unread_counter);
        yri yriVar = new yri(context, e3m.f(R.attr.vk_ui_icon_secondary, context));
        this.t = yriVar;
        bwt0.i0(appCompatImageButton, new l00(this, 14));
        Drawable a2 = dhr0.u.a(R.drawable.vk_icon_arrow_left_outline_28);
        if (a2 != null) {
            dhr0.a.getClass();
            dhr0.k0(R.attr.vk_ui_text_accent_themed, a2, appCompatImageButton);
        }
        toolbar.setOnMenuItemClickListener(new jo3(this, 5));
        bwt0.i0(viewGroup, new qm1(this, 19));
        bwt0.i0(findViewById, new p40(this, 23));
        bwt0.i0(vkContentBadge, new r9(this, 15));
        yriVar.setAlpha(127);
        vkImageSimple4.setImageDrawable(yriVar);
        vkImageSimple.setImageResource(R.drawable.vk_icon_donut_color_16);
        vkFadeText.setFade(false);
        vkFadeText.setMaxTextLines(1);
        vkFadeText2.setFade(false);
        vkFadeText2.setMaxTextLines(1);
        kkmVar.b(toolbar, R.attr.vk_ui_text_accent_themed);
        kkmVar.d(vkImageSimple3, R.attr.vk_ui_icon_secondary);
        kkmVar.e(toolbar, new nrb(0));
        kkmVar.e(vkImageSimple2, new x76(this, 2));
    }

    @Override // xsna.prb
    public final void a(mrb mrbVar) {
        ks5 ks5Var = mrbVar.a;
        boolean z = ks5Var instanceof ks5.d;
        View view = this.d;
        int i = 1;
        VkImAvatar vkImAvatar = this.g;
        if (z) {
            bwt0.p0(vkImAvatar, false);
        } else if (ks5Var instanceof ks5.a) {
            bwt0.p0(vkImAvatar, true);
            vkImAvatar.Z0(null, view.getContext().getDrawable(((ks5.a) ks5Var).a));
        } else if (ks5Var instanceof ks5.b) {
            bwt0.p0(vkImAvatar, true);
            vkImAvatar.Z0(((ks5.b) ks5Var).a, null);
        } else {
            if (!epx.f(ks5Var, ks5.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(vkImAvatar, true);
            VkImAvatar.f1(vkImAvatar);
        }
        amw amwVar = mrbVar.b;
        boolean z2 = amwVar instanceof amw.a;
        VkEnhancedImageView vkEnhancedImageView = this.i;
        if (z2) {
            bwt0.p0(vkEnhancedImageView, false);
        } else {
            if (!(amwVar instanceof amw.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(vkEnhancedImageView, true);
            ((amw.b) amwVar).getClass();
            vkEnhancedImageView.o0(null, null);
            vkEnhancedImageView.setContentDescription(null);
        }
        uzo0 uzo0Var = mrbVar.c;
        hbo0 hbo0Var = uzo0Var.a;
        boolean z3 = hbo0Var != null;
        VkFadeText vkFadeText = this.h;
        bwt0.p0(vkFadeText, z3);
        boolean z4 = vkFadeText.getText().length() > 0 && !epx.f(vkFadeText.getText(), hbo0Var);
        vkFadeText.setText(hbo0Var instanceof hbo0.a ? view.getContext().getText(((hbo0.a) hbo0Var).a) : hbo0Var instanceof hbo0.b ? ((hbo0.b) hbo0Var).a : "");
        if (z4) {
            vkFadeText.requestLayout();
        }
        bwt0.p0(this.l, false);
        bwt0.p0(this.m, false);
        bwt0.p0(this.k, uzo0Var.c);
        bwt0.p0(this.n, false);
        VerifyInfo verifyInfo = uzo0Var.b;
        if (verifyInfo == null && vkImAvatar.U0("verified")) {
            vkImAvatar.T0("verified");
        } else if (verifyInfo != null && verifyInfo.Db() && !vkImAvatar.U0("verified")) {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            LayerDrawable g = VerifyInfoHelper.g(view.getContext(), verifyInfo);
            if (g != null) {
                vkImAvatar.Q0(new com.vk.core.view.components.avatar.badge.a((Drawable) g, false, VkAvatarBadge.Alignment.BottomRight, "verified", 8));
            }
        }
        c1n0 c1n0Var = mrbVar.d;
        boolean z5 = (c1n0Var != null ? c1n0Var.a : null) != null;
        VkFadeText vkFadeText2 = this.o;
        bwt0.p0(vkFadeText2, z5);
        boolean z6 = (c1n0Var != null ? c1n0Var.a : null) != null;
        ViewGroup viewGroup = this.p;
        bwt0.p0(viewGroup, z6);
        if (c1n0Var == null) {
            ((ConstraintLayout.b) vkFadeText.getLayoutParams()).F = 0.5f;
        } else {
            wup0 wup0Var = c1n0Var.b;
            CharSequence charSequence = c1n0Var.a;
            vkFadeText2.setText(charSequence);
            if (!(wup0Var instanceof wup0.a)) {
                if (!(wup0Var instanceof wup0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((wup0.b) wup0Var).getClass();
                throw null;
            }
            this.t.setVisible(false, false);
            f4m.j(this.r);
            boolean h = f4m.h(viewGroup);
            boolean z7 = charSequence != null || wup0Var == null;
            if (h != z7) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                AutoTransition autoTransition = new AutoTransition();
                autoTransition.setDuration(100L);
                TransitionManager.beginDelayedTransition(viewGroup2, autoTransition);
                ((ConstraintLayout.b) vkFadeText.getLayoutParams()).F = z7 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 0.5f;
                bwt0.p0(viewGroup, z7);
            }
        }
        lrb lrbVar = mrbVar.e;
        Toolbar toolbar = this.e;
        Menu menu = toolbar.getMenu();
        menu.clear();
        Iterator<T> it = lrbVar.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            kkm kkmVar = this.c;
            if (!hasNext) {
                kkmVar.b(toolbar, R.attr.vk_ui_text_accent_themed);
                int i2 = mrbVar.g;
                VkCounter vkCounter = this.s;
                if (i2 > 0) {
                    if (bwt0.K(vkCounter)) {
                        vkCounter.setCounterWithAnimation(i2);
                    } else {
                        vkCounter.setCounterWithoutAnimation(i2);
                    }
                    bwt0.p0(vkCounter, true);
                } else {
                    bwt0.p0(vkCounter, false);
                }
                bwt0.p0(this.j, false);
                RestrictionBadge restrictionBadge = mrbVar.f;
                int i3 = restrictionBadge == null ? -1 : a.$EnumSwitchMapping$0[restrictionBadge.ordinal()];
                VkContentBadge vkContentBadge = this.q;
                if (i3 == 1) {
                    vkContentBadge.setText("16+");
                    vkContentBadge.setVisibility(0);
                } else if (i3 != 2) {
                    vkContentBadge.setVisibility(8);
                } else {
                    vkContentBadge.setText("18+");
                    vkContentBadge.setVisibility(0);
                }
                this.u = mrbVar;
                return;
            }
            srb srbVar = (srb) it.next();
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
                add.setActionView(R.layout.chat_header_menu_item_with_counter_milkshake);
                View actionView = add.getActionView();
                if (actionView != null) {
                    ImageView imageView = (ImageView) actionView.findViewById(R.id.menu_item_icon);
                    if (imageView != null) {
                        imageView.setImageResource(cVar.a);
                        kkmVar.d(imageView, R.attr.vk_ui_text_accent_themed);
                    }
                    VkCounter vkCounter2 = (VkCounter) actionView.findViewById(R.id.menu_item_icon_counter);
                    if (vkCounter2 != null) {
                        vkCounter2.setCounterWithoutAnimation(cVar.b);
                    }
                    bwt0.i0(actionView, new eaa(i, this, add));
                }
                kkmVar.b(toolbar, R.attr.vk_ui_text_accent_themed);
                s3q0 s3q0Var = s3q0.a;
            }
            add.setShowAsAction(2);
        }
    }

    @Override // xsna.prb
    public final View getView() {
        return this.d;
    }
}
