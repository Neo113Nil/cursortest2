package defpackage;

import androidx.compose.foundation.text.selection.CrossStatus;
import com.yandex.messaging.internal.entities.Suggest;
import com.yandex.messaging.internal.view.timeline.c0;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public final /* synthetic */ class nhk0 implements sls {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ nhk0(zls zlsVar, ibk0 ibk0Var, int i, int i2, oz40 oz40Var) {
        this.w = zlsVar;
        this.x = ibk0Var;
        this.b = i;
        this.c = i2;
        this.y = oz40Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        zy11 zy11Var = zy11.a;
        int i3 = this.b;
        Object obj = this.y;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                oz40 oz40Var = (oz40) obj;
                ((zls) obj3).invoke((ibk0) obj2, Integer.valueOf(((int) (((k6w) oz40Var.getValue()).a >> 32)) + i3), Integer.valueOf(((int) (((k6w) oz40Var.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + i2));
                return zy11Var;
            case 1:
                dfq0 dfq0Var = (dfq0) obj3;
                rkq0 rkq0Var = (rkq0) obj2;
                int intValue = ((Number) ((i3y) obj).getValue()).intValue();
                boolean a = rkq0Var.a();
                boolean z = rkq0Var.c() == CrossStatus.CROSSED;
                long n = dfq0Var.f.n(i3);
                dry0 dry0Var = dfq0Var.f;
                int i4 = asy0.c;
                int i5 = (int) (n >> 32);
                hm40 hm40Var = dry0Var.b;
                int d = hm40Var.d(i5);
                int i6 = hm40Var.f;
                if (d != intValue) {
                    i5 = intValue >= i6 ? dry0Var.k(i6 - 1) : dry0Var.k(intValue);
                }
                int i7 = (int) (n & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                if (hm40Var.d(i7) != intValue) {
                    hm40 hm40Var2 = dry0Var.b;
                    i7 = intValue >= i6 ? hm40Var2.c(i6 - 1, false) : hm40Var2.c(intValue, false);
                }
                if (i5 == i2) {
                    return dfq0Var.a(i7);
                }
                if (i7 == i2) {
                    return dfq0Var.a(i5);
                }
                if (!(a ^ z) ? i3 >= i5 : i3 > i7) {
                    i5 = i7;
                }
                return dfq0Var.a(i5);
            default:
                c0 c0Var = (c0) obj3;
                c0Var.b((Suggest) obj2, true, (tu10) obj, Integer.valueOf(i3), this.c, (acb) c0Var.l.getValue());
                return zy11Var;
        }
    }

    public /* synthetic */ nhk0(dfq0 dfq0Var, int i, int i2, rkq0 rkq0Var, i3y i3yVar) {
        this.w = dfq0Var;
        this.b = i;
        this.c = i2;
        this.x = rkq0Var;
        this.y = i3yVar;
    }

    public /* synthetic */ nhk0(c0 c0Var, Suggest suggest, tu10 tu10Var, int i, int i2) {
        this.w = c0Var;
        this.x = suggest;
        this.y = tu10Var;
        this.b = i;
        this.c = i2;
    }
}
