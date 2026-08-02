package xsna;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vk.dto.Push;
import java.util.LinkedHashMap;

/* compiled from: PushCommandReader.kt */
/* loaded from: classes6.dex */
public final class che0 {
    public final xf00 a;
    public boolean b;
    public final bpn0 c = new bpn0(new ltb0(3));
    public final bpn0 d = new bpn0(new by20(this, 23));
    public final bpn0 e = new bpn0(new b410(this, 19));

    /* compiled from: PushCommandReader.kt */
    public static final class a extends Handler {
        public final che0 a;

        public a(che0 che0Var, Looper looper) {
            super(looper);
            this.a = che0Var;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String string;
            String string2;
            Bundle data = message.getData();
            che0 che0Var = this.a;
            xf00 xf00Var = che0Var.a;
            if (che0Var.b || (string = data.getString("push_command_name")) == null) {
                return;
            }
            int hashCode = string.hashCode();
            if (hashCode == -2062414158) {
                if (string.equals("deleted_messages")) {
                    xf00Var.b();
                    return;
                }
                return;
            }
            if (hashCode == -252244326) {
                if (string.equals("new_token") && (string2 = data.getString("push_token")) != null) {
                    xf00Var.a(string2);
                    return;
                }
                return;
            }
            if (hashCode == 158990369 && string.equals("new_push_message")) {
                String string3 = data.getString("push_session_id");
                String string4 = data.getString("remote_push_message_from");
                String[] stringArray = data.getStringArray("remote_push_message_map_keys");
                if (stringArray == null) {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("No remote_push_message_map_keys in the remote push msg"));
                    return;
                }
                String[] stringArray2 = data.getStringArray("remote_push_message_map_values");
                if (stringArray2 == null) {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("No remote_push_message_map_values in the remote push msg"));
                    return;
                }
                if (stringArray2.length != stringArray.length) {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("remote push values size and kys size is differ:" + stringArray2.length + ' ' + stringArray.length));
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = stringArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    linkedHashMap.put(stringArray[i], stringArray2[i2]);
                    i++;
                    i2++;
                }
                int i3 = data.getInt("push_priority", -1);
                if (i3 == -1) {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("No push_priority in the remote push msg"));
                } else {
                    Push.Priority.Companion.getClass();
                    xf00Var.c(new Push(linkedHashMap, Push.Priority.a.a(i3), 4), string4, string3);
                }
            }
        }
    }

    public che0(xf00 xf00Var) {
        this.a = xf00Var;
    }
}
