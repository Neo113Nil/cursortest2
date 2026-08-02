package com.yandex.go.performance_class.device_info;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)I"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.performance_class.device_info.AndroidDeviceInfoProvider$getMaxCpuFreqMhz$2", f = "AndroidDeviceInfoProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class AndroidDeviceInfoProvider$getMaxCpuFreqMhz$2 extends SuspendLambda implements wls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidDeviceInfoProvider$getMaxCpuFreqMhz$2(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidDeviceInfoProvider$getMaxCpuFreqMhz$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", "r");
            int parseInt = Integer.parseInt(randomAccessFile.readLine());
            randomAccessFile.close();
            i = parseInt / 1000;
        } catch (Exception unused) {
            i = 0;
        }
        return new Integer(i);
    }
}
