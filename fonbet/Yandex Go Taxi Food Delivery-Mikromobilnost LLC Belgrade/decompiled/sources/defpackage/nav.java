package defpackage;

import com.yandex.runtime.image.ImageProvider;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nav {
    public final String a;
    public final ImageProvider b;
    public final float c;

    public nav(String str, ImageProvider imageProvider, float f) {
        this.a = str;
        this.b = imageProvider;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nav)) {
            return false;
        }
        nav navVar = (nav) obj;
        return this.a.equals(navVar.a) && this.b.equals(navVar.b) && Float.compare(this.c, navVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageLoadResult(id=");
        sb.append(this.a);
        sb.append(", imageProvider=");
        sb.append(this.b);
        sb.append(", scaleFactor=");
        return uw51.i(sb, this.c, Extension.C_BRAKE);
    }
}
