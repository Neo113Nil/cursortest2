package xsna;

import androidx.annotation.NonNull;
import com.vk.dto.group.Group;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.gxh;

/* compiled from: ReplyBarController.java */
/* loaded from: classes17.dex */
public final class g3g0 implements gxh.a {
    public final /* synthetic */ f3g0 a;

    public g3g0(f3g0 f3g0Var) {
        this.a = f3g0Var;
    }

    @Override // xsna.gxh.a
    public final void a(@NonNull ArrayList<Group> arrayList) {
        f3g0 f3g0Var;
        Iterator<Group> it = arrayList.iterator();
        Group group = null;
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            f3g0Var = this.a;
            if (!hasNext) {
                break;
            }
            Group next = it.next();
            if (next.y.b) {
                z = true;
            }
            if (next.c.equals(fkq0.e(f3g0Var.j))) {
                group = next;
            }
            if (group != null && z) {
                break;
            }
        }
        if (group != null || (f3g0Var.l && z)) {
            f3g0.o(f3g0Var, true);
        } else if (f3g0Var.k) {
            f3g0.o(f3g0Var, false);
        } else {
            npu.a().b(new h3g0(f3g0Var));
        }
    }

    @Override // xsna.gxh.a
    public final void onError() {
        f3g0 f3g0Var = this.a;
        if (f3g0Var.k) {
            f3g0.o(f3g0Var, false);
        } else {
            npu.a().b(new h3g0(f3g0Var));
        }
    }
}
