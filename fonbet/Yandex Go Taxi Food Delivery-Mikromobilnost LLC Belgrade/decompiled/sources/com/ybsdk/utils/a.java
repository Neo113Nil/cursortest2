package com.ybsdk.utils;

import android.R;
import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.dz2;
import defpackage.dzh0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.owk0;
import defpackage.ppc;
import defpackage.pxn;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final ppc a;
    public final pxn b;
    public final owk0 c;
    public final AppAnalyticsReporter d;

    public a(ppc ppcVar, pxn pxnVar, owk0 owk0Var, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = ppcVar;
        this.b = pxnVar;
        this.c = owk0Var;
        this.d = appAnalyticsReporter;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ContinuationImpl continuationImpl) {
        RootedDeviceAlertController$checkAndShowAlert$1 rootedDeviceAlertController$checkAndShowAlert$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RootedDeviceAlertController$checkAndShowAlert$1) {
            rootedDeviceAlertController$checkAndShowAlert$1 = (RootedDeviceAlertController$checkAndShowAlert$1) continuationImpl;
            int i2 = rootedDeviceAlertController$checkAndShowAlert$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rootedDeviceAlertController$checkAndShowAlert$1.label = i2 - Integer.MIN_VALUE;
                obj = rootedDeviceAlertController$checkAndShowAlert$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rootedDeviceAlertController$checkAndShowAlert$1.label;
                zy11 zy11Var = zy11.a;
                ppc ppcVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!ppcVar.b) {
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        RootedDeviceAlertController$checkAndShowAlert$isRoot$1 rootedDeviceAlertController$checkAndShowAlert$isRoot$1 = new RootedDeviceAlertController$checkAndShowAlert$isRoot$1(this, null);
                        rootedDeviceAlertController$checkAndShowAlert$1.L$0 = context;
                        rootedDeviceAlertController$checkAndShowAlert$1.label = 1;
                        obj = tje.k0(mdhVar, rootedDeviceAlertController$checkAndShowAlert$isRoot$1, rootedDeviceAlertController$checkAndShowAlert$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                context = (Context) rootedDeviceAlertController$checkAndShowAlert$1.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    this.d.d0.a.a("rooted_device_alert.showed", null);
                    new AlertDialog.a(context).setTitle(context.getString(dzh0.ybsdk_device_root_rooted_device_alert_title)).c(dzh0.ybsdk_device_root_rooted_device_alert_message).setPositiveButton(R.string.ok, new dz2(6)).create().show();
                    ppcVar.b = true;
                }
                return zy11Var;
            }
        }
        rootedDeviceAlertController$checkAndShowAlert$1 = new RootedDeviceAlertController$checkAndShowAlert$1(this, continuationImpl);
        obj = rootedDeviceAlertController$checkAndShowAlert$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rootedDeviceAlertController$checkAndShowAlert$1.label;
        zy11 zy11Var2 = zy11.a;
        ppc ppcVar2 = this.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11Var2;
    }
}
