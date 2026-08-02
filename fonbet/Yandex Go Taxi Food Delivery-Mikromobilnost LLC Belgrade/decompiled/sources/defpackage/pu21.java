package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes6.dex */
public final class pu21 implements v1g0 {
    public final h3y a;

    public pu21(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        boolean z;
        if (map.containsKey("user_id")) {
            String str = (String) map.get("user_id");
            String Hg = ((h) ((fn21) this.a.get())).Hg();
            if (str != null && !str.equals(Hg)) {
                jst.e.a(10, null, new IllegalStateException("Push for another user", new Throwable(String.format(Locale.US, "push.user_id: %s\n app.user_id: %s", Arrays.copyOf(new Object[]{str, Hg}, 2)))), null);
                z = false;
                return !z;
            }
        }
        z = true;
        return !z;
    }
}
