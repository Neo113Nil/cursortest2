package defpackage;

import android.content.Context;
import com.yandex.go.loyalty.impl.selector.domain.d;
import com.yandex.go.loyalty.impl.selector.ui.b;

/* loaded from: classes12.dex */
public final class hwz extends pgd {
    public final Context F;
    public final w030 G;
    public final d H;
    public final h1t I;
    public final p1b J;

    public hwz(Context context, w030 w030Var, b bVar, d dVar, h1t h1tVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = dVar;
        this.I = h1tVar;
        this.J = new p1b(bVar, new ptw(25, this));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.J;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
