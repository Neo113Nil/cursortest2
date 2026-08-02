package xsna;

import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.data.VKList;
import java.util.List;

/* compiled from: StorefrontAlbumsPage.kt */
/* loaded from: classes18.dex */
public final class jkl0 {
    public final List<GoodAlbum> a;
    public final int b;
    public final String c;
    public final boolean d;

    public jkl0(VKList vKList, int i, String str, boolean z) {
        this.a = vKList;
        this.b = i;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkl0)) {
            return false;
        }
        jkl0 jkl0Var = (jkl0) obj;
        return epx.f(this.a, jkl0Var.a) && this.b == jkl0Var.b && epx.f(this.c, jkl0Var.c) && this.d == jkl0Var.d;
    }

    public final int hashCode() {
        List<GoodAlbum> list = this.a;
        int a = shy.a(this.b, (list == null ? 0 : list.hashCode()) * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((a + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorefrontAlbumsPage(albums=");
        sb.append(this.a);
        sb.append(", total=");
        sb.append(this.b);
        sb.append(", editUrl=");
        sb.append(this.c);
        sb.append(", isCartEnabled=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
