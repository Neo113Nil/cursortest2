package xsna;

import com.vk.dto.photo.Photo;
import java.util.List;

/* compiled from: ProfilePhotoConfig.kt */
/* loaded from: classes5.dex */
public final class xyd0 {
    public final int a;
    public final List<Photo> b;
    public final izd0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public xyd0(int i, List<? extends Photo> list, izd0 izd0Var) {
        this.a = i;
        this.b = list;
        this.c = izd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyd0)) {
            return false;
        }
        xyd0 xyd0Var = (xyd0) obj;
        return this.a == xyd0Var.a && epx.f(this.b, xyd0Var.b) && epx.f(this.c, xyd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ProfilePhotoConfig(position=" + this.a + ", photos=" + this.b + ", viewerCallback=" + this.c + ')';
    }
}
