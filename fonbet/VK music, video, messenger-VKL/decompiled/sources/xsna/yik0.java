package xsna;

import android.util.SparseArray;
import java.util.Iterator;

/* compiled from: Iterables.kt */
/* loaded from: classes17.dex */
public final class yik0 implements Iterable<Object>, gcy {
    public final /* synthetic */ SparseArray b;

    public yik0(SparseArray sparseArray) {
        this.b = sparseArray;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new ajk0(this.b);
    }
}
