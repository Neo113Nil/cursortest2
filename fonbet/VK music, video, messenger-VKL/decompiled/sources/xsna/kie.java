package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.browser.ui.VkBrowserActivity;

/* compiled from: ClipsInternalMiniAppsRouterImpl.kt */
/* loaded from: classes17.dex */
public final class kie implements jie {
    @Override // xsna.jie
    public final void b(Context context, UserId userId, String str, boolean z) {
        Uri.Builder appendQueryParameter = Uri.parse("https://static." + a0a.d + "/clips_dashboard/").buildUpon().appendQueryParameter("owner_id", String.valueOf(userId.b)).appendQueryParameter("appearance", (z || dhr0.a.c(context)) ? "dark" : "light").appendQueryParameter("schema", (z || dhr0.a.c(context)) ? "space_gray" : "bright_light").appendQueryParameter("owner_id", String.valueOf(userId.b));
        if (str != null) {
            appendQueryParameter.appendQueryParameter("clip_id", str);
        }
        Uri build = appendQueryParameter.build();
        int i = VkBrowserActivity.l;
        VkBrowserActivity.a.c(context, build.toString(), z);
    }
}
