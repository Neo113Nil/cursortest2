package xsna;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerAction;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.playerservice.impl.PlayerService;
import java.util.List;
import xsna.cz40;
import xsna.fx40;
import xsna.g8x;
import xsna.i8x;
import xsna.ry40;

/* compiled from: AdPlayerHelper.kt */
/* loaded from: classes3.dex */
public final class yg0 implements zg0 {
    public float c;
    public final ry40.c g;
    public final x6b0 h;
    public final /* synthetic */ PlayerService i;
    public wg0 b = new wg0(0);
    public final fx40.a d = new fx40.a(null, null, null, null, 127);
    public final cz40.a e = cz40.a.a;
    public final String f = "";

    public yg0(PlayerService playerService) {
        this.i = playerService;
        Object obj = PlaybackLaunchMeta.g;
        PlaybackLaunchMeta.a.a();
        this.g = ry40.c.d;
        this.h = x6b0.d.getSTUB();
    }

    @Override // xsna.ex40
    public final float C() {
        return this.c;
    }

    @Override // xsna.i8x
    public final float E() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ex40
    public final x6b0 H() {
        return this.h;
    }

    @Override // xsna.i8x
    public final float I() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.i8x
    public final Context J() {
        return this.i;
    }

    @Override // xsna.ex40
    public final float b() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.ex40
    public final cz40 c() {
        return this.e;
    }

    @Override // xsna.dx40
    public final boolean f(PlaybackActionMeta playbackActionMeta) {
        return false;
    }

    @Override // xsna.ex40
    public final boolean g() {
        return false;
    }

    @Override // xsna.dx40
    public final int getAudioSessionId() {
        return 0;
    }

    @Override // xsna.dx40
    public final int getBufferedPercentage() {
        return 0;
    }

    @Override // xsna.ex40
    public final fx40 getConfig() {
        return this.d;
    }

    @Override // xsna.dx40
    public final long getCurrentPosition() {
        return 0L;
    }

    @Override // xsna.dx40
    public final ry40 getState() {
        return this.g;
    }

    @Override // xsna.ex40
    public final String h() {
        return this.f;
    }

    @Override // xsna.dx40
    public final boolean isRunning() {
        return false;
    }

    @Override // xsna.dx40
    public final boolean j(int i, PlaybackActionMeta playbackActionMeta) {
        return false;
    }

    @Override // xsna.dx40
    public final List<PlayerAction> k() {
        return null;
    }

    @Override // xsna.dx40
    public final boolean pause(int i) {
        return false;
    }

    @Override // xsna.zg0
    public final void r(wg0 wg0Var) {
        this.b = wg0Var;
    }

    @Override // xsna.ex40
    public final void s(float f) {
        this.c = f;
    }

    @Override // xsna.zg0
    public final wg0 t() {
        return this.b;
    }

    @Override // xsna.ex40
    public final boolean x() {
        return false;
    }

    @Override // xsna.dx40
    public final boolean z() {
        return false;
    }

    @Override // xsna.i8x
    public final void A() {
    }

    @Override // xsna.i8x
    public final void destroy() {
    }

    @Override // xsna.i8x
    public final void e() {
    }

    @Override // xsna.i8x
    public final void y() {
    }

    @Override // xsna.i8x
    public final void o(i8x.a aVar) {
    }

    @Override // xsna.dx40
    public final void p(px40 px40Var) {
    }

    @Override // xsna.dx40
    public final void release(int i) {
    }

    @Override // xsna.i8x
    public final void setVolume(float f) {
    }

    @Override // xsna.dx40
    public final void stop(int i) {
    }

    @Override // xsna.dx40
    public final void u(kx40 kx40Var) {
    }

    @Override // xsna.zg0
    public final void w(int i) {
    }

    @Override // xsna.i8x
    public final void m(Uri uri, g8x.c cVar) {
    }
}
