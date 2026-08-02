package xsna;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat;
import com.vk.pushes.notifications.base.a;
import com.vkontakte.android.R;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import org.json.JSONObject;

/* compiled from: ValidateActionNotification.kt */
/* loaded from: classes5.dex */
public final class qir0 extends com.vk.pushes.notifications.base.a {
    public final a x;
    public final Object y;

    /* compiled from: ValidateActionNotification.kt */
    public static final class a extends a.C1751a {
        public final String m;
        public final String n;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            JSONObject jSONObject = str != null ? new JSONObject(str) : new JSONObject();
            this.m = jSONObject.optString("confirm_hash");
            this.n = jSONObject.optString("confirm");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qir0(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.x = aVar;
        this.y = msy.a(LazyThreadSafetyMode.NONE, new k4(20, context, this));
    }

    @Override // com.vk.pushes.notifications.base.a
    public final Collection<NotificationCompat.a> m() {
        Intent k = k(null, "validate_action_confirm");
        a aVar = this.x;
        k.putExtra("hash", aVar.m);
        Context context = this.c;
        String string = context.getString(R.string.signup_confirm);
        i35 i35Var = i35.c;
        NotificationCompat.a b = new NotificationCompat.a.C0022a(R.drawable.vk_icon_done_24, string, PendingIntent.getBroadcast(context, i35Var.e(), k, 167772160)).b();
        Intent k2 = k(null, "validate_action_decline");
        k2.putExtra("hash", aVar.m);
        return e43.l(b, new NotificationCompat.a.C0022a(R.drawable.vk_icon_cancel_24, context.getString(R.string.cancel), PendingIntent.getBroadcast(context, i35Var.e(), k2, 167772160)).b());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.pushes.notifications.base.a
    public final PendingIntent r() {
        return (PendingIntent) this.y.getValue();
    }
}
