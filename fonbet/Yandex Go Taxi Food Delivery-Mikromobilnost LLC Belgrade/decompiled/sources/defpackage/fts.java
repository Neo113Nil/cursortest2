package defpackage;

import java.util.ArrayList;
import kotlin.a;

/* loaded from: classes.dex */
public final class fts {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final wx40 e;
    public final i3y f;

    public fts(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            khe0.a("Invalid start index");
        }
        this.d = new ArrayList();
        wx40 wx40Var = new wx40((Object) null);
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jix jixVar = (jix) this.a.get(i3);
            int i4 = jixVar.c;
            int i5 = jixVar.d;
            wx40Var.i(i4, new r2u(i3, i2, i5));
            i2 += i5;
        }
        this.e = wx40Var;
        this.f = a.a(new ets(0, this));
    }

    public final boolean a(int i, int i2) {
        r2u r2uVar;
        int i3;
        int i4;
        wx40 wx40Var = this.e;
        r2u r2uVar2 = (r2u) wx40Var.b(i);
        if (r2uVar2 == null) {
            return false;
        }
        int i5 = r2uVar2.b;
        int i6 = i2 - r2uVar2.c;
        r2uVar2.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = wx40Var.c;
        long[] jArr = wx40Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (r2uVar = (r2u) objArr[(i7 << 3) + i9]).b) >= i5 && r2uVar != r2uVar2 && (i4 = i3 + i6) >= 0) {
                        r2uVar.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
