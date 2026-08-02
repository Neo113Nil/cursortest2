package xsna;

import android.util.SparseArray;
import xsna.fx10;
import xsna.jqf0;

/* compiled from: RegisteredMediaRouteProvider.java */
/* loaded from: classes12.dex */
public final class iqf0 implements Runnable {
    public final /* synthetic */ jqf0.a b;

    public iqf0(jqf0.a aVar) {
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray<fx10.c> sparseArray = this.b.i;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).a(null);
        }
        sparseArray.clear();
    }
}
