package xsna;

import com.vk.music.playlist.display.domain.e;

/* compiled from: DisplayMusicPlaylistFeature.kt */
/* loaded from: classes3.dex */
public final class lfn implements gzs<s3q0> {
    public final /* synthetic */ com.vk.music.playlist.display.domain.b b;
    public final /* synthetic */ com.vk.music.playlist.display.domain.b c;

    public lfn(com.vk.music.playlist.display.domain.b bVar, com.vk.music.playlist.display.domain.b bVar2) {
        this.b = bVar;
        this.c = bVar2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        e.c U = com.vk.music.playlist.display.domain.b.U(this.c, (yfn) this.b.f.c);
        if (U != null) {
            this.c.T(U);
        }
        return s3q0.a;
    }
}
