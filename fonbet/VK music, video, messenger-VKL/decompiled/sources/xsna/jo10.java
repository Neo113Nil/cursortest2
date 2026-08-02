package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.superapp.analytics.MaxMessengerAnalytics;

/* compiled from: MaxMessengerFlowAppsStarter.kt */
/* loaded from: classes15.dex */
public final class jo10 {
    public static final char[] b = "0123456789abcdef".toCharArray();
    public static final String c = "YYew2re4334t88mc{WIO2E38w4r8";
    public final MaxMessengerAnalytics a;

    public jo10(MaxMessengerAnalytics maxMessengerAnalytics) {
        this.a = maxMessengerAnalytics;
    }

    public final boolean a(Context context, String str, boolean z) {
        Intent addFlags;
        try {
            if (z) {
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("ru.oneme.app");
                addFlags = launchIntentForPackage != null ? launchIntentForPackage.addFlags(268435456) : null;
                if (addFlags != null) {
                    par0.a.getClass();
                    par0.a("DefaultClientSeamlessInstallFlow Using direct package intent for max opening");
                    context.startActivity(addFlags);
                    this.a.h();
                    par0.a.getClass();
                    par0.a("DefaultClientSeamlessInstallFlow Success opening max app");
                    return true;
                }
            }
            context.startActivity(addFlags);
            this.a.h();
            par0.a.getClass();
            par0.a("DefaultClientSeamlessInstallFlow Success opening max app");
            return true;
        } catch (Throwable unused) {
            par0.a.getClass();
            par0.a("DefaultClientSeamlessInstallFlow Error opening max app");
            return false;
        }
        par0.a.getClass();
        par0.a("DefaultClientSeamlessInstallFlow Using android app link intent for max opening");
        if (str == null) {
            str = "https://max.ru/verificationcodes_bot";
        }
        addFlags = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)).addFlags(268435456);
    }
}
