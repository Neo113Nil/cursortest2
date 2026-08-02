package xsna;

import com.vk.im.engine.models.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class fml implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ fml(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return i5s.a(new StringBuilder("\""), ((zk10) obj).b().get(1), "\":\"<HIDE>\"");
            case 1:
                a1w a1wVar = i2w.c;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                return new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.p(a1wVar.C(i2w.a, new o28())), io.reactivex.rxjava3.internal.functions.a.g);
            case 2:
                return f.a.a((String) obj);
            default:
                return Boolean.valueOf(!d260.b.a().d1());
        }
    }
}
