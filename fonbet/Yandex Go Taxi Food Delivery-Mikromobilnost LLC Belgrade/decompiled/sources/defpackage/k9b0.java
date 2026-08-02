package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class k9b0 {
    public static final int b = ewg0.ybsdk_pfm_category_border_width;
    public final ColorModel a;

    public k9b0(ColorModel colorModel) {
        this.a = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9b0) && this.a.equals(((k9b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Border(color=" + this.a + Extension.C_BRAKE;
    }
}
