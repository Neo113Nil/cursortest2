package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.music.playlist.display.domain.e;

/* compiled from: DisplayMusicPlaylistFeature.kt */
/* loaded from: classes3.dex */
public final class jfn implements gzs<s3q0> {
    public final /* synthetic */ com.vk.music.playlist.display.domain.b b;
    public final /* synthetic */ yj40 c;
    public final /* synthetic */ com.vk.music.playlist.display.domain.b d;

    public jfn(com.vk.music.playlist.display.domain.b bVar, com.vk.music.playlist.display.domain.b bVar2, yj40 yj40Var) {
        this.b = bVar;
        this.c = yj40Var;
        this.d = bVar2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (((fi40) this.c).b) {
            this.d.T(new e.n(DownloadingState.NotLoaded.b));
        }
        return s3q0.a;
    }
}
