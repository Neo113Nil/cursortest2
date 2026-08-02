package defpackage;

import android.app.Application;
import com.yandex.passport.api.b;
import com.yandex.passport.internal.autologin.ui.h;
import kotlin.a;

/* loaded from: classes9.dex */
public final class ep90 {
    public final i3y a;

    public ep90(Application application) {
        this.a = a.a(new ppq(application, 1));
    }

    public final b a() {
        return (b) this.a.getValue();
    }

    public final h b() {
        return new h(a().t().a, 2);
    }
}
