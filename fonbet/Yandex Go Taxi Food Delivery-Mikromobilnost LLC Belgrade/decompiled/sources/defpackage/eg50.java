package defpackage;

import com.yandex.go.navigator.alt_select.new_summary.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class eg50 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ eg50(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.j(new fpb(aVar.Q()));
                return zy11Var;
            case 1:
                aVar.S((dg50) aVar.n(), false);
                return zy11Var;
            default:
                return (uj00) aVar.R.get();
        }
    }
}
