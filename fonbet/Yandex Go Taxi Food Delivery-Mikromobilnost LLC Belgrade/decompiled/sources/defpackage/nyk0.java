package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class nyk0 {
    public final List a;
    public final float b;
    public final float c;
    public final ListBuilder d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object[], jdf[]] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], jdf[]] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.builders.ListBuilder] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public nyk0(AbstractList abstractList, float f, float f2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        char c;
        char c2;
        ?? r16;
        jdf jdfVar;
        jdf jdfVar2;
        List list;
        this.a = abstractList;
        this.b = f;
        this.c = f2;
        ?? a = rcc.a();
        char c3 = 3;
        char c4 = 2;
        boolean z = true;
        if (abstractList.size() <= 0 || ((gkp) abstractList.get(0)).a.size() != 3) {
            arrayList = null;
            arrayList2 = null;
        } else {
            Pair d = ((jdf) ((gkp) abstractList.get(0)).a.get(1)).d(0.5f);
            jdf jdfVar3 = (jdf) d.getFirst();
            jdf jdfVar4 = (jdf) d.getSecond();
            arrayList2 = scc.i(new jdf[]{((gkp) abstractList.get(0)).a.get(0), jdfVar3});
            arrayList = scc.i(new jdf[]{jdfVar4, ((gkp) abstractList.get(0)).a.get(2)});
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            jdfVar = null;
            jdfVar2 = null;
            while (true) {
                if (i == 0 && arrayList != null) {
                    list = arrayList;
                } else if (i != this.a.size()) {
                    list = ((gkp) this.a.get(i)).a;
                } else {
                    if (arrayList2 == null) {
                        c = c3;
                        c2 = c4;
                        r16 = z;
                        break;
                    }
                    list = arrayList2;
                }
                int size2 = list.size();
                c = c3;
                int i2 = 0;
                while (i2 < size2) {
                    char c5 = c4;
                    jdf jdfVar5 = (jdf) list.get(i2);
                    boolean z2 = z;
                    float[] fArr = jdfVar5.a;
                    if (((Math.abs(fArr[0] - jdfVar5.a()) >= 1.0E-4f || Math.abs(fArr[z2 ? 1 : 0] - jdfVar5.b()) >= 1.0E-4f) ? false : z2 ? 1 : 0) != true) {
                        if (jdfVar2 != null) {
                            a.add(jdfVar2);
                        }
                        if (jdfVar == null) {
                            jdfVar = jdfVar5;
                            jdfVar2 = jdfVar;
                        } else {
                            jdfVar2 = jdfVar5;
                        }
                    } else if (jdfVar2 != null) {
                        float[] fArr2 = jdfVar2.a;
                        fArr2[6] = jdfVar5.a();
                        fArr2[7] = jdfVar5.b();
                    }
                    i2++;
                    c4 = c5;
                    z = z2 ? 1 : 0;
                }
                c2 = c4;
                r16 = z;
                if (i == size) {
                    break;
                }
                i++;
                c3 = c;
                c4 = c2;
                z = r16 == true ? 1 : 0;
            }
        } else {
            c = 3;
            c2 = 2;
            r16 = 1;
            jdfVar = null;
            jdfVar2 = null;
        }
        if (jdfVar2 != null && jdfVar != null) {
            float[] fArr3 = jdfVar2.a;
            float f3 = fArr3[0];
            float f4 = fArr3[r16];
            float f5 = fArr3[c2];
            float f6 = fArr3[c];
            float f7 = fArr3[4];
            float f8 = fArr3[5];
            float[] fArr4 = jdfVar.a;
            a.add(jub1.a(f3, f4, f5, f6, f7, f8, fArr4[0], fArr4[r16]));
        }
        ListBuilder j = a.j();
        this.d = j;
        Object obj = j.get(j.size() - 1);
        int size3 = j.size();
        int i3 = 0;
        while (i3 < size3) {
            jdf jdfVar6 = (jdf) this.d.get(i3);
            jdf jdfVar7 = (jdf) obj;
            if (Math.abs(jdfVar6.a[0] - jdfVar7.a()) > 1.0E-4f || Math.abs(jdfVar6.a[r16] - jdfVar7.b()) > 1.0E-4f) {
                ny61.g("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i3++;
            obj = jdfVar6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyk0)) {
            return false;
        }
        return jl40.l(this.a, ((nyk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(a.X(this.d, null, null, null, null, 63));
        sb.append(" || Features = ");
        sb.append(a.X(this.a, null, null, null, null, 63));
        sb.append(" || Center = (");
        sb.append(this.b);
        sb.append(Extension.FIX_SPACE);
        return uw51.i(sb, this.c, ")]");
    }
}
