package com.ybsdk.common;

import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechUpdateDeviceIdResultResult;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.taj;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltaj;", "<anonymous>", "(Ltse;)Ltaj;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.DeviceIdProvider$updateDeviceIdData$2", f = "DeviceIdProvider.kt", l = {HProv.ALG_SID_KECCAK_256, HProv.PP_SIGNATUREOID, HProv.PP_PASSWD_TERM, HProv.PP_FAST_CODE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DeviceIdProvider$updateDeviceIdData$2 extends SuspendLambda implements wls {
    final /* synthetic */ Long $uid;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DeviceIdProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceIdProvider$updateDeviceIdData$2(Long l, DeviceIdProvider deviceIdProvider, Continuation continuation) {
        super(2, continuation);
        this.$uid = l;
        this.this$0 = deviceIdProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeviceIdProvider$updateDeviceIdData$2 deviceIdProvider$updateDeviceIdData$2 = new DeviceIdProvider$updateDeviceIdData$2(this.$uid, this.this$0, continuation);
        deviceIdProvider$updateDeviceIdData$2.L$0 = obj;
        return deviceIdProvider$updateDeviceIdData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeviceIdProvider$updateDeviceIdData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
    
        if (r12 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0067, code lost:
    
        if (r12 == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh nohVar;
        String str;
        String str2;
        String str3;
        DeviceIdProvider deviceIdProvider;
        long longValue;
        String str4;
        TechEvents$TechUpdateDeviceIdResultResult techEvents$TechUpdateDeviceIdResultResult;
        String str5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h = tje.h((tse) this.L$0, null, null, new DeviceIdProvider$updateDeviceIdData$2$metricaDeviceIdDeferred$1(this.this$0, null), 3);
            Long l = this.$uid;
            if (l != null) {
                DeviceIdProvider deviceIdProvider2 = this.this$0;
                long longValue2 = l.longValue();
                this.L$0 = h;
                this.label = 1;
                obj = DeviceIdProvider.a(deviceIdProvider2, longValue2, this);
            } else {
                nohVar = h;
                str = null;
                this.L$0 = str;
                this.label = 2;
                obj = nohVar.k(this);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        techEvents$TechUpdateDeviceIdResultResult = (TechEvents$TechUpdateDeviceIdResultResult) this.L$2;
                        str5 = (String) this.L$1;
                        str4 = (String) this.L$0;
                        kotlin.b.b(obj);
                        this.this$0.h.y(this.$uid.longValue(), str5);
                        taj tajVar = new taj(str4, str5, this.$uid);
                        DeviceIdProvider.b(this.this$0, tajVar, techEvents$TechUpdateDeviceIdResultResult);
                        return tajVar;
                    }
                    str2 = (String) this.L$0;
                    kotlin.b.b(obj);
                    String str6 = (String) obj;
                    Pair pair = str6 == null ? new Pair(str6, TechEvents$TechUpdateDeviceIdResultResult.USE_FROM_OTHER_APP_PIN) : new Pair(str2, TechEvents$TechUpdateDeviceIdResultResult.USE_METRICA);
                    str3 = (String) pair.getFirst();
                    TechEvents$TechUpdateDeviceIdResultResult techEvents$TechUpdateDeviceIdResultResult2 = (TechEvents$TechUpdateDeviceIdResultResult) pair.getSecond();
                    deviceIdProvider = this.this$0;
                    longValue = this.$uid.longValue();
                    this.L$0 = str2;
                    this.L$1 = str3;
                    this.L$2 = techEvents$TechUpdateDeviceIdResultResult2;
                    this.label = 4;
                    Regex regex = DeviceIdProvider.k;
                    if (deviceIdProvider.f(longValue, str3, this) != coroutineSingletons) {
                        str4 = str2;
                        techEvents$TechUpdateDeviceIdResultResult = techEvents$TechUpdateDeviceIdResultResult2;
                        str5 = str3;
                        this.this$0.h.y(this.$uid.longValue(), str5);
                        taj tajVar2 = new taj(str4, str5, this.$uid);
                        DeviceIdProvider.b(this.this$0, tajVar2, techEvents$TechUpdateDeviceIdResultResult);
                        return tajVar2;
                    }
                    return coroutineSingletons;
                }
                str = (String) this.L$0;
                kotlin.b.b(obj);
                String str7 = (String) obj;
                Long l2 = this.$uid;
                if (str7 == null) {
                    taj tajVar3 = new taj(null, null, l2);
                    DeviceIdProvider.b(this.this$0, tajVar3, TechEvents$TechUpdateDeviceIdResultResult.FAILED_TO_GET_FROM_METRICA);
                    return tajVar3;
                }
                if (l2 == null) {
                    taj tajVar4 = new taj(str7, str7, l2);
                    DeviceIdProvider.b(this.this$0, tajVar4, TechEvents$TechUpdateDeviceIdResultResult.USE_METRICA_NO_UID);
                    return tajVar4;
                }
                if (str != null) {
                    taj tajVar5 = new taj(str7, str, l2);
                    DeviceIdProvider deviceIdProvider3 = this.this$0;
                    DeviceIdProvider.b(deviceIdProvider3, tajVar5, TechEvents$TechUpdateDeviceIdResultResult.USE_FROM_AM_STASH);
                    deviceIdProvider3.h.y(l2.longValue(), str);
                    return tajVar5;
                }
                DeviceIdProvider deviceIdProvider4 = this.this$0;
                this.L$0 = str7;
                this.label = 3;
                Object c = DeviceIdProvider.c(deviceIdProvider4, this);
                if (c != coroutineSingletons) {
                    str2 = str7;
                    obj = c;
                    String str62 = (String) obj;
                    if (str62 == null) {
                    }
                    str3 = (String) pair.getFirst();
                    TechEvents$TechUpdateDeviceIdResultResult techEvents$TechUpdateDeviceIdResultResult22 = (TechEvents$TechUpdateDeviceIdResultResult) pair.getSecond();
                    deviceIdProvider = this.this$0;
                    longValue = this.$uid.longValue();
                    this.L$0 = str2;
                    this.L$1 = str3;
                    this.L$2 = techEvents$TechUpdateDeviceIdResultResult22;
                    this.label = 4;
                    Regex regex2 = DeviceIdProvider.k;
                    if (deviceIdProvider.f(longValue, str3, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            h = (noh) this.L$0;
            kotlin.b.b(obj);
        }
        noh nohVar2 = h;
        str = (String) obj;
        nohVar = nohVar2;
        this.L$0 = str;
        this.label = 2;
        obj = nohVar.k(this);
    }
}
