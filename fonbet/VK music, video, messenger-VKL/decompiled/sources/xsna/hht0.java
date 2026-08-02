package xsna;

import com.vk.dto.common.VideoFile;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoSlidingBlockLoader.kt */
/* loaded from: classes7.dex */
public final class hht0 {
    public final b25 a;
    public final com.vk.video.kidsprofile.restricteduseractions.a b;
    public final i8p0 c;
    public final io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> d;
    public final io.reactivex.rxjava3.internal.operators.observable.j1 e;

    public hht0(b25 b25Var, com.vk.video.kidsprofile.restricteduseractions.a aVar, cgs0 cgs0Var) {
        this.a = b25Var;
        this.b = aVar;
        this.c = new i8p0(b25Var, aVar, cgs0Var);
        io.reactivex.rxjava3.subjects.d<Optional<VideoFile>> O0 = io.reactivex.rxjava3.subjects.d.O0(Optional.ofNullable(null));
        this.d = O0;
        io.reactivex.rxjava3.internal.operators.observable.a2 g0 = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(O0, new wx40(new ye40(25), 15)).U(new uq80(new fuh0(8), 10)), new ga40(new lir0(4), 18), io.reactivex.rxjava3.internal.functions.b.a).s0(new z250(new gib0(this, 26), 12)).g0();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.core.w a = io.reactivex.rxjava3.schedulers.a.a();
        io.reactivex.rxjava3.internal.functions.b.a(1, "subscriberCount");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a, "scheduler is null");
        this.e = new io.reactivex.rxjava3.internal.operators.observable.x1(g0, 50L, timeUnit, a).U(new j630(new qyn0(6), 24));
    }
}
