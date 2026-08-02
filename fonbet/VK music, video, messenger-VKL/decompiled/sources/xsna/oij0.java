package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import com.vk.pushes.notifications.base.a;
import java.io.File;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;

/* compiled from: ShowMessageNotification.kt */
/* loaded from: classes5.dex */
public final class oij0 extends com.vk.pushes.notifications.base.a {
    public final a x;
    public final Object y;

    /* compiled from: ShowMessageNotification.kt */
    public static final class a extends a.C1751a {
        public final String m;
        public final String n;
        public final String o;
        public final String p;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            JSONObject jSONObject = str != null ? new JSONObject(str) : new JSONObject();
            this.m = jSONObject.optString("title");
            this.n = jSONObject.optString("message");
            this.o = jSONObject.optString("button");
            this.p = jSONObject.optString("url");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oij0(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.x = aVar;
        this.y = msy.a(LazyThreadSafetyMode.NONE, new y4(21, context, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return (PendingIntent) this.y.getValue();
    }
}
