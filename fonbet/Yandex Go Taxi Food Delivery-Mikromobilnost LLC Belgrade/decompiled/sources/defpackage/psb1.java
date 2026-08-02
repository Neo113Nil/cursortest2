package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.ybsdk.feature.transfer.version2.api.dto.RequisiteFieldValidatorDto;
import com.ybsdk.feature.transfer.version2.api.dto.RequisiteFieldValidatorRegexDto;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisiteFieldValidatorEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisiteFieldValidatorRegexEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class psb1 {
    public static final void a(hze hzeVar, fid fidVar, int i) {
        a S;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1577684105);
        int i2 = (btsVar.k(hzeVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 m = an91.m(ljs0.e(c530.a, 56.0f), 16.0f, 0.0f, 2);
            String str = hzeVar.b;
            if (str == null) {
                btsVar.e0(-959771717);
                btsVar.t(false);
                S = null;
            } else {
                btsVar.e0(-959771716);
                S = wwg.S(-1143049240, true, new q0(str, 13), btsVar);
                btsVar.t(false);
            }
            ik11.a(wwg.S(-1265476862, true, new gze(hzeVar), btsVar), S, m, btsVar, 6, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gze(hzeVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f530 f530Var, float f, List list, boolean z, final wls wlsVar, fid fidVar, int i, int i2) {
        int i3;
        boolean z2;
        bts btsVar;
        boolean z3;
        aii0 v;
        Pair pair;
        int i4;
        boolean z4;
        bts btsVar2;
        final int i5;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(1404739005);
        int i6 = 2;
        if ((i & 6) == 0) {
            i3 = (btsVar3.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar3.b(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar3.e(list) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z2 = z;
            i3 |= btsVar3.a(z2) ? 2048 : 1024;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar3.e(wlsVar) ? 16384 : 8192;
            }
            boolean z5 = true;
            if (btsVar3.V(i3 & 1, (i3 & 9363) == 9362)) {
                btsVar = btsVar3;
                btsVar.Y();
                z3 = z2;
            } else {
                boolean z6 = i7 != 0 ? false : z2;
                lhl0 a = khl0.a(new i43(f, true, new quz(11)), x4c.D, btsVar3, 0);
                int hashCode = Long.hashCode(btsVar3.T);
                r1b0 o = btsVar3.o();
                f530 d = b.d(btsVar3, f530Var);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (btsVar3.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(btsVar3, d.f, a);
                qje.W(btsVar3, d.e, o);
                wls wlsVar2 = d.g;
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar3, hashCode, wlsVar2);
                }
                qje.W(btsVar3, d.d, d);
                btsVar3.e0(-169789431);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final a360 a360Var = (a360) it.next();
                    int i8 = c360.a[a360Var.d.ordinal()];
                    if (i8 == z5) {
                        btsVar3.e0(567436599);
                        pair = new Pair(((YandexShapes) btsVar3.m(qm51.a)).d(), new y7m(40.0f));
                        btsVar3.t(false);
                    } else if (i8 == i6) {
                        btsVar3.e0(567439607);
                        pair = new Pair(((YandexShapes) btsVar3.m(qm51.a)).b(), new y7m(48.0f));
                        btsVar3.t(false);
                    } else {
                        if (i8 != 3) {
                            throw unr0.y(567434228, btsVar3, false);
                        }
                        btsVar3.e0(567442615);
                        pair = new Pair(((YandexShapes) btsVar3.m(qm51.a)).b(), new y7m(56.0f));
                        btsVar3.t(false);
                    }
                    byk0 byk0Var = (byk0) pair.getFirst();
                    f530 e = ljs0.e(ljs0.c(c530.a, 1.0f), ((y7m) pair.getSecond()).a);
                    a S = wwg.S(-2059915456, z5, new wg30(20, a360Var), btsVar3);
                    int i9 = c360.b[a360Var.c.ordinal()];
                    o430 o430Var = did.a;
                    nhl0 nhl0Var = nhl0.a;
                    if (i9 == z5) {
                        i4 = i6;
                        z4 = z6;
                        bts btsVar4 = btsVar3;
                        final int i10 = 0;
                        btsVar4.e0(411390663);
                        f530 f2 = ocb1.f(nhl0Var.a(e, 1.0f, true), z4, btsVar4, (i3 >> 6) & 112);
                        boolean z7 = !z4;
                        boolean k = ((57344 & i3) == 16384) | btsVar4.k(a360Var);
                        Object Q = btsVar4.Q();
                        if (k || Q == o430Var) {
                            Q = new sls() { // from class: b360
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i11 = i10;
                                    zy11 zy11Var = zy11.a;
                                    wls wlsVar3 = wlsVar;
                                    a360 a360Var2 = a360Var;
                                    switch (i11) {
                                        case 0:
                                            y260 y260Var = a360Var2.e;
                                            if (y260Var != null) {
                                                wlsVar3.invoke(y260Var, a360Var2.f);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            y260 y260Var2 = a360Var2.e;
                                            if (y260Var2 != null) {
                                                wlsVar3.invoke(y260Var2, a360Var2.f);
                                                break;
                                            }
                                            break;
                                        default:
                                            y260 y260Var3 = a360Var2.e;
                                            if (y260Var3 != null) {
                                                wlsVar3.invoke(y260Var3, a360Var2.f);
                                                break;
                                            }
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            btsVar4.o0(Q);
                        }
                        ru.yandex.taxi.logistics.sdk.ui.component.control.a.a((sls) Q, f2, byk0Var, 0L, 0L, null, z7, null, null, null, S, btsVar4, 0, 3832);
                        btsVar2 = btsVar4;
                        btsVar2.t(false);
                    } else if (i9 == i6) {
                        i4 = i6;
                        boolean z8 = z6;
                        bts btsVar5 = btsVar3;
                        btsVar5.e0(411812325);
                        f530 f3 = ocb1.f(nhl0Var.a(e, 1.0f, true), z8, btsVar5, (i3 >> 6) & 112);
                        boolean z9 = !z8;
                        boolean k2 = ((57344 & i3) == 16384) | btsVar5.k(a360Var);
                        Object Q2 = btsVar5.Q();
                        if (k2 || Q2 == o430Var) {
                            final int i11 = 1;
                            Q2 = new sls() { // from class: b360
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i112 = i11;
                                    zy11 zy11Var = zy11.a;
                                    wls wlsVar3 = wlsVar;
                                    a360 a360Var2 = a360Var;
                                    switch (i112) {
                                        case 0:
                                            y260 y260Var = a360Var2.e;
                                            if (y260Var != null) {
                                                wlsVar3.invoke(y260Var, a360Var2.f);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            y260 y260Var2 = a360Var2.e;
                                            if (y260Var2 != null) {
                                                wlsVar3.invoke(y260Var2, a360Var2.f);
                                                break;
                                            }
                                            break;
                                        default:
                                            y260 y260Var3 = a360Var2.e;
                                            if (y260Var3 != null) {
                                                wlsVar3.invoke(y260Var3, a360Var2.f);
                                                break;
                                            }
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            btsVar5.o0(Q2);
                        }
                        z4 = z8;
                        ru.yandex.taxi.logistics.sdk.ui.component.control.a.d((sls) Q2, f3, byk0Var, 0L, 0L, null, null, z9, null, S, btsVar5, 0, 3832);
                        btsVar2 = btsVar5;
                        btsVar2.t(false);
                    } else {
                        if (i9 != 3) {
                            throw unr0.y(567458762, btsVar3, false);
                        }
                        btsVar3.e0(412232685);
                        f530 f4 = ocb1.f(nhl0Var.a(e, 1.0f, z5), z6, btsVar3, (i3 >> 6) & 112);
                        boolean z10 = !z6;
                        boolean k3 = ((57344 & i3) == 16384 ? z5 : false) | btsVar3.k(a360Var);
                        Object Q3 = btsVar3.Q();
                        if (k3 || Q3 == o430Var) {
                            i5 = 2;
                            Q3 = new sls() { // from class: b360
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i112 = i5;
                                    zy11 zy11Var = zy11.a;
                                    wls wlsVar3 = wlsVar;
                                    a360 a360Var2 = a360Var;
                                    switch (i112) {
                                        case 0:
                                            y260 y260Var = a360Var2.e;
                                            if (y260Var != null) {
                                                wlsVar3.invoke(y260Var, a360Var2.f);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            y260 y260Var2 = a360Var2.e;
                                            if (y260Var2 != null) {
                                                wlsVar3.invoke(y260Var2, a360Var2.f);
                                                break;
                                            }
                                            break;
                                        default:
                                            y260 y260Var3 = a360Var2.e;
                                            if (y260Var3 != null) {
                                                wlsVar3.invoke(y260Var3, a360Var2.f);
                                                break;
                                            }
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            btsVar3.o0(Q3);
                        } else {
                            i5 = 2;
                        }
                        i4 = i5;
                        bts btsVar6 = btsVar3;
                        ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q3, f4, byk0Var, 0L, 0L, null, null, null, z10, null, null, null, S, btsVar6, 0, 384, 3832);
                        btsVar2 = btsVar6;
                        btsVar2.t(false);
                        z4 = z6;
                    }
                    z6 = z4;
                    btsVar3 = btsVar2;
                    i6 = i4;
                    z5 = true;
                }
                btsVar = btsVar3;
                btsVar.t(false);
                btsVar.t(true);
                z3 = z6;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new z640(f530Var, f, list, z3, wlsVar, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        boolean z52 = true;
        if (btsVar3.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final RequisiteFieldValidatorEntity c(RequisiteFieldValidatorDto requisiteFieldValidatorDto) {
        List<RequisiteFieldValidatorRegexDto> input = requisiteFieldValidatorDto.getInput();
        ArrayList arrayList = new ArrayList(tcc.n(input, 10));
        for (RequisiteFieldValidatorRegexDto requisiteFieldValidatorRegexDto : input) {
            arrayList.add(new RequisiteFieldValidatorRegexEntity(new Regex(requisiteFieldValidatorRegexDto.getRegex()), requisiteFieldValidatorRegexDto.getHint()));
        }
        List<RequisiteFieldValidatorRegexDto> unfocus = requisiteFieldValidatorDto.getUnfocus();
        ArrayList arrayList2 = new ArrayList(tcc.n(unfocus, 10));
        for (RequisiteFieldValidatorRegexDto requisiteFieldValidatorRegexDto2 : unfocus) {
            arrayList2.add(new RequisiteFieldValidatorRegexEntity(new Regex(requisiteFieldValidatorRegexDto2.getRegex()), requisiteFieldValidatorRegexDto2.getHint()));
        }
        return new RequisiteFieldValidatorEntity(arrayList, arrayList2);
    }
}
