package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
import com.vk.push.core.utils.PackageExtenstionsKt;
import com.vk.push.pushsdk.VkpnsPushConfig;

/* compiled from: MasterUpdateNotifier.kt */
/* loaded from: classes5.dex */
public final class ok10 {
    public static void a(Context context) {
        Logger defaultLogger;
        for (String str : PackageExtenstionsKt.getClientsPackages(context.getPackageManager())) {
            Intent intent = new Intent();
            intent.setAction(ComponentActions.MASTER_HOST_UPDATE_ACTION);
            intent.setPackage(str);
            intent.setFlags(32);
            context.sendBroadcast(intent);
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            if (vkpnsPushConfig == null || (defaultLogger = vkpnsPushConfig.c) == null) {
                defaultLogger = new DefaultLogger("VkpnsPushProviderSdk");
            }
            Logger.DefaultImpls.info$default(defaultLogger, go9.b("Master update broadcast sent to ", str), null, 2, null);
        }
    }
}
