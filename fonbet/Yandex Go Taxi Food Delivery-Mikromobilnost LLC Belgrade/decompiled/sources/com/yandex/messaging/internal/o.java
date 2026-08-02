package com.yandex.messaging.internal;

import com.yandex.messaging.core.net.entities.GetSuggestParam;
import defpackage.m8g;
import defpackage.ny61;
import defpackage.s020;
import defpackage.u8t;
import defpackage.vpr;
import defpackage.x4b;
import defpackage.zy11;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u8t b;

    public o(vpr vprVar, u8t u8tVar) {
        this.a = vprVar;
        this.b = u8tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetMentionSuggestUseCase$run$$inlined$map$1$2$1 getMentionSuggestUseCase$run$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Object obj2;
        if (continuation instanceof GetMentionSuggestUseCase$run$$inlined$map$1$2$1) {
            getMentionSuggestUseCase$run$$inlined$map$1$2$1 = (GetMentionSuggestUseCase$run$$inlined$map$1$2$1) continuation;
            int i2 = getMentionSuggestUseCase$run$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getMentionSuggestUseCase$run$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = getMentionSuggestUseCase$run$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getMentionSuggestUseCase$run$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    x4b x4bVar = (x4b) ((m8g) ((s020) obj)).X.get();
                    String str = this.b.a;
                    vprVar = this.a;
                    getMentionSuggestUseCase$run$$inlined$map$1$2$1.L$0 = vprVar;
                    getMentionSuggestUseCase$run$$inlined$map$1$2$1.label = 1;
                    obj3 = x4bVar.b.a(new GetSuggestParam(str, x4bVar.a.b), getMentionSuggestUseCase$run$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj3);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vprVar = (vpr) getMentionSuggestUseCase$run$$inlined$map$1$2$1.L$0;
                    kotlin.b.b(obj3);
                }
                obj2 = (List) obj3;
                if (obj2 == null) {
                    obj2 = EmptyList.a;
                }
                getMentionSuggestUseCase$run$$inlined$map$1$2$1.L$0 = null;
                getMentionSuggestUseCase$run$$inlined$map$1$2$1.label = 2;
            }
        }
        getMentionSuggestUseCase$run$$inlined$map$1$2$1 = new GetMentionSuggestUseCase$run$$inlined$map$1$2$1(this, continuation);
        Object obj32 = getMentionSuggestUseCase$run$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getMentionSuggestUseCase$run$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        obj2 = (List) obj32;
        if (obj2 == null) {
        }
        getMentionSuggestUseCase$run$$inlined$map$1$2$1.L$0 = null;
        getMentionSuggestUseCase$run$$inlined$map$1$2$1.label = 2;
    }
}
