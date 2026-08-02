package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;

/* compiled from: ShortcutBadger.java */
/* loaded from: classes11.dex */
public final class vgj0 {
    public static final LinkedList a;
    public static gz5 b;
    public static ComponentName c;

    static {
        LinkedList linkedList = new LinkedList();
        a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(lx3.class);
        linkedList.add(hlv.class);
        linkedList.add(to70.class);
        linkedList.add(q0h0.class);
        linkedList.add(w7y0.class);
        linkedList.add(c6u0.class);
        linkedList.add(a6y0.class);
        linkedList.add(l1q.class);
    }

    public static void a(int i, Context context) throws ShortcutBadgeException {
        gz5 gz5Var;
        if (b == null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
                throw new ShortcutBadgeException("No default launcher available");
            }
            c = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                String str = it.next().activityInfo.packageName;
                Iterator it2 = a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    try {
                        gz5Var = (gz5) ((Class) it2.next()).newInstance();
                    } catch (Exception unused) {
                        gz5Var = null;
                    }
                    if (gz5Var != null && gz5Var.a().contains(str)) {
                        b = gz5Var;
                        break;
                    }
                }
                if (b != null) {
                    break;
                }
            }
            if (b == null) {
                String str2 = Build.MANUFACTURER;
                if (str2.equalsIgnoreCase("ZUK")) {
                    b = new w7y0();
                } else if (str2.equalsIgnoreCase("OPPO")) {
                    b = new to70();
                } else if (str2.equalsIgnoreCase("VIVO")) {
                    b = new c6u0();
                } else if (str2.equalsIgnoreCase("ZTE")) {
                    b = new a6y0();
                } else {
                    b = new DefaultBadger();
                }
            }
        }
        try {
            b.b(context, c, i);
        } catch (Exception e) {
            throw new ShortcutBadgeException("Unable to execute badge", e);
        }
    }
}
