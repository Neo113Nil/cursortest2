package defpackage;

import androidx.room.i;
import androidx.sqlite.driver.a;

/* loaded from: classes.dex */
public final class fwk0 extends jkw0 {
    public final /* synthetic */ i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwk0(i iVar, int i) {
        super(i);
        this.b = iVar;
    }

    @Override // defpackage.jkw0
    public final void b(ufs ufsVar) {
        this.b.f(new a(ufsVar));
    }

    @Override // defpackage.jkw0
    public final void c(ufs ufsVar, int i, int i2) {
        e(ufsVar, i, i2);
    }

    @Override // defpackage.jkw0
    public final void d(ufs ufsVar) {
        a aVar = new a(ufsVar);
        i iVar = this.b;
        iVar.h(aVar);
        iVar.h = ufsVar;
    }

    @Override // defpackage.jkw0
    public final void e(hkw0 hkw0Var, int i, int i2) {
        this.b.g(new a(hkw0Var), i, i2);
    }
}
