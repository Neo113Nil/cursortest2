package xsna;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.channels.api.ChannelHistoryOpenMode;
import com.vk.pushes.notifications.base.a;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: CommunityChannelActivationNotification.kt */
/* loaded from: classes5.dex */
public final class cug extends com.vk.pushes.notifications.base.a {
    public final boolean x;
    public final PendingIntent y;
    public final String z;

    /* compiled from: CommunityChannelActivationNotification.kt */
    public static final class a extends a.C1751a {
        public final long m;
        public final Long n;

        public a(Map<String, String> map) {
            super(map);
            Long l;
            long j;
            String str = map.get("context");
            this.m = (str != null ? new JSONObject(str) : new JSONObject()).optLong("sender_id");
            String str2 = map.get("to_id");
            if (str2 != null) {
                byte[] bArr = x2r0.a;
                try {
                    j = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                l = Long.valueOf(j);
            } else {
                l = null;
            }
            this.n = l;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cug(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.x = true;
        Intent a2 = g2v.c().a().a(context, aVar.m, ChannelHistoryOpenMode.OpenAtUnread.b, aVar.n, g2v.c().b().D());
        if (a2 != null) {
            a2.setComponent(new ComponentName(this.c, z4g.d().s()));
            a2.putExtra("target_user_id", aVar.k);
            a2.putExtra("withoutAnimation", true);
            a2.putExtra("from_push", true);
            a2.putExtra("push_action", "open_channel");
            a2.putExtra("notification_tag_id_key", this.z);
            a2.putExtra("push_type_key", aVar.a("type"));
            String a3 = aVar.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT);
            if (a3 != null) {
                a2.putExtra("stat_key", a3);
            }
            String a4 = aVar.a("need_track_interaction");
            if (a4 != null) {
                a2.putExtra("track_interaction_key", a4);
            }
        } else {
            a2 = null;
        }
        this.y = a2 != null ? t2i0.a(context, i35.c.e(), a2, 67108864) : null;
        this.z = "channel_activation_notification_" + Long.valueOf(aVar.m) + '_' + aVar.n;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final String f() {
        return this.z;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return this.y;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final boolean y() {
        return this.x;
    }
}
