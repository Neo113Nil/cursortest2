package com.vkontakte.android;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.log.L;
import com.vk.metrics.eventtracking.b;
import com.vk.movika.sdk.base.ui.m;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.storycamera.screen.StoryCameraActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.a0a;
import xsna.a1w;
import xsna.asp;
import xsna.asu0;
import xsna.bhj0;
import xsna.c5g;
import xsna.cqm0;
import xsna.drm0;
import xsna.e43;
import xsna.el3;
import xsna.epx;
import xsna.fhj0;
import xsna.gz80;
import xsna.iah0;
import xsna.j1a0;
import xsna.o25;
import xsna.pdg0;
import xsna.q1w;
import xsna.rl3;
import xsna.t6v;
import xsna.up5;
import xsna.wq8;
import xsna.wze0;
import xsna.xa4;
import xsna.ygj0;
import xsna.zgj0;
import xsna.zrp;

/* compiled from: ShortcutManagerWrapper.kt */
/* loaded from: classes7.dex */
public final class ShortcutManagerWrapper {
    public static final ShortcutManagerWrapper a = new ShortcutManagerWrapper();
    public static final DisplayNameFormatter b = new DisplayNameFormatter(null, 3, null);
    public static volatile long c;
    public static volatile ScheduledFuture d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortcutManagerWrapper.kt */
    public static final class ShortcutCategory {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ShortcutCategory[] $VALUES;
        public static final ShortcutCategory VKAPP;
        public static final ShortcutCategory VKME;
        private final Set<String> set;

        static {
            ShortcutCategory shortcutCategory = new ShortcutCategory(0, "VKME", rl3.y0(new String[]{"com.vk.im.sharing.category.SHORTCUT_SHARE", "android.shortcut.conversation"}));
            VKME = shortcutCategory;
            ShortcutCategory shortcutCategory2 = new ShortcutCategory(1, "VKAPP", rl3.y0(new String[]{"com.vkontakte.android.sharing.category.SHORTCUT_SHARE", "android.shortcut.conversation"}));
            VKAPP = shortcutCategory2;
            ShortcutCategory[] shortcutCategoryArr = {shortcutCategory, shortcutCategory2};
            $VALUES = shortcutCategoryArr;
            $ENTRIES = new asp(shortcutCategoryArr);
        }

        public ShortcutCategory(int i, String str, Set set) {
            this.set = set;
        }

        public static ShortcutCategory valueOf(String str) {
            return (ShortcutCategory) Enum.valueOf(ShortcutCategory.class, str);
        }

        public static ShortcutCategory[] values() {
            return (ShortcutCategory[]) $VALUES.clone();
        }

        public final Set<String> h() {
            return this.set;
        }
    }

    @TargetApi(25)
    public static zgj0 a(Context context, ShortcutCategory shortcutCategory) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("vkontakte://design_demo"));
        intent.putExtra("__source_from_shortcut", true);
        zgj0 zgj0Var = new zgj0();
        zgj0Var.a = context;
        zgj0Var.b = "DebugMenuShortcut";
        zgj0Var.e = "Design Demo";
        zgj0Var.f = "Design Demo";
        zgj0Var.h = IconCompat.d(R.drawable.vk_icon_brush_outline_24, context);
        zgj0Var.c = f(context, intent);
        Set<String> h = shortcutCategory.h();
        el3 el3Var = new el3();
        el3Var.addAll(h);
        zgj0Var.j = el3Var;
        if (TextUtils.isEmpty(zgj0Var.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = zgj0Var.c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return zgj0Var;
    }

    @TargetApi(25)
    public static zgj0 b(Context context, ShortcutCategory shortcutCategory) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("vkontakte://new_post"));
        intent.putExtra("__source_from_shortcut", true);
        String string = context.getString(R.string.new_post);
        zgj0 zgj0Var = new zgj0();
        zgj0Var.a = context;
        zgj0Var.b = "sharing_external_wall_post_shortcut";
        zgj0Var.e = string;
        zgj0Var.f = string;
        zgj0Var.h = IconCompat.d(R.drawable.vk_icon_deprecated_ic_shortcut_post, context);
        zgj0Var.c = f(context, intent);
        Set<String> h = shortcutCategory.h();
        el3 el3Var = new el3();
        el3Var.addAll(h);
        zgj0Var.j = el3Var;
        if (TextUtils.isEmpty(zgj0Var.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = zgj0Var.c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return zgj0Var;
    }

    @TargetApi(25)
    public static zgj0 d(Context context) {
        String lowerCase = SchemeStat$TypeNavgo.Subtype.SYSTEM.name().toLowerCase(Locale.ROOT);
        String m = cqm0.m("SHORTCUT");
        StoryCameraMode storyCameraMode = StoryCameraMode.LIVE;
        xa4.q();
        EmptyList emptyList = EmptyList.b;
        UserId.b bVar = UserId.c;
        StoryCameraTarget storyCameraTarget = StoryCameraTarget.UNDEFINED;
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("vkontakte://new_story"), context, StoryCameraActivity.class);
        intent.putExtra("ref", lowerCase);
        intent.putExtra("entry_point", m);
        intent.setPackage(context.getPackageName());
        intent.putExtra("__source_from_shortcut", true);
        zgj0 zgj0Var = new zgj0();
        zgj0Var.a = context;
        zgj0Var.b = "NewStoryShortcut";
        zgj0Var.e = context.getResources().getString(R.string.story);
        zgj0Var.f = context.getResources().getString(R.string.story);
        zgj0Var.c = f(context, intent);
        zgj0Var.h = IconCompat.d(R.drawable.vk_icon_deprecated_ic_shortcut_story, context);
        if (TextUtils.isEmpty(zgj0Var.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = zgj0Var.c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return zgj0Var;
    }

    public static void e(MainActivity mainActivity, ShortcutCategory shortcutCategory) {
        try {
            if (gz80.a(25) && o25.a().b()) {
                if (c <= 0 || SystemClock.elapsedRealtime() - c >= 1000) {
                    c = SystemClock.elapsedRealtime();
                    m(mainActivity, shortcutCategory);
                }
            }
        } catch (Exception e) {
            c = 0L;
            L.f("ShortcutManagerWrapper", "ensureShortcuts failed", e);
        }
    }

    public static Intent[] f(Context context, Intent intent) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(268468224);
        return new Intent[]{launchIntentForPackage, intent};
    }

    public static boolean g(Context context) {
        return !bhj0.f(context).isEmpty();
    }

    public static void h(Context context, ComponentName componentName) {
        boolean z;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 795136);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = queryIntentActivities.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ActivityInfo activityInfo = ((ResolveInfo) next).activityInfo;
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(activityInfo.packageName, activityInfo.name));
            if (componentEnabledSetting == 1 || (componentEnabledSetting == 0 && activityInfo.isEnabled())) {
                arrayList.add(next);
            }
        }
        Integer valueOf = Integer.valueOf(queryIntentActivities.size());
        Integer valueOf2 = Integer.valueOf(arrayList.size());
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (epx.f(((ResolveInfo) it2.next()).activityInfo.name, componentName.getClassName())) {
                    break;
                }
            }
        }
        z = false;
        L.p(valueOf, valueOf2, Boolean.valueOf(z));
    }

    public static zgj0 i(zgj0 zgj0Var, ComponentName componentName) {
        zgj0 zgj0Var2 = new zgj0();
        zgj0Var2.a = zgj0Var.a;
        zgj0Var2.b = zgj0Var.b;
        Intent[] intentArr = zgj0Var.c;
        zgj0Var2.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
        zgj0Var2.d = zgj0Var.d;
        zgj0Var2.e = zgj0Var.e;
        zgj0Var2.f = zgj0Var.f;
        zgj0Var2.g = zgj0Var.g;
        zgj0Var2.h = zgj0Var.h;
        zgj0Var2.k = zgj0Var.k;
        zgj0Var2.l = zgj0Var.l;
        zgj0Var2.m = zgj0Var.m;
        j1a0[] j1a0VarArr = zgj0Var.i;
        if (j1a0VarArr != null) {
            zgj0Var2.i = (j1a0[]) Arrays.copyOf(j1a0VarArr, j1a0VarArr.length);
        }
        if (zgj0Var.j != null) {
            zgj0Var2.j = new HashSet(zgj0Var.j);
        }
        PersistableBundle persistableBundle = zgj0Var.n;
        if (persistableBundle != null) {
            zgj0Var2.n = persistableBundle;
        }
        Intent[] intentArr2 = zgj0Var.c;
        Intent[] intentArr3 = (Intent[]) Arrays.copyOf(intentArr2, intentArr2.length);
        intentArr3[0].setComponent(componentName);
        zgj0Var2.c = intentArr3;
        if (TextUtils.isEmpty(zgj0Var2.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr4 = zgj0Var2.c;
        if (intentArr4 == null || intentArr4.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        return zgj0Var2;
    }

    public static void j(Context context, long j, ShortcutCategory shortcutCategory) {
        PersistableBundle persistableBundle;
        try {
            ArrayList f = bhj0.f(context);
            ArrayList arrayList = new ArrayList();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                zgj0 zgj0Var = (zgj0) next;
                String str = zgj0Var.b;
                if (str.equals("sharing_external_wall_post_shortcut") || str.equals("NewStoryShortcut") || drm0.D(str, "web_app", false) || ((persistableBundle = zgj0Var.n) != null && persistableBundle.getLong("creator_user_id", -1L) == j)) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                bhj0.b(context, arrayList);
            }
            m(context, shortcutCategory);
        } catch (Exception e) {
            b.a.a(e);
        }
    }

    public static void k(Context context) {
        try {
            c = 0L;
            bhj0.h(context);
            ArrayList f = bhj0.f(context);
            if (f.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = f.iterator();
            while (it.hasNext()) {
                zgj0 zgj0Var = (zgj0) it.next();
                if (!drm0.D(zgj0Var.b, "web_app", false)) {
                    arrayList.add(zgj0Var.b);
                }
            }
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).disableShortcuts(arrayList, null);
            bhj0.e(context).getClass();
            Iterator it2 = ((ArrayList) bhj0.d(context)).iterator();
            while (it2.hasNext()) {
                ((ygj0) it2.next()).getClass();
            }
        } catch (Exception e) {
            b.a.a(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[Catch: Exception -> 0x0041, LOOP:0: B:18:0x0084->B:20:0x008d, LOOP_END, TryCatch #2 {Exception -> 0x0041, blocks: (B:7:0x0010, B:11:0x0032, B:17:0x0068, B:18:0x0084, B:20:0x008d, B:22:0x009b, B:23:0x00a7, B:25:0x00b0, B:27:0x00d5, B:33:0x0062), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[EDGE_INSN: B:21:0x009b->B:22:0x009b BREAK  A[LOOP:0: B:18:0x0084->B:20:0x008d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[Catch: Exception -> 0x0041, LOOP:1: B:23:0x00a7->B:25:0x00b0, LOOP_END, TryCatch #2 {Exception -> 0x0041, blocks: (B:7:0x0010, B:11:0x0032, B:17:0x0068, B:18:0x0084, B:20:0x008d, B:22:0x009b, B:23:0x00a7, B:25:0x00b0, B:27:0x00d5, B:33:0x0062), top: B:6:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(Context context, m mVar, ShortcutCategory shortcutCategory) {
        Context context2;
        int i;
        ComponentName componentName;
        ArrayList arrayList;
        ListIterator listIterator;
        ListBuilder.a aVar;
        StringBuilder sb;
        ListIterator listIterator2;
        ListBuilder.a aVar2;
        int size;
        ShortcutManagerWrapper shortcutManagerWrapper = a;
        if (!o25.a().b()) {
            mVar.invoke();
            return;
        }
        try {
            int size2 = bhj0.c(context).size();
            int maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
            ListBuilder e = e43.e();
            if (!(shortcutCategory == ShortcutCategory.VKME)) {
                e.add(d(context));
                e.add(b(context, shortcutCategory));
            }
            try {
                size = maxShortcutCountPerActivity - e.size();
                context2 = context;
            } catch (Exception e2) {
                e = e2;
                context2 = context;
            }
            try {
                ArrayList c2 = shortcutManagerWrapper.c(context2, size, Source.CACHE, false, shortcutCategory);
                e.addAll(c2);
                i = c2.size();
            } catch (Exception e3) {
                e = e3;
                b.a.a(e);
                i = 0;
                ListBuilder g = e.g();
                componentName = (ComponentName) mVar.invoke();
                h(context2, componentName);
                arrayList = new ArrayList(c5g.u(g, 10));
                listIterator = g.listIterator(0);
                while (true) {
                    aVar = (ListBuilder.a) listIterator;
                    if (aVar.hasNext()) {
                    }
                    arrayList.add(i((zgj0) aVar.next(), componentName));
                }
                bhj0.m(context2, arrayList);
                sb = new StringBuilder();
                listIterator2 = g.listIterator(0);
                while (true) {
                    aVar2 = (ListBuilder.a) listIterator2;
                    if (aVar2.hasNext()) {
                    }
                    zgj0 zgj0Var = (zgj0) aVar2.next();
                    sb.append(zgj0Var.b + " / " + ((Object) zgj0Var.f) + '\n');
                }
            }
            ListBuilder g2 = e.g();
            componentName = (ComponentName) mVar.invoke();
            h(context2, componentName);
            arrayList = new ArrayList(c5g.u(g2, 10));
            listIterator = g2.listIterator(0);
            while (true) {
                aVar = (ListBuilder.a) listIterator;
                if (aVar.hasNext()) {
                    break;
                } else {
                    arrayList.add(i((zgj0) aVar.next(), componentName));
                }
            }
            bhj0.m(context2, arrayList);
            sb = new StringBuilder();
            listIterator2 = g2.listIterator(0);
            while (true) {
                aVar2 = (ListBuilder.a) listIterator2;
                if (aVar2.hasNext()) {
                    L.e("updateShortcuts", "shortcuts: was " + size2 + " - added " + g2.size() + " (including " + i + " for direct sharing)\n" + ((Object) sb));
                    return;
                }
                zgj0 zgj0Var2 = (zgj0) aVar2.next();
                sb.append(zgj0Var2.b + " / " + ((Object) zgj0Var2.f) + '\n');
            }
        } catch (Exception e4) {
            b.a.a(e4);
            mVar.invoke();
        }
    }

    @TargetApi(25)
    public static void m(Context context, ShortcutCategory shortcutCategory) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        long j = a1wVar.u() ? 0L : 1000L;
        ScheduledFuture scheduledFuture = d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        asu0.a.getClass();
        d = asu0.o().schedule(new wq8(6, context, shortcutCategory), j, TimeUnit.MILLISECONDS);
    }

    @TargetApi(25)
    public final ArrayList c(Context context, int i, Source source, boolean z, ShortcutCategory shortcutCategory) {
        Object obj;
        t6v t6vVar = new t6v(i, source, TimeUnit.DAYS.toMillis(1L), z, "ShortcutManager");
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        pdg0 n = a1wVar.n(this, t6vVar);
        if (n instanceof pdg0.a) {
            obj = new t6v.a(EmptyList.b, new ProfilesInfo(), -1L);
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        t6v.a aVar = (t6v.a) obj;
        List<Dialog> list = aVar.a;
        ProfilesSimpleInfo Ob = aVar.b.Ob();
        List<Dialog> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (Dialog dialog : list2) {
            String d2 = b.d(dialog, Ob);
            fhj0 fhj0Var = fhj0.a;
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, fhj0.a(dialog.Sb().longValue(), a0a.d));
            intent.setPackage(context.getPackageName());
            intent.putExtra("__source_from_shortcut", true);
            IconCompat c2 = IconCompat.c(up5.a(iah0.a(48), new wze0(2, dialog, Ob)));
            String valueOf = String.valueOf(dialog.Sb().longValue());
            zgj0 zgj0Var = new zgj0();
            zgj0Var.a = context;
            zgj0Var.b = valueOf;
            zgj0Var.e = d2;
            zgj0Var.f = d2;
            zgj0Var.h = c2;
            PersistableBundle persistableBundle = new PersistableBundle();
            a1w a1wVar2 = q1w.a;
            if (a1wVar2 == null) {
                a1wVar2 = null;
            }
            persistableBundle.putLong("creator_user_id", a1wVar2.q().b);
            zgj0Var.n = persistableBundle;
            zgj0Var.c = f(context, intent);
            Set<String> h = shortcutCategory.h();
            el3 el3Var = new el3();
            el3Var.addAll(h);
            zgj0Var.j = el3Var;
            if (TextUtils.isEmpty(zgj0Var.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = zgj0Var.c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            arrayList.add(zgj0Var);
        }
        return arrayList;
    }
}
