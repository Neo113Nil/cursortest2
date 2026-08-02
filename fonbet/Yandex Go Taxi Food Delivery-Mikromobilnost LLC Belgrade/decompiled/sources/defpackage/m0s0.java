package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.mzr0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class m0s0 {
    public static volatile mzr0 a;
    public static volatile ArrayList b;

    public static List a(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((kzr0) Class.forName(string, false, m0s0.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static mzr0 b(Context context) {
        if (a == null) {
            try {
                a = (mzr0) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, m0s0.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new mzr0.a();
            }
        }
        return a;
    }

    public static boolean c(Context context, lzr0 lzr0Var) {
        IconCompat iconCompat;
        int i;
        InputStream h;
        Bitmap decodeStream;
        IconCompat b2;
        context.getClass();
        int i2 = Build.VERSION.SDK_INT;
        int maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        if (maxShortcutCountPerActivity != 0) {
            if (i2 <= 29 && (iconCompat = lzr0Var.e) != null && (((i = iconCompat.a) == 6 || i == 4) && (h = iconCompat.h(context)) != null && (decodeStream = BitmapFactory.decodeStream(h)) != null)) {
                if (i == 6) {
                    b2 = new IconCompat(5);
                    b2.b = decodeStream;
                } else {
                    b2 = IconCompat.b(decodeStream);
                }
                lzr0Var.e = b2;
            }
            String str = null;
            char c = 65535;
            if (i2 >= 30) {
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(lzr0Var.a());
            } else {
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
                if (!shortcutManager.isRateLimitingActive()) {
                    List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                    if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                        String str2 = null;
                        int i3 = -1;
                        for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                            if (shortcutInfo.getRank() > i3) {
                                str2 = shortcutInfo.getId();
                                i3 = shortcutInfo.getRank();
                            }
                        }
                        shortcutManager.removeDynamicShortcuts(Arrays.asList(str2));
                    }
                    shortcutManager.addDynamicShortcuts(Arrays.asList(lzr0Var.a()));
                }
            }
            try {
                b(context).getClass();
                ArrayList arrayList = new ArrayList();
                if (arrayList.size() >= maxShortcutCountPerActivity) {
                    String[] strArr = new String[1];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        lzr0 lzr0Var2 = (lzr0) it.next();
                        lzr0Var2.getClass();
                        if (c < 0) {
                            str = lzr0Var2.b;
                            c = 0;
                        }
                    }
                    strArr[0] = str;
                    Arrays.asList(strArr);
                }
                Arrays.asList(lzr0Var);
                Iterator it2 = ((ArrayList) a(context)).iterator();
                while (it2.hasNext()) {
                    kzr0 kzr0Var = (kzr0) it2.next();
                    Collections.singletonList(lzr0Var);
                    kzr0Var.getClass();
                }
                e(context, lzr0Var.b);
                return true;
            } catch (Exception unused) {
                Iterator it3 = ((ArrayList) a(context)).iterator();
                while (it3.hasNext()) {
                    kzr0 kzr0Var2 = (kzr0) it3.next();
                    Collections.singletonList(lzr0Var);
                    kzr0Var2.getClass();
                }
                e(context, lzr0Var.b);
                return false;
            } catch (Throwable th) {
                Iterator it4 = ((ArrayList) a(context)).iterator();
                while (it4.hasNext()) {
                    kzr0 kzr0Var3 = (kzr0) it4.next();
                    Collections.singletonList(lzr0Var);
                    kzr0Var3.getClass();
                }
                e(context, lzr0Var.b);
                throw th;
            }
        }
        return false;
    }

    public static void d(Context context, List list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        b(context).getClass();
        Iterator it = ((ArrayList) a(context)).iterator();
        while (it.hasNext()) {
            ((kzr0) it.next()).getClass();
        }
    }

    public static void e(Context context, String str) {
        context.getClass();
        str.getClass();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator it = ((ArrayList) a(context)).iterator();
        while (it.hasNext()) {
            kzr0 kzr0Var = (kzr0) it.next();
            Collections.singletonList(str);
            kzr0Var.getClass();
        }
    }
}
