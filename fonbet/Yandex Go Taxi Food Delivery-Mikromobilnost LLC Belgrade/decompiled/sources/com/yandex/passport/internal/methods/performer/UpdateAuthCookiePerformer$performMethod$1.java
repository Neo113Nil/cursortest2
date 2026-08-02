package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportInvalidHostException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.methods.s2;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.UpdateAuthCookiePerformer$performMethod$1", f = "UpdateAuthCookiePerformer.kt", l = {33, 35, 37}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UpdateAuthCookiePerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ s2 $method;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAuthCookiePerformer$performMethod$1(s2 s2Var, k1 k1Var, Continuation continuation) {
        super(2, continuation);
        this.$method = s2Var;
        this.this$0 = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateAuthCookiePerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateAuthCookiePerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00cb, code lost:
    
        if (com.yandex.passport.internal.methods.performer.k1.b(r9, r4, r3, r8) == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (com.yandex.passport.internal.methods.performer.k1.b(r7, r9, r1, r8) == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String d;
        Uid uid;
        String str2;
        com.yandex.passport.internal.database.auth_cookie.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    eVar = (com.yandex.passport.internal.database.auth_cookie.e) this.L$2;
                    str2 = (String) this.L$1;
                    uid = (Uid) this.L$0;
                    kotlin.b.b(obj);
                    eVar.getClass();
                    if (com.yandex.passport.internal.database.auth_cookie.e.a(str2, (List) obj) == null) {
                        k1 k1Var = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                    }
                    return zy11.a;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            kotlin.b.b(obj);
            return zy11.a;
        }
        kotlin.b.b(obj);
        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) this.$method.b.c);
        String str3 = (String) this.$method.c.c;
        if (evu0.J(str3)) {
            str3 = "passport.yandex.ru";
        }
        if (evu0.J(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            if (!evu0.y(str3, "://", false)) {
                str3 = "https://".concat(str3);
            }
            com.yandex.passport.common.url.b bVar = new com.yandex.passport.common.url.b(str3);
            if (!com.yandex.passport.common.url.b.m(str3)) {
                bVar = null;
            }
            if (bVar != null) {
                str = bVar.a;
                d = str == null ? com.yandex.passport.common.url.b.d(str) : null;
                if (d != null) {
                    throw new PassportInvalidHostException((String) this.$method.c.c);
                }
                boolean booleanValue = ((Boolean) this.$method.d.c).booleanValue();
                k1 k1Var2 = this.this$0;
                if (booleanValue) {
                    this.label = 1;
                } else {
                    com.yandex.passport.internal.database.auth_cookie.a aVar = k1Var2.a;
                    this.L$0 = B;
                    this.L$1 = d;
                    com.yandex.passport.internal.database.auth_cookie.e eVar2 = com.yandex.passport.internal.database.auth_cookie.f.d;
                    this.L$2 = eVar2;
                    this.label = 2;
                    Object b = aVar.b(B, this);
                    if (b != coroutineSingletons) {
                        uid = B;
                        obj = b;
                        str2 = d;
                        eVar = eVar2;
                        eVar.getClass();
                        if (com.yandex.passport.internal.database.auth_cookie.e.a(str2, (List) obj) == null) {
                        }
                        return zy11.a;
                    }
                }
            }
        }
        str = null;
        if (str == null) {
        }
        if (d != null) {
        }
        return coroutineSingletons;
    }
}
