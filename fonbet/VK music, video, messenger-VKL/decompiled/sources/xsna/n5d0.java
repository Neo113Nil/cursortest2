package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.snippet.player.analytics.model.MusicLongtapExitType;
import xsna.k840;

/* compiled from: PreviewSnippetAnalyticsManagerImpl.kt */
/* loaded from: classes3.dex */
public final class n5d0 implements m5d0 {
    public final MusicTrack a;
    public final ex40 b;
    public final x550 c;
    public final kq01 d = new kq01();
    public boolean e;
    public long f;

    public n5d0(MusicTrack musicTrack, dx40 dx40Var, x550 x550Var) {
        this.a = musicTrack;
        this.b = dx40Var;
        this.c = x550Var;
    }

    @Override // xsna.m5d0
    public final void a(int i) {
        long j = o25.a().c().b;
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        int b = an10.b(this.b.C());
        Integer valueOf = Integer.valueOf(i);
        Long valueOf2 = Long.valueOf(j);
        MusicTrack musicTrack = this.a;
        s750Var.A(new en40(Integer.valueOf(musicTrack.b), valueOf, Integer.valueOf(b), Long.valueOf(musicTrack.c.b), valueOf2, musicTrack.y), an10.b((((jx4) this.c.invoke()).b() + this.f) / 1000.0f), an10.b(this.f / 1000.0f));
    }

    @Override // xsna.m5d0
    public final void b(MusicLongtapExitType musicLongtapExitType) {
        if (this.e) {
            return;
        }
        this.e = true;
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        s750Var.P0(kq01.n(this.d, this.a, an10.b(this.b.C())), an10.b((((jx4) this.c.invoke()).b() + this.f) / 1000.0f), an10.b(this.f / 1000.0f), musicLongtapExitType.name());
    }

    @Override // xsna.m5d0
    public final void c() {
        s750 s750Var = k840.a.e;
        if (s750Var == null) {
            s750Var = null;
        }
        s750Var.l(kq01.n(this.d, this.a, an10.b(this.b.C())));
    }

    @Override // xsna.m5d0
    public final void onProgress(long j) {
        this.f = j;
    }
}
