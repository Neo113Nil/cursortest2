package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class hpr0 {
    public final mzb0 a;
    public final mzb0 b;
    public final fpr0 c;
    public final gpr0 d;

    public hpr0() {
        mzb0 mzb0Var = new mzb0();
        this.a = mzb0Var;
        mzb0 mzb0Var2 = new mzb0();
        this.b = mzb0Var2;
        this.c = new fpr0(mzb0Var);
        this.d = new gpr0(mzb0Var2);
    }

    public final void a(y0c0 y0c0Var, b1c0 b1c0Var) {
        if (y0c0Var != null) {
            mzb0 mzb0Var = this.a;
            ArrayList arrayList = mzb0Var.a;
            if (!arrayList.contains(y0c0Var)) {
                arrayList.add(y0c0Var);
            }
            mzb0Var.b.l(a.b0(arrayList));
        }
        if (b1c0Var != null) {
            mzb0 mzb0Var2 = this.b;
            ArrayList arrayList2 = mzb0Var2.a;
            if (!arrayList2.contains(b1c0Var)) {
                arrayList2.add(b1c0Var);
            }
            mzb0Var2.b.l(a.b0(arrayList2));
        }
    }

    public final void b(y0c0 y0c0Var, b1c0 b1c0Var) {
        if (y0c0Var != null) {
            mzb0 mzb0Var = this.a;
            ArrayList arrayList = mzb0Var.a;
            arrayList.remove(y0c0Var);
            mzb0Var.b.l(a.b0(arrayList));
        }
        if (b1c0Var != null) {
            mzb0 mzb0Var2 = this.b;
            ArrayList arrayList2 = mzb0Var2.a;
            arrayList2.remove(b1c0Var);
            mzb0Var2.b.l(a.b0(arrayList2));
        }
    }
}
