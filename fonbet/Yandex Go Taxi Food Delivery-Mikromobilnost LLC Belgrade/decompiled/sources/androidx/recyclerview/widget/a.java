package androidx.recyclerview.widget;

import defpackage.kbs;
import defpackage.m6e0;
import defpackage.n370;
import defpackage.ny61;
import defpackage.o370;
import defpackage.u70;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements n370 {
    public final k0 w;
    public final m6e0 a = new m6e0(30);
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int y = 0;
    public final o370 x = new o370(this);

    public a(k0 k0Var) {
        this.w = k0Var;
    }

    @Override // defpackage.n370
    public final void a(u70 u70Var) {
        u70Var.c = null;
        this.a.a0(u70Var);
    }

    @Override // defpackage.n370
    public final u70 b(int i, Object obj, int i2, int i3) {
        u70 u70Var = (u70) this.a.a();
        if (u70Var == null) {
            return new u70(i, obj, i2, i3);
        }
        u70Var.a = i;
        u70Var.b = i2;
        u70Var.d = i3;
        u70Var.c = obj;
        return u70Var;
    }

    public final boolean c(int i) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            u70 u70Var = (u70) arrayList.get(i2);
            int i3 = u70Var.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = u70Var.b;
                    int i5 = u70Var.d + i4;
                    while (i4 < i5) {
                        if (h(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (h(u70Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.w.a((u70) arrayList.get(i));
        }
        l(arrayList);
        this.y = 0;
    }

    public final void e() {
        d();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u70 u70Var = (u70) arrayList.get(i);
            int i2 = u70Var.a;
            k0 k0Var = this.w;
            if (i2 == 1) {
                k0Var.a(u70Var);
                int i3 = u70Var.b;
                int i4 = u70Var.d;
                RecyclerView recyclerView = k0Var.a;
                recyclerView.offsetPositionRecordsForInsert(i3, i4);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i2 == 2) {
                k0Var.a(u70Var);
                int i5 = u70Var.b;
                int i6 = u70Var.d;
                RecyclerView recyclerView2 = k0Var.a;
                recyclerView2.offsetPositionRecordsForRemove(i5, i6, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.c += i6;
            } else if (i2 == 4) {
                k0Var.a(u70Var);
                int i7 = u70Var.b;
                int i8 = u70Var.d;
                Object obj = u70Var.c;
                RecyclerView recyclerView3 = k0Var.a;
                recyclerView3.viewRangeUpdate(i7, i8, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i2 == 8) {
                k0Var.a(u70Var);
                int i9 = u70Var.b;
                int i10 = u70Var.d;
                RecyclerView recyclerView4 = k0Var.a;
                recyclerView4.offsetPositionRecordsForMove(i9, i10);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        l(arrayList);
        this.y = 0;
    }

    public final void f(u70 u70Var) {
        int i;
        m6e0 m6e0Var;
        int i2 = u70Var.a;
        if (i2 == 1 || i2 == 8) {
            ny61.g("should not dispatch add or move for pre layout");
            return;
        }
        int m = m(u70Var.b, i2);
        int i3 = u70Var.b;
        int i4 = u70Var.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                kbs.f(u70Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = u70Var.d;
            m6e0Var = this.a;
            if (i5 >= i7) {
                break;
            }
            int m2 = m((i * i5) + u70Var.b, u70Var.a);
            int i8 = u70Var.a;
            if (i8 == 2 ? m2 != m : !(i8 == 4 && m2 == m + 1)) {
                u70 b = b(i8, u70Var.c, m, i6);
                g(b, i3);
                b.c = null;
                m6e0Var.a0(b);
                if (u70Var.a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                m = m2;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = u70Var.c;
        u70Var.c = null;
        m6e0Var.a0(u70Var);
        if (i6 > 0) {
            u70 b2 = b(u70Var.a, obj, m, i6);
            g(b2, i3);
            b2.c = null;
            m6e0Var.a0(b2);
        }
    }

    public final void g(u70 u70Var, int i) {
        k0 k0Var = this.w;
        k0Var.a(u70Var);
        int i2 = u70Var.a;
        if (i2 == 2) {
            int i3 = u70Var.d;
            RecyclerView recyclerView = k0Var.a;
            recyclerView.offsetPositionRecordsForRemove(i, i3, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.c += i3;
            return;
        }
        if (i2 != 4) {
            ny61.g("only remove and update ops can be dispatched in first pass");
            return;
        }
        int i4 = u70Var.d;
        Object obj = u70Var.c;
        RecyclerView recyclerView2 = k0Var.a;
        recyclerView2.viewRangeUpdate(i, i4, obj);
        recyclerView2.mItemsChanged = true;
    }

    public final int h(int i, int i2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            u70 u70Var = (u70) arrayList.get(i2);
            int i3 = u70Var.a;
            int i4 = u70Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = u70Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (u70Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = u70Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += u70Var.d;
            }
            i2++;
        }
        return i;
    }

    public final boolean i() {
        return this.b.size() > 0;
    }

    public final void j(u70 u70Var) {
        this.c.add(u70Var);
        int i = u70Var.a;
        k0 k0Var = this.w;
        if (i == 1) {
            int i2 = u70Var.b;
            int i3 = u70Var.d;
            RecyclerView recyclerView = k0Var.a;
            recyclerView.offsetPositionRecordsForInsert(i2, i3);
            recyclerView.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 2) {
            int i4 = u70Var.b;
            int i5 = u70Var.d;
            RecyclerView recyclerView2 = k0Var.a;
            recyclerView2.offsetPositionRecordsForRemove(i4, i5, false);
            recyclerView2.mItemsAddedOrRemoved = true;
            return;
        }
        if (i == 4) {
            int i6 = u70Var.b;
            int i7 = u70Var.d;
            Object obj = u70Var.c;
            RecyclerView recyclerView3 = k0Var.a;
            recyclerView3.viewRangeUpdate(i6, i7, obj);
            recyclerView3.mItemsChanged = true;
            return;
        }
        if (i != 8) {
            kbs.f(u70Var, "Unknown update op type for ");
            return;
        }
        int i8 = u70Var.b;
        int i9 = u70Var.d;
        RecyclerView recyclerView4 = k0Var.a;
        recyclerView4.offsetPositionRecordsForMove(i8, i9);
        recyclerView4.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        boolean z;
        char c;
        o370 o370Var = this.x;
        ArrayList arrayList = this.b;
        o370Var.n(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u70 u70Var = (u70) arrayList.get(i);
            int i2 = u70Var.a;
            if (i2 != 1) {
                m6e0 m6e0Var = this.a;
                k0 k0Var = this.w;
                char c2 = 65535;
                if (i2 == 2) {
                    int i3 = u70Var.b;
                    int i4 = u70Var.d + i3;
                    int i5 = i3;
                    int i6 = 0;
                    while (i5 < i4) {
                        RecyclerView recyclerView = k0Var.a;
                        x0 findViewHolderForPosition = recyclerView.findViewHolderForPosition(i5, true);
                        if (findViewHolderForPosition != null) {
                            if (recyclerView.mChildHelper.c.contains(findViewHolderForPosition.a)) {
                                int i7 = RecyclerView.HORIZONTAL;
                            }
                            if (findViewHolderForPosition == null || c(i5)) {
                                if (c2 != 0) {
                                    f(b(2, null, i3, i6));
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c = 1;
                            } else {
                                if (c2 == 1) {
                                    j(b(2, null, i3, i6));
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c = 0;
                            }
                            if (z) {
                                i6++;
                            } else {
                                i5 -= i6;
                                i4 -= i6;
                                i6 = 1;
                            }
                            i5++;
                            c2 = c;
                        }
                        findViewHolderForPosition = null;
                        if (findViewHolderForPosition == null) {
                        }
                        if (c2 != 0) {
                        }
                        c = 1;
                        if (z) {
                        }
                        i5++;
                        c2 = c;
                    }
                    if (i6 != u70Var.d) {
                        u70Var.c = null;
                        m6e0Var.a0(u70Var);
                        u70Var = b(2, null, i3, i6);
                    }
                    if (c2 == 0) {
                        f(u70Var);
                    } else {
                        j(u70Var);
                    }
                } else if (i2 == 4) {
                    int i8 = u70Var.b;
                    int i9 = u70Var.d + i8;
                    boolean z2 = -1;
                    int i10 = 0;
                    int i11 = i8;
                    while (i8 < i9) {
                        RecyclerView recyclerView2 = k0Var.a;
                        x0 findViewHolderForPosition2 = recyclerView2.findViewHolderForPosition(i8, true);
                        if (findViewHolderForPosition2 != null) {
                            if (recyclerView2.mChildHelper.c.contains(findViewHolderForPosition2.a)) {
                                int i12 = RecyclerView.HORIZONTAL;
                            }
                            if (findViewHolderForPosition2 == null || c(i8)) {
                                if (!z2) {
                                    f(b(4, u70Var.c, i11, i10));
                                    i11 = i8;
                                    i10 = 0;
                                }
                                z2 = true;
                            } else {
                                if (z2) {
                                    j(b(4, u70Var.c, i11, i10));
                                    i11 = i8;
                                    i10 = 0;
                                }
                                z2 = false;
                            }
                            i10++;
                            i8++;
                        }
                        findViewHolderForPosition2 = null;
                        if (findViewHolderForPosition2 == null) {
                        }
                        if (!z2) {
                        }
                        z2 = true;
                        i10++;
                        i8++;
                    }
                    if (i10 != u70Var.d) {
                        Object obj = u70Var.c;
                        u70Var.c = null;
                        m6e0Var.a0(u70Var);
                        u70Var = b(4, obj, i11, i10);
                    }
                    if (z2) {
                        j(u70Var);
                    } else {
                        f(u70Var);
                    }
                } else if (i2 == 8) {
                    j(u70Var);
                }
            } else {
                j(u70Var);
            }
        }
        arrayList.clear();
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a((u70) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final int m(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u70 u70Var = (u70) arrayList.get(size);
            int i5 = u70Var.a;
            int i6 = u70Var.b;
            if (i5 == 8) {
                int i7 = u70Var.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            u70Var.b = i6 + 1;
                            u70Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            u70Var.b = i6 - 1;
                            u70Var.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        u70Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        u70Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        u70Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        u70Var.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= u70Var.d;
                } else if (i5 == 2) {
                    i += u70Var.d;
                }
            } else if (i2 == 1) {
                u70Var.b = i6 + 1;
            } else if (i2 == 2) {
                u70Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            u70 u70Var2 = (u70) arrayList.get(size2);
            int i8 = u70Var2.a;
            int i9 = u70Var2.d;
            m6e0 m6e0Var = this.a;
            if (i8 == 8) {
                if (i9 == u70Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    u70Var2.c = null;
                    m6e0Var.a0(u70Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                u70Var2.c = null;
                m6e0Var.a0(u70Var2);
            }
        }
        return i;
    }
}
