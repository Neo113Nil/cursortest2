package xsna;

import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SectionSegmenter.java */
/* loaded from: classes7.dex */
public final class c2i0 implements d6i0 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final SparseIntArray c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final SparseIntArray e = new SparseIntArray();
    public int f;

    @Override // xsna.d6i0
    public final int a(int i) {
        return this.e.get(i);
    }

    @Override // xsna.d6i0
    public final int b() {
        return this.f;
    }

    @Override // xsna.d6i0
    public final CharSequence c(int i) {
        return (CharSequence) this.a.get(i);
    }

    @Override // xsna.d6i0
    public final int d(int i) {
        return this.c.get(this.d.get(i, 0), 0);
    }

    @Override // xsna.d6i0
    public final int e(int i) {
        return this.d.get(i);
    }

    public final void f(@NonNull String str, List list) {
        int size = list.size();
        ArrayList arrayList = this.a;
        int size2 = arrayList.size();
        ArrayList arrayList2 = this.b;
        int size3 = arrayList2.size();
        arrayList.add(str);
        this.c.put(size2, size3);
        this.e.put(size2, size);
        this.f++;
        SparseIntArray sparseIntArray = this.d;
        int i = 0;
        if (str != null && !TextUtils.isEmpty(str)) {
            int i2 = size3 + 1;
            arrayList2.add(str);
            sparseIntArray.put(size3, size2);
            size3 = i2;
        }
        while (i < size) {
            int i3 = size3 + 1;
            arrayList2.add(list.get(i));
            sparseIntArray.put(size3, size2);
            i++;
            size3 = i3;
        }
    }

    @Override // xsna.d6i0
    public final <T> T getItem(int i) {
        return (T) this.b.get(i);
    }

    @Override // xsna.d6i0
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // xsna.d6i0
    public final boolean i(int i) {
        return this.c.get(this.d.get(i, -1), -1) == i;
    }
}
