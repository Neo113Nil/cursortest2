package xsna;

import androidx.core.graphics.drawable.IconCompat;
import com.vk.external.miniapp.net.app.WebApiApplication;

/* compiled from: ShortcutInfo.kt */
/* loaded from: classes6.dex */
public final class xgj0 {
    public final WebApiApplication a;
    public final IconCompat b;

    public xgj0(WebApiApplication webApiApplication, IconCompat iconCompat) {
        this.a = webApiApplication;
        this.b = iconCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgj0)) {
            return false;
        }
        xgj0 xgj0Var = (xgj0) obj;
        return epx.f(this.a, xgj0Var.a) && epx.f(this.b, xgj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((int) this.a.b) * 31);
    }

    public final String toString() {
        return "ShortcutInfo(app=" + this.a + ", icon=" + this.b + ')';
    }
}
