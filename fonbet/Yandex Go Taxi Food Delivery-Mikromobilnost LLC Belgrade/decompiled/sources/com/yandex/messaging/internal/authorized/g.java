package com.yandex.messaging.internal.authorized;

import com.yandex.messaging.core.net.entities.GetSuggestParam;
import com.yandex.messaging.internal.GetMentionSuggestUseCase$run$$inlined$map$1$2$1;
import defpackage.k020;
import defpackage.kse;
import defpackage.tje;
import defpackage.to3;

/* loaded from: classes15.dex */
public final class g {
    public final to3 a;
    public final k020 b;
    public final kse c;

    public g(to3 to3Var, k020 k020Var, kse kseVar) {
        this.a = to3Var;
        this.b = k020Var;
        this.c = kseVar;
    }

    public final Object a(GetSuggestParam getSuggestParam, GetMentionSuggestUseCase$run$$inlined$map$1$2$1 getMentionSuggestUseCase$run$$inlined$map$1$2$1) {
        return tje.k0(this.c.e, new SuggestController$getSuggest$2(getSuggestParam, this, null), getMentionSuggestUseCase$run$$inlined$map$1$2$1);
    }
}
