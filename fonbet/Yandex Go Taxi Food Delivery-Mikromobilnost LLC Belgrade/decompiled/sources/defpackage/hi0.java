package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class hi0 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ hi0(db51 db51Var, int i, o oVar, int i2, k kVar) {
        this.w = db51Var;
        this.b = i;
        this.x = oVar;
        this.c = i2;
        this.y = kVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.y;
        int i2 = this.c;
        Object obj3 = this.x;
        int i3 = this.b;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                String str = (String) obj4;
                tls tlsVar = (tls) obj3;
                oz40 oz40Var = (oz40) obj2;
                hoy0 hoy0Var = (hoy0) obj;
                String j = vi91.j(i3, vi91.d(vi91.l(hoy0Var.a.b), str), str);
                boolean equals = j.equals(((hoy0) oz40Var.getValue()).a.b);
                long j2 = hoy0Var.b;
                int i4 = asy0.c;
                int d = y6i0.d((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j2), i2, j.length());
                oz40Var.setValue(new hoy0(j, eja1.c(d, d), 4));
                if (!equals) {
                    tlsVar.invoke(j);
                    break;
                }
                break;
            case 1:
                o oVar = (o) obj4;
                o.a aVar = (o.a) obj;
                aVar.g(oVar, 0, 0, 0.0f);
                aVar.g((o) obj3, i3 / 2, 0, 0.0f);
                aVar.g((o) obj2, (oVar.a / 2) - i2, oVar.b, 0.0f);
                break;
            default:
                o oVar2 = (o) obj3;
                o.a.m((o.a) obj, oVar2, ((z5w) ((db51) obj4).c.invoke(new k6w(((i2 - oVar2.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | ((i3 - oVar2.a) << 32)), ((k) obj2).getLayoutDirection())).a);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ hi0(o oVar, o oVar2, int i, o oVar3, int i2) {
        this.w = oVar;
        this.x = oVar2;
        this.b = i;
        this.y = oVar3;
        this.c = i2;
    }

    public /* synthetic */ hi0(String str, int i, int i2, tls tlsVar, oz40 oz40Var) {
        this.w = str;
        this.b = i;
        this.c = i2;
        this.x = tlsVar;
        this.y = oz40Var;
    }
}
