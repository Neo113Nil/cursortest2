package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.channels.impl.reactions.ChannelReactionWebViewFragment;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridLikedClipsListFragment;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.log.L;
import com.vk.mapper.attachment.di.AttachmentMappersComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.api.component.CommunityComponent;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.b;
import com.vk.profile.community.impl.ui.profile.lego.CommunityAuthorHeaderMode;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import xsna.bbv0;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hh1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hh1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x037a, code lost:
    
        if (r2 > 0.999999f) goto L87;
     */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        float f;
        int i = this.b;
        int i2 = 1;
        int i3 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                Context context = ((com.vk.photos.root.albumdetails.presentation.c) obj).b;
                HashSet hashSet = iah0.a;
                return Integer.valueOf((fnj.c(context) || iah0.s(context)) ? 3 : 6);
            case 1:
                c12 c12Var = (c12) obj;
                float c = c12Var.b().c(((zak0) c12Var.f).getValue());
                float c2 = c12Var.b().c(c12Var.g.getValue()) - c;
                float abs = Math.abs(c2);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    kg50 kg50Var = c12Var.h;
                    if (Float.isNaN(((vak0) kg50Var).getFloatValue())) {
                        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                    }
                    f = (((vak0) kg50Var).getFloatValue() - c) / c2;
                    if (f >= 1.0E-6f) {
                        break;
                    } else {
                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 2:
                ((b1z) obj).invoke();
                return s3q0.a;
            case 3:
                gw3 gw3Var = (gw3) obj;
                L.e("AsrRecordListenerProxyImpl", fw3.d(gw3Var.a, new StringBuilder("asrRecordListeners: ")));
                Iterator<l19> it = gw3Var.a.iterator();
                while (it.hasNext()) {
                    it.next().onAsrRecordStopped();
                }
                return s3q0.a;
            case 4:
                return ((DonutPriceComponent) m7m.a(((b94) obj).b).a(fpf0.a(DonutPriceComponent.class))).kf();
            case 5:
                return new z16(((r16) obj).a.getContext(), true);
            case 6:
                return i6n0.a((Uri) obj, "UPLOAD_TRACE getVideoFileInfo: analyzing file ");
            case 7:
                BonusCatalogFragment bonusCatalogFragment = ((mk7) obj).l;
                new ql7(bonusCatalogFragment.N, bonusCatalogFragment.O, false).a(bonusCatalogFragment.requireContext());
                return s3q0.a;
            case 8:
                ((com.vk.voip.ui.settings.participants_view.c) obj).x = false;
                return s3q0.a;
            case 9:
                return ((StoryEditorComponent) ((k7m) m7m.f((gta) obj)).a(fpf0.a(StoryEditorComponent.class))).ff();
            case 10:
                ChannelReactionWebViewFragment channelReactionWebViewFragment = (ChannelReactionWebViewFragment) obj;
                int i4 = ChannelReactionWebViewFragment.Q;
                FragmentActivity activity = channelReactionWebViewFragment.getActivity();
                if (activity != null) {
                    activity.runOnUiThread(new xab(channelReactionWebViewFragment, i3));
                }
                return s3q0.a;
            case 11:
                bbv0.g.getClass();
                bbv0.a.f().d.j((String) obj);
                return s3q0.a;
            case 12:
                return o1d.m((o1d) obj);
            case 13:
                return (ImageView) ((q8d) obj).b().findViewById(R.id.video_single_clip_like);
            case 14:
                return ((ClipVideoFileAdapter) obj).m.D1;
            case 15:
                return ((CameraClipsComponent) ((k7m) m7m.f((gxd) obj)).a(fpf0.a(CameraClipsComponent.class))).p9();
            case 16:
                int i5 = ClipsGridLikedClipsListFragment.i0;
                return ((ClipsConfigViewersComponent) m7m.d((ClipsGridLikedClipsListFragment) obj).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 17:
                mje mjeVar = (mje) obj;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setInterpolator(new AccelerateInterpolator());
                ofFloat.addUpdateListener(new tn2(mjeVar, i2));
                ofFloat.addListener(new nje(ofFloat, mjeVar));
                return ofFloat;
            case 18:
                xhf xhfVar = (xhf) obj;
                return new rcq0((jze) xhfVar.e.getValue(), xhfVar.c);
            case 19:
                return ((ClipsViewerComponentImpl) obj).b.getExperiments().C();
            case 20:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj;
                int i6 = ClipsWrapperFragment.Q0;
                return new cro0(clipsWrapperFragment.requireContext(), clipsWrapperFragment.vn());
            case 21:
                ClipFeedTransientArgumentsContainer clipFeedTransientArgumentsContainer = (ClipFeedTransientArgumentsContainer) ((ClipsWrapperInputArguments) obj).b.getValue();
                if (clipFeedTransientArgumentsContainer != null) {
                    return clipFeedTransientArgumentsContainer.b;
                }
                return null;
            case 22:
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                return ((AttachmentMappersComponent) m7m.d((CommentThreadFragment) obj).mo408a(fpf0.a(AttachmentMappersComponent.class))).f3();
            case 23:
                return ((xeg) obj).k;
            case 24:
                int i7 = CommunityAddressesFragment.E0;
                ((CommunityAddressesFragment) obj).a0();
                return s3q0.a;
            case 25:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) obj;
                return new swg(communityCheckListFragment, (sw50) communityCheckListFragment.T.getValue(), (maz) communityCheckListFragment.U.getValue(), (com.vk.friends.groupinvite.api.domain.a) communityCheckListFragment.R.getValue(), ((BridgeComponent) m7m.d(communityCheckListFragment).a(fpf0.a(BridgeComponent.class))).s().c(), ((CommunityComponent) m7m.d(communityCheckListFragment).a(fpf0.a(CommunityComponent.class))).ke(), ((NewsFeedComponent) m7m.d(communityCheckListFragment).a(fpf0.a(NewsFeedComponent.class))).l0());
            case 26:
                return Float.valueOf(((Number) ((c1h) obj).n.getValue()).floatValue() * r5.w());
            case 27:
                ((d4h) obj).i.invoke(CommunityProfileAction.e.AbstractC1583e.j.b);
                return s3q0.a;
            default:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) obj;
                ?? r1 = communityProfileFragment.Y;
                int i8 = CommunityProfileFragment.k0;
                UserId ho = communityProfileFragment.ho();
                ynh ynhVar = communityProfileFragment.V;
                at5 at5Var = at5.b;
                neh nehVar = new neh(ho, at5Var);
                CommunityAuthorHeaderMode go = communityProfileFragment.go();
                go.getClass();
                return new com.vk.profile.community.impl.ui.profile.b(communityProfileFragment, k840.a.g().b(), (kdg0) ynhVar.t.getValue(), new ysg0(), new myn(ho), new b.a(nehVar, go == CommunityAuthorHeaderMode.Lego ? new eqh(ho, at5Var, (ImageViewer) ynhVar.Q0.getValue(), nehVar) : new esh(ho, at5Var, (ImageViewer) ynhVar.Q0.getValue()), new xth(communityProfileFragment), communityProfileFragment.W, o6h.a((o6h) ynhVar.U0.getValue(), communityProfileFragment.requireContext(), (b3i) communityProfileFragment.X.getValue(), (zzx) ynhVar.K.getValue(), null, null, 24), (znh) r1.getValue(), new tmh(communityProfileFragment.requireContext(), (znh) r1.getValue(), ynhVar, new uoh(communityProfileFragment, i3)), new hmh(communityProfileFragment.requireContext(), new o8(communityProfileFragment, 3)), new jzg(ho, (com.vk.friends.groupinvite.api.domain.a) ynhVar.r.getValue(), ynhVar.a(), new g4g(communityProfileFragment, 4))));
        }
    }
}
