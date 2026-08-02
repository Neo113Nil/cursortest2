package com.yandex.passport.internal.sloth.performers.webcard;

import com.yandex.passport.internal.flags.q;
import com.yandex.passport.sloth.command.data.y0;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.u;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.iqn;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b implements s {
    public final g a;
    public final com.yandex.passport.internal.flags.j b;

    public b(g gVar, com.yandex.passport.internal.flags.j jVar) {
        this.a = gVar;
        this.b = jVar;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final /* bridge */ /* synthetic */ Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        return b((y0) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(y0 y0Var, ContinuationImpl continuationImpl) {
        SetPopupSizeCommandPerformer$performCommand$1 setPopupSizeCommandPerformer$performCommand$1;
        int i;
        if (continuationImpl instanceof SetPopupSizeCommandPerformer$performCommand$1) {
            setPopupSizeCommandPerformer$performCommand$1 = (SetPopupSizeCommandPerformer$performCommand$1) continuationImpl;
            int i2 = setPopupSizeCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setPopupSizeCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = setPopupSizeCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setPopupSizeCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(y0Var.a, y0Var.b, y0Var.c, y0Var.d, y0Var.e, y0Var.f && ((Boolean) this.b.b(q.p)).booleanValue());
                    setPopupSizeCommandPerformer$performCommand$1.label = 1;
                    Object emit = this.a.a.emit(dVar, setPopupSizeCommandPerformer$performCommand$1);
                    if (emit != coroutineSingletons) {
                        emit = zy11.a;
                    }
                    if (emit == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new iqn(u.c);
            }
        }
        setPopupSizeCommandPerformer$performCommand$1 = new SetPopupSizeCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = setPopupSizeCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setPopupSizeCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        return new iqn(u.c);
    }
}
