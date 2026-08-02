package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.cro;
import xsna.dbe0;
import xsna.vmu;
import xsna.xij;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k74 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ k74(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                this.c.invoke(PostingAction.Editing.RemoveCustomDonutTeaser.b);
                break;
            case 1:
                this.c.invoke(com.vk.profile.design.compose.header.sink.d.a);
                break;
            case 2:
                this.c.invoke(xij.h.b);
                break;
            case 3:
                this.c.invoke(dbe0.f.b.b);
                break;
            case 4:
                this.c.invoke(z7k.m.b);
                break;
            case 5:
                this.c.invoke(cro.l.b);
                break;
            default:
                this.c.invoke(new vmu.e(false));
                break;
        }
        return s3q0.a;
    }
}
