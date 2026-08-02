package defpackage;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.a;
import defpackage.d8;
import defpackage.eyr;
import defpackage.gyr;
import defpackage.hb3;
import defpackage.ib3;
import defpackage.iyr;
import defpackage.jl40;
import defpackage.jyr;
import defpackage.kwc0;
import defpackage.kyr;
import defpackage.lyy;
import defpackage.lzr;
import defpackage.np11;
import defpackage.ny61;
import defpackage.pp11;
import defpackage.qp11;
import defpackage.qys;
import defpackage.scc;
import defpackage.ssa1;
import defpackage.tje;
import defpackage.tls;
import defpackage.xbh;
import defpackage.yci0;
import defpackage.yxr;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes.dex */
public final class gyr implements dyr {
    public final a a;
    public final o92 b;
    public final op11 c;
    public final jyr d;
    public final kvc0 e;
    public final d8 f;

    public gyr(a aVar, o92 o92Var) {
        op11 op11Var = hyr.a;
        jyr jyrVar = new jyr(hyr.b, 2);
        kvc0 kvc0Var = new kvc0();
        this.a = aVar;
        this.b = o92Var;
        this.c = op11Var;
        this.d = jyrVar;
        this.e = kvc0Var;
        this.f = new d8(25, this);
    }

    public final rp11 a(final np11 np11Var) {
        op11 op11Var = this.c;
        tls tlsVar = new tls() { // from class: androidx.compose.ui.text.font.d
            /* JADX WARN: Removed duplicated region for block: B:15:0x041d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x041e  */
            @Override // defpackage.tls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                Pair pair;
                Object pp11Var;
                Object invoke;
                hb3 hb3Var;
                Object failure;
                List list;
                ArrayList arrayList;
                Object obj2;
                Typeface a;
                qp11 qp11Var;
                gyr gyrVar = gyr.this;
                np11 np11Var2 = np11Var;
                tls tlsVar2 = (tls) obj;
                jyr jyrVar = gyrVar.d;
                a aVar = gyrVar.a;
                d8 d8Var = gyrVar.f;
                jyrVar.getClass();
                eyr eyrVar = np11Var2.a;
                if (eyrVar instanceof iyr) {
                    kyr kyrVar = jyr.c;
                    List list2 = ((iyr) eyrVar).y;
                    lzr lzrVar = np11Var2.b;
                    int i = np11Var2.c;
                    kyrVar.getClass();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    List list3 = list2;
                    int size = list3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Object obj3 = list2.get(i2);
                        yxr yxrVar = (yxr) obj3;
                        if (jl40.l(yxrVar.getWeight(), lzrVar) && yxrVar.b() == i) {
                            arrayList2.add(obj3);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        int size2 = list3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            Object obj4 = list2.get(i3);
                            if (((yxr) obj4).b() == i) {
                                arrayList3.add(obj4);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            list2 = arrayList3;
                        }
                        List list4 = list2;
                        int compareTo = lzrVar.compareTo(lzr.b);
                        int i4 = lzrVar.a;
                        if (compareTo < 0) {
                            List list5 = list4;
                            int size3 = list5.size();
                            int i5 = 0;
                            lzr lzrVar2 = null;
                            lzr lzrVar3 = null;
                            while (true) {
                                if (i5 >= size3) {
                                    break;
                                }
                                lzr weight = ((yxr) list4.get(i5)).getWeight();
                                int i6 = weight.a;
                                if (jl40.q(i6, i4) >= 0) {
                                    if (jl40.q(i6, i4) <= 0) {
                                        lzrVar2 = weight;
                                        lzrVar3 = lzrVar2;
                                        break;
                                    }
                                    if (lzrVar3 == null || jl40.q(i6, lzrVar3.a) < 0) {
                                        lzrVar3 = weight;
                                    }
                                } else if (lzrVar2 == null || jl40.q(i6, lzrVar2.a) > 0) {
                                    lzrVar2 = weight;
                                }
                                i5++;
                            }
                            if (lzrVar2 == null) {
                                lzrVar2 = lzrVar3;
                            }
                            arrayList = new ArrayList(list4.size());
                            int size4 = list5.size();
                            for (int i7 = 0; i7 < size4; i7++) {
                                Object obj5 = list4.get(i7);
                                if (jl40.l(((yxr) obj5).getWeight(), lzrVar2)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            lzr lzrVar4 = lzr.c;
                            if (lzrVar.compareTo(lzrVar4) > 0) {
                                List list6 = list4;
                                int size5 = list6.size();
                                int i8 = 0;
                                lzr lzrVar5 = null;
                                lzr lzrVar6 = null;
                                while (true) {
                                    if (i8 >= size5) {
                                        break;
                                    }
                                    lzr weight2 = ((yxr) list4.get(i8)).getWeight();
                                    int i9 = weight2.a;
                                    if (jl40.q(i9, i4) >= 0) {
                                        if (jl40.q(i9, i4) <= 0) {
                                            lzrVar5 = weight2;
                                            lzrVar6 = lzrVar5;
                                            break;
                                        }
                                        if (lzrVar6 == null || jl40.q(i9, lzrVar6.a) < 0) {
                                            lzrVar6 = weight2;
                                        }
                                    } else if (lzrVar5 == null || jl40.q(i9, lzrVar5.a) > 0) {
                                        lzrVar5 = weight2;
                                    }
                                    i8++;
                                }
                                if (lzrVar6 != null) {
                                    lzrVar5 = lzrVar6;
                                }
                                arrayList = new ArrayList(list4.size());
                                int size6 = list6.size();
                                for (int i10 = 0; i10 < size6; i10++) {
                                    Object obj6 = list4.get(i10);
                                    if (jl40.l(((yxr) obj6).getWeight(), lzrVar5)) {
                                        arrayList.add(obj6);
                                    }
                                }
                            } else {
                                List list7 = list4;
                                int size7 = list7.size();
                                int i11 = 0;
                                lzr lzrVar7 = null;
                                lzr lzrVar8 = null;
                                while (true) {
                                    if (i11 >= size7) {
                                        list = list7;
                                        break;
                                    }
                                    lzr weight3 = ((yxr) list4.get(i11)).getWeight();
                                    list = list7;
                                    if (jl40.q(weight3.a, lzrVar4.a) <= 0) {
                                        int i12 = weight3.a;
                                        if (jl40.q(i12, i4) >= 0) {
                                            if (jl40.q(i12, i4) <= 0) {
                                                lzrVar7 = weight3;
                                                lzrVar8 = lzrVar7;
                                                break;
                                            }
                                            if (lzrVar8 == null || jl40.q(i12, lzrVar8.a) < 0) {
                                                lzrVar8 = weight3;
                                            }
                                        } else if (lzrVar7 == null || jl40.q(i12, lzrVar7.a) > 0) {
                                            lzrVar7 = weight3;
                                        }
                                    }
                                    i11++;
                                    list7 = list;
                                }
                                if (lzrVar8 != null) {
                                    lzrVar7 = lzrVar8;
                                }
                                arrayList2 = new ArrayList(list4.size());
                                int size8 = list.size();
                                for (int i13 = 0; i13 < size8; i13++) {
                                    Object obj7 = list4.get(i13);
                                    if (jl40.l(((yxr) obj7).getWeight(), lzrVar7)) {
                                        arrayList2.add(obj7);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    lzr lzrVar9 = lzr.c;
                                    int size9 = list.size();
                                    int i14 = 0;
                                    lzr lzrVar10 = null;
                                    lzr lzrVar11 = null;
                                    while (true) {
                                        if (i14 >= size9) {
                                            break;
                                        }
                                        lzr weight4 = ((yxr) list4.get(i14)).getWeight();
                                        if (lzrVar9 == null || jl40.q(weight4.a, lzrVar9.a) >= 0) {
                                            int i15 = weight4.a;
                                            if (jl40.q(i15, i4) >= 0) {
                                                if (jl40.q(i15, i4) <= 0) {
                                                    lzrVar10 = weight4;
                                                    lzrVar11 = lzrVar10;
                                                    break;
                                                }
                                                if (lzrVar11 == null || jl40.q(i15, lzrVar11.a) < 0) {
                                                    lzrVar11 = weight4;
                                                }
                                            } else if (lzrVar10 == null || jl40.q(i15, lzrVar10.a) > 0) {
                                                lzrVar10 = weight4;
                                            }
                                        }
                                        i14++;
                                    }
                                    if (lzrVar11 != null) {
                                        lzrVar10 = lzrVar11;
                                    }
                                    arrayList2 = new ArrayList(list4.size());
                                    int size10 = list.size();
                                    for (int i16 = 0; i16 < size10; i16++) {
                                        Object obj8 = list4.get(i16);
                                        if (jl40.l(((yxr) obj8).getWeight(), lzrVar10)) {
                                            arrayList2.add(obj8);
                                        }
                                    }
                                }
                            }
                        }
                        arrayList2 = arrayList;
                    }
                    c cVar = jyrVar.a;
                    int size11 = arrayList2.size();
                    int i17 = 0;
                    ArrayList arrayList4 = null;
                    while (true) {
                        if (i17 >= size11) {
                            pair = new Pair(arrayList4, d8Var.invoke(np11Var2));
                            break;
                        }
                        yxr yxrVar2 = (yxr) arrayList2.get(i17);
                        int a2 = yxrVar2.a();
                        if (a2 == 0) {
                            synchronized (cVar.c) {
                                try {
                                    aVar.getClass();
                                    ib3 ib3Var = new ib3(yxrVar2);
                                    hb3 hb3Var2 = (hb3) cVar.a.c(ib3Var);
                                    if (hb3Var2 == null) {
                                        hb3Var2 = (hb3) cVar.b.d(ib3Var);
                                    }
                                    if (hb3Var2 != null) {
                                        invoke = hb3Var2.a;
                                    } else {
                                        try {
                                            invoke = aVar.b(yxrVar2);
                                        } catch (Exception unused) {
                                            invoke = d8Var.invoke(np11Var2);
                                        }
                                        c.a(cVar, yxrVar2, aVar, invoke);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (invoke == null) {
                                invoke = d8Var.invoke(np11Var2);
                            }
                            pair = new Pair(arrayList4, ssa1.c(np11Var2.d, invoke, yxrVar2, np11Var2.b, np11Var2.c));
                        } else if (a2 == 1) {
                            synchronized (cVar.c) {
                                try {
                                    aVar.getClass();
                                    ib3 ib3Var2 = new ib3(yxrVar2);
                                    hb3 hb3Var3 = (hb3) cVar.a.c(ib3Var2);
                                    if (hb3Var3 == null) {
                                        hb3Var3 = (hb3) cVar.b.d(ib3Var2);
                                    }
                                    if (hb3Var3 != null) {
                                        failure = hb3Var3.a;
                                    } else {
                                        try {
                                            failure = aVar.b(yxrVar2);
                                        } catch (Throwable th2) {
                                            failure = new Result.Failure(th2);
                                        }
                                        if (failure instanceof Result.Failure) {
                                            failure = null;
                                        }
                                        c.a(cVar, yxrVar2, aVar, failure);
                                    }
                                } finally {
                                }
                            }
                            if (failure != null) {
                                pair = new Pair(arrayList4, ssa1.c(np11Var2.d, failure, yxrVar2, np11Var2.b, np11Var2.c));
                                break;
                            }
                            i17++;
                        } else {
                            if (a2 != 2) {
                                yci0.k(yxrVar2, "Unknown font type ");
                                return null;
                            }
                            cVar.getClass();
                            aVar.getClass();
                            ib3 ib3Var3 = new ib3(yxrVar2);
                            synchronized (cVar.c) {
                                hb3Var = (hb3) cVar.a.c(ib3Var3);
                                if (hb3Var == null) {
                                    hb3Var = (hb3) cVar.b.d(ib3Var3);
                                }
                            }
                            if (hb3Var != null) {
                                Object obj9 = hb3Var.a;
                                if (obj9 != null) {
                                    pair = new Pair(arrayList4, ssa1.c(np11Var2.d, obj9, yxrVar2, np11Var2.b, np11Var2.c));
                                    break;
                                }
                            } else if (arrayList4 == null) {
                                arrayList4 = scc.i(yxrVar2);
                            } else {
                                arrayList4.add(yxrVar2);
                            }
                            i17++;
                        }
                    }
                    List list8 = (List) pair.getFirst();
                    Object second = pair.getSecond();
                    if (list8 == null) {
                        pp11Var = new qp11(second, true);
                    } else {
                        b bVar = new b(list8, second, np11Var2, jyrVar.a, tlsVar2, aVar);
                        tje.N(jyrVar.b, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(bVar, null), 1);
                        pp11Var = new pp11(bVar);
                    }
                } else {
                    pp11Var = null;
                }
                if (pp11Var != null) {
                    return pp11Var;
                }
                kwc0 kwc0Var = gyrVar.e.a;
                eyr eyrVar2 = np11Var2.a;
                if (eyrVar2 == null || (eyrVar2 instanceof xbh)) {
                    lzr lzrVar12 = np11Var2.b;
                    int i18 = np11Var2.c;
                    kwc0Var.getClass();
                    obj2 = null;
                    a = kwc0.a(null, lzrVar12, i18);
                } else {
                    if (eyrVar2 instanceof qys) {
                        lzr lzrVar13 = np11Var2.b;
                        int i19 = np11Var2.c;
                        kwc0Var.getClass();
                        a = kwc0.a(((qys) eyrVar2).y, lzrVar13, i19);
                    } else {
                        if (!(eyrVar2 instanceof lyy)) {
                            qp11Var = null;
                            obj2 = null;
                            if (qp11Var == null) {
                                return qp11Var;
                            }
                            ny61.r("Could not load font");
                            return obj2;
                        }
                        a = (Typeface) ((lyy) eyrVar2).y.b;
                    }
                    obj2 = null;
                }
                qp11Var = new qp11(a, true);
                if (qp11Var == null) {
                }
            }
        };
        synchronized (op11Var.a) {
            rp11 rp11Var = (rp11) op11Var.b.c(np11Var);
            if (rp11Var != null) {
                if (rp11Var.c()) {
                    return rp11Var;
                }
            }
            try {
                rp11 rp11Var2 = (rp11) tlsVar.invoke(new dl01(17, op11Var, np11Var));
                synchronized (op11Var.a) {
                    if (op11Var.b.c(np11Var) == null && rp11Var2.c()) {
                        op11Var.b.d(np11Var, rp11Var2);
                    }
                }
                return rp11Var2;
            } catch (Exception e) {
                ny61.h("Could not load font", e);
                return null;
            }
        }
    }

    public final rp11 b(eyr eyrVar, lzr lzrVar, int i, int i2) {
        o92 o92Var = this.b;
        o92Var.getClass();
        int i3 = o92Var.a;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            lzrVar = new lzr(y6i0.d(lzrVar.a + i3, 1, 1000));
        }
        this.a.getClass();
        return a(new np11(eyrVar, lzrVar, i, i2));
    }
}
