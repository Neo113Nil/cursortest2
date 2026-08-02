package androidx.media3.exoplayer;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import defpackage.ah3;
import defpackage.co31;
import defpackage.do31;
import defpackage.e5h;
import defpackage.h42;
import defpackage.i6z0;
import defpackage.j5h;
import defpackage.k920;
import defpackage.kyg;
import defpackage.m4h;
import defpackage.nno;
import defpackage.o4h;
import defpackage.odf;
import defpackage.p4h;
import defpackage.q4h;
import defpackage.qe10;
import defpackage.qyg;
import defpackage.rdf;
import defpackage.re10;
import defpackage.ruy;
import defpackage.s820;
import defpackage.t4h;
import defpackage.u4h;
import defpackage.upt0;
import defpackage.ury0;
import defpackage.v4h;
import defpackage.w820;
import defpackage.we3;
import defpackage.x4h;
import defpackage.xaj;
import defpackage.xg3;
import defpackage.xxc0;
import defpackage.zgl;
import java.util.List;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
final class ExoPlayerImpl$ComponentListener implements co31, xg3, ury0, k920, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, upt0, we3, nno {
    final /* synthetic */ f this$0;

    private ExoPlayerImpl$ComponentListener(f fVar) {
        this.this$0 = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMetadata$4(xxc0 xxc0Var) {
        xxc0Var.onMediaMetadataChanged(this.this$0.R);
    }

    @Override // defpackage.we3
    public void onAudioBecomingNoisy() {
        f fVar = this.this$0;
        int i = f.y0;
        fVar.C(3, false);
    }

    @Override // defpackage.xg3
    public void onAudioCodecError(Exception exc) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1029, new x4h(e, exc, 0));
    }

    @Override // defpackage.xg3
    public void onAudioDecoderInitialized(String str, long j, long j2) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND, new o4h(e, str, j2, j, 0));
    }

    @Override // defpackage.xg3
    public void onAudioDecoderReleased(String str) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1012, new p4h(e, str, 1));
    }

    @Override // defpackage.xg3
    public void onAudioDisabled(kyg kygVar) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 b = j5hVar.b(j5hVar.w.e);
        j5hVar.f(b, 1013, new t4h(b, kygVar, 0));
        f fVar = this.this$0;
        fVar.U = null;
        fVar.f0 = null;
    }

    @Override // defpackage.xg3
    public void onAudioEnabled(kyg kygVar) {
        f fVar = this.this$0;
        fVar.f0 = kygVar;
        j5h j5hVar = (j5h) fVar.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1007, new t4h(e, kygVar, 3));
    }

    @Override // defpackage.xg3
    public void onAudioInputFormatChanged(androidx.media3.common.a aVar, qyg qygVar) {
        f fVar = this.this$0;
        fVar.U = aVar;
        j5h j5hVar = (j5h) fVar.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, Constants.RESULT_CHECK_ERROR_CARRIER_NOT_FOUND, new u4h(e, aVar, qygVar, 1));
    }

    @Override // defpackage.xg3
    public void onAudioPositionAdvancing(final long j) {
        j5h j5hVar = (j5h) this.this$0.s;
        final h42 e = j5hVar.e();
        j5hVar.f(e, 1010, new ruy() { // from class: n4h
            @Override // defpackage.ruy
            public final void invoke(Object obj) {
                ((j42) obj).onAudioPositionAdvancing(h42.this, j);
            }
        });
    }

    @Override // defpackage.xg3
    public void onAudioSinkError(Exception exc) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1014, new x4h(e, exc, 1));
    }

    @Override // defpackage.xg3
    public void onAudioTrackInitialized(ah3 ah3Var) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1031, new v4h(e, ah3Var, 0));
    }

    @Override // defpackage.xg3
    public void onAudioTrackReleased(ah3 ah3Var) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1032, new v4h(e, ah3Var, 1));
    }

    @Override // defpackage.xg3
    public void onAudioUnderrun(int i, long j, long j2) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1011, new m4h(e, i, j, j2, 1));
    }

    @Override // defpackage.ury0
    public void onCues(rdf rdfVar) {
        f fVar = this.this$0;
        fVar.j0 = rdfVar;
        fVar.m.f(27, new c(0, rdfVar));
    }

    @Override // defpackage.co31
    public void onDroppedFrames(int i, long j) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 b = j5hVar.b(j5hVar.w.e);
        j5hVar.f(b, 1018, new q4h(b, i, j));
    }

    @Override // defpackage.k920
    public void onMetadata(w820 w820Var) {
        f fVar = this.this$0;
        qe10 a = fVar.u0.a();
        int i = 0;
        while (true) {
            s820[] s820VarArr = w820Var.a;
            if (i >= s820VarArr.length) {
                break;
            }
            s820VarArr[i].populateMediaMetadata(a);
            i++;
        }
        fVar.u0 = new re10(a);
        re10 g = this.this$0.g();
        if (!g.equals(this.this$0.R)) {
            f fVar2 = this.this$0;
            fVar2.R = g;
            fVar2.m.c(14, new c(1, this));
        }
        this.this$0.m.c(28, new c(2, w820Var));
        this.this$0.m.b();
    }

    public /* bridge */ /* synthetic */ void onOffloadedPlayback(boolean z) {
    }

    @Override // defpackage.co31
    public void onRenderedFirstFrame(Object obj, long j) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 26, new e5h(e, obj, j, 0));
        f fVar = this.this$0;
        if (fVar.V == obj) {
            fVar.m.f(26, new zgl(22));
        }
    }

    @Override // defpackage.xg3
    public void onSkipSilenceEnabledChanged(final boolean z) {
        f fVar = this.this$0;
        if (fVar.i0 == z) {
            return;
        }
        fVar.i0 = z;
        fVar.m.f(23, new ruy() { // from class: androidx.media3.exoplayer.d
            @Override // defpackage.ruy
            public final void invoke(Object obj) {
                ((xxc0) obj).onSkipSilenceEnabledChanged(z);
            }
        });
    }

    @Override // defpackage.nno
    public void onSleepingForOffloadChanged(boolean z) {
        f fVar = this.this$0;
        int i = f.y0;
        fVar.E();
    }

    public void onStreamTypeChanged(int i) {
        f fVar = this.this$0;
        int i2 = f.y0;
        fVar.getClass();
        i6z0 i6z0Var = new i6z0(2);
        i6z0Var.b = 0;
        i6z0Var.c = 0;
        xaj xajVar = new xaj(i6z0Var);
        if (xajVar.equals(this.this$0.s0)) {
            return;
        }
        f fVar2 = this.this$0;
        fVar2.s0 = xajVar;
        fVar2.m.f(29, new c(5, xajVar));
    }

    public void onStreamVolumeChanged(final int i, final boolean z) {
        this.this$0.m.f(30, new ruy() { // from class: androidx.media3.exoplayer.e
            @Override // defpackage.ruy
            public final void invoke(Object obj) {
                ((xxc0) obj).onDeviceVolumeChanged(i, z);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        f fVar = this.this$0;
        int i3 = f.y0;
        fVar.getClass();
        Surface surface = new Surface(surfaceTexture);
        fVar.z(surface);
        fVar.W = surface;
        this.this$0.s(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f fVar = this.this$0;
        int i = f.y0;
        fVar.z(null);
        this.this$0.s(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        f fVar = this.this$0;
        int i3 = f.y0;
        fVar.s(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // defpackage.co31
    public void onVideoCodecError(Exception exc) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1030, new x4h(e, exc, 3));
    }

    @Override // defpackage.co31
    public void onVideoDecoderInitialized(String str, long j, long j2) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1016, new o4h(e, str, j2, j, 1));
    }

    @Override // defpackage.co31
    public void onVideoDecoderReleased(String str) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1019, new p4h(e, str, 0));
    }

    @Override // defpackage.co31
    public void onVideoDisabled(kyg kygVar) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 b = j5hVar.b(j5hVar.w.e);
        j5hVar.f(b, 1020, new t4h(b, kygVar, 1));
        f fVar = this.this$0;
        fVar.T = null;
        fVar.e0 = null;
    }

    @Override // defpackage.co31
    public void onVideoEnabled(kyg kygVar) {
        f fVar = this.this$0;
        fVar.e0 = kygVar;
        j5h j5hVar = (j5h) fVar.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1015, new t4h(e, kygVar, 2));
    }

    @Override // defpackage.co31
    public void onVideoFrameProcessingOffset(long j, int i) {
        j5h j5hVar = (j5h) this.this$0.s;
        h42 b = j5hVar.b(j5hVar.w.e);
        j5hVar.f(b, 1021, new q4h(b, j, i));
    }

    @Override // defpackage.co31
    public void onVideoInputFormatChanged(androidx.media3.common.a aVar, qyg qygVar) {
        f fVar = this.this$0;
        fVar.T = aVar;
        j5h j5hVar = (j5h) fVar.s;
        h42 e = j5hVar.e();
        j5hVar.f(e, 1017, new u4h(e, aVar, qygVar, 0));
    }

    @Override // defpackage.co31
    public void onVideoSizeChanged(do31 do31Var) {
        f fVar = this.this$0;
        fVar.t0 = do31Var;
        fVar.m.f(25, new c(4, do31Var));
    }

    @Override // defpackage.upt0
    public void onVideoSurfaceCreated(Surface surface) {
        f fVar = this.this$0;
        int i = f.y0;
        fVar.z(surface);
    }

    @Override // defpackage.upt0
    public void onVideoSurfaceDestroyed(Surface surface) {
        f fVar = this.this$0;
        int i = f.y0;
        fVar.z(null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        f fVar = this.this$0;
        int i4 = f.y0;
        fVar.s(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        f fVar = this.this$0;
        if (fVar.Z) {
            fVar.z(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f fVar = this.this$0;
        if (fVar.Z) {
            fVar.z(null);
        }
        this.this$0.s(0, 0);
    }

    @Override // defpackage.ury0
    public void onCues(List<odf> list) {
        this.this$0.m.f(27, new c(3, list));
    }
}
