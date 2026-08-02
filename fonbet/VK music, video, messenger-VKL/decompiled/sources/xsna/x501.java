package xsna;

import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class x501 {
    public static final HashSet a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    public static final List b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    public static final List c = Arrays.asList("auto", MBridgeConstans.DYNAMIC_VIEW_WX_APP, "am");
    public static final List d = Arrays.asList("_r", "_dbg");
    public static final List e;
    public static final List f;

    static {
        String[][] strArr = {fd01.a, fd01.b};
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += strArr[i2].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i);
        int length = strArr[0].length;
        String[] strArr2 = strArr[1];
        System.arraycopy(strArr2, 0, copyOf, length, strArr2.length);
        e = Arrays.asList((String[]) copyOf);
        f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        char c2;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!c(str) || bundle == null) {
            return false;
        }
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode == 101200) {
            if (str.equals("fcm")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode != 101230) {
            if (hashCode == 3142703 && str.equals("fiam")) {
                c2 = 2;
            }
            c2 = 65535;
        } else {
            if (str.equals("fdl")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        if (c2 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        if (c2 != 2) {
            return false;
        }
        bundle.putString("_cis", "fiam_integration");
        return true;
    }

    public static boolean b(Bundle bundle, String str) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !c.contains(str);
    }

    public static boolean d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (e.contains(str2)) {
            return false;
        }
        Iterator it = f.iterator();
        while (it.hasNext()) {
            if (str2.matches((String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
