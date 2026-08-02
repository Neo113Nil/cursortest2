package xsna;

import java.util.ArrayList;
import kotlin.Pair;
import xsna.thy;
import xsna.wlp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class l7e0 implements yzs {
    public final /* synthetic */ m7e0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ l7e0(m7e0 m7e0Var, int i) {
        this.b = m7e0Var;
        this.c = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wlp0.b bVar;
        androidx.compose.runtime.a aVar;
        thy thyVar;
        char c;
        iq2 iq2Var;
        wlp0.b bVar2 = (wlp0.b) obj;
        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
        int intValue = ((Integer) obj3).intValue();
        aVar2.K(431650961);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(431650961, intValue, -1, "androidx.compose.animation.graphics.vector.PropertyValues.createAnimationSpec.<anonymous> (Animator.kt:154)");
        }
        ArrayList arrayList = this.b.a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            sxo0 sxo0Var = (sxo0) arrayList.get(i);
            Integer valueOf = Integer.valueOf(sxo0Var.a);
            int i2 = sxo0Var.b;
            Object obj4 = sxo0Var.e;
            if (obj4 instanceof r7e0) {
                r7e0 r7e0Var = (r7e0) obj4;
                r7e0Var.getClass();
                thy.b bVar3 = new thy.b();
                bVar3.a = i2;
                ArrayList arrayList3 = r7e0Var.b;
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    ohy ohyVar = (ohy) arrayList3.get(i3);
                    bVar3.a((int) (ohyVar.a * i2), ohyVar.b).b = ohyVar.c;
                    i3++;
                    bVar2 = bVar2;
                    aVar2 = aVar2;
                }
                bVar = bVar2;
                aVar = aVar2;
                s3q0 s3q0Var = s3q0.a;
                thyVar = new thy(bVar3);
            } else {
                bVar = bVar2;
                aVar = aVar2;
                if (!(obj4 instanceof q7e0)) {
                    throw new RuntimeException("Unexpected value type: " + obj4);
                }
                q7e0 q7e0Var = (q7e0) obj4;
                q7e0Var.getClass();
                thy.b bVar4 = new thy.b();
                bVar4.a = i2;
                ArrayList arrayList4 = q7e0Var.b;
                int size3 = arrayList4.size();
                int i4 = 0;
                while (i4 < size3) {
                    ohy ohyVar2 = (ohy) arrayList4.get(i4);
                    bVar4.a((int) (i2 * ohyVar2.a), ohyVar2.b).b = ohyVar2.c;
                    i4++;
                    arrayList4 = arrayList4;
                }
                s3q0 s3q0Var2 = s3q0.a;
                thyVar = new thy(bVar4);
            }
            thy thyVar2 = thyVar;
            int i5 = sxo0Var.c;
            if (i5 == 0) {
                c = 65535;
                iq2Var = thyVar2;
            } else {
                c = 65535;
                iq2Var = jq2.b(i5 == -1 ? Integer.MAX_VALUE : i5 + 1, thyVar2, sxo0Var.d, 0L, 8);
            }
            arrayList2.add(new Pair(valueOf, iq2Var));
            i++;
            bVar2 = bVar;
            aVar2 = aVar;
        }
        wlp0.b bVar5 = bVar2;
        androidx.compose.runtime.a aVar3 = aVar2;
        phr cagVar = new cag(arrayList2);
        if (!((Boolean) bVar5.f()).booleanValue()) {
            cagVar = new ggg0(cagVar, this.c);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar3.j();
        return cagVar;
    }
}
