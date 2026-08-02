package defpackage;

import com.yandex.go.shortcuts.impl.experiments.SuperAppShortcutsExperiment;
import ru.yandex.taxi.e;

/* loaded from: classes5.dex */
public final class j900 implements f900 {
    public final zuj0 a;
    public final e b;
    public final f7w0 c;

    public j900(zuj0 zuj0Var, e eVar, f7w0 f7w0Var) {
        this.a = zuj0Var;
        this.b = eVar;
        this.c = f7w0Var;
    }

    @Override // defpackage.f900
    public final String a() {
        e eVar = this.b;
        rtb0 j = eVar.j((rtb0) eVar.e().c());
        String Y = d6z.Y(j, j.f);
        if (evu0.J(Y)) {
            SuperAppShortcutsExperiment superAppShortcutsExperiment = (SuperAppShortcutsExperiment) this.c.a.c();
            superAppShortcutsExperiment.getClass();
            Y = d6z.Y(superAppShortcutsExperiment, "from");
            if (evu0.J(Y)) {
                return ((avj0) this.a).h(kyh0.new_mainscreen_from);
            }
        }
        return Y;
    }

    @Override // defpackage.f900
    public final String b() {
        SuperAppShortcutsExperiment superAppShortcutsExperiment = (SuperAppShortcutsExperiment) this.c.a.c();
        superAppShortcutsExperiment.getClass();
        String Y = d6z.Y(superAppShortcutsExperiment, "pending");
        if (!evu0.J(Y)) {
            return Y;
        }
        return ((avj0) this.a).h(kyh0.new_mainscreen_pending);
    }
}
