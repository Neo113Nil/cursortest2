package defpackage;

import android.util.Log;

/* loaded from: classes15.dex */
public class dy00 implements qvu {
    @Override // defpackage.qvu
    public final void a(String str) {
        int indexOf;
        if (str.startsWith("Authorization: ") && (indexOf = str.indexOf(32, 15)) > 0 && indexOf < str.length()) {
            StringBuilder sb = new StringBuilder(str);
            while (true) {
                indexOf++;
                if (indexOf >= str.length() - 4) {
                    break;
                } else {
                    sb.setCharAt(indexOf, '*');
                }
            }
            str = sb.toString();
        }
        if (ydz.a.a()) {
            Log.i("OkHttp", str);
        }
    }
}
