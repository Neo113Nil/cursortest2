package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.compose.runtime.internal.a;
import com.google.android.gms.internal.play_billing.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes11.dex */
public abstract class nta1 {
    public static final void a(final sls slsVar, final a aVar, final f530 f530Var, final wls wlsVar, final wls wlsVar2, ehr0 ehr0Var, final long j, long j2, long j3, long j4, sej sejVar, fid fidVar, final int i) {
        sls slsVar2;
        int i2;
        a aVar2;
        f530 f530Var2;
        wls wlsVar3;
        wls wlsVar4;
        long j5;
        bts btsVar;
        final ehr0 ehr0Var2;
        final long j6;
        final long j7;
        final long j8;
        final sej sejVar2;
        ehr0 b;
        long d;
        int i3;
        long d2;
        long d3;
        sej sejVar3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(94478519);
        if ((i & 6) == 0) {
            slsVar2 = slsVar;
            i2 = (btsVar2.e(slsVar2) ? 4 : 2) | i;
        } else {
            slsVar2 = slsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            aVar2 = aVar;
            i2 |= btsVar2.e(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        if ((i & 384) == 0) {
            f530Var2 = f530Var;
            i2 |= btsVar2.k(f530Var2) ? 256 : 128;
        } else {
            f530Var2 = f530Var;
        }
        int i4 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.e(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            wlsVar3 = wlsVar;
            i4 |= btsVar2.e(wlsVar3) ? 131072 : 65536;
        } else {
            wlsVar3 = wlsVar;
        }
        if ((1572864 & i) == 0) {
            wlsVar4 = wlsVar2;
            i4 |= btsVar2.e(wlsVar4) ? 1048576 : 524288;
        } else {
            wlsVar4 = wlsVar2;
        }
        if ((12582912 & i) == 0) {
            i4 |= SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            j5 = j;
            i4 |= btsVar2.d(j5) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        } else {
            j5 = j;
        }
        if ((805306368 & i) == 0) {
            i4 |= SelfTester_JCP.IMITA;
        }
        if (btsVar2.V(i4 & 1, (306783379 & i4) != 306783378)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                b = zir0.b(efj.c, btsVar2);
                d = dgc.d(efj.h, btsVar2);
                i3 = i4 & (-1908408321);
                d2 = dgc.d(efj.d, btsVar2);
                d3 = dgc.d(efj.f, btsVar2);
                sejVar3 = new sej(7);
            } else {
                btsVar2.Y();
                i3 = i4 & (-1908408321);
                b = ehr0Var;
                d = j2;
                d2 = j3;
                d3 = j4;
                sejVar3 = sejVar;
            }
            btsVar2.u();
            long j9 = d3;
            btsVar = btsVar2;
            sls slsVar3 = slsVar2;
            a aVar3 = aVar2;
            wls wlsVar5 = wlsVar3;
            ehr0Var2 = b;
            j6 = d;
            sejVar2 = sejVar3;
            j7 = d2;
            j8 = j9;
            cr1.c(slsVar3, aVar3, f530Var2, wlsVar5, wlsVar4, ehr0Var2, j5, j6, j7, j8, sejVar2, btsVar, 2147483646 & i3, 3456);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            ehr0Var2 = ehr0Var;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            sejVar2 = sejVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: j72
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    nta1.a(sls.this, aVar, f530Var, wlsVar, wlsVar2, ehr0Var2, j, j6, j7, j8, sejVar2, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final Object b(c cVar, FormattedText formattedText, ContinuationImpl continuationImpl) {
        if (formattedText == null) {
            return null;
        }
        Object e = c.e(cVar, formattedText, null, false, continuationImpl, 30);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : (CharSequence) e;
    }

    public static final boolean c(h711 h711Var) {
        return (h711Var instanceof c711) && ((c711) h711Var).b.length() == 0;
    }

    public static final fiy d(int i, List list) {
        h711 h711Var = (h711) list.get(i);
        h711 h711Var2 = i < scc.f(list) ? (h711) list.get(i + 1) : null;
        if (h711Var instanceof n611) {
            return null;
        }
        boolean z = h711Var instanceof m611;
        biy biyVar = biy.a;
        if (z) {
            if (!c(h711Var2)) {
                return leb1.c(((m611) h711Var).d);
            }
        } else {
            if (!(h711Var instanceof l611)) {
                if (h711Var instanceof c711) {
                    return ((c711) h711Var).b.length() == 0 ? biyVar : leb1.c(g911.a);
                }
                if ((h711Var instanceof h611) || (h711Var instanceof i611) || (h711Var instanceof j611) || (h711Var instanceof v611) || (h711Var instanceof k611) || (h711Var instanceof q611) || (h711Var instanceof s611) || (h711Var instanceof w611) || (h711Var instanceof b711) || (h711Var instanceof d711) || (h711Var instanceof e711) || (h711Var instanceof f711) || (h711Var instanceof g711) || (h711Var instanceof d611) || (h711Var instanceof e611) || (h711Var instanceof f611) || (h711Var instanceof r611) || (h711Var instanceof g611)) {
                    return leb1.c(h711Var.j());
                }
                w511.b();
                return null;
            }
            if (!c(h711Var2)) {
                return leb1.c(((l611) h711Var).e);
            }
        }
        return biyVar;
    }

    public static final fiy e(int i, List list) {
        k911 j;
        k911 j2;
        h711 h711Var = (h711) list.get(i);
        h711 h711Var2 = i > 0 ? (h711) list.get(i - 1) : null;
        if (!(h711Var instanceof h611)) {
            boolean z = h711Var instanceof c711;
            biy biyVar = biy.a;
            if (z) {
                return ((c711) h711Var).b.length() == 0 ? biyVar : leb1.c(g911.a);
            }
            if ((h711Var instanceof m611) || (h711Var instanceof l611) || (h711Var instanceof q611) || (h711Var instanceof s611) || (h711Var instanceof b711) || (h711Var instanceof d711) || (h711Var instanceof e611)) {
                if (h711Var2 != null && (j = h711Var2.j()) != null) {
                    return leb1.c(j);
                }
            } else {
                if (!(h711Var instanceof n611) && !(h711Var instanceof i611) && !(h711Var instanceof j611) && !(h711Var instanceof v611) && !(h711Var instanceof k611) && !(h711Var instanceof g611) && !(h711Var instanceof f611)) {
                    if ((h711Var instanceof w611) || (h711Var instanceof e711) || (h711Var instanceof f711) || (h711Var instanceof g711) || (h711Var instanceof d611) || (h711Var instanceof r611)) {
                        return leb1.c(h711Var.j());
                    }
                    w511.b();
                    return null;
                }
                if (c(h711Var2)) {
                    return biyVar;
                }
                if (h711Var2 != null && (j2 = h711Var2.j()) != null) {
                    return leb1.c(j2);
                }
            }
        }
        return null;
    }

    public static we6 f(Bundle bundle, String str) {
        ns5 ns5Var = fe91.i;
        if (bundle == null) {
            int i = g.a;
            Log.isLoggable("BillingClient", 5);
            return new we6(ns5Var, 54, 18);
        }
        int a = g.a(bundle, "BillingClient");
        String e = g.e(bundle, "BillingClient");
        ms5 a2 = ns5.a();
        a2.a = a;
        a2.b = e;
        ns5 a3 = a2.a();
        if (a != 0) {
            Log.isLoggable("BillingClient", 5);
            return new we6(a3, 23, 18);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            Log.isLoggable("BillingClient", 5);
            return new we6(ns5Var, 55, 18);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            Log.isLoggable("BillingClient", 5);
            return new we6(ns5Var, 56, 18);
        }
        if (stringArrayList2 == null) {
            Log.isLoggable("BillingClient", 5);
            return new we6(ns5Var, 57, 18);
        }
        if (stringArrayList3 != null) {
            return new we6(fe91.j, 1, 18);
        }
        Log.isLoggable("BillingClient", 5);
        return new we6(ns5Var, 58, 18);
    }
}
