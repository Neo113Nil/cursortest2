package xsna;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import xsna.vix0;

/* compiled from: ApiFeature.java */
/* loaded from: classes12.dex */
public abstract class gy2 implements ywi {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    /* compiled from: ApiFeature.java */
    public static class a {
        public static final HashSet a = new HashSet(Arrays.asList(vix0.b.a.i()));
    }

    /* compiled from: ApiFeature.java */
    public static class b extends gy2 {
        @Override // xsna.gy2
        public final boolean b() {
            return true;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class c extends gy2 {
        @Override // xsna.gy2
        public final boolean b() {
            return true;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class d extends gy2 {
        @Override // xsna.gy2
        public final boolean b() {
            return false;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class e extends gy2 {
        @Override // xsna.gy2
        public final boolean b() {
            return true;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class f extends gy2 {
        @Override // xsna.gy2
        public final boolean b() {
            return true;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class g extends gy2 {
        @Override // xsna.gy2
        public final boolean b() {
            return true;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class h extends gy2 {
        @Override // xsna.gy2
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* compiled from: ApiFeature.java */
    public static class i extends gy2 {
        @Override // xsna.gy2
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public gy2(@NonNull String str, @NonNull String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    @Override // xsna.ywi
    @NonNull
    public final String a() {
        return this.a;
    }

    public abstract boolean b();

    public boolean c() {
        return BoundaryInterfaceReflectionUtil.containsFeature(a.a, this.b);
    }

    @Override // xsna.ywi
    public final boolean isSupported() {
        return b() || c();
    }
}
