package com.yandex.passport.sloth.command.performers;

import android.content.Context;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.iqn;
import defpackage.kqn;
import defpackage.ny61;
import defpackage.qoi0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class m implements com.yandex.passport.sloth.command.q {
    public final Context a;
    public final com.yandex.passport.sloth.v b;
    public final SlothParams c;

    public m(Context context, com.yandex.passport.sloth.v vVar, SlothParams slothParams) {
        this.a = context;
        this.b = vVar;
        this.c = slothParams;
    }

    @Override // com.yandex.passport.sloth.command.q
    public final /* bridge */ /* synthetic */ Object a(Object obj, Continuation continuation) {
        return b(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r8 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        RequestPhoneNumberHintCommandPerformer$performCommand$1 requestPhoneNumberHintCommandPerformer$performCommand$1;
        int i;
        eyc eycVar;
        if (continuation instanceof RequestPhoneNumberHintCommandPerformer$performCommand$1) {
            requestPhoneNumberHintCommandPerformer$performCommand$1 = (RequestPhoneNumberHintCommandPerformer$performCommand$1) continuation;
            int i2 = requestPhoneNumberHintCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requestPhoneNumberHintCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requestPhoneNumberHintCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestPhoneNumberHintCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (com.google.android.gms.common.a.d.d(this.a, 220000000) != 0 || (this.c.getVariant() instanceof com.yandex.passport.sloth.data.v)) {
                        com.yandex.passport.sloth.command.d dVar = com.yandex.passport.sloth.command.d.f;
                        return dVar instanceof com.yandex.passport.sloth.command.r ? new iqn(dVar) : new kqn(dVar);
                    }
                    fyc b = gwk0.b();
                    com.yandex.passport.sloth.t tVar = new com.yandex.passport.sloth.t(new com.yandex.passport.internal.sloth.performers.usermenu.c(b, 2));
                    requestPhoneNumberHintCommandPerformer$performCommand$1.L$0 = b;
                    requestPhoneNumberHintCommandPerformer$performCommand$1.label = 1;
                    if (this.b.b(tVar, requestPhoneNumberHintCommandPerformer$performCommand$1) != coroutineSingletons) {
                        eycVar = b;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    if (obj instanceof com.yandex.passport.sloth.command.r) {
                        return new iqn(obj);
                    }
                    if (obj instanceof com.yandex.passport.sloth.command.e) {
                        return new kqn(obj);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj);
                    sb.append(" is neither ");
                    sb.append(qoi0.a(com.yandex.passport.sloth.command.e.class));
                    com.yandex.passport.internal.sloth.performers.usermenu.b.b(sb, " nor ", qoi0.a(com.yandex.passport.sloth.command.r.class));
                    return null;
                }
                eycVar = (eyc) requestPhoneNumberHintCommandPerformer$performCommand$1.L$0;
                kotlin.b.b(obj);
                requestPhoneNumberHintCommandPerformer$performCommand$1.L$0 = null;
                requestPhoneNumberHintCommandPerformer$performCommand$1.label = 2;
                obj = ((fyc) eycVar).s(requestPhoneNumberHintCommandPerformer$performCommand$1);
            }
        }
        requestPhoneNumberHintCommandPerformer$performCommand$1 = new RequestPhoneNumberHintCommandPerformer$performCommand$1(this, (ContinuationImpl) continuation);
        Object obj2 = requestPhoneNumberHintCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestPhoneNumberHintCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        requestPhoneNumberHintCommandPerformer$performCommand$1.L$0 = null;
        requestPhoneNumberHintCommandPerformer$performCommand$1.label = 2;
        obj2 = ((fyc) eycVar).s(requestPhoneNumberHintCommandPerformer$performCommand$1);
    }
}
