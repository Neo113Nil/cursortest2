package androidx.compose.animation;

import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aa10;
import defpackage.bf2;
import defpackage.k6w;
import defpackage.scc;
import defpackage.tls;
import defpackage.x910;
import defpackage.yuw;
import defpackage.z910;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class b implements z910 {
    public final e a;

    public b(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.z910
    public final aa10 b(androidx.compose.ui.layout.k kVar, List list, long j) {
        o oVar;
        int i;
        o oVar2;
        final int i2;
        final int i3;
        int size = list.size();
        final o[] oVarArr = new o[size];
        List list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            oVar = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            x910 x910Var = (x910) list.get(i4);
            Object a = x910Var.a();
            bf2 bf2Var = a instanceof bf2 ? (bf2) a : null;
            if (bf2Var != null && ((Boolean) bf2Var.a.getValue()).booleanValue()) {
                o l0 = x910Var.l0(j);
                long j3 = (l0.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (l0.a << 32);
                oVarArr[i4] = l0;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            x910 x910Var2 = (x910) list.get(i5);
            if (oVarArr[i5] == null) {
                oVarArr[i5] = x910Var2.l0(j);
            }
        }
        if (kVar.d0()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                oVar2 = null;
            } else {
                oVar2 = oVarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = oVar2 != null ? oVar2.a : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            o oVar3 = oVarArr[i8];
                            int i9 = oVar3 != null ? oVar3.a : 0;
                            if (i7 < i9) {
                                oVar2 = oVar3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = oVar2 != null ? oVar2.a : 0;
        }
        if (kVar.d0()) {
            i3 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        } else {
            if (size != 0) {
                oVar = oVarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = oVar != null ? oVar.b : 0;
                    if (1 <= i10) {
                        while (true) {
                            o oVar4 = oVarArr[i];
                            int i12 = oVar4 != null ? oVar4.b : 0;
                            if (i11 < i12) {
                                oVar = oVar4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = oVar != null ? oVar.b : 0;
        }
        if (!kVar.d0()) {
            this.a.d.setValue(new k6w((i2 << 32) | (i3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        }
        return kVar.w(i2, i3, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a aVar = (o.a) obj;
                o[] oVarArr2 = oVarArr;
                b bVar = this;
                int i13 = i2;
                int i14 = i3;
                for (o oVar5 : oVarArr2) {
                    if (oVar5 != null) {
                        long a2 = bVar.a.b.a((oVar5.a << 32) | (oVar5.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (i13 << 32) | (i14 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), LayoutDirection.Ltr);
                        aVar.g(oVar5, (int) (a2 >> 32), (int) (a2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f);
                    }
                }
                return zy11.a;
            }
        });
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x910) list.get(0)).k0(i));
            int f = scc.f(list);
            int i2 = 1;
            if (1 <= f) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x910) list.get(i2)).k0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == f) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.z910
    public final int f(yuw yuwVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x910) list.get(0)).e0(i));
            int f = scc.f(list);
            int i2 = 1;
            if (1 <= f) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x910) list.get(i2)).e0(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == f) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.z910
    public final int g(yuw yuwVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x910) list.get(0)).y(i));
            int f = scc.f(list);
            int i2 = 1;
            if (1 <= f) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x910) list.get(i2)).y(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == f) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.z910
    public final int i(yuw yuwVar, List list, int i) {
        Integer valueOf;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((x910) list.get(0)).V(i));
            int f = scc.f(list);
            int i2 = 1;
            if (1 <= f) {
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((x910) list.get(i2)).V(i));
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i2 == f) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
