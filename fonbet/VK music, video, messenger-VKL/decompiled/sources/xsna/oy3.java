package xsna;

import android.net.Uri;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefContentQuality;
import com.vk.reefton.dto.ReefContentType;
import java.util.concurrent.ExecutorService;
import one.video.player.OneVideoPlayer;

/* compiled from: AsyncOnePlayerReefAnalytics.kt */
/* loaded from: classes3.dex */
public final class oy3 implements en80, VkHttpCallFactory.a {
    public final Reef a;
    public long b = -1;
    public final bpn0 c = new bpn0(new lg(2));
    public OneVideoPlayer d;
    public final ExecutorService e;
    public final dz3 f;
    public final yy3 g;

    public oy3(Reef reef) {
        ExecutorService b;
        this.a = reef;
        if (((Boolean) new bpn0(new bu1(this, 1)).getValue()).booleanValue()) {
            asu0.a.getClass();
            b = asu0.n();
        } else {
            b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "vk-video-reef-thread");
        }
        this.e = b;
        this.f = new dz3(reef, b);
        this.g = new yy3(reef, b);
    }

    @Override // xsna.umf0
    public final void a() {
        this.a.c();
    }

    @Override // xsna.umf0
    public final void b(int i) {
        this.a.a(new ReefEvent.f(i));
    }

    @Override // xsna.umf0
    public final void c(long j) {
        if (this.b != -1) {
            return;
        }
        this.b = j;
        this.a.a(new ReefEvent.s(j));
    }

    @Override // xsna.umf0
    public final void d(ReefContentQuality reefContentQuality) {
        this.a.a(new ReefEvent.PlayerQualityChange(reefContentQuality, ReefEvent.PlayerQualityChange.Reason.MANUAL, null));
    }

    @Override // com.vk.mediastore.media.exo.datasource.VkHttpCallFactory.a
    public final void e(jkv jkvVar, int i) {
        this.a.a(new ReefEvent.i(ine0.r(jkvVar, i)));
    }

    @Override // xsna.umf0
    public final void f(long j, long j2) {
        this.a.a(new ReefEvent.p(j, j2));
    }

    @Override // xsna.umf0
    public final void g() {
        this.a.a(new ReefEvent.r());
        this.b = -1L;
    }

    @Override // xsna.umf0
    public final void h(String str, String str2, ReefContentType reefContentType) {
        ReefEvent.x xVar = new ReefEvent.x(reefContentType, str, Uri.parse(str2));
        Reef reef = this.a;
        reef.a(xVar);
        reef.a(new ReefEvent.PlayerQualityChange(ReefContentQuality.AUTO, ReefEvent.PlayerQualityChange.Reason.AUTO, null));
        this.b = -1L;
    }

    @Override // xsna.umf0
    public final void i() {
        this.a.a(new ReefEvent.k());
    }

    @Override // xsna.umf0
    public final void j() {
        this.a.a(new ReefEvent.y());
    }

    @Override // xsna.umf0
    public final void k(long j, long j2) {
        this.a.a(new ReefEvent.q(j, j2));
    }

    @Override // xsna.umf0
    public final void l(Uri uri) {
        this.a.a(new ReefEvent.o(uri));
    }

    @Override // xsna.umf0
    public final void pause() {
        this.a.b();
    }

    @Override // xsna.umf0
    public final void release() {
        this.a.g.onNext(Reef.State.RELEASED);
    }

    @Override // xsna.en80
    public final void setPlayer(OneVideoPlayer oneVideoPlayer) {
        if (epx.f(this.d, oneVideoPlayer)) {
            return;
        }
        OneVideoPlayer oneVideoPlayer2 = this.d;
        yy3 yy3Var = this.g;
        dz3 dz3Var = this.f;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.c0(dz3Var);
            oneVideoPlayer2.K(yy3Var);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(dz3Var);
            oneVideoPlayer.D(yy3Var);
        }
        this.d = oneVideoPlayer;
    }

    @Override // xsna.umf0
    public final void start() {
        this.a.d();
    }
}
