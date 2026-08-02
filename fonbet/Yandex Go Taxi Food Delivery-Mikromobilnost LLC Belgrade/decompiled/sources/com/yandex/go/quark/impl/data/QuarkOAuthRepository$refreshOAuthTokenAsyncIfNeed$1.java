package com.yandex.go.quark.impl.data;

import defpackage.cne0;
import defpackage.g050;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.impl.data.QuarkOAuthRepository$refreshOAuthTokenAsyncIfNeed$1", f = "QuarkOAuthRepository.kt", l = {49, 35, 36}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class QuarkOAuthRepository$refreshOAuthTokenAsyncIfNeed$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarkOAuthRepository$refreshOAuthTokenAsyncIfNeed$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuarkOAuthRepository$refreshOAuthTokenAsyncIfNeed$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QuarkOAuthRepository$refreshOAuthTokenAsyncIfNeed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x007a, code lost:
    
        if (r11.a(r10) == r0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00c5 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #1 {all -> 0x0025, blocks: (B:8:0x0020, B:9:0x00bd, B:11:0x00c5), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #2 {all -> 0x00d6, blocks: (B:26:0x009e, B:29:0x00a3, B:32:0x00a8, B:44:0x007d, B:46:0x008f), top: B:43:0x007d }] */
    /* JADX WARN: Type inference failed for: r10v11, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [g050] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r5v7, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v11, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        kotlinx.coroutines.sync.a aVar;
        Object d;
        Throwable th;
        ?? r10;
        String str;
        b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                if (((cne0) ((i3y) this.this$0.a.b).getValue()).f("oauth_token_has_quark_scopes")) {
                    return zy11Var;
                }
                bVar = this.this$0;
                aVar = bVar.e;
                this.L$0 = aVar;
                this.L$1 = bVar;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar2 = (b) this.L$1;
                        r10 = (g050) this.L$0;
                        try {
                            kotlin.b.b(obj);
                            r10 = r10;
                            if (((Boolean) obj).booleanValue()) {
                                ((cne0) ((i3y) bVar2.a.b).getValue()).u("oauth_token_has_quark_scopes", true);
                            }
                            aVar = r10;
                            aVar.d(null);
                            return zy11Var;
                        } catch (Throwable th2) {
                            th = th2;
                            r10.d(null);
                            throw th;
                        }
                    }
                    bVar = (b) this.L$1;
                    ?? r5 = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        d = ((Result) obj).getValue();
                        aVar = r5;
                        if (d instanceof Result.Failure) {
                            d = null;
                        }
                        str = (String) d;
                        if (str != null) {
                            aVar.d(null);
                            return zy11Var;
                        }
                        ru.yandex.taxi.am.token.a aVar2 = bVar.b;
                        this.L$0 = aVar;
                        this.L$1 = bVar;
                        this.L$2 = null;
                        this.label = 3;
                        Object h = aVar2.h(str, this);
                        if (h != coroutineSingletons) {
                            kotlinx.coroutines.sync.a aVar3 = aVar;
                            obj = h;
                            r10 = aVar3;
                            bVar2 = bVar;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            aVar = r10;
                            aVar.d(null);
                            return zy11Var;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        r10 = r5;
                        r10.d(null);
                        throw th;
                    }
                }
                bVar = (b) this.L$1;
                ?? r8 = (g050) this.L$0;
                kotlin.b.b(obj);
                aVar = r8;
            }
            if (!((cne0) ((i3y) bVar.a.b).getValue()).f("oauth_token_has_quark_scopes")) {
                ru.yandex.taxi.am.token.a aVar4 = bVar.b;
                this.L$0 = aVar;
                this.L$1 = bVar;
                this.label = 2;
                d = aVar4.d(false, this);
                if (d == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (d instanceof Result.Failure) {
                }
                str = (String) d;
                if (str != null) {
                }
            }
            aVar.d(null);
            return zy11Var;
        } catch (Throwable th4) {
            kotlinx.coroutines.sync.a aVar5 = aVar;
            th = th4;
            r10 = aVar5;
            r10.d(null);
            throw th;
        }
    }
}
