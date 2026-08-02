package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import com.unity3d.ads.BuildConfig;
import com.vk.pushes.notifications.base.a;
import java.io.File;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: MsgRequestAcceptedNotification.kt */
/* loaded from: classes5.dex */
public final class rv30 extends com.vk.pushes.notifications.base.a {
    public final Object A;
    public final a x;
    public final int y;
    public final String z;

    public rv30(Context context, a aVar, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, aVar, bitmap, bitmap2, file);
        this.x = aVar;
        ca70 ca70Var = ca70.a;
        this.y = ca70.e(Long.valueOf(aVar.n));
        this.z = "msg_request";
        this.A = msy.a(LazyThreadSafetyMode.NONE, new m1y(this, 10));
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final int e() {
        return this.y;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final String f() {
        return this.z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return (PendingIntent) this.A.getValue();
    }

    /* compiled from: MsgRequestAcceptedNotification.kt */
    public static final class a extends a.C1751a {
        public final Long m;
        public final long n;

        public a(long j, String str, String str2) {
            super(pn00.k(new Pair("type", "message_request_accepted"), new Pair("group_id", "custom"), new Pair("title", str), new Pair("body", str2), new Pair("icon", "stat_notify_logo"), new Pair("category", BuildConfig.FLAVOR)));
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
