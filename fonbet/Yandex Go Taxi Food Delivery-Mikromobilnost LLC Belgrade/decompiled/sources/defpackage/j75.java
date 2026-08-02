package defpackage;

import com.yandex.go.places.impl.navigation.common.base.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class j75 implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ sls b;
    public final /* synthetic */ d c;

    public /* synthetic */ j75(sls slsVar, d dVar) {
        this.b = slsVar;
        this.c = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d dVar = this.c;
        sls slsVar = this.b;
        switch (i) {
            case 0:
                dVar.T = null;
                slsVar.invoke();
                break;
            default:
                if (slsVar != null) {
                    slsVar.invoke();
                }
                dVar.U().c();
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ j75(d dVar, sls slsVar) {
        this.c = dVar;
        this.b = slsVar;
    }
}
