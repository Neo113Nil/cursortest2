package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import com.vkontakte.android.ShortcutManagerWrapper;
import java.util.ArrayList;

/* compiled from: LauncherIconManager.kt */
/* loaded from: classes.dex */
public final class bny {
    public static String c;
    public static com.vkontakte.android.a d;
    public static v1v0 i;
    public static final bny a = new bny();
    public static final ArrayList b = new ArrayList();
    public static final bpn0 e = new bpn0(new zg9(5));
    public static final bpn0 f = new bpn0(new b63(5));
    public static final bpn0 g = new bpn0(new v0f(1));
    public static final bpn0 h = new bpn0(new u35(3));

    public static void a(Context context, xmy xmyVar) {
        System.out.print((Object) ("enable icon " + xmyVar.getName()));
        com.vkontakte.android.a aVar = d;
        if (aVar == null) {
            aVar = null;
        }
        com.vk.movika.sdk.base.ui.m mVar = new com.vk.movika.sdk.base.ui.m(11, context, xmyVar);
        aVar.getClass();
        ShortcutManagerWrapper shortcutManagerWrapper = ShortcutManagerWrapper.a;
        ShortcutManagerWrapper.l(context, mVar, ShortcutManagerWrapper.ShortcutCategory.VKAPP);
    }

    public static j1v0 b() {
        return (j1v0) e.getValue();
    }

    public static boolean c(Context context, xmy xmyVar) {
        PackageManager packageManager = context.getPackageManager();
        String str = c;
        if (str == null) {
            str = null;
        }
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(xmyVar.a(str));
        boolean z = componentEnabledSetting == 1;
        v1v0 v1v0Var = i;
        return xmyVar.equals((v1v0Var != null ? v1v0Var : null).d) ? z || componentEnabledSetting == 0 : z;
    }
}
