package xsna;

import android.os.Bundle;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.p130;

/* compiled from: ModalPostReactionsReducer.kt */
/* loaded from: classes4.dex */
public final class r130 extends dm50<b230, p130, s130> {
    public final a230 d;

    public r130(Bundle bundle, a230 a230Var) {
        super(new s130(0L, UserId.d, null, LikesGetList.Type.POST, null, EmptyList.b, bundle, null, null, true, false));
        this.d = a230Var;
    }

    @Override // xsna.dm50
    public final s130 c(s130 s130Var, p130 p130Var) {
        Integer num;
        s130 s130Var2 = s130Var;
        p130 p130Var2 = p130Var;
        List<v130> list = s130Var2.g;
        if (p130Var2 instanceof p130.d) {
            o130 o130Var = ((p130.d) p130Var2).b;
            return s130.a(s130Var2, o130Var.a, o130Var.b, o130Var.c, o130Var.d, o130Var.e, o130Var.h, o130Var.f, o130Var.g, false, false, 64);
        }
        if (p130Var2.equals(p130.b.b)) {
            return s130.a(s130Var2, 0L, null, null, null, null, EmptyList.b, null, null, true, false, 479);
        }
        if (p130Var2.equals(p130.a.b)) {
            return s130.a(s130Var2, 0L, null, null, null, null, EmptyList.b, null, null, false, true, 479);
        }
        if (!(p130Var2 instanceof p130.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (s130Var2.k || s130Var2.l || list.isEmpty()) {
            return s130Var2;
        }
        List<v130> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (v130 v130Var : list2) {
            String str = v130Var.a;
            p130.c cVar = (p130.c) p130Var2;
            int i = cVar.b;
            if (epx.f(str, cVar.c) && ((num = v130Var.b) == null || num.intValue() != i)) {
                v130Var = new v130(v130Var.a, Integer.valueOf(i), v130Var.c);
            }
            arrayList.add(v130Var);
        }
        return s130.a(s130Var2, 0L, null, null, null, null, arrayList, null, null, false, false, 2015);
    }

    @Override // xsna.dm50
    public final b230 d() {
        return new b230(e(new wq20(this, 1)), e(new gzn(16)), e(new xht(9)), e(new n82(28)));
    }

    @Override // xsna.dm50
    public final void h(s130 s130Var, b230 b230Var) {
        s130 s130Var2 = s130Var;
        b230 b230Var2 = b230Var;
        if (s130Var2.k) {
            f(b230Var2.c, s130Var2);
            return;
        }
        if (s130Var2.l) {
            f(b230Var2.d, s130Var2);
        } else if (s130Var2.g.isEmpty()) {
            f(b230Var2.b, s130Var2);
        } else {
            f(b230Var2.a, s130Var2);
        }
    }
}
