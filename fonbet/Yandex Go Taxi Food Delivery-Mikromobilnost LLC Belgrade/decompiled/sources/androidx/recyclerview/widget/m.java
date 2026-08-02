package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class m {
    public int[] a;
    public List b;

    public final void a(FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        int size = this.b.size();
        int i = 0;
        while (true) {
            List list = this.b;
            if (i >= size) {
                list.add(flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
            FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) list.get(i);
            if (flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.mPosition == flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition) {
                this.b.remove(i);
            }
            if (flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.mPosition >= flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition) {
                this.b.add(i, flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
                return;
            }
            i++;
        }
    }

    public final void b() {
        int[] iArr = this.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.b = null;
    }

    public final void c(int i) {
        int[] iArr = this.a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void d(int i) {
        List list = this.b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(size)).mPosition >= i) {
                    this.b.remove(size);
                }
            }
        }
        g(i);
    }

    public final FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e(int i, int i2, int i3) {
        List list = this.b;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(i4);
            int i5 = flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mGapDir == i3 || flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mHasUnwantedGapAfter)) {
                return flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    public final FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f(int i) {
        List list = this.b;
        if (list == null) {
            return null;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(size);
            if (flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition == i) {
                return flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(int i) {
        int i2;
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        if (this.b != null) {
            FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (((FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(i3)).mPosition >= i) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(i3);
                this.b.remove(i3);
                i2 = flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition;
                int[] iArr2 = this.a;
                if (i2 != -1) {
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.a.length;
                }
                int min = Math.min(i2 + 1, iArr2.length);
                Arrays.fill(this.a, i, min, -1);
                return min;
            }
        }
        i2 = -1;
        int[] iArr22 = this.a;
        if (i2 != -1) {
        }
    }

    public final void h(int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        c(i3);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.a, i, i3, -1);
        List list = this.b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(size);
            int i4 = flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition;
            if (i4 >= i) {
                flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition = i4 + i2;
            }
        }
    }

    public final void i(int i, int i2) {
        int[] iArr = this.a;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        c(i3);
        int[] iArr2 = this.a;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.a;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        List list = this.b;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.b.get(size);
            int i4 = flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.b.remove(size);
                } else {
                    flexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.mPosition = i4 - i2;
                }
            }
        }
    }
}
