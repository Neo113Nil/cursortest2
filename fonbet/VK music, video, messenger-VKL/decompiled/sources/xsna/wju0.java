package xsna;

import xsna.xju0;

/* compiled from: VkCheckEditTextAdapter.kt */
/* loaded from: classes15.dex */
public final class wju0 {
    public final /* synthetic */ xju0.a a;

    public wju0(xju0.a aVar) {
        this.a = aVar;
    }

    public final int a() {
        return this.a.getBindingAdapterPosition() + 1;
    }

    public final String b() {
        return String.valueOf(this.a.p.getText());
    }

    public final String c() {
        return this.a.o.invoke();
    }

    public final boolean d() {
        return this.a.n.invoke().booleanValue();
    }

    public final boolean e() {
        return a() == 1;
    }
}
