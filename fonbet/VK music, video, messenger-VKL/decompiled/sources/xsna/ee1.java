package xsna;

import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import xsna.cd1;
import xsna.h3m;
import xsna.kyg;
import xsna.r2c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ee1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ee1(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(cd1.g.b);
                break;
            case 1:
                this.c.invoke(r2c.t.b);
                break;
            case 2:
                this.c.invoke(kyg.a.b);
                break;
            case 3:
                this.c.invoke(h3m.a.b);
                break;
            case 4:
                this.c.invoke(SimilarVideoAction.MoreClick);
                break;
            default:
                this.c.invoke(0);
                break;
        }
        return s3q0.a;
    }
}
