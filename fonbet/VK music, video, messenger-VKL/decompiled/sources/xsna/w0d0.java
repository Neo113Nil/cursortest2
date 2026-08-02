package xsna;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.px8;
import xsna.sht0;

/* compiled from: PreloadController.kt */
/* loaded from: classes17.dex */
public final class w0d0<T extends sht0> {
    public final gzs<Integer> a;
    public final lgk0<T> b;
    public final xmf<T> c;
    public int d = -1;
    public Object e = EmptySet.b;
    public Boolean f;

    public w0d0(gzs gzsVar, mgk0 mgk0Var, xmf xmfVar) {
        this.a = gzsVar;
        this.b = mgk0Var;
        this.c = xmfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092 A[LOOP:0: B:16:0x0070->B:41:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[EDGE_INSN: B:42:0x0094->B:28:0x0094 BREAK  A[LOOP:0: B:16:0x0070->B:41:0x0092], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i) {
        boolean z;
        lgk0<T> lgk0Var;
        px8.c cVar;
        int i2;
        int i3;
        int i4;
        xmf<T> xmfVar;
        px8<T> a;
        if (i != 0) {
            Boolean bool = this.f;
            if (bool != null) {
                if (this.d != i) {
                    bool = null;
                }
                if (bool != null) {
                    z = bool.booleanValue();
                    this.d = i;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    linkedHashSet2.addAll((Collection) this.e);
                    lgk0Var = this.b;
                    px8<T> a2 = lgk0Var.a(i);
                    cVar = a2 instanceof px8.c ? (px8.c) a2 : null;
                    if (cVar != null) {
                        linkedHashSet2.add(cVar.a);
                    }
                    int intValue = this.a.invoke().intValue();
                    i9x k9xVar = z ? new k9x(i + 1, i + intValue, 1) : swe0.m(i - 1, i - intValue);
                    i2 = k9xVar.b;
                    i3 = k9xVar.c;
                    i4 = k9xVar.d;
                    if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                        while (true) {
                            a = lgk0Var.a(i2);
                            if (!(a instanceof px8.a)) {
                                if (a instanceof px8.b) {
                                    break;
                                }
                                if (!(a instanceof px8.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                linkedHashSet.add(((px8.c) a).a);
                                s3q0 s3q0Var = s3q0.a;
                            }
                            if (i2 != i3) {
                                break;
                            } else {
                                i2 += i4;
                            }
                        }
                    }
                    g5g.F(linkedHashSet, linkedHashSet2);
                    Iterator it = linkedHashSet2.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        xmfVar = this.c;
                        if (!hasNext) {
                            break;
                        } else {
                            xmfVar.f((sht0) it.next());
                        }
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        xmfVar.a((sht0) it2.next());
                    }
                    this.e = linkedHashSet;
                    this.f = Boolean.valueOf(z);
                    return;
                }
            }
            if (i < this.d) {
                z = false;
                this.d = i;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet22 = new LinkedHashSet();
                linkedHashSet22.addAll((Collection) this.e);
                lgk0Var = this.b;
                px8<T> a22 = lgk0Var.a(i);
                if (a22 instanceof px8.c) {
                }
                if (cVar != null) {
                }
                int intValue2 = this.a.invoke().intValue();
                if (z) {
                }
                i2 = k9xVar.b;
                i3 = k9xVar.c;
                i4 = k9xVar.d;
                if (i4 > 0) {
                    while (true) {
                        a = lgk0Var.a(i2);
                        if (!(a instanceof px8.a)) {
                        }
                        if (i2 != i3) {
                        }
                        i2 += i4;
                    }
                }
                while (true) {
                    a = lgk0Var.a(i2);
                    if (!(a instanceof px8.a)) {
                    }
                    if (i2 != i3) {
                    }
                    i2 += i4;
                }
            }
        }
        z = true;
        this.d = i;
        LinkedHashSet linkedHashSet32 = new LinkedHashSet();
        LinkedHashSet linkedHashSet222 = new LinkedHashSet();
        linkedHashSet222.addAll((Collection) this.e);
        lgk0Var = this.b;
        px8<T> a222 = lgk0Var.a(i);
        if (a222 instanceof px8.c) {
        }
        if (cVar != null) {
        }
        int intValue22 = this.a.invoke().intValue();
        if (z) {
        }
        i2 = k9xVar.b;
        i3 = k9xVar.c;
        i4 = k9xVar.d;
        if (i4 > 0) {
        }
        while (true) {
            a = lgk0Var.a(i2);
            if (!(a instanceof px8.a)) {
            }
            if (i2 != i3) {
            }
            i2 += i4;
        }
    }
}
