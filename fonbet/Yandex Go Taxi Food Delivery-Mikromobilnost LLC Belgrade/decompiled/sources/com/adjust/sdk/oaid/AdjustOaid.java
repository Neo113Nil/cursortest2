package com.adjust.sdk.oaid;

import android.content.Context;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.bun.miitmdid.core.MdidSdkHelper;
import defpackage.g8e;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;

/* loaded from: classes.dex */
public class AdjustOaid {
    static boolean isMsaSdkAvailable;
    static boolean isOaidToBeRead;

    public static void doNotReadOaid() {
        isOaidToBeRead = false;
    }

    public static void getOaid(final Context context, final OnOaidReadListener onOaidReadListener) {
        final ILogger logger = AdjustFactory.getLogger();
        if (onOaidReadListener == null) {
            logger.error("onOaidReadListener cannot be null", new Object[0]);
        } else if (context == null) {
            logger.error("context cannot be null", new Object[0]);
        } else {
            new AsyncTaskExecutor<Context, OaidResult>() { // from class: com.adjust.sdk.oaid.AdjustOaid.1
                @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
                public OaidResult doInBackground(Context[] contextArr) {
                    AdjustOaid.readOaid(context);
                    OaidResult oaidResult = new OaidResult();
                    Map<String, String> oaidParameters = Util.getOaidParameters(context, logger);
                    if (oaidParameters == null || oaidParameters.get(CommonUrlParts.HUAWEI_OAID) == null) {
                        oaidResult.error = "Failed to read OAID";
                        return oaidResult;
                    }
                    oaidResult.oaid = oaidParameters.get(CommonUrlParts.HUAWEI_OAID);
                    return oaidResult;
                }

                @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
                public void onPostExecute(OaidResult oaidResult) {
                    String str = oaidResult.oaid;
                    OnOaidReadListener onOaidReadListener2 = onOaidReadListener;
                    if (str != null) {
                        onOaidReadListener2.onOaidRead(str);
                    } else {
                        onOaidReadListener2.onFail(oaidResult.error);
                    }
                }
            }.execute(context);
        }
    }

    public static void readOaid(Context context) {
        ILogger logger = AdjustFactory.getLogger();
        readOaid();
        try {
            System.loadLibrary("msaoaidsec");
            isMsaSdkAvailable = MdidSdkHelper.InitCert(context, Util.readCertFromAssetFile(context, logger));
        } catch (Throwable th) {
            isMsaSdkAvailable = false;
            logger.debug(Constants.LOGTAG, g8e.s(th, new StringBuilder("Error during msa sdk initialization ")));
        }
    }

    public static void readOaid() {
        isOaidToBeRead = true;
    }
}
