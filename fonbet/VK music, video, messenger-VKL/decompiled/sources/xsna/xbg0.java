package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import com.vk.pushes.notifications.base.a;
import java.io.File;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;

/* compiled from: RestoreAuthNotification.kt */
/* loaded from: classes5.dex */
public final class xbg0 extends com.vk.pushes.notifications.base.a {
    public final a x;
    public final Object y;

    /* compiled from: RestoreAuthNotification.kt */
    public static final class a extends a.C1751a {
        public final Integer m;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("code");
            this.m = str != null ? arm0.m(10, str) : null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xbg0(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.x = aVar;
        this.y = msy.a(LazyThreadSafetyMode.NONE, new cy0(context, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return (PendingIntent) this.y.getValue();
    }
}
