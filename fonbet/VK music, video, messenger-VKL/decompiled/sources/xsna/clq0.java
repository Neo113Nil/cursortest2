package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.contacts.model.ContactsPermissionMessage;
import com.vk.dto.common.data.UserNotification;
import com.vk.log.L;

/* compiled from: UserNotificationUtils.kt */
/* loaded from: classes4.dex */
public final class clq0 {

    /* compiled from: UserNotificationUtils.kt */
    public static final class a implements hx2<Boolean> {
        public final /* synthetic */ UserNotification b;

        public a(UserNotification userNotification) {
            this.b = userNotification;
        }

        @Override // xsna.hx2
        public final void b(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.b.c = true;
            L.A(zhy0.a("ok: ", booleanValue));
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            this.b.c = false;
            L.l("error: " + vKApiExecutionException);
        }
    }

    public static final void a(Context context, UserNotification userNotification) {
        b(userNotification, true);
        String str = userNotification.i.toString();
        int hashCode = str.hashCode();
        if (hashCode == -504306182) {
            if (str.equals("open_url")) {
                try {
                    if (TextUtils.isEmpty(userNotification.l)) {
                        xwk.d().e().a(context, userNotification.k);
                        return;
                    } else {
                        gd60.Q0(hd60.a(), context, userNotification.k, userNotification.l, null, null, 24);
                        return;
                    }
                } catch (Exception e) {
                    L.i(e);
                    return;
                }
            }
            return;
        }
        if (hashCode != 1361543127) {
            if (hashCode == 1514254087 && str.equals("contacts_sync")) {
                com.vk.contacts.d.a.S0(context, ContactsPermissionMessage.DEFAULT);
                return;
            }
            return;
        }
        if (str.equals("enable_top_newsfeed")) {
            ce60.b.getClass();
            p870.f().e(108, userNotification);
        }
    }

    public static void b(UserNotification userNotification, boolean z) {
        int i = z ? 109 : 110;
        ce60.b.getClass();
        p870.f().e(i, userNotification);
        if (userNotification.c) {
            return;
        }
        int i2 = userNotification.b;
        ygx ygxVar = new ygx("internal.hideUserNotification");
        ygxVar.C(i2, "notification_id");
        ygxVar.K("reason", z ? "accept" : "decline");
        ygxVar.k = true;
        new jx2(ygxVar, new a(userNotification)).a();
    }
}
