package com.yandex.passport.internal.methods.performer;

import android.os.Build;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.impl.UserIdProperties;
import com.yandex.passport.common.core.AuthCookie;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.u1;
import com.yandex.passport.internal.report.zb;
import com.yandex.passport.user_id.di.GetUserIdUrlRequester$Response;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/user_id/di/GetUserIdUrlRequester$Response;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/user_id/di/GetUserIdUrlRequester$Response;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetUserIdUrlPerformer$performMethod$1", f = "GetUserIdUrlPerformer.kt", l = {43, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE, 74}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetUserIdUrlPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ u1 $method;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ q0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserIdUrlPerformer$performMethod$1(u1 u1Var, q0 q0Var, Continuation continuation) {
        super(2, continuation);
        this.$method = u1Var;
        this.this$0 = q0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetUserIdUrlPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetUserIdUrlPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c6, code lost:
    
        if (r14 == r0) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0195  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UserIdProperties userIdProperties;
        q0 q0Var;
        ModernAccount a;
        String str;
        q0 q0Var2;
        String str2;
        Object obj2;
        String str3;
        Pair[] pairArr;
        int i;
        ModernAccount modernAccount;
        Pair[] pairArr2;
        String str4;
        String a2;
        q0 q0Var3;
        Object c;
        ModernAccount modernAccount2;
        Object d;
        String str5;
        q0 q0Var4;
        Throwable a3;
        GetUserIdUrlRequester$Response getUserIdUrlRequester$Response;
        Throwable a4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 2;
        AuthCookie authCookie = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (i2 == 0) {
            kotlin.b.b(obj);
            Environment u = com.yandex.passport.internal.util.p.u(((UserIdProperties) this.$method.b.c).getEnvironment());
            userIdProperties = (UserIdProperties) this.$method.b.c;
            q0Var = this.this$0;
            a = q0Var.a.a();
            str = ((com.yandex.passport.internal.network.l) q0Var.b).l(u, a != null ? a.getLocationId() : 0L).a;
            com.yandex.passport.internal.sloth.p pVar = q0Var.x;
            this.L$0 = q0Var;
            this.L$1 = userIdProperties;
            this.L$2 = a;
            this.L$3 = str;
            this.label = 1;
            obj = pVar.a(this);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    i = this.I$0;
                    str3 = (String) this.L$5;
                    pairArr2 = (Pair[]) this.L$4;
                    pairArr = (Pair[]) this.L$3;
                    str2 = (String) this.L$2;
                    modernAccount = (ModernAccount) this.L$1;
                    q0Var2 = (q0) this.L$0;
                    kotlin.b.b(obj);
                    com.yandex.passport.common.value.b bVar = (com.yandex.passport.common.value.b) obj;
                    obj2 = bVar != null ? bVar.a : null;
                    str4 = (String) obj2;
                    if (str4 == null) {
                        str4 = null;
                    }
                    pairArr[i] = new Pair(str3, String.valueOf(str4));
                    pairArr2[6] = new Pair("webview", ConstantDeviceInfo.APP_PLATFORM);
                    pairArr2[7] = new Pair("mode", "userMenu");
                    a2 = com.yandex.passport.common.url.b.a(str2, kotlin.collections.b.i(pairArr2));
                    if (modernAccount != null) {
                        return new GetUserIdUrlRequester$Response(q0.b(q0Var2, a2), objArr2 == true ? 1 : 0, i3, objArr == true ? 1 : 0);
                    }
                    Boolean bool = (Boolean) q0Var2.z.b(com.yandex.passport.internal.flags.q.a);
                    bool.getClass();
                    if (!bool.booleanValue()) {
                        bool = null;
                    }
                    if (bool == null) {
                        q0Var3 = q0Var2;
                        Uid uid = modernAccount.getUid();
                        this.L$0 = q0Var3;
                        this.L$1 = a2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 4;
                        d = q0.d(q0Var3, uid, a2, this);
                        if (d != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    Uid uid2 = modernAccount.getUid();
                    this.L$0 = q0Var2;
                    this.L$1 = modernAccount;
                    this.L$2 = a2;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 3;
                    c = q0.c(q0Var2, uid2, a2, this);
                    if (c != coroutineSingletons) {
                        modernAccount2 = modernAccount;
                        q0Var3 = q0Var2;
                        a3 = Result.a(c);
                        if (a3 != null) {
                        }
                        if (Result.a(c) != null) {
                        }
                        if (c instanceof Result.Failure) {
                        }
                        getUserIdUrlRequester$Response = (GetUserIdUrlRequester$Response) c;
                        if (getUserIdUrlRequester$Response == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str5 = (String) this.L$1;
                    q0Var4 = (q0) this.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                    if (!(d instanceof Result.Failure)) {
                        d = new GetUserIdUrlRequester$Response(((com.yandex.passport.common.url.b) d).a, authCookie, i3, objArr7 == true ? 1 : 0);
                    }
                    a4 = Result.a(d);
                    if (a4 != null) {
                        try {
                            if (a4 instanceof IOException) {
                                throw new IOException("failed to get auth url");
                            }
                            d = new GetUserIdUrlRequester$Response(q0.b(q0Var4, str5), objArr6 == true ? 1 : 0, i3, objArr5 == true ? 1 : 0);
                        } catch (Throwable th) {
                            d = new Result.Failure(th);
                        }
                    }
                    kotlin.b.b(d);
                    return (GetUserIdUrlRequester$Response) d;
                }
                a2 = (String) this.L$2;
                modernAccount2 = (ModernAccount) this.L$1;
                q0Var3 = (q0) this.L$0;
                kotlin.b.b(obj);
                c = ((Result) obj).getValue();
                a3 = Result.a(c);
                if (a3 != null) {
                    try {
                        if (!(a3 instanceof InvalidTokenException)) {
                            throw a3;
                        }
                        c = new GetUserIdUrlRequester$Response(q0.b(q0Var3, a2), objArr4 == true ? 1 : 0, i3, objArr3 == true ? 1 : 0);
                    } catch (Throwable th2) {
                        c = new Result.Failure(th2);
                    }
                }
                if (Result.a(c) != null) {
                    com.yandex.passport.internal.report.reporters.e1 e1Var = q0Var3.A;
                    e1Var.getClass();
                    e1Var.h(zb.w);
                }
                if (c instanceof Result.Failure) {
                    c = null;
                }
                getUserIdUrlRequester$Response = (GetUserIdUrlRequester$Response) c;
                if (getUserIdUrlRequester$Response == null) {
                    return getUserIdUrlRequester$Response;
                }
                modernAccount = modernAccount2;
                Uid uid3 = modernAccount.getUid();
                this.L$0 = q0Var3;
                this.L$1 = a2;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 4;
                d = q0.d(q0Var3, uid3, a2, this);
                if (d != coroutineSingletons) {
                    str5 = a2;
                    q0Var4 = q0Var3;
                    if (!(d instanceof Result.Failure)) {
                    }
                    a4 = Result.a(d);
                    if (a4 != null) {
                    }
                    kotlin.b.b(d);
                    return (GetUserIdUrlRequester$Response) d;
                }
                return coroutineSingletons;
            }
            str = (String) this.L$3;
            a = (ModernAccount) this.L$2;
            userIdProperties = (UserIdProperties) this.L$1;
            q0Var = (q0) this.L$0;
            kotlin.b.b(obj);
        }
        String a5 = com.yandex.passport.common.url.b.a(str, kotlin.collections.b.n(com.yandex.passport.internal.ui.c.i((Map) obj), userIdProperties.getCustomWebParams()));
        Pair[] pairArr3 = new Pair[8];
        Locale a6 = ((com.yandex.passport.internal.ui.lang.a) q0Var.w).a();
        int i4 = com.yandex.passport.common.ui.lang.a.a;
        pairArr3[0] = new Pair("lang", a6.getLanguage());
        pairArr3[1] = new Pair("locale", ((com.yandex.passport.internal.ui.lang.a) q0Var.w).a().getCountry());
        pairArr3[2] = new Pair(DivkitThemeChangeListener.THEME_VARIABLE_NAME, com.yandex.passport.internal.ui.util.o.b(userIdProperties.getTheme()));
        pairArr3[3] = new Pair("source", "user_menu");
        pairArr3[4] = new Pair("device_name", Build.MODEL);
        com.yandex.passport.internal.sloth.p pVar2 = q0Var.x;
        this.L$0 = q0Var;
        this.L$1 = a;
        this.L$2 = a5;
        this.L$3 = pairArr3;
        this.L$4 = pairArr3;
        this.L$5 = "uuid";
        this.I$0 = 5;
        this.label = 2;
        Object b = pVar2.b(this);
        if (b != coroutineSingletons) {
            q0Var2 = q0Var;
            str2 = a5;
            obj2 = b;
            str3 = "uuid";
            pairArr = pairArr3;
            i = 5;
            modernAccount = a;
            pairArr2 = pairArr;
            str4 = (String) obj2;
            if (str4 == null) {
            }
            pairArr[i] = new Pair(str3, String.valueOf(str4));
            pairArr2[6] = new Pair("webview", ConstantDeviceInfo.APP_PLATFORM);
            pairArr2[7] = new Pair("mode", "userMenu");
            a2 = com.yandex.passport.common.url.b.a(str2, kotlin.collections.b.i(pairArr2));
            if (modernAccount != null) {
            }
        }
        return coroutineSingletons;
    }
}
