package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.compose.runtime.internal.a;
import coil.util.SystemCallbacks;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class jsb1 {
    public static final void a(final yte yteVar, final tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(841076655);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(yteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            a S = wwg.S(1557561853, true, new zls() { // from class: tte
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    o430 o430Var = did.a;
                    final yte yteVar2 = yteVar;
                    final tls tlsVar2 = tlsVar;
                    Object[] objArr = 0;
                    final int i6 = 1;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                boolean k = btsVar2.k(tlsVar2) | btsVar2.k(yteVar2);
                                Object Q = btsVar2.Q();
                                if (k || Q == o430Var) {
                                    final Object[] objArr2 = objArr == true ? 1 : 0;
                                    Q = new sls() { // from class: ute
                                        @Override // defpackage.sls
                                        public final Object invoke() {
                                            int i7 = objArr2;
                                            zy11 zy11Var2 = zy11.a;
                                            xte xteVar = xte.a;
                                            yte yteVar3 = yteVar2;
                                            tls tlsVar3 = tlsVar2;
                                            switch (i7) {
                                                case 0:
                                                    yteVar3.getClass();
                                                    tlsVar3.invoke(xteVar);
                                                    break;
                                                default:
                                                    yteVar3.getClass();
                                                    tlsVar3.invoke(xteVar);
                                                    break;
                                            }
                                            return zy11Var2;
                                        }
                                    };
                                    btsVar2.o0(Q);
                                }
                                mab1.a(null, null, null, null, null, null, (sls) Q, btsVar2, 0, 63);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                f530 c = ljs0.c(i9a1.d(an91.k(c530.a, 8.0f)), 1.0f);
                                boolean k2 = btsVar3.k(tlsVar2) | btsVar3.k(yteVar2);
                                Object Q2 = btsVar3.Q();
                                if (k2 || Q2 == o430Var) {
                                    Q2 = new sls() { // from class: ute
                                        @Override // defpackage.sls
                                        public final Object invoke() {
                                            int i7 = i6;
                                            zy11 zy11Var2 = zy11.a;
                                            xte xteVar = xte.a;
                                            yte yteVar3 = yteVar2;
                                            tls tlsVar3 = tlsVar2;
                                            switch (i7) {
                                                case 0:
                                                    yteVar3.getClass();
                                                    tlsVar3.invoke(xteVar);
                                                    break;
                                                default:
                                                    yteVar3.getClass();
                                                    tlsVar3.invoke(xteVar);
                                                    break;
                                            }
                                            return zy11Var2;
                                        }
                                    };
                                    btsVar3.o0(Q2);
                                }
                                ohb1.b(c, false, null, (sls) Q2, wwg.S(833259176, true, new ota(12, yteVar2), btsVar3), btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar);
            h6d.a.getClass();
            c.a(null, null, null, false, false, null, null, S, null, h6d.b, wwg.S(-1638176069, true, new zls() { // from class: tte
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    o430 o430Var = did.a;
                    final yte yteVar2 = yteVar;
                    final tls tlsVar2 = tlsVar;
                    Object[] objArr = 0;
                    final int i6 = 1;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                boolean k = btsVar2.k(tlsVar2) | btsVar2.k(yteVar2);
                                Object Q = btsVar2.Q();
                                if (k || Q == o430Var) {
                                    final int objArr2 = objArr == true ? 1 : 0;
                                    Q = new sls() { // from class: ute
                                        @Override // defpackage.sls
                                        public final Object invoke() {
                                            int i7 = objArr2;
                                            zy11 zy11Var2 = zy11.a;
                                            xte xteVar = xte.a;
                                            yte yteVar3 = yteVar2;
                                            tls tlsVar3 = tlsVar2;
                                            switch (i7) {
                                                case 0:
                                                    yteVar3.getClass();
                                                    tlsVar3.invoke(xteVar);
                                                    break;
                                                default:
                                                    yteVar3.getClass();
                                                    tlsVar3.invoke(xteVar);
                                                    break;
                                            }
                                            return zy11Var2;
                                        }
                                    };
                                    btsVar2.o0(Q);
                                }
                                mab1.a(null, null, null, null, null, null, (sls) Q, btsVar2, 0, 63);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                f530 c = ljs0.c(i9a1.d(an91.k(c530.a, 8.0f)), 1.0f);
                                boolean k2 = btsVar3.k(tlsVar2) | btsVar3.k(yteVar2);
                                Object Q2 = btsVar3.Q();
                                if (k2 || Q2 == o430Var) {
                                    Q2 = new sls() { // from class: ute
                                        @Override // defpackage.sls
                                        public final Object invoke() {
                                            int i7 = i6;
                                            zy11 zy11Var2 = zy11.a;
                                            xte xteVar = xte.a;
                                            yte yteVar3 = yteVar2;
                                            tls tlsVar3 = tlsVar2;
                                            switch (i7) {
                                                case 0:
                                                    yteVar3.getClass();
                                                    tlsVar3.invoke(xteVar);
                                                    break;
                                                default:
                                                    yteVar3.getClass();
                                                    tlsVar3.invoke(xteVar);
                                                    break;
                                            }
                                            return zy11Var2;
                                        }
                                    };
                                    btsVar3.o0(Q2);
                                }
                                ohb1.b(c, false, null, (sls) Q2, wwg.S(833259176, true, new ota(12, yteVar2), btsVar3), btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-1262391537, true, new alb0(8, yteVar), btsVar), btsVar, 817889280, 54, 383);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(yteVar, tlsVar, i, 6);
        }
    }

    public static final ux50 b(Context context, SystemCallbacks systemCallbacks) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null || qke.h(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return new swn();
        }
        try {
            return new cdi0(connectivityManager, systemCallbacks);
        } catch (Exception unused) {
            return new swn();
        }
    }
}
