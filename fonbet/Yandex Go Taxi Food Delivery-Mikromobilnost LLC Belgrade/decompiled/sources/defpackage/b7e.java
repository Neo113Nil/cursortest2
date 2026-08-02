package defpackage;

import androidx.constraintlayout.core.SolverVariable$Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b7e {
    public int b;
    public boolean c;
    public final ConstraintWidget d;
    public final ConstraintAnchor$Type e;
    public b7e f;
    public z7t0 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public b7e(ConstraintWidget constraintWidget, ConstraintAnchor$Type constraintAnchor$Type) {
        this.d = constraintWidget;
        this.e = constraintAnchor$Type;
    }

    public final void a(b7e b7eVar, int i) {
        b(b7eVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(b7e b7eVar, int i, int i2, boolean z) {
        if (b7eVar == null) {
            j();
            return true;
        }
        if (!z && !i(b7eVar)) {
            return false;
        }
        this.f = b7eVar;
        if (b7eVar.a == null) {
            b7eVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, c351 c351Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                g3u.a(((b7e) it.next()).d, i, arrayList, c351Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        b7e b7eVar;
        if (this.d.i0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (b7eVar = this.f) == null || b7eVar.d.i0 != 8) ? this.g : i;
    }

    public final b7e f() {
        ConstraintAnchor$Type constraintAnchor$Type = this.e;
        int ordinal = constraintAnchor$Type.ordinal();
        ConstraintWidget constraintWidget = this.d;
        switch (ordinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return constraintWidget.L;
            case 2:
                return constraintWidget.M;
            case 3:
                return constraintWidget.J;
            case 4:
                return constraintWidget.K;
            default:
                ny61.f(constraintAnchor$Type.name());
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((b7e) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(b7e b7eVar) {
        if (b7eVar != null) {
            ConstraintWidget constraintWidget = b7eVar.d;
            ConstraintAnchor$Type constraintAnchor$Type = b7eVar.e;
            ConstraintAnchor$Type constraintAnchor$Type2 = this.e;
            if (constraintAnchor$Type != constraintAnchor$Type2) {
                switch (constraintAnchor$Type2.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = constraintAnchor$Type == ConstraintAnchor$Type.LEFT || constraintAnchor$Type == ConstraintAnchor$Type.RIGHT;
                        if (!(constraintWidget instanceof g)) {
                            return z;
                        }
                        if (z || constraintAnchor$Type == ConstraintAnchor$Type.CENTER_X) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = constraintAnchor$Type == ConstraintAnchor$Type.TOP || constraintAnchor$Type == ConstraintAnchor$Type.BOTTOM;
                        if (!(constraintWidget instanceof g)) {
                            return z2;
                        }
                        if (z2 || constraintAnchor$Type == ConstraintAnchor$Type.CENTER_Y) {
                        }
                        break;
                    case 5:
                        if (constraintAnchor$Type == ConstraintAnchor$Type.LEFT || constraintAnchor$Type == ConstraintAnchor$Type.RIGHT) {
                        }
                        break;
                    case 6:
                        if (constraintAnchor$Type == ConstraintAnchor$Type.BASELINE || constraintAnchor$Type == ConstraintAnchor$Type.CENTER_X || constraintAnchor$Type == ConstraintAnchor$Type.CENTER_Y) {
                        }
                        break;
                    default:
                        ny61.f(constraintAnchor$Type2.name());
                        return false;
                }
            } else if (constraintAnchor$Type2 != ConstraintAnchor$Type.BASELINE || (constraintWidget.E && this.d.E)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        b7e b7eVar = this.f;
        if (b7eVar != null && (hashSet = b7eVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        z7t0 z7t0Var = this.i;
        if (z7t0Var == null) {
            this.i = new z7t0(SolverVariable$Type.UNRESTRICTED);
        } else {
            z7t0Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.k0 + ":" + this.e.toString();
    }
}
