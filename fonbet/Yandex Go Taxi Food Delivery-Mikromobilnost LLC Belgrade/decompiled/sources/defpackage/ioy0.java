package defpackage;

import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class ioy0 implements wls {
    public final /* synthetic */ ety0 A;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;
    public final /* synthetic */ lzr x;
    public final /* synthetic */ long y;
    public final /* synthetic */ long z;

    public /* synthetic */ ioy0(String str, long j, long j2, lzr lzrVar, long j3, long j4, ety0 ety0Var, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.w = j2;
        this.x = lzrVar;
        this.y = j3;
        this.z = j4;
        this.A = ety0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                tyu0 tyu0Var = (tyu0) obj;
                n8e n8eVar = (n8e) obj2;
                String str = this.b;
                long j = this.c;
                long j2 = this.w;
                lzr lzrVar = this.x;
                long j3 = this.y;
                long j4 = this.z;
                ety0 ety0Var = this.A;
                x910 x910Var = (x910) a.P(tyu0Var.h0("pattern", new androidx.compose.runtime.internal.a(335789710, new ioy0(str, j, j2, lzrVar, j3, j4, ety0Var, 1), true)));
                int i2 = n8e.i(n8eVar.a);
                long j5 = n8eVar.a;
                int i3 = x910Var.l0(p8e.b(0, i2, 0, n8e.h(j5), 5)).a;
                List h0 = tyu0Var.h0("actual", new androidx.compose.runtime.internal.a(-2013138735, new ioy0(cvu0.u(i3 > 0 ? n8e.i(j5) / i3 : 0, str), j, j2, lzrVar, j3, j4, ety0Var, 2), true));
                ArrayList arrayList = new ArrayList(tcc.n(h0, 10));
                Iterator it = h0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((x910) it.next()).l0(j5));
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    ny61.p();
                    break;
                } else {
                    int i4 = ((o) it2.next()).a;
                    while (it2.hasNext()) {
                        int i5 = ((o) it2.next()).a;
                        if (i4 < i5) {
                            i4 = i5;
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    if (!it3.hasNext()) {
                        ny61.p();
                        break;
                    } else {
                        int i6 = ((o) it3.next()).b;
                        while (it3.hasNext()) {
                            int i7 = ((o) it3.next()).b;
                            if (i6 < i7) {
                                i6 = i7;
                            }
                        }
                        break;
                    }
                }
            case 1:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    wqy0.b(this.b, c530.a, this.c, this.w, null, this.x, null, this.y, null, null, this.z, 0, false, 1, 0, null, this.A, btsVar, 48, HProv.ALG_TYPE_SECURECHANNEL, 56064);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    wqy0.b(this.b, c530.a, this.c, this.w, null, this.x, null, this.y, null, null, this.z, 0, false, 1, 0, null, this.A, btsVar2, 48, HProv.ALG_TYPE_SECURECHANNEL, 56064);
                    break;
                }
        }
        return zy11Var;
    }
}
