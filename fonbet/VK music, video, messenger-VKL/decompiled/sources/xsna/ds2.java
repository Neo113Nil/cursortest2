package xsna;

import android.graphics.Color;
import java.util.ArrayList;

/* compiled from: AnimojiRenderUtil.kt */
/* loaded from: classes7.dex */
public final class ds2 {
    public static final ArrayList a;

    static {
        String[] strArr = {"#A6EDBD", "#A1DDF0", "#AACCF2", "#B5AAF2", "#F2AAB5", "#F2D983", "#F2C0A5"};
        ArrayList arrayList = new ArrayList(7);
        for (int i = 0; i < 7; i++) {
            arrayList.add(Integer.valueOf(Color.parseColor(strArr[i])));
        }
        a = arrayList;
    }

    public static int a(String str, String str2) {
        int i;
        int hashCode = str2.hashCode() * str.hashCode();
        int length = str.length();
        ArrayList arrayList = a;
        if (length > 0) {
            i = (arrayList.size() + (hashCode % arrayList.size())) % arrayList.size();
        } else {
            i = 0;
        }
        return ((Number) arrayList.get(i)).intValue();
    }
}
