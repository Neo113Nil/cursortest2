package xsna;

import androidx.compose.foundation.text.selection.CrossStatus;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.obi0;
import xsna.zbi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ybi0 implements zbi0 {
    @Override // xsna.zbi0
    public final obi0 a(ndi0 ndi0Var) {
        obi0.a b;
        obi0.a aVar;
        boolean z;
        obi0 i = ndi0Var.i();
        if (i == null) {
            return bci0.a(ndi0Var, zbi0.a.b.a);
        }
        obi0.a aVar2 = i.b;
        obi0.a aVar3 = i.a;
        if (ndi0Var.a()) {
            aVar = bci0.b(ndi0Var, ndi0Var.k(), aVar3);
            b = aVar2;
            aVar2 = aVar3;
            aVar3 = aVar;
        } else {
            b = bci0.b(ndi0Var, ndi0Var.j(), aVar2);
            aVar = b;
        }
        if (epx.f(aVar, aVar2)) {
            return i;
        }
        obi0 obi0Var = new obi0(aVar3, b, ndi0Var.d() == CrossStatus.CROSSED || (ndi0Var.d() == CrossStatus.COLLAPSED && aVar3.b > b.b));
        boolean z2 = false;
        obi0.a aVar4 = obi0Var.a;
        long j = aVar4.c;
        obi0.a aVar5 = obi0Var.b;
        if (j == aVar5.c) {
            if (aVar4.b == aVar5.b) {
                z = true;
            }
            z = false;
        } else {
            boolean z3 = obi0Var.c;
            if ((z3 ? aVar4 : aVar5).b == 0) {
                if (z3) {
                    aVar4 = aVar5;
                }
                if (ndi0Var.g().f.a.a.c.length() == aVar4.b) {
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    ref$BooleanRef.element = true;
                    ndi0Var.f(new e2s(ref$BooleanRef, 28));
                    z = ref$BooleanRef.element;
                }
            }
            z = false;
        }
        if (!z) {
            return obi0Var;
        }
        String str = ndi0Var.b().f.a.a.c;
        if (ndi0Var.getSize() > 1 || ndi0Var.i() == null) {
            return obi0Var;
        }
        if (str.length() == 0) {
            return obi0Var;
        }
        jai0 b2 = ndi0Var.b();
        String str2 = b2.f.a.a.c;
        int i2 = b2.c;
        int length = str2.length();
        if (i2 == 0) {
            int f = kci.f(0, str2);
            return ndi0Var.a() ? obi0.a(obi0Var, bci0.d(obi0Var.a, b2, f), null, true, 2) : obi0.a(obi0Var, null, bci0.d(obi0Var.b, b2, f), false, 1);
        }
        if (i2 == length) {
            int g = kci.g(length, str2);
            return ndi0Var.a() ? obi0.a(obi0Var, bci0.d(obi0Var.a, b2, g), null, false, 2) : obi0.a(obi0Var, null, bci0.d(obi0Var.b, b2, g), true, 1);
        }
        obi0 i3 = ndi0Var.i();
        if (i3 != null && i3.c) {
            z2 = true;
        }
        int g2 = ndi0Var.a() ^ z2 ? kci.g(i2, str2) : kci.f(i2, str2);
        return ndi0Var.a() ? obi0.a(obi0Var, bci0.d(obi0Var.a, b2, g2), null, z2, 2) : obi0.a(obi0Var, null, bci0.d(obi0Var.b, b2, g2), z2, 1);
    }
}
