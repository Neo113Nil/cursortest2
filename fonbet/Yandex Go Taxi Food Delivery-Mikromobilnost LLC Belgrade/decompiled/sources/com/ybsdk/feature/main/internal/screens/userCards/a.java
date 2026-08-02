package com.ybsdk.feature.main.internal.screens.userCards;

import com.ybsdk.core.utils.text.Text;
import defpackage.ab0;
import defpackage.dzh0;
import defpackage.e3n;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.o430;
import defpackage.uk21;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xa0;
import defpackage.ya0;
import defpackage.za0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ab0 ab0Var, Continuation continuation) {
        UserCardsViewModel$2$emit$1 userCardsViewModel$2$emit$1;
        int i;
        if (continuation instanceof UserCardsViewModel$2$emit$1) {
            userCardsViewModel$2$emit$1 = (UserCardsViewModel$2$emit$1) continuation;
            int i2 = userCardsViewModel$2$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userCardsViewModel$2$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userCardsViewModel$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userCardsViewModel$2$emit$1.label;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(ab0Var, ya0.a)) {
                        bVar.Z(new uk21(new n0t0(new Text.Resource(dzh0.ybsdk_deposit_card_bind_failed), Text.Empty.INSTANCE)));
                    } else if (ab0Var instanceof za0) {
                        o430 o430Var = e3n.b;
                        long U = kp50.U(1000, DurationUnit.MILLISECONDS);
                        userCardsViewModel$2$emit$1.label = 1;
                        if (kotlinx.coroutines.a.j(U, userCardsViewModel$2$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (!jl40.l(ab0Var, xa0.a)) {
                        w511.b();
                        return null;
                    }
                    bVar.f0();
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                new Text.Resource(dzh0.ybsdk_deposit_card_bind_succeed);
                Text.Empty empty = Text.Empty.INSTANCE;
                bVar.f0();
                return zy11.a;
            }
        }
        userCardsViewModel$2$emit$1 = new UserCardsViewModel$2$emit$1(this, continuation);
        Object obj2 = userCardsViewModel$2$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userCardsViewModel$2$emit$1.label;
        b bVar2 = this.a;
        if (i != 0) {
        }
        new Text.Resource(dzh0.ybsdk_deposit_card_bind_succeed);
        Text.Empty empty2 = Text.Empty.INSTANCE;
        bVar2.f0();
        return zy11.a;
    }
}
