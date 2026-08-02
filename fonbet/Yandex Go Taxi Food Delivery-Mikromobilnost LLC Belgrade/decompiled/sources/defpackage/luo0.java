package defpackage;

import com.yandex.go.scooters.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class luo0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ luo0(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                dVar.r(new qu(9));
                break;
            case 1:
                dVar.r(new qu(9));
                break;
            default:
                d.W(dVar, new e6o0(null), null, null, 6);
                break;
        }
        return zy11Var;
    }
}
