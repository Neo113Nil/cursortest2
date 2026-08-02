package defpackage;

import com.yandex.mobile.drive.uikit.window.DecorationColor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class i851 {
    public final Boolean a;
    public final DecorationColor b;

    public i851(DecorationColor decorationColor, int i) {
        Boolean bool = (i & 2) != 0 ? null : Boolean.TRUE;
        decorationColor = (i & 4) != 0 ? null : decorationColor;
        this.a = bool;
        this.b = decorationColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i851)) {
            return false;
        }
        i851 i851Var = (i851) obj;
        return jl40.l(this.a, i851Var.a) && this.b == i851Var.b;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        DecorationColor decorationColor = this.b;
        return hashCode + (decorationColor != null ? decorationColor.hashCode() : 0);
    }

    public final String toString() {
        return "WindowStyle(lightStatusBarIcons=null, lightNavigationBarIcons=" + this.a + ", navigationBarColor=" + this.b + Extension.C_BRAKE;
    }

    public i851() {
        this(null, 7);
    }
}
