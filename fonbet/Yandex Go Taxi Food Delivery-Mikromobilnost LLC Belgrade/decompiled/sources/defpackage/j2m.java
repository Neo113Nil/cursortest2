package defpackage;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j2m implements sls {
    public final /* synthetic */ odx a;
    public final /* synthetic */ ywl b;
    public final /* synthetic */ u1m c;
    public final /* synthetic */ Map w;
    public final /* synthetic */ String x;
    public final /* synthetic */ wu00 y;
    public final /* synthetic */ InputStream z;

    public j2m(l2m l2mVar, odx odxVar, ywl ywlVar, u1m u1mVar, Map map, String str, wu00 wu00Var, InputStream inputStream) {
        this.a = odxVar;
        this.b = ywlVar;
        this.c = u1mVar;
        this.w = map;
        this.x = str;
        this.y = wu00Var;
        this.z = inputStream;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String str = this.y.e;
        odx odxVar = this.a;
        l2m.a(odxVar, this.b, this.c, this.w, this.x, str);
        return odxVar.a(this.z);
    }
}
