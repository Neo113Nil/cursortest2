package com.adjust.sdk.oaid;

import android.content.Context;
import com.adjust.sdk.ILogger;
import com.bun.miitmdid.core.MdidSdkHelper;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IdSupplier;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class MsaSdkClient {
    public static OaidInfo getOaidInfo(Context context, final ILogger iLogger, long j) {
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(1);
        try {
            if (isError(MdidSdkHelper.InitSdk(context, false, new IIdentifierListener() { // from class: com.adjust.sdk.oaid.MsaSdkClient.1
                public void onSupport(IdSupplier idSupplier) {
                    if (idSupplier != null) {
                        try {
                            if (idSupplier.getOAID() != null) {
                                linkedBlockingQueue.offer(new OaidInfo(idSupplier.getOAID(), !idSupplier.isLimited()));
                                return;
                            }
                        } catch (Exception e) {
                            iLogger.error("Fail to add %s", e.getMessage());
                            return;
                        }
                    }
                    linkedBlockingQueue.offer(new OaidInfo(null, false));
                }
            }), iLogger)) {
                return null;
            }
            return (OaidInfo) linkedBlockingQueue.poll(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            iLogger.error("Waiting to read oaid from callback interrupted: %s", e.getMessage());
            return null;
        } catch (NoClassDefFoundError e2) {
            iLogger.error("Couldn't find msa sdk " + e2.getMessage(), new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.error("Oaid reading process failed %s", th.getMessage());
            return null;
        }
    }

    private static boolean isError(int i, ILogger iLogger) {
        switch (i) {
            case 1008611:
                iLogger.error("msa sdk error - INIT_ERROR_MANUFACTURER_NOSUPPORT", new Object[0]);
                return true;
            case 1008612:
                iLogger.error("msa sdk error - INIT_ERROR_DEVICE_NOSUPPORT", new Object[0]);
                return true;
            case 1008613:
                iLogger.error("msa sdk error - INIT_ERROR_LOAD_CONFIGFILE", new Object[0]);
                return true;
            case 1008614:
            default:
                return false;
            case 1008615:
                iLogger.error("msa sdk error - INIT_ERROR_SDK_CALL_ERROR", new Object[0]);
                return true;
            case 1008616:
                iLogger.error("msa sdk error - INIT_ERROR_CERT_ERROR", new Object[0]);
                return true;
        }
    }
}
