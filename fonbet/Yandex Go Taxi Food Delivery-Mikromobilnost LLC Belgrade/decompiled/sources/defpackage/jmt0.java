package defpackage;

import androidx.compose.ui.layout.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes5.dex */
public final class jmt0 implements z910 {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ lmt0 f;

    public jmt0(float f, int i, float f2, float f3, int i2, lmt0 lmt0Var) {
        this.a = f;
        this.b = i;
        this.c = f2;
        this.d = f3;
        this.e = i2;
        this.f = lmt0Var;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        float H = kVar.H(n8e.i(j));
        float f = this.a;
        boolean b = y7m.b(f, 0.0f);
        int i = this.b;
        float f2 = this.c;
        if (b) {
            f = (H - ((i - 1) * f2)) / i;
        }
        float H2 = kVar.H(n8e.h(j));
        float f3 = this.d;
        boolean b2 = y7m.b(f3, 0.0f);
        int i2 = this.e;
        if (b2) {
            f3 = (H2 - ((i2 - 1) * f2)) / i2;
        }
        int i3 = n8e.g(j) ? n8e.i(j) : kVar.f0(((i - 1) * f2) + (i * f));
        int h = n8e.f(j) ? n8e.h(j) : kVar.f0(((i2 - 1) * f2) + (i2 * f3));
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                scc.m();
                throw null;
            }
            jlt0 jlt0Var = ((gmt0) this.f.a.get(i4)).a;
            int f0 = kVar.f0((f + f2) * jlt0Var.a);
            int f02 = kVar.f0((f3 + f2) * jlt0Var.b);
            int f03 = kVar.f0(((r9 - 1) * f2) + (jlt0Var.c * f));
            int f04 = kVar.f0(((r2 - 1) * f2) + (jlt0Var.d * f3));
            arrayList.add(new Pair(((x910) obj).l0(n8e.a(f03, f03, f04, f04)), new lce0(f0, f02)));
            i4 = i5;
        }
        return kVar.w(i3, h, b.f(), new nk2(arrayList, 10));
    }
}
