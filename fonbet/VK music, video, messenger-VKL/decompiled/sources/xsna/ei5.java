package xsna;

import android.util.SparseArray;
import com.vk.libvideo.api.VideoAutoPlayDelayType;

/* compiled from: AutoPlaySettings.kt */
/* loaded from: classes4.dex */
public final class ei5 {
    public static final ei5 h;
    public final SparseArray<yg5> a;
    public final SparseArray<String> b;
    public final SparseArray<String> c;
    public final int d;
    public final int e;
    public final String f;
    public final VideoAutoPlayDelayType g;

    static {
        u4q0 u4q0Var = zik0.a;
        h = new ei5(u4q0Var, u4q0Var, u4q0Var, 0, 0, null, VideoAutoPlayDelayType.FEED);
    }

    public ei5(SparseArray<yg5> sparseArray, SparseArray<String> sparseArray2, SparseArray<String> sparseArray3, int i, int i2, String str, VideoAutoPlayDelayType videoAutoPlayDelayType) {
        this.a = sparseArray;
        this.b = sparseArray2;
        this.c = sparseArray3;
        this.d = i;
        this.e = i2;
        this.f = str;
        this.g = videoAutoPlayDelayType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei5)) {
            return false;
        }
        ei5 ei5Var = (ei5) obj;
        return epx.f(this.a, ei5Var.a) && epx.f(this.b, ei5Var.b) && epx.f(this.c, ei5Var.c) && this.d == ei5Var.d && this.e == ei5Var.e && epx.f(this.f, ei5Var.f) && this.g == ei5Var.g;
    }

    public final int hashCode() {
        int a = shy.a(this.e, shy.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31);
        String str = this.f;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        VideoAutoPlayDelayType videoAutoPlayDelayType = this.g;
        return hashCode + (videoAutoPlayDelayType != null ? videoAutoPlayDelayType.hashCode() : 0);
    }

    public final String toString() {
        return "AutoPlaySettings(autoPlayItems=" + this.a + ", videoTrackCodes=" + this.b + ", videoContexts=" + this.c + ", autoPlayAdapterOffset=" + this.d + ", fullItemsCount=" + this.e + ", listRef=" + this.f + ", videoAutoPlayDelayType=" + this.g + ')';
    }
}
