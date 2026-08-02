package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;

/* compiled from: TextAppearance.java */
/* loaded from: classes13.dex */
public final class vbo0 extends de {
    public final /* synthetic */ Context b;
    public final /* synthetic */ TextPaint c;
    public final /* synthetic */ de d;
    public final /* synthetic */ ubo0 e;

    public vbo0(ubo0 ubo0Var, Context context, TextPaint textPaint, de deVar) {
        this.e = ubo0Var;
        this.b = context;
        this.c = textPaint;
        this.d = deVar;
    }

    @Override // xsna.de
    public final void m0(int i) {
        this.d.m0(i);
    }

    @Override // xsna.de
    public final void n0(@NonNull Typeface typeface, boolean z) {
        this.e.g(this.b, this.c, typeface);
        this.d.n0(typeface, z);
    }
}
