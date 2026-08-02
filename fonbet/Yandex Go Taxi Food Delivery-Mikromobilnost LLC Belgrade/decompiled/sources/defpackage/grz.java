package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.safety.center.lost_item.data.Image$ImageType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class grz {
    public final Drawable a;
    public final Image$ImageType b;

    public grz(Drawable drawable, Image$ImageType image$ImageType) {
        this.a = drawable;
        this.b = image$ImageType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grz)) {
            return false;
        }
        grz grzVar = (grz) obj;
        return this.a.equals(grzVar.a) && this.b == grzVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UiImage(drawable=" + this.a + ", imageType=" + this.b + Extension.C_BRAKE;
    }
}
