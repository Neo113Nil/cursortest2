package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.FormSection;

/* loaded from: classes5.dex */
public final class f151 {
    public final zii0 a;
    public final FormSection b;
    public final float c;
    public final int d;

    public f151(zii0 zii0Var, FormSection formSection, float f, int i) {
        this.a = zii0Var;
        this.b = formSection;
        this.c = f;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f151)) {
            return false;
        }
        f151 f151Var = (f151) obj;
        return this.a.equals(f151Var.a) && this.b == f151Var.b && Float.compare(this.c, f151Var.c) == 0 && this.d == f151Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + g8e.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "WidgetBounds(rectInRoot=" + this.a + ", section=" + this.b + ", positionY=" + this.c + ", scrollOffsetAtCapture=" + this.d + Extension.C_BRAKE;
    }
}
