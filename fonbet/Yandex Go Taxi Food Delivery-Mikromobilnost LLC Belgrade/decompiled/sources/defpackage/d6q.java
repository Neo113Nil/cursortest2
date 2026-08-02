package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import com.yandex.go.quark.soul.experiments.SoulAiAssistantExperiment;

/* loaded from: classes4.dex */
public final class d6q implements v7p {
    public static d6q a() {
        return c6q.a;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        return new clw0("ai_assistant", SoulAiAssistantExperiment.class, new thp(16), ExperimentSource.PRODUCTS, true);
    }
}
