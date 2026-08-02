package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Result;
import xsna.ds60;
import xsna.jm50;
import xsna.qn60;
import xsna.qr60;
import xsna.xh60;

/* compiled from: NewsfeedExternalTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class oi60 extends evg0<qz60, on50, s070, r070, jv60, xh60> {
    public final qn60 f;
    public final pn60 g;
    public final kq60 h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oi60(ot60 ot60Var, qn60 qn60Var, pn60 pn60Var, Lazy lazy, nn50 nn50Var) {
        super(r4, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = qn60Var;
        this.g = pn60Var;
        this.h = new kq60(qn60Var, pn60Var, lazy, aVar, new eht(this, ot60Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ds60.b bVar = ((s070) hn50Var).b;
        NewsfeedExternalAction.c cVar = bVar.b;
        if (!(cVar instanceof NewsfeedExternalAction.c.m)) {
            this.h.s(bVar);
            return null;
        }
        NewsEntry newsEntry = ((NewsfeedExternalAction.c.m) cVar).a;
        qz60 qz60Var = (qz60) this.b.getCurrentState();
        if (qz60Var.c != 0 || !(newsEntry instanceof Post)) {
            return null;
        }
        Post post = (Post) newsEntry;
        if (post.oc() || post.rc() || post.Z1() || post.o1() || !epx.f(post.m, post.o.b)) {
            return null;
        }
        ur60 ur60Var = qz60Var.b;
        qtc0 qtc0Var = ur60Var.c;
        boolean z = ur60Var.g;
        pn60 pn60Var = this.g;
        xle0[] xle0VarArr = z ? new qn60.b[]{new xle0(newsEntry, on60.a, qtc0Var, pn60Var), new gjj0(pn60Var)} : new xle0[]{new xle0(newsEntry, on60.a, qtc0Var, pn60Var)};
        Object f = this.f.f((qn60.b[]) Arrays.copyOf(xle0VarArr, xle0VarArr.length));
        if (!(f instanceof Result.Failure)) {
            qn60.c cVar2 = (qn60.c) f;
            e(new kv60(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
        }
        Throwable a = Result.a(f);
        if (a != null) {
            com.vk.metrics.eventtracking.b.a.a(a);
        }
        c(new xh60.e(vp60.a));
        return null;
    }
}
