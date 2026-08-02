package defpackage;

import com.yandex.mob.api.model.MobEnvironment;
import com.yandex.mob.b;
import com.yandex.mob.datastore.c;
import com.yandex.mob.domain.g;
import com.yandex.mob.domain.l;

/* loaded from: classes8.dex */
public final class cl20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ yn20 c;

    public /* synthetic */ cl20(b bVar, yn20 yn20Var, int i) {
        this.a = i;
        this.b = bVar;
        this.c = yn20Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                al20 al20Var = new al20(bVar, 5);
                i3y i3yVar = bVar.d;
                jr20 jr20Var = new jr20(al20Var, (rot) i3yVar.getValue());
                MobEnvironment mobEnvironment = bVar.b;
                int i2 = 1;
                return new nm20(new yuf0(mobEnvironment, this.c, (g) bVar.l.getValue(), bVar.c, jr20Var, new duu(i2, jr20Var, bVar), new al20(bVar, 0), new al20(bVar, i2), new al20(bVar, 2), new al20(bVar, 3), new al20(bVar, 4)));
            default:
                return new l(bVar.b, (c) bVar.h.getValue(), this.c);
        }
    }
}
