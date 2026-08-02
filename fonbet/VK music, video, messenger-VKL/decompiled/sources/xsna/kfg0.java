package xsna;

import java.util.Iterator;
import java.util.List;
import xsna.mfg0;
import xsna.u3z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kfg0 implements io.reactivex.rxjava3.functions.l, t8z0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kfg0(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.t8z0
    public void accept(Object obj) {
        String str;
        mez0 mez0Var = (mez0) this.b;
        xey0 xey0Var = (xey0) this.c;
        jhz0 jhz0Var = (jhz0) this.d;
        u3z0.a aVar = (u3z0.a) obj;
        mez0Var.getClass();
        mez0.e.remove(xey0Var);
        if (aVar == null || !aVar.a() || (str = aVar.b) == null) {
            str = null;
        }
        if (str != null) {
            jhz0Var.accept(str);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        io.reactivex.rxjava3.functions.m mVar = (io.reactivex.rxjava3.functions.m) this.b;
        List list = (List) this.c;
        List list2 = (List) this.d;
        mfg0.a aVar = (mfg0.a) obj;
        Throwable th = aVar.a;
        if (!mVar.test(th)) {
            return io.reactivex.rxjava3.core.g.e(th);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Class) it.next()).isAssignableFrom(th.getClass())) {
                return io.reactivex.rxjava3.core.g.e(th);
            }
        }
        if (list2.size() <= 0) {
            return io.reactivex.rxjava3.core.g.i(aVar);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (((Class) it2.next()).isAssignableFrom(th.getClass())) {
                return io.reactivex.rxjava3.core.g.i(aVar);
            }
        }
        return io.reactivex.rxjava3.core.g.e(th);
    }
}
