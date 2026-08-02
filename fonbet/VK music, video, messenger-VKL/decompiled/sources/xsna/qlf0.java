package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RedesignNotificationsSettingsRouter.kt */
/* loaded from: classes11.dex */
public final class qlf0 implements mh70 {
    public static void e(Context context, String str, String str2) {
        int hashCode = str.hashCode();
        if (hashCode != -345300727) {
            if (hashCode != -255930252) {
                if (hashCode == 1666060468 && str.equals("new_stories")) {
                    wtl0 wtl0Var = new wtl0();
                    wtl0Var.y(str);
                    wtl0Var.z(str2);
                    wtl0Var.k(context);
                    return;
                }
            } else if (str.equals("new_posts")) {
                e6c0 e6c0Var = new e6c0();
                e6c0Var.y(str);
                e6c0Var.z(str2);
                e6c0Var.k(context);
                return;
            }
        } else if (str.equals("group_notify")) {
            z4g.d().v(context);
            return;
        }
        se70 se70Var = new se70();
        se70Var.y(str);
        se70Var.z(str2);
        se70Var.k(context);
    }

    @Override // xsna.mh70
    public final void b(Context context, String str) {
        e(context, str, null);
    }

    @Override // xsna.mh70
    public final void c(Context context) {
        Bundle bundle;
        Object obj = hr80.c;
        if (obj.equals(emi.d)) {
            RedesignNotificationSettingsFragment.a aVar = RedesignNotificationSettingsFragment.Y;
            bundle = new Bundle();
            aVar.getClass();
            RedesignNotificationSettingsFragment.a.a(bundle);
        } else {
            if (!obj.equals(obj)) {
                throw new NoWhenBranchMatchedException();
            }
            bundle = null;
        }
        new oz50(RedesignNotificationSettingsFragment.class, null, bundle).k(context);
    }

    @Override // xsna.mh70
    public final void d(Context context, String str) {
        e6c0 e6c0Var = new e6c0();
        e6c0Var.y("new_posts");
        e6c0Var.z(str);
        e6c0Var.k(context);
    }
}
