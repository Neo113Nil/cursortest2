package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.fd70;
import xsna.m5u;
import xsna.usc;
import xsna.uvo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vrc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ vrc(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(usc.b.a.e.b);
                break;
            case 1:
                izsVar.invoke(uvo.e.b);
                break;
            case 2:
                if (!jjc.d().a()) {
                    izsVar.invoke(fd70.g.b);
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            case 3:
                izsVar.invoke(PostingAction.Navigation.Back.b);
                break;
            default:
                izsVar.invoke(m5u.o.b);
                break;
        }
        return s3q0.a;
    }
}
