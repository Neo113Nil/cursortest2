package xsna;

import android.media.VolumeProvider;
import android.os.Build;
import androidx.annotation.Nullable;

/* compiled from: VolumeProviderCompat.java */
/* loaded from: classes12.dex */
public abstract class f7x0 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public b e;
    public VolumeProvider f;

    /* compiled from: VolumeProviderCompat.java */
    public static class a {
        public static void a(VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }

    /* compiled from: VolumeProviderCompat.java */
    public static abstract class b {
        public abstract void onVolumeChanged(f7x0 f7x0Var);
    }

    public f7x0(int i, int i2, int i3, @Nullable String str) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        f7x0 f7x0Var;
        if (this.f != null) {
            f7x0Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            f7x0Var = this;
            f7x0Var.f = new d7x0(f7x0Var, this.a, this.b, this.d, this.c);
        } else {
            f7x0Var = this;
            f7x0Var.f = new e7x0(this, f7x0Var.a, f7x0Var.b, f7x0Var.d);
        }
        return f7x0Var.f;
    }
}
