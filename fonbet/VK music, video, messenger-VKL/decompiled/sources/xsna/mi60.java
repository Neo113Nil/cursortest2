package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import xsna.lwq0;
import xsna.xh60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mi60 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ evg0 c;

    public /* synthetic */ mi60(evg0 evg0Var, int i) {
        this.b = i;
        this.c = evg0Var;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        switch (this.b) {
            case 0:
                ni60 ni60Var = (ni60) this.c;
                ni60Var.c(new xh60.h.C4003h((ywm0) obj, ((qz60) ni60Var.b.getCurrentState()).f));
                break;
            default:
                ((dsq0) this.c).a(new lwq0.a.d((NewsEntry) obj));
                break;
        }
    }
}
