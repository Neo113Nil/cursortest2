package defpackage;

import ru.yandex.taxi.analytics.MainScreenVersion;

/* loaded from: classes9.dex */
public final class m1w0 implements vw60 {
    public final h3y a;
    public final k42 b;

    public m1w0(h3y h3yVar, k42 k42Var) {
        this.a = h3yVar;
        this.b = k42Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        ic00 ic00Var = ((kc00) ((jc00) this.a.get())).a;
        ic00Var.getClass();
        this.b.a = ic00Var instanceof hc00 ? MainScreenVersion.FLEX : MainScreenVersion.SHORTCUTS;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "SuperAppMainScreenExperimentActivityListener";
    }
}
