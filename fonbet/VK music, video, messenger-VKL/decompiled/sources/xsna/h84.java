package xsna;

import com.vk.avatar.api.VKAvatarView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.actions.ActionPerformActionWithUrl;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.exceptions.BadVideoFileException;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.media.player.PlayerError;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.toggle.features.VideoFeatures;
import com.vk.writebar.attach.AttachmentsEditorView;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import one.video.exo.offline.DownloadInfo;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import xsna.ce10;
import xsna.gpt0;
import xsna.o1b0;
import xsna.ru70;
import xsna.ye20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class h84 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h84(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0369  */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ovv0 J;
        dvv0 a;
        d3b0 d3b0Var;
        OneVideoPlayer a2;
        rzr0 d1;
        d3b0 d3b0Var2;
        OneVideoPlayer a3;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                VKImageView vKImageView = (VKImageView) obj2;
                VideoOverlayView videoOverlayView = (VideoOverlayView) obj;
                int i2 = AttachmentsEditorView.C;
                Image image = ((VideoFile) obj3).getImage();
                ImageScreenSize imageScreenSize = ImageScreenSize.VERY_SMALL;
                ImageSize Cb = image.Cb(imageScreenSize.h(), true, true);
                vKImageView.O0(Cb == null ? null : Cb.d.d, imageScreenSize);
                vKImageView.setVisibility(0);
                videoOverlayView.setVisibility(8);
                return s3q0.a;
            case 1:
                VkUiCommand vkUiCommand = (VkUiCommand) obj2;
                String str = (String) obj;
                fvv0 M = ((r6y) obj3).M();
                if (M != null && (J = M.J()) != null && (a = J.a(vkUiCommand)) != null) {
                    a.a(str);
                }
                return s3q0.a;
            case 2:
                izs izsVar = (izs) obj;
                ((fe10) obj3).getClass();
                gej0 gej0Var = ((hej0) obj2).b;
                Action action = gej0Var != null ? gej0Var.b : null;
                if (action instanceof ActionPerformActionWithUrl) {
                    ActionPerformActionWithUrl actionPerformActionWithUrl = (ActionPerformActionWithUrl) action;
                    ActionPerformActionWithUrl.PerformActionWithUrl performActionWithUrl = actionPerformActionWithUrl.d;
                    String str2 = actionPerformActionWithUrl.c;
                    if (epx.f(performActionWithUrl != null ? performActionWithUrl.b : null, "open_shop_conditions_edit_action")) {
                        izsVar.invoke(ce10.a.C2660a.b);
                        izsVar.invoke(new ce10.c.a(str2));
                        s3q0 s3q0Var = s3q0.a;
                    } else {
                        izsVar.invoke(ce10.a.b.b);
                        izsVar.invoke(new ce10.c.a(str2));
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                } else if (action instanceof ActionOpenUrl) {
                    izsVar.invoke(new ce10.c.a(((ActionOpenUrl) action).c));
                    s3q0 s3q0Var3 = s3q0.a;
                }
                return s3q0.a;
            case 3:
                return (ye20.a) ((l7r0) obj3).d((ij20) obj2, ((df20) obj).j);
            case 4:
                int i3 = VKAvatarView.r;
                ((VKAvatarView) obj3).W0((i700) obj2, null, ((k9r0) obj).c);
                return s3q0.a;
            default:
                Throwable th = (Throwable) obj3;
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj2;
                PlayerError playerError = (PlayerError) obj;
                boolean z = th instanceof OneVideoPlaybackException;
                if (z && ((OneVideoPlaybackException) th).d() == OneVideoPlaybackException.ErrorCode.BEHIND_LIVE_WINDOW) {
                    videoAutoPlay.y0(videoAutoPlay.getPosition() - ((videoAutoPlay.getDuration() / 2) - videoAutoPlay.getPosition()));
                    videoAutoPlay.play();
                    videoAutoPlay.M1(playerError, th, false);
                    return s3q0.a;
                }
                ezs0 ezs0Var = videoAutoPlay.e;
                yft0 yft0Var = videoAutoPlay.p;
                boolean z2 = videoAutoPlay.o;
                d3b0 d3b0Var3 = videoAutoPlay.p0;
                m7q c = d3b0Var3 != null ? d3b0Var3.c() : null;
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIPS_NEW_DISK_CACHE;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures) && !tjs0.a(th)) {
                    sht0 sht0Var = videoAutoPlay.l0;
                    if ((sht0Var instanceof dbn ? (dbn) sht0Var : null) != null && !z2 && c != null) {
                        sht0 e = jgz.e(c);
                        dbn dbnVar = e instanceof dbn ? (dbn) e : null;
                        if (dbnVar != null && (d3b0Var2 = videoAutoPlay.p0) != null && (a3 = d3b0Var2.a()) != null) {
                            videoAutoPlay.M1(playerError, th, false);
                            m7q a4 = m7q.a(c, dbnVar.e, null, null, 0, false, false, null, a3.getCurrentPosition(), null, null, false, 66846703);
                            videoAutoPlay.L1(a4);
                            nza0 h = d3b0Var2.h();
                            if (h != null) {
                                h.a(a3, dx1.a(a4));
                            }
                            d1 = videoAutoPlay.d1();
                            if (d1 != null) {
                                d1.I();
                            }
                            return s3q0.a;
                        }
                    }
                }
                if (!z2 && (d3b0Var = videoAutoPlay.p0) != null) {
                    OneVideoPlaybackException oneVideoPlaybackException = z ? (OneVideoPlaybackException) th : null;
                    if (oneVideoPlaybackException != null && (a2 = d3b0Var.a()) != null && c != null) {
                        sht0 e2 = jgz.e(c);
                        String str3 = c.f;
                        if (str3 == null || drm0.N(str3)) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            long currentPosition = a2.getCurrentPosition();
                            com.vk.core.utils.newtork.b.a.getClass();
                            boolean d = com.vk.core.utils.newtork.b.d();
                            yft0Var.getClass();
                            if (!(e2 instanceof mv70)) {
                                boolean z3 = oneVideoPlaybackException.d() == OneVideoPlaybackException.ErrorCode.PARSING_MANIFEST_MALFORMED || oneVideoPlaybackException.d() == OneVideoPlaybackException.ErrorCode.PARSING_CONTAINER_MALFORMED;
                                if (d && !z3 && oneVideoPlaybackException.j() == OneVideoPlaybackException.Type.SOURCE && !epx.f(e2.b.getHost(), str3)) {
                                    sht0 d2 = e2.d(str3);
                                    videoAutoPlay.M1(playerError, th, false);
                                    m7q a5 = m7q.a(c, d2, null, null, 0, false, false, null, currentPosition, null, null, false, 133955567);
                                    d3b0Var.f(a5);
                                    nza0 h2 = d3b0Var.h();
                                    if (h2 != null) {
                                        h2.a(a2, dx1.a(a5));
                                    }
                                    s3q0 s3q0Var4 = s3q0.a;
                                    one.video.stat2.a aVar = yft0Var.j;
                                    if (aVar != null) {
                                        aVar.h(str3);
                                    }
                                    if (a2.f0()) {
                                        a2.n0(d2, currentPosition);
                                    } else {
                                        a2.C(d2, currentPosition);
                                    }
                                    d1 = videoAutoPlay.d1();
                                    if (d1 != null) {
                                    }
                                    return s3q0.a;
                                }
                            }
                        }
                    }
                }
                List<avp> a6 = videoAutoPlay.t.a(th, c, videoAutoPlay.getPosition());
                videoAutoPlay.M1(playerError, th, a6.contains(yhj0.a));
                if (!z2 || !z) {
                    for (avp avpVar : a6) {
                        if (epx.f(avpVar, l9g0.a)) {
                            videoAutoPlay.y1();
                        } else if (epx.f(avpVar, b9l.a)) {
                            o1b0 c2 = qu5.c();
                            o1b0.a aVar2 = o1b0.a;
                            c2.j(1);
                        } else if (avpVar instanceof ova0) {
                            videoAutoPlay.Q.b(io.reactivex.rxjava3.core.x.t(((ova0) avpVar).a, TimeUnit.MILLISECONDS).m(asu0.a.d()).subscribe(new jsb0(new ggb0(videoAutoPlay, 26), 16), new s520(new w9l0(8), 29)));
                        } else if (epx.f(avpVar, mij0.a)) {
                            if (videoAutoPlay.J0()) {
                                VideoPipStateHolder.a.getClass();
                                if (!VideoPipStateHolder.d()) {
                                    videoAutoPlay.y.a(ezs0Var.p());
                                }
                            }
                        } else if (epx.f(avpVar, yhj0.a)) {
                            if (th != null) {
                                L.i(th);
                            }
                            videoAutoPlay.k1();
                            sht0 sht0Var2 = videoAutoPlay.l0;
                            if (sht0Var2 != null) {
                                o1b0 c3 = qu5.c();
                                o1b0.a aVar3 = o1b0.a;
                                c3.f(sht0Var2, true);
                            }
                            OneVideoPlaybackException.ErrorCode d3 = z ? ((OneVideoPlaybackException) th).d() : th instanceof BadVideoFileException ? OneVideoPlaybackException.ErrorCode.IO_FILE_NOT_FOUND : OneVideoPlaybackException.ErrorCode.UNSPECIFIED;
                            videoAutoPlay.D = d3;
                            videoAutoPlay.E = th;
                            zva0 p = gpt0.p(d3, videoAutoPlay.l0 instanceof mv70);
                            if (videoAutoPlay.l0 instanceof mv70) {
                                DownloadInfo x = ezs0Var.x(videoAutoPlay.u);
                                if ((x != null ? x.c : null) == DownloadInfo.State.STATE_COMPLETED) {
                                    OneVideoPlaybackException.ErrorCode errorCode = videoAutoPlay.D;
                                    int[] iArr = gpt0.a.$EnumSwitchMapping$1;
                                    switch (iArr[errorCode.ordinal()]) {
                                        default:
                                            switch (iArr[videoAutoPlay.D.ordinal()]) {
                                            }
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                            DownloadInfo x2 = ezs0Var.x(videoAutoPlay.u);
                                            float f = x2 != null ? x2.g : -1.0f;
                                            com.vk.metrics.eventtracking.b.a.a(new Throwable("downloadedPercent " + f + ' ' + videoAutoPlay.getPosition() + ' ' + videoAutoPlay.D));
                                            if (videoAutoPlay.F != null) {
                                                m7q m7qVar = videoAutoPlay.k0;
                                                new su70(new ru70.b(m7qVar != null ? m7qVar.j : null, videoAutoPlay.u.o0(), videoAutoPlay.u.I0().b)).q();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }
                            videoAutoPlay.y.J3(videoAutoPlay, p.a, p.b, videoAutoPlay.D, th);
                            videoAutoPlay.k1();
                            videoAutoPlay.H1();
                        } else if (avpVar instanceof h8l) {
                            ((LinkedHashSet) yft0Var.f.b).add(((h8l) avpVar).a);
                        } else if (avpVar instanceof pva0) {
                            long j = ((pva0) avpVar).a;
                            m7q m7qVar2 = videoAutoPlay.k0;
                            sht0 e3 = m7qVar2 != null ? jgz.e(m7qVar2) : null;
                            d3b0 d3b0Var4 = videoAutoPlay.p0;
                            OneVideoPlayer a7 = d3b0Var4 != null ? d3b0Var4.a() : null;
                            if (e3 != null && a7 != null) {
                                long duration = videoAutoPlay.getDuration();
                                if (j > duration) {
                                    j = duration;
                                }
                                a7.n0(e3, j);
                            }
                        } else {
                            if (!(avpVar instanceof unn0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            videoAutoPlay.L1(((unn0) avpVar).a);
                        }
                    }
                }
                d1 = videoAutoPlay.d1();
                if (d1 != null) {
                }
                return s3q0.a;
        }
    }
}
