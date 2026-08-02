package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.lazy.b;
import com.yandex.xplat.payment.sdk.FamilyInfoFrame;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class he91 {
    public static final miv a = new miv(false);

    public static final void a(yxi yxiVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1990892361);
        int i2 = (btsVar2.k(yxiVar) ? 4 : 2) | i;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            ymb1.e(yxiVar.a, an91.o(c530.a, 16.0f, 0.0f, 16.0f, 12.0f, 2), 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 48, 0, 65532);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tbb(yxiVar, i, 23);
        }
    }

    public static final void b(b bVar, final rqy rqyVar, final List list, final tls tlsVar, final List list2, float f, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1285178324);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar2.k(rqyVar) : btsVar2.e(rqyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar2.k(list) : btsVar2.e(list) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= (i & 32768) == 0 ? btsVar2.k(list2) : btsVar2.e(list2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.b(f) ? 131072 : 65536;
        }
        int i3 = i2;
        boolean z = false;
        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
            float f2 = rqyVar.a ? 12.0f : 0.0f;
            final boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            final float f3 = z2 ? 16.0f : 8.0f;
            WeakHashMap weakHashMap = a.w;
            l690 d = an91.d(0.0f, f, 0.0f, w8a1.f(vuz.o(btsVar2).e, btsVar2).a(), 5);
            boolean a2 = btsVar2.a(z2) | ((57344 & i3) == 16384 || ((i3 & 32768) != 0 && btsVar2.e(list2))) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && btsVar2.e(list))) | btsVar2.b(f3);
            if ((i3 & 112) == 32 || ((i3 & 64) != 0 && btsVar2.e(rqyVar))) {
                z = true;
            }
            boolean b = a2 | z | btsVar2.b(f2);
            Object Q = btsVar2.Q();
            if (b || Q == did.a) {
                final float f4 = f2;
                tls tlsVar2 = new tls() { // from class: xa31
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        u6y u6yVar = (u6y) obj;
                        boolean z3 = z2;
                        tls tlsVar3 = tlsVar;
                        int i4 = 1;
                        if (z3) {
                            u6y.b(u6yVar, null, new androidx.compose.runtime.internal.a(-1683482372, new mpy0(list2, tlsVar3, i4), true), 3);
                            cfd.a.getClass();
                            u6y.b(u6yVar, null, cfd.b, 3);
                        }
                        List list3 = list;
                        if (!list3.isEmpty()) {
                            u6y.b(u6yVar, null, new androidx.compose.runtime.internal.a(1241501925, new fn1(f3, list3, tlsVar3, 4), true), 3);
                            cfd.a.getClass();
                            u6y.b(u6yVar, null, cfd.c, 3);
                        }
                        rqy rqyVar2 = rqyVar;
                        List list4 = rqyVar2.b;
                        ((m6y) u6yVar).f(list4.size(), null, new pcx0(list4, 8), new androidx.compose.runtime.internal.a(2039820996, new ya31(list4, rqyVar2, f4, tlsVar3), true));
                        return zy11.a;
                    }
                };
                btsVar2.o0(tlsVar2);
                Q = tlsVar2;
            }
            btsVar = btsVar2;
            adb1.a(null, bVar, d, null, null, null, false, null, (tls) Q, btsVar, (i3 << 3) & 112, 505);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ls7(bVar, rqyVar, list, tlsVar, list2, f, i);
        }
    }

    public static final FamilyInfoFrame c(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        FamilyInfoFrame familyInfoFrame = FamilyInfoFrame.day;
        if (lowerCase.equals(familyInfoFrame.getValue())) {
            return familyInfoFrame;
        }
        FamilyInfoFrame familyInfoFrame2 = FamilyInfoFrame.month;
        if (lowerCase.equals(familyInfoFrame2.getValue())) {
            return familyInfoFrame2;
        }
        FamilyInfoFrame familyInfoFrame3 = FamilyInfoFrame.week;
        if (lowerCase.equals(familyInfoFrame3.getValue())) {
            return familyInfoFrame3;
        }
        return null;
    }
}
