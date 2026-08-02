package defpackage;

import android.view.autofill.AutofillValue;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final /* synthetic */ class lre implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ mre b;

    public /* synthetic */ lre(mre mreVar, mnq0 mnq0Var) {
        this.a = 3;
        this.b = mreVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        mre mreVar = this.b;
        switch (i) {
            case 0:
                oz40 oz40Var = mreVar.x.t;
                Boolean bool = Boolean.TRUE;
                oz40Var.setValue(bool);
                mreVar.x.s.setValue(bool);
                oay oayVar = mreVar.x;
                AutofillValue autofillValue = ((k92) ((v3r) obj)).a;
                mre.H0(oayVar, (String) (autofillValue.isText() ? autofillValue.getTextValue() : null), mreVar.y, mreVar.z);
                return bool;
            case 1:
                List list = (List) obj;
                if (mreVar.x.d() != null) {
                    list.add(mreVar.x.d().a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                mre.H0(mreVar.x, ((kk2) obj).b, mreVar.y, mreVar.z);
                return Boolean.TRUE;
            default:
                kk2 kk2Var = (kk2) obj;
                if (!mreVar.y && mreVar.z) {
                    xpy0 xpy0Var = mreVar.x.e;
                    if (xpy0Var != null) {
                        List g = scc.g(new u9r(), new fnc(kk2Var, 1));
                        oay oayVar2 = mreVar.x;
                        jnn jnnVar = oayVar2.d;
                        cre creVar = oayVar2.v;
                        hoy0 a = jnnVar.a(g);
                        xpy0Var.a(null, a);
                        creVar.invoke(a);
                    } else {
                        hoy0 hoy0Var = mreVar.w;
                        String str = hoy0Var.a.b;
                        long j = hoy0Var.b;
                        int i2 = asy0.c;
                        String obj2 = evu0.U((int) (j >> 32), (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), str, kk2Var).toString();
                        int length = kk2Var.b.length() + ((int) (mreVar.w.b >> 32));
                        mreVar.x.v.invoke(new hoy0(obj2, eja1.c(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ lre(mre mreVar, int i) {
        this.a = i;
        this.b = mreVar;
    }
}
