package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.entities.ChatId;

/* loaded from: classes15.dex */
public final class ogu {
    public final Looper a;
    public final rz10 b;
    public final at2 c;

    public ogu(Looper looper, rz10 rz10Var, at2 at2Var) {
        this.a = looper;
        this.b = rz10Var;
        this.c = at2Var;
    }

    public final boolean a(String str) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.a;
        z83.g(null, looper, myLooper);
        int b = ChatId.Companion.b(str);
        z83.g(null, looper, Looper.myLooper());
        this.b.getClass();
        return this.c.X().b().contains(Integer.valueOf(b));
    }
}
