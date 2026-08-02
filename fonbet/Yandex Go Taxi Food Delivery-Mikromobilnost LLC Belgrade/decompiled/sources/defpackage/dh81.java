package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import yads.y13;

/* loaded from: classes7.dex */
public final class dh81 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final rbh i;
    public final qh71 j;
    public final Uri k;
    public final um71 l;
    public final ArrayList m;

    public dh81(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, um71 um71Var, rbh rbhVar, qh71 qh71Var, Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = um71Var;
        this.i = rbhVar;
        this.k = uri;
        this.j = qh71Var;
        this.m = arrayList;
    }

    public final long a(int i) {
        long j;
        long j2;
        ArrayList arrayList = this.m;
        if (i == arrayList.size() - 1) {
            j = this.b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = ((ey71) arrayList.get(i)).b;
        } else {
            j = ((ey71) arrayList.get(i + 1)).b;
            j2 = ((ey71) arrayList.get(i)).b;
        }
        return j - j2;
    }

    public final dh81 b(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new y13(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.m;
            if (i >= arrayList2.size()) {
                break;
            }
            if (((y13) linkedList.peek()).b != i) {
                long a = a(i);
                if (a != -9223372036854775807L) {
                    j2 += a;
                    i++;
                } else {
                    j = j2;
                }
            } else {
                ey71 ey71Var = (ey71) arrayList2.get(i);
                List list2 = ey71Var.c;
                y13 y13Var = (y13) linkedList.poll();
                int i2 = y13Var.b;
                ArrayList arrayList3 = new ArrayList();
                while (true) {
                    int i3 = y13Var.c;
                    k881 k881Var = (k881) list2.get(i3);
                    List list3 = k881Var.c;
                    ArrayList arrayList4 = new ArrayList();
                    do {
                        arrayList4.add((x281) list3.get(y13Var.d));
                        y13Var = (y13) linkedList.poll();
                        if (y13Var.b != i2) {
                            break;
                        }
                    } while (y13Var.c == i3);
                    j = j2;
                    arrayList3.add(new k881(k881Var.a, k881Var.b, arrayList4, k881Var.d, k881Var.e, k881Var.f));
                    if (y13Var.b != i2) {
                        break;
                    }
                    j2 = j;
                }
                linkedList.addFirst(y13Var);
                arrayList.add(new ey71(ey71Var.a, ey71Var.b - j, arrayList3, ey71Var.d));
            }
            j2 = j;
            i++;
        }
        long j3 = j2;
        long j4 = this.b;
        return new dh81(this.a, j4 != -9223372036854775807L ? j4 - j3 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }
}
