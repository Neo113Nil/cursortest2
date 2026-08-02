package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.topics.impl.api.BoardGetComments;

/* compiled from: BoardCommentsLoader.java */
/* loaded from: classes6.dex */
public final class xh7 implements hx2<BoardGetComments.b> {
    public final /* synthetic */ int b;
    public final /* synthetic */ yh7 c;

    public xh7(yh7 yh7Var, int i) {
        this.c = yh7Var;
        this.b = i;
    }

    @Override // xsna.hx2
    public final void b(BoardGetComments.b bVar) {
        BoardGetComments.b bVar2 = bVar;
        if (this.b == this.c.a.get()) {
            int a = yh7.a(this.c, bVar2, true);
            if (bVar2.a.size() < 0) {
                this.c.j = true;
            }
            yh7 yh7Var = this.c;
            yh7Var.b -= a;
            yh7Var.i = false;
            yh7 yh7Var2 = this.c;
            yh7Var2.n.yo(yh7Var2.e.size());
        }
    }

    @Override // xsna.hx2
    public final void e(VKApiExecutionException vKApiExecutionException) {
        if (this.b == this.c.a.get()) {
            this.c.i = false;
            yh7 yh7Var = this.c;
            yh7Var.n.yo(yh7Var.e.size());
            this.c.n.wo();
        }
    }
}
