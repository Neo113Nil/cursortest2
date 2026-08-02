package com.yandex.passport.sloth;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.data.SlothLoginAction;
import defpackage.g8e;
import defpackage.ljo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.sloth.SlothFinishProcessor$finishWithCookie$1", f = "SlothFinishProcessor.kt", l = {111, 113, 120, HProv.PP_FAST_CODE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SlothFinishProcessor$finishWithCookie$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $analyticsFrom;
    final /* synthetic */ com.yandex.passport.sloth.data.a $cookie;
    final /* synthetic */ Long $locationId;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothFinishProcessor$finishWithCookie$1(k0 k0Var, com.yandex.passport.sloth.data.a aVar, String str, Long l, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = k0Var;
        this.$cookie = aVar;
        this.$url = str;
        this.$locationId = l;
        this.$analyticsFrom = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SlothFinishProcessor$finishWithCookie$1(this.this$0, this.$cookie, this.$url, this.$locationId, this.$analyticsFrom, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlothFinishProcessor$finishWithCookie$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        if (r6.equals("magic_link_reg") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e6, code lost:
    
        r4 = com.yandex.passport.sloth.data.SlothLoginAction.MAGIC_LINK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012a, code lost:
    
        if (r1.d(r2, r12) != r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        if (r6.equals("external_action_webview") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0116, code lost:
    
        r4 = com.yandex.passport.sloth.data.SlothLoginAction.PASSWORD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        if (r6.equals("captcha") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r6.equals(com.yandex.auth.LegacyAccountType.STRING_LOGIN) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        if (r6.equals("magic_link_auth") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r6.equals("smartlock") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0061, code lost:
    
        if (r13 == r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0047, code lost:
    
        if (r13.b(r1, r12) == r0) goto L82;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0182  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Throwable th;
        SlothLoginAction slothLoginAction;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v vVar = this.this$0.e;
            n nVar = new n(true);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) this.L$0;
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "authByCookie failed", th);
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
                a = ((Result) obj).getValue();
                k0 k0Var = this.this$0;
                String str = this.$analyticsFrom;
                String str2 = this.$url;
                Throwable a2 = Result.a(a);
                if (a2 == null) {
                    com.yandex.passport.common.account.a aVar = (com.yandex.passport.common.account.a) a;
                    k0Var.d.a(new n0(SlothMetricaEvent$Event.SUCCESS, g8e.z("analytics_from", str != null ? str : "")));
                    v vVar2 = k0Var.e;
                    Uid uid = aVar.getUid();
                    SlothLoginAction.Companion.getClass();
                    String lowerCase = str != null ? str.toLowerCase(Locale.US) : null;
                    if (lowerCase != null) {
                        switch (lowerCase.hashCode()) {
                            case -1443344780:
                                break;
                            case -1350309703:
                                if (lowerCase.equals("registration")) {
                                    slothLoginAction = SlothLoginAction.REGISTRATION;
                                    break;
                                }
                                break;
                            case -1339101303:
                                if (lowerCase.equals("auth_neo_phonish")) {
                                    slothLoginAction = SlothLoginAction.LOGIN_RESTORE;
                                    break;
                                }
                                break;
                            case -1036654616:
                                if (lowerCase.equals("auth_by_sms")) {
                                    slothLoginAction = SlothLoginAction.SMS;
                                    break;
                                }
                                break;
                            case -790428997:
                                break;
                            case -2766731:
                                if (lowerCase.equals("reg_neo_phonish")) {
                                    slothLoginAction = SlothLoginAction.REG_NEO_PHONISH;
                                    break;
                                }
                                break;
                            case 103149417:
                                break;
                            case 552567418:
                                break;
                            case 1645700580:
                                break;
                            case 2052728097:
                                break;
                        }
                        m0 m0Var = new m0(aVar, uid, slothLoginAction, com.yandex.passport.common.url.b.i(str2, "additional_action_result"));
                        this.label = 3;
                    }
                    slothLoginAction = SlothLoginAction.EMPTY;
                    m0 m0Var2 = new m0(aVar, uid, slothLoginAction, com.yandex.passport.common.url.b.i(str2, "additional_action_result"));
                    this.label = 3;
                } else {
                    z0 z0Var = k0Var.d;
                    SlothMetricaEvent$Event slothMetricaEvent$Event = SlothMetricaEvent$Event.FAILURE;
                    if (str == null) {
                        str = "";
                    }
                    Pair pair = new Pair("analytics_from", str);
                    String message = a2.getMessage();
                    z0Var.a(new n0(slothMetricaEvent$Event, kotlin.collections.b.i(pair, new Pair(Constants.KEY_MESSAGE, message != null ? message : ""), new Pair("throwable", ljo.b(a2)))));
                    v vVar3 = k0Var.e;
                    a0 a0Var = new a0(a2, "authorizeByCookie");
                    this.L$0 = a2;
                    this.label = 4;
                    if (vVar3.c(a0Var, this) != coroutineSingletons) {
                        th = a2;
                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        return zy11.a;
                    }
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        com.yandex.passport.internal.sloth.e eVar = this.this$0.b;
        com.yandex.passport.sloth.data.a aVar2 = this.$cookie;
        String i2 = com.yandex.passport.common.url.b.i(this.$url, "track_id");
        Long l = this.$locationId;
        this.label = 2;
        a = eVar.a(aVar2, i2, l, this);
    }
}
