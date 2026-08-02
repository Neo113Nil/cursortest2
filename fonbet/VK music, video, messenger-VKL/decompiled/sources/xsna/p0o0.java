package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import org.json.JSONObject;
import xsna.dfq0;

/* compiled from: TagPhotoNotification.kt */
/* loaded from: classes5.dex */
public final class p0o0 extends dfq0 {
    public final a z;

    /* compiled from: TagPhotoNotification.kt */
    public static final class a extends dfq0.a {
        public final Long o;
        public final Integer p;
        public final Integer q;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            JSONObject jSONObject = str != null ? new JSONObject(str) : new JSONObject();
            this.o = Long.valueOf(jSONObject.optLong("owner_id"));
            this.p = Integer.valueOf(jSONObject.optInt("item_id"));
            this.q = Integer.valueOf(jSONObject.optInt("tag_id"));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p0o0(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.z = aVar;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        Intent k = k(null, "tag_photo_accept");
        a aVar = this.z;
        k.putExtra("owner_id", aVar.o);
        Integer num = aVar.p;
        k.putExtra("item_id", num);
        Integer num2 = aVar.q;
        k.putExtra("tag_id", num2);
        Context context = this.c;
        NotificationCompat.a b = new NotificationCompat.a.C0022a(R.drawable.vk_icon_done_24, context.getString(R.string.confirm_tag), l(k)).b();
        Intent k2 = k(null, "tag_photo_decline");
        k2.putExtra("owner_id", aVar.o);
        k2.putExtra("item_id", num);
        k2.putExtra("tag_id", num2);
        return e43.l(b, new NotificationCompat.a.C0022a(R.drawable.vk_icon_cancel_24, context.getString(R.string.delete_tag), l(k2)).b());
    }
}
