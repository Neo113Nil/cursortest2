package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.contacts.ContactsManager;
import com.vk.dto.common.AppState;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.permission.PermissionHelper;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ContactSyncPermissionReporter.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class kaj {
    public final io.reactivex.rxjava3.internal.operators.observable.i0 a;
    public final Executor b;
    public final Context c;
    public final c63 d;
    public final com.vk.contacts.f e;
    public final ContactsManager f;

    public kaj(io.reactivex.rxjava3.internal.operators.observable.i0 i0Var, ScheduledExecutorService scheduledExecutorService) {
        Context context = e43.a;
        context = context == null ? null : context;
        c63 c63Var = c63.a;
        com.vk.contacts.f fVar = com.vk.contacts.f.a;
        ContactsManager contactsManager = com.vk.contacts.d.a;
        this.a = i0Var;
        this.b = scheduledExecutorService;
        this.c = context;
        this.d = c63Var;
        this.e = fVar;
        this.f = contactsManager;
    }

    public static void b(boolean z, boolean z2, AppState appState, boolean z3) {
        if (z == z2) {
            return;
        }
        el3 el3Var = Event.b;
        Event.a b = h5s.b("contacts_permission_request");
        b.b("enabled", Integer.valueOf(z2 ? 1 : 0));
        b.b("is_system", Integer.valueOf(z3 ? 1 : 0));
        b.c("app_state", appState.h());
        b.j(thp0.c);
        b.h();
        com.vk.metrics.eventtracking.b.a.k(b.e());
        L.e("VkContactManager", "PermissionChanged enabled=" + z2 + ", isSystem=" + z3 + ", " + appState);
    }

    public final void a(AppState appState) {
        this.e.getClass();
        boolean z = ((paj0) com.vk.contacts.f.c()).getBoolean("key_system_permission_granted", false);
        PermissionHelper.a.getClass();
        Context context = this.c;
        b(z, PermissionHelper.n(context), appState, true);
        boolean n = PermissionHelper.n(context);
        L.e("VkContactManager", zhy0.a("systemPermGranted=", n));
        qaj0.c(com.vk.contacts.f.c(), "key_system_permission_granted", Boolean.valueOf(n));
    }
}
