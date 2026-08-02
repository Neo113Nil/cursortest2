package defpackage;

import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.b;

/* loaded from: classes9.dex */
public final /* synthetic */ class iq6 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iq6(a aVar, h050 h050Var) {
        this.a = 2;
        this.b = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                ((tls) obj4).invoke((Throwable) obj);
                break;
            case 2:
                a aVar = (a) obj4;
                a.C.set(aVar, null);
                aVar.d(null);
                break;
            default:
                ((b) obj4).f();
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ iq6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
