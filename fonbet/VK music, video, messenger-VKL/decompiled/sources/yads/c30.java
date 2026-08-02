package yads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes10.dex */
public final class c30 implements ev0 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final lc3 i;
    public final dz2 j;
    public final Uri k;
    public final ek2 l;
    public final List m;

    public c30(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, ek2 ek2Var, lc3 lc3Var, dz2 dz2Var, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = ek2Var;
        this.i = lc3Var;
        this.k = uri;
        this.j = dz2Var;
        this.m = arrayList;
    }

    public final gd2 a(int i) {
        return (gd2) this.m.get(i);
    }

    public final long b(int i) {
        long j;
        long j2;
        if (i == this.m.size() - 1) {
            j = this.b;
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            j2 = ((gd2) this.m.get(i)).b;
        } else {
            j = ((gd2) this.m.get(i + 1)).b;
            j2 = ((gd2) this.m.get(i)).b;
        }
        return j - j2;
    }

    public final long c(int i) {
        return mc3.a(b(i));
    }

    public final c30 a(List list) {
        long j;
        long j2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new z43(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i = 0;
        while (true) {
            int size = this.m.size();
            j = C.TIME_UNSET;
            if (i >= size) {
                break;
            }
            if (((z43) linkedList.peek()).b != i) {
                long b = b(i);
                if (b != C.TIME_UNSET) {
                    j3 += b;
                    i++;
                } else {
                    j2 = j3;
                }
            } else {
                gd2 gd2Var = (gd2) this.m.get(i);
                List list2 = gd2Var.c;
                z43 z43Var = (z43) linkedList.poll();
                int i2 = z43Var.b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = z43Var.c;
                    zb zbVar = (zb) list2.get(i3);
                    List list3 = zbVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((mp2) list3.get(z43Var.d));
                        z43Var = (z43) linkedList.poll();
                        if (z43Var.b != i2) {
                            break;
                        }
                    } while (z43Var.c == i3);
                    j2 = j3;
                    arrayList2.add(new zb(zbVar.a, zbVar.b, arrayList3, zbVar.d, zbVar.e, zbVar.f));
                    if (z43Var.b != i2) {
                        break;
                    }
                    j3 = j2;
                }
                linkedList.addFirst(z43Var);
                arrayList.add(new gd2(gd2Var.a, gd2Var.b - j2, arrayList2, gd2Var.d));
            }
            j3 = j2;
            i++;
        }
        long j4 = j3;
        long j5 = this.b;
        if (j5 != C.TIME_UNSET) {
            j = j5 - j4;
        }
        return new c30(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }
}
