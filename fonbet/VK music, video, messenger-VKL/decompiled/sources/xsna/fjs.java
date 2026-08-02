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

/* compiled from: FriendRequestNotification.kt */
/* loaded from: classes5.dex */
public class fjs extends dfq0 {
    public final a z;

    /* compiled from: FriendRequestNotification.kt */
    public static class a extends dfq0.a {
        public final UserId o;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            this.o = new UserId((str != null ? new JSONObject(str) : new JSONObject()).optLong("user_id"));
        }
    }

    public fjs(Context context, a aVar, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, aVar, bitmap, bitmap2, file);
        this.z = aVar;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        Intent k = k(null, "friend_accept");
        a aVar = this.z;
        k.putExtra("user_id", aVar.o);
        Context context = this.c;
        NotificationCompat.a b = new NotificationCompat.a.C0022a(R.drawable.vk_icon_done_24, context.getString(R.string.friends_add), l(k)).b();
        Intent k2 = k(null, "friend_decline");
        k2.putExtra("user_id", aVar.o);
        return e43.l(b, new NotificationCompat.a.C0022a(R.drawable.vk_icon_cancel_24, context.getString(R.string.friends_decline), l(k2)).b());
    }
}
