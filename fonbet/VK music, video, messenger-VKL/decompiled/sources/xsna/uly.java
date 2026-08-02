package xsna;

import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import xsna.avm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class uly implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ uly(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(SimilarVideoAction.OpenVideo);
                break;
            default:
                this.c.invoke(avm0.b.b);
                break;
        }
        return s3q0.a;
    }
}
