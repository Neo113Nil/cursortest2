package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import ru.yandex.taxi.experiments.p;
import ru.yandex.taxi.experiments.r;

/* loaded from: classes10.dex */
public final class cvx extends r implements hwx {
    public final String b;

    public cvx(p pVar) {
        super(pVar);
        this.b = "LAUNCH_EXPERIMENTS";
    }

    @Override // defpackage.j35
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.w1b0
    public final ExperimentSource getSource() {
        return ExperimentSource.LAUNCH;
    }
}
