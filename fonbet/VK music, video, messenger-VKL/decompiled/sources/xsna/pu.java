package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.articleeditor.impl.di.ArticleComponentImpl;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SignUpRouter;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.channels.impl.reactions.ChannelReactionWebViewFragment;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.core.view.components.picture.VkImage;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.im.channelcreation.api.ChannelCreationDiComponent;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.music.player.core.audioeffect.AudioEffectSettingsComponentImpl;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.rules.api.ActionButtonAttachmentRule;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragment;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.addpoll.AddPollView;
import xsna.e3m;
import xsna.lla;
import xsna.t5e;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pu implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pu(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0337, code lost:
    
        if (r3 > 0.999999f) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        Object parcelable;
        float f;
        io.reactivex.rxjava3.disposables.c cVar;
        int i = this.b;
        int i2 = 1;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = ((ActionButtonAttachmentRule) obj2).d;
                if (str != null) {
                    return new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.StringText(str), null, 4, null);
                }
                return null;
            case 1:
                return ((MarketComponent) ((k7m) m7m.f((d30) obj2)).a(fpf0.a(MarketComponent.class))).l7();
            case 2:
                qc0 qc0Var = (qc0) obj2;
                sqt0 sqt0Var = qc0Var.a;
                View view = new View(sqt0Var.getContext());
                view.setId(R.id.ad_background_view);
                view.setVisibility(8);
                Context context = sqt0Var.getContext();
                e3m.a aVar = e3m.a;
                view.setBackgroundColor(context.getColor(R.color.vk_black));
                qc0Var.b.getClass();
                Integer num = 3;
                sqt0Var.addView(view, num.intValue(), new ViewGroup.LayoutParams(-1, -1));
                return view;
            case 3:
                AddPollView addPollView = (AddPollView) obj2;
                int i4 = AddPollView.R;
                io.reactivex.rxjava3.subjects.f<Poll> fVar = new io.reactivex.rxjava3.subjects.f<>();
                fVar.subscribe(new gn0(new qu(addPollView, i2), i3));
                PollEditorFragment pollEditorFragment = addPollView.Q;
                if (pollEditorFragment != null) {
                    hpb0 hpb0Var = pollEditorFragment.S;
                    (hpb0Var != null ? hpb0Var : null).e(fVar);
                }
                return s3q0.a;
            case 4:
                AlbumChooseFragment albumChooseFragment = (AlbumChooseFragment) obj2;
                qcy<Object>[] qcyVarArr = AlbumChooseFragment.P;
                Bundle requireArguments = albumChooseFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("arguments", AlbumChooseArguments.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("arguments");
                    obj = (AlbumChooseArguments) (parcelable2 instanceof AlbumChooseArguments ? parcelable2 : null);
                }
                pd1 pd1Var = new pd1((AlbumChooseArguments) obj);
                l7m d = m7m.d(albumChooseFragment);
                AlbumChooseFragmentInternalComponent.g.getClass();
                return (AlbumChooseFragmentInternalComponent) d.d(new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, pd1Var, fpf0.a(AlbumChooseFragmentInternalComponent.class), new od1(i3))).a(fpf0.a(AlbumChooseFragmentInternalComponent.class));
            case 5:
                AlbumDetailsFragment albumDetailsFragment = ((com.vk.photos.root.albumdetails.presentation.c) obj2).c;
                xn50.a.c(albumDetailsFragment, a.y.b);
                xn50.a.c(albumDetailsFragment, a.z.b);
                return s3q0.a;
            case 6:
                e12 e12Var = (e12) obj2;
                float c = e12Var.e().c(((zak0) e12Var.f).getValue());
                float c2 = e12Var.e().c(e12Var.h.getValue()) - c;
                float abs = Math.abs(c2);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    f = (e12Var.g() - c) / c2;
                    if (f >= 1.0E-6f) {
                        break;
                    } else {
                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 7:
                qcy<Object>[] qcyVarArr2 = ArticleComponentImpl.c;
                nwy nwyVar = ((ArticleComponentImpl) obj2).a;
                qcy<Object> qcyVar = ArticleComponentImpl.c[0];
                return new com.vk.articleeditor.impl.a((vn3) nwyVar.c(), new om3(new fai()));
            case 8:
                AudioEffectSettingsComponentImpl audioEffectSettingsComponentImpl = (AudioEffectSettingsComponentImpl) obj2;
                return new dn4(audioEffectSettingsComponentImpl.a.Q0(), audioEffectSettingsComponentImpl.b.q1());
            case 9:
                return ((qi5) obj2).a.A();
            case 10:
                ((p16) obj2).e = null;
                return s3q0.a;
            case 11:
                p66 p66Var = (p66) obj2;
                SignUpRouter signUpRouter = p66Var.n;
                if (signUpRouter == null) {
                    signUpRouter = null;
                }
                SignUpDataHolder signUpDataHolder = p66Var.p;
                signUpRouter.p((signUpDataHolder != null ? signUpDataHolder : null).v);
                return s3q0.a;
            case 12:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.c(((y440) obj2).getBottomPanel())).a(fpf0.a(StoryEditorExtDepsComponent.class))).k7();
            case 13:
                int i5 = BoardTopicsFragment.S0;
                ((com.vk.topics.impl.fragments.d) ((BoardTopicsFragment) obj2).O0.getValue()).notifyDataSetChanged();
                return s3q0.a;
            case 14:
                LottieAnimationView lottieAnimationView = ((kl9) obj2).c;
                if (lottieAnimationView != null) {
                    lottieAnimationView.m0();
                }
                return s3q0.a;
            case 15:
                CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
                return "CatalogDtoMapper has no registered variant for " + catalogBlockDto.l0() + ", " + catalogBlockDto.n1().f() + ", " + catalogBlockDto.n1().i();
            case 16:
                VkImage vkImage = new VkImage(((lla.a) obj2).a, null, 6, 0);
                vkImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return vkImage;
            case 17:
                ((ikv0) obj2).a();
                return s3q0.a;
            case 18:
                ChannelProfileFragment channelProfileFragment = (ChannelProfileFragment) obj2;
                int i6 = ChannelProfileFragment.e0;
                feb b = ((ImReportersComponent) m7m.d(channelProfileFragment).a(fpf0.a(ImReportersComponent.class))).K().b();
                long longValue = ((Number) channelProfileFragment.S.getValue()).longValue();
                boolean booleanValue = ((Boolean) channelProfileFragment.T.getValue()).booleanValue();
                a1w a1wVar = channelProfileFragment.Q;
                return new q9b(longValue, booleanValue, new s8b(a1wVar, new tta(a1wVar, asu0.a), b), (o9b) channelProfileFragment.X.getValue(), (ddb) channelProfileFragment.Y.getValue(), (mxb) channelProfileFragment.Z.getValue(), channelProfileFragment.requireContext(), channelProfileFragment.R, (bzb0) channelProfileFragment.c0.getValue(), (ucb) channelProfileFragment.U.getValue(), new h3g0(channelProfileFragment.requireContext()), o25.c(o25.a()), b, ((ChannelCreationDiComponent) m7m.d(channelProfileFragment).mo408a(fpf0.a(ChannelCreationDiComponent.class))).f1(), ((ImReportersComponent) m7m.d(channelProfileFragment).a(fpf0.a(ImReportersComponent.class))).K().x(), ((VkOnboardingComponent) m7m.d(channelProfileFragment).a(fpf0.a(VkOnboardingComponent.class))).p3());
            case 19:
                ((ChannelReactionWebViewFragment) obj2).P = true;
                return s3q0.a;
            case 20:
                tsu tsuVar = ((azb) obj2).k;
                if (tsuVar != null && (cVar = ((xyb) tsuVar.b).x.i) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 21:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj2;
                int i7 = ClipFeedListFragment.a2;
                if (!((l8e) clipFeedListFragment.O0.getValue()).a().containsKey(Integer.valueOf(ClipFeedAdapter.ViewType.CLIP_CONTROLS.ordinal()))) {
                    return rke.a;
                }
                clipFeedListFragment.qo().getClass();
                return new qke();
            case 22:
                o1d o1dVar = (o1d) obj2;
                return new x0d(o1dVar.j, new ix2(o1dVar, 21), o1dVar.v);
            case 23:
                q8d q8dVar = (q8d) obj2;
                ImageView imageView = (ImageView) q8dVar.b().findViewById(R.id.video_single_clip_song_progress);
                if (imageView == null) {
                    return null;
                }
                wz4 wz4Var = new wz4(q8dVar.b().getContext());
                wz4Var.b.setColor(-1);
                float f2 = 8;
                int a = iah0.a(f2);
                float f3 = 12;
                wz4Var.l.set(new Rect(a, iah0.a(f2), iah0.a(f3) + a, iah0.a(f3) + a));
                imageView.setImageDrawable(wz4Var);
                return imageView;
            case 24:
                ((nad) obj2).t = !r7.t;
                return s3q0.a;
            case 25:
                return ((s0e) obj2).i().findViewById(R.id.touch_zone_right);
            case 26:
                ((com.vk.clips.favorites.impl.ui.folders.picker.b) obj2).j.d(t5e.q.a, null);
                return s3q0.a;
            case 27:
                ((aif) obj2).getClass();
                return null;
            case 28:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj2;
                int i8 = ClipsWrapperFragment.Q0;
                io2 io2Var = (io2) clipsWrapperFragment.po().c.getValue();
                oo2 oo2Var = io2Var != null ? new oo2(io2Var, clipsWrapperFragment.M0) : null;
                zof zofVar = (zof) clipsWrapperFragment.X.getValue();
                boolean booleanValue2 = ((Boolean) clipsWrapperFragment.Y.getValue()).booleanValue();
                yce yceVar = new yce(clipsWrapperFragment, 4);
                clipsWrapperFragment.qo();
                clipsWrapperFragment.po();
                return new ouf(zofVar, booleanValue2, yceVar, oo2Var, new ClipsWrapperFragment.k(0, clipsWrapperFragment, ClipsWrapperFragment.class, "getFadeViews", "getFadeViews()Ljava/util/List;", 0));
            default:
                ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer = (ClipFeedTransientArgumentsContainer) ((ClipsWrapperInputArguments) obj2).b.getValue();
                if (clipFeedTransientArgumentsContainer != null) {
                    return clipFeedTransientArgumentsContainer.d;
                }
                return null;
        }
    }

    public /* synthetic */ pu(aif aifVar, xhf xhfVar) {
        this.b = 27;
        this.c = aifVar;
    }
}
