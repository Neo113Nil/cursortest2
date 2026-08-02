package xsna;

import com.vk.music.playlist.display.domain.e;

/* compiled from: DisplayMusicPlaylistFeature.kt */
/* loaded from: classes3.dex */
public final class gfn implements gzs<s3q0> {
    public final /* synthetic */ com.vk.music.playlist.display.domain.b b;
    public final /* synthetic */ com.vk.music.playlist.display.domain.b c;
    public final /* synthetic */ yj40 d;

    public gfn(com.vk.music.playlist.display.domain.b bVar, com.vk.music.playlist.display.domain.b bVar2, yj40 yj40Var) {
        this.b = bVar;
        this.c = bVar2;
        this.d = yj40Var;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (com.vk.music.playlist.display.domain.b.W(this.c, ((b9b0) this.d).b, ((yfn) this.b.f.c).c)) {
            this.c.T(new e.m(((b9b0) this.d).a));
        }
        return s3q0.a;
    }
}
