package xsna;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import com.vk.dto.common.id.UserId;
import java.io.File;
import kotlin.text.Regex;

/* compiled from: VKAuthUtils.kt */
@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
public final class i9r0 {
    public static final a a = new a();
    public static final bpn0 b = new bpn0(new r63(12));
    public static final bpn0 c = new bpn0(new hu2(13));

    /* compiled from: VKAuthUtils.kt */
    public static final class a implements w8i {
        public static File a(UserId userId) {
            Regex regex = com.vk.core.files.a.a;
            return new File(e43.a.getFilesDir(), b4q.b(userId, "account.json"));
        }

        public static void c() {
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(new File(e43.a.getFilesDir(), "account.json"));
            vhk0.b(d());
            vhk0.b(a(q6r0.f().y()));
            we7.e();
        }

        public static File d() {
            Regex regex = com.vk.core.files.a.a;
            return new File(e43.a.getFilesDir(), "light_account.bin");
        }

        public final synchronized Account b(hp hpVar) {
            if (epx.f(hpVar.k(), "DELETED")) {
                return null;
            }
            Account d = ((mp) i9r0.c.getValue()).d(hpVar);
            if (d == null) {
                return null;
            }
            ContentResolver.setIsSyncable(d, "com.android.contacts", 1);
            ContentResolver.setSyncAutomatically(d, "com.android.contacts", true);
            return d;
        }

        public final synchronized void e(UserId userId) {
            ((mp) i9r0.c.getValue()).c(userId);
        }
    }

    public static final void a(m6r0 m6r0Var) {
        String jSONObject = m6r0Var.h().toString();
        File a2 = a.a(m6r0Var.y());
        Regex regex = com.vk.core.files.a.a;
        vhk0.b(a2);
        com.vk.core.files.a.P(a.a(m6r0Var.y()), jSONObject);
    }
}
