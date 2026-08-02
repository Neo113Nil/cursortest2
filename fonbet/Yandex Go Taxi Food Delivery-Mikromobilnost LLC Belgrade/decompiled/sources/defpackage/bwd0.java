package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* loaded from: classes.dex */
public final class bwd0 {
    public final rnz a = new rnz((Object) null);

    public final tis0 a(y4a0 y4a0Var, AndroidComposeView androidComposeView) {
        boolean a;
        long j;
        long mo69screenToLocalMKHz9U;
        rnz rnzVar = new rnz(y4a0Var.h().size());
        List h = y4a0Var.h();
        int size = h.size();
        for (int i = 0; i < size; i++) {
            cwd0 cwd0Var = (cwd0) h.get(i);
            long c = cwd0Var.c();
            rnz rnzVar2 = this.a;
            awd0 awd0Var = (awd0) rnzVar2.c(c);
            if (awd0Var == null) {
                a = false;
                j = cwd0Var.l();
                mo69screenToLocalMKHz9U = cwd0Var.f();
            } else {
                long c2 = awd0Var.c();
                a = awd0Var.a();
                j = c2;
                mo69screenToLocalMKHz9U = androidComposeView.mo69screenToLocalMKHz9U(awd0Var.b());
            }
            rnzVar.h(cwd0Var.c(), new zvd0(cwd0Var.c(), cwd0Var.l(), cwd0Var.f(), cwd0Var.a(), cwd0Var.h(), j, mo69screenToLocalMKHz9U, a, cwd0Var.k(), cwd0Var.b(), cwd0Var.j(), cwd0Var.i(), cwd0Var.e(), cwd0Var.d()));
            if (cwd0Var.a()) {
                rnzVar2.h(cwd0Var.c(), new awd0(cwd0Var.l(), cwd0Var.g(), cwd0Var.a()));
            } else {
                rnzVar2.i(cwd0Var.c());
            }
        }
        return new tis0(14, rnzVar, y4a0Var);
    }
}
