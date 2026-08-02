package xsna;

import android.content.SharedPreferences;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tdj implements io.reactivex.rxjava3.functions.l {
    public static String a(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static void b(SharedPreferences sharedPreferences, String str, boolean z) {
        sharedPreferences.edit().putBoolean(str, z).apply();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((jon0) obj).a();
    }
}
