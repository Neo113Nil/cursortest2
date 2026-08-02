package com.yandex.messaging.domain.poll;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wxd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public e(vpr vprVar, String str, long j) {
        this.a = vprVar;
        this.b = str;
        this.c = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PollPendingVotesRepository$updates$$inlined$filter$1$2$1 pollPendingVotesRepository$updates$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof PollPendingVotesRepository$updates$$inlined$filter$1$2$1) {
            pollPendingVotesRepository$updates$$inlined$filter$1$2$1 = (PollPendingVotesRepository$updates$$inlined$filter$1$2$1) continuation;
            int i2 = pollPendingVotesRepository$updates$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollPendingVotesRepository$updates$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pollPendingVotesRepository$updates$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollPendingVotesRepository$updates$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    wxd0 wxd0Var = (wxd0) obj;
                    if (jl40.l(wxd0Var.a, this.b) && wxd0Var.b == this.c) {
                        pollPendingVotesRepository$updates$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, pollPendingVotesRepository$updates$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        pollPendingVotesRepository$updates$$inlined$filter$1$2$1 = new PollPendingVotesRepository$updates$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = pollPendingVotesRepository$updates$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollPendingVotesRepository$updates$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
