package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.Interceptor;
import okhttp3.o;

/* compiled from: OtelOkhttpWrapper.kt */
/* loaded from: classes.dex */
public final class tz80 {

    /* compiled from: OtelOkhttpWrapper.kt */
    public static final class a implements uz80, Interceptor {
        public final /* synthetic */ Interceptor a;
        public final /* synthetic */ String b;

        public a(Interceptor interceptor, String str) {
            this.b = str;
            this.a = interceptor;
        }

        @Override // xsna.uz80
        public final String getTag() {
            return this.b;
        }

        @Override // okhttp3.Interceptor
        public final okhttp3.u intercept(Interceptor.a aVar) {
            return this.a.intercept(aVar);
        }
    }

    public static final Interceptor a(Interceptor interceptor, String str) {
        return interceptor instanceof uz80 ? interceptor : new a(interceptor, str);
    }

    public static final void b(o.a aVar, wdp0 wdp0Var) {
        ArrayList arrayList = aVar.c;
        ArrayList arrayList2 = aVar.d;
        if ((j5g.a0(arrayList) instanceof rz80) && (j5g.k0(arrayList2) instanceof sz80)) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((Interceptor) it.next()) instanceof nz80)) {
                        break;
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (!(((Interceptor) it2.next()) instanceof nz80)) {
                }
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        arrayList.clear();
        arrayList2.clear();
        aVar.a(new rz80(wdp0Var));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Interceptor interceptor = (Interceptor) it3.next();
            if (!(interceptor instanceof rz80)) {
                if (interceptor instanceof nz80) {
                    aVar.a(interceptor);
                } else {
                    aVar.a(his0.A(interceptor, wdp0Var));
                }
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Interceptor interceptor2 = (Interceptor) it4.next();
            if (!(interceptor2 instanceof sz80)) {
                if (interceptor2 instanceof nz80) {
                    aVar.b(interceptor2);
                } else {
                    aVar.b(his0.A(interceptor2, wdp0Var));
                }
            }
        }
        aVar.b(new sz80(wdp0Var));
    }
}
