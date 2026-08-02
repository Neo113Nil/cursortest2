package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.BuildConfig;
import com.vk.dto.common.id.UserId;
import com.vk.pushes.notifications.base.a;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: MsgRequestPendingNotification.kt */
/* loaded from: classes5.dex */
public final class xv30 extends com.vk.pushes.notifications.base.a {
    public final Object A;
    public final a x;
    public final int y;
    public final String z;

    public xv30(Context context, a aVar, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, aVar, bitmap, bitmap2, file);
        this.x = aVar;
        ca70 ca70Var = ca70.a;
        this.y = ca70.e(Long.valueOf(aVar.n));
        this.z = "msg_request";
        this.A = msy.a(LazyThreadSafetyMode.NONE, new nuj(this, 21));
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final int e() {
        return this.y;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final String f() {
        return this.z;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        a aVar = this.x;
        Long l = aVar.m;
        long j = aVar.n;
        UserId userId = l != null ? new UserId(l.longValue()) : null;
        if (userId == null || !o25.a().a(userId)) {
            return EmptyList.b;
        }
        Context context = this.c;
        String string = context.getResources().getString(R.string.vkim_msg_request_accept);
        Intent k = k(null, "msg_request_accept");
        k.putExtra("peer_id", j);
        NotificationCompat.a.C0022a c0022a = new NotificationCompat.a.C0022a(R.drawable.vk_icon_done_24, string, l(k));
        c0022a.e.putBundle("android.wearable.EXTENSIONS", new Bundle());
        NotificationCompat.a b = c0022a.b();
        String string2 = context.getResources().getString(R.string.vkim_msg_request_reject);
        Intent k2 = k(null, "msg_request_reject");
        k2.putExtra("peer_id", j);
        NotificationCompat.a.C0022a c0022a2 = new NotificationCompat.a.C0022a(R.drawable.vk_icon_cancel_24, string2, l(k2));
        c0022a2.e.putBundle("android.wearable.EXTENSIONS", new Bundle());
        return e43.l(b, c0022a2.b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return (PendingIntent) this.A.getValue();
    }

    /* compiled from: MsgRequestPendingNotification.kt */
    public static final class a extends a.C1751a {
        public final Long m;
        public final long n;

        public a(long j, String str, String str2) {
            super(pn00.k(new Pair("type", "message_request"), new Pair("group_id", "custom"), new Pair("title", str), new Pair("body", str2), new Pair("icon", "stat_notify_logo"), new Pair("category", BuildConfig.FLAVOR)));
            this.m = null;
            this.n = j;
        }

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("to_id");
            this.m = str != null ? cqm0.k(str) : null;
            map.get("to_name");
            this.n = cqm0.l(map.get("from_id"));
        }
    }
}
