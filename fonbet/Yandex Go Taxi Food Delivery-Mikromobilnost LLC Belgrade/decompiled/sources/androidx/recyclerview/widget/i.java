package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.ajj;
import defpackage.nf5;
import defpackage.qty;
import defpackage.xij;
import defpackage.yij;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final xij d;
    public final int e;
    public final int f;
    public final boolean g;

    public i(xij xijVar, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z) {
        int i;
        yij yijVar;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = xijVar;
        int e = xijVar.e();
        this.e = e;
        int d = xijVar.d();
        this.f = d;
        this.g = z;
        yij yijVar2 = arrayList.isEmpty() ? null : (yij) arrayList.get(0);
        if (yijVar2 == null || yijVar2.a != 0 || yijVar2.b != 0) {
            arrayList.add(0, new yij(0, 0, 0));
        }
        arrayList.add(new yij(e, d, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yij yijVar3 = (yij) it.next();
            for (int i3 = 0; i3 < yijVar3.c; i3++) {
                int i4 = yijVar3.a + i3;
                int i5 = yijVar3.b + i3;
                int i6 = xijVar.a(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.g) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                yij yijVar4 = (yij) it2.next();
                while (true) {
                    i = yijVar4.a;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                if (i8 < size) {
                                    yijVar = (yij) arrayList.get(i8);
                                    while (true) {
                                        i2 = yijVar.b;
                                        if (i9 < i2) {
                                            if (iArr2[i9] == 0 && xijVar.b(i7, i9)) {
                                                int i10 = xijVar.a(i7, i9) ? 8 : 4;
                                                iArr[i7] = (i9 << 4) | i10;
                                                iArr2[i9] = i10 | (i7 << 4);
                                            } else {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                                i9 = yijVar.c + i2;
                                i8++;
                            }
                        }
                        i7++;
                    }
                }
                i7 = yijVar4.c + i;
            }
        }
    }

    public static ajj c(ArrayDeque arrayDeque, int i, boolean z) {
        ajj ajjVar;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                ajjVar = null;
                break;
            }
            ajjVar = (ajj) it.next();
            if (ajjVar.a == i && ajjVar.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            ajj ajjVar2 = (ajj) it.next();
            if (z) {
                ajjVar2.b--;
            } else {
                ajjVar2.b++;
            }
        }
        return ajjVar;
    }

    public final void a(qty qtyVar) {
        int[] iArr;
        xij xijVar;
        int i;
        int i2;
        ArrayList arrayList;
        i iVar = this;
        nf5 nf5Var = qtyVar instanceof nf5 ? (nf5) qtyVar : new nf5(qtyVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = iVar.a;
        boolean z = true;
        int size = arrayList2.size() - 1;
        int i3 = iVar.e;
        int i4 = iVar.f;
        int i5 = i3;
        while (size >= 0) {
            yij yijVar = (yij) arrayList2.get(size);
            int i6 = yijVar.a;
            int i7 = yijVar.c;
            int i8 = i6 + i7;
            int i9 = yijVar.b;
            int i10 = i9 + i7;
            while (true) {
                iArr = iVar.b;
                xijVar = iVar.d;
                boolean z2 = z;
                i = 0;
                if (i5 <= i8) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) != 0) {
                    arrayList = arrayList2;
                    int i12 = i11 >> 4;
                    ajj c = c(arrayDeque, i12, false);
                    if (c != null) {
                        int i13 = (i3 - c.b) - 1;
                        nf5Var.onMoved(i5, i13);
                        if ((i11 & 4) != 0) {
                            nf5Var.onChanged(i13, z2 ? 1 : 0, xijVar.c(i5, i12));
                        }
                    } else {
                        arrayDeque.add(new ajj(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                    }
                } else {
                    arrayList = arrayList2;
                    nf5Var.onRemoved(i5, z2 ? 1 : 0);
                    i3--;
                }
                arrayList2 = arrayList;
                z = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i14 = iVar.c[i4];
                if ((i14 & 12) != 0) {
                    int i15 = i14 >> 4;
                    ajj c2 = c(arrayDeque, i15, true);
                    if (c2 == null) {
                        arrayDeque.add(new ajj(i4, i3 - i5, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        nf5Var.onMoved((i3 - c2.b) - 1, i5);
                        if ((i14 & 4) != 0) {
                            nf5Var.onChanged(i5, 1, xijVar.c(i15, i4));
                        }
                    }
                } else {
                    i2 = i;
                    nf5Var.onInserted(i5, 1);
                    i3++;
                }
                iVar = this;
                i = i2;
            }
            int i16 = i9;
            int i17 = i6;
            while (i < i7) {
                if ((iArr[i17] & 15) == 2) {
                    nf5Var.onChanged(i17, 1, xijVar.c(i17, i16));
                }
                i17++;
                i16++;
                i++;
            }
            size--;
            iVar = this;
            z = true;
            i4 = i9;
            i5 = i6;
            arrayList2 = arrayList3;
        }
        nf5Var.a();
    }

    public final void b(RecyclerView.Adapter adapter) {
        a(new b(adapter));
    }
}
