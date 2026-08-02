package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes15.dex */
public final /* synthetic */ class mkz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yxf0 b;

    public /* synthetic */ mkz(int i, yxf0 yxf0Var) {
        this.a = i;
        this.b = yxf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        yxf0 yxf0Var = this.b;
        switch (i) {
            case 0:
                h5g0 h5g0Var = (h5g0) yxf0Var.b;
                String str = (String) yxf0Var.a;
                z83.g(null, h5g0Var.a.getLooper(), Looper.myLooper());
                h5g0Var.e = null;
                SharedPreferences sharedPreferences = h5g0Var.b;
                Set<String> stringSet = sharedPreferences.getStringSet("logout_tokens", null);
                if (stringSet != null && !stringSet.isEmpty()) {
                    HashSet hashSet = new HashSet(stringSet.size() - 1);
                    for (String str2 : stringSet) {
                        if (!str.equals(str2)) {
                            hashSet.add(str2);
                        }
                    }
                    sharedPreferences.edit().putStringSet("logout_tokens", hashSet).apply();
                    h5g0Var.b();
                    break;
                }
                break;
            default:
                h5g0 h5g0Var2 = (h5g0) yxf0Var.b;
                z83.g(null, h5g0Var2.a.getLooper(), Looper.myLooper());
                h5g0Var2.e = null;
                break;
        }
    }
}
