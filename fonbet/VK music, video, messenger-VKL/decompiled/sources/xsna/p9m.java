package xsna;

import com.vk.core.ui.themes.VKTheme;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import java.util.Map;

/* compiled from: DialogAppearance.kt */
/* loaded from: classes2.dex */
public final class p9m {
    public final String a;
    public final Map<VKTheme, DialogThemeImpl> b;

    public p9m(String str, Map<VKTheme, DialogThemeImpl> map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9m)) {
            return false;
        }
        p9m p9mVar = (p9m) obj;
        return epx.f(this.a, p9mVar.a) && epx.f(this.b, p9mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogAppearance(name=");
        sb.append(this.a);
        sb.append(", colors=");
        return cjl0.a(sb, this.b, ')');
    }
}
