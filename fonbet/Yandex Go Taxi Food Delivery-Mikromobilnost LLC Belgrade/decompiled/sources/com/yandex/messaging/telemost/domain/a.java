package com.yandex.messaging.telemost.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.x10;
import defpackage.x270;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OngoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1 ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OngoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1) {
            ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1 = (OngoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1) continuation;
            int i2 = ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    x270 x270Var = new x270((x10) obj);
                    ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(x270Var, ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1 = new OngoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ongoingMeetingInteractor$getOngoingMeetingStatus$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
