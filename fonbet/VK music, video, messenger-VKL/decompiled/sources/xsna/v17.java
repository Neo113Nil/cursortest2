package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.common.Good;
import com.vk.dto.fave.MarketFavable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.jpl0;
import xsna.oye;
import xsna.q630;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v17 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v17(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.d;
                String str2 = (String) this.e;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                w17.f(ne7.I(385), (androidx.compose.runtime.a) obj, str, str2, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                fs7.a((mtk0) this.d, (izs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((nye) this.d).h((oye.a) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                ((Integer) obj2).getClass();
                szj.a((qm00) this.d, (izs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                MarketFavable marketFavable = (MarketFavable) this.d;
                bw00 bw00Var = (bw00) this.e;
                Good good = (Good) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (((gmq) obj2).equals(marketFavable)) {
                    d9a d9aVar = bw00Var.d;
                    d9aVar.b(new c9a(d9aVar, good.b, booleanValue));
                }
                break;
            case 5:
                kk50 kk50Var = (kk50) this.d;
                ao50 ao50Var = (ao50) this.e;
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2004851925, intValue, -1, "com.vk.mvi.compose.MviComposeView.render.<anonymous> (MviComposeView.kt:26)");
                    }
                    kk50Var.b(ao50Var, izsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                lll0.a((jpl0.a.d) this.d, (gzs) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            default:
                m5i0 m5i0Var = (m5i0) this.d;
                final jai jaiVar = (jai) this.e;
                final jai jaiVar2 = (jai) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1186024825, intValue2, -1, "com.vk.core.compose.component.VkSegmentedControl.<anonymous>.<anonymous> (VkSegmentedControl.kt:136)");
                    }
                    final float f = m5i0Var.a;
                    q630 f2 = txj0.f(q630.a.a, 1.0f);
                    boolean n = aVar2.n(f);
                    Object x = aVar2.x();
                    if (n || x == a.C0011a.a) {
                        x = new wzs() { // from class: xsna.djv0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj3, Object obj4) {
                                Object obj5;
                                final ztm0 ztm0Var = (ztm0) obj3;
                                o6j o6jVar = (o6j) obj4;
                                float f3 = f;
                                final int r0 = ztm0Var.r0(f3);
                                int i = o6j.i(o6jVar.a) - (r0 * 2);
                                List<zo10> t1 = ztm0Var.t1(k5i0.Segment, jaiVar);
                                int size = t1.size();
                                final int i2 = i / size;
                                List<zo10> list = t1;
                                final ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((zo10) it.next()).N(o6j.b(i2, o6jVar.a, i2, 0, 0, 12)));
                                }
                                final ArrayList arrayList2 = new ArrayList(size);
                                for (int i3 = 0; i3 < size; i3++) {
                                    arrayList2.add(new j5i0((ztm0Var.j1(i2) * i3) + f3, ztm0Var.j1(i2)));
                                }
                                Iterator it2 = arrayList.iterator();
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (it2.hasNext()) {
                                        int i4 = ((tra0) next).c;
                                        do {
                                            Object next2 = it2.next();
                                            int i5 = ((tra0) next2).c;
                                            if (i4 < i5) {
                                                next = next2;
                                                i4 = i5;
                                            }
                                        } while (it2.hasNext());
                                    }
                                    obj5 = next;
                                } else {
                                    obj5 = null;
                                }
                                tra0 tra0Var = (tra0) obj5;
                                final int i6 = tra0Var != null ? tra0Var.c : 0;
                                int i7 = o6j.i(o6jVar.a);
                                final jai jaiVar3 = jaiVar2;
                                return ztm0Var.Q(i7, i6, jgp.b, new izs() { // from class: xsna.cjv0
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj6) {
                                        int i8;
                                        tra0.a aVar3 = (tra0.a) obj6;
                                        Iterator<T> it3 = ztm0.this.t1(k5i0.Indicator, new jai(1996122584, new d6(13, jaiVar3, arrayList2), true)).iterator();
                                        while (true) {
                                            boolean hasNext = it3.hasNext();
                                            i8 = i2;
                                            if (!hasNext) {
                                                break;
                                            }
                                            zo10 zo10Var = (zo10) it3.next();
                                            boolean z = i8 >= 0;
                                            int i9 = i6;
                                            if (!(z & (i9 >= 0))) {
                                                wzw.a("width and height must be >= 0");
                                            }
                                            tra0.a.x(aVar3, zo10Var.N(s6j.h(i8, i8, i9, i9)), 0, 0);
                                        }
                                        int i10 = 0;
                                        for (Object obj7 : arrayList) {
                                            int i11 = i10 + 1;
                                            if (i10 < 0) {
                                                e43.t();
                                                throw null;
                                            }
                                            tra0.a.x(aVar3, (tra0) obj7, (i10 * i8) + r0, 0);
                                            i10 = i11;
                                        }
                                        return s3q0.a;
                                    }
                                });
                            }
                        };
                        aVar2.R(x);
                    }
                    xtm0.a(f2, (wzs) x, aVar2, 6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ v17(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }
}
