package defpackage;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes9.dex */
public final class k2m implements yu00 {
    public final /* synthetic */ odx a;
    public final /* synthetic */ l2m b;
    public final /* synthetic */ ywl c;
    public final /* synthetic */ u1m d;
    public final /* synthetic */ String e;

    public k2m(odx odxVar, l2m l2mVar, ywl ywlVar, u1m u1mVar, String str) {
        this.a = odxVar;
        this.b = l2mVar;
        this.c = ywlVar;
        this.d = u1mVar;
        this.e = str;
    }

    @Override // defpackage.yu00
    public final Object a(Map map, InputStream inputStream) {
        kg90 a;
        sf90 A = bvf0.A(this.a.a);
        odx odxVar = this.a;
        ywl ywlVar = this.c;
        u1m u1mVar = this.d;
        String str = this.e;
        synchronized (A.b) {
            l2m.a(odxVar, ywlVar, u1mVar, map, str, null);
            a = odxVar.a(inputStream);
        }
        return a;
    }

    @Override // defpackage.yu00
    public final Object b(Map map, InputStream inputStream, wu00 wu00Var) {
        Object invoke;
        sf90 A = bvf0.A(this.a.a);
        j2m j2mVar = new j2m(this.b, this.a, this.c, this.d, map, this.e, wu00Var, inputStream);
        synchronized (A.b) {
            invoke = j2mVar.invoke();
        }
        return (kg90) invoke;
    }
}
