package xsna;

import com.vk.network.kbh.state.NetworkState;
import com.vk.toggle.features.VideoFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;

/* compiled from: VideoAppStabilityRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class z1s0 implements y1s0 {
    public final io.reactivex.rxjava3.subjects.d<Boolean> b;
    public final io.reactivex.rxjava3.internal.operators.observable.y c;
    public final boolean d;
    public final boolean e;

    /* compiled from: VideoAppStabilityRepositoryImpl.kt */
    public static final class a implements q560 {
        public a() {
        }

        @Override // xsna.q560
        public final void a(NetworkState networkState) {
            z1s0.this.b.onNext(Boolean.valueOf(networkState == NetworkState.UNSTABLE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z1s0() {
        boolean z;
        io.reactivex.rxjava3.subjects.d<Boolean> O0 = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
        this.b = O0;
        d6q0.c(new a());
        io.reactivex.rxjava3.internal.operators.observable.z0 z0Var = new io.reactivex.rxjava3.internal.operators.observable.z0(O0);
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        b.a aVar = io.reactivex.rxjava3.internal.functions.b.a;
        new io.reactivex.rxjava3.internal.operators.observable.y(z0Var, qVar, aVar);
        this.c = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.z0(O0), qVar, aVar).U(new bj50(new m0m0(this), 17)), qVar, aVar);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_APP_STABILITY;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        boolean z2 = false;
        if (bVar.a(videoFeatures)) {
            x1s0 b = com.vk.toggle.d.N.b();
            if ((b == null ? new x1s0(false, false) : b).b) {
                z = true;
                this.d = z;
                videoFeatures.getClass();
                if (bVar.a(videoFeatures)) {
                    x1s0 b2 = com.vk.toggle.d.N.b();
                    if ((b2 == null ? new x1s0(false, false) : b2).a) {
                        z2 = true;
                    }
                }
                this.e = z2;
            }
        }
        z = false;
        this.d = z;
        videoFeatures.getClass();
        if (bVar.a(videoFeatures)) {
        }
        this.e = z2;
    }

    @Override // xsna.y1s0
    public final boolean G() {
        return this.b.P0().booleanValue();
    }

    @Override // xsna.y1s0
    public final boolean a() {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_APP_STABILITY;
        videoFeatures.getClass();
        return com.vk.toggle.b.A.a(videoFeatures) && this.b.P0().booleanValue();
    }

    @Override // xsna.y1s0
    public final io.reactivex.rxjava3.core.q<Boolean> b() {
        return this.c;
    }

    @Override // xsna.y1s0
    public final boolean c() {
        return this.d;
    }

    @Override // xsna.y1s0
    public final boolean d() {
        return this.e;
    }
}
