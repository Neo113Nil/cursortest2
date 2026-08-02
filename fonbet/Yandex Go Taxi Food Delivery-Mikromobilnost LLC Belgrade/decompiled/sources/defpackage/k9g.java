package defpackage;

import ru.yandex.taxi.zonemodes.j;

/* loaded from: classes14.dex */
public final class k9g implements xvf0 {
    public final /* synthetic */ int a;
    public final jtp0 b;

    public /* synthetic */ k9g(jtp0 jtp0Var, int i) {
        this.a = i;
        this.b = jtp0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        jtp0 jtp0Var = this.b;
        switch (i) {
            case 0:
                no21 no21Var = jtp0Var.D;
                q5z.h(no21Var);
                return no21Var;
            default:
                j jVar = jtp0Var.B;
                q5z.h(jVar);
                return jVar;
        }
    }
}
