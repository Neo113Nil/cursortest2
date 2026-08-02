package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;
import xsna.dfq0;

/* compiled from: PostNotification.kt */
/* loaded from: classes5.dex */
public final class d6c0 extends dfq0 {
    public final a z;

    /* compiled from: PostNotification.kt */
    public static final class a extends dfq0.a {
        public final Long o;
        public final Integer p;
        public final String q;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            JSONObject jSONObject = str != null ? new JSONObject(str) : new JSONObject();
            this.o = Long.valueOf(jSONObject.optLong("owner_id"));
            this.p = Integer.valueOf(jSONObject.optInt("item_id"));
            this.q = jSONObject.optString("type");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d6c0(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.z = aVar;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        Intent k = k(null, "like");
        a aVar = this.z;
        k.putExtra("owner_id", aVar.o);
        k.putExtra("item_id", aVar.p);
        k.putExtra("type", aVar.q);
        return Collections.singletonList(new NotificationCompat.a.C0022a(R.drawable.vk_icon_like_24, this.c.getString(R.string.like), l(k)).b());
    }
}
