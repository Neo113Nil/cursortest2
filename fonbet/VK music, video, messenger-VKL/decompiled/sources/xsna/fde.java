package xsna;

import com.vk.dto.shortvideo.ClipGridParams;

/* compiled from: ClipsGridHeaderModel.kt */
/* loaded from: classes17.dex */
public final class fde {
    public final ClipGridParams.Data a;
    public final int b;
    public final int c;

    public fde(ClipGridParams.Data data, int i, int i2) {
        this.a = data;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final ClipGridParams.Data b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fde)) {
            return false;
        }
        fde fdeVar = (fde) obj;
        return epx.f(this.a, fdeVar.a) && this.b == fdeVar.b && this.c == fdeVar.c;
    }

    public final int hashCode() {
        ClipGridParams.Data data = this.a;
        return Integer.hashCode(this.c) + shy.a(this.b, (data == null ? 0 : data.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsGridHeaderModel(params=");
        sb.append(this.a);
        sb.append(", viewsCount=");
        sb.append(this.b);
        sb.append(", likesCount=");
        return vu5.b(sb, this.c, ')');
    }
}
