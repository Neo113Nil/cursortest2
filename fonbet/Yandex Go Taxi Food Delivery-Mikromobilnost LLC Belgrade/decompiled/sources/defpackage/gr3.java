package defpackage;

import ru.yandex.taxi.persuggest.repository.AutoFsSessionPhase;

/* loaded from: classes6.dex */
public final /* synthetic */ class gr3 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir3 b;

    public /* synthetic */ gr3(ir3 ir3Var, int i) {
        this.a = i;
        this.b = ir3Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        ir3 ir3Var = this.b;
        switch (i) {
            case 0:
                synchronized (ir3Var) {
                    if (ir3Var.c == AutoFsSessionPhase.WarmUp) {
                        ir3Var.c();
                    }
                }
                return zy11.a;
            default:
                synchronized (ir3Var) {
                    if (ir3Var.c == AutoFsSessionPhase.Silent) {
                        v8e v8eVar = ir3Var.j;
                        if (v8eVar != null) {
                            v8eVar.j();
                        }
                        ir3Var.j = null;
                        ir3Var.c = AutoFsSessionPhase.ReadyForAutoFs;
                    }
                }
                return zy11.a;
        }
    }
}
