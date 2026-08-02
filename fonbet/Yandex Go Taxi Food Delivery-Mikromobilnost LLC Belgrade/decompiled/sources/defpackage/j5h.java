package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.f;
import java.io.IOException;
import java.util.List;

/* loaded from: classes10.dex */
public final class j5h implements b32 {
    public a3x0 A;
    public boolean B;
    public final y3c a;
    public final y8z0 b;
    public final z8z0 c;
    public final i5h w;
    public final SparseArray x;
    public uuy y;
    public zxc0 z;

    public j5h(y3c y3cVar) {
        y3cVar.getClass();
        this.a = y3cVar;
        int i = tw21.a;
        Looper myLooper = Looper.myLooper();
        this.y = new uuy(myLooper == null ? Looper.getMainLooper() : myLooper, y3cVar, new x8e(17));
        y8z0 y8z0Var = new y8z0();
        this.b = y8z0Var;
        this.c = new z8z0();
        this.w = new i5h(y8z0Var);
        this.x = new SparseArray();
    }

    public final h42 a() {
        return b(this.w.d);
    }

    public final h42 b(sf10 sf10Var) {
        this.z.getClass();
        a9z0 a9z0Var = sf10Var == null ? null : (a9z0) this.w.c.get(sf10Var);
        if (sf10Var != null && a9z0Var != null) {
            return c(a9z0Var, a9z0Var.h(sf10Var.a, this.b).c, sf10Var);
        }
        int currentMediaItemIndex = this.z.getCurrentMediaItemIndex();
        a9z0 currentTimeline = this.z.getCurrentTimeline();
        if (currentMediaItemIndex >= currentTimeline.p()) {
            currentTimeline = a9z0.a;
        }
        return c(currentTimeline, currentMediaItemIndex, null);
    }

    public final h42 c(a9z0 a9z0Var, int i, sf10 sf10Var) {
        sf10 sf10Var2 = a9z0Var.q() ? null : sf10Var;
        ((o2x0) this.a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = a9z0Var.equals(this.z.getCurrentTimeline()) && i == this.z.getCurrentMediaItemIndex();
        long j = 0;
        if (sf10Var2 == null || !sf10Var2.b()) {
            if (z) {
                j = this.z.getContentPosition();
            } else if (!a9z0Var.q()) {
                j = tw21.l0(a9z0Var.n(i, this.c, 0L).k);
            }
        } else if (z && this.z.getCurrentAdGroupIndex() == sf10Var2.b && this.z.getCurrentAdIndexInAdGroup() == sf10Var2.c) {
            j = this.z.getCurrentPosition();
        }
        return new h42(elapsedRealtime, a9z0Var, i, sf10Var2, j, this.z.getCurrentTimeline(), this.z.getCurrentMediaItemIndex(), this.w.d, this.z.getCurrentPosition(), this.z.getTotalBufferedDuration());
    }

    public final h42 d(int i, sf10 sf10Var) {
        this.z.getClass();
        if (sf10Var != null) {
            return ((a9z0) this.w.c.get(sf10Var)) != null ? b(sf10Var) : c(a9z0.a, i, sf10Var);
        }
        a9z0 currentTimeline = this.z.getCurrentTimeline();
        if (i >= currentTimeline.p()) {
            currentTimeline = a9z0.a;
        }
        return c(currentTimeline, i, null);
    }

    public final h42 e() {
        return b(this.w.f);
    }

    public final void f(h42 h42Var, int i, ruy ruyVar) {
        this.x.put(i, h42Var);
        this.y.f(i, ruyVar);
    }

    public final void g(f fVar, Looper looper) {
        d6z.x(this.z == null || this.w.b.isEmpty());
        fVar.getClass();
        this.z = fVar;
        this.A = ((o2x0) this.a).a(looper, null);
        uuy uuyVar = this.y;
        this.y = new uuy(uuyVar.d, looper, uuyVar.a, new e90(16, this, fVar), uuyVar.i);
    }

    @Override // defpackage.xxc0
    public final void onAudioAttributesChanged(ue3 ue3Var) {
        h42 e = e();
        f(e, 20, new e90(21, e, ue3Var));
    }

    @Override // defpackage.xxc0
    public final void onAudioSessionIdChanged(int i) {
        h42 e = e();
        f(e, 21, new c5h(e, i, 5));
    }

    @Override // defpackage.xxc0
    public final void onAvailableCommandsChanged(vxc0 vxc0Var) {
        h42 a = a();
        f(a, 13, new e90(20, a, vxc0Var));
    }

    @Override // defpackage.hp4
    public final void onBandwidthSample(int i, long j, long j2) {
        i5h i5hVar = this.w;
        h42 b = b(i5hVar.b.isEmpty() ? null : (sf10) eab1.c(i5hVar.b));
        f(b, 1006, new m4h(b, i, j, j2, 0));
    }

    @Override // defpackage.xxc0
    public final void onCues(List list) {
        h42 a = a();
        f(a, 27, new e90(12, a, list));
    }

    @Override // defpackage.xxc0
    public final void onDeviceInfoChanged(xaj xajVar) {
        h42 a = a();
        f(a, 29, new e90(13, a, xajVar));
    }

    @Override // defpackage.xxc0
    public final void onDeviceVolumeChanged(int i, boolean z) {
        h42 a = a();
        f(a, 30, new r4h(i, 0, a, z));
    }

    @Override // defpackage.yf10
    public final void onDownstreamFormatChanged(int i, sf10 sf10Var, he10 he10Var) {
        h42 d = d(i, sf10Var);
        f(d, 1004, new y4h(d, he10Var, 0));
    }

    @Override // defpackage.nmm
    public final void onDrmKeysLoaded(int i, sf10 sf10Var) {
        h42 d = d(i, sf10Var);
        f(d, 1023, new w4h(d, 5));
    }

    @Override // defpackage.nmm
    public final void onDrmKeysRemoved(int i, sf10 sf10Var) {
        h42 d = d(i, sf10Var);
        f(d, 1026, new w4h(d, 3));
    }

    @Override // defpackage.nmm
    public final void onDrmKeysRestored(int i, sf10 sf10Var) {
        h42 d = d(i, sf10Var);
        f(d, 1025, new w4h(d, 4));
    }

    @Override // defpackage.nmm
    public final void onDrmSessionAcquired(int i, sf10 sf10Var, int i2) {
        h42 d = d(i, sf10Var);
        f(d, 1022, new c5h(d, i2, 0));
    }

    @Override // defpackage.nmm
    public final void onDrmSessionManagerError(int i, sf10 sf10Var, Exception exc) {
        h42 d = d(i, sf10Var);
        f(d, 1024, new x4h(d, exc, 2));
    }

    @Override // defpackage.nmm
    public final void onDrmSessionReleased(int i, sf10 sf10Var) {
        h42 d = d(i, sf10Var);
        f(d, 1027, new w4h(d, 1));
    }

    @Override // defpackage.xxc0
    public final void onEvents(zxc0 zxc0Var, wxc0 wxc0Var) {
    }

    @Override // defpackage.xxc0
    public final void onIsLoadingChanged(boolean z) {
        h42 a = a();
        f(a, 3, new f5h(a, 0, z));
    }

    @Override // defpackage.xxc0
    public final void onIsPlayingChanged(boolean z) {
        h42 a = a();
        f(a, 7, new f5h(a, 1, z));
    }

    @Override // defpackage.yf10
    public final void onLoadCanceled(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var) {
        h42 d = d(i, sf10Var);
        f(d, 1002, new b5h(d, uwyVar, he10Var, 0));
    }

    @Override // defpackage.yf10
    public final void onLoadCompleted(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var) {
        h42 d = d(i, sf10Var);
        f(d, 1001, new b5h(d, uwyVar, he10Var, 1));
    }

    @Override // defpackage.yf10
    public final void onLoadError(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
        h42 d = d(i, sf10Var);
        f(d, 1003, new a5h(d, uwyVar, he10Var, iOException, z));
    }

    @Override // defpackage.yf10
    public final void onLoadStarted(int i, sf10 sf10Var, uwy uwyVar, he10 he10Var, int i2) {
        h42 d = d(i, sf10Var);
        f(d, 1000, new z4h(d, uwyVar, he10Var, i2, 0));
    }

    @Override // defpackage.xxc0
    public final void onLoadingChanged(boolean z) {
    }

    @Override // defpackage.xxc0
    public final void onMediaItemTransition(fe10 fe10Var, int i) {
        h42 a = a();
        f(a, 1, new xm7(a, fe10Var, i, 1));
    }

    @Override // defpackage.xxc0
    public final void onMediaMetadataChanged(re10 re10Var) {
        h42 a = a();
        f(a, 14, new d5h(a, re10Var, 0));
    }

    @Override // defpackage.xxc0
    public final void onMetadata(w820 w820Var) {
        h42 a = a();
        f(a, 28, new e90(22, a, w820Var));
    }

    @Override // defpackage.xxc0
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        h42 a = a();
        f(a, 5, new r4h(a, i, 2, z));
    }

    @Override // defpackage.xxc0
    public final void onPlaybackParametersChanged(lxc0 lxc0Var) {
        h42 a = a();
        f(a, 12, new e90(17, a, lxc0Var));
    }

    @Override // defpackage.xxc0
    public final void onPlaybackStateChanged(int i) {
        h42 a = a();
        f(a, 4, new c5h(a, i, 3));
    }

    @Override // defpackage.xxc0
    public final void onPlaybackSuppressionReasonChanged(int i) {
        h42 a = a();
        f(a, 6, new c5h(a, i, 2));
    }

    @Override // defpackage.xxc0
    public final void onPlayerError(PlaybackException playbackException) {
        sf10 sf10Var;
        h42 a = (!(playbackException instanceof ExoPlaybackException) || (sf10Var = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? a() : b(sf10Var);
        f(a, 10, new h5h(a, playbackException, 1));
    }

    @Override // defpackage.xxc0
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
        sf10 sf10Var;
        h42 a = (!(playbackException instanceof ExoPlaybackException) || (sf10Var = ((ExoPlaybackException) playbackException).mediaPeriodId) == null) ? a() : b(sf10Var);
        f(a, 10, new h5h(a, playbackException, 0));
    }

    @Override // defpackage.xxc0
    public final void onPlayerStateChanged(boolean z, int i) {
        h42 a = a();
        f(a, -1, new r4h(a, i, 1, z));
    }

    @Override // defpackage.xxc0
    public final void onPlaylistMetadataChanged(re10 re10Var) {
        h42 a = a();
        f(a, 15, new d5h(a, re10Var, 1));
    }

    @Override // defpackage.xxc0
    public final void onPositionDiscontinuity(yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
        if (i == 1) {
            this.B = false;
        }
        zxc0 zxc0Var = this.z;
        zxc0Var.getClass();
        i5h i5hVar = this.w;
        i5hVar.d = i5h.b(zxc0Var, i5hVar.b, i5hVar.e, i5hVar.a);
        h42 a = a();
        f(a, 11, new z4h(a, yxc0Var, yxc0Var2, i));
    }

    @Override // defpackage.xxc0
    public final void onRenderedFirstFrame() {
    }

    @Override // defpackage.xxc0
    public final void onRepeatModeChanged(int i) {
        h42 a = a();
        f(a, 8, new c5h(a, i, 4));
    }

    @Override // defpackage.xxc0
    public final void onShuffleModeEnabledChanged(boolean z) {
        h42 a = a();
        f(a, 9, new f5h(a, 2, z));
    }

    @Override // defpackage.xxc0
    public final void onSkipSilenceEnabledChanged(boolean z) {
        h42 e = e();
        f(e, 23, new f5h(e, 3, z));
    }

    @Override // defpackage.xxc0
    public final void onSurfaceSizeChanged(int i, int i2) {
        h42 e = e();
        f(e, 24, new iy4(e, i, i2));
    }

    @Override // defpackage.xxc0
    public final void onTimelineChanged(a9z0 a9z0Var, int i) {
        zxc0 zxc0Var = this.z;
        zxc0Var.getClass();
        i5h i5hVar = this.w;
        i5hVar.d = i5h.b(zxc0Var, i5hVar.b, i5hVar.e, i5hVar.a);
        i5hVar.d(zxc0Var.getCurrentTimeline());
        h42 a = a();
        f(a, 0, new c5h(a, i, 1));
    }

    @Override // defpackage.xxc0
    public final void onTrackSelectionParametersChanged(r001 r001Var) {
        h42 a = a();
        f(a, 19, new e90(19, a, r001Var));
    }

    @Override // defpackage.xxc0
    public final void onTracksChanged(r801 r801Var) {
        h42 a = a();
        f(a, 2, new e90(18, a, r801Var));
    }

    @Override // defpackage.yf10
    public final void onUpstreamDiscarded(int i, sf10 sf10Var, he10 he10Var) {
        h42 d = d(i, sf10Var);
        f(d, 1005, new y4h(d, he10Var, 1));
    }

    @Override // defpackage.xxc0
    public final void onVideoSizeChanged(do31 do31Var) {
        h42 e = e();
        f(e, 25, new e90(14, e, do31Var));
    }

    @Override // defpackage.xxc0
    public final void onVolumeChanged(final float f) {
        final h42 e = e();
        f(e, 22, new ruy() { // from class: g5h
            @Override // defpackage.ruy
            public final void invoke(Object obj) {
                ((j42) obj).onVolumeChanged(h42.this, f);
            }
        });
    }

    @Override // defpackage.xxc0
    public final void onCues(rdf rdfVar) {
        h42 a = a();
        f(a, 27, new e90(15, a, rdfVar));
    }

    @Override // defpackage.xxc0
    public final void onPositionDiscontinuity(int i) {
    }
}
