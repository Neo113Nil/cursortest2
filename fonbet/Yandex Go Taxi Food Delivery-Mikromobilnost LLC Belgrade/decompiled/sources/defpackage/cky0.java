package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes11.dex */
public final class cky0 extends eky0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ eky0 c;
    public final /* synthetic */ dky0 d;

    public cky0(dky0 dky0Var, Context context, TextPaint textPaint, eky0 eky0Var) {
        this.d = dky0Var;
        this.a = context;
        this.b = textPaint;
        this.c = eky0Var;
    }

    @Override // defpackage.eky0
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.eky0
    public final void b(Typeface typeface, boolean z) {
        this.d.f(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
