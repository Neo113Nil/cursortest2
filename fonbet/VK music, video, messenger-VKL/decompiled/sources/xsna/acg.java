package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;
import xsna.dfq0;

/* compiled from: CommentNotification.kt */
/* loaded from: classes5.dex */
public final class acg extends dfq0 {
    public final a z;

    /* compiled from: CommentNotification.kt */
    public static final class a extends dfq0.a {
        public final Long o;
        public final Integer p;
        public final Integer q;
        public final String r;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            JSONObject jSONObject = str != null ? new JSONObject(str) : new JSONObject();
            this.o = Long.valueOf(jSONObject.optLong("owner_id"));
            this.p = Integer.valueOf(jSONObject.optInt("item_id"));
            this.q = Integer.valueOf(jSONObject.optInt("reply_id"));
            this.r = jSONObject.optString("type");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public acg(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.z = aVar;
    }

    public final NotificationCompat.a D() {
        Intent k = k(null, "like");
        a aVar = this.z;
        k.putExtra("owner_id", aVar.o);
        k.putExtra("item_id", aVar.q);
        k.putExtra("type", aVar.r);
        NotificationCompat.a.C0022a c0022a = new NotificationCompat.a.C0022a(R.drawable.vk_icon_like_24, this.c.getString(R.string.like), l(k));
        c0022a.e.putBundle("android.wearable.EXTENSIONS", new Bundle());
        return c0022a.b();
    }

    public final NotificationCompat.a E() {
        HashSet hashSet = new HashSet();
        Bundle bundle = new Bundle();
        Context context = this.c;
        kvf0 kvf0Var = new kvf0("message", context.getString(R.string.reply_to), null, true, 0, bundle, hashSet);
        Intent k = k(null, "comment_send");
        a aVar = this.z;
        k.putExtra("owner_id", aVar.o);
        k.putExtra("item_id", aVar.p);
        k.putExtra("reply_id", aVar.q);
        k.putExtra("type", aVar.r);
        k.putExtra("url", aVar.m);
        NotificationCompat.a.C0022a c0022a = new NotificationCompat.a.C0022a(R.drawable.vk_icon_reply_24, context.getString(R.string.reply_to), l(k));
        c0022a.a(kvf0Var);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("flags", 5);
        c0022a.e.putBundle("android.wearable.EXTENSIONS", bundle2);
        return c0022a.b();
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        return gz80.a(24) ? e43.l(E(), D()) : Collections.singletonList(D());
    }

    @Override // com.vk.pushes.notifications.base.a
    public final void p(NotificationCompat.n nVar) {
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            nVar.d = bitmap;
        }
        nVar.a.addAll(e43.l(E(), D()));
    }
}
