package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.pushes.stat.AppStateOnChange;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.TreeMap;
import xsna.a5b0;
import xsna.w970;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class u970 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u970(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                w970 w970Var = (w970) this.d;
                AppStateOnChange appStateOnChange = (AppStateOnChange) this.e;
                Object systemService = context.getSystemService("notification");
                NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                if (notificationManager != null) {
                    TreeMap treeMap = w970Var.e;
                    boolean areNotificationsEnabled = notificationManager.areNotificationsEnabled();
                    SharedPreferences sharedPreferences = (SharedPreferences) w970Var.c.b.getValue();
                    Boolean valueOf = sharedPreferences.contains("__system_all_notifications__") ? Boolean.valueOf(sharedPreferences.getBoolean("__system_all_notifications__", false)) : null;
                    w970.a aVar = (w970.a) treeMap.get(null);
                    boolean z = aVar != null && aVar.b == areNotificationsEnabled;
                    boolean f = epx.f(valueOf, Boolean.valueOf(areNotificationsEnabled));
                    if (valueOf == null && appStateOnChange != AppStateOnChange.FOREGROUND) {
                        treeMap.put(null, new w970.a(appStateOnChange, areNotificationsEnabled, true));
                    } else if (!z && !f) {
                        treeMap.put(null, new w970.a(appStateOnChange, areNotificationsEnabled, false));
                    }
                    mcd mcdVar = w970Var.a;
                    if (((Boolean) mcdVar.invoke()).booleanValue() && !treeMap.isEmpty()) {
                        w970Var.a();
                        break;
                    } else if (!((Boolean) mcdVar.invoke()).booleanValue()) {
                        w970Var.b.invoke(new ag20(w970Var, 15));
                        break;
                    }
                }
                break;
            case 1:
                View view = (View) this.c;
                a5b0.c cVar = (a5b0.c) this.d;
                a5b0 a5b0Var = (a5b0) this.e;
                view.setPivotX(cVar.e);
                view.setPivotY(cVar.f);
                a5b0Var.j = null;
                break;
            case 2:
                j0p0 j0p0Var = (j0p0) this.c;
                String str = (String) this.d;
                String str2 = (String) this.e;
                j0p0Var.d.b(str, str2);
                j0p0Var.e.b(str, str2);
                break;
            default:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.c;
                rhq0 rhq0Var = (rhq0) this.d;
                FragmentActivity fragmentActivity = (FragmentActivity) this.e;
                int i = extendedUserProfile.v;
                if (i != 0) {
                    rhq0Var.e.b(fragmentActivity, i);
                    break;
                }
                break;
        }
    }
}
