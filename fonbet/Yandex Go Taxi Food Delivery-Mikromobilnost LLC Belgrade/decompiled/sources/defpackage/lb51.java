package defpackage;

import com.yandex.runtime.image.ImageProvider;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lb51 implements f2c0 {
    public final ImageProvider a;

    public lb51(ImageProvider imageProvider) {
        this.a = imageProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lb51) && jl40.l(this.a, ((lb51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WrappedImageProvider(impl=" + this.a + Extension.C_BRAKE;
    }
}
