package xsna;

import com.vk.music.playlist.display.domain.e;
import xsna.gm50;

/* compiled from: DisplayMusicPlaylistFeature.kt */
/* loaded from: classes3.dex */
public final class mfn implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mfn(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                e.c U = com.vk.music.playlist.display.domain.b.U((com.vk.music.playlist.display.domain.b) this.d, (yfn) ((com.vk.music.playlist.display.domain.b) this.c).f.c);
                if (U != null) {
                    ((com.vk.music.playlist.display.domain.b) this.d).T(U);
                }
                break;
            default:
                zrh0 zrh0Var = (zrh0) this.c;
                gm50.a.b(zrh0Var, (fi50) this.d, new du0(23, zrh0Var, zrh0Var.b));
                break;
        }
        return s3q0.a;
    }
}
