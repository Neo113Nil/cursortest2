package xsna;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: SerialDescriptors.kt */
/* loaded from: classes8.dex */
public final class zli0 implements SerialDescriptor, jy8 {
    public final String a;
    public final gmi0 b;
    public final int c;
    public final List<Annotation> d;
    public final HashSet e;
    public final String[] f;
    public final SerialDescriptor[] g;
    public final List<Annotation>[] h;
    public final boolean[] i;
    public final Map<String, Integer> j;
    public final SerialDescriptor[] k;
    public final bpn0 l;

    public zli0(String str, gmi0 gmi0Var, int i, List<? extends SerialDescriptor> list, sfc sfcVar) {
        this.a = str;
        this.b = gmi0Var;
        this.c = i;
        this.d = sfcVar.b;
        ArrayList arrayList = sfcVar.c;
        this.e = j5g.M0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = fvr.k(sfcVar.e);
        this.h = (List[]) sfcVar.f.toArray(new List[0]);
        this.i = j5g.J0(sfcVar.g);
        ytw ytwVar = new ytw(new l1(strArr, 7));
        ArrayList arrayList2 = new ArrayList(c5g.u(ytwVar, 10));
        Iterator it = ytwVar.iterator();
        while (true) {
            ztw ztwVar = (ztw) it;
            if (!ztwVar.b.hasNext()) {
                this.j = pn00.s(arrayList2);
                this.k = fvr.k(list);
                this.l = new bpn0(new tju(this, 27));
                return;
            }
            xtw xtwVar = (xtw) ztwVar.next();
            arrayList2.add(new Pair(xtwVar.b, Integer.valueOf(xtwVar.a)));
        }
    }

    @Override // xsna.jy8
    public final Set<String> a() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> e(int i) {
        return this.h[i];
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof zli0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (epx.f(this.a, serialDescriptor.f()) && Arrays.equals(this.k, ((zli0) obj).k)) {
                int c = serialDescriptor.c();
                int i2 = this.c;
                if (i2 == c) {
                    for (0; i < i2; i + 1) {
                        SerialDescriptor[] serialDescriptorArr = this.g;
                        i = (epx.f(serialDescriptorArr[i].f(), serialDescriptor.h(i).f()) && epx.f(serialDescriptorArr[i].getKind(), serialDescriptor.h(i).getKind())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f() {
        return this.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String str) {
        Integer num = this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final gmi0 getKind() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.i[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return j5g.g0(swe0.q(0, this.c), ", ", ho8.a(new StringBuilder(), this.a, '('), ")", 0, new ggb0(this, 9), 24);
    }
}
