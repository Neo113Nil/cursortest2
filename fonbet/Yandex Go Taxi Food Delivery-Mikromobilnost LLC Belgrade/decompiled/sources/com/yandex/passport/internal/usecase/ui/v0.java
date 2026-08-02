package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.data.models.PhoneConfirmationResult;
import com.yandex.passport.data.network.be;
import com.yandex.passport.data.network.ke;
import com.yandex.passport.internal.analytics.DomikScreenSuccessMessages$CallConfirm;
import com.yandex.passport.internal.analytics.DomikScreenSuccessMessages$Phone;
import com.yandex.passport.internal.entities.ConfirmMethod;
import com.yandex.passport.internal.report.j9;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.base.ShowFragmentInfo$AnimationType;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.sms.SmsFragment;
import com.yandex.passport.internal.usecase.m1;
import com.yandex.passport.internal.usecase.n1;
import defpackage.ny61;
import defpackage.zy11;
import java.io.IOException;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class v0 extends com.yandex.passport.common.domain.d {
    public final com.yandex.passport.internal.account.c b;
    public final com.yandex.passport.internal.ui.g c;
    public final r0 d;
    public final n1 e;
    public final ke f;
    public final com.yandex.passport.internal.network.mappers.b g;

    public v0(com.yandex.passport.internal.account.c cVar, com.yandex.passport.internal.ui.g gVar, r0 r0Var, com.yandex.passport.common.coroutine.a aVar, n1 n1Var, ke keVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = cVar;
        this.c = gVar;
        this.d = r0Var;
        this.e = n1Var;
        this.f = keVar;
        this.g = bVar;
    }

    public final void c(Exception exc, com.yandex.passport.biometric.ui.verification.a aVar) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "processRegistrationError " + exc, 8);
        }
        aVar.i(false);
        aVar.h(this.c.a(exc));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(u0 u0Var, ContinuationImpl continuationImpl) {
        StartRegistrationUseCase$run$1 startRegistrationUseCase$run$1;
        int i;
        if (continuationImpl instanceof StartRegistrationUseCase$run$1) {
            startRegistrationUseCase$run$1 = (StartRegistrationUseCase$run$1) continuationImpl;
            int i2 = startRegistrationUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startRegistrationUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startRegistrationUseCase$run$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startRegistrationUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    startRegistrationUseCase$run$1.label = 1;
                    if (f(u0Var, startRegistrationUseCase$run$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        startRegistrationUseCase$run$1 = new StartRegistrationUseCase$run$1(this, continuationImpl);
        Object obj3 = startRegistrationUseCase$run$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startRegistrationUseCase$run$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(u0 u0Var, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        StartRegistrationUseCase$sendSms$1 startRegistrationUseCase$sendSms$1;
        int i;
        String str4;
        u0 u0Var2;
        String str5;
        String str6;
        ConfirmMethod confirmMethod;
        Object value;
        Throwable a;
        Throwable a2;
        String str7;
        String str8;
        PassportUidImpl selectedUid;
        if (continuationImpl instanceof StartRegistrationUseCase$sendSms$1) {
            startRegistrationUseCase$sendSms$1 = (StartRegistrationUseCase$sendSms$1) continuationImpl;
            int i2 = startRegistrationUseCase$sendSms$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                startRegistrationUseCase$sendSms$1.label = i2 - Integer.MIN_VALUE;
                Object obj = startRegistrationUseCase$sendSms$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = startRegistrationUseCase$sendSms$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ConfirmMethod confirmMethod2 = ConfirmMethod.BY_SMS;
                    str4 = str3;
                    q0 q0Var = new q0(u0Var.a.requireEnvironment(), str, str2, str4, null, confirmMethod2, false);
                    startRegistrationUseCase$sendSms$1.L$0 = u0Var;
                    startRegistrationUseCase$sendSms$1.L$1 = str;
                    startRegistrationUseCase$sendSms$1.L$2 = str2;
                    startRegistrationUseCase$sendSms$1.L$3 = str4;
                    startRegistrationUseCase$sendSms$1.L$4 = confirmMethod2;
                    startRegistrationUseCase$sendSms$1.label = 1;
                    obj = this.d.a(q0Var, startRegistrationUseCase$sendSms$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    u0Var2 = u0Var;
                    str5 = str;
                    str6 = str2;
                    confirmMethod = confirmMethod2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    confirmMethod = (ConfirmMethod) startRegistrationUseCase$sendSms$1.L$4;
                    String str9 = (String) startRegistrationUseCase$sendSms$1.L$3;
                    str6 = (String) startRegistrationUseCase$sendSms$1.L$2;
                    str5 = (String) startRegistrationUseCase$sendSms$1.L$1;
                    u0Var2 = (u0) startRegistrationUseCase$sendSms$1.L$0;
                    kotlin.b.b(obj);
                    str4 = str9;
                }
                value = ((Result) obj).getValue();
                a = Result.a(value);
                if (a != null) {
                    try {
                        throw a;
                    } catch (Throwable th) {
                        value = new Result.Failure(th);
                    }
                }
                if (!(value instanceof Result.Failure)) {
                    PhoneConfirmationResult phoneConfirmationResult = (PhoneConfirmationResult) value;
                    com.yandex.passport.biometric.ui.verification.a aVar = u0Var2.c;
                    aVar.i(false);
                    RegTrack withConfirmMethod = u0Var2.a.withTrackId(str5).withPhoneNumber(str6).withSuggestedLanguage(str4).withConfirmMethod(confirmMethod);
                    int i3 = 4;
                    switch (aVar.a) {
                        case 7:
                            com.yandex.passport.internal.ui.domik.call.e eVar = (com.yandex.passport.internal.ui.domik.call.e) aVar.b;
                            eVar.C.g(DomikScreenSuccessMessages$CallConfirm.smsSent);
                            com.yandex.passport.internal.ui.domik.r rVar = eVar.B;
                            rVar.getClass();
                            com.yandex.passport.internal.ui.n nVar = new com.yandex.passport.internal.ui.n(i3, withConfirmMethod, phoneConfirmationResult);
                            SmsFragment.Companion.getClass();
                            str7 = SmsFragment.FRAGMENT_TAG;
                            rVar.a.A.m(new com.yandex.passport.internal.ui.base.m(nVar, str7, true, ShowFragmentInfo$AnimationType.DIALOG));
                            break;
                        default:
                            com.yandex.passport.internal.ui.domik.phone_number.a aVar2 = (com.yandex.passport.internal.ui.domik.phone_number.a) aVar.b;
                            if (withConfirmMethod.getProperties().isUpgradePhonish() && (selectedUid = aVar2.F.getSelectedUid()) != null) {
                                com.yandex.passport.internal.report.reporters.p0 p0Var = aVar2.E;
                                Uid B = com.yandex.passport.internal.util.p.B(selectedUid);
                                p0Var.getClass();
                                p0Var.f(j9.w, new yd(B));
                            }
                            aVar2.C.g(DomikScreenSuccessMessages$Phone.smsSent);
                            com.yandex.passport.internal.ui.domik.r rVar2 = aVar2.B;
                            rVar2.getClass();
                            com.yandex.passport.internal.ui.n nVar2 = new com.yandex.passport.internal.ui.n(i3, withConfirmMethod, phoneConfirmationResult);
                            SmsFragment.Companion.getClass();
                            str8 = SmsFragment.FRAGMENT_TAG;
                            rVar2.a.A.m(new com.yandex.passport.internal.ui.base.m(nVar2, str8, true, ShowFragmentInfo$AnimationType.DIALOG));
                            break;
                    }
                    aVar.i(false);
                }
                a2 = Result.a(value);
                if (a2 != null) {
                    return zy11.a;
                }
                throw a2;
            }
        }
        startRegistrationUseCase$sendSms$1 = new StartRegistrationUseCase$sendSms$1(this, continuationImpl);
        Object obj2 = startRegistrationUseCase$sendSms$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = startRegistrationUseCase$sendSms$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        a = Result.a(value);
        if (a != null) {
        }
        if (!(value instanceof Result.Failure)) {
        }
        a2 = Result.a(value);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f1 A[Catch: FailedResponseException -> 0x00e4, IOException -> 0x00e7, JSONException -> 0x00ea, TRY_LEAVE, TryCatch #9 {FailedResponseException -> 0x00e4, IOException -> 0x00e7, JSONException -> 0x00ea, blocks: (B:36:0x01ab, B:19:0x00d5, B:21:0x00f1, B:24:0x0128, B:26:0x012c, B:29:0x0144, B:31:0x0180, B:33:0x0188, B:62:0x01bd, B:64:0x015c, B:66:0x0162, B:67:0x0179, B:69:0x0171, B:11:0x00ad, B:13:0x00b7), top: B:10:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0188 A[Catch: FailedResponseException -> 0x00e4, IOException -> 0x00e7, JSONException -> 0x00ea, TryCatch #9 {FailedResponseException -> 0x00e4, IOException -> 0x00e7, JSONException -> 0x00ea, blocks: (B:36:0x01ab, B:19:0x00d5, B:21:0x00f1, B:24:0x0128, B:26:0x012c, B:29:0x0144, B:31:0x0180, B:33:0x0188, B:62:0x01bd, B:64:0x015c, B:66:0x0162, B:67:0x0179, B:69:0x0171, B:11:0x00ad, B:13:0x00b7), top: B:10:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0201 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bd A[Catch: FailedResponseException -> 0x00e4, IOException -> 0x00e7, JSONException -> 0x00ea, TRY_LEAVE, TryCatch #9 {FailedResponseException -> 0x00e4, IOException -> 0x00e7, JSONException -> 0x00ea, blocks: (B:36:0x01ab, B:19:0x00d5, B:21:0x00f1, B:24:0x0128, B:26:0x012c, B:29:0x0144, B:31:0x0180, B:33:0x0188, B:62:0x01bd, B:64:0x015c, B:66:0x0162, B:67:0x0179, B:69:0x0171, B:11:0x00ad, B:13:0x00b7), top: B:10:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(u0 u0Var, ContinuationImpl continuationImpl) {
        StartRegistrationUseCase$startRegistration$1 startRegistrationUseCase$startRegistration$1;
        ?? r4;
        Environment environment;
        String str;
        String str2;
        String str3;
        String str4;
        v0 v0Var;
        u0 u0Var2;
        String str5;
        Environment environment2;
        v0 v0Var2 = this;
        u0 u0Var3 = u0Var;
        if (continuationImpl instanceof StartRegistrationUseCase$startRegistration$1) {
            startRegistrationUseCase$startRegistration$1 = (StartRegistrationUseCase$startRegistration$1) continuationImpl;
            int i = startRegistrationUseCase$startRegistration$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                startRegistrationUseCase$startRegistration$1.label = i - Integer.MIN_VALUE;
                StartRegistrationUseCase$startRegistration$1 startRegistrationUseCase$startRegistration$12 = startRegistrationUseCase$startRegistration$1;
                Object obj = startRegistrationUseCase$startRegistration$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                r4 = startRegistrationUseCase$startRegistration$12.label;
                zy11 zy11Var = zy11.a;
                if (r4 == 0) {
                    try {
                    } catch (FailedResponseException e) {
                        e = e;
                        u0Var3 = r4;
                        v0Var2 = 1;
                    } catch (IOException e2) {
                        e = e2;
                        u0Var3 = r4;
                        v0Var2 = 1;
                    } catch (JSONException e3) {
                        e = e3;
                        u0Var3 = r4;
                        v0Var2 = 1;
                    }
                    if (r4 != 1) {
                        if (r4 != 2) {
                            if (r4 != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            u0 u0Var4 = (u0) startRegistrationUseCase$startRegistration$12.L$1;
                            v0 v0Var3 = (v0) startRegistrationUseCase$startRegistration$12.L$0;
                            try {
                                kotlin.b.b(obj);
                                return zy11Var;
                            } catch (FailedResponseException e4) {
                                e = e4;
                                u0Var3 = u0Var4;
                                v0Var2 = v0Var3;
                                v0Var2.c(e, u0Var3.c);
                            } catch (IOException e5) {
                                e = e5;
                                u0Var3 = u0Var4;
                                v0Var2 = v0Var3;
                                v0Var2.c(e, u0Var3.c);
                            } catch (JSONException e6) {
                                e = e6;
                                u0Var3 = u0Var4;
                                v0Var2 = v0Var3;
                                v0Var2.c(e, u0Var3.c);
                            }
                        }
                        String str6 = (String) startRegistrationUseCase$startRegistration$12.L$3;
                        String str7 = (String) startRegistrationUseCase$startRegistration$12.L$2;
                        u0 u0Var5 = (u0) startRegistrationUseCase$startRegistration$12.L$1;
                        v0 v0Var4 = (v0) startRegistrationUseCase$startRegistration$12.L$0;
                        kotlin.b.b(obj);
                        str2 = str6;
                        v0Var2 = v0Var4;
                        str3 = str7;
                        u0Var3 = u0Var5;
                        Object value = ((Result) obj).getValue();
                        kotlin.b.b(value);
                        str4 = ((com.yandex.passport.data.models.l) value).a;
                        String str8 = str4;
                        v0Var = v0Var2;
                        String str9 = str2;
                        try {
                            startRegistrationUseCase$startRegistration$12.L$0 = v0Var;
                            startRegistrationUseCase$startRegistration$12.L$1 = u0Var3;
                            startRegistrationUseCase$startRegistration$12.L$2 = null;
                            startRegistrationUseCase$startRegistration$12.L$3 = null;
                            startRegistrationUseCase$startRegistration$12.label = 3;
                            u0Var2 = u0Var3;
                        } catch (FailedResponseException e7) {
                            e = e7;
                            v0Var2 = v0Var;
                        } catch (IOException e8) {
                            e = e8;
                            v0Var2 = v0Var;
                        } catch (JSONException e9) {
                            e = e9;
                            v0Var2 = v0Var;
                        }
                        try {
                        } catch (FailedResponseException e10) {
                            e = e10;
                            v0Var2 = v0Var;
                            u0Var3 = u0Var2;
                            v0Var2.c(e, u0Var3.c);
                        } catch (IOException e11) {
                            e = e11;
                            v0Var2 = v0Var;
                            u0Var3 = u0Var2;
                            v0Var2.c(e, u0Var3.c);
                        } catch (JSONException e12) {
                            e = e12;
                            v0Var2 = v0Var;
                            u0Var3 = u0Var2;
                            v0Var2.c(e, u0Var3.c);
                        }
                        return v0Var.e(u0Var2, str3, str8, str9, startRegistrationUseCase$startRegistration$12) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    String str10 = (String) startRegistrationUseCase$startRegistration$12.L$3;
                    Environment environment3 = (Environment) startRegistrationUseCase$startRegistration$12.L$2;
                    u0 u0Var6 = (u0) startRegistrationUseCase$startRegistration$12.L$1;
                    v0 v0Var5 = (v0) startRegistrationUseCase$startRegistration$12.L$0;
                    kotlin.b.b(obj);
                    environment = environment3;
                    u0Var3 = u0Var6;
                    str = str10;
                    v0Var2 = v0Var5;
                } else {
                    kotlin.b.b(obj);
                    com.yandex.passport.biometric.ui.verification.a aVar = u0Var3.c;
                    RegTrack regTrack = u0Var3.a;
                    aVar.i(true);
                    environment2 = regTrack.requireEnvironment();
                    try {
                        str = regTrack.getTrackId();
                        String suggestedLanguage = regTrack.getSuggestedLanguage();
                        if (suggestedLanguage == null) {
                            n1 n1Var = v0Var2.e;
                            m1 m1Var = new m1(str, environment2);
                            startRegistrationUseCase$startRegistration$12.L$0 = v0Var2;
                            startRegistrationUseCase$startRegistration$12.L$1 = u0Var3;
                            startRegistrationUseCase$startRegistration$12.L$2 = environment2;
                            startRegistrationUseCase$startRegistration$12.L$3 = str;
                            startRegistrationUseCase$startRegistration$12.label = 1;
                            Object a = n1Var.a(m1Var, startRegistrationUseCase$startRegistration$12);
                            if (a != coroutineSingletons) {
                                environment = environment2;
                                obj = a;
                            }
                        } else {
                            str5 = suggestedLanguage;
                            if (str == null) {
                                com.yandex.passport.internal.account.c cVar = v0Var2.b;
                                String str11 = u0Var3.b;
                                RegTrack regTrack2 = u0Var3.a;
                                com.yandex.passport.biometric.ui.verification.a aVar2 = u0Var3.c;
                                com.yandex.passport.internal.network.response.f o = cVar.a.a(environment2).o(str11, true, true, cVar.c.r(environment2), str5, regTrack2.getProperties().getApplicationPackageName(), regTrack2.getProperties().getApplicationVersion());
                                str2 = str5;
                                List list = o.f;
                                boolean z = o.b;
                                if (!z) {
                                    if (list == null || list.isEmpty()) {
                                        aVar2.h(new EventError("unknown error", null, 2, null));
                                    } else {
                                        aVar2.h(new EventError((String) list.get(0), null, 2, null));
                                    }
                                    aVar2.i(false);
                                    return zy11Var;
                                }
                                str3 = o.c;
                                if (!z) {
                                    com.yandex.passport.legacy.a.d(new RuntimeException("Can't register"));
                                    aVar2.h(new EventError("unknown error", null, 2, null));
                                    aVar2.i(false);
                                    return zy11Var;
                                }
                                if (str3 == null) {
                                    com.yandex.passport.legacy.a.d(new RuntimeException("track_id null"));
                                    aVar2.h(new EventError("unknown error", null, 2, null));
                                    aVar2.i(false);
                                    return zy11Var;
                                }
                            } else {
                                str2 = str5;
                                str3 = str;
                            }
                            if (u0Var3.a.getConfirmMethod() == null) {
                                ke keVar = v0Var2.f;
                                v0Var2.g.getClass();
                                be beVar = new be(com.yandex.passport.internal.network.mappers.b.a(environment2), str3, u0Var3.b);
                                startRegistrationUseCase$startRegistration$12.L$0 = v0Var2;
                                startRegistrationUseCase$startRegistration$12.L$1 = u0Var3;
                                startRegistrationUseCase$startRegistration$12.L$2 = str3;
                                startRegistrationUseCase$startRegistration$12.L$3 = str2;
                                startRegistrationUseCase$startRegistration$12.label = 2;
                                obj = keVar.a(beVar, startRegistrationUseCase$startRegistration$12);
                                if (obj == coroutineSingletons) {
                                }
                                Object value2 = ((Result) obj).getValue();
                                kotlin.b.b(value2);
                                str4 = ((com.yandex.passport.data.models.l) value2).a;
                                String str82 = str4;
                                v0Var = v0Var2;
                                String str92 = str2;
                                startRegistrationUseCase$startRegistration$12.L$0 = v0Var;
                                startRegistrationUseCase$startRegistration$12.L$1 = u0Var3;
                                startRegistrationUseCase$startRegistration$12.L$2 = null;
                                startRegistrationUseCase$startRegistration$12.L$3 = null;
                                startRegistrationUseCase$startRegistration$12.label = 3;
                                u0Var2 = u0Var3;
                                if (v0Var.e(u0Var2, str3, str82, str92, startRegistrationUseCase$startRegistration$12) == coroutineSingletons) {
                                }
                            } else {
                                str4 = u0Var3.a.requirePhoneNumber();
                                String str822 = str4;
                                v0Var = v0Var2;
                                String str922 = str2;
                                startRegistrationUseCase$startRegistration$12.L$0 = v0Var;
                                startRegistrationUseCase$startRegistration$12.L$1 = u0Var3;
                                startRegistrationUseCase$startRegistration$12.L$2 = null;
                                startRegistrationUseCase$startRegistration$12.L$3 = null;
                                startRegistrationUseCase$startRegistration$12.label = 3;
                                u0Var2 = u0Var3;
                                if (v0Var.e(u0Var2, str3, str822, str922, startRegistrationUseCase$startRegistration$12) == coroutineSingletons) {
                                }
                            }
                        }
                    } catch (FailedResponseException e13) {
                        e = e13;
                        v0Var2.c(e, u0Var3.c);
                    } catch (IOException e14) {
                        e = e14;
                        v0Var2.c(e, u0Var3.c);
                    } catch (JSONException e15) {
                        e = e15;
                        v0Var2.c(e, u0Var3.c);
                    }
                }
                Object value3 = ((Result) obj).getValue();
                kotlin.b.b(value3);
                str5 = (String) value3;
                environment2 = environment;
                if (str == null) {
                }
                if (u0Var3.a.getConfirmMethod() == null) {
                }
            }
        }
        startRegistrationUseCase$startRegistration$1 = new StartRegistrationUseCase$startRegistration$1(v0Var2, continuationImpl);
        StartRegistrationUseCase$startRegistration$1 startRegistrationUseCase$startRegistration$122 = startRegistrationUseCase$startRegistration$1;
        Object obj2 = startRegistrationUseCase$startRegistration$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r4 = startRegistrationUseCase$startRegistration$122.label;
        zy11 zy11Var2 = zy11.a;
        if (r4 == 0) {
        }
        Object value32 = ((Result) obj2).getValue();
        kotlin.b.b(value32);
        str5 = (String) value32;
        environment2 = environment;
        if (str == null) {
        }
        if (u0Var3.a.getConfirmMethod() == null) {
        }
    }
}
