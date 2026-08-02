package defpackage;

import android.content.SharedPreferences;
import com.yandex.messaging.profile.d;

/* loaded from: classes15.dex */
public final class ecg implements xvf0 {
    public final /* synthetic */ int a;
    public final sae b;

    public /* synthetic */ ecg(sae saeVar, int i) {
        this.a = i;
        this.b = saeVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        sae saeVar = this.b;
        switch (i) {
            case 0:
                x22 t = saeVar.t();
                q5z.h(t);
                return t;
            case 1:
                return ((z8g) saeVar.b).a.n;
            case 2:
                return saeVar.u();
            case 3:
                vse v = saeVar.v();
                q5z.h(v);
                return v;
            case 4:
                String str = (String) ((z8g) saeVar.b).c.get();
                q5z.h(str);
                return str;
            case 5:
                rz10 rz10Var = ((z8g) saeVar.b).a.k;
                q5z.i(rz10Var);
                return rz10Var;
            case 6:
                d z = saeVar.z();
                q5z.h(z);
                return z;
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) ((z8g) saeVar.b).T.get();
                q5z.h(sharedPreferences);
                return sharedPreferences;
        }
    }
}
