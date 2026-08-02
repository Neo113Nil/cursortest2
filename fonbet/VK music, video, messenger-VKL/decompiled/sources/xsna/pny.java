package xsna;

import java.util.Map;
import xsna.wny;

/* compiled from: LayoutBuilder.kt */
/* loaded from: classes7.dex */
public abstract class pny<T extends wny> {
    public final vpy a = new vpy(new p6y(this, 2));

    public abstract Map<uoy, upy> a(T t);

    public abstract nc b();

    public final void c() {
        nc b = b();
        wny S = b.S();
        if (epx.f((wny) b.b, S)) {
            return;
        }
        b.b = S;
        this.a.c = false;
    }
}
