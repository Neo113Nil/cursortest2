package com.yandex.passport.internal.sloth.performers.usermenu;

import com.yandex.passport.sloth.command.data.x;
import com.yandex.passport.sloth.command.r;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.eyc;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.iqn;
import defpackage.kqn;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d implements s {
    public final h a;

    public d(h hVar) {
        this.a = hVar;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final /* bridge */ /* synthetic */ Object a(SlothParams slothParams, Object obj, Continuation continuation) {
        return b((x) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r10 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(x xVar, ContinuationImpl continuationImpl) {
        ItemClickCommandPerformer$performCommand$1 itemClickCommandPerformer$performCommand$1;
        int i;
        eyc eycVar;
        if (continuationImpl instanceof ItemClickCommandPerformer$performCommand$1) {
            itemClickCommandPerformer$performCommand$1 = (ItemClickCommandPerformer$performCommand$1) continuationImpl;
            int i2 = itemClickCommandPerformer$performCommand$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                itemClickCommandPerformer$performCommand$1.label = i2 - Integer.MIN_VALUE;
                Object obj = itemClickCommandPerformer$performCommand$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = itemClickCommandPerformer$performCommand$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fyc b = gwk0.b();
                    e eVar = new e(xVar.a, new c(b, 0));
                    itemClickCommandPerformer$performCommand$1.L$0 = b;
                    itemClickCommandPerformer$performCommand$1.label = 1;
                    Object emit = this.a.a.emit(eVar, itemClickCommandPerformer$performCommand$1);
                    if (emit != coroutineSingletons) {
                        emit = zy11.a;
                    }
                    if (emit != coroutineSingletons) {
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
                    if (obj instanceof r) {
                        return new iqn(obj);
                    }
                    if (obj instanceof com.yandex.passport.sloth.command.e) {
                        return new kqn(obj);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(obj);
                    sb.append(" is neither ");
                    sb.append(qoi0.a(com.yandex.passport.sloth.command.e.class));
                    b.b(sb, " nor ", qoi0.a(r.class));
                    return null;
                }
                eycVar = (eyc) itemClickCommandPerformer$performCommand$1.L$0;
                kotlin.b.b(obj);
                itemClickCommandPerformer$performCommand$1.L$0 = null;
                itemClickCommandPerformer$performCommand$1.label = 2;
                obj = ((fyc) eycVar).s(itemClickCommandPerformer$performCommand$1);
            }
        }
        itemClickCommandPerformer$performCommand$1 = new ItemClickCommandPerformer$performCommand$1(this, continuationImpl);
        Object obj2 = itemClickCommandPerformer$performCommand$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = itemClickCommandPerformer$performCommand$1.label;
        if (i != 0) {
        }
        itemClickCommandPerformer$performCommand$1.L$0 = null;
        itemClickCommandPerformer$performCommand$1.label = 2;
        obj2 = ((fyc) eycVar).s(itemClickCommandPerformer$performCommand$1);
    }
}
