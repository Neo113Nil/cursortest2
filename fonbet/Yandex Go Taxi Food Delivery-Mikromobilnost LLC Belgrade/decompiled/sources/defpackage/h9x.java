package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.activity.MessengerRequestCode;
import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import java.lang.ref.WeakReference;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class h9x implements ao3 {
    public final yh3 a;
    public final an90 b;
    public final k0b c;
    public final bo3 w;
    public final fcf x;
    public final ChatRequest y;
    public boolean z;

    public h9x(yh3 yh3Var, an90 an90Var, b40 b40Var, bo3 bo3Var, ChatRequest chatRequest, k0b k0bVar, fcf fcfVar) {
        this.a = yh3Var;
        this.c = k0bVar;
        this.w = bo3Var;
        this.x = fcfVar;
        this.b = an90Var;
        this.y = chatRequest;
        if (fcfVar.a == chatRequest) {
            fcfVar.a = null;
            k0bVar.a();
        }
        MessengerRequestCode messengerRequestCode = MessengerRequestCode.CAMERA;
        new WeakReference(k0bVar);
        b40Var.getClass();
    }

    @Override // defpackage.ao3
    public final void a() {
        this.c.a();
    }

    @Override // defpackage.ao3
    public final void f() {
        this.x.a = this.y;
        if (!this.z) {
            int value = MessengerRequestCode.JOIN_CHAT.getValue();
            yh3 yh3Var = this.a;
            yh3Var.getClass();
            yh3.a(yh3Var, value, "android_messenger_join_chat");
            return;
        }
        int value2 = MessengerRequestCode.JOIN_CHAT.getValue();
        bn90 bn90Var = (bn90) this.b;
        bn90Var.b.c("am account request", CRLReasonCodeExtension.REASON, "android_messenger_join_chat_without_phone");
        Activity activity = bn90Var.a;
        Intent intent = new Intent(activity, (Class<?>) ProxyPassportActivity.class);
        intent.setAction("LOGIN");
        activity.startActivityForResult(intent, value2);
    }
}
