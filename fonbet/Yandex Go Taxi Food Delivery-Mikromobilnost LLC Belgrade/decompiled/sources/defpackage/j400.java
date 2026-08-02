package defpackage;

/* loaded from: classes9.dex */
public abstract class j400 extends jse {
    @Override // defpackage.jse
    public final jse P(int i) {
        cma1.n(i);
        return this;
    }

    public abstract g6u R();

    @Override // defpackage.jse
    public String toString() {
        g6u g6uVar;
        String str;
        sjh sjhVar = uyj.a;
        g6u g6uVar2 = o400.a;
        if (this == g6uVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                g6uVar = g6uVar2.x;
            } catch (UnsupportedOperationException unused) {
                g6uVar = null;
            }
            str = this == g6uVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + wwg.s(this);
    }
}
