package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import skeletor.parser.util.StackMode;
import skeletor.render.token.Stack$Orientation;

/* loaded from: classes10.dex */
public final class kyi0 extends yjs0 {
    public final bjs0 d;
    public final Stack$Orientation e;
    public final StackMode f;
    public final ArrayList g;
    public int h;
    public int i;
    public final /* synthetic */ int j;

    public kyi0(bjs0 bjs0Var, Stack$Orientation stack$Orientation, StackMode stackMode, ArrayList arrayList, int i) {
        this.j = i;
        this.d = bjs0Var;
        this.e = stack$Orientation;
        this.f = stackMode;
        this.g = arrayList;
    }

    @Override // defpackage.yjs0
    public final void b(Context context, int i, int i2, int i3, n86 n86Var) {
        int i4 = this.j;
        ArrayList arrayList = this.g;
        switch (i4) {
            case 0:
                int i5 = i3;
                n86 n86Var2 = n86Var;
                int i6 = i2 + this.i;
                Iterator it = arrayList.iterator();
                int i7 = i6;
                while (it.hasNext()) {
                    yjs0 yjs0Var = (yjs0) it.next();
                    int i8 = i5;
                    n86 n86Var3 = n86Var2;
                    int i9 = i;
                    yjs0Var.b(context, i9, i7, i8, n86Var3);
                    i5 = i8;
                    i7 += yjs0Var.c + this.h;
                    i = i9;
                    n86Var2 = n86Var3;
                }
                break;
            default:
                int i10 = i + this.i;
                Iterator it2 = arrayList.iterator();
                int i11 = i10;
                while (it2.hasNext()) {
                    yjs0 yjs0Var2 = (yjs0) it2.next();
                    Context context2 = context;
                    yjs0Var2.b(context2, i11, i2, i3, n86Var);
                    i11 += yjs0Var2.b + this.h;
                    context = context2;
                }
                break;
        }
    }

    @Override // defpackage.yjs0
    public final void c(Context context, qa10 qa10Var) {
        int i;
        int i2;
        int e = e(context, qa10Var, false);
        int[] iArr = oyt0.b;
        Stack$Orientation stack$Orientation = this.e;
        int i3 = iArr[stack$Orientation.ordinal()];
        if (i3 == 1) {
            i = qa10Var.a;
        } else {
            if (i3 != 2) {
                w511.b();
                return;
            }
            i = qa10Var.b;
        }
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        int i4 = 0;
        int i5 = 0;
        int i6 = e;
        while (it.hasNext()) {
            yjs0 yjs0Var = (yjs0) it.next();
            int[] iArr2 = oyt0.b;
            int i7 = iArr2[stack$Orientation.ordinal()];
            if (i7 == 1) {
                qa10Var.b = e;
            } else if (i7 == 2) {
                qa10Var.a = e;
            }
            int i8 = iArr2[stack$Orientation.ordinal()];
            if (i8 == 1) {
                qa10Var.a = i;
            } else if (i8 == 2) {
                qa10Var.b = i;
            }
            yjs0Var.a(context, qa10Var);
            qa10Var.a = yjs0Var.b;
            qa10Var.b = yjs0Var.c;
            int e2 = e(context, qa10Var, true);
            int i9 = iArr2[stack$Orientation.ordinal()];
            if (i9 == 1) {
                i2 = qa10Var.a;
            } else {
                if (i9 != 2) {
                    w511.b();
                    return;
                }
                i2 = qa10Var.b;
            }
            if (i2 > i4) {
                i4 = i2;
            }
            i5 += e2;
            i6 -= e2;
        }
        StackMode stackMode = this.f;
        StackMode stackMode2 = stackMode == null ? StackMode.Start : stackMode;
        int[] iArr3 = oyt0.a;
        int i10 = iArr3[stackMode2.ordinal()];
        this.h = i10 != 1 ? i10 != 2 ? 0 : i6 / (arrayList.size() + 1) : i6 / Math.max(scc.f(arrayList), 1);
        if (stackMode == null) {
            stackMode = StackMode.Start;
        }
        int i11 = iArr3[stackMode.ordinal()];
        this.i = i11 != 2 ? i11 != 3 ? i11 != 4 ? 0 : i6 : i6 / 2 : this.h;
        int i12 = oyt0.b[stack$Orientation.ordinal()];
        if (i12 == 1) {
            d(i4, i5);
        } else {
            if (i12 != 2) {
                return;
            }
            d(i5, i4);
        }
    }

    public final int e(Context context, qa10 qa10Var, boolean z) {
        int i;
        bjs0 bjs0Var;
        int i2 = oyt0.b[this.e.ordinal()];
        if (i2 == 1) {
            i = qa10Var.b;
        } else {
            if (i2 != 2) {
                w511.b();
                return 0;
            }
            i = qa10Var.a;
        }
        return (z || (bjs0Var = this.d) == null) ? i : sb2.A(bjs0Var, context, i);
    }
}
