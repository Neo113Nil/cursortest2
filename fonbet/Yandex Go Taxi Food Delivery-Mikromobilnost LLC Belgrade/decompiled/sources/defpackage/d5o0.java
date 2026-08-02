package defpackage;

import ru.yandex.taxi.scooters.presentation.ontheway.f;

/* loaded from: classes6.dex */
public final /* synthetic */ class d5o0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ zuo0 c;

    public /* synthetic */ d5o0(f fVar, zuo0 zuo0Var, int i) {
        this.a = i;
        this.b = fVar;
        this.c = zuo0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        zuo0 zuo0Var = this.c;
        f fVar = this.b;
        switch (i) {
            case 0:
                fVar.L.d(null, zuo0Var.getSessionId());
                break;
            default:
                fVar.L.d(null, zuo0Var.getSessionId());
                break;
        }
        return zy11Var;
    }
}
