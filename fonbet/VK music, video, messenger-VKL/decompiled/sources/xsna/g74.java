package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.cja0;
import xsna.le70;
import xsna.wiw;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g74 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ g74(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new PostingAction.Editing.EnableStoryRepost(((Boolean) obj).booleanValue()));
                break;
            case 1:
                Throwable th = (Throwable) obj;
                this.c.invoke(th);
                j03.l(th);
                break;
            case 2:
                wiw wiwVar = (wiw) obj;
                boolean z = wiwVar instanceof wiw.a;
                izs izsVar = this.c;
                if (z) {
                    izsVar.invoke(z7k.f.d.b);
                } else if (wiwVar instanceof wiw.b) {
                    izsVar.invoke(new z7k.f.e(((wiw.b) wiwVar).a));
                } else if (wiwVar instanceof wiw.c) {
                    izsVar.invoke(new z7k.f.C4162f(((wiw.c) wiwVar).a));
                }
                break;
            case 3:
                this.c.invoke(new cja0.c(((Integer) obj).intValue()));
                break;
            case 4:
                this.c.invoke((q610) obj);
                break;
            default:
                ((Boolean) obj).booleanValue();
                this.c.invoke(le70.k.b);
                break;
        }
        return s3q0.a;
    }
}
