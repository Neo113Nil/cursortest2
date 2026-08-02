package com.yandex.go.safety.center;

import defpackage.dqe0;
import kotlinx.coroutines.flow.o;

/* loaded from: classes13.dex */
public final class m {
    public final ru.yandex.taxi.stories.domain.b a;
    public final dqe0 b;

    public m(ru.yandex.taxi.stories.domain.b bVar, dqe0 dqe0Var) {
        this.a = bVar;
        this.b = dqe0Var;
    }

    public final o a() {
        return new o(new kotlinx.coroutines.flow.n(this.a.e.b("safety_center"), new SafetyCenterStoriesInteractor$loadStoriesFlow$1(this, "safety_center", null)), new SafetyCenterStoriesInteractor$loadStoriesFlow$2(3, null));
    }
}
