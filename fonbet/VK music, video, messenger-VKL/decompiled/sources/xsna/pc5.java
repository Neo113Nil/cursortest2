package xsna;

import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import xsna.ec5;
import xsna.msm;
import xsna.oa70;
import xsna.rv9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class pc5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ pc5(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new ec5.a((PostingAuthorUiModel) obj));
                break;
            case 1:
                String i = ((l2v0) obj).i();
                if (i != null) {
                    this.c.invoke(new rv9.h(i));
                }
                break;
            case 2:
                this.c.invoke(new oa70.m((String) obj));
                break;
            case 3:
                Throwable th = (Throwable) obj;
                this.c.invoke(th);
                par0.a.getClass();
                par0.d(th);
                break;
            default:
                this.c.invoke(msm.d.a);
                break;
        }
        return s3q0.a;
    }
}
