package xsna;

import android.content.Intent;
import java.util.concurrent.ConcurrentHashMap;
import xsna.ko80;
import xsna.po80;

/* compiled from: OngoingCallActionsProcessorImpl.kt */
/* loaded from: classes7.dex */
public final class lo80 implements ko80 {
    public final io80 a;
    public final ConcurrentHashMap<String, ko80.a> b = new ConcurrentHashMap<>();

    public lo80(io80 io80Var) {
        this.a = io80Var;
    }

    @Override // xsna.ko80
    public final void a(Intent intent) {
        ko80.a aVar;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        this.a.getClass();
        String stringExtra = intent.getStringExtra("com.vk.voip.ui.notifications.OngoingCallNotifierReceiver.EXTRA_IDENTITY");
        if (stringExtra == null) {
            return;
        }
        boolean equals = action.equals("com.vk.voip.ui.notifications.OngoingCallNotifierReceiver.ACTION_ACCEPT");
        ConcurrentHashMap<String, ko80.a> concurrentHashMap = this.b;
        if (equals) {
            ko80.a aVar2 = concurrentHashMap.get(stringExtra);
            if (aVar2 != null) {
                aVar2.onAccept();
                return;
            }
            return;
        }
        if (action.equals("com.vk.voip.ui.notifications.OngoingCallNotifierReceiver.ACTION_DECLINE")) {
            ko80.a aVar3 = concurrentHashMap.get(stringExtra);
            if (aVar3 != null) {
                aVar3.a();
                return;
            }
            return;
        }
        if (!action.equals("com.vk.voip.ui.notifications.OngoingCallNotifierReceiver.ACTION_FINISH") || (aVar = concurrentHashMap.get(stringExtra)) == null) {
            return;
        }
        aVar.onFinish();
    }

    @Override // xsna.ko80
    public final void b(String str) {
        this.b.remove(str);
    }

    @Override // xsna.ko80
    public final void c(String str, po80.b bVar) {
        this.b.put(str, bVar);
    }
}
