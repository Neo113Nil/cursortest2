package xsna;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* loaded from: classes13.dex */
public final class jq9 extends de {
    public final Typeface b;
    public final a c;
    public boolean d;

    /* compiled from: CancelableFontCallback.java */
    public interface a {
        void a(Typeface typeface);
    }

    public jq9(a aVar, Typeface typeface) {
        this.b = typeface;
        this.c = aVar;
    }

    @Override // xsna.de
    public final void m0(int i) {
        if (this.d) {
            return;
        }
        this.c.a(this.b);
    }

    @Override // xsna.de
    public final void n0(Typeface typeface, boolean z) {
        if (this.d) {
            return;
        }
        this.c.a(typeface);
    }
}
