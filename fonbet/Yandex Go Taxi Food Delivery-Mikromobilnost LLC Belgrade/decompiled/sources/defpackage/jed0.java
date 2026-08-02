package defpackage;

import com.yandex.plus.core.data.common.PlusThemedImage;

/* loaded from: classes2.dex */
public final class jed0 {
    public final PlusThemedImage a;

    public jed0(PlusThemedImage plusThemedImage) {
        this.a = plusThemedImage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jed0) && jl40.l(this.a, ((jed0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Image(image=" + this.a + ')';
    }
}
