package defpackage;

import ru.yandex.taxi.masstransit.geopayment.checkout.t;

/* loaded from: classes6.dex */
public final /* synthetic */ class be30 implements sls {
    public final /* synthetic */ t a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ double w;
    public final /* synthetic */ int x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ be30(t tVar, String str, String str2, double d, int i, String str3, String str4) {
        this.a = tVar;
        this.b = str;
        this.c = str2;
        this.w = d;
        this.x = i;
        this.y = str3;
        this.z = str4;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        t tVar = this.a;
        tVar.K.a(this.b, "", false, this.c, tVar.C, tVar.S, Double.valueOf(this.w), Integer.valueOf(this.x), this.y, this.z);
        tVar.Pg();
        ((je30) tVar.B.b).r(new ps20(25));
        return zy11.a;
    }
}
