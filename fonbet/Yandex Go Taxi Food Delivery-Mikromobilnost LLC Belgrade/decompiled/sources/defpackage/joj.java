package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final class joj extends a151 {
    public joj() {
        super("discount-showcase");
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        List list;
        boolean z;
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-413579441);
        final int i3 = 2;
        int i4 = (i & 6) == 0 ? (btsVar.k(n351Var) ? 4 : 2) | i : i;
        final int i5 = 0;
        final int i6 = 1;
        if (btsVar.V(i4 & 1, (i4 & 3) != 2)) {
            if (n351Var instanceof toj) {
                toj tojVar = (toj) n351Var;
                ArrayList arrayList = tojVar.c;
                if (arrayList.isEmpty()) {
                    v = btsVar.v();
                    if (v == null) {
                        return;
                    } else {
                        wlsVar = new wls(this) { // from class: ioj
                            public final /* synthetic */ joj b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i7 = i6;
                                zy11 zy11Var = zy11.a;
                                int i8 = i;
                                n351 n351Var2 = n351Var;
                                joj jojVar = this.b;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).getClass();
                                switch (i7) {
                                    case 0:
                                        jojVar.a(n351Var2, fidVar2, vng.O(i8 | 1));
                                        break;
                                    case 1:
                                        jojVar.a(n351Var2, fidVar2, vng.O(i8 | 1));
                                        break;
                                    default:
                                        jojVar.a(n351Var2, fidVar2, vng.O(i8 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                    }
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < arrayList.size(); i7 = i2) {
                        i2 = i7 + 1;
                        while (i2 < arrayList.size() && ((foj) arrayList.get(i7)).i == ((foj) arrayList.get(i2)).i) {
                            i2++;
                        }
                        arrayList2.add(a.v0(y6i0.n(i7, i2), arrayList));
                    }
                    sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c530.a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar2 = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar2);
                    }
                    qje.W(btsVar, d.d, d);
                    btsVar.e0(2012603112);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        List list2 = (List) it.next();
                        if (((foj) a.P(list2)).i || !tojVar.d) {
                            list = list2;
                            z = true;
                        } else {
                            list = list2;
                            z = false;
                        }
                        cza1.a(z, 0, null, null, wwg.S(888835355, true, new sn1(list, 7), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
                    }
                    btsVar.t(false);
                    btsVar.t(true);
                }
            } else {
                v = btsVar.v();
                if (v == null) {
                    return;
                } else {
                    wlsVar = new wls(this) { // from class: ioj
                        public final /* synthetic */ joj b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i72 = i5;
                            zy11 zy11Var = zy11.a;
                            int i8 = i;
                            n351 n351Var2 = n351Var;
                            joj jojVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i72) {
                                case 0:
                                    jojVar.a(n351Var2, fidVar2, vng.O(i8 | 1));
                                    break;
                                case 1:
                                    jojVar.a(n351Var2, fidVar2, vng.O(i8 | 1));
                                    break;
                                default:
                                    jojVar.a(n351Var2, fidVar2, vng.O(i8 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                }
            }
            v.d = wlsVar;
        }
        btsVar.Y();
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: ioj
                public final /* synthetic */ joj b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = i3;
                    zy11 zy11Var = zy11.a;
                    int i8 = i;
                    n351 n351Var2 = n351Var;
                    joj jojVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i72) {
                        case 0:
                            jojVar.a(n351Var2, fidVar2, vng.O(i8 | 1));
                            break;
                        case 1:
                            jojVar.a(n351Var2, fidVar2, vng.O(i8 | 1));
                            break;
                        default:
                            jojVar.a(n351Var2, fidVar2, vng.O(i8 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
