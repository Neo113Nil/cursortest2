package xsna;

import com.vk.profile.community.impl.ui.trust_mark.c;
import com.vk.video.ui.discovery.minimizable.recycler.similar.SimilarVideoAction;
import xsna.pnb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class m4i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ m4i(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(c.C1630c.a);
                break;
            case 1:
                this.c.invoke(SimilarVideoAction.AvatarClick);
                break;
            default:
                this.c.invoke(new pnb0.c.h(false));
                break;
        }
        return s3q0.a;
    }
}
