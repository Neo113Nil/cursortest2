package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
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
import com.unity3d.services.core.fid.Constants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.ahj0;
import xsna.zgj0;

/* compiled from: ShortcutManagerCompat.java */
/* loaded from: classes11.dex */
public final class bhj0 {
    public static volatile ahj0<?> a;
    public static volatile ArrayList b;

    public static boolean a(Context context, zgj0 zgj0Var) {
        Bitmap decodeStream;
        IconCompat c;
        IconCompat iconCompat = zgj0Var.h;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream j = iconCompat.j(context);
        if (j == null || (decodeStream = BitmapFactory.decodeStream(j)) == null) {
            return false;
        }
        if (i == 6) {
            c = new IconCompat(5);
            c.b = decodeStream;
        } else {
            c = IconCompat.c(decodeStream);
        }
        zgj0Var.h = c;
        return true;
    }

    public static void b(Context context, ArrayList arrayList) {
        List j = j(arrayList);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = ((ArrayList) j).iterator();
        while (it.hasNext()) {
            arrayList2.add(((zgj0) it.next()).b);
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).enableShortcuts(arrayList2);
        e(context).getClass();
        Iterator it2 = ((ArrayList) d(context)).iterator();
        while (it2.hasNext()) {
            ((ygj0) it2.next()).getClass();
        }
    }

    public static ArrayList c(Context context) {
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
        ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
        Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
        while (it.hasNext()) {
            arrayList.add(new zgj0.b(context, it.next()).a());
        }
        return arrayList;
    }

    public static List<ygj0> d(Context context) {
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
                        arrayList.add((ygj0) Class.forName(string, false, bhj0.class.getClassLoader()).getMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context));
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

    public static ahj0<?> e(Context context) {
        if (a == null) {
            try {
                a = (ahj0) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, bhj0.class.getClassLoader()).getMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new ahj0.a();
            }
        }
        return a;
    }

    public static ArrayList f(Context context) {
        List shortcuts;
        if (Build.VERSION.SDK_INT >= 30) {
            shortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4);
            return zgj0.a(context, shortcuts);
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(shortcutManager.getPinnedShortcuts());
        return zgj0.a(context, arrayList);
    }

    public static void g(Context context, zgj0 zgj0Var) {
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        int maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        if (maxShortcutCountPerActivity == 0) {
            return;
        }
        if (i <= 29) {
            a(context, zgj0Var);
        }
        String str = null;
        int i2 = -1;
        if (i >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(zgj0Var.b());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return;
            }
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
            shortcutManager.addDynamicShortcuts(Arrays.asList(zgj0Var.b()));
        }
        try {
            e(context).getClass();
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() >= maxShortcutCountPerActivity) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zgj0 zgj0Var2 = (zgj0) it.next();
                    int i4 = zgj0Var2.m;
                    if (i4 > i2) {
                        str = zgj0Var2.b;
                        i2 = i4;
                    }
                }
                Arrays.asList(str);
            }
            Arrays.asList(zgj0Var);
            Iterator it2 = ((ArrayList) d(context)).iterator();
            while (it2.hasNext()) {
                ygj0 ygj0Var = (ygj0) it2.next();
                Collections.singletonList(zgj0Var);
                ygj0Var.getClass();
            }
        } catch (Exception unused) {
            Iterator it3 = ((ArrayList) d(context)).iterator();
            while (it3.hasNext()) {
                ygj0 ygj0Var2 = (ygj0) it3.next();
                Collections.singletonList(zgj0Var);
                ygj0Var2.getClass();
            }
        } catch (Throwable th) {
            Iterator it4 = ((ArrayList) d(context)).iterator();
            while (it4.hasNext()) {
                ygj0 ygj0Var3 = (ygj0) it4.next();
                Collections.singletonList(zgj0Var);
                ygj0Var3.getClass();
            }
            k(context, zgj0Var.b);
            throw th;
        }
        k(context, zgj0Var.b);
    }

    public static void h(Context context) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        e(context).getClass();
        Iterator it = ((ArrayList) d(context)).iterator();
        while (it.hasNext()) {
            ((ygj0) it.next()).getClass();
        }
    }

    public static void i(Context context, List<String> list) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        e(context).getClass();
        Iterator it = ((ArrayList) d(context)).iterator();
        while (it.hasNext()) {
            ((ygj0) it.next()).getClass();
        }
    }

    public static List j(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zgj0) it.next()).getClass();
        }
        return arrayList2;
    }

    public static void k(Context context, String str) {
        context.getClass();
        str.getClass();
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator it = ((ArrayList) d(context)).iterator();
        while (it.hasNext()) {
            ygj0 ygj0Var = (ygj0) it.next();
            Collections.singletonList(str);
            ygj0Var.getClass();
        }
    }

    public static void l(Context context, zgj0 zgj0Var, IntentSender intentSender) {
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(zgj0Var.b(), intentSender);
    }

    public static void m(Context context, ArrayList arrayList) {
        context.getClass();
        ArrayList arrayList2 = (ArrayList) j(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((zgj0) it.next()).b());
        }
        if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList3)) {
            e(context).getClass();
            e(context).getClass();
            Iterator it2 = ((ArrayList) d(context)).iterator();
            while (it2.hasNext()) {
                ((ygj0) it2.next()).getClass();
            }
        }
    }
}
