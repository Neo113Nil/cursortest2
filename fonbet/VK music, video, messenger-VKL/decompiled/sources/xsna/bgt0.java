package xsna;

import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import one.video.errorresolver.asserts.AssertEvent;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.error.OneVideoRendererException;
import one.video.player.error.OneVideoSourceException;
import one.video.player.error.ResponseInfo;
import xsna.axp;
import xsna.dgk0;
import xsna.ieq;
import xsna.nwp;
import xsna.xup;
import xsna.yft0;

/* compiled from: VideoSession.kt */
/* loaded from: classes8.dex */
public final class bgt0 implements one.video.player.f {
    public final /* synthetic */ yft0 a;

    public bgt0(yft0 yft0Var) {
        this.a = yft0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01a1  */
    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(final OneVideoPlaybackException oneVideoPlaybackException, final sht0 sht0Var, final OneVideoPlayer oneVideoPlayer) {
        axp axpVar;
        axp hgk0Var;
        String str;
        Object iVar;
        final ieq cVar;
        m5h0<?> zhj0Var;
        axp axpVar2 = sni.g;
        axp axpVar3 = xus.d;
        axp axpVar4 = uzp.c;
        axp axpVar5 = kci.e;
        axp axpVar6 = x19.g;
        axp axpVar7 = fo50.d;
        final yft0 yft0Var = this.a;
        yft0.a aVar = yft0Var.k;
        nwp nwpVar = yft0Var.d;
        nwpVar.getClass();
        boolean z = sht0Var instanceof dbn;
        axp axpVar8 = axp.a.b;
        if (!z || e360.a(oneVideoPlaybackException)) {
            mv70 mv70Var = sht0Var instanceof mv70 ? (mv70) sht0Var : null;
            if (mv70Var == null || (str = mv70Var.d) == null || !((Boolean) nwpVar.a.invoke(str)).booleanValue()) {
                int i = nwp.a.$EnumSwitchMapping$0[oneVideoPlaybackException.j().ordinal()];
                if (i == 1) {
                    dgk0 dgk0Var = nwpVar.b;
                    dgk0Var.getClass();
                    vw3 vw3Var = dgk0Var.a;
                    OneVideoPlaybackException.Type type = OneVideoPlaybackException.Type.SOURCE;
                    OneVideoSourceException i2 = oneVideoPlaybackException.i();
                    vw3Var.b(i2 != null, AssertEvent.RESOLVER_SOURCE_EXCEPTION_IS_NULL, new uw3(0));
                    if (i2 != null) {
                        if (e360.a(oneVideoPlaybackException)) {
                            hgk0Var = igk0.b;
                        } else {
                            int i3 = dgk0.a.$EnumSwitchMapping$0[oneVideoPlaybackException.d().ordinal()];
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    boolean z2 = dgk0Var.b;
                                    if (i2.h()) {
                                        hgk0Var = ggk0.b;
                                    } else if (z2) {
                                        hgk0Var = axpVar2;
                                    }
                                } else if (i3 == 3) {
                                    hgk0Var = axpVar3;
                                } else if (i3 == 4) {
                                    hgk0Var = axpVar4;
                                } else if (i3 == 5) {
                                    hgk0Var = fgk0.b;
                                }
                                if (yft0Var.a) {
                                }
                            } else {
                                OneVideoSourceException.a g = i2.g();
                                vw3Var.b(g != null, AssertEvent.RESOLVER_INVALID_RESPONSE_CODE_INFO_IS_NULL, new uw3(0));
                                if (g != null) {
                                    k9x k9xVar = dgk0.c;
                                    int i4 = k9xVar.b;
                                    int i5 = k9xVar.c;
                                    int i6 = g.a;
                                    boolean z3 = i4 <= i6 && i6 <= i5;
                                    boolean z4 = z3;
                                    axpVar = axpVar8;
                                    vw3Var.b(!z3, AssertEvent.RESOLVER_INVALID_RESPONSE_CODE_VALUE, new yu60(g, 25));
                                    if (!z4) {
                                        ResponseInfo responseInfo = g.d;
                                        hgk0Var = new hgk0(responseInfo != null && responseInfo.h());
                                        if (yft0Var.a) {
                                        }
                                    }
                                    hgk0Var = axpVar5;
                                    if (yft0Var.a) {
                                    }
                                }
                            }
                        }
                    }
                    axpVar = axpVar8;
                    hgk0Var = axpVar5;
                    if (yft0Var.a) {
                    }
                } else if (i == 2) {
                    xyf0 xyf0Var = nwpVar.c;
                    xyf0Var.getClass();
                    OneVideoPlaybackException.Type type2 = OneVideoPlaybackException.Type.SOURCE;
                    vw3 vw3Var2 = xyf0Var.a;
                    OneVideoRendererException h = oneVideoPlaybackException.h();
                    vw3Var2.b(h != null, AssertEvent.RESOLVER_RENDERER_EXCEPTION_IS_NULL, new uw3(0));
                    if (h != null) {
                        if (Collections.singletonList(OneVideoPlaybackException.ErrorCode.DECODER_INIT_FAILED).contains(oneVideoPlaybackException.d())) {
                            hgk0Var = new zyf0(xyf0.a(h));
                        } else if (e43.l(OneVideoPlaybackException.ErrorCode.DECODER_QUERY_FAILED, OneVideoPlaybackException.ErrorCode.DECODING_FAILED, OneVideoPlaybackException.ErrorCode.DECODING_FORMAT_EXCEEDS_CAPABILITIES, OneVideoPlaybackException.ErrorCode.DECODING_FORMAT_UNSUPPORTED, OneVideoPlaybackException.ErrorCode.DECODING_RESOURCES_RECLAIMED).contains(oneVideoPlaybackException.d())) {
                            hgk0Var = new azf0(xyf0.a(h));
                        } else if (Collections.singletonList(OneVideoPlaybackException.ErrorCode.AUDIO_TRACK_INIT_FAILED).contains(oneVideoPlaybackException.d())) {
                            xyf0.a(h);
                            hgk0Var = new yyf0();
                        }
                    }
                    hgk0Var = axpVar6;
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            OneVideoPlaybackException.Type type3 = OneVideoPlaybackException.Type.SOURCE;
                        } else if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hgk0Var = axpVar8;
                        axpVar = hgk0Var;
                        if (yft0Var.a) {
                            aVar.post(new wop0(yft0Var, oneVideoPlaybackException, sht0Var, 2));
                            return;
                        }
                        lwp lwpVar = yft0Var.e;
                        lwpVar.a.b(lwpVar.c != null, one.video.videosession.error.asserts.AssertEvent.PROCESSOR_VIDEO_DATA_IS_NULL, new uw3(0));
                        o5h0 o5h0Var = lwpVar.d;
                        if (o5h0Var != null) {
                            m5h0<?> m5h0Var = o5h0Var.c;
                            if (!hgk0Var.equals(o5h0Var.b) || m5h0Var == null) {
                                n5h0 n5h0Var = o5h0Var.a;
                                mwp mwpVar = n5h0Var.b;
                                xds0 xds0Var = n5h0Var.a;
                                if (hgk0Var.equals(qw8.b)) {
                                    zhj0Var = new pw8();
                                } else if (hgk0Var.equals(yt70.b)) {
                                    zhj0Var = new xt70(mwpVar.e, mwpVar.f);
                                } else if (hgk0Var.equals(igk0.b)) {
                                    zhj0Var = new d360(xds0Var, mwpVar.a);
                                } else if (hgk0Var instanceof hgk0) {
                                    zhj0Var = new kpx(xds0Var);
                                } else if (hgk0Var.equals(axpVar3)) {
                                    zhj0Var = new wsa<>(xds0Var);
                                } else if (hgk0Var.equals(axpVar4)) {
                                    zhj0Var = new wsa<>(xds0Var);
                                } else if (hgk0Var.equals(axpVar2)) {
                                    zhj0Var = new wsa<>(xds0Var);
                                } else if (hgk0Var.equals(ggk0.b)) {
                                    zhj0Var = new n9v(mwpVar.b, mwpVar.c);
                                } else if (hgk0Var.equals(fgk0.b)) {
                                    zhj0Var = new ix6();
                                } else if (hgk0Var.equals(axpVar5)) {
                                    zhj0Var = new zhj0<>();
                                } else if (hgk0Var instanceof zyf0) {
                                    zhj0Var = new psa<>(((zyf0) hgk0Var).b);
                                } else if (hgk0Var instanceof azf0) {
                                    zhj0Var = new psa<>(((azf0) hgk0Var).b);
                                } else if (hgk0Var instanceof yyf0) {
                                    zhj0Var = new qsa<>();
                                } else if (hgk0Var.equals(axpVar6)) {
                                    zhj0Var = new qsa<>();
                                } else if (hgk0Var.equals(axpVar7)) {
                                    zhj0Var = new qsa<>();
                                } else if (hgk0Var.equals(i35.e)) {
                                    zhj0Var = new zhj0<>();
                                } else {
                                    if (!hgk0Var.equals(axpVar)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    zhj0Var = new zhj0<>();
                                }
                                m5h0Var = zhj0Var;
                                o5h0Var.c = m5h0Var;
                                o5h0Var.b = hgk0Var;
                            }
                            iVar = m5h0Var.a(hgk0Var, sht0Var);
                        } else {
                            iVar = new xup.i();
                        }
                        hgk0Var.toString();
                        iVar.toString();
                        if (iVar instanceof xup.g) {
                            aVar.sendMessageDelayed(aVar.obtainMessage(1, oneVideoPlayer), zno.e(((xup.g) iVar).a));
                        } else if (iVar instanceof xup.h) {
                            final long currentPosition = oneVideoPlayer.getCurrentPosition() + ((xup.h) iVar).a;
                            long duration = oneVideoPlayer.getDuration();
                            if (currentPosition > duration) {
                                currentPosition = duration;
                            }
                            if (sht0Var != null) {
                                aVar.post(new Runnable() { // from class: xsna.zft0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        OneVideoPlayer.this.n0(sht0Var, currentPosition);
                                    }
                                });
                            }
                        } else if (iVar instanceof xup.a) {
                            one.video.stat2.a aVar2 = yft0Var.j;
                            if (aVar2 != null) {
                                aVar2.h(((xup.a) iVar).a);
                            }
                            yft0.a(yft0Var, oneVideoPlayer, ((xup.a) iVar).b);
                        } else if (iVar instanceof xup.c) {
                            yft0.a(yft0Var, oneVideoPlayer, ((xup.c) iVar).a);
                        } else {
                            if (!(iVar instanceof xup.d)) {
                                if (iVar instanceof xup.b) {
                                    cVar = new ieq.a();
                                } else if (iVar instanceof xup.e) {
                                    ((LinkedHashSet) yft0Var.f.b).add(((xup.e) iVar).a);
                                    cVar = new ieq.a();
                                } else if (iVar instanceof xup.f) {
                                    cVar = new ieq.b();
                                } else {
                                    if (!(iVar instanceof xup.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar = new ieq.c(oneVideoPlaybackException);
                                }
                                aVar.post(new Runnable() { // from class: xsna.agt0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        yft0.this.b.a(new yft0.b(oneVideoPlaybackException, sht0Var, cVar));
                                    }
                                });
                                return;
                            }
                            yft0.a(yft0Var, oneVideoPlayer, ((xup.d) iVar).a.e);
                        }
                        cVar = null;
                        aVar.post(new Runnable() { // from class: xsna.agt0
                            @Override // java.lang.Runnable
                            public final void run() {
                                yft0.this.b.a(new yft0.b(oneVideoPlaybackException, sht0Var, cVar));
                            }
                        });
                        return;
                    }
                    OneVideoPlaybackException.Type type4 = OneVideoPlaybackException.Type.SOURCE;
                    hgk0Var = axpVar7;
                }
            } else {
                hgk0Var = yt70.b;
            }
        } else {
            hgk0Var = qw8.b;
        }
        axpVar = axpVar8;
        if (yft0Var.a) {
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
        yft0 yft0Var = this.a;
        yft0Var.e.a(state2);
        OneVideoPlayer.State state3 = OneVideoPlayer.State.PLAYING;
        if ((state2 == state3 || state2 == OneVideoPlayer.State.PAUSED) && state != state3 && state != OneVideoPlayer.State.PAUSED && yft0Var.a) {
            ((LinkedHashSet) yft0Var.f.b).clear();
        }
        yft0Var.k.removeMessages(1);
    }
}
