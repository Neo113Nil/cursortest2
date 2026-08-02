package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.e;

/* loaded from: classes5.dex */
public final /* synthetic */ class g0j0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ g0j0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        long e;
        int i = this.a;
        int i2 = 0;
        float f = 0.0f;
        e eVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(eVar.j.getValue() != null);
            case 1:
                return eVar.a.e();
            case 2:
                l3y d = eVar.d();
                if (d != null) {
                    s6y s6yVar = (s6y) eVar.a.e().b;
                    int i3 = m3y.a[s6yVar.o.ordinal()];
                    if (i3 == 1) {
                        e = s6yVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        e = s6yVar.e() >> 32;
                    }
                    float b = (int) (((l0j0) d).b() >> 32);
                    f = (((int) e) - t791.d((Float.floatToRawIntBits((int) (r6 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(b) << 32), eVar.f())) - 1.0f;
                }
                return Float.valueOf(f);
            default:
                l3y d2 = eVar.d();
                if (d2 != null) {
                    ArrayList H = eVar.a.e().H();
                    Iterator it = H.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                        } else if (!((t6y) ((l0j0) ((l3y) it.next())).a).k.equals(eVar.j.getValue())) {
                            i2++;
                        }
                    }
                    l3y l3yVar = (l3y) a.S(i2 - 1, H);
                    if (l3yVar == null) {
                        l3yVar = d2;
                    }
                    long b2 = ((l0j0) l3yVar).b();
                    float d3 = (t791.d((Float.floatToRawIntBits((int) (b2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (b2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), eVar.f()) + t791.e(r1.c(), eVar.f())) - 1.0f;
                    if (d3 <= 0.0f) {
                        long b3 = ((l0j0) d2).b();
                        f = (t791.d((Float.floatToRawIntBits((int) (b3 >> 32)) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits((int) (b3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))), eVar.f()) + t791.e(r0.c(), eVar.f())) - 1.0f;
                    } else {
                        f = d3;
                    }
                }
                return Float.valueOf(f);
        }
    }
}
