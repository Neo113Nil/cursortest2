package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.ironsource.X3;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;
import xsna.dfq0;

/* compiled from: MentionNotification.kt */
/* loaded from: classes5.dex */
public final class t320 extends dfq0 {
    public final a z;

    /* compiled from: MentionNotification.kt */
    public static final class a extends dfq0.a {
        public final Long o;
        public final long p;
        public final int q;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("to_id");
            this.o = str != null ? cqm0.k(str) : null;
            map.get(X3.j.D);
            String str2 = map.get("context");
            JSONObject jSONObject = str2 != null ? new JSONObject(str2) : new JSONObject();
            this.p = jSONObject.optLong("chat_id");
            this.q = jSONObject.optInt("conversation_message_id");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t320(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.z = aVar;
    }

    @Override // xsna.dfq0
    public final Intent C() {
        Intent C = super.C();
        a aVar = this.z;
        long j = aVar.p;
        int i = aVar.q;
        C.putExtra("mention_dialog_id", j);
        C.putExtra("mention_cnv_msg_id", i);
        Long l = aVar.o;
        if (l != null) {
            C.putExtra("url", Uri.parse(aVar.m).buildUpon().appendQueryParameter("to_id", String.valueOf(l.longValue())).build().toString());
        }
        return C;
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final Intent b() {
        Intent b = super.b();
        a aVar = this.z;
        long j = aVar.p;
        int i = aVar.q;
        b.putExtra("mention_dialog_id", j);
        b.putExtra("mention_cnv_msg_id", i);
        b.setAction("delete_mention_from_cache");
        return b;
    }

    @Override // xsna.ri6
    public final void g(NotificationManager notificationManager) {
        super.g(notificationManager);
        y320 y320Var = y320.b;
        a aVar = this.z;
        long j = aVar.p;
        io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(y320.b(j), new rj4(new v320(this.k, j, aVar.q, this.l), 21));
        asu0.a.getClass();
        itg0.l(sVar.o(asu0.i()));
    }
}
