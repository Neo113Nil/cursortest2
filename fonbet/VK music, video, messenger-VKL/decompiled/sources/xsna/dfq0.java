package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.pushes.PushOpenActivity;
import com.vk.pushes.notifications.base.a;
import java.io.File;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: UrlNotification.kt */
/* loaded from: classes5.dex */
public class dfq0 extends com.vk.pushes.notifications.base.a {
    public final a x;
    public final Object y;

    public /* synthetic */ dfq0(Context context, a aVar, Bitmap bitmap) {
        this(context, aVar, bitmap, (Bitmap) null, (File) null);
    }

    public Intent C() {
        int i = PushOpenActivity.f;
        String f = f();
        a aVar = this.x;
        Intent a2 = PushOpenActivity.a.a(f, this.c, "open_url", aVar.a("type"), aVar.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT), aVar.a("need_track_interaction"));
        a2.putExtra("url", aVar.m);
        a2.putExtra("force_browser", aVar.n);
        a2.setAction(String.valueOf(i35.c.e()));
        return a2;
    }

    @Override // com.vk.pushes.notifications.base.a
    public void o(NotificationCompat.h hVar) {
        hVar.e(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return (PendingIntent) this.y.getValue();
    }

    public String toString() {
        return "UrlNotification(notify=" + this.x + ')';
    }

    public dfq0(Context context, a aVar, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, aVar, bitmap, bitmap2, file);
        this.x = aVar;
        this.y = msy.a(LazyThreadSafetyMode.NONE, new xg2(14, this, context));
    }

    public dfq0(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        this(context, new a(map), bitmap, bitmap2, file);
    }

    /* compiled from: UrlNotification.kt */
    public static class a extends a.C1751a {
        public final String m;
        public final boolean n;

        public a(String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
            this(pn00.k(new Pair("id", str), new Pair("type", "custom"), new Pair("title", str2), new Pair("subtitle", str3), new Pair("body", str4), new Pair("category", BuildConfig.FLAVOR), new Pair("url", str5), new Pair("external_url", String.valueOf(z2)), new Pair("to_id", String.valueOf(j)), new Pair("sound", z ? "1" : "0")));
        }

        public final String getUrl() {
            return this.m;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("UrlNotificationContainer(url='");
            sb.append(this.m);
            sb.append("', isExternalUrl=");
            return defpackage.q0.a(sb, this.n, ')');
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2, int i, zcl zclVar) {
            this(str, str2, str3, str4, str5, j, z, (i & 128) != 0 ? false : z2);
        }

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("url");
            this.m = str == null ? "" : str;
            this.n = "true".equals(map.get("external_url"));
        }
    }
}
