package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.go.payments.paymentlist.ui.IconType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class k0a0 extends m0a0 {
    public final IconType a;
    public Drawable b;

    public k0a0(IconType iconType) {
        this.a = iconType;
    }

    @Override // defpackage.m0a0
    public final Drawable a(Context context) {
        if (this.b == null) {
            this.b = vng.t(this.a.getResourceId(), context);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0a0) && this.a == ((k0a0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IconTypePaymentIcon(iconType=" + this.a + Extension.C_BRAKE;
    }
}
