package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.pushes.NotificationUtils;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: DatingUserActionNotification.kt */
/* loaded from: classes5.dex */
public final class x1l extends dfq0 {
    public final NotificationUtils.Type A;
    public final String B;
    public final String C;
    public final IconCompat D;
    public final j1a0 E;
    public final bpn0 F;
    public final Bitmap z;

    public x1l(Context context, Map map, Bitmap bitmap) {
        super(context, (Map<String, String>) map, bitmap, (Bitmap) null, (File) null);
        this.z = bitmap;
        this.A = NotificationUtils.Type.PrivateMessages;
        this.B = "DATING_USER_ACTION_GROUP_KEY";
        this.C = NotificationCompat.CATEGORY_MESSAGE;
        IconCompat c = bitmap != null ? IconCompat.c(bitmap) : null;
        this.D = c;
        CharSequence charSequence = this.n;
        j1a0 j1a0Var = new j1a0();
        j1a0Var.a = charSequence;
        j1a0Var.b = c;
        j1a0Var.c = null;
        j1a0Var.d = null;
        j1a0Var.e = false;
        j1a0Var.f = false;
        this.E = j1a0Var;
        this.F = new bpn0(new cwg(this, 7));
    }

    @Override // xsna.ri6
    public final void g(NotificationManager notificationManager) {
        super.g(notificationManager);
        Context context = this.c;
        bhj0.i(context, Collections.singletonList(context.getPackageName()));
    }

    @Override // xsna.dfq0, com.vk.pushes.notifications.base.a
    public final void o(NotificationCompat.h hVar) {
        IconCompat iconCompat;
        CharSequence charSequence;
        hVar.e(true);
        Bitmap bitmap = this.z;
        if (bitmap != null) {
            hVar.q(bitmap);
        }
        boolean A = A();
        Context context = this.c;
        zgj0 zgj0Var = null;
        Intent intent = null;
        zgj0Var = null;
        zgj0Var = null;
        if (!A && (iconCompat = this.D) != null && (charSequence = this.n) != null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setPackage(context.getPackageName());
                launchIntentForPackage.addFlags(268468224);
                s3q0 s3q0Var = s3q0.a;
                intent = launchIntentForPackage;
            }
            String packageName = context.getPackageName();
            zgj0 zgj0Var2 = new zgj0();
            zgj0Var2.a = context;
            zgj0Var2.b = packageName;
            zgj0Var2.h = iconCompat;
            zgj0Var2.e = charSequence;
            zgj0Var2.l = true;
            zgj0Var2.k = new c000(context.getPackageName());
            zgj0Var2.i = new j1a0[]{this.E};
            zgj0Var2.c = new Intent[]{intent};
            if (TextUtils.isEmpty(zgj0Var2.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = zgj0Var2.c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            zgj0Var = zgj0Var2;
        }
        if (zgj0Var != null) {
            bhj0.g(context, zgj0Var);
        }
        hVar.x(zgj0Var);
    }

    @Override // com.vk.pushes.notifications.base.a
    public final String q() {
        return this.C;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final String u() {
        return this.B;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final NotificationUtils.Type w() {
        return this.A;
    }

    @Override // com.vk.pushes.notifications.base.a
    public final NotificationCompat.m x() {
        return (NotificationCompat.m) this.F.getValue();
    }
}
