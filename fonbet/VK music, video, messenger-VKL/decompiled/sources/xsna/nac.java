package xsna;

import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import xsna.a080;
import xsna.h3b0;
import xsna.rma0;
import xsna.sjl0;
import xsna.sx40;
import xsna.wml0;
import xsna.xyj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nac implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ nac(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(new sx40.t(PlayerContext.FULL, null));
                break;
            case 1:
                this.c.invoke(xyj.c.d.b);
                break;
            case 2:
                this.c.invoke(SimilarVideoAction.OpenVideo);
                break;
            case 3:
                this.c.invoke(new a080.a(false));
                break;
            case 4:
                this.c.invoke(rma0.a.b);
                break;
            case 5:
                this.c.invoke(h3b0.a.b);
                break;
            case 6:
                this.c.invoke(sjl0.a.f.b);
                break;
            default:
                this.c.invoke(wml0.a.e.b);
                break;
        }
        return s3q0.a;
    }
}
