package xsna;

import android.graphics.Typeface;
import xsna.dbg0;

/* compiled from: AndroidFontLoader.android.kt */
/* loaded from: classes11.dex */
public final class w82 extends dbg0.c {
    public final /* synthetic */ lq9 a;
    public final /* synthetic */ uag0 b;

    public w82(lq9 lq9Var, uag0 uag0Var) {
        this.a = lq9Var;
        this.b = uag0Var;
    }

    @Override // xsna.dbg0.c
    public final void b(int i) {
        this.a.z(new IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ')'));
    }

    @Override // xsna.dbg0.c
    public final void c(Typeface typeface) {
        this.a.resumeWith(typeface);
    }
}
