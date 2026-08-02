package com.yandex.go.platform.js_api;

import com.yandex.go.platform.js_api.models.JsBindingData;
import com.yandex.go.platform.js_api.models.JsBindingResponse;
import com.yandex.go.platform.js_api.models.JsError;
import com.yandex.go.platform.js_api.models.JsUnbindingData;
import defpackage.i32;
import defpackage.j73;
import defpackage.mb20;
import defpackage.ny61;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.sma0;
import defpackage.su5;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/* loaded from: classes13.dex */
public final class f {
    public final sma0 a;
    public final i32 b;

    public f(sma0 sma0Var, i32 i32Var) {
        this.a = sma0Var;
        this.b = i32Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: SerializationException -> 0x0032, all -> 0x007f, JsError -> 0x0097, TRY_LEAVE, TryCatch #2 {JsError -> 0x0097, SerializationException -> 0x0032, all -> 0x007f, blocks: (B:11:0x0028, B:12:0x006e, B:14:0x0072, B:22:0x003d, B:24:0x0040, B:25:0x0059, B:28:0x0046), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String[] strArr, ContinuationImpl continuationImpl) {
        JsPaymentsHandler$bindCard$1 jsPaymentsHandler$bindCard$1;
        int i;
        Object a;
        try {
            if (continuationImpl instanceof JsPaymentsHandler$bindCard$1) {
                jsPaymentsHandler$bindCard$1 = (JsPaymentsHandler$bindCard$1) continuationImpl;
                int i2 = jsPaymentsHandler$bindCard$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jsPaymentsHandler$bindCard$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = jsPaymentsHandler$bindCard$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = jsPaymentsHandler$bindCard$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        JsBindingData jsBindingData = strArr.length == 0 ? new JsBindingData() : (JsBindingData) sbx.d.b(JsBindingData.Companion.serializer(), strArr[0]);
                        sma0 sma0Var = this.a;
                        String str = jsBindingData.a;
                        String str2 = jsBindingData.b;
                        String str3 = jsBindingData.c;
                        jsPaymentsHandler$bindCard$1.L$0 = this;
                        jsPaymentsHandler$bindCard$1.label = 1;
                        a = ((com.yandex.go.platform.payments.a) sma0Var).a(str, str2, str3, jsPaymentsHandler$bindCard$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (f) jsPaymentsHandler$bindCard$1.L$0;
                        kotlin.b.b(obj);
                        a = ((Result) obj).getValue();
                    }
                    if (!(a instanceof Result.Failure)) {
                        return a;
                    }
                    su5 su5Var = (su5) a;
                    return new JsBindingResponse(su5Var.a, su5Var.b);
                }
            }
            if (i != 0) {
            }
            if (!(a instanceof Result.Failure)) {
            }
        } catch (JsError e) {
            return new Result.Failure(e);
        } catch (SerializationException e2) {
            ((mb20) this.b.a).b("Transport.DeserializationError", null);
            return new Result.Failure(e2);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            return new Result.Failure(new JsError("InvalidStateError", message));
        }
        jsPaymentsHandler$bindCard$1 = new JsPaymentsHandler$bindCard$1(this, continuationImpl);
        Object obj2 = jsPaymentsHandler$bindCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsPaymentsHandler$bindCard$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String[] strArr, ContinuationImpl continuationImpl) {
        JsPaymentsHandler$unbindCard$1 jsPaymentsHandler$unbindCard$1;
        int i;
        try {
            if (continuationImpl instanceof JsPaymentsHandler$unbindCard$1) {
                jsPaymentsHandler$unbindCard$1 = (JsPaymentsHandler$unbindCard$1) continuationImpl;
                int i2 = jsPaymentsHandler$unbindCard$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jsPaymentsHandler$unbindCard$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = jsPaymentsHandler$unbindCard$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = jsPaymentsHandler$unbindCard$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    rbx rbxVar = sbx.d;
                    KSerializer serializer = JsUnbindingData.Companion.serializer();
                    String str = (String) j73.D(strArr);
                    if (str == null) {
                        str = "";
                    }
                    JsUnbindingData jsUnbindingData = (JsUnbindingData) rbxVar.b(serializer, str);
                    sma0 sma0Var = this.a;
                    String str2 = jsUnbindingData.b;
                    String str3 = jsUnbindingData.a;
                    String str4 = jsUnbindingData.c;
                    jsPaymentsHandler$unbindCard$1.label = 1;
                    Object b = ((com.yandex.go.platform.payments.a) sma0Var).b(str3, str2, str4, jsPaymentsHandler$unbindCard$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
            }
            if (i == 0) {
            }
        } catch (JsError e) {
            return new Result.Failure(e);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            return new Result.Failure(new JsError("InvalidStateError", message));
        }
        jsPaymentsHandler$unbindCard$1 = new JsPaymentsHandler$unbindCard$1(this, continuationImpl);
        Object obj2 = jsPaymentsHandler$unbindCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsPaymentsHandler$unbindCard$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String[] strArr, ContinuationImpl continuationImpl) {
        JsPaymentsHandler$verifyCard$1 jsPaymentsHandler$verifyCard$1;
        int i;
        try {
            if (continuationImpl instanceof JsPaymentsHandler$verifyCard$1) {
                jsPaymentsHandler$verifyCard$1 = (JsPaymentsHandler$verifyCard$1) continuationImpl;
                int i2 = jsPaymentsHandler$verifyCard$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jsPaymentsHandler$verifyCard$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = jsPaymentsHandler$verifyCard$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = jsPaymentsHandler$verifyCard$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    if (strArr.length == 0) {
                        throw new JsError("InvalidStateError", "Empty parameters for verify card method call");
                    }
                    JsVerificationData jsVerificationData = (JsVerificationData) sbx.d.b(JsVerificationData.Companion.serializer(), strArr[0]);
                    if (jsVerificationData.a.length() == 0) {
                        throw new JsError("InvalidStateError", "Empty cardId for verification");
                    }
                    sma0 sma0Var = this.a;
                    String str = jsVerificationData.a;
                    String str2 = jsVerificationData.b;
                    String str3 = jsVerificationData.c;
                    jsPaymentsHandler$verifyCard$1.label = 1;
                    Object c = ((com.yandex.go.platform.payments.a) sma0Var).c(str, str2, str3, jsPaymentsHandler$verifyCard$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
            }
            if (i == 0) {
            }
        } catch (JsError e) {
            return new Result.Failure(e);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            return new Result.Failure(new JsError("InvalidStateError", message));
        }
        jsPaymentsHandler$verifyCard$1 = new JsPaymentsHandler$verifyCard$1(this, continuationImpl);
        Object obj2 = jsPaymentsHandler$verifyCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = jsPaymentsHandler$verifyCard$1.label;
    }
}
