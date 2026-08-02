package xsna;

import android.content.res.ColorStateList;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.ads_mytarget.MyTargetAdHideReasonsView;
import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.feed.design.view.newsfeed.header.avatar.VkFeedHeaderAvatarView;
import com.vk.feed.design.view.newsfeed.header.avatar.VkFeedHeaderAvatarViewV2;
import com.vk.feed.design.view.newsfeed.header.type.VkFeedHeaderDisplayModeType;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.common.data.displayitems.AdVkFeedItemState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DisclaimerData;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ol60;
import xsna.tlo0;

/* compiled from: MyTargetInternalNativeAdBaseViewHolder.kt */
/* loaded from: classes4.dex */
public abstract class pq50<T extends ol60, N extends NewsEntry> extends rp6<T, N> implements t0n, a1n {
    public static final Object L = pn00.k(new Pair(Integer.valueOf(PostActions.ACTION_SHOW_AD_DEBUG_INFO.h()), "debug"), new Pair(Integer.valueOf(PostActions.ACTION_COPY_ADS_URL.h()), "ads_copy_url"), new Pair(Integer.valueOf(PostActions.ACTION_SHOW_ADVERTISER_INFO.h()), "show_advertiser_info"), new Pair(Integer.valueOf(PostActions.ACTION_OPEN_RECOMMENDATION_URL.h()), "ads_recommendations_info"), new Pair(Integer.valueOf(PostActions.ACTION_COPY_AD_MARKER.h()), "ad_marker_template"));
    public cjx E;
    public final Object F;
    public final Object G;
    public final bpn0 H;
    public final Object I;
    public final Object J;
    public fwu K;

    public pq50(int i, ViewGroup viewGroup) {
        super(i, viewGroup);
        fr20 fr20Var = new fr20(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.F = msy.a(lazyThreadSafetyMode, fr20Var);
        this.G = msy.a(lazyThreadSafetyMode, new odm(this, 27));
        this.H = new bpn0(new cty(this, 12));
        this.I = msy.a(lazyThreadSafetyMode, new c6(20));
        this.J = msy.a(lazyThreadSafetyMode, new xsw(this, 14));
    }

    @Override // xsna.a1n
    public void E2(DisclaimerData disclaimerData) {
        View view = this.itemView;
        view.setContentDescription(di60.m(disclaimerData, view.getContext()));
        final n0n n0nVar = new n0n();
        R0().setOnHoverListener(new View.OnHoverListener(n0nVar, this) { // from class: xsna.nq50
            public final /* synthetic */ pq50 a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnHoverListener
            public final boolean onHover(View view2, MotionEvent motionEvent) {
                pq50 pq50Var = this.a;
                boolean b = n0n.b(pq50Var.itemView, motionEvent);
                if (b) {
                    awt0.q(pq50Var.itemView);
                }
                return b;
            }
        });
    }

    public abstract LinearLayout b7();

    public abstract MyTargetAdHideReasonsView c7();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void d7(jr50 jr50Var) {
        Integer num;
        AdVkFeedItemState state = jr50Var.getState();
        AdVkFeedItemState adVkFeedItemState = AdVkFeedItemState.AD_SHOWING;
        bpn0 bpn0Var = this.H;
        if (state == adVkFeedItemState) {
            j4v j4vVar = (j4v) bpn0Var.getValue();
            j4vVar.a.setVisibility(0);
            j4vVar.b.setVisibility(8);
            return;
        }
        j4v j4vVar2 = (j4v) bpn0Var.getValue();
        egz0 c = jr50Var.d().c();
        Iterable iterable = c != null ? c.b : null;
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        MyTargetAdHideReasonsView myTargetAdHideReasonsView = j4vVar2.b;
        Iterable<ajx> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
        for (ajx ajxVar : iterable2) {
            String type = ajxVar.getType();
            MyTargetAdHideReasonsView.ActionModel.Type type2 = epx.f(type, "hide") ? MyTargetAdHideReasonsView.ActionModel.Type.HIDE : epx.f(type, "complain") ? MyTargetAdHideReasonsView.ActionModel.Type.COMPLAIN : MyTargetAdHideReasonsView.ActionModel.Type.UNKNOWN;
            String title = ajxVar.getTitle();
            String b = ajxVar.b();
            if (b == null) {
                b = "";
            }
            myTargetAdHideReasonsView.getContext();
            String b2 = ajxVar.b();
            if (b2 != null) {
                switch (b2.hashCode()) {
                    case -1791517821:
                        if (b2.equals("purchased")) {
                            num = Integer.valueOf(R.drawable.vk_icon_market_outline_28);
                            break;
                        }
                        break;
                    case -994856342:
                        if (b2.equals("too_many")) {
                            num = Integer.valueOf(R.drawable.vk_icon_clock_outline_28);
                            break;
                        }
                        break;
                    case -770822888:
                        if (b2.equals("missed_region")) {
                            num = Integer.valueOf(R.drawable.vk_icon_place_outline_28);
                            break;
                        }
                        break;
                    case -701740491:
                        if (b2.equals("not_interested")) {
                            num = Integer.valueOf(R.drawable.vk_icon_hide_outline_28);
                            break;
                        }
                        break;
                }
                arrayList.add(new MyTargetAdHideReasonsView.ActionModel(type2, title, b, num));
            }
            num = null;
            arrayList.add(new MyTargetAdHideReasonsView.ActionModel(type2, title, b, num));
        }
        myTargetAdHideReasonsView.setUpMenuActions(arrayList);
        j4vVar2.a.setVisibility(8);
        myTargetAdHideReasonsView.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void e7(jr50 jr50Var) {
        kbz0 kbz0Var;
        fwu fwuVar = this.K;
        if (fwuVar == null) {
            fwuVar = null;
        }
        f0z f0zVar = new f0z(this, 13);
        hz7 hz7Var = new hz7(4, this, jr50Var);
        fwuVar.getClass();
        wjz0 content = jr50Var.d().getContent();
        String str = content != null ? content.a.f : null;
        ArrayList arrayList = new ArrayList(rl3.I(new Description[]{jr50Var.a(), jr50Var.b(), jr50Var.e()}));
        wjz0 content2 = jr50Var.d().getContent();
        fvu0 fvu0Var = new fvu0(str, arrayList, new vtu0((content2 == null || (kbz0Var = content2.d) == null) ? null : kbz0Var.a.a, AvatarBorderType.CIRCLE, false, (o9r0) fwuVar.b.d.getValue(), fwu.c, false), 2091766);
        ewu ewuVar = new ewu(f0zVar, fwuVar, jr50Var, hz7Var);
        VkFeedPostHeaderView vkFeedPostHeaderView = fwuVar.a;
        VkFeedHeaderAvatarViewV2 vkFeedHeaderAvatarViewV2 = vkFeedPostHeaderView.u;
        VkFeedHeaderAvatarView vkFeedHeaderAvatarView = vkFeedPostHeaderView.t;
        vkFeedPostHeaderView.setIsHeaderClickable(fvu0Var.d);
        vkFeedPostHeaderView.setTitleText(fvu0Var.a);
        vkFeedPostHeaderView.setVerifiedDrawableSize(fvu0Var.g);
        vkFeedPostHeaderView.setVerifiedImageDrawable(null);
        vkFeedPostHeaderView.setIsVerifiedVisible(false);
        vkFeedPostHeaderView.setVerifiedContentDescription(null);
        vkFeedPostHeaderView.setIsPinVisible(false);
        vtu0 vtu0Var = fvu0Var.f;
        if (vtu0Var != null) {
            vkFeedPostHeaderView.setAvatarState(vtu0Var);
            if (vtu0Var.f) {
                if (vkFeedHeaderAvatarView != null) {
                    com.vk.core.view.components.avatar.badge.b bVar = new com.vk.core.view.components.avatar.badge.b(null, true, null, new iiu0(1), 11);
                    far0 far0Var = vkFeedHeaderAvatarView.m;
                    far0Var.h.add(bVar);
                    far0Var.a.invalidate();
                }
                if (vkFeedHeaderAvatarViewV2 != null) {
                    vkFeedHeaderAvatarViewV2.Q0(new com.vk.core.view.components.avatar.badge.b(null, true, null, new ltl0(13), 11));
                }
            } else {
                if (vkFeedHeaderAvatarView != null) {
                    far0 far0Var2 = vkFeedHeaderAvatarView.m;
                    far0Var2.h.clear();
                    far0Var2.a.invalidate();
                }
                if (vkFeedHeaderAvatarViewV2 != null) {
                    vkFeedHeaderAvatarViewV2.S0();
                }
            }
        }
        vkFeedPostHeaderView.setAvatarImportantForAccessibility(fvu0Var.h);
        vkFeedPostHeaderView.setAvatarContentDescription(null);
        vkFeedPostHeaderView.setIsAvatarClickable(false);
        vkFeedPostHeaderView.setIsAvatarFocusable(false);
        vkFeedPostHeaderView.setIsBadgeVisible(false);
        vkFeedPostHeaderView.getContext();
        ColorStateList valueOf = vkFeedPostHeaderView.L == VkFeedHeaderDisplayModeType.OVERLAY ? ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_icon_contrast)) : null;
        vkFeedPostHeaderView.setHeaderIconResId(0);
        vkFeedPostHeaderView.setHeaderIconImageTintList(valueOf);
        vkFeedPostHeaderView.setHeaderIconContentDescription(null);
        vkFeedPostHeaderView.setHeaderIconVisible(false);
        vkFeedPostHeaderView.setSubtitle(fvu0Var);
        vkFeedPostHeaderView.setHeaderListener(ewuVar);
    }

    public final void f7(jr50 jr50Var) {
        c7().setOnClickListener(null);
        c7().setUpPlaceholder(new MyTargetAdHideReasonsView.b(tq.h(tlo0.Companion, R.string.newsfeed_item_ad_ignored_title), new tlo0.f(R.string.newsfeed_item_ad_ignored_message)));
        c7().setUpCancelButton(new MyTargetAdHideReasonsView.a(new tlo0.f(R.string.newsfeed_item_ignored_cancel), dhr0.t.a(R.drawable.background_vk_ui_button_secondary)));
        c7().setCancelHideReasonsClickListener(new js00(4, this, jr50Var));
        c7().setHideReasonsItemClickListener(new mh4(20, this, jr50Var));
        c7().setReportClickItemListener(new eaa(23, this, jr50Var));
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
    }
}
