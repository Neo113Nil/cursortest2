package xsna;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.vk.dto.Push;
import java.util.Map;

/* compiled from: PushCommandWriter.kt */
/* loaded from: classes6.dex */
public final class dhe0 {
    public final Messenger a;

    public dhe0(IBinder iBinder) {
        this.a = new Messenger(iBinder);
    }

    public final void a(Bundle bundle) {
        try {
            Message obtain = Message.obtain((Handler) null, 0);
            obtain.setData(bundle);
            obtain.setAsynchronous(true);
            this.a.send(obtain);
        } catch (DeadObjectException unused) {
        }
    }

    public final void b(Push push, String str, String str2) {
        Bundle b = qr.b("push_command_name", "new_push_message", "push_session_id", str);
        b.putString("remote_push_message_from", str2);
        Map<String, String> map = push.a;
        b.putStringArray("remote_push_message_map_keys", (String[]) map.keySet().toArray(new String[0]));
        b.putStringArray("remote_push_message_map_values", (String[]) map.values().toArray(new String[0]));
        b.putInt("push_priority", push.b.i());
        a(b);
    }
}
