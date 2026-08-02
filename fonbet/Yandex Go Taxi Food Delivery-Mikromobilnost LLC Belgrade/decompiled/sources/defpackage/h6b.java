package defpackage;

import android.content.SharedPreferences;
import com.yandex.messaging.internal.entities.ChatId;

/* loaded from: classes15.dex */
public final class h6b {
    public final o1b0 a;
    public final p150 b;
    public final ch60 c;

    public h6b(o1b0 o1b0Var, p150 p150Var, ch60 ch60Var) {
        this.a = o1b0Var;
        this.b = p150Var;
        this.c = ch60Var;
    }

    public final String a() {
        o1b0 o1b0Var = this.a;
        long j = o1b0Var.a;
        String str = o1b0Var.b;
        String h = this.b.h();
        ch60 ch60Var = this.c;
        ch60Var.getClass();
        SharedPreferences sharedPreferences = ch60Var.d;
        if (ChatId.Companion.e(str)) {
            String l = b64.l("messenger-chat-v2_private_", ch60Var.c(), "_", String.valueOf(sharedPreferences.getInt("notification_code_number", 0)));
            ch60Var.a(l, ch60Var.e);
            return l;
        }
        if (ChatId.Companion.f(str)) {
            String l2 = b64.l("messenger-chat-v2_thread_", ch60Var.c(), "_", String.valueOf(sharedPreferences.getInt("notification_code_number", 0)));
            ch60Var.a(l2, ch60Var.f);
            return l2;
        }
        String b = ch60Var.b(j);
        ch60Var.a(b, h);
        return b;
    }
}
