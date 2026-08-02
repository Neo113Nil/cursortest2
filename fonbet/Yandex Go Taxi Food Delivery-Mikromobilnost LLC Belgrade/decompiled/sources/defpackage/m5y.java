package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.foundation.lazy.layout.c;
import java.util.Arrays;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class m5y {
    public n8e b;
    public int c;
    public int d;
    public int f;
    public int g;
    public final /* synthetic */ c h;
    public b[] a = vj91.a;
    public int e = 1;

    public m5y(c cVar) {
        this.h = cVar;
    }

    public static void b(m5y m5yVar, u5y u5yVar, tse tseVar, l0u l0uVar, int i, int i2) {
        m5yVar.h.getClass();
        long l = u5yVar.l(0);
        m5yVar.a(u5yVar, tseVar, l0uVar, i, i2, (int) (!u5yVar.g() ? l & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : l >> 32));
    }

    public final void a(u5y u5yVar, tse tseVar, l0u l0uVar, int i, int i2, int i3) {
        b[] bVarArr;
        b[] bVarArr2 = this.a;
        int length = bVarArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f = i;
                this.g = i2;
                break;
            } else {
                b bVar = bVarArr2[i4];
                if (bVar != null && bVar.g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int d = u5yVar.d();
        int length2 = this.a.length;
        while (true) {
            bVarArr = this.a;
            if (d >= length2) {
                break;
            }
            b bVar2 = bVarArr[d];
            if (bVar2 != null) {
                bVar2.d();
            }
            d++;
        }
        if (bVarArr.length != u5yVar.d()) {
            this.a = (b[]) Arrays.copyOf(this.a, u5yVar.d());
        }
        this.b = new n8e(u5yVar.i());
        this.c = i3;
        this.d = u5yVar.m();
        this.e = u5yVar.e();
        int d2 = u5yVar.d();
        for (int i5 = 0; i5 < d2; i5++) {
            Object k = u5yVar.k(i5);
            y4y y4yVar = k instanceof y4y ? (y4y) k : null;
            b[] bVarArr3 = this.a;
            if (y4yVar == null) {
                b bVar3 = bVarArr3[i5];
                if (bVar3 != null) {
                    bVar3.d();
                }
                this.a[i5] = null;
            } else {
                b bVar4 = bVarArr3[i5];
                if (bVar4 == null) {
                    bVar4 = new b(tseVar, l0uVar, new yow(12, this.h));
                    this.a[i5] = bVar4;
                }
                bVar4.d = y4yVar.a;
                bVar4.e = y4yVar.b;
                bVar4.f = y4yVar.c;
            }
        }
    }
}
