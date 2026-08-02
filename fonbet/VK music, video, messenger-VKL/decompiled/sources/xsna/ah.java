package xsna;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.channels.impl.donut.a;
import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment.q;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.a3p0;
import xsna.du;
import xsna.g37;
import xsna.nce;
import xsna.u1f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ah implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ah(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0282, code lost:
    
        if (r3 > 0.999999f) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        float f;
        io.reactivex.rxjava3.disposables.c cVar;
        a3p0.a.C2519a c2519a;
        a3p0.a.C2519a c2519a2;
        int i = this.b;
        int i2 = 2;
        r3 = null;
        Long l = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                AbstractPollView abstractPollView = (AbstractPollView) obj;
                AbstractPollView.c cVar2 = abstractPollView.b;
                if (cVar2 != null) {
                    cVar2.C3(abstractPollView.getPoll());
                }
                return s3q0.a;
            case 1:
                StringBuilder sb = new StringBuilder("Mark action ");
                du.a aVar = (du.a) ((du) obj);
                sb.append((Object) b70.c(aVar.a().c()));
                sb.append(" not synced due to recoverable error on ");
                sb.append(aVar.a().d());
                sb.append(" attempt.");
                return sb.toString();
            case 2:
                iy0 iy0Var = (iy0) obj;
                return new ph5(new fh1(i2, iy0Var, "ads_mvi_item_vh" + iy0Var.hashCode()), iy0Var, new com.vk.movika.sdk.base.observable.g(iy0Var, 1));
            case 3:
                ((com.vk.photos.root.albumdetails.presentation.c) obj).j.invalidateItemDecorations();
                return s3q0.a;
            case 4:
                f12 f12Var = (f12) obj;
                float c = f12Var.c().c(((zak0) f12Var.h).getValue());
                float c2 = f12Var.c().c(f12Var.i.getValue()) - c;
                float abs = Math.abs(c2);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    f = (f12Var.f() - c) / c2;
                    if (f >= 1.0E-6f) {
                        break;
                    } else {
                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 5:
                ((bp50) ((p16) obj).h.getValue()).a();
                return s3q0.a;
            case 6:
                return (FrameLayout) ((y440) obj).findViewById(R.id.fl_stickers_container);
            case 7:
                StringBuilder sb2 = new StringBuilder("UPLOAD_TRACE convert: returning prepared file ");
                ResumableAttachUploadInfo resumableAttachUploadInfo = ((qr6) obj).p;
                sb2.append((resumableAttachUploadInfo != null ? resumableAttachUploadInfo : null).l());
                return sb2.toString();
            case 8:
                return new g37.a((f37) ((g37) obj).h);
            case 9:
                return new mca(((qca) obj).c);
            case 10:
                ((com.vk.channels.impl.donut.c) obj).b.invoke(a.C0536a.b);
                return s3q0.a;
            case 11:
                ChannelProfileFragment channelProfileFragment = (ChannelProfileFragment) obj;
                int i3 = ChannelProfileFragment.e0;
                return new edb((ixa) channelProfileFragment.V.getValue(), channelProfileFragment.Q, channelProfileFragment.P);
            case 12:
                return i5s.a(new StringBuilder(), ((wgb) obj).s, ": updateExpiredHistory: finished update history chunk");
            case 13:
                ChatFragment chatFragment = (ChatFragment) obj;
                ImageViewer.c<AttachForMediaViewer> cVar3 = chatFragment.w0;
                if (cVar3 != null) {
                    cVar3.d(chatFragment.ro());
                }
                return s3q0.a;
            case 14:
                uwb uwbVar = (uwb) obj;
                if (!uwbVar.Y0()) {
                    uwbVar.X0();
                }
                return s3q0.a;
            case 15:
                tsu tsuVar = ((azb) obj).k;
                if (tsuVar != null && (cVar = ((xyb) tsuVar.b).x.h) != null) {
                    cVar.dispose();
                }
                return s3q0.a;
            case 16:
                z4c z4cVar = (z4c) obj;
                return z4cVar.O(new zu80(z4cVar.i, z4cVar.g));
            case 17:
                ((wh50) obj).setValue(Boolean.TRUE);
                return s3q0.a;
            case 18:
                int i4 = ClipFeedListFragment.a2;
                ((exc) obj).invoke();
                return s3q0.a;
            case 19:
                int i5 = ClipFeedListFragment.a2;
                return ((ClipFeedListFragment) obj).new q();
            case 20:
                return ((q8d) obj).b().findViewById(R.id.video_single_clip_bottom_padding);
            case 21:
                int i6 = ClipVideoFile.Y1;
                return ((ClipVideoFile) obj).Lb();
            case 22:
                return ((VideoChannelComponent) ((k7m) m7m.c((pid) obj)).mo408a(fpf0.a(VideoChannelComponent.class))).h4();
            case 23:
                return new j5p0((qhd) ((fxd) obj).h.getValue());
            case 24:
                return (VkText) ((s0e) obj).i().findViewById(R.id.video_undo_redo_info);
            case 25:
                ((p4e) obj).b.invoke(a.e.b);
                return s3q0.a;
            case 26:
                ClipsGridCommonClipsListFragment clipsGridCommonClipsListFragment = (ClipsGridCommonClipsListFragment) obj;
                int i7 = ClipsGridCommonClipsListFragment.q0;
                return new nce(new nce.b(clipsGridCommonClipsListFragment.mo(), "CLIPS_GRID_COMMON_CLIPS", clipsGridCommonClipsListFragment.no()), new ClipsGridCommonClipsListFragment.c(2, clipsGridCommonClipsListFragment, ClipsGridCommonClipsListFragment.class, "onOpenClipClicked", "onOpenClipClicked(ILcom/vk/libvideo/api/AnimationDialogCallback;)V", 0), new ClipsGridCommonClipsListFragment.d(2, clipsGridCommonClipsListFragment, ClipsGridCommonClipsListFragment.class, "onOpenCameraClicked", "onOpenCameraClicked(Lcom/vk/dto/shortvideo/ClipGridParams$Data;Lcom/vk/dto/shortvideo/ClipCameraParams;)V", 0), new ClipsGridCommonClipsListFragment.e(1, clipsGridCommonClipsListFragment, ClipsGridCommonClipsListFragment.class, "onSubscribeClicked", "onSubscribeClicked(Lcom/vk/dto/shortvideo/entries/ClipsGridHeaderEntry$Author;)V", 0), new ClipsGridCommonClipsListFragment.f(0, (ide) clipsGridCommonClipsListFragment.getParentFragment(), ide.class, "getTabsCount", "getTabsCount()I", 0), clipsGridCommonClipsListFragment.getViewLifecycleOwner(), (zof) clipsGridCommonClipsListFragment.f0.getValue(), (ClipsPlaylistsComponent) clipsGridCommonClipsListFragment.h0.getValue());
            case 27:
                final kje kjeVar = (kje) obj;
                final ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.jje
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (ofFloat.isRunning()) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            kje kjeVar2 = kjeVar;
                            Pair<Float, Float> pair = kjeVar2.d;
                            float floatValue2 = pair.d().floatValue();
                            float floatValue3 = pair.g().floatValue();
                            Pair<Float, Float> pair2 = kjeVar2.e;
                            float floatValue4 = pair2.d().floatValue();
                            float floatValue5 = pair2.g().floatValue();
                            float b = u11.b(floatValue4, floatValue2, floatValue, floatValue2);
                            float b2 = u11.b(floatValue5, floatValue3, floatValue, floatValue3);
                            kjeVar2.c = new Pair<>(Float.valueOf(b), Float.valueOf(b2));
                            kjeVar2.a.invoke(Float.valueOf(b), Float.valueOf(b2));
                        }
                    }
                });
                ofFloat.addListener(new lje(ofFloat, kjeVar));
                return ofFloat;
            case 28:
                yle yleVar = (yle) obj;
                ?? r1 = yleVar.t;
                a3p0.a aVar2 = yleVar.B;
                String str = (aVar2 == null || (c2519a2 = aVar2.e) == null) ? null : c2519a2.a;
                if (aVar2 != null && (c2519a = aVar2.e) != null) {
                    l = c2519a.g;
                }
                if (str == null) {
                    ((BridgeComponent) r1.getValue()).x().e().e().b();
                } else {
                    ((BridgeComponent) r1.getValue()).x().e().e().a(l != null ? l.longValue() : 0L, str);
                }
                ClipGridParams.Data.Music music = yleVar.C;
                if (music != null) {
                    yleVar.g(music);
                }
                return s3q0.a;
            default:
                return new u1f.a(((u1f) obj).L);
        }
    }
}
