package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.AwayLink;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.ads_action_button.VkFeedActionCellButton$Content$Middle;
import com.vk.feed.design.view.newsfeed.ads_action_button.a;
import com.vk.feed.design.view.newsfeed.ads_action_button.b;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.toggle.data.AdsBtnAnimationStyle;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.e3m;
import xsna.gd60;
import xsna.tlo0;

/* compiled from: AdFooterHolderV3.kt */
/* loaded from: classes4.dex */
public final class rf0 extends qi6<NewsEntry> implements View.OnClickListener, View.OnAttachStateChangeListener {
    public static final /* synthetic */ qcy<Object>[] N;
    public final h170 C;
    public final wvn D;
    public final p20 E;
    public final View.OnClickListener F;
    public final Object G;
    public final Object H;
    public final pgn I;
    public ValueAnimator J;
    public ValueAnimator K;
    public a L;
    public uf0 M;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdFooterHolderV3.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACTIVE;
        public static final a DEFAULT;

        static {
            a aVar = new a(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = aVar;
            a aVar2 = new a("DEFAULT", 1);
            DEFAULT = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(rf0.class, "actionButtonColorSubscription", "getActionButtonColorSubscription()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        N = new qcy[]{mutablePropertyReference1Impl};
    }

    public rf0(ViewGroup viewGroup, p20 p20Var, d27 d27Var, wvn wvnVar, h170 h170Var) {
        super(new com.vk.feed.design.view.newsfeed.ads_action_button.c(viewGroup.getContext()));
        this.C = h170Var;
        this.D = wvnVar;
        this.E = p20Var;
        this.F = d27Var;
        getContext();
        oo ooVar = new oo(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G = msy.a(lazyThreadSafetyMode, ooVar);
        this.H = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.h(this, 2));
        this.I = new pgn();
        this.L = a.DEFAULT;
        this.itemView.addOnAttachStateChangeListener(this);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        uf0 uf0Var = ol60Var instanceof uf0 ? (uf0) ol60Var : null;
        if (uf0Var == null) {
            return;
        }
        boolean z = uf0Var.j;
        if (epx.f(this.M, uf0Var)) {
            return;
        }
        this.M = uf0Var;
        this.L = a.DEFAULT;
        com.vk.feed.design.view.newsfeed.ads_action_button.c R6 = R6();
        R6.setBackgroundColor(krv0.m(R.attr.vk_ui_background_content, R6.getContext()));
        String str = uf0Var.h;
        VkFeedActionCellButton$Content$Middle.Label.TruncateMode truncateMode = VkFeedActionCellButton$Content$Middle.Label.TruncateMode.INTERACTIVE;
        tlo0.a aVar = tlo0.Companion;
        float f = uf0Var.k;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            str = R6.getContext().getString(R.string.dynamic_ads_button_template, str, String.valueOf(f));
        }
        tlo0.h d = oq.d(aVar, str);
        x7g x7gVar = new x7g(z ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_contrast);
        Drawable drawable = uf0Var.m;
        if (drawable == null) {
            drawable = null;
        }
        int i = R.attr.vk_ui_icon_contrast;
        R6.setMiddle(new VkFeedActionCellButton$Content$Middle.Label(d, x7gVar, drawable != null ? new eko(drawable) : null, new x7g(z ? R.attr.vk_ui_icon_primary : R.attr.vk_ui_icon_contrast), truncateMode, 32));
        gko gkoVar = new gko(R.drawable.vk_icon_chevron_right_20);
        if (z) {
            i = R.attr.vk_ui_icon_secondary;
        }
        R6.setRight(new b.C1039b(gkoVar, new x7g(i), null));
        R6.setWithDivider(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final com.vk.feed.design.view.newsfeed.ads_action_button.c R6() {
        return (com.vk.feed.design.view.newsfeed.ads_action_button.c) this.G.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T6(int i) {
        com.vk.feed.design.view.newsfeed.ads_action_button.a left;
        VkFeedActionCellButton$Content$Middle.Label label;
        VkFeedActionCellButton$Content$Middle middle;
        b.C1039b c1039b;
        com.vk.feed.design.view.newsfeed.ads_action_button.b right;
        R6().setBackgroundColor(i);
        com.vk.feed.design.view.newsfeed.ads_action_button.c R6 = R6();
        com.vk.feed.design.view.newsfeed.ads_action_button.a left2 = R6().getLeft();
        a.C1038a c1038a = left2 instanceof a.C1038a ? (a.C1038a) left2 : null;
        if (c1038a != null) {
            if (c1038a.b == null) {
                c1038a = null;
            }
            if (c1038a != null) {
                left = new a.C1038a(c1038a.a, new x7g(R.attr.vk_ui_icon_contrast), c1038a.c);
                R6.setLeft(left);
                com.vk.feed.design.view.newsfeed.ads_action_button.c R62 = R6();
                VkFeedActionCellButton$Content$Middle middle2 = R6().getMiddle();
                label = !(middle2 instanceof VkFeedActionCellButton$Content$Middle.Label) ? (VkFeedActionCellButton$Content$Middle.Label) middle2 : null;
                if (label == null) {
                    middle = new VkFeedActionCellButton$Content$Middle.Label(label.a, label.b != null ? new x7g(R.attr.vk_ui_text_contrast) : null, label.c, label.d != null ? new x7g(R.attr.vk_ui_icon_contrast) : null, label.e, label.f);
                } else {
                    middle = R6().getMiddle();
                }
                R62.setMiddle(middle);
                com.vk.feed.design.view.newsfeed.ads_action_button.c R63 = R6();
                com.vk.feed.design.view.newsfeed.ads_action_button.b right2 = R6().getRight();
                c1039b = !(right2 instanceof b.C1039b) ? (b.C1039b) right2 : null;
                if (c1039b != null) {
                    b.C1039b c1039b2 = c1039b.b != null ? c1039b : null;
                    if (c1039b2 != null) {
                        right = new b.C1039b(c1039b2.a, new x7g(R.attr.vk_ui_icon_contrast), c1039b2.c);
                        R63.setRight(right);
                    }
                }
                right = R6().getRight();
                R63.setRight(right);
            }
        }
        left = R6().getLeft();
        R6.setLeft(left);
        com.vk.feed.design.view.newsfeed.ads_action_button.c R622 = R6();
        VkFeedActionCellButton$Content$Middle middle22 = R6().getMiddle();
        if (!(middle22 instanceof VkFeedActionCellButton$Content$Middle.Label)) {
        }
        if (label == null) {
        }
        R622.setMiddle(middle);
        com.vk.feed.design.view.newsfeed.ads_action_button.c R632 = R6();
        com.vk.feed.design.view.newsfeed.ads_action_button.b right22 = R6().getRight();
        if (!(right22 instanceof b.C1039b)) {
        }
        if (c1039b != null) {
        }
        right = R6().getRight();
        R632.setRight(right);
    }

    public final void U6(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.K;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.K;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllListeners();
        }
        ValueAnimator valueAnimator4 = this.K;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllUpdateListeners();
        }
        this.K = valueAnimator;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AwayLink awayLink;
        ActionLink actionLink;
        Context context = this.itemView.getContext();
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : -1;
        uf0 uf0Var = this.M;
        String str = null;
        str = null;
        ButtonAction buttonAction = uf0Var != null ? uf0Var.i : null;
        NewsEntry t6 = t6();
        if (t6 instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) t6;
            if (shitAttachment.Hb()) {
                VideoAttachment videoAttachment = shitAttachment.I;
                VideoFile videoFile = videoAttachment != null ? videoAttachment.k : null;
                ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
                if (clipVideoFile != null && (actionLink = clipVideoFile.Y) != null) {
                    SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(clipVideoFile.c), Long.valueOf(clipVideoFile.b.b), null, clipVideoFile.W, null, 40, null), new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.FEED, SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_ACTION_BUTTON, null, null, null, null, null, null, null, null, new SchemeStat$EventItem(this.E.a(actionLink.c), Long.valueOf(actionLink.b), null, actionLink.e, actionLink.d, null, 36, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740796, null), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b, uzp0Var.a).q();
                }
            }
            gd60 a2 = hd60.a();
            gd60.a aVar = gd60.a;
            a2.O(context, shitAttachment, i, false);
            return;
        }
        if (!(t6 instanceof PromoPost) || buttonAction == null) {
            if (t6 instanceof MyTargetNativeAdEntry) {
                MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) t6;
                hi60 i6 = i6();
                NewsfeedExternalAction.Navigation.OpenMyTargetAds.a aVar2 = new NewsfeedExternalAction.Navigation.OpenMyTargetAds.a(NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.BANNER, NativeAdContent.ViewTag.CTA, 6, null);
                u1c0 J02 = J0();
                i6.sa(new NewsfeedExternalAction.Navigation.OpenMyTargetAds(context, myTargetNativeAdEntry, aVar2, J02 != null ? J02.k : -1));
                return;
            }
            return;
        }
        View.OnClickListener onClickListener = this.F;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            return;
        }
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            uf0 uf0Var2 = this.M;
            if (uf0Var2 != null && (awayLink = uf0Var2.n) != null) {
                str = awayLink.b;
            }
            postInteract.f = str;
            postInteract.Cb(PostInteract.Type.snippet_button_action);
        }
        gd60 a3 = hd60.a();
        PostInteract postInteract2 = this.w;
        Integer.valueOf(i);
        a3.C(context, buttonAction, postInteract2, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : null);
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        yoo yooVar;
        com.vk.toggle.data.a a2 = this.C.a();
        List list = (a2 == null || (yooVar = a2.c) == null) ? null : yooVar.b;
        if (list == null) {
            list = EmptyList.b;
        }
        boolean contains = list.contains(AdsBtnAnimationStyle.BUTTON_COLOR);
        boolean contains2 = list.contains(AdsBtnAnimationStyle.BUTTON_LIGHT);
        boolean contains3 = list.contains(AdsBtnAnimationStyle.CHEVRON_MOVE);
        uf0 uf0Var = this.M;
        int i = 1;
        int i2 = 0;
        if (uf0Var != null) {
            if (uf0Var.j) {
                NewsEntry q6 = q6();
                if (q6 != null) {
                    io.reactivex.rxjava3.disposables.c subscribe = this.D.b(q6).subscribe(new f50(new pf0(contains, this), i));
                    qcy<Object> qcyVar = N[0];
                    this.I.b(subscribe);
                }
            } else {
                com.vk.feed.design.view.newsfeed.ads_action_button.c R6 = R6();
                Context context = this.itemView.getContext();
                e3m.a aVar = e3m.a;
                R6.setBackgroundColor(context.getColor(R.color.vk_gray_800));
            }
        }
        R6().setWithShine(false);
        if (contains2) {
            R6().postDelayed(new nf0(this, 0), 1500L);
        }
        if (!contains3) {
            U6(null);
            ((View) this.H.getValue()).setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.c(4));
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setStartDelay(1500L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(1);
        ofFloat.addUpdateListener(new of0(this, i2));
        ofFloat.addListener(new tf0(ofFloat));
        ofFloat.start();
        U6(ofFloat);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        qcy<Object> qcyVar = N[0];
        this.I.b(null);
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.J;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.J;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        this.J = null;
        U6(null);
        R6().setWithShine(false);
        ((View) this.H.getValue()).setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
