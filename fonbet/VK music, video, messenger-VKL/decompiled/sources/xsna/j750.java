package xsna;

import com.vk.music.stickyplayer.domain.PlayerContext;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j750 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ j750(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new sx40.m0(true, PlayerContext.MINI_STANDALONE));
                break;
            case 1:
                this.c.invoke(uf70.b);
                break;
            default:
                this.c.invoke(new fiq0(false));
                break;
        }
        return s3q0.a;
    }
}
