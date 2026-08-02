package xsna;

import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Pair;

/* compiled from: MessengerAppsHelper.kt */
/* loaded from: classes15.dex */
public final class eh20 {
    public static final Object a = pn00.k(new Pair("telegram", "org.telegram.messenger"), new Pair("viber", "com.viber.voip"), new Pair("whatsapp", "com.whatsapp"), new Pair("vk", "com.vkontakte.android"), new Pair(InneractiveMediationNameConsts.MAX, "ru.oneme.app"));

    public static boolean a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            par0 par0Var = par0.a;
            String str = "[MessengerAppsHelper] Error starting activity: " + th.getMessage();
            par0Var.getClass();
            par0.a(str);
            return false;
        }
    }
}
