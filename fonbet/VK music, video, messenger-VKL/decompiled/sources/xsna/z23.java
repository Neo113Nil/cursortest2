package xsna;

import android.content.IntentFilter;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z23 {
    public static IntentFilter a(String str) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        return intentFilter;
    }

    public static String b(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String c(String str, String str2, String str3) {
        return new Regex(str).g(str2, str3);
    }
}
