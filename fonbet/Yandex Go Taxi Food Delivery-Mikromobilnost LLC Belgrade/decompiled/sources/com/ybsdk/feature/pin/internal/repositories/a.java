package com.ybsdk.feature.pin.internal.repositories;

import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.core.utils.d;
import com.ybsdk.feature.pin.internal.network.PinApi;
import com.ybsdk.feature.pin.internal.network.dto.IssuePinTokenResponse;
import defpackage.d6v;
import defpackage.dxf0;
import defpackage.ny61;
import defpackage.rwb0;
import defpackage.uwb0;
import defpackage.wwb0;
import defpackage.x4c;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final PinApi a;
    public final dxf0 b;

    public a(PinApi pinApi, dxf0 dxf0Var) {
        this.a = pinApi;
        this.b = dxf0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d6v d6vVar, String str, ContinuationImpl continuationImpl) {
        PinRepository$issuePinToken$1 pinRepository$issuePinToken$1;
        int i;
        String str2;
        Object a;
        if (continuationImpl instanceof PinRepository$issuePinToken$1) {
            pinRepository$issuePinToken$1 = (PinRepository$issuePinToken$1) continuationImpl;
            int i2 = pinRepository$issuePinToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinRepository$issuePinToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinRepository$issuePinToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinRepository$issuePinToken$1.label;
                if (i != 0) {
                    b.b(obj);
                    pinRepository$issuePinToken$1.L$0 = d6vVar;
                    pinRepository$issuePinToken$1.L$1 = str;
                    pinRepository$issuePinToken$1.label = 1;
                    obj = ((DeviceIdProvider) this.b.a).d(pinRepository$issuePinToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        a = ((Result) obj).getValue();
                        if (!(a instanceof Result.Failure)) {
                            try {
                                a = wwb0.a((IssuePinTokenResponse) a);
                            } catch (Throwable th) {
                                a = new Result.Failure(th);
                            }
                        }
                        Throwable a2 = Result.a(a);
                        if (a2 == null) {
                            return (uwb0) a;
                        }
                        x4c.g("Exception during issuePinToken() in PinRepository", a2, null, null, 12);
                        return new rwb0(a2);
                    }
                    str = (String) pinRepository$issuePinToken$1.L$1;
                    d6vVar = (d6v) pinRepository$issuePinToken$1.L$0;
                    b.b(obj);
                }
                str2 = (String) obj;
                if (str2 != null) {
                    return new rwb0(new Throwable("Device ID is null"));
                }
                PinRepository$issuePinToken$2 pinRepository$issuePinToken$2 = new PinRepository$issuePinToken$2(this, str2, str, null);
                pinRepository$issuePinToken$1.L$0 = null;
                pinRepository$issuePinToken$1.L$1 = null;
                pinRepository$issuePinToken$1.label = 2;
                a = d.a(d6vVar, pinRepository$issuePinToken$2, pinRepository$issuePinToken$1);
            }
        }
        pinRepository$issuePinToken$1 = new PinRepository$issuePinToken$1(this, continuationImpl);
        Object obj2 = pinRepository$issuePinToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinRepository$issuePinToken$1.label;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 != null) {
        }
    }
}
