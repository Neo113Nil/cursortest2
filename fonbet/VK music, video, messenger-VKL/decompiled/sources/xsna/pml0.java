package xsna;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.storefront.impl.community.presentation.model.LoadingState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.oml0;
import xsna.wfq0;

/* compiled from: StorefrontReducer.kt */
/* loaded from: classes18.dex */
public final class pml0 implements bm50<apl0, oml0> {
    public final ull0 a;

    public pml0(ull0 ull0Var) {
        this.a = ull0Var;
    }

    @Override // xsna.bm50
    public final apl0 a(apl0 apl0Var, oml0 oml0Var) {
        char c;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        UserId userId;
        apl0 apl0Var2;
        pju pjuVar;
        apl0 apl0Var3 = apl0Var;
        oml0 oml0Var2 = oml0Var;
        pju pjuVar2 = apl0Var3.b;
        z7p0 z7p0Var = apl0Var3.e;
        t8u t8uVar = apl0Var3.f;
        if (oml0Var2 instanceof oml0.n) {
            return apl0.a(apl0Var3, null, null, null, null, null, null, LoadingState.Full, null, null, 14335);
        }
        if (oml0Var2 instanceof oml0.k.a) {
            return apl0.a(apl0Var3, null, null, null, null, null, null, LoadingState.Refresh, null, null, 14335);
        }
        t8u t8uVar2 = null;
        z7p0 z7p0Var2 = null;
        t8u t8uVar3 = null;
        t8u t8uVar4 = null;
        t8u t8uVar5 = null;
        if (oml0Var2 instanceof oml0.k.b) {
            if (pjuVar2 != null) {
                apl0Var2 = apl0Var3;
                pjuVar = new pju(pjuVar2.a, pjuVar2.b, pjuVar2.c, pjuVar2.d, pjuVar2.e, pjuVar2.f, pjuVar2.g, pjuVar2.h, pjuVar2.i, pjuVar2.j, pjuVar2.k, pjuVar2.l, pjuVar2.m, pjuVar2.n, pjuVar2.o, pjuVar2.p, pjuVar2.q, pjuVar2.r, pjuVar2.s, ((oml0.k.b) oml0Var2).a, pjuVar2.u);
            } else {
                apl0Var2 = apl0Var3;
                pjuVar = null;
            }
            return apl0.a(apl0Var2, pjuVar, null, null, null, null, null, null, null, null, 16382);
        }
        if (oml0Var2 instanceof oml0.h) {
            return apl0.a(apl0Var3, null, null, null, null, null, ((oml0.h) oml0Var2).a, null, null, null, 15359);
        }
        if (oml0Var2 instanceof oml0.l) {
            return ((oml0.l) oml0Var2).a;
        }
        int i = 3;
        int i2 = 0;
        if (oml0Var2 instanceof oml0.f) {
            ay00 ay00Var = ((oml0.f) oml0Var2).a;
            UserId q = ay00Var.q();
            if (!epx.f(q != null ? fkq0.a(q) : null, (pjuVar2 == null || (userId = pjuVar2.i) == null) ? null : fkq0.a(userId))) {
                return apl0Var3;
            }
            if (ay00Var instanceof gu00) {
                return apl0.a(apl0Var3, null, z7p0Var != null ? z7p0.a(z7p0Var, 0, z7p0Var.c + 1, 3) : null, null, null, null, null, null, null, null, 16375);
            }
            if (ay00Var instanceof iu00) {
                return apl0.a(apl0Var3, null, z7p0Var != null ? z7p0.a(z7p0Var, 0, z7p0Var.c - ((iu00) ay00Var).b, 3) : null, null, null, null, null, null, null, null, 16375);
            }
            if (ay00Var instanceof hu00) {
                hu00 hu00Var = (hu00) ay00Var;
                return apl0.a(apl0Var3, null, z7p0Var != null ? z7p0.a(z7p0Var, 0, z7p0Var.c - (hu00Var.b - hu00Var.c), 3) : null, null, null, null, null, null, null, null, 16375);
            }
            if (ay00Var instanceof ju00) {
                return apl0.a(apl0Var3, null, z7p0Var != null ? z7p0.a(z7p0Var, 0, 0, 3) : null, null, null, null, null, null, null, null, 16375);
            }
            if (ay00Var instanceof fu00) {
                return apl0.a(apl0Var3, null, z7p0Var != null ? z7p0.a(z7p0Var, 0, 0, 3) : null, null, null, null, null, null, null, null, 16375);
            }
            if (!(ay00Var instanceof ku00)) {
                return apl0Var3;
            }
            int i3 = (z7p0Var != null ? z7p0Var.c : 0) - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            return apl0.a(apl0Var3, null, z7p0Var != null ? z7p0.a(z7p0Var, 0, i3, 3) : null, null, null, null, null, null, null, null, 16375);
        }
        int i4 = 6;
        if (oml0Var2 instanceof oml0.a) {
            t8u a = t8uVar != null ? t8u.a(t8uVar, ((oml0.a) oml0Var2).b, 0, 6) : null;
            if (z7p0Var != null) {
                Integer num = ((oml0.a) oml0Var2).a;
                z7p0Var2 = z7p0.a(z7p0Var, num != null ? num.intValue() : 0, 0, 5);
            }
            return apl0.a(apl0Var3, null, z7p0Var2, a, null, null, null, null, null, null, 16359);
        }
        if (oml0Var2 instanceof oml0.b) {
            return apl0.a(apl0Var3, null, null, t8uVar != null ? t8u.a(t8uVar, ((oml0.b) oml0Var2).a, 0, 6) : null, null, null, null, null, null, null, 16367);
        }
        if (oml0Var2 instanceof oml0.c) {
            return apl0.a(apl0Var3, null, z7p0Var != null ? z7p0.a(z7p0Var, ((oml0.c) oml0Var2).a, 0, 5) : null, null, null, null, null, null, null, null, 16375);
        }
        if (oml0Var2 instanceof oml0.j) {
            if (t8uVar != null) {
                oml0.j jVar = (oml0.j) oml0Var2;
                t8uVar3 = t8u.a(t8uVar, jVar.a, jVar.b, 2);
            }
            return apl0.a(apl0Var3, null, null, t8uVar3, null, null, null, LoadingState.None, null, null, 14319);
        }
        if (oml0Var2 instanceof oml0.o) {
            return apl0.a(apl0Var3, null, null, null, null, null, null, LoadingState.Page, null, null, 14335);
        }
        if (oml0Var2 instanceof oml0.i) {
            return apl0.a(apl0Var3, null, null, null, null, null, null, LoadingState.None, null, null, 14335);
        }
        if (oml0Var2 instanceof oml0.p) {
            oml0.p pVar = (oml0.p) oml0Var2;
            return apl0.a(apl0Var3, null, null, null, pVar.a, pVar.b, null, null, null, null, 16191);
        }
        if (oml0Var2 instanceof oml0.m) {
            oml0.m mVar = (oml0.m) oml0Var2;
            return apl0.a(apl0Var3, null, null, null, null, null, null, null, null, new a7k0(mVar.a, mVar.b), 8191);
        }
        if (oml0Var2 instanceof oml0.g) {
            return apl0.a(apl0Var3, null, null, null, null, null, null, null, null, null, 8191);
        }
        boolean z = oml0Var2 instanceof oml0.q;
        ull0 ull0Var = this.a;
        int i5 = 10;
        if (z) {
            if (t8uVar != null) {
                List<b5u> list = t8uVar.a;
                ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
                for (b5u b5uVar : list) {
                    Good good = b5uVar.a;
                    oml0.q qVar = (oml0.q) oml0Var2;
                    t8u t8uVar6 = t8uVar;
                    if (good.b == qVar.a) {
                        Parcel obtain = Parcel.obtain();
                        try {
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                            Serializer.g gVar = new Serializer.g(obtain);
                            gVar.i0(good);
                            obtain.setDataPosition(i2);
                            Serializer.StreamParcelable G = gVar.G(Good.class.getClassLoader());
                            obtain.recycle();
                            Good good2 = (Good) G;
                            List<CallProducerButton> list2 = b5uVar.a.n0;
                            if (list2 != null) {
                                List<CallProducerButton> list3 = list2;
                                arrayList3 = new ArrayList(c5g.u(list3, 10));
                                Iterator<T> it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList3.add(CallProducerButton.a((CallProducerButton) it.next(), qVar.b.h(), null, 4094));
                                }
                            } else {
                                arrayList3 = null;
                            }
                            good2.n0 = arrayList3;
                            kc10 a2 = ull0Var.a();
                            ec10 ec10Var = new ec10(good2);
                            boolean z2 = b5uVar.c.h;
                            wfq0.e eVar = wfq0.e.a;
                            a2.getClass();
                            b5uVar = b5u.a(b5uVar, good2, kc10.a(ec10Var, z2, eVar), null, 10);
                        } finally {
                        }
                    }
                    arrayList4.add(b5uVar);
                    t8uVar = t8uVar6;
                    i2 = 0;
                    i4 = 6;
                }
                t8uVar4 = t8u.a(t8uVar, arrayList4, i2, i4);
            }
            return apl0.a(apl0Var3, null, null, t8uVar4, null, null, null, null, null, null, 16367);
        }
        if (oml0Var2 instanceof oml0.d) {
            oml0.d dVar = (oml0.d) oml0Var2;
            if (t8uVar != null) {
                List<b5u> list4 = t8uVar.a;
                ArrayList arrayList5 = new ArrayList(c5g.u(list4, 10));
                for (b5u b5uVar2 : list4) {
                    Good good3 = b5uVar2.a;
                    UserId a3 = fkq0.a(good3.c);
                    UserId userId2 = dVar.a;
                    if (a3.equals(userId2 != null ? fkq0.a(userId2) : null)) {
                        Parcel obtain2 = Parcel.obtain();
                        try {
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                            Serializer.g gVar2 = new Serializer.g(obtain2);
                            gVar2.i0(good3);
                            obtain2.setDataPosition(0);
                            Serializer.StreamParcelable G2 = gVar2.G(Good.class.getClassLoader());
                            obtain2.recycle();
                            Good good4 = (Good) G2;
                            List<CallProducerButton> list5 = good3.n0;
                            if (list5 != null) {
                                List<CallProducerButton> list6 = list5;
                                arrayList2 = new ArrayList(c5g.u(list6, i5));
                                for (CallProducerButton callProducerButton : list6) {
                                    if (callProducerButton.b == 3) {
                                        callProducerButton = CallProducerButton.a(callProducerButton, 4, null, 4094);
                                    }
                                    arrayList2.add(callProducerButton);
                                }
                            } else {
                                arrayList2 = null;
                            }
                            good4.n0 = arrayList2;
                            kc10 a4 = ull0Var.a();
                            ec10 ec10Var2 = new ec10(good4);
                            boolean z3 = b5uVar2.c.h;
                            wfq0.e eVar2 = wfq0.e.a;
                            a4.getClass();
                            b5uVar2 = b5u.a(b5uVar2, good4, kc10.a(ec10Var2, z3, eVar2), null, 10);
                        } finally {
                        }
                    }
                    arrayList5.add(b5uVar2);
                    i5 = 10;
                }
                t8uVar5 = t8u.a(t8uVar, arrayList5, 0, 6);
            }
            return apl0.a(apl0Var3, null, null, t8uVar5, null, null, null, null, null, null, 16367);
        }
        if (!(oml0Var2 instanceof oml0.e)) {
            return apl0Var3;
        }
        oml0.e eVar3 = (oml0.e) oml0Var2;
        if (t8uVar != null) {
            List<b5u> list7 = t8uVar.a;
            ArrayList arrayList6 = new ArrayList(c5g.u(list7, 10));
            for (b5u b5uVar3 : list7) {
                Good good5 = b5uVar3.a;
                ull0 ull0Var2 = ull0Var;
                boolean z4 = good5.b == eVar3.b;
                boolean z5 = good5.x == 1;
                if (z4 && z5) {
                    Parcel obtain3 = Parcel.obtain();
                    try {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                        Serializer.g gVar3 = new Serializer.g(obtain3);
                        gVar3.i0(good5);
                        obtain3.setDataPosition(0);
                        Serializer.StreamParcelable G3 = gVar3.G(Good.class.getClassLoader());
                        obtain3.recycle();
                        Good good6 = (Good) G3;
                        List<CallProducerButton> list8 = b5uVar3.a.n0;
                        if (list8 != null) {
                            List<CallProducerButton> list9 = list8;
                            arrayList = new ArrayList(c5g.u(list9, 10));
                            for (CallProducerButton callProducerButton2 : list9) {
                                if (callProducerButton2.b == i) {
                                    callProducerButton2 = CallProducerButton.a(callProducerButton2, 4, null, 4094);
                                }
                                arrayList.add(callProducerButton2);
                                i = 3;
                            }
                        } else {
                            arrayList = null;
                        }
                        c = 4;
                        good6.n0 = arrayList;
                        kc10 a5 = ull0Var2.a();
                        ec10 ec10Var3 = new ec10(good6);
                        boolean z6 = b5uVar3.c.h;
                        wfq0.e eVar4 = wfq0.e.a;
                        a5.getClass();
                        b5uVar3 = b5u.a(b5uVar3, good6, kc10.a(ec10Var3, z6, eVar4), null, 10);
                    } finally {
                    }
                } else {
                    c = 4;
                }
                arrayList6.add(b5uVar3);
                ull0Var = ull0Var2;
                i = 3;
            }
            t8uVar2 = t8u.a(t8uVar, arrayList6, 0, 6);
        }
        return apl0.a(apl0Var3, null, null, t8uVar2, null, null, null, null, null, null, 16367);
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(oml0 oml0Var) {
        return true;
    }
}
