package com.yandex.go.user_profile.main_menu.profile.domain;

import defpackage.hs50;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.experiments.q;
import ru.yandex.taxi.settings.profile.f;

/* loaded from: classes14.dex */
public final class d {
    public final zuj0 a;
    public final ru.yandex.taxi.settings.email.a b;
    public final hs50 c;
    public final f d;

    public d(zuj0 zuj0Var, ru.yandex.taxi.settings.email.a aVar, hs50 hs50Var, f fVar) {
        this.a = zuj0Var;
        this.b = aVar;
        this.c = hs50Var;
        this.d = fVar;
    }

    public final tpr a() {
        r0 r0Var = this.b.h;
        f fVar = this.d;
        tpr t = e.t(new ru.yandex.taxi.settings.profile.e(ru.yandex.taxi.experiments.d.b((q) fVar.b.getValue()), fVar));
        fVar.a.getClass();
        sjh sjhVar = uyj.a;
        return e.t(e.n(r0Var, e.F(t, mdh.b), this.c.c, new ProfileUserEmailInteractor$userEmailFlow$1(this, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ProfileUserEmailInteractor$refreshEmailData$1 profileUserEmailInteractor$refreshEmailData$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ProfileUserEmailInteractor$refreshEmailData$1) {
            profileUserEmailInteractor$refreshEmailData$1 = (ProfileUserEmailInteractor$refreshEmailData$1) continuationImpl;
            int i2 = profileUserEmailInteractor$refreshEmailData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileUserEmailInteractor$refreshEmailData$1.label = i2 - Integer.MIN_VALUE;
                obj = profileUserEmailInteractor$refreshEmailData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileUserEmailInteractor$refreshEmailData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    profileUserEmailInteractor$refreshEmailData$1.label = 1;
                    obj = this.d.a(profileUserEmailInteractor$refreshEmailData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    this.b.d();
                }
                return zy11.a;
            }
        }
        profileUserEmailInteractor$refreshEmailData$1 = new ProfileUserEmailInteractor$refreshEmailData$1(this, continuationImpl);
        obj = profileUserEmailInteractor$refreshEmailData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileUserEmailInteractor$refreshEmailData$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
