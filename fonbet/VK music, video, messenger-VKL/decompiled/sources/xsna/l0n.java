package xsna;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class l0n {
    public final int a;

    @NonNull
    public final String b;

    @NonNull
    public final String c;
    public final int d;

    @NonNull
    public final HashMap e;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a {
        public final int a;

        @NonNull
        public final String b;
        public final int c;
        public final int d;

        public a(int i, @NonNull String str, int i2, int i3) {
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = i3;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageInfo{minHeight=");
            sb.append(this.a);
            sb.append(", width=");
            sb.append(this.c);
            sb.append(", height=");
            sb.append(this.d);
            sb.append(", url='");
            return i5s.a(sb, this.b, "'}");
        }
    }

    @Deprecated
    public l0n(int i, @NonNull String str) {
        this.e = new HashMap();
        this.a = i;
        this.c = str;
        this.b = "";
        this.d = 10;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Disclaimer{disclaimerType=");
        sb.append(this.a);
        sb.append(", alias=");
        sb.append(this.b);
        sb.append(", percent=");
        sb.append(this.d);
        sb.append(", images.size()=");
        sb.append(this.e.size());
        sb.append(", text='");
        return i5s.a(sb, this.c, "'}");
    }

    public l0n(int i, int i2, @NonNull String str, @NonNull String str2) {
        this.e = new HashMap();
        this.a = i;
        this.c = str;
        this.b = str2;
        this.d = i2;
    }
}
