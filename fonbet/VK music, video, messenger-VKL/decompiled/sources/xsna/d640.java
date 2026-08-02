package xsna;

import androidx.compose.foundation.text.selection.CrossStatus;
import io.jsonwebtoken.JwtParser;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import xsna.obi0;

/* compiled from: SelectionLayout.kt */
/* loaded from: classes11.dex */
public final class d640 implements ndi0 {
    public final n300 a;
    public final List<jai0> b;
    public final int c;
    public final int d;
    public final boolean e;
    public final obi0 f;

    /* compiled from: SelectionLayout.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CrossStatus.values().length];
            try {
                iArr[CrossStatus.COLLAPSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CrossStatus.NOT_CROSSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CrossStatus.CROSSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d640(vg50 vg50Var, List list, int i, int i2, boolean z, obi0 obi0Var) {
        this.a = vg50Var;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = obi0Var;
        if (list.size() > 1) {
            return;
        }
        xzw.c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + JwtParser.SEPARATOR_CHAR);
    }

    public static void m(xg50 xg50Var, obi0 obi0Var, jai0 jai0Var, int i, int i2) {
        obi0 obi0Var2;
        if (obi0Var.c) {
            obi0Var2 = new obi0(jai0Var.a(i2), jai0Var.a(i), i2 > i);
        } else {
            obi0Var2 = new obi0(jai0Var.a(i), jai0Var.a(i2), i > i2);
        }
        if (i > i2) {
            xzw.c("minOffset should be less than or equal to maxOffset: " + obi0Var2);
        }
        long j = jai0Var.a;
        int e = xg50Var.e(j);
        Object[] objArr = xg50Var.c;
        Object obj = objArr[e];
        xg50Var.b[e] = j;
        objArr[e] = obi0Var2;
    }

    @Override // xsna.ndi0
    public final boolean a() {
        return this.e;
    }

    @Override // xsna.ndi0
    public final jai0 b() {
        return this.e ? k() : j();
    }

    @Override // xsna.ndi0
    public final xg50 c(obi0 obi0Var) {
        obi0.a aVar = obi0Var.a;
        boolean z = obi0Var.c;
        long j = aVar.c;
        int i = aVar.b;
        obi0.a aVar2 = obi0Var.b;
        long j2 = aVar2.c;
        int i2 = aVar2.b;
        if (j != j2) {
            xg50 xg50Var = t300.a;
            xg50 xg50Var2 = new xg50();
            m(xg50Var2, obi0Var, g(), (z ? aVar2 : aVar).b, g().f.a.a.c.length());
            f(new hl1(this, xg50Var2, obi0Var, 22));
            if (!z) {
                aVar = aVar2;
            }
            m(xg50Var2, obi0Var, d() == CrossStatus.CROSSED ? k() : j(), 0, aVar.b);
            return xg50Var2;
        }
        if ((!z || i < i2) && (z || i > i2)) {
            xzw.c("unexpectedly miss-crossed selection: " + obi0Var);
        }
        long j3 = aVar.c;
        xg50 xg50Var3 = t300.a;
        xg50 xg50Var4 = new xg50();
        xg50Var4.i(j3, obi0Var);
        return xg50Var4;
    }

    @Override // xsna.ndi0
    public final CrossStatus d() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return CrossStatus.NOT_CROSSED;
        }
        if (i > i2) {
            return CrossStatus.CROSSED;
        }
        return this.b.get(i / 2).b();
    }

    @Override // xsna.ndi0
    public final boolean e(ndi0 ndi0Var) {
        if (this.f != null && ndi0Var != null && (ndi0Var instanceof d640)) {
            d640 d640Var = (d640) ndi0Var;
            List<jai0> list = d640Var.b;
            if (this.e == d640Var.e && this.c == d640Var.c && this.d == d640Var.d) {
                List<jai0> list2 = this.b;
                if (list2.size() == list.size()) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        jai0 jai0Var = list2.get(i);
                        jai0 jai0Var2 = list.get(i);
                        if (jai0Var.a != jai0Var2.a || jai0Var.c != jai0Var2.c || jai0Var.d != jai0Var2.d) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // xsna.ndi0
    public final void f(izs<? super jai0, s3q0> izsVar) {
        int n = n(g().a);
        int n2 = n((d() == CrossStatus.CROSSED ? k() : j()).a);
        int i = n + 1;
        if (i >= n2) {
            return;
        }
        while (i < n2) {
            izsVar.invoke(this.b.get(i));
            i++;
        }
    }

    @Override // xsna.ndi0
    public final jai0 g() {
        return d() == CrossStatus.CROSSED ? j() : k();
    }

    @Override // xsna.ndi0
    public final int getSize() {
        return this.b.size();
    }

    @Override // xsna.ndi0
    public final int h() {
        return this.d;
    }

    @Override // xsna.ndi0
    public final obi0 i() {
        return this.f;
    }

    @Override // xsna.ndi0
    public final jai0 j() {
        return this.b.get(o(this.d, false));
    }

    @Override // xsna.ndi0
    public final jai0 k() {
        return this.b.get(o(this.c, true));
    }

    @Override // xsna.ndi0
    public final int l() {
        return this.c;
    }

    public final int n(long j) {
        try {
            return this.a.b(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(defpackage.k0.a(j, "Invalid selectableId: "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(int i, boolean z) {
        int i2 = a.$EnumSwitchMapping$0[d().ordinal()];
        int i3 = z;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z != 0) {
                    i3 = 0;
                }
            }
            return (i - (i3 ^ 1)) / 2;
        }
        i3 = 1;
        return (i - (i3 ^ 1)) / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        float f = 2;
        sb.append((this.c + 1) / f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / f);
        sb.append(", crossed=");
        sb.append(d());
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List<jai0> list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            jai0 jai0Var = list.get(i);
            if (z) {
                z = false;
            } else {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(jai0Var);
            sb2.append(sb3.toString());
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
