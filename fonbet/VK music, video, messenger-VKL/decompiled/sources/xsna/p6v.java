package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.vk.dto.Push;
import com.vk.pushes.notifications.base.a;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: HijackingAppsNotification.kt */
/* loaded from: classes5.dex */
public final class p6v extends com.vk.pushes.notifications.base.a {
    public final bpn0 x;
    public final PendingIntent y;

    /* compiled from: HijackingAppsNotification.kt */
    public static final class a {
        public static void a(Context context, String str, String str2, List list) {
            e870 e870Var = e870.b;
            com.vk.pushes.notifications.base.a a = e870.a(context, new Push(pn00.k(new Pair("type", "hijacking_apps"), new Pair("title", str), new Pair("body", str2), new Pair("APP_PACKAGE_NAMES", j5g.g0(list, ";", null, null, 0, null, 62))), (Push.Priority) null, 6), null);
            if (a != null) {
                a.h(context);
            }
        }
    }

    /* compiled from: HijackingAppsNotification.kt */
    public static final class b extends a.C1751a {
        public final List<String> m;

        public b(Map<String, String> map) {
            super(map);
            String str = map.get("APP_PACKAGE_NAMES");
            this.m = str != null ? drm0.c0(str, new String[]{";"}, 0, 6) : EmptyList.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6v(Context context, b bVar) {
        super(context, bVar);
        PendingIntent a2;
        i35 i35Var = i35.c;
        this.x = new bpn0(new com.vk.newsfeed.common.recycler.holders.attachments.a(18, bVar, context));
        List<String> list = bVar.m;
        if (list.isEmpty()) {
            a2 = null;
        } else if (list.size() == 1) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ((String) j5g.Y(list))));
            intent.putExtra("target_user_id", bVar.k);
            a2 = t2i0.a(context, i35Var.e(), intent, 301989888);
        } else {
            a2 = t2i0.a(context, i35Var.e(), new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"), 301989888);
        }
        this.y = a2;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final void o(NotificationCompat.h hVar) {
        hVar.e(true);
        Bitmap bitmap = (Bitmap) this.x.getValue();
        if (bitmap != null) {
            hVar.q(bitmap);
        }
    }

    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return this.y;
    }
}
