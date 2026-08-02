package yads;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* loaded from: classes10.dex */
public final class v1 {
    public static final String a = "com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.";
    public static final Map b = pn00.k(new Pair(16, "ActivityInfo.CONFIG_KEYBOARD"), new Pair(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), new Pair(128, "ActivityInfo.CONFIG_ORIENTATION"), new Pair(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), new Pair(512, "ActivityInfo.CONFIG_UI_MODE"), new Pair(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), new Pair(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ActivityInfo activityInfo) {
        String str;
        Map map = b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int intValue = ((Number) entry.getKey()).intValue();
            String str2 = (String) entry.getValue();
            if ((intValue & activityInfo.configChanges) == 0) {
                str = str2;
            }
            arrayList.add(str);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((String) next) != null) {
                str = next;
                break;
            }
        }
        String str3 = str;
        if (str3 == null) {
            return;
        }
        String format = String.format(a, Arrays.copyOf(new Object[]{str3}, 1));
        throw new xb1(format, format);
    }
}
