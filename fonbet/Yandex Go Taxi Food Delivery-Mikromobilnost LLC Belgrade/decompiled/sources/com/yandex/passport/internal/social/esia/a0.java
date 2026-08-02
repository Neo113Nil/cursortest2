package com.yandex.passport.internal.social.esia;

import defpackage.hs31;
import defpackage.ny61;
import defpackage.tig0;
import defpackage.v1m0;
import defpackage.w1m0;
import defpackage.y8f;
import defpackage.yr31;

/* loaded from: classes15.dex */
public final class a0 implements hs31 {
    public final z a;
    public final EsiaInternalBindProperties b;
    public final SocialismUrlProvider$ActualTheme c;
    public final com.yandex.passport.internal.flags.j w;

    public a0(z zVar, EsiaInternalBindProperties esiaInternalBindProperties, SocialismUrlProvider$ActualTheme socialismUrlProvider$ActualTheme, com.yandex.passport.internal.flags.j jVar) {
        this.a = zVar;
        this.b = esiaInternalBindProperties;
        this.c = socialismUrlProvider$ActualTheme;
        this.w = jVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        v1m0 a = androidx.lifecycle.g0.a(y8fVar);
        w1m0 w1m0Var = a.b;
        EsiaBindViewModel$InternalState esiaBindViewModel$InternalState = (EsiaBindViewModel$InternalState) w1m0Var.a("KEY_STATE");
        if (esiaBindViewModel$InternalState == null) {
            EsiaInternalBindProperties esiaInternalBindProperties = this.b;
            if (esiaInternalBindProperties == null) {
                ny61.r("Missing esia bind properties");
                return null;
            }
            esiaBindViewModel$InternalState = new EsiaBindViewModel$InternalState(this.c, esiaInternalBindProperties, new EsiaBindViewModel$State(null, null, null, ((Boolean) this.w.b(com.yandex.passport.internal.flags.q.g)).booleanValue(), false, 23, null));
        }
        boolean z = w1m0Var.a("KEY_STATE") == null;
        z zVar = this.a;
        com.arkivanov.mvikotlin.main.store.a aVar = zVar.a;
        return new i0(com.arkivanov.mvikotlin.main.store.a.a(esiaBindViewModel$InternalState, new tig0(z ? n.a : o.a), new com.yandex.passport.internal.flags.experiments.h(4, zVar), y.a), a);
    }
}
