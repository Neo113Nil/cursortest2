package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: BaseUrlParameterValidator.kt */
/* loaded from: classes.dex */
public final class zp6 {
    public static final Set<String> a = rl3.y0(new String[]{"statEvents.add", "statEvents.addSAKMobile", "stats.trackEvents", "stats.benchmark", "execute", "account.setOnline", "account.getToggles", "auth.refreshTokens", "stories.getUnseenStatus"});
    public static final Object b;
    public static final Object c;

    static {
        m mVar = new m(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        b = msy.a(lazyThreadSafetyMode, mVar);
        c = msy.a(lazyThreadSafetyMode, new yp6(0));
    }

    public static void a(com.vk.api.sdk.a aVar, List list) {
        LinkedHashMap linkedHashMap = aVar.f;
        if (list == null || a.contains(aVar.c) || aVar.p) {
            return;
        }
        String str = (String) linkedHashMap.get("fields");
        String str2 = (String) linkedHashMap.get("user_fields");
        if (str != null) {
            str2 = str;
        }
        if (str2 == null || !drm0.D(str2, "photo_", false)) {
            return;
        }
        String str3 = str == null ? "user_fields" : "fields";
        String str4 = (String) linkedHashMap.get(str3);
        List<String> c0 = str4 != null ? drm0.c0(str4, new String[]{StringUtils.COMMA}, 0, 6) : EmptyList.b;
        ArrayList arrayList = new ArrayList(c0.size());
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        for (String str5 : c0) {
            if (list.contains(str5)) {
                arrayList2.add(str5);
            } else {
                arrayList.add(str5);
                if (epx.f(str5, "photo_base")) {
                    z = true;
                }
            }
        }
        if (j5g.M(arrayList2) && !z) {
            arrayList.add("photo_base");
        }
        if (j5g.M(arrayList2) || !z) {
            linkedHashMap.put(str3, j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62));
            if (j5g.M(arrayList2)) {
                j5g.g0(arrayList2, StringUtils.COMMA, null, null, 0, null, 62);
                return;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (drm0.D(str2, (String) obj, false)) {
                arrayList3.add(obj);
            }
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        drm0.D(str2, "photo_base", false);
        j5g.g0(arrayList3, StringUtils.COMMA, null, null, 0, null, 62);
    }
}
