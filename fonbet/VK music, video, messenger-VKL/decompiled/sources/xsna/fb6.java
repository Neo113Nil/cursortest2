package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: BaseClickableSpan.kt */
/* loaded from: classes18.dex */
public final class fb6 implements l2v0 {
    public final k75 b;

    public fb6(k75 k75Var) {
        this.b = k75Var;
    }

    @Override // xsna.rku0
    public final void a(Context context, View view) {
        this.b.invoke();
    }

    @Override // xsna.rku0
    public final boolean e() {
        return false;
    }

    @Override // xsna.rku0
    public final void f(Context context, View view) {
        this.b.invoke();
    }

    @Override // xsna.l2v0
    public final int getColor() {
        return 0;
    }

    @Override // xsna.l2v0
    public final String i() {
        return null;
    }
}
