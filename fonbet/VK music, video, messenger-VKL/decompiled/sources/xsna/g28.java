package xsna;

import xsna.d3f;

/* compiled from: BorderlessTextArea.kt */
/* loaded from: classes16.dex */
public final class g28 extends d3f {
    public d3f.a b;

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        d3f.a aVar = this.b;
        if (aVar != null) {
            aVar.b(i, i2);
        }
    }

    @Override // xsna.d3f
    public void setSelectionChangeListener(d3f.a aVar) {
        this.b = aVar;
    }
}
