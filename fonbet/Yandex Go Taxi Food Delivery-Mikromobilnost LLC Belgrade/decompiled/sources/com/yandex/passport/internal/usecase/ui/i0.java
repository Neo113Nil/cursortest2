package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.data.models.PhoneConfirmationResult;
import com.yandex.passport.internal.entities.ConfirmMethod;
import com.yandex.passport.internal.ui.domik.BaseTrack;
import com.yandex.passport.internal.usecase.m1;
import com.yandex.passport.internal.usecase.n1;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class i0 extends com.yandex.passport.common.domain.d {
    public final r0 b;
    public final com.yandex.passport.internal.e c;
    public final com.yandex.passport.internal.ui.g d;
    public final n1 e;
    public final q f;

    public i0(r0 r0Var, com.yandex.passport.internal.e eVar, com.yandex.passport.internal.ui.g gVar, n1 n1Var, q qVar, com.yandex.passport.common.coroutine.a aVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = r0Var;
        this.c = eVar;
        this.d = gVar;
        this.e = n1Var;
        this.f = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0123, code lost:
    
        if (r2 != r4) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4 A[Catch: Exception -> 0x0056, TRY_ENTER, TryCatch #2 {Exception -> 0x0056, blocks: (B:28:0x0051, B:29:0x00d2, B:47:0x00b4), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(h0 h0Var, ContinuationImpl continuationImpl) {
        RequestSmsUseCase$request$1 requestSmsUseCase$request$1;
        i0 i0Var;
        zy11 zy11Var;
        String a;
        String str;
        String str2;
        i0 i0Var2;
        h0 h0Var2;
        i0 i0Var3;
        i0 i0Var4 = this;
        h0 h0Var3 = h0Var;
        try {
            if (continuationImpl instanceof RequestSmsUseCase$request$1) {
                requestSmsUseCase$request$1 = (RequestSmsUseCase$request$1) continuationImpl;
                int i = requestSmsUseCase$request$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    requestSmsUseCase$request$1.label = i - Integer.MIN_VALUE;
                    Object obj = requestSmsUseCase$request$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i0Var = requestSmsUseCase$request$1.label;
                    zy11Var = zy11.a;
                    if (i0Var != 0) {
                        kotlin.b.b(obj);
                        tls tlsVar = h0Var3.g;
                        BaseTrack baseTrack = h0Var3.a;
                        tlsVar.invoke(Boolean.TRUE);
                        try {
                            n1 n1Var = i0Var4.e;
                            m1 m1Var = new m1(baseTrack.getTrackId(), baseTrack.requireEnvironment());
                            requestSmsUseCase$request$1.L$0 = i0Var4;
                            requestSmsUseCase$request$1.L$1 = h0Var3;
                            requestSmsUseCase$request$1.label = 1;
                            obj = n1Var.a(m1Var, requestSmsUseCase$request$1);
                        } catch (Exception unused) {
                            a = i0Var4.c.a();
                            i0 i0Var5 = i0Var4;
                            str = a;
                            str2 = h0Var3.b;
                            BaseTrack baseTrack2 = h0Var3.a;
                            i0Var2 = i0Var5;
                            if (str2 == null) {
                            }
                            String str3 = str;
                            h0Var2 = h0Var3;
                            String str4 = str2;
                            i0Var3 = i0Var2;
                            r0 r0Var = i0Var3.b;
                            BaseTrack baseTrack3 = h0Var2.a;
                            q0 q0Var = new q0(baseTrack3.requireEnvironment(), baseTrack3.requireTrackId(), h0Var2.c ? null : baseTrack3.requirePhoneNumber(), str3, str4, ConfirmMethod.BY_SMS, h0Var2.c);
                            requestSmsUseCase$request$1.L$0 = i0Var3;
                            requestSmsUseCase$request$1.L$1 = h0Var2;
                            requestSmsUseCase$request$1.L$2 = null;
                            requestSmsUseCase$request$1.label = 3;
                            obj = r0Var.a(q0Var, requestSmsUseCase$request$1);
                        }
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (i0Var == 1) {
                        h0 h0Var4 = (h0) requestSmsUseCase$request$1.L$1;
                        i0 i0Var6 = (i0) requestSmsUseCase$request$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            h0Var3 = h0Var4;
                            i0Var4 = i0Var6;
                        } catch (Exception unused2) {
                            h0Var3 = h0Var4;
                            i0Var4 = i0Var6;
                            a = i0Var4.c.a();
                            i0 i0Var52 = i0Var4;
                            str = a;
                            str2 = h0Var3.b;
                            BaseTrack baseTrack22 = h0Var3.a;
                            i0Var2 = i0Var52;
                            if (str2 == null) {
                            }
                            String str32 = str;
                            h0Var2 = h0Var3;
                            String str42 = str2;
                            i0Var3 = i0Var2;
                            r0 r0Var2 = i0Var3.b;
                            BaseTrack baseTrack32 = h0Var2.a;
                            q0 q0Var2 = new q0(baseTrack32.requireEnvironment(), baseTrack32.requireTrackId(), h0Var2.c ? null : baseTrack32.requirePhoneNumber(), str32, str42, ConfirmMethod.BY_SMS, h0Var2.c);
                            requestSmsUseCase$request$1.L$0 = i0Var3;
                            requestSmsUseCase$request$1.L$1 = h0Var2;
                            requestSmsUseCase$request$1.L$2 = null;
                            requestSmsUseCase$request$1.label = 3;
                            obj = r0Var2.a(q0Var2, requestSmsUseCase$request$1);
                        }
                    } else {
                        if (i0Var != 2) {
                            if (i0Var != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h0Var2 = (h0) requestSmsUseCase$request$1.L$1;
                            i0Var3 = (i0) requestSmsUseCase$request$1.L$0;
                            kotlin.b.b(obj);
                            Object value = ((Result) obj).getValue();
                            if (!(value instanceof Result.Failure)) {
                                PhoneConfirmationResult phoneConfirmationResult = (PhoneConfirmationResult) value;
                                if (phoneConfirmationResult.getIsAlreadyConfirmed()) {
                                    h0Var2.e.invoke(h0Var2.a);
                                } else {
                                    h0Var2.d.invoke(h0Var2.a, phoneConfirmationResult);
                                }
                            }
                            Throwable a2 = Result.a(value);
                            if (a2 != null) {
                                h0Var2.f.invoke(i0Var3.d.a(a2));
                            }
                            h0Var2.g.invoke(Boolean.FALSE);
                            return zy11Var;
                        }
                        str = (String) requestSmsUseCase$request$1.L$2;
                        h0Var3 = (h0) requestSmsUseCase$request$1.L$1;
                        i0 i0Var7 = (i0) requestSmsUseCase$request$1.L$0;
                        kotlin.b.b(obj);
                        i0Var = i0Var7;
                        Object value2 = ((Result) obj).getValue();
                        kotlin.b.b(value2);
                        str2 = (String) value2;
                        i0Var2 = i0Var;
                        String str322 = str;
                        h0Var2 = h0Var3;
                        String str422 = str2;
                        i0Var3 = i0Var2;
                        r0 r0Var22 = i0Var3.b;
                        BaseTrack baseTrack322 = h0Var2.a;
                        q0 q0Var22 = new q0(baseTrack322.requireEnvironment(), baseTrack322.requireTrackId(), h0Var2.c ? null : baseTrack322.requirePhoneNumber(), str322, str422, ConfirmMethod.BY_SMS, h0Var2.c);
                        requestSmsUseCase$request$1.L$0 = i0Var3;
                        requestSmsUseCase$request$1.L$1 = h0Var2;
                        requestSmsUseCase$request$1.L$2 = null;
                        requestSmsUseCase$request$1.label = 3;
                        obj = r0Var22.a(q0Var22, requestSmsUseCase$request$1);
                    }
                    Object value3 = ((Result) obj).getValue();
                    kotlin.b.b(value3);
                    a = (String) value3;
                    i0 i0Var522 = i0Var4;
                    str = a;
                    str2 = h0Var3.b;
                    BaseTrack baseTrack222 = h0Var3.a;
                    i0Var2 = i0Var522;
                    if (str2 == null) {
                        q qVar = i0Var522.f;
                        p pVar = new p(baseTrack222.requireTrackId(), baseTrack222.requireEnvironment());
                        requestSmsUseCase$request$1.L$0 = i0Var522;
                        requestSmsUseCase$request$1.L$1 = h0Var3;
                        requestSmsUseCase$request$1.L$2 = str;
                        requestSmsUseCase$request$1.label = 2;
                        obj = qVar.a(pVar, requestSmsUseCase$request$1);
                        i0Var = i0Var522;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        Object value22 = ((Result) obj).getValue();
                        kotlin.b.b(value22);
                        str2 = (String) value22;
                        i0Var2 = i0Var;
                    }
                    String str3222 = str;
                    h0Var2 = h0Var3;
                    String str4222 = str2;
                    i0Var3 = i0Var2;
                    r0 r0Var222 = i0Var3.b;
                    BaseTrack baseTrack3222 = h0Var2.a;
                    q0 q0Var222 = new q0(baseTrack3222.requireEnvironment(), baseTrack3222.requireTrackId(), h0Var2.c ? null : baseTrack3222.requirePhoneNumber(), str3222, str4222, ConfirmMethod.BY_SMS, h0Var2.c);
                    requestSmsUseCase$request$1.L$0 = i0Var3;
                    requestSmsUseCase$request$1.L$1 = h0Var2;
                    requestSmsUseCase$request$1.L$2 = null;
                    requestSmsUseCase$request$1.label = 3;
                    obj = r0Var222.a(q0Var222, requestSmsUseCase$request$1);
                }
            }
            if (i0Var != 0) {
            }
            Object value32 = ((Result) obj).getValue();
            kotlin.b.b(value32);
            a = (String) value32;
            i0 i0Var5222 = i0Var4;
            str = a;
            str2 = h0Var3.b;
            BaseTrack baseTrack2222 = h0Var3.a;
            i0Var2 = i0Var5222;
            if (str2 == null) {
            }
            String str32222 = str;
            h0Var2 = h0Var3;
            String str42222 = str2;
            i0Var3 = i0Var2;
            r0 r0Var2222 = i0Var3.b;
            BaseTrack baseTrack32222 = h0Var2.a;
            q0 q0Var2222 = new q0(baseTrack32222.requireEnvironment(), baseTrack32222.requireTrackId(), h0Var2.c ? null : baseTrack32222.requirePhoneNumber(), str32222, str42222, ConfirmMethod.BY_SMS, h0Var2.c);
            requestSmsUseCase$request$1.L$0 = i0Var3;
            requestSmsUseCase$request$1.L$1 = h0Var2;
            requestSmsUseCase$request$1.L$2 = null;
            requestSmsUseCase$request$1.label = 3;
            obj = r0Var2222.a(q0Var2222, requestSmsUseCase$request$1);
        } catch (Exception e) {
            h0Var3.f.invoke(i0Var.d.a(e));
            h0Var3.g.invoke(Boolean.FALSE);
            return zy11Var;
        }
        requestSmsUseCase$request$1 = new RequestSmsUseCase$request$1(i0Var4, continuationImpl);
        Object obj2 = requestSmsUseCase$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i0Var = requestSmsUseCase$request$1.label;
        zy11Var = zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h0 h0Var, ContinuationImpl continuationImpl) {
        RequestSmsUseCase$run$1 requestSmsUseCase$run$1;
        int i;
        if (continuationImpl instanceof RequestSmsUseCase$run$1) {
            requestSmsUseCase$run$1 = (RequestSmsUseCase$run$1) continuationImpl;
            int i2 = requestSmsUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requestSmsUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requestSmsUseCase$run$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestSmsUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    requestSmsUseCase$run$1.label = 1;
                    if (c(h0Var, requestSmsUseCase$run$1) == obj2) {
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
        requestSmsUseCase$run$1 = new RequestSmsUseCase$run$1(this, continuationImpl);
        Object obj3 = requestSmsUseCase$run$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestSmsUseCase$run$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
