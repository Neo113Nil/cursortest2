package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.t0;
import com.facebook.soloader.MinElf;
import com.vk.attachpicker.impl.fragment.AttachMusicFragment;
import com.vk.camera.clips.drafts.sync.impl.di.ClipsDraftSyncComponentImpl;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.sdk.models.SdkDuetMeta;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsFeedRecyclerPoolSettings;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.DuetMeta;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vk.stories.design.view.editor.SideControlPanelView;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipState;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.go5;
import xsna.l7v;
import xsna.nzl;
import xsna.o0r0;
import xsna.u7e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ldc0 Pe;
        StoryCameraParams cameraParams;
        List<? extends StoryCameraMode> list;
        int i;
        int i2 = this.b;
        int i3 = 0;
        r4 = false;
        boolean z = false;
        r4 = false;
        boolean z2 = false;
        int i4 = 1;
        Object obj = this.c;
        switch (i2) {
            case 0:
                return new gk70((NotificationsPermission) obj);
            case 1:
                Pattern pattern = ln0.h1;
                FragmentActivity activity = ((ln0) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return s3q0.a;
            case 2:
                jv0 jv0Var = (jv0) obj;
                int width = jv0Var.a.getWidth();
                View view = jv0Var.a;
                Context context = view.getContext();
                HashSet hashSet = iah0.a;
                if (fnj.d(context)) {
                    width -= gjf0.a(view.getContext(), true) * 2;
                }
                return Integer.valueOf((int) (width * 0.58f));
            case 3:
                d12 d12Var = (d12) obj;
                return new Pair(d12Var.e(), d12Var.h.getValue());
            case 4:
                uj3 uj3Var = (uj3) obj;
                int itemViewType = uj3Var.getItemViewType();
                if (itemViewType == 413) {
                    i3 = uj3Var.b6().getDimensionPixelSize(R.dimen.comment_reply_margin_start);
                } else if (itemViewType == 415) {
                    i3 = uj3Var.b6().getDimensionPixelSize(R.dimen.comment_reply_small_margin_start);
                }
                return Integer.valueOf(uj3Var.b6().getDimensionPixelSize(R.dimen.post_side_padding) + i3);
            case 5:
                int i5 = AttachMusicFragment.I0;
                return ((AudioModelsComponent) m7m.d((AttachMusicFragment) obj).a(fpf0.a(AudioModelsComponent.class))).r();
            case 6:
                z84 z84Var = ((b94) obj).t;
                return (z84Var == null || (Pe = z84Var.b.Pe()) == null) ? new ldc0(false, true) : Pe;
            case 7:
                return ((cr4) obj).a.r();
            case 8:
                fg5 fg5Var = (fg5) obj;
                v3p v3pVar = fg5Var.d;
                nrk0 b = v3pVar.b();
                DashedSeekBar dashedSeekBar = fg5Var.g;
                b.b(new go5.d((dashedSeekBar != null ? Float.valueOf(dashedSeekBar.getCurrentValue()) : 0).intValue()));
                v3pVar.c(true);
                return s3q0.a;
            case 9:
                return (SideControlPanelView) ((y440) obj).findViewById(R.id.side_control_panel);
            case 10:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj;
                ref$BooleanRef.element = !ref$BooleanRef.element;
                fxc0.B().T().o(ref$BooleanRef.element);
                nf9.f();
                return s3q0.a;
            case 11:
                int i6 = BoardTopicsFragment.S0;
                UserId userId = (UserId) ((BoardTopicsFragment) obj).requireArguments().getParcelable("group_id");
                return userId == null ? UserId.d : userId;
            case 12:
                gzs gzsVar = (gzs) ((zak0) ((co7) obj).b).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 13:
                BottomSheetCommentsFragment bottomSheetCommentsFragment = (BottomSheetCommentsFragment) obj;
                nzl.a aVar = BottomSheetCommentsFragment.f1;
                return new o6s0(new p6s0(m6s0.a(bottomSheetCommentsFragment.mo2getContext(), bottomSheetCommentsFragment)));
            case 14:
                bp8 bp8Var = (bp8) obj;
                bp8Var.g.d().m(bp8Var.b, com.vk.dto.common.a.b(bp8Var.O()), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 15:
                CameraUIView cameraUIView = (CameraUIView) obj;
                float f = CameraUIView.w1;
                if (cameraUIView.getShutter() != null) {
                    Rect rect = new Rect();
                    cameraUIView.getShutter().getGlobalVisibleRect(rect);
                    Activity h = e3m.h(cameraUIView.getContext());
                    bm9 presenter = cameraUIView.getPresenter();
                    StoryCameraMode c4 = presenter != null ? presenter.c4() : null;
                    StoryCameraMode storyCameraMode = StoryCameraMode.QR_SCANNER;
                    if (c4 != storyCameraMode && (((cameraParams = cameraUIView.getCameraParams()) == null || (list = cameraParams.e) == null || list.contains(storyCameraMode)) && h != null)) {
                        l7v b2 = cameraUIView.getDeps().h().b();
                        HintId hintId = HintId.INFO_BUBBLE_QR_SCANNER_CAMERA;
                        if (b2.a(hintId.getId())) {
                            l7v b3 = cameraUIView.getDeps().h().b();
                            String id = hintId.getId();
                            b3.getClass();
                            l7v.b bVar = new l7v.b(id, b3, rect);
                            bVar.e = new ra6(cameraUIView, i4);
                            bVar.j = true;
                            bVar.i = true;
                            cameraUIView.O = bVar.j(h);
                        }
                    }
                }
                return s3q0.a;
            case 16:
                CartFragment cartFragment = (CartFragment) obj;
                qcy<Object>[] qcyVarArr = CartFragment.Y;
                return new yw9(cartFragment, new CartFragment.b(1, cartFragment, CartFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0));
            case 17:
                return (CatalogSectionState) obj;
            case 18:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i7 = ChannelFragment.a1;
                Channel b4 = channelFragment.lo().b();
                if ((b4 != null ? b4.z : null) == ChannelType.COMMUNITY_CHANNEL) {
                    Group b5 = channelFragment.no().b();
                    if ((b5 != null ? b5.t : null) == GroupPrivacy.CLOSED) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 19:
                ChatFragment chatFragment = (ChatFragment) obj;
                chatFragment.G0 = null;
                chatFragment.w0 = null;
                if (!chatFragment.isResumed() || !chatFragment.isAdded() || !chatFragment.isVisible()) {
                    return s3q0.a;
                }
                com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.V0();
                imv imvVar = chatFragment.J0;
                (imvVar != null ? imvVar : null).onResume();
                return s3q0.a;
            case 20:
                qsb qsbVar = (qsb) obj;
                qsbVar.X0(qsbVar.p, true);
                return s3q0.a;
            case 21:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i8 = ClipFeedListFragment.a2;
                Context mo2getContext = clipFeedListFragment.mo2getContext();
                sxc sxcVar = new sxc(clipFeedListFragment, i3);
                txc txcVar = new txc(clipFeedListFragment, i3);
                dkm dkmVar = new dkm();
                dkmVar.b = (cro0) mo2getContext;
                dkmVar.c = sxcVar;
                dkmVar.d = txcVar;
                return dkmVar;
            case 22:
                return (ClipsInterestsComponent) ((k7m) m7m.f((o1d) obj)).a(fpf0.a(ClipsInterestsComponent.class));
            case 23:
                return (ViewGroup) ((q8d) obj).b().findViewById(R.id.video_single_clip_song_container);
            case 24:
                ClipState clipState = (ClipState) obj;
                ClipVideoFile clipVideoFile = clipState.c;
                String str = clipState.b;
                ActionLink m1 = clipVideoFile.m1();
                if (epx.f(m1 != null ? m1.c : null, "video")) {
                    ActionLink m12 = clipVideoFile.m1();
                    if (!epx.f(m12 != null ? m12.d : null, str)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 25:
                DuetMeta duetMeta = ((ClipVideoFileAdapter) obj).m.G1;
                if (duetMeta != null) {
                    return new SdkDuetMeta(duetMeta.b, duetMeta.c, duetMeta.d, duetMeta.e, duetMeta.f);
                }
                return null;
            case 26:
                ClipsDraftSyncComponentImpl clipsDraftSyncComponentImpl = (ClipsDraftSyncComponentImpl) obj;
                dwx0.h(clipsDraftSyncComponentImpl.c.a);
                return new fud(clipsDraftSyncComponentImpl.d.s());
            case 27:
                return ((s0e) obj).b.inflate();
            case 28:
                u7e u7eVar = (u7e) obj;
                ClipsFeedRecyclerPoolSettings h0 = u7eVar.b.j.h0();
                ClipFeedAdapter clipFeedAdapter = (ClipFeedAdapter) ((r8e) u7eVar.h.getValue()).k.getValue();
                int i9 = u7e.a.$EnumSwitchMapping$0[h0.a.ordinal()];
                if (i9 == 1) {
                    i = 4;
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 5;
                }
                return new androidx.recyclerview.widget.t0(new t0.b(i, 0, u7eVar.a.d, u7eVar.d, "ClipFeedListFragment." + ((AtomicInteger) u7e.i.getValue()).incrementAndGet(), new com.vk.movika.sdk.base.observable.q(clipFeedAdapter, 27), new u7e.b(1, u7eVar, u7e.class, "notifyViewHolderCreated", "notifyViewHolderCreated(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z", 0), 64), new fvr(), ckf0.a);
            default:
                return new nod(((iff) obj).a().d());
        }
    }
}
