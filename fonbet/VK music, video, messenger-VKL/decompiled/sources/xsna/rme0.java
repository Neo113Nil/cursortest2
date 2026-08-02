package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.gatewayclient.RequestUrlFactory;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.auth.ui.consent.ConsentScreenInfo;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.libvideo.api.di.VideoOfflinePlaceholderSharedStateComponent;
import com.vk.metrics.logging.PerfLogger;
import com.vk.ml.MLFeatures;
import com.vk.music.bottomsheets.di.AudioBookBottomSheetComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.prefui.fragments.VkPreferenceToolbarFragment;
import com.vk.qrcode.QRStatsTracker;
import com.vk.sharing.core.view.SharingActionsView;
import com.vk.stories.design.view.ReactionView;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.aqe0;
import xsna.nnk0;
import xsna.pn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rme0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rme0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        RequestUrlFactory initialize$lambda$220$lambda$219;
        Object obj;
        Object parcelable;
        int i = this.b;
        int i2 = 2;
        r5 = null;
        WallGetMode valueOf = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((q76) obj2).a();
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.CONNECT_WI_FI);
                return s3q0.a;
            case 1:
                ((aqe0.a) obj2).d.invoke(Boolean.FALSE);
                return s3q0.a;
            case 2:
                e2f0 e2f0Var = (e2f0) obj2;
                ReactionView reactionView = new ReactionView(e2f0Var.a.getCtx(), null, 6);
                reactionView.setId(R.id.reaction_sticker);
                reactionView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                reactionView.setVisibility(4);
                jjc.g(reactionView, new yl0(22, reactionView, e2f0Var));
                return reactionView;
            case 3:
                final p6f0 p6f0Var = (p6f0) obj2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, p6f0Var.a.getDialogHeight$design_release());
                ofFloat.setStartDelay(0L);
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(new pkk(0.17f, 0.17f, 0.67f, 1.0f));
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.o6f0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        p6f0 p6f0Var2 = p6f0.this;
                        p6f0Var2.a.setPopupTranslationY(an10.b(floatValue));
                        k6f0 k6f0Var = p6f0Var2.b;
                        k6f0Var.setTranslationY(floatValue);
                        k6f0Var.setBackgroundTranslation(an10.b(floatValue));
                        p6f0Var2.a.invalidate();
                    }
                });
                return ofFloat;
            case 4:
                return ((NewsFeedComponent) ((k7m) m7m.f((y6g0) obj2)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 5:
                initialize$lambda$220$lambda$219 = ServiceProvider.initialize$lambda$220$lambda$219((ServicesRegistry) obj2);
                return initialize$lambda$220$lambda$219;
            case 6:
                return (SharingActionsView) ((com.vk.sharing.core.view.f) obj2).findViewById(R.id.sharing_actions_container);
            case 7:
                return ((AudioBookBottomSheetComponent) ((k7m) m7m.c((jfl0) obj2)).mo408a(fpf0.a(AudioBookBottomSheetComponent.class))).Ie();
            case 8:
                yrl0 yrl0Var = (yrl0) obj2;
                new PerfLogger().a(PerfLogger.Event.STORIES_START_OPEN_STORY_NEXT);
                yrl0Var.i = Long.valueOf(SystemClock.elapsedRealtime());
                yrl0Var.o = null;
                yrl0Var.n = null;
                yrl0Var.q = null;
                return s3q0.a;
            case 9:
                SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) obj2;
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) suggestedPostsFragment.eo().b.getValue()).Ad().a().p());
                qn60 qn60Var = new qn60(new zyp0());
                suggestedPostsFragment.R = qn60Var;
                ?? r0 = suggestedPostsFragment.eo().b;
                s1c0 s1c0Var = (s1c0) suggestedPostsFragment.T.getValue();
                String str = suggestedPostsFragment.N.get();
                AtomicReference<String> atomicReference = suggestedPostsFragment.O;
                pn60 pn60Var = new pn60(new pn60.a(s1c0Var, str, atomicReference.get()), r0);
                suggestedPostsFragment.S = pn60Var;
                rn60.a(qn60Var);
                SuggestedPostsFragment.d dVar = new SuggestedPostsFragment.d(atomicReference);
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) dVar);
                return new z4n0(new i5n0(qn60Var, pn60Var, eh60Var, new s1v(), suggestedPostsFragment.eo().a, new AtomicReference(new wn60((byte) 0)), new crx0(), (w3n0) suggestedPostsFragment.P.getValue(), new lvc0(new h5n0(), new u4n0(), new o4n0(), i2), cVar, fs60.a(qn60Var, pn60Var, cVar, suggestedPostsFragment.eo().a)));
            case 10:
                zan0 zan0Var = (zan0) obj2;
                fco0.c();
                zan0Var.c("observeEvents", new wt30(zan0Var, 25));
                return s3q0.a;
            case 11:
                RecyclerView.Adapter adapter = ((RecyclerView) obj2).getAdapter();
                com.vk.libvideo.bottomsheet.about.delegate.c cVar2 = adapter instanceof com.vk.libvideo.bottomsheet.about.delegate.c ? (com.vk.libvideo.bottomsheet.about.delegate.c) adapter : null;
                return cVar2 != null ? cVar2.h.f : EmptyList.b;
            case 12:
                return "onRetryChanged:" + ((nnk0.d) ((nnk0) obj2)).a;
            case 13:
                int i3 = UsableRecyclerPaginatedView.S;
                dhr0.a.getClass();
                dhr0.D().getClass();
                com.vk.core.ui.themes.a.b((UsableRecyclerPaginatedView.b) obj2);
                return s3q0.a;
            case 14:
                vxq0 vxq0Var = (vxq0) obj2;
                Bundle requireArguments = vxq0Var.b.requireArguments();
                WallGetMode wallGetMode = vxq0Var.d.a;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("id", UserId.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("id");
                    if (!(parcelable2 instanceof UserId)) {
                        parcelable2 = null;
                    }
                    obj = (UserId) parcelable2;
                }
                UserId userId = (UserId) obj;
                if (userId == null) {
                    userId = ((b25) vxq0Var.e.getValue()).c();
                }
                UserId userId2 = userId;
                String string = requireArguments.getString("access_key");
                String string2 = requireArguments.getString("referrer", "");
                String str2 = string2 == null ? "" : string2;
                String string3 = requireArguments.getString("track_code", null);
                String string4 = requireArguments.getString("wall_mode", null);
                if (string4 != null) {
                    try {
                        valueOf = WallGetMode.valueOf(string4);
                    } catch (Exception e) {
                        com.vk.metrics.eventtracking.b.a.a(e);
                    }
                }
                return new jvq0(userId2, wallGetMode, valueOf, string, str2, string3, false, null, false, null);
            case 15:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((ppr0) obj2)).a(fpf0.a(StoryEditorExtDepsComponent.class))).k7();
            case 16:
                int i4 = VideoCatalogRootVh.M0;
                return ((VideoOfflinePlaceholderSharedStateComponent) ((k7m) m7m.f((VideoCatalogRootVh) obj2)).a(fpf0.a(VideoOfflinePlaceholderSharedStateComponent.class))).B();
            case 17:
                return ((VideoMinimizableDiscoveryFragment) obj2).G0;
            case 18:
                ((cys0) obj2).b0.invoke(a.z.b);
                return s3q0.a;
            case 19:
                Context context = ((ggu0) obj2).b;
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(!fnj.d(context));
            case 20:
                return (View) obj2;
            case 21:
                return ((ConsentScreenInfo) obj2).f;
            case 22:
                Context context2 = (Context) obj2;
                LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context2);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginEnd(e3m.a(R.dimen.vk_ui_spacing_size_xl, context2));
                a.setLayoutParams(layoutParams);
                a.setGravity(16);
                return a;
            case 23:
                int i5 = VkPreferenceToolbarFragment.l0;
                h3p0.b((VkPreferenceToolbarFragment) obj2);
                return s3q0.a;
            case 24:
                List<MLFeatures.MLFeature> list = o570.a;
                List a2 = o570.a();
                kta ktaVar = ((c39) obj2).e;
                qcy<Object> qcyVar = c39.g[0];
                return j5g.u0(Collections.singletonList(MLFeatures.MLFeature.ANIMOJI_VOWELS), j5g.u0(rl3.u0(ktaVar.a().c), a2));
            case 25:
                int i6 = WriteBar.h0;
                return (ImageView) ((WriteBar) obj2).findViewById(R.id.writebar_settings);
            default:
                return ((c1y0) obj2).b().getButtonSettingsNewDot();
        }
    }

    public /* synthetic */ rme0(c39 c39Var, x8w0 x8w0Var) {
        this.b = 24;
        List<MLFeatures.MLFeature> list = o570.a;
        this.c = c39Var;
    }
}
