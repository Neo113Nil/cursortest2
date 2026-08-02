package com.yandex.passport.internal.sloth.performers.webcard;

import com.yandex.passport.internal.usecase.ui.m;
import com.yandex.passport.internal.usecase.ui.n;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.u;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.data.b0;
import defpackage.iqn;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a implements s {
    public final g a;
    public final n b;

    public a(g gVar, n nVar) {
        this.a = gVar;
        this.b = nVar;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final /* bridge */ /* synthetic */ Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        return b(slothParams, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(SlothParams slothParams, Continuation continuation) {
        BeginChangePasswordFlowCommandPerformer$performCommand$1 beginChangePasswordFlowCommandPerformer$performCommand$1;
        int i;
        if (continuation instanceof BeginChangePasswordFlowCommandPerformer$performCommand$1) {
            beginChangePasswordFlowCommandPerformer$performCommand$1 = (BeginChangePasswordFlowCommandPerformer$performCommand$1) continuation;
            int i2 = beginChangePasswordFlowCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                beginChangePasswordFlowCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = beginChangePasswordFlowCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = beginChangePasswordFlowCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (slothParams.getVariant() instanceof b0) {
                        m mVar = new m(((b0) slothParams.getVariant()).b);
                        beginChangePasswordFlowCommandPerformer$performCommand$1.L$0 = this;
                        beginChangePasswordFlowCommandPerformer$performCommand$1.label = 1;
                        obj = this.b.a(mVar, beginChangePasswordFlowCommandPerformer$performCommand$1);
                    }
                    return new iqn(u.c);
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return new iqn(u.c);
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (a) beginChangePasswordFlowCommandPerformer$performCommand$1.L$0;
                kotlin.b.b(obj);
                Object value = ((Result) obj).getValue();
                g gVar = this.a;
                c cVar = new c(value);
                beginChangePasswordFlowCommandPerformer$performCommand$1.L$0 = null;
                beginChangePasswordFlowCommandPerformer$performCommand$1.label = 2;
                Object emit = gVar.a.emit(cVar, beginChangePasswordFlowCommandPerformer$performCommand$1);
                if (emit != coroutineSingletons) {
                    emit = zy11.a;
                }
            }
        }
        beginChangePasswordFlowCommandPerformer$performCommand$1 = new BeginChangePasswordFlowCommandPerformer$performCommand$1(this, (ContinuationImpl) continuation);
        Object obj2 = beginChangePasswordFlowCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = beginChangePasswordFlowCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
    }
}
