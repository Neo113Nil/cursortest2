package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import java.io.File;
import java.util.Map;
import org.json.JSONObject;
import xsna.dfq0;

/* compiled from: MsgReactionNotification.kt */
/* loaded from: classes5.dex */
public final class iv30 extends dfq0 {
    public final String A;
    public final a z;

    /* compiled from: MsgReactionNotification.kt */
    public static final class a extends dfq0.a {
        public final long o;
        public final int p;
        public final Long q;

        public a(Map<String, String> map) {
            super(map);
            String str = map.get("context");
            JSONObject jSONObject = str != null ? new JSONObject(str) : new JSONObject();
            this.o = jSONObject.has("chat_id") ? jSONObject.optLong("chat_id") : Long.parseLong(map.get("from_id"));
            this.p = jSONObject.getInt("conversation_message_id");
            String str2 = map.get("to_id");
            this.q = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iv30(Context context, Map<String, String> map, Bitmap bitmap, Bitmap bitmap2, File file) {
        super(context, r2, bitmap, bitmap2, file);
        a aVar = new a(map);
        this.z = aVar;
        this.A = "msg_reaction_notification_" + aVar.o + '_' + aVar.p;
    }

    @Override // xsna.dfq0
    public final Intent C() {
        o0w b = g2v.c().b();
        a aVar = this.z;
        return o0w.j(b, this.c, aVar.q, aVar.o, null, new MsgListOpenAtMsgMode(MsgIdType.CNV_ID, aVar.p), "message_push", g2v.c().b().D(), null, 100638680);
    }

    @Override // com.vk.pushes.notifications.base.a, xsna.ri6
    public final String f() {
        return this.A;
    }
}
