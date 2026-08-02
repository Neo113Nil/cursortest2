package defpackage;

import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.contacts.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class fbq0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectContactView b;
    public final /* synthetic */ bgq0 c;

    public /* synthetic */ fbq0(SelectContactView selectContactView, bgq0 bgq0Var, int i) {
        this.a = i;
        this.b = selectContactView;
        this.c = bgq0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        d dVar;
        d dVar2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        bgq0 bgq0Var = this.c;
        SelectContactView selectContactView = this.b;
        switch (i) {
            case 0:
                dVar = selectContactView.presenter;
                dVar.D.I(new bgq0(bgq0Var.a, dVar.Mg(bgq0Var.b), bgq0Var.c, bgq0Var.d));
                break;
            default:
                dVar2 = selectContactView.presenter;
                dVar2.D.I(new bgq0(bgq0Var.a, dVar2.Mg(bgq0Var.b), bgq0Var.c, bgq0Var.d));
                break;
        }
        return zy11Var;
    }
}
