package xsna;

import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.yii0;

/* compiled from: SendStoryUsersReducer.kt */
/* loaded from: classes16.dex */
public final class zii0 extends dm50<fji0, yii0, eji0> {
    @Override // xsna.dm50
    public final eji0 c(eji0 eji0Var, yii0 yii0Var) {
        eji0 eji0Var2 = eji0Var;
        yii0 yii0Var2 = yii0Var;
        List<s8m> list = eji0Var2.b;
        if (yii0Var2 instanceof yii0.c) {
            ListBuilder e = e43.e();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                e.add((s8m) it.next());
            }
            for (s8m s8mVar : ((yii0.c) yii0Var2).b) {
                if (!list.contains(s8mVar)) {
                    e.add(s8mVar);
                }
            }
            ListBuilder g = e.g();
            return eji0.a(eji0Var2, g, null, false, g.isEmpty(), 6);
        }
        if (!(yii0Var2 instanceof yii0.e)) {
            if (yii0Var2 instanceof yii0.d) {
                return eji0.a(eji0Var2, EmptyList.b, ((yii0.d) yii0Var2).b, false, false, 4);
            }
            if (yii0Var2 instanceof yii0.b) {
                return eji0.a(eji0Var2, null, null, true, false, 11);
            }
            if (yii0Var2 instanceof yii0.a) {
                return eji0.a(eji0Var2, null, null, false, false, 11);
            }
            throw new NoWhenBranchMatchedException();
        }
        ListBuilder e2 = e43.e();
        for (s8m s8mVar2 : list) {
            UserId userId = s8mVar2.a;
            yii0.e eVar = (yii0.e) yii0Var2;
            if (userId.b == eVar.b) {
                s8mVar2 = new s8m(userId, s8mVar2.b, s8mVar2.c, s8mVar2.d, s8mVar2.e, eVar.c);
            }
            e2.add(s8mVar2);
        }
        return eji0.a(eji0Var2, e2.g(), null, false, false, 14);
    }

    @Override // xsna.dm50
    public final fji0 d() {
        return new fji0(e(new pf40(this, 18)));
    }

    @Override // xsna.dm50
    public final void h(eji0 eji0Var, fji0 fji0Var) {
        f(fji0Var.a, eji0Var);
    }
}
