package xsna;

import xsna.jkp0;

/* compiled from: RemappingProgressListenerAdapter.kt */
/* loaded from: classes3.dex */
public final class rtf0 implements jkp0.a {
    public final jkp0.a a;
    public int b;
    public boolean c;
    public int d;

    public rtf0(jkp0.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.jkp0.a
    public final void a(int i) {
        if (this.c) {
            float f = this.d;
            i = (int) u11.b(100.0f, f, i / 100.0f, f);
        }
        this.a.a(i);
        this.b = Math.max(this.b, i);
    }

    @Override // xsna.jkp0.a
    public final void b(int i) {
        this.a.b(i);
    }
}
