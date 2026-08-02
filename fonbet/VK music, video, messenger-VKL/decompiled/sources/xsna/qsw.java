package xsna;

import android.content.Intent;
import com.vk.voip.ui.notifications.incoming.b;
import java.util.concurrent.ConcurrentHashMap;
import xsna.psw;

/* compiled from: IncomingCallActionsProcessorImpl.kt */
/* loaded from: classes7.dex */
public final class qsw implements psw {
    public final nsw a;
    public final ConcurrentHashMap<String, psw.a> b = new ConcurrentHashMap<>();

    public qsw(nsw nswVar) {
        this.a = nswVar;
    }

    @Override // xsna.psw
    public final void a(Intent intent) {
        psw.a aVar;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        this.a.getClass();
        String stringExtra = intent.getStringExtra("com.vk.voip.ui.notifications.IncomingCallNotifierReceiver.EXTRA_IDENTITY");
        if (stringExtra == null) {
            return;
        }
        boolean equals = action.equals("com.vk.voip.ui.notifications.IncomingCallNotifierReceiver.ACTION_ACCEPT");
        ConcurrentHashMap<String, psw.a> concurrentHashMap = this.b;
        if (equals) {
            psw.a aVar2 = concurrentHashMap.get(stringExtra);
            if (aVar2 != null) {
                aVar2.onAccept();
                return;
            }
            return;
        }
        if (!action.equals("com.vk.voip.ui.notifications.IncomingCallNotifierReceiver.ACTION_DECLINE") || (aVar = concurrentHashMap.get(stringExtra)) == null) {
            return;
        }
        aVar.a();
    }

    @Override // xsna.psw
    public final void b(String str, b.C2069b c2069b) {
        this.b.put(str, c2069b);
    }
}
