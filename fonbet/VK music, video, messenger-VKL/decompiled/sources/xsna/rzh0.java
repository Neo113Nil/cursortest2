package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.posting.presentation.video.search.a;
import com.vk.posting.presentation.video.search.c;
import com.vk.posting.presentation.video.search.e;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SearchVideoPickerFeature.kt */
/* loaded from: classes18.dex */
public final class rzh0 extends wk50<com.vk.posting.presentation.video.search.h, tzh0, com.vk.posting.presentation.video.search.a, com.vk.posting.presentation.video.search.c> {
    public final wf90 f;
    public final y2t0 g;
    public final am50 h;
    public final f4z i;
    public final qzh0 j;

    public rzh0(com.vk.posting.presentation.video.search.d dVar, UserId userId, wf90 wf90Var, y2t0 y2t0Var, djl djlVar) {
        super(a.g.b, dVar);
        this.f = wf90Var;
        this.g = y2t0Var;
        this.h = djlVar;
        this.i = new f4z();
        this.j = new qzh0(this);
    }

    @Override // xsna.wk50
    public final void N(tzh0 tzh0Var, com.vk.posting.presentation.video.search.a aVar) {
        com.vk.posting.presentation.video.search.a aVar2 = aVar;
        if (aVar2.equals(a.g.b)) {
            return;
        }
        boolean equals = aVar2.equals(a.b.b);
        qzh0 qzh0Var = this.j;
        f4z f4zVar = this.i;
        wf90 wf90Var = this.f;
        if (equals) {
            wf90Var.d = qzh0Var;
            f4zVar.b(new e.b.a(wf90Var));
            return;
        }
        boolean z = aVar2 instanceof a.f;
        am50 am50Var = this.h;
        if (z) {
            a.f fVar = (a.f) aVar2;
            if (!(fVar instanceof a.f.C1546a)) {
                throw new NoWhenBranchMatchedException();
            }
            am50Var.b();
            f4zVar.b(new e.a.b(((a.f.C1546a) fVar).b, am50Var));
            return;
        }
        if (aVar2 instanceof a.d) {
            if (!((a.d) aVar2).equals(a.d.C1544a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            wf90Var.b();
            return;
        }
        if (aVar2 instanceof a.c) {
            qzh0Var.a = ((a.c) aVar2).b;
            wf90Var.c();
            return;
        }
        if (aVar2.equals(a.AbstractC1542a.C1543a.b)) {
            f4zVar.b(e.a.C1549a.a);
            return;
        }
        if (!(aVar2 instanceof a.e)) {
            throw new NoWhenBranchMatchedException();
        }
        a.e eVar = (a.e) aVar2;
        if (eVar.equals(a.e.b.b)) {
            am50Var.c();
        } else {
            if (!(eVar instanceof a.e.C1545a)) {
                throw new NoWhenBranchMatchedException();
            }
            am50Var.d();
        }
    }

    @Override // xsna.wk50
    public final List<com.vk.posting.presentation.video.search.a> Q(tzh0 tzh0Var, tzh0 tzh0Var2, com.vk.posting.presentation.video.search.c cVar) {
        tzh0 tzh0Var3 = tzh0Var;
        tzh0 tzh0Var4 = tzh0Var2;
        com.vk.posting.presentation.video.search.c cVar2 = cVar;
        if (cVar2 instanceof c.a.C1547a) {
            Throwable th = ((c.a.C1547a) cVar2).b.a;
            return Collections.singletonList(new a.e.C1545a());
        }
        if (cVar2 instanceof c.a.C1548c) {
            return Collections.singletonList(a.e.b.b);
        }
        super.Q(tzh0Var3, tzh0Var4, cVar2);
        return null;
    }
}
