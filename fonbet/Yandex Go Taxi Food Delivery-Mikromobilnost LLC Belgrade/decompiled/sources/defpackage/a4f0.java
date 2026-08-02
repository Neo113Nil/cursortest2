package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.PrivacyBucket;

/* loaded from: classes15.dex */
public final class a4f0 implements e1k {
    public tf4 a;
    public final /* synthetic */ b4f0 b;

    public a4f0(b4f0 b4f0Var, tf4 tf4Var) {
        this.b = b4f0Var;
        this.a = tf4Var;
        tje.e();
        b4f0Var.b.post(new z3f0(b4f0Var, this, 0));
    }

    public final void a() {
        Integer num;
        b4f0 b4f0Var = this.b;
        z83.b(null, b4f0Var.b.getLooper(), Looper.myLooper());
        at2 at2Var = b4f0Var.a.b;
        long a = at2Var.S().a("privacy");
        t3f0 k = at2Var.k();
        k.getClass();
        PrivacyBucket.Value value = new PrivacyBucket.Value();
        for (v3f0 v3f0Var : k.b()) {
            String str = v3f0Var.a;
            num = v3f0Var.b;
            str.getClass();
            switch (str) {
                case "search":
                    value.search = num;
                    break;
                case "online_status":
                    value.onlineStatus = num;
                    break;
                case "calls":
                    value.calls = num;
                    break;
                case "private_chats":
                    value.privateChats = num;
                    break;
                case "invites":
                    value.invites = num;
                    break;
            }
        }
        PrivacyBucket privacyBucket = new PrivacyBucket();
        privacyBucket.value = value;
        privacyBucket.version = a;
        privacyBucket.bucketName = "privacy";
        b4f0Var.c.post(new yo90(19, this, privacyBucket));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tje.e();
        this.a = null;
        b4f0 b4f0Var = this.b;
        b4f0Var.b.post(new z3f0(b4f0Var, this, 1));
    }
}
