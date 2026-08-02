package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class asq0 implements SerialDescriptor, ud7 {
    public final String a;
    public final jl40 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final SerialDescriptor[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final SerialDescriptor[] k;
    public final i3y l;

    public asq0(String str, jl40 jl40Var, int i, List list, h0c h0cVar) {
        this.a = str;
        this.b = jl40Var;
        this.c = i;
        this.d = h0cVar.b;
        ArrayList arrayList = h0cVar.c;
        this.e = a.H0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = uh6.k(h0cVar.e);
        this.h = (List[]) h0cVar.f.toArray(new List[0]);
        this.i = a.C0(h0cVar.g);
        g73 g73Var = new g73(1, new d9(19, strArr));
        ArrayList arrayList2 = new ArrayList(tcc.n(g73Var, 10));
        Iterator it = g73Var.iterator();
        while (true) {
            irv irvVar = (irv) it;
            if (!irvVar.c.hasNext()) {
                this.j = b.s(arrayList2);
                this.k = uh6.k(list);
                this.l = kotlin.a.a(new qhq0(3, this));
                return;
            }
            hrv hrvVar = (hrv) irvVar.next();
            arrayList2.add(new Pair(hrvVar.b, Integer.valueOf(hrvVar.a)));
        }
    }

    @Override // defpackage.ud7
    public final Set a() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        return this.g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof asq0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.h()) && Arrays.equals(this.k, ((asq0) obj).k)) {
                int e = serialDescriptor.e();
                int i2 = this.c;
                if (i2 == e) {
                    for (0; i < i2; i + 1) {
                        SerialDescriptor[] serialDescriptorArr = this.g;
                        i = (jl40.l(serialDescriptorArr[i].h(), serialDescriptor.d(i).h()) && jl40.l(serialDescriptorArr[i].getKind(), serialDescriptor.d(i).getKind())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        return this.h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final jl40 getKind() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.i[i];
    }

    public final String toString() {
        return tje.g0(this);
    }
}
