package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: MessageListProfilesLoader.kt */
/* loaded from: classes16.dex */
public final class ia20 {
    public final s101 a;
    public final euz b;
    public final ruf0 c;
    public final io.reactivex.rxjava3.subjects.d<ProfilesInfo> d;
    public final io.reactivex.rxjava3.internal.operators.observable.z e;
    public final ReentrantReadWriteLock f;
    public volatile io.reactivex.rxjava3.disposables.c g;
    public final AtomicBoolean h;

    public ia20(s101 s101Var, euz euzVar, ruf0 ruf0Var) {
        this.a = s101Var;
        this.b = euzVar;
        this.c = ruf0Var;
        io.reactivex.rxjava3.subjects.d<ProfilesInfo> O0 = io.reactivex.rxjava3.subjects.d.O0(new ProfilesInfo());
        this.d = O0;
        this.e = new io.reactivex.rxjava3.internal.operators.observable.z(new io.reactivex.rxjava3.internal.operators.observable.y(O0, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new t520(new sop(this, 28), 1));
        this.f = new ReentrantReadWriteLock();
        this.h = new AtomicBoolean(false);
    }

    public final f1e0 a(f1e0 f1e0Var) {
        f1e0 Db = this.d.P0().Db();
        return new f1e0(izi0.g(f1e0Var.a, Db.a), izi0.g(f1e0Var.b, Db.b), izi0.g(f1e0Var.c, Db.c), izi0.g(f1e0Var.d, Db.d), izi0.g(f1e0Var.e, Db.e));
    }
}
