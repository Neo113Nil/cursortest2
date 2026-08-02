package defpackage;

import android.view.View;
import android.widget.ImageView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class pm1 {
    public final View a;
    public final ImageView b;

    public pm1(ImageView imageView, View view) {
        this.a = view;
        this.b = imageView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm1)) {
            return false;
        }
        pm1 pm1Var = (pm1) obj;
        return this.a.equals(pm1Var.a) && this.b.equals(pm1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionUiModel(item=" + this.a + ", icon=" + this.b + Extension.C_BRAKE;
    }
}
