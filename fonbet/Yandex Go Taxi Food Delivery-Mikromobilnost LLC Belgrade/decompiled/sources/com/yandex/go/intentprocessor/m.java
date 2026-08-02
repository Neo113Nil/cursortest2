package com.yandex.go.intentprocessor;

import defpackage.k4l0;
import defpackage.q7z;
import defpackage.t7z;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.z7w;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class m implements z7w {
    public final com.yandex.go.preorder.deeplinks.requirement.a a;
    public final com.yandex.go.taxi.tariffs.interactor.b b;
    public final ru.yandex.taxi.personalstate.domain.interactor.j c;
    public final tt2 d;

    public m(com.yandex.go.preorder.deeplinks.requirement.a aVar, com.yandex.go.taxi.tariffs.interactor.b bVar, ru.yandex.taxi.personalstate.domain.interactor.j jVar, tt2 tt2Var) {
        this.a = aVar;
        this.b = bVar;
        this.c = jVar;
        this.d = tt2Var;
    }

    @Override // defpackage.z7w
    public final Object a(t7z t7zVar, Continuation continuation) {
        q7z q7zVar = t7zVar instanceof q7z ? (q7z) t7zVar : null;
        if (q7zVar == null) {
            return k4l0.a;
        }
        this.d.getClass();
        return tje.k0(uyj.a, new RequirementIntentProcessor$process$2(this, q7zVar, null), continuation);
    }
}
