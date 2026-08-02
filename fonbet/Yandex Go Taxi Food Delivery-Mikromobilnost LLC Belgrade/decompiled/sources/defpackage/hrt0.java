package defpackage;

import android.app.Activity;
import com.yandex.go.splash.AfterSplashType;
import com.yandex.go.splash.SplashComponent;
import com.yandex.go.splash.domain.c;

/* loaded from: classes8.dex */
public final class hrt0 implements grt0 {
    public final Activity a;
    public final hqt0 b;
    public final jqt0 c;
    public final oqt0 d;
    public final c e;
    public SplashComponent f;

    public hrt0(Activity activity, hqt0 hqt0Var, jqt0 jqt0Var, oqt0 oqt0Var, c cVar) {
        this.a = activity;
        this.b = hqt0Var;
        this.c = jqt0Var;
        this.d = oqt0Var;
        this.e = cVar;
    }

    public final boolean a() {
        return b() ? this.e.d : this.f == null;
    }

    public final boolean b() {
        oqt0 oqt0Var = this.d;
        return oqt0Var.c() && oqt0Var.a() == AfterSplashType.NONE;
    }
}
