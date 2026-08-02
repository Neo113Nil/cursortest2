package defpackage;

import com.yandex.messaging.core.net.entities.GetUsersDataParam;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class aj20 {
    public final to3 a;
    public final k020 b;
    public final v5z c;
    public final h3y d;
    public final ArrayList e = new ArrayList();
    public xo3 f;

    public aj20(to3 to3Var, k020 k020Var, v5z v5zVar, h3y h3yVar) {
        this.a = to3Var;
        this.b = k020Var;
        this.c = v5zVar;
        this.d = h3yVar;
    }

    public final void a(List list) {
        ArrayList arrayList = this.e;
        arrayList.addAll(list);
        if (this.f != null || arrayList.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        uk10 uk10Var = new uk10(this);
        to3 to3Var = this.a;
        to3Var.getClass();
        GetUsersDataParam getUsersDataParam = new GetUsersDataParam();
        getUsersDataParam.guids = strArr;
        this.f = to3Var.a.a(new io3(18, to3Var, getUsersDataParam, uk10Var));
        arrayList.clear();
    }
}
