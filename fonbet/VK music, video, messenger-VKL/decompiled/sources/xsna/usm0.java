package xsna;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: StudilkaRemoteConfigStore.kt */
/* loaded from: classes17.dex */
public final class usm0 {
    public static final bpn0 a = new bpn0(new qc00(11));
    public static final ArrayList b = new ArrayList();

    public static String a() {
        return ((SharedPreferences) a.getValue()).getString("config", null);
    }

    public static void b(String str) {
        bpn0 bpn0Var = a;
        if (str == null) {
            SharedPreferences.Editor edit = ((SharedPreferences) bpn0Var.getValue()).edit();
            edit.remove("config");
            edit.apply();
        } else {
            SharedPreferences.Editor edit2 = ((SharedPreferences) bpn0Var.getValue()).edit();
            edit2.putString("config", str);
            edit2.apply();
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            ((izs) it.next()).invoke(str);
        }
    }
}
