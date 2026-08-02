package xsna;

import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.posting.presentation.articlepicker.a;
import com.vk.posting.presentation.articlepicker.c;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.xo3;

/* compiled from: ArticlePickerFeature.kt */
/* loaded from: classes18.dex */
public final class wo3 extends wk50<gp3, ep3, com.vk.posting.presentation.articlepicker.a, xo3> {
    public final UserId f;
    public final cp3 g;
    public final ne7 h;
    public final wf90 i;
    public final am50 j;
    public final f4z k;
    public final vo3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo3(bp3 bp3Var, UserId userId, cp3 cp3Var, wf90 wf90Var, djl djlVar) {
        super(a.e.b, bp3Var);
        ne7 ne7Var = ne7.b;
        this.f = userId;
        this.g = cp3Var;
        this.h = ne7Var;
        this.i = wf90Var;
        this.j = djlVar;
        this.k = new f4z();
        this.l = new vo3(this);
    }

    @Override // xsna.wk50
    public final void N(ep3 ep3Var, com.vk.posting.presentation.articlepicker.a aVar) {
        com.vk.posting.presentation.articlepicker.a aVar2 = aVar;
        if (aVar2.equals(a.e.b)) {
            return;
        }
        boolean z = aVar2 instanceof a.c;
        wf90 wf90Var = this.i;
        if (z) {
            if (!((a.c) aVar2).equals(a.c.C1528a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            wf90Var.b();
            return;
        }
        boolean equals = aVar2.equals(a.b.b);
        f4z f4zVar = this.k;
        if (equals) {
            wf90Var.d = this.l;
            f4zVar.b(new c.b.a(wf90Var));
            return;
        }
        boolean z2 = aVar2 instanceof a.C1527a;
        am50 am50Var = this.j;
        if (z2) {
            Article article = ((a.C1527a) aVar2).b;
            am50Var.b();
            f4zVar.b(new c.a.C1530a(new ArticleAttachment(article), am50Var));
        } else {
            if (!(aVar2 instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            a.d dVar = (a.d) aVar2;
            if (dVar.equals(a.d.b.b)) {
                am50Var.c();
            } else {
                if (!(dVar instanceof a.d.C1529a)) {
                    throw new NoWhenBranchMatchedException();
                }
                am50Var.d();
            }
        }
    }

    @Override // xsna.wk50
    public final List<com.vk.posting.presentation.articlepicker.a> Q(ep3 ep3Var, ep3 ep3Var2, xo3 xo3Var) {
        ep3 ep3Var3 = ep3Var;
        ep3 ep3Var4 = ep3Var2;
        xo3 xo3Var2 = xo3Var;
        if (xo3Var2 instanceof xo3.a.C4026a) {
            Throwable th = ((xo3.a.C4026a) xo3Var2).b.a;
            return Collections.singletonList(new a.d.C1529a());
        }
        if (xo3Var2 instanceof xo3.a.c) {
            return Collections.singletonList(a.d.b.b);
        }
        super.Q(ep3Var3, ep3Var4, xo3Var2);
        return null;
    }
}
