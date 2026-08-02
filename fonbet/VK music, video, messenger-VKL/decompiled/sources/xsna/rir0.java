package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import com.vk.pushes.notifications.base.a;
import java.io.File;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;

/* compiled from: ValidateDeviceNotification.kt */
/* loaded from: classes5.dex */
public final class rir0 extends com.vk.pushes.notifications.base.a {
    public final a x;
    public final Object y;

    /* compiled from: ValidateDeviceNotification.kt */
    public static final class a extends a.C1751a {
        public final String m;
        public final String n;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("url");
            this.m = str == null ? "" : str;
            String str2 = map.get("context");
            this.n = (str2 != null ? new JSONObject(str2) : new JSONObject()).optString("device_token");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rir0(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.x = aVar;
        this.y = msy.a(LazyThreadSafetyMode.NONE, new ew3(24, context, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return (PendingIntent) this.y.getValue();
    }
}
