package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.random.Random;
import kotlin.random.XorWowRandom;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a;

/* loaded from: classes5.dex */
public final class gon extends o15 {
    public final f4l0 b;
    public final zqb0 c;
    public final u1n d;
    public final a e;
    public final p070 f;

    public gon(f4l0 f4l0Var, zqb0 zqb0Var, u1n u1nVar, a aVar, p070 p070Var) {
        super("editable-route-widgets");
        this.b = f4l0Var;
        this.c = zqb0Var;
        this.d = u1nVar;
        this.e = aVar;
        this.f = p070Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        final int i3;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-920951630);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        final int i4 = 0;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            i3 = 1;
            btsVar.Y();
        } else {
            if (!(n351Var instanceof con)) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new wls(this) { // from class: don
                        public final /* synthetic */ gon b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            gon gonVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    gonVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    gonVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            con conVar = (con) n351Var;
            boolean z2 = conVar.d;
            Object obj = conVar.e;
            if (obj == null) {
                obj = new uu0(0);
            }
            btsVar.e0(-271241623);
            List list = conVar.c;
            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            int i5 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                Object obj2 = did.a;
                if (hasNext) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    sls slsVar = null;
                    if (i5 < 0) {
                        scc.m();
                        throw null;
                    }
                    f8l0 f8l0Var = (f8l0) next;
                    arrayList.add(f8l0Var.a);
                    float H = ((fwi) btsVar.m(j.h)).H(((Context) btsVar.m(AndroidCompositionLocals_androidKt.b)).getResources().getDisplayMetrics().widthPixels);
                    float f = f8l0Var.b;
                    int i7 = i2;
                    Iterator it2 = it;
                    int b = new XorWowRandom(i5, i5 >> 31).b();
                    boolean z3 = !z2 && f8l0Var.d;
                    Object obj3 = conVar.f;
                    if (obj3 == null) {
                        btsVar.e0(1046217358);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1046217359);
                        if (z2 || !f8l0Var.e) {
                            z = false;
                            btsVar.e0(-1805085924);
                            btsVar.t(false);
                        } else {
                            btsVar.e0(-1805222262);
                            boolean e = btsVar.e(this) | btsVar.k(obj3);
                            Object Q = btsVar.Q();
                            Object obj4 = Q;
                            if (e || Q == obj2) {
                                Object ymjVar = new ymj(22, this, obj3);
                                btsVar.o0(ymjVar);
                                obj4 = ymjVar;
                            }
                            slsVar = (sls) obj4;
                            z = false;
                            btsVar.t(false);
                        }
                        btsVar.t(z);
                    }
                    sls slsVar2 = slsVar;
                    androidx.compose.runtime.internal.a S = wwg.S(249876500, true, new fon(f8l0Var, n351Var, H, this), btsVar);
                    b7d.a.getClass();
                    androidx.compose.runtime.internal.a aVar = b7d.b;
                    y7m y7mVar = new y7m(f);
                    y7m y7mVar2 = new y7m(0.5f);
                    boolean e2 = ((i7 & 14) == 4) | btsVar.e(f8l0Var);
                    Object Q2 = btsVar.Q();
                    if (e2 || Q2 == obj2) {
                        Q2 = new t8j(25, n351Var, f8l0Var);
                        btsVar.o0(Q2);
                    }
                    arrayList2.add(new z8m(S, aVar, y7mVar, y7mVar2, b, (tls) Q2, z3, slsVar2));
                    i5 = i6;
                    i2 = i7;
                    it = it2;
                    i4 = 0;
                } else {
                    int i8 = i2;
                    boolean z4 = i4;
                    btsVar.t(z4);
                    Random.a.getClass();
                    Integer valueOf = Integer.valueOf(Random.b.b());
                    boolean e3 = btsVar.e(arrayList) | btsVar.e(this) | btsVar.e(obj);
                    Object Q3 = btsVar.Q();
                    Object obj5 = Q3;
                    if (e3 || Q3 == obj2) {
                        Object gxmVar = new gxm(3, arrayList, this, obj);
                        btsVar.o0(gxmVar);
                        obj5 = gxmVar;
                    }
                    wls wlsVar = (wls) obj5;
                    boolean z5 = (btsVar.e(arrayList) ? 1 : 0) | (btsVar.e(this) ? 1 : 0) | (btsVar.e(obj) ? 1 : 0);
                    boolean z6 = z4;
                    if ((i8 & 14) == 4) {
                        z6 = true;
                    }
                    boolean z7 = z6 | z5;
                    Object Q4 = btsVar.Q();
                    if (z7 != 0 || Q4 == obj2) {
                        Object lc0Var = new lc0(arrayList, this, obj, n351Var, 18);
                        btsVar.o0(lc0Var);
                        Q4 = lc0Var;
                    }
                    i3 = 1;
                    ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.a.a(null, valueOf, arrayList2, false, wlsVar, (tls) Q4, null, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 193);
                }
            }
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls(this) { // from class: don
                public final /* synthetic */ gon b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj6, Object obj22) {
                    int i52 = i3;
                    zy11 zy11Var = zy11.a;
                    int i62 = i;
                    n351 n351Var2 = n351Var;
                    gon gonVar = this.b;
                    fid fidVar2 = (fid) obj6;
                    ((Integer) obj22).getClass();
                    switch (i52) {
                        case 0:
                            gonVar.e(n351Var2, fidVar2, vng.O(i62 | 1));
                            break;
                        default:
                            gonVar.e(n351Var2, fidVar2, vng.O(i62 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }
}
