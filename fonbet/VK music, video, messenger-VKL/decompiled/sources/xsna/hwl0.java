package xsna;

import android.net.Uri;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefContentQuality;
import com.vk.reefton.dto.ReefContentType;
import one.video.player.OneVideoPlayer;

/* compiled from: StoringAsyncOnePlayerReefAnalytics.kt */
/* loaded from: classes3.dex */
public final class hwl0 implements en80, VkHttpCallFactory.a {
    public Reef a;
    public long b = -1;
    public final owl0 c;
    public final nwl0 d;
    public final jwl0 e;
    public OneVideoPlayer f;

    public hwl0() {
        owl0 owl0Var = new owl0();
        this.c = owl0Var;
        this.d = new nwl0(owl0Var, new y3l0(this, 2));
        this.e = new jwl0(owl0Var, new cf00(this, 27));
    }

    @Override // xsna.umf0
    public final void a() {
        this.c.execute(new qc9(this, 5));
    }

    @Override // xsna.umf0
    public final void b(final int i) {
        this.c.execute(new Runnable() { // from class: xsna.ewl0
            @Override // java.lang.Runnable
            public final void run() {
                Reef m = hwl0.this.m();
                if (m != null) {
                    m.a(new ReefEvent.f(i));
                }
            }
        });
    }

    @Override // xsna.umf0
    public final void c(final long j) {
        this.c.execute(new Runnable() { // from class: xsna.fwl0
            @Override // java.lang.Runnable
            public final void run() {
                hwl0 hwl0Var = hwl0.this;
                if (hwl0Var.b != -1) {
                    return;
                }
                long j2 = j;
                hwl0Var.b = j2;
                Reef m = hwl0Var.m();
                if (m != null) {
                    m.a(new ReefEvent.s(j2));
                }
            }
        });
    }

    @Override // xsna.umf0
    public final void d(ReefContentQuality reefContentQuality) {
        this.c.execute(new ke9(6, this, reefContentQuality));
    }

    @Override // com.vk.mediastore.media.exo.datasource.VkHttpCallFactory.a
    public final void e(jkv jkvVar, int i) {
        this.c.execute(new zlr(this, jkvVar, i, 1));
    }

    @Override // xsna.umf0
    public final void f(final long j, final long j2) {
        this.c.execute(new Runnable() { // from class: xsna.gwl0
            @Override // java.lang.Runnable
            public final void run() {
                Reef m = hwl0.this.m();
                if (m != null) {
                    m.a(new ReefEvent.p(j, j2));
                }
            }
        });
    }

    @Override // xsna.umf0
    public final void g() {
        this.c.execute(new r44(this, 17));
    }

    @Override // xsna.umf0
    public final void h(String str, String str2, ReefContentType reefContentType) {
        this.c.execute(new u63(this, reefContentType, str, str2, 1));
    }

    @Override // xsna.umf0
    public final void i() {
        this.c.execute(new qb3(this, 13));
    }

    @Override // xsna.umf0
    public final void j() {
        this.c.execute(new xw1(this, 13));
    }

    @Override // xsna.umf0
    public final void k(final long j, final long j2) {
        this.c.execute(new Runnable() { // from class: xsna.dwl0
            @Override // java.lang.Runnable
            public final void run() {
                Reef m = hwl0.this.m();
                if (m != null) {
                    m.a(new ReefEvent.q(j, j2));
                }
            }
        });
    }

    @Override // xsna.umf0
    public final void l(Uri uri) {
        this.c.execute(new i73(8, this, uri));
    }

    public final Reef m() {
        if (this.a == null) {
            com.vk.metrics.eventtracking.b.a.q(new NullPointerException("Reef is expected to be set at this point"));
        }
        return this.a;
    }

    @Override // xsna.umf0
    public final void pause() {
        this.c.execute(new x52(this, 10));
    }

    @Override // xsna.umf0
    public final void release() {
        this.c.execute(new tsk(this, 9));
    }

    @Override // xsna.en80
    public final void setPlayer(OneVideoPlayer oneVideoPlayer) {
        if (epx.f(this.f, oneVideoPlayer)) {
            return;
        }
        OneVideoPlayer oneVideoPlayer2 = this.f;
        jwl0 jwl0Var = this.e;
        nwl0 nwl0Var = this.d;
        if (oneVideoPlayer2 != null) {
            oneVideoPlayer2.c0(nwl0Var);
            oneVideoPlayer2.K(jwl0Var);
        }
        if (oneVideoPlayer != null) {
            oneVideoPlayer.d0(nwl0Var);
            oneVideoPlayer.D(jwl0Var);
        }
        this.f = oneVideoPlayer;
    }

    @Override // xsna.umf0
    public final void start() {
        this.c.execute(new kv3(this, 21));
    }
}
