package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.design.compose.slot.SlotSize;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class bk50 {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if ((r24 & 2) != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final wj50 wj50Var, zls zlsVar, fid fidVar, int i, int i2) {
        zls zlsVar2;
        zls zlsVar3;
        f530 a;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1851158751);
        int i4 = i | (btsVar.k(wj50Var) ? 4 : 2);
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                zlsVar2 = zlsVar;
                if (btsVar.e(zlsVar2)) {
                    i3 = 32;
                    i4 |= i3;
                }
            } else {
                zlsVar2 = zlsVar;
            }
            i3 = 16;
            i4 |= i3;
        } else {
            zlsVar2 = zlsVar;
        }
        final int i5 = 0;
        final int i6 = 1;
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                if ((i2 & 2) != 0) {
                    zlsVar2 = ka01.a;
                    i4 &= -113;
                }
                zls zlsVar4 = zlsVar2;
                btsVar.u();
                a = b.a(an91.o(c530.a, 16.0f, 0.0f, 16.0f, 12.0f, 2), m.a(), new j2d(3));
                ydb1.a(a, wwg.S(-662971081, true, new zls() { // from class: zj50
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        String str;
                        int i7 = i5;
                        zy11 zy11Var = zy11.a;
                        wj50 wj50Var2 = wj50Var;
                        switch (i7) {
                            case 0:
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    r5a1.b(wj50Var2.a, false, null, btsVar2, 0, 6);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    int i8 = intValue2;
                                    String str2 = wj50Var2.b;
                                    FavoriteAddress.FavoriteTitle addressSubtitle = wj50Var2.c.getAddressSubtitle();
                                    if (addressSubtitle == null || (str = addressSubtitle.a) == null) {
                                        str = "";
                                    }
                                    p9b1.c(ebp0Var, str2, null, null, null, 0, 0, str, null, null, 0, 0, null, btsVar3, i8 & 14, 0, 8126);
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }, btsVar), wwg.S(157485618, true, new zls() { // from class: zj50
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        String str;
                        int i7 = i6;
                        zy11 zy11Var = zy11.a;
                        wj50 wj50Var2 = wj50Var;
                        switch (i7) {
                            case 0:
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(1 & intValue, (intValue & 17) != 16)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    r5a1.b(wj50Var2.a, false, null, btsVar2, 0, 6);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    int i8 = intValue2;
                                    String str2 = wj50Var2.b;
                                    FavoriteAddress.FavoriteTitle addressSubtitle = wj50Var2.c.getAddressSubtitle();
                                    if (addressSubtitle == null || (str = addressSubtitle.a) == null) {
                                        str = "";
                                    }
                                    p9b1.c(ebp0Var, str2, null, null, null, 0, 0, str, null, null, 0, 0, null, btsVar3, i8 & 14, 0, 8126);
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }, btsVar), null, zlsVar4, null, null, false, btsVar, ((i4 << 9) & HProv.ALG_CLASS_ALL) | 438, 232);
                zlsVar3 = zlsVar4;
            } else {
                btsVar.Y();
            }
        } else {
            btsVar.Y();
            zlsVar3 = zlsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q12(i, i2, 6, wj50Var, zlsVar3);
        }
    }

    public static final void b(ibp0 ibp0Var, int i, int i2, tls tlsVar, fid fidVar, int i3) {
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1175915292);
        if ((i3 & 6) == 0) {
            i4 = (btsVar.k(ibp0Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= btsVar.c(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= btsVar.c(i2) ? 256 : 128;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z = i2 == i;
            boolean z2 = ((i4 & 7168) == 2048) | ((i4 & 112) == 32);
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new yj50(i, 0, tlsVar);
                btsVar.o0(Q);
            }
            wfa1.a(z, an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, (tls) Q, true, btsVar, 0, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bn1(ibp0Var, i, i2, tlsVar, i3);
        }
    }

    public static final void c(bpl0 bpl0Var, int i, tls tlsVar, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(39740491);
        int i3 = i2 | (btsVar.k(bpl0Var) ? 4 : 2) | (btsVar.c(i) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (!btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar.Y();
        } else if (bpl0Var.a.size() == 1) {
            btsVar.e0(-1501840246);
            a((wj50) a.P(bpl0Var.a), null, btsVar, 0, 2);
            btsVar.t(false);
        } else {
            btsVar.e0(-1501783237);
            f530 g = ljs0.g(c530.a, 0.0f, 100.0f, 1);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new v45(bpl0Var, i, tlsVar, 3);
                btsVar.o0(Q);
            }
            adb1.a(g, null, null, null, null, null, false, null, (tls) Q, btsVar, 6, 510);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(i, i2, 26, bpl0Var, tlsVar);
        }
    }
}
