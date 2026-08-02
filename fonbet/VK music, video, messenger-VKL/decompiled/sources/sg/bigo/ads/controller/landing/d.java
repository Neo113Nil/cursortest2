package sg.bigo.ads.controller.landing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.aj.f;
import sg.bigo.ads.al.a;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.controller.form.AdFormActivity;
import sg.bigo.ads.d.c;

/* loaded from: classes9.dex */
public final class d {
    private static final WeakHashMap<sg.bigo.ads.d.c<?, ?>, Integer> a = new WeakHashMap<>();
    private static long b = 0;
    private static Runnable c = null;

    public static int a(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 5 : 4;
        }
        return 3;
    }

    @Nullable
    public static sg.bigo.ads.d.c<?, ?> b(int i) {
        sg.bigo.ads.d.c<?, ?> cVar;
        WeakHashMap<sg.bigo.ads.d.c<?, ?>, Integer> weakHashMap = a;
        synchronized (weakHashMap) {
            try {
                Iterator<Map.Entry<sg.bigo.ads.d.c<?, ?>, Integer>> it = weakHashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        cVar = null;
                        break;
                    }
                    Map.Entry<sg.bigo.ads.d.c<?, ?>, Integer> next = it.next();
                    if (next.getValue().intValue() == i) {
                        cVar = next.getKey();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.b] */
    public static int a(@Nullable sg.bigo.ads.d.c<?, ?> cVar) {
        o f;
        if (cVar == null || (f = cVar.f().f()) == null) {
            return 0;
        }
        return f.a("clk_flow_attr.lp_gp_format", 0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r9v3, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r9v5, types: [sg.bigo.ads.api.core.b] */
    private static boolean b(Context context, String str, @Nullable sg.bigo.ads.d.c<?, ?> cVar, @NonNull e eVar, int i) {
        LandingPageStyleConfig x = cVar != null ? cVar.x() : null;
        if (x == null) {
            return false;
        }
        Intent f = AdActivity.f(context, x.g);
        f.putExtra("layout_style", x);
        f.putExtra("webview_force_time", x.b);
        f.putExtra("url", str);
        if (cVar != null) {
            boolean z = cVar instanceof f;
            if ((cVar.f().a(16) && !z) || i > 0) {
                f.putExtra("try_gp_inline", true);
                f.putExtra("gp_inline_ad_bundle", cVar.f().o());
                int y = cVar.f().y();
                f.putExtra("gp_inline_real_launch", y == 2 || y == 1 || y == 15 || y == 16 || y == 17 || y == 18 || cVar.s == 2);
            }
        }
        int hashCode = cVar.hashCode();
        a(hashCode, cVar);
        f.putExtra("ad_identifier", hashCode);
        f.putExtra("land_way", 0);
        context.startActivity(f);
        if (eVar != null) {
            eVar.j = 5;
            eVar.o = 1;
        }
        return true;
    }

    public static Pair<Integer, Integer> a(Context context, String str, String str2) {
        int i;
        int i2 = 0;
        if (context == null) {
            return new Pair<>(0, 0);
        }
        if (str != null && str.equals(str2)) {
            int i3 = !TextUtils.isEmpty(sg.bigo.ads.core.landing.a.c(context, str)) ? 1 : 0;
            return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i3));
        }
        if (TextUtils.isEmpty(str)) {
            i = -1;
        } else {
            i = !TextUtils.isEmpty(sg.bigo.ads.core.landing.a.c(context, str)) ? 1 : 0;
        }
        if (TextUtils.isEmpty(str2)) {
            i2 = -1;
        } else if (!TextUtils.isEmpty(sg.bigo.ads.core.landing.a.c(context, str2))) {
            i2 = 1;
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static String a(String str, int i, int i2, int i3, int i4) {
        try {
            if (str.contains("ad_imp_indx=__ad_imp_indx__")) {
                str = r.a(str, "ad_imp_indx=__ad_imp_indx__", "ad_imp_indx=".concat(String.valueOf(i)), true);
            }
            if (str.contains("ad_click_indx=__ad_click_indx__")) {
                str = r.a(str, "ad_click_indx=__ad_click_indx__", "ad_click_indx=".concat(String.valueOf(i2)), true);
            }
            if (i3 > 0 && str.contains("click_source=__click_source__")) {
                str = r.a(str, "click_source=__click_source__", "click_source=".concat(String.valueOf(i3)), true);
            }
            return (i4 <= 0 || !str.contains("click_module=__click_module__")) ? str : r.a(str, "click_module=__click_module__", "click_module=".concat(String.valueOf(i4)), true);
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [sg.bigo.ads.api.core.b] */
    public static e a(Context context, Activity activity, String str, String str2, String str3, String str4, boolean z, int i, @Nullable JSONArray jSONArray, @Nullable sg.bigo.ads.d.c<?, ?> cVar, boolean z2, boolean z3, int i2, boolean z4) {
        ArrayList arrayList;
        o f;
        if (str2 != null) {
            arrayList = new ArrayList();
            arrayList.add(str2);
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        boolean z5 = i2 == 22 || i2 == 36;
        e eVar = new e();
        ?? f2 = cVar.f();
        if ((f2.y() == 3 || f2.y() == 4) && ((i2 == 22 || i2 == 36) && (f = f2.f()) != null)) {
            int a2 = f.a("clk_flow_attr.auto_clk_def", 0);
            int a3 = f.a("clk_flow_attr.auto_clk_urltype", 0);
            int a4 = f.a("clk_flow_attr.ac_gp_format", 1);
            if (a2 == 0 || ((a2 == 1 && i2 == 22) || (a2 == 2 && i2 == 36))) {
                if (a3 != 1) {
                    if (a3 == 2) {
                        eVar = a(context, activity, str, cVar, eVar, a4, z3, z5);
                    }
                    eVar.h = a4;
                } else {
                    eVar = a(context, activity, str, cVar, eVar, a4, z3, z5);
                    eVar.g = true;
                }
            }
        }
        if (eVar.a() || eVar.g) {
            return eVar;
        }
        int i3 = eVar.h;
        if (i3 < 0) {
            i3 = a(cVar);
        }
        return a(context, activity, arrayList2, str3, str4, z, i, jSONArray, cVar, z2, i3, z3, z5, z4);
    }

    public static e a(Context context, Activity activity, String str, String str2, String str3, boolean z, int i, @Nullable JSONArray jSONArray, @Nullable sg.bigo.ads.d.c<?, ?> cVar, boolean z2, boolean z3, boolean z4) {
        ArrayList arrayList;
        if (str != null) {
            arrayList = new ArrayList();
            arrayList.add(str);
        } else {
            arrayList = null;
        }
        return a(context, activity, (List<String>) arrayList, str2, str3, z, i, jSONArray, cVar, z2, 1, z3, false, z4);
    }

    public static e a(Context context, Activity activity, String str, @Nullable sg.bigo.ads.d.c<?, ?> cVar) {
        return a(context, activity, str, cVar, null, 0, false, false);
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r10v6, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r13v5, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r1v6, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r1v9, types: [sg.bigo.ads.api.core.b] */
    private static e a(Context context, Activity activity, String str, @Nullable sg.bigo.ads.d.c<?, ?> cVar, e eVar, int i, boolean z, boolean z2) {
        int i2;
        boolean a2;
        if (eVar == null) {
            eVar = new e();
        }
        e eVar2 = eVar;
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            JSONArray jSONArray = null;
            String o = cVar != null ? cVar.f().o() : null;
            if (sg.bigo.ads.core.landing.a.a(parse, context, activity, eVar2, cVar != null ? cVar.f().O().h() : null, z, o, i, true)) {
                if (cVar != null && eVar2.b() >= 0) {
                    cVar.a(eVar2.d);
                }
                eVar2.a = 1;
                return eVar2;
            }
            eVar2.a = 0;
            if (sg.bigo.ads.core.landing.a.a(str)) {
                eVar2.a = 2;
                a2 = sg.bigo.ads.core.landing.a.a(parse, context, activity, eVar2, z, o, i, true);
            } else {
                eVar2.a = 3;
                if (cVar != null) {
                    i2 = cVar.f().O().d();
                    jSONArray = cVar.f().O().e();
                } else {
                    i2 = 0;
                }
                if (i2 == 1) {
                    a2 = (z2 && a(context, str, cVar, eVar2, i)) || sg.bigo.ads.core.landing.a.a((sg.bigo.ads.api.core.b) cVar.f(), context, str, jSONArray);
                } else {
                    a2 = i2 == 2 ? a(context, str, cVar, eVar2, false) : a(context, str, cVar, eVar2, 0, false, i);
                }
            }
            eVar2.n = a2;
            if (eVar2.b() == 1) {
                eVar2.a = 5;
                if (cVar != null) {
                    cVar.a(eVar2.d);
                }
            }
        }
        return eVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0105, code lost:
    
        if (sg.bigo.ads.core.landing.a.a((sg.bigo.ads.api.core.b) (r25 != null ? r25.f() : 0), r2, r20, r24) != false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Type inference failed for: r0v2, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r14v2, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r1v17, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r2v15, types: [sg.bigo.ads.api.core.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(Context context, Activity activity, @Nullable List<String> list, String str, String str2, boolean z, int i, @Nullable JSONArray jSONArray, @Nullable sg.bigo.ads.d.c<?, ?> cVar, boolean z2, int i2, boolean z3, boolean z4, boolean z5) {
        Context context2;
        String str3;
        boolean z6;
        sg.bigo.ads.d.c<?, ?> cVar2;
        ?? f;
        int i3;
        boolean z7;
        int i4;
        a aVar;
        e eVar = new e();
        boolean z8 = false;
        eVar.a = 0;
        if (cVar != null && (aVar = cVar.m) != null && !aVar.b()) {
            aVar.a();
        }
        if (list != null) {
            int i5 = 0;
            z6 = false;
            while (true) {
                if (i5 >= list.size()) {
                    context2 = context;
                    str3 = str2;
                    break;
                }
                String str4 = list.get(i5);
                if (TextUtils.isEmpty(str4)) {
                    i4 = i5;
                } else {
                    str3 = str2;
                    i4 = i5;
                    boolean a2 = sg.bigo.ads.core.landing.a.a(Uri.parse(str4), context, activity, eVar, str3, z3, cVar != null ? cVar.f().o() : null, i2, true);
                    context2 = context;
                    if (a2) {
                        if (cVar != null && eVar.b() >= 0) {
                            cVar.a(eVar.d);
                        }
                        eVar.a = 1;
                        z6 = a2;
                    } else {
                        z6 = a2;
                    }
                }
                i5 = i4 + 1;
            }
        } else {
            context2 = context;
            str3 = str2;
            z6 = false;
        }
        if (!z6 && z5 && !TextUtils.isEmpty(str3) && (z6 = sg.bigo.ads.core.landing.a.b(context2, str3))) {
            eVar.a = 6;
        }
        if (!z6 && z && !TextUtils.isEmpty(str3) && (z6 = sg.bigo.ads.core.landing.a.a(context2, str3))) {
            eVar.a = 4;
        }
        if (!z6 && !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (sg.bigo.ads.core.landing.a.a(str)) {
                eVar.a = 2;
                Context context3 = context2;
                boolean a3 = sg.bigo.ads.core.landing.a.a(parse, context3, activity, eVar, z3, cVar != null ? cVar.f().o() : null, i2, true);
                context2 = context3;
                if (cVar != null && eVar.b() >= 0) {
                    cVar.a(eVar.d);
                }
                z7 = z2;
                i3 = i2;
                z6 = a3;
            } else {
                eVar.a = 3;
                i3 = i2;
                if (i == 1) {
                    if (!z4 || !b(context2, str, cVar, eVar, i3)) {
                    }
                    z8 = true;
                    z7 = z2;
                    z6 = z8;
                } else if (i == 2) {
                    z7 = z2;
                    z6 = a(context2, str, cVar, eVar, z7);
                } else {
                    z7 = z2;
                }
            }
            if (!z6 && !TextUtils.isEmpty(str)) {
                Context context4 = context2;
                cVar2 = cVar;
                z6 = a(context4, str, cVar2, eVar, 0, z7, i3);
                eVar.n = z6;
                if (z6 && cVar2 != null) {
                    f = cVar2.f();
                    if (cVar2.v != f.z()) {
                        cVar2.t = -1;
                        cVar2.v = f.z();
                    }
                    cVar2.u = System.currentTimeMillis();
                    cVar2.t++;
                }
                if (eVar.b() == 1) {
                    eVar.a = 5;
                }
                return eVar;
            }
        }
        cVar2 = cVar;
        eVar.n = z6;
        if (z6) {
            f = cVar2.f();
            if (cVar2.v != f.z()) {
            }
            cVar2.u = System.currentTimeMillis();
            cVar2.t++;
        }
        if (eVar.b() == 1) {
        }
        return eVar;
    }

    public static void a() {
    }

    private static void a(int i, @NonNull sg.bigo.ads.d.c<?, ?> cVar) {
        WeakHashMap<sg.bigo.ads.d.c<?, ?>, Integer> weakHashMap = a;
        synchronized (weakHashMap) {
            weakHashMap.put(cVar, Integer.valueOf(i));
        }
    }

    public static void a(Activity activity, @NonNull final sg.bigo.ads.api.core.b bVar, @NonNull final e eVar, @Nullable final sg.bigo.ads.aj.a aVar) {
        if (activity == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(activity);
        if (c == null) {
            c = new Runnable() { // from class: sg.bigo.ads.controller.landing.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    Activity activity2 = (Activity) weakReference.get();
                    if (activity2 != null) {
                        boolean hasWindowFocus = activity2.hasWindowFocus();
                        e eVar2 = eVar;
                        eVar2.i = !hasWindowFocus ? 1 : 0;
                        sg.bigo.ads.da.b.a(bVar, 1, eVar2, aVar);
                    }
                }
            };
        }
        sg.bigo.ads.bh.d.a(c);
        sg.bigo.ads.bh.d.a(1, c, 5000L);
    }

    public static void a(Activity activity, final sg.bigo.ads.d.c cVar) {
        if (activity == null || activity.getWindow() == null || cVar == null || cVar.z() == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - b < 2000) {
            return;
        }
        WeakReference weakReference = new WeakReference(activity);
        b = elapsedRealtime;
        final sg.bigo.ads.api.core.d z = cVar.z();
        cVar.a((sg.bigo.ads.api.core.d) null);
        Activity activity2 = (Activity) weakReference.get();
        if (activity2 != null) {
            final View decorView = activity2.getWindow().getDecorView();
            decorView.postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.landing.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    final boolean isShown = decorView.isShown();
                    sg.bigo.ads.bh.d.a(1, new Runnable() { // from class: sg.bigo.ads.controller.landing.d.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            sg.bigo.ads.api.core.b f = cVar.f();
                            sg.bigo.ads.api.core.d dVar = z;
                            sg.bigo.ads.da.b.a(f, dVar.a, isShown ? 1 : 2, dVar.b, dVar.c);
                        }
                    });
                }
            }, 1500L);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [sg.bigo.ads.api.core.b] */
    public static boolean a(Context context, @NonNull Class<? extends sg.bigo.ads.cl.b<?>> cls, @NonNull sg.bigo.ads.d.c<?, ?> cVar) {
        try {
            Intent b2 = AdActivity.b(context, cls);
            int hashCode = cVar.hashCode();
            a(hashCode, cVar);
            b2.putExtra("ad_identifier", hashCode);
            context.startActivity(b2);
            return true;
        } catch (Exception e) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) cVar.f(), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10116, Log.getStackTraceString(e));
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.b] */
    public static boolean a(Context context, @NonNull Class<? extends sg.bigo.ads.cl.b<?>> cls, @NonNull sg.bigo.ads.d.c<?, ?> cVar, boolean z) {
        try {
            Intent e = z ? AdActivity.e(context, cls) : AdActivity.d(context, cls);
            int hashCode = cVar.hashCode();
            a(hashCode, cVar);
            e.putExtra("ad_identifier", hashCode);
            context.startActivity(e);
            return true;
        } catch (Exception e2) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) cVar.f(), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10116, Log.getStackTraceString(e2));
            return false;
        }
    }

    private static boolean a(Context context, String str, @Nullable sg.bigo.ads.d.c<?, ?> cVar, @NonNull e eVar, int i) {
        return b(context, str, cVar, eVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:66:0x0004, B:68:0x0008, B:70:0x000e, B:5:0x0021, B:7:0x0027, B:14:0x0033, B:15:0x0050, B:17:0x005a, B:18:0x005e, B:20:0x0063, B:23:0x0075, B:33:0x00a2, B:37:0x00aa, B:40:0x00af, B:42:0x00b6, B:43:0x00c7, B:45:0x00cc, B:58:0x003e, B:62:0x0045, B:64:0x004b), top: B:65:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:66:0x0004, B:68:0x0008, B:70:0x000e, B:5:0x0021, B:7:0x0027, B:14:0x0033, B:15:0x0050, B:17:0x005a, B:18:0x005e, B:20:0x0063, B:23:0x0075, B:33:0x00a2, B:37:0x00aa, B:40:0x00af, B:42:0x00b6, B:43:0x00c7, B:45:0x00cc, B:58:0x003e, B:62:0x0045, B:64:0x004b), top: B:65:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:66:0x0004, B:68:0x0008, B:70:0x000e, B:5:0x0021, B:7:0x0027, B:14:0x0033, B:15:0x0050, B:17:0x005a, B:18:0x005e, B:20:0x0063, B:23:0x0075, B:33:0x00a2, B:37:0x00aa, B:40:0x00af, B:42:0x00b6, B:43:0x00c7, B:45:0x00cc, B:58:0x003e, B:62:0x0045, B:64:0x004b), top: B:65:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[Catch: Exception -> 0x001b, TRY_LEAVE, TryCatch #0 {Exception -> 0x001b, blocks: (B:66:0x0004, B:68:0x0008, B:70:0x000e, B:5:0x0021, B:7:0x0027, B:14:0x0033, B:15:0x0050, B:17:0x005a, B:18:0x005e, B:20:0x0063, B:23:0x0075, B:33:0x00a2, B:37:0x00aa, B:40:0x00af, B:42:0x00b6, B:43:0x00c7, B:45:0x00cc, B:58:0x003e, B:62:0x0045, B:64:0x004b), top: B:65:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0045 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:66:0x0004, B:68:0x0008, B:70:0x000e, B:5:0x0021, B:7:0x0027, B:14:0x0033, B:15:0x0050, B:17:0x005a, B:18:0x005e, B:20:0x0063, B:23:0x0075, B:33:0x00a2, B:37:0x00aa, B:40:0x00af, B:42:0x00b6, B:43:0x00c7, B:45:0x00cc, B:58:0x003e, B:62:0x0045, B:64:0x004b), top: B:65:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004b A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:66:0x0004, B:68:0x0008, B:70:0x000e, B:5:0x0021, B:7:0x0027, B:14:0x0033, B:15:0x0050, B:17:0x005a, B:18:0x005e, B:20:0x0063, B:23:0x0075, B:33:0x00a2, B:37:0x00aa, B:40:0x00af, B:42:0x00b6, B:43:0x00c7, B:45:0x00cc, B:58:0x003e, B:62:0x0045, B:64:0x004b), top: B:65:0x0004 }] */
    /* JADX WARN: Type inference failed for: r13v5, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r1v2, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r2v11, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r2v9, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context, String str, @Nullable sg.bigo.ads.d.c<?, ?> cVar, @NonNull e eVar, int i, boolean z, int i2) {
        LandingPageStyleConfig a2;
        Class cls;
        Intent c2;
        int i3;
        Class cls2;
        boolean z2;
        if (cVar != null) {
            try {
                WeakReference<c.a> weakReference = cVar.w;
                if (weakReference != null && weakReference.get() != null) {
                    a2 = cVar.w.get().a(context, str, i, z);
                    if (a2 != null && a2.a() && (i3 = a2.a) != 0 && i3 != 7 && i3 != 8) {
                        c2 = AdActivity.f(context, a2.g);
                        c2.putExtra("layout_style", a2);
                        c2.putExtra("webview_force_time", a2 == null ? a2.b : 1);
                        if (cVar != null) {
                            boolean z3 = cVar instanceof f;
                            if ((cVar.f().a(16) && !z3) || i2 > 0) {
                                c2.putExtra("try_gp_inline", true);
                                c2.putExtra("gp_inline_ad_bundle", cVar.f().o());
                                int y = cVar.f().y();
                                if (y != 2 && y != 1 && y != 15 && y != 16 && y != 17 && y != 18 && cVar.s != 2) {
                                    z2 = false;
                                    c2.putExtra("gp_inline_real_launch", z2);
                                }
                                z2 = true;
                                c2.putExtra("gp_inline_real_launch", z2);
                            }
                        }
                        c2.putExtra("url", str);
                        if (cVar != null) {
                            int hashCode = cVar.hashCode();
                            a(hashCode, cVar);
                            c2.putExtra("ad_identifier", hashCode);
                            c2.putExtra("land_way", i);
                        }
                        context.startActivity(c2);
                        if (eVar != null) {
                            eVar.j = i3;
                        }
                        return true;
                    }
                    cls = c.class;
                    if (a2 != null && (cls2 = a2.g) != null) {
                        cls = cls2;
                    }
                    c2 = !z ? AdActivity.c(context, cls) : AdActivity.a(context, cls);
                    i3 = 0;
                    c2.putExtra("layout_style", a2);
                    c2.putExtra("webview_force_time", a2 == null ? a2.b : 1);
                    if (cVar != null) {
                    }
                    c2.putExtra("url", str);
                    if (cVar != null) {
                    }
                    context.startActivity(c2);
                    if (eVar != null) {
                    }
                    return true;
                }
            } catch (Exception e) {
                sg.bigo.ads.da.b.a(cVar != null ? cVar.f() : null, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10116, Log.getStackTraceString(e));
                return false;
            }
        }
        a2 = null;
        if (a2 != null) {
            c2 = AdActivity.f(context, a2.g);
            c2.putExtra("layout_style", a2);
            c2.putExtra("webview_force_time", a2 == null ? a2.b : 1);
            if (cVar != null) {
            }
            c2.putExtra("url", str);
            if (cVar != null) {
            }
            context.startActivity(c2);
            if (eVar != null) {
            }
            return true;
        }
        cls = c.class;
        if (a2 != null) {
            cls = cls2;
        }
        if (!z) {
        }
        i3 = 0;
        c2.putExtra("layout_style", a2);
        c2.putExtra("webview_force_time", a2 == null ? a2.b : 1);
        if (cVar != null) {
        }
        c2.putExtra("url", str);
        if (cVar != null) {
        }
        context.startActivity(c2);
        if (eVar != null) {
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.b] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    private static boolean a(Context context, final String str, @Nullable final sg.bigo.ads.d.c<?, ?> cVar, @NonNull final e eVar, final boolean z) {
        final b bVar = new b(str, cVar == null ? 0 : cVar.f(), cVar, cVar != null ? cVar.m : null);
        a.C2426a c2426a = new a.C2426a();
        c2426a.a = str;
        c2426a.b = bVar;
        c2426a.c = new a.b() { // from class: sg.bigo.ads.controller.landing.d.1
            @Override // sg.bigo.ads.al.a.b
            public final void a(Context context2, String str2, int i, String str3) {
                int a2 = d.a(i);
                String str4 = str;
                sg.bigo.ads.d.c cVar2 = cVar;
                d.a(context2, str4, cVar2, eVar, a2, z, d.a((sg.bigo.ads.d.c<?, ?>) cVar2));
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                sg.bigo.ads.d.c cVar3 = cVar;
                sg.bigo.ads.da.b.a(cVar3 == null ? null : cVar3.f(), 3002, 10114, str3);
            }

            @Override // sg.bigo.ads.al.a.b
            public final void a(String str2, String str3, String str4) {
                b bVar2 = b.this;
                bVar2.a = str2;
                bVar2.b = str3;
                bVar2.c = str4;
            }
        };
        c2426a.a().a(context);
        return true;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [sg.bigo.ads.api.core.b] */
    public static boolean a(Context context, sg.bigo.ads.d.c<?, ?> cVar) {
        if (cVar == null) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) null, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10221, "ad == null, launchFormActivity failed");
            return false;
        }
        try {
            Intent a2 = AdFormActivity.a(context);
            int hashCode = cVar.hashCode();
            int A = cVar.A();
            a(hashCode, cVar);
            a2.putExtra("ad_identifier", hashCode);
            a2.putExtra("open_form_time", A);
            context.startActivity(a2);
            return true;
        } catch (Exception e) {
            sg.bigo.ads.da.b.a((sg.bigo.ads.api.core.b) cVar.f(), IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, 10221, Log.getStackTraceString(e));
            return false;
        }
    }
}
