package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import java.util.ArrayList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.gd60;

/* compiled from: AdFooterHolderV2.kt */
/* loaded from: classes4.dex */
public final class jf0 extends qi6<NewsEntry> implements View.OnClickListener, View.OnAttachStateChangeListener {
    public final wvn C;
    public final h170 D;
    public final p20 E;
    public final View.OnClickListener F;
    public final TextView G;
    public final ImageView H;
    public final ImageView I;
    public final View J;
    public final View K;
    public final ConstraintLayout L;
    public final float M;
    public a N;
    public final int O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public Animation R;
    public uf0 S;
    public io.reactivex.rxjava3.disposables.c T;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdFooterHolderV2.kt */
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

    public jf0(ViewGroup viewGroup, p20 p20Var, d27 d27Var, wvn wvnVar, h170 h170Var) {
        super(R.layout.news_ads_footer_v2, viewGroup);
        this.C = wvnVar;
        this.D = h170Var;
        this.E = p20Var;
        this.F = d27Var;
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        this.G = textView;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.end_image);
        this.H = imageView;
        this.I = (ImageView) this.itemView.findViewById(R.id.chevron);
        this.J = this.itemView.findViewById(R.id.shine);
        this.K = this.itemView.findViewById(R.id.divider);
        this.L = (ConstraintLayout) this.itemView.findViewById(R.id.container);
        this.M = cn70.c(4);
        this.N = a.DEFAULT;
        this.O = dhr0.t.c(R.attr.vk_ui_background_content);
        this.itemView.addOnAttachStateChangeListener(this);
        textView.setTranslationY(-1.0f);
        imageView.setTranslationY(-1.0f);
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
        float f = uf0Var.k;
        if (epx.f(this.S, uf0Var)) {
            return;
        }
        this.S = uf0Var;
        this.N = a.DEFAULT;
        this.L.setBackgroundColor(this.O);
        boolean z = uf0Var.j;
        ImageView imageView = this.I;
        TextView textView = this.G;
        if (z) {
            abg0 abg0Var = dhr0.t;
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_muted));
            imageView.setColorFilter(abg0Var.c(R.attr.vk_ui_icon_secondary));
        } else {
            textView.setTextColor(-1);
            imageView.setColorFilter(-1);
        }
        bwt0.p0(this.K, true);
        String str = uf0Var.h;
        ImageView imageView2 = this.H;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            imageView2.setImageDrawable(uf0Var.m);
            textView.setText(this.itemView.getContext().getString(R.string.dynamic_ads_button_template, str, String.valueOf(f)));
        } else {
            textView.setText(str);
            imageView2.setImageDrawable(null);
        }
        imageView2.setColorFilter(dhr0.t.c(R.attr.vk_ui_icon_secondary));
    }

    public final void R6(boolean z) {
        uf0 uf0Var = this.S;
        if (uf0Var == null || !uf0Var.j) {
            this.L.setBackgroundColor(this.itemView.getContext().getColor(R.color.vk_gray_800));
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        io.reactivex.rxjava3.disposables.c cVar = this.T;
        if (cVar != null) {
            cVar.dispose();
        }
        NewsEntry q6 = q6();
        if (q6 != null) {
            this.T = this.C.b(q6).subscribe(new gf0(new ff0(z, this, elapsedRealtime), 0), new hf0(new c2(1), 0));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AwayLink awayLink;
        ActionLink actionLink;
        Context context = this.itemView.getContext();
        u1c0 J0 = J0();
        int i = J0 != null ? J0.k : -1;
        uf0 uf0Var = this.S;
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
                hi60 i6 = i6();
                MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) t6;
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
            uf0 uf0Var2 = this.S;
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

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        yoo yooVar;
        com.vk.toggle.data.a a2 = this.D.a();
        ArrayList arrayList = (a2 == null || (yooVar = a2.c) == null) ? null : yooVar.b;
        if (arrayList == null) {
            R6(false);
            return;
        }
        boolean contains = arrayList.contains(AdsBtnAnimationStyle.BUTTON_COLOR);
        boolean contains2 = arrayList.contains(AdsBtnAnimationStyle.CHEVRON_MOVE);
        boolean contains3 = arrayList.contains(AdsBtnAnimationStyle.BUTTON_LIGHT);
        R6(contains);
        if (contains2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.M);
            ofFloat.setDuration(400L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.setStartDelay(1500L);
            ofFloat.setRepeatMode(2);
            ofFloat.setRepeatCount(1);
            ofFloat.addUpdateListener(new ef0(this, 0));
            ofFloat.addListener(new kf0(ofFloat));
            ofFloat.start();
            this.Q = ofFloat;
        }
        if (contains3) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.shine_long_btn_one_shot);
            loadAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            loadAnimation.setAnimationListener(new mf0(this));
            this.R = loadAnimation;
            this.J.postDelayed(new sd(this, 1), 1500L);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        io.reactivex.rxjava3.disposables.c cVar = this.T;
        if (cVar != null) {
            cVar.dispose();
        }
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.P;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.P;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.P = null;
        this.I.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ValueAnimator valueAnimator4 = this.Q;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        ValueAnimator valueAnimator5 = this.Q;
        if (valueAnimator5 != null) {
            valueAnimator5.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator6 = this.Q;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        this.Q = null;
        bwt0.p0(this.J, false);
        Animation animation = this.R;
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        Animation animation2 = this.R;
        if (animation2 != null) {
            animation2.cancel();
        }
        this.R = null;
    }
}
