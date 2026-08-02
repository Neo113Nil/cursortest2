package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class q1g {

    @NonNull
    public final String a;

    @NonNull
    public final String b;

    @Nullable
    public final kiw c;

    @Nullable
    public final b d;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {

        @NonNull
        public final String a;

        @NonNull
        public final String b;
        public final int c;
        public final int d;

        public a(String str, String str2, int i, int i2) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class b {

        @NonNull
        public final kiw a;

        @NonNull
        public final ArrayList b;
        public final int c;

        public b(kiw kiwVar, ArrayList arrayList, int i) {
            this.a = kiwVar;
            this.b = arrayList;
            this.c = i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Video{duration=");
            sb.append(this.c);
            sb.append(", preview=");
            sb.append(this.a);
            sb.append(", mediaFiles=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b('}', sb, this.b);
        }
    }

    public q1g(String str, String str2, kiw kiwVar, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = kiwVar;
        this.d = bVar;
    }

    public final String toString() {
        return "CollageItem{id='" + this.a + "', type='" + this.b + "', image=" + this.c + ", video=" + this.d + '}';
    }
}
