package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import org.json.JSONObject;
import xsna.dfq0;

/* compiled from: GroupInviteNotification.kt */
/* loaded from: classes5.dex */
public final class elu extends dfq0 {
    public final a z;

    /* compiled from: GroupInviteNotification.kt */
    public static final class a extends dfq0.a {
        public final UserId o;
        public final boolean p;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            this.o = new UserId((str != null ? new JSONObject(str) : new JSONObject()).optLong("group_id"));
            this.p = "event_invite".equals(map.get("type"));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public elu(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.z = aVar;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        Intent k = k(null, "group_accept");
        a aVar = this.z;
        k.putExtra("group_id", aVar.o);
        boolean z = aVar.p;
        int i = z ? R.string.event_inv_accept : R.string.group_inv_accept;
        Context context = this.c;
        NotificationCompat.a b = new NotificationCompat.a.C0022a(R.drawable.vk_icon_done_24, context.getString(i), l(k)).b();
        Intent k2 = k(null, "group_decline");
        k2.putExtra("group_id", aVar.o);
        return e43.l(b, new NotificationCompat.a.C0022a(R.drawable.vk_icon_cancel_24, context.getString(z ? R.string.event_inv_decline : R.string.group_inv_decline), l(k2)).b());
    }
}
