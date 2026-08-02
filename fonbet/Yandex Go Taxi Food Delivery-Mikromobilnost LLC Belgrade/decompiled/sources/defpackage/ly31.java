package defpackage;

import android.os.Handler;
import com.yandex.messaging.ExistingChatRequest;

/* loaded from: classes15.dex */
public final class ly31 extends l1b1 {
    public final ExistingChatRequest a;
    public final b00 b;
    public final oy31 c;
    public final String d;
    public final String e;

    public ly31(ExistingChatRequest existingChatRequest, b00 b00Var, oy31 oy31Var, String str, String str2) {
        this.a = existingChatRequest;
        this.b = b00Var;
        this.c = oy31Var;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.l1b1
    public final void j(sh3 sh3Var) {
        b00 b00Var = this.b;
        Handler handler = (Handler) b00Var.a.get();
        ExistingChatRequest existingChatRequest = this.a;
        String str = this.d;
        handler.post(new tz(b00Var, existingChatRequest, str, this.e, 1));
        qq31 qq31Var = new qq31(2, sh3Var);
        oy31 oy31Var = this.c;
        oy31Var.getClass();
        new h7b(oy31Var, str, qq31Var);
    }
}
