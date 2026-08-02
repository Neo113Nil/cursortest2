package defpackage;

import com.yandex.messaging.internal.view.messagemenu.MenuSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ll10 {
    public final int a;
    public final MenuSection b;

    public ll10(int i, MenuSection menuSection) {
        this.a = i;
        this.b = menuSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll10)) {
            return false;
        }
        ll10 ll10Var = (ll10) obj;
        return this.a == ll10Var.a && this.b == ll10Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MenuItemConfig(viewId=" + this.a + ", section=" + this.b + Extension.C_BRAKE;
    }
}
