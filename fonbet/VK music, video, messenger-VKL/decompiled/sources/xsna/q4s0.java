package xsna;

import com.vk.core.apps.BuildInfo;
import java.lang.ref.WeakReference;

/* compiled from: VideoBackgroundEnvironment.kt */
/* loaded from: classes2.dex */
public final class q4s0 {
    public static final q4s0 a = new q4s0();
    public static final io.reactivex.rxjava3.subjects.d<WeakReference<yg5>> b = io.reactivex.rxjava3.subjects.d.O0(new WeakReference(null));

    public final yg5 a() {
        return b.P0().get();
    }

    public final boolean b() {
        return b.P0().get() != null;
    }

    public final boolean c() {
        return fxc0.B().k();
    }

    public final boolean d() {
        return fxc0.B().r() && !BuildInfo.t();
    }

    public final void e(yg5 yg5Var) {
        b.onNext(new WeakReference<>(yg5Var));
    }
}
