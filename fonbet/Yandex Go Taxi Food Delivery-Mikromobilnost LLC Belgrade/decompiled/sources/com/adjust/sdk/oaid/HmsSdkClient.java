package com.adjust.sdk.oaid;

import android.content.Context;
import com.adjust.sdk.ILogger;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class HmsSdkClient {
    public static OaidInfo getOaidInfo(final Context context, final ILogger iLogger, long j) {
        try {
            FutureTask futureTask = new FutureTask(new Callable<OaidInfo>() { // from class: com.adjust.sdk.oaid.HmsSdkClient.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public OaidInfo call() {
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        if (advertisingIdInfo != null) {
                            return new OaidInfo(advertisingIdInfo.getId(), !advertisingIdInfo.isLimitAdTrackingEnabled());
                        }
                        return null;
                    } catch (Exception e) {
                        iLogger.error("Exception while reading oaid using hms %s", e.getMessage());
                        return null;
                    }
                }
            });
            new Thread(futureTask).start();
            return (OaidInfo) futureTask.get(j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            iLogger.error("Fail to read oaid info using hms, %s", th.getMessage());
            return null;
        }
    }
}
