package com.yandex.go.lottie_loader.domain.interactors;

import com.yandex.go.lottie_loader.data.repositories.d;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class a {
    public final d a;
    public final tt2 b;

    public a(d dVar, tt2 tt2Var) {
        this.a = dVar;
        this.b = tt2Var;
    }

    public final Object a(String str, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new LottieAnimationInteractor$isAnimationCached$2(this, str, null), continuation);
    }

    public final Object b(String str, Continuation continuation) {
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new LottieAnimationInteractor$loadAnimation$2(this, str, null), continuation);
    }
}
