package xsna;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.holders.video.playlist.cover.VideoPlaylistCoverXmlVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoAlbumVh;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.log.LogLevel;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.video.ad.a;
import com.vk.video.ad.data.VideoAdInfo;
import com.vk.video.ad.e;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatInfo;
import com.vkontakte.android.fragments.WebViewFragment;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import one.video.transform.TransformController;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a7f0;
import xsna.cox0;
import xsna.jhw0;
import xsna.lgs0;
import xsna.lyr0;
import xsna.pl30;
import xsna.q8v;
import xsna.w8v;
import xsna.ye0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class efr0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ efr0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v43, types: [com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem$k] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ye0.a.C4096a f;
        a6z0 a;
        ArrayList<UIBlock> arrayList;
        Object cVar;
        Dialog a2;
        int i = 8;
        boolean z = true;
        z = true;
        switch (this.b) {
            case 0:
                ((kfr0) this.c).b.o = null;
                return s3q0.a;
            case 1:
                com.vk.video.ad.e eVar = (com.vk.video.ad.e) this.c;
                VideoAdInfo videoAdInfo = (VideoAdInfo) obj;
                Size parseSize = Size.parseSize(videoAdInfo.g().c);
                VideoTextureView videoTextureView = eVar.m;
                ImageView imageView = eVar.o;
                TransformController.ScaleType scaleType = TransformController.ScaleType.FIT;
                SoftReference<Bitmap> softReference = VideoTextureView.r;
                videoTextureView.i(scaleType, false);
                videoTextureView.getMatrixProvider().l(parseSize.getWidth(), parseSize.getHeight());
                yg5 d = videoAdInfo.d();
                FrameLayout frameLayout = eVar.p;
                je0 N0 = d.N0();
                if (N0 != null && (f = ((ye0.a) N0).f()) != null && (a = f.a()) != null) {
                    frameLayout.removeAllViews();
                    frameLayout.addView(a);
                }
                eVar.a(videoAdInfo);
                d.z0(videoTextureView, new com.vk.libvideo.autoplay.a(true, null, null, false, false, false, null, null, null, null, PlayerType.FULLSCREEN, null, false, null, 491390), null);
                eVar.b.invoke(a.b.b);
                d.l0();
                final xm2 xm2Var = eVar.t;
                final boolean h = videoAdInfo.h();
                final io2 io2Var = xm2Var.a;
                io2 io2Var2 = xm2Var.a;
                e.a aVar = xm2Var.b;
                final tn10 a3 = aVar.a();
                com.vk.video.ad.e eVar2 = com.vk.video.ad.e.this;
                final FrameLayout frameLayout2 = eVar2.p;
                final View view = eVar2.i;
                if (io2Var == null || !(h || io2Var.f0())) {
                    if (io2Var2 != null) {
                        io2Var2.e0();
                    }
                    aVar.a().b().setHasTransientState(true);
                    Iterator it = e43.l(frameLayout2, view).iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setBackgroundColor(-16777216);
                    }
                    if (io2Var2 != null) {
                        io2Var2.D0();
                    }
                    aVar.a().b().setHasTransientState(false);
                    xm2Var.d.invoke(Boolean.valueOf(h));
                } else {
                    view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    awt0.t(a3.b(), new gzs() { // from class: xsna.tm2
                        @Override // xsna.gzs
                        public final Object invoke() {
                            xm2 xm2Var2 = xm2.this;
                            io2 io2Var3 = xm2Var2.a;
                            if (io2Var3 != null) {
                                io2Var3.e0();
                            }
                            xm2Var2.b.a().b().setHasTransientState(true);
                            boolean z2 = h;
                            xm2.a(a3, io2Var, false, z2 ? 0 : xm2Var2.c).start();
                            final View view2 = frameLayout2;
                            final View view3 = view;
                            Iterator it2 = e43.l(view2, view3).iterator();
                            while (it2.hasNext()) {
                                ((View) it2.next()).setBackgroundColor(-16777216);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            ofFloat.setDuration(BaseAnimationDialog.a0);
                            ofFloat.setInterpolator(BaseAnimationDialog.Z);
                            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.um2
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    double d2 = floatValue;
                                    if (ConnectivityTracker.DEFAULT_UPLINK_BITRATE > d2 || d2 > 1.0d) {
                                        return;
                                    }
                                    view2.setTranslationY((1 - floatValue) * r0.getHeight());
                                    view3.setAlpha(floatValue);
                                }
                            });
                            ofFloat.addListener(new wm2(xm2Var2, z2));
                            ofFloat.start();
                            return s3q0.a;
                        }
                    });
                }
                eVar.c(videoAdInfo.g().d);
                imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                imageView.setVisibility(8);
                d.f0(eVar.r);
                videoTextureView.setOnClickListener(new hm80(z ? 1 : 0, eVar, d));
                imageView.setOnClickListener(new h3a(2, eVar, d));
                bwt0.i0(eVar.q, new u2k0(eVar, 16));
                return s3q0.a;
            case 2:
                VideoAlbumVh videoAlbumVh = (VideoAlbumVh) this.c;
                ArrayList<UIBlock> arrayList2 = ((UIBlockList) obj).y;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    for (UIBlock uIBlock : arrayList2) {
                        if ((uIBlock instanceof UIBlockList) && ((arrayList = ((UIBlockList) uIBlock).y) == null || !arrayList.isEmpty())) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                String str = ((UIBlock) it2.next()).b;
                                UIBlockVideoAlbum uIBlockVideoAlbum = videoAlbumVh.z;
                                if (epx.f(str, uIBlockVideoAlbum != null ? uIBlockVideoAlbum.b : null)) {
                                    return Boolean.valueOf(z);
                                }
                            }
                        }
                        String str2 = uIBlock.b;
                        UIBlockVideoAlbum uIBlockVideoAlbum2 = videoAlbumVh.z;
                        if (epx.f(str2, uIBlockVideoAlbum2 != null ? uIBlockVideoAlbum2.b : null)) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 3:
                ((e9i0) this.c).invoke((Throwable) obj);
                return s3q0.a;
            case 4:
                qgi0.h((tgi0) obj, ((VideoMetaViewState.a) this.c).b.b);
                return s3q0.a;
            case 5:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) this.c;
                VideoAdvertisementsRepository videoAdvertisementsRepository = gVar.l;
                if (((Boolean) obj).booleanValue()) {
                    VideoAdvertisementsRepository.AdType adType = VideoAdvertisementsRepository.AdType.SPORT_BANNER;
                    videoAdvertisementsRepository.c(adType);
                    VideoPlayerStatInfo videoPlayerStatInfo = gVar.a0.P0().d;
                    a7f0.a.e(gVar, videoAdvertisementsRepository.e(adType, videoPlayerStatInfo != null ? videoPlayerStatInfo.b : null), null, new xka0(gVar, 25), new wug0(gVar, 27), null, 9);
                } else {
                    videoAdvertisementsRepository.c(VideoAdvertisementsRepository.AdType.SPORT_BANNER);
                }
                return s3q0.a;
            case 6:
                ((VideoPlaylistCoverXmlVh) this.c).e(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 7:
                yat0 yat0Var = (yat0) this.c;
                lgs0 lgs0Var = (lgs0) obj;
                if (lgs0Var instanceof lgs0.b) {
                    yat0Var.getClass();
                    return io.reactivex.rxjava3.core.q.T(rl3.I(new AboutVideoItem[]{yat0Var.f ? null : AboutVideoItem.k.b, AboutVideoItem.x.b}));
                }
                if (!(lgs0Var instanceof lgs0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lgs0.a aVar2 = (lgs0.a) lgs0Var;
                yat0Var.getClass();
                int i2 = 12;
                return yat0Var.g.s0(new i4f0(new k7l0((!aVar2.d ? io.reactivex.rxjava3.core.q.T(new lyr0.a.C3311a(false)) : yat0Var.b.b()).s0(new u730(new jl6(yat0Var, aVar2, io.reactivex.rxjava3.core.q.m(io.reactivex.rxjava3.core.q.T(aVar2), yat0Var.h, new bj50(new com.vk.movika.tools.controls.seekbar.r(yat0Var, 14), 18)), i2), 17)), 21), i2));
            case 8:
                ((wdt0) this.c).c.invoke(Float.valueOf(((Integer) obj).intValue() / 100.0f));
                return s3q0.a;
            case 9:
                int i3 = VkAuthPasswordView.i;
                ((View.OnClickListener) this.c).onClick((View) obj);
                return s3q0.a;
            case 10:
                ((xiu0) this.c).g = (wjc) obj;
                return s3q0.a;
            case 11:
                l5v0 l5v0Var = (l5v0) this.c;
                q8v q8vVar = (q8v) obj;
                if (!(q8vVar instanceof q8v.c)) {
                    if (q8vVar instanceof q8v.a) {
                        boolean z2 = ((q8v.a) q8vVar).a;
                        if (l5v0Var.r) {
                            return new pl30.a(l5v0Var.r);
                        }
                        cVar = new pl30.a(z2);
                    } else {
                        if (!(q8vVar instanceof q8v.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = new pl30.c(((q8v.b) q8vVar).a);
                    }
                    return cVar;
                }
                w8v w8vVar = ((q8v.c) q8vVar).a;
                jl30 jl30Var = l5v0Var.f;
                gj30 gj30Var = w8vVar.b;
                if (gj30Var.k().isEmpty()) {
                    jl30Var.a.b();
                } else {
                    jl30Var.a.f((mdz) jl30Var.g.getValue(), null);
                }
                if (w8vVar instanceof w8v.b) {
                    a2 = l5v0Var.g();
                } else {
                    a2 = l5v0Var.d().a();
                    if (a2 == null) {
                        a2 = l5v0Var.g();
                    }
                }
                jl30Var.a.c((mdz) jl30Var.h.getValue());
                ell ellVar = l5v0Var.e;
                List<Msg> k = gj30Var.k();
                f1e0 f1e0Var = new f1e0();
                if ((k instanceof List) && (k instanceof RandomAccess)) {
                    List<Msg> list = k;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        lv30.b(list.get(i4), f1e0Var);
                    }
                } else {
                    Iterator it3 = k.iterator();
                    while (it3.hasNext()) {
                        lv30.b((Msg) it3.next(), f1e0Var);
                    }
                }
                f1e0Var.e(ijm.a(a2));
                if (!f1e0Var.f()) {
                    f1e0 Db = ellVar.b().Db();
                    ellVar.a(ellVar.c(new f1e0(izi0.g(f1e0Var.a, Db.a), izi0.g(f1e0Var.b, Db.b), izi0.g(f1e0Var.c, Db.c), izi0.g(f1e0Var.d, Db.d), izi0.g(f1e0Var.e, Db.e)), Source.CACHE));
                }
                jl30Var.a.f((mdz) jl30Var.h.getValue(), null);
                jl30Var.a.c((mdz) jl30Var.i.getValue());
                if (gj30Var.o() && gj30Var.isEmpty() && l5v0Var.e() == null) {
                    try {
                        l5v0Var.h().d(new vom0(new n5v0(1, l5v0Var, l5v0.class, "onUpdateLoaded", "onUpdateLoaded(Lcom/vk/im/ui/components/msg_list/loader/VkMsgListDataLoader$LocalStateUpdate;)V", 0), 5), new t6m0(new ug8(l5v0Var, 15), i));
                    } catch (Exception e) {
                        f9w f9wVar = l5v0.t;
                        f9wVar.getClass();
                        if (!f9wVar.d(LogLevel.ERROR)) {
                            String str3 = f9wVar.a;
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.LogType logType = L.LogType.e;
                                qcy<Object>[] qcyVarArr = l5v0.s;
                                L.w(l, logType, e, new Object[]{str3, "handleHistoryUpdate: updateFriendMutual() error"}, null, null, 24);
                            }
                        }
                    }
                }
                jl30Var.a.f((mdz) jl30Var.i.getValue(), null);
                return new pl30.d(w8vVar);
            case 12:
                ((mov0) this.c).e((Throwable) obj);
                return s3q0.a;
            case 13:
                return Boolean.valueOf(((com.vk.voip.ui.actions.feature.b) this.c).c.a());
            case 14:
                jhw0.b bVar = (jhw0.b) obj;
                ((ihw0) this.c).c(new jhw0.c(bVar.a, bVar.b, bVar.c, bVar.d, bVar.g, bVar.h));
                return s3q0.a;
            case 15:
                ((mjw0) this.c).y.a();
                return s3q0.a;
            case 16:
                e9z e9zVar = (e9z) this.c;
                Boolean bool = (Boolean) obj;
                int i5 = WebViewFragment.O0;
                if (e9zVar != null) {
                    e9zVar.s0(bool.booleanValue());
                }
                return null;
            default:
                ((xnx0) this.c).T(new cox0.a.c(((Boolean) obj).booleanValue()));
                return s3q0.a;
        }
    }
}
