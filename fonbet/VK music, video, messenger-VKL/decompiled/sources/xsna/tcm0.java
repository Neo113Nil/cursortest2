package xsna;

import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.stickers.ContextUser;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.p2m0;

/* compiled from: StorySendMessageDialog.kt */
/* loaded from: classes6.dex */
public final class tcm0 extends Dialog implements mcm0, View.OnClickListener, p2m0.a {
    public final uov b;
    public final View c;
    public final VkInputSelect d;
    public final ImageView e;
    public final ImageView f;
    public final View g;
    public final View h;
    public final ConstraintLayout i;
    public final zb90 j;
    public final xcm0 k;
    public final p2m0 l;
    public final ycm0 m;

    public tcm0(l7s l7sVar, ycm0 ycm0Var, mkm0 mkm0Var, kcl0 kcl0Var, yxt yxtVar) {
        super(l7sVar, iah0.o(l7sVar) ? R.style.StoryDialog : R.style.StoryDialogNoStatusBar);
        p2m0 p2m0Var;
        zb90 zb90Var;
        ImageView imageView;
        ImageView imageView2;
        this.b = mkm0Var;
        View inflate = LayoutInflater.from(l7sVar).inflate(R.layout.layout_dialog_send_message, (ViewGroup) null);
        this.c = inflate;
        VkInputSelect vkInputSelect = (VkInputSelect) inflate.findViewById(R.id.et_send_message);
        this.d = vkInputSelect;
        ImageView imageView3 = (ImageView) inflate.findViewById(R.id.iv_send);
        this.e = imageView3;
        ImageView imageView4 = (ImageView) inflate.findViewById(R.id.dialog_send_message_voice_button);
        this.f = imageView4;
        ImageView imageView5 = (ImageView) inflate.findViewById(R.id.stickers_keyboard);
        UsableRecyclerView usableRecyclerView = (UsableRecyclerView) inflate.findViewById(R.id.rv_stickers);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.bottom_sheet_container);
        View findViewById = inflate.findViewById(R.id.bottom_sheet_gradient_view);
        this.g = findViewById;
        View findViewById2 = inflate.findViewById(R.id.reactions_root);
        this.h = findViewById2;
        this.i = (ConstraintLayout) inflate.findViewById(R.id.container);
        ImageView imageView6 = imageView5;
        VkInputSelect vkInputSelect2 = vkInputSelect;
        zb90 zb90Var2 = new zb90(vkInputSelect2, imageView6, findViewById2, imageView3, imageView4);
        this.j = zb90Var2;
        p2m0 p2m0Var2 = new p2m0(this);
        this.l = p2m0Var2;
        this.m = ycm0Var;
        Window window = getWindow();
        if (window != null) {
            ppx0.b(window, false);
            window.setWindowAnimations(R.style.PickerDialogAnimation);
            bpn0 bpn0Var = enj.a;
            p2m0Var = p2m0Var2;
            zb90Var = zb90Var2;
            imageView2 = imageView4;
            imageView = imageView3;
            xcm0 xcm0Var = new xcm0(e3m.h(l7sVar), window, inflate, vkInputSelect2, imageView6, kcl0Var, viewGroup, new ojf0(cn70.b(64), false, 2.4f, true, true, true), findViewById, this);
            imageView6 = imageView6;
            vkInputSelect2 = vkInputSelect2;
            this.k = xcm0Var;
        } else {
            p2m0Var = p2m0Var2;
            zb90Var = zb90Var2;
            imageView = imageView3;
            imageView2 = imageView4;
        }
        mhy.g(getWindow());
        mkm0Var.setBottomVisible(false);
        setContentView(inflate);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new jvd0(this, 1));
        imageView6.setVisibility(0);
        vkInputSelect2.b(new pcm0(this));
        vkInputSelect2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.ocm0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                ycm0 ycm0Var2 = tcm0.this.m;
                if (ycm0Var2 == null) {
                    return true;
                }
                ycm0Var2.z();
                return true;
            }
        });
        vkInputSelect2.setOnClickListener(new l44(this, 13));
        awt0.t(vkInputSelect2, new jl4(22, vkInputSelect2, this));
        vkInputSelect2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView.setOnClickListener(this);
        imageView.setEnabled(false);
        imageView.setAlpha(0.4f);
        imageView2.setOnTouchListener(new qcm0(this));
        imageView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        bwt0.i0(imageView6, new dn20(this, 28));
        usableRecyclerView.setAdapter(p2m0Var);
        usableRecyclerView.setLayoutManager(new GridLayoutManager(3, 1));
        usableRecyclerView.setOverScrollMode(2);
        usableRecyclerView.setItemAnimator(null);
        usableRecyclerView.addItemDecoration(new dhk0(cn70.b(8), cn70.b(8), cn70.b(8), cn70.b(8)));
        if (fnj.d(l7sVar)) {
            ViewGroup.LayoutParams layoutParams = usableRecyclerView.getLayoutParams();
            ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
            if (bVar != null) {
                bVar.F = 0.75f;
                usableRecyclerView.setLayoutParams(bVar);
            }
        }
        View findViewById3 = inflate.findViewById(R.id.click_handler);
        rcm0 rcm0Var = new rcm0(this);
        scm0 scm0Var = new scm0(this);
        dc80 dc80Var = new dc80(l7sVar, iah0.a(30), rcm0Var);
        dc80Var.l = scm0Var;
        dc80Var.k.getClass();
        findViewById3.setOnTouchListener(dc80Var);
        int i = ify.a;
        ify.a(ycm0Var);
        ycm0Var.f = zb90Var;
    }

    @Override // xsna.p2m0.a
    public final void b(x1l0 x1l0Var) {
        ycm0 ycm0Var = this.m;
        if (ycm0Var != null) {
            boolean z = x1l0Var.c;
            StickerItem stickerItem = x1l0Var.a;
            if (z) {
                StickerStockItem H = ycm0Var.c.H(stickerItem.b);
                ycm0Var.t2(H != null ? H.b : stickerItem.c, x1l0Var.a, "story_reaction", "fast_reactions", x1l0Var.b);
                return;
            }
            mcm0 mcm0Var = ycm0Var.h;
            if (mcm0Var == null) {
                mcm0Var = null;
            }
            int i = stickerItem.b;
            tcm0 tcm0Var = (tcm0) mcm0Var;
            tcm0Var.getClass();
            zal0 a = g2v.d().a();
            Context h = e3m.h(tcm0Var.getContext());
            if (h == null) {
                h = tcm0Var.getContext();
            }
            a.a(h, i, new t6c0(8), "story_reaction");
        }
    }

    public final ContextUser c() {
        String n;
        StoryOwner storyOwner;
        StoryOwner.User zb;
        String str = null;
        ycm0 ycm0Var = this.m;
        UserProfile userProfile = (ycm0Var == null || (storyOwner = ycm0Var.d) == null || (zb = storyOwner.zb()) == null) ? null : zb.c;
        UserId d = d();
        if (userProfile == null || d == null || (n = userProfile.n()) == null) {
            return null;
        }
        Image image = userProfile.O;
        if (image != null) {
            Serializer.c<Owner> cVar = Owner.CREATOR;
            str = Owner.a.a(h9l0.j, image);
        }
        return new ContextUser(d, n, str, null, 8, null);
    }

    public final UserId d() {
        ycm0 ycm0Var = this.m;
        if (ycm0Var != null) {
            y6m0 y6m0Var = ycm0Var.i;
            if (y6m0Var == null) {
                y6m0Var = null;
            }
            UserId userId = y6m0Var.a;
            if (userId != null && fkq0.d(userId)) {
                return userId;
            }
        }
        return null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.b.getView().postDelayed(new x52(this, 12), 200L);
        ycm0 ycm0Var = this.m;
        if (ycm0Var != null) {
            ycm0Var.onDestroy();
        }
        xcm0 xcm0Var = this.k;
        if (xcm0Var != null) {
            AutoSuggestStickersPopupWindow autoSuggestStickersPopupWindow = xcm0Var.m;
            autoSuggestStickersPopupWindow.disable();
            autoSuggestStickersPopupWindow.d();
            xcm0Var.j.e();
        }
        super.dismiss();
    }

    public final void f() {
        ycm0 ycm0Var = this.m;
        if (ycm0Var != null) {
            mcm0 mcm0Var = ycm0Var.h;
            if (mcm0Var == null) {
                mcm0Var = null;
            }
            mhy.j(((tcm0) mcm0Var).d);
        }
    }

    public final void g0() {
        Context context = getContext();
        uov uovVar = this.b;
        Window window = uovVar.getWindow();
        iz8 cadreSize = uovVar.getCadreSize();
        int i = cadreSize != null ? (int) cadreSize.d : 0;
        if ((40 & 16) != 0) {
            i = iah0.a(88);
        }
        cmf0.d(context, window, context.getString(R.string.default_network_error), false, i, (40 & 32) != 0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ycm0 ycm0Var;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf == null || valueOf.intValue() != R.id.iv_send || (ycm0Var = this.m) == null) {
            return;
        }
        ycm0Var.z();
    }
}
