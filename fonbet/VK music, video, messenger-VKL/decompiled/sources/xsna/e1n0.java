package xsna;

import android.util.SparseArray;
import xsna.a1n0;

/* compiled from: SubtitleTranscodingExtractorOutput.java */
/* loaded from: classes12.dex */
public final class e1n0 implements rgq {
    public final rgq b;
    public final a1n0.a c;
    public final SparseArray<g1n0> d = new SparseArray<>();
    public boolean e;

    public e1n0(rgq rgqVar, a1n0.a aVar) {
        this.b = rgqVar;
        this.c = aVar;
    }

    @Override // xsna.rgq
    public final void endTracks() {
        this.b.endTracks();
        if (!this.e) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray<g1n0> sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i).i = true;
            i++;
        }
    }

    @Override // xsna.rgq
    public final void f(n3i0 n3i0Var) {
        this.b.f(n3i0Var);
    }

    @Override // xsna.rgq
    public final rgp0 track(int i, int i2) {
        rgq rgqVar = this.b;
        if (i2 != 3) {
            this.e = true;
            return rgqVar.track(i, i2);
        }
        SparseArray<g1n0> sparseArray = this.d;
        g1n0 g1n0Var = sparseArray.get(i);
        if (g1n0Var != null) {
            return g1n0Var;
        }
        g1n0 g1n0Var2 = new g1n0(rgqVar.track(i, i2), this.c);
        sparseArray.put(i, g1n0Var2);
        return g1n0Var2;
    }
}
