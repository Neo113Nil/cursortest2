package com.yandex.go.ble.domain;

import android.bluetooth.le.ScanSettings;
import android.content.Context;
import defpackage.d26;
import defpackage.e26;
import defpackage.f26;
import defpackage.hlm0;
import defpackage.ilm0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.w511;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class a {
    public final Context a;
    public final ScanSettings b = new ScanSettings.Builder().setScanMode(0).setCallbackType(1).build();

    public a(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:45|46))(3:47|48|(1:50))|12|13|(1:15)|16|(2:18|19)(2:21|(2:23|24)(2:25|(2:27|28)(2:29|(2:31|32)(2:33|(2:35|(2:37|38)(1:39))(1:(1:43)(2:41|42))))))))|53|6|7|(0)(0)|12|13|(0)|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0032, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005a, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        BleScanningInteractorImpl$scanBleDevice$1 bleScanningInteractorImpl$scanBleDevice$1;
        int i;
        Object failure;
        f26 f26Var;
        hlm0 hlm0Var = hlm0.b;
        if (continuationImpl instanceof BleScanningInteractorImpl$scanBleDevice$1) {
            bleScanningInteractorImpl$scanBleDevice$1 = (BleScanningInteractorImpl$scanBleDevice$1) continuationImpl;
            int i2 = bleScanningInteractorImpl$scanBleDevice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bleScanningInteractorImpl$scanBleDevice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bleScanningInteractorImpl$scanBleDevice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bleScanningInteractorImpl$scanBleDevice$1.label;
                if (i != 0) {
                    b.b(obj);
                    tpr t = e.t(e.g(new BleScanningInteractorImpl$listenBleDevicesScanning$1(this, str, null)));
                    bleScanningInteractorImpl$scanBleDevice$1.L$0 = null;
                    bleScanningInteractorImpl$scanBleDevice$1.L$1 = null;
                    bleScanningInteractorImpl$scanBleDevice$1.label = 1;
                    obj = e.A(t, bleScanningInteractorImpl$scanBleDevice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                failure = (f26) obj;
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                f26Var = (f26) failure;
                if (!jl40.l(f26Var, d26.b)) {
                    return hlm0.c;
                }
                if (jl40.l(f26Var, d26.c)) {
                    return hlm0.d;
                }
                if (jl40.l(f26Var, d26.a)) {
                    return hlm0.a;
                }
                if (jl40.l(f26Var, d26.d)) {
                    return hlm0.e;
                }
                if (f26Var instanceof e26) {
                    String str2 = (String) kotlin.collections.a.R(((e26) f26Var).a);
                    return str2 != null ? new ilm0(str2) : hlm0Var;
                }
                if (f26Var == null) {
                    return hlm0Var;
                }
                w511.b();
                return null;
            }
        }
        bleScanningInteractorImpl$scanBleDevice$1 = new BleScanningInteractorImpl$scanBleDevice$1(this, continuationImpl);
        Object obj2 = bleScanningInteractorImpl$scanBleDevice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bleScanningInteractorImpl$scanBleDevice$1.label;
        if (i != 0) {
        }
        failure = (f26) obj2;
        if (failure instanceof Result.Failure) {
        }
        f26Var = (f26) failure;
        if (!jl40.l(f26Var, d26.b)) {
        }
    }
}
