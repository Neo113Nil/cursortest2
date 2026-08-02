package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
import xsna.dfq0;

/* compiled from: BirthdayNotification.kt */
/* loaded from: classes5.dex */
public final class fa7 extends dfq0 {
    public final a z;

    /* compiled from: BirthdayNotification.kt */
    public static final class a extends dfq0.a {
        public final UserId o;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            this.o = new UserId((str != null ? new JSONObject(str) : new JSONObject()).optLong("user_id"));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fa7(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.z = aVar;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        Intent k = k(null, "gift_send");
        k.putExtra("user_id", this.z.o);
        return Collections.singletonList(new NotificationCompat.a.C0022a(R.drawable.vk_icon_gift_24, this.c.getString(R.string.birthdays_action), l(k)).b());
    }
}
