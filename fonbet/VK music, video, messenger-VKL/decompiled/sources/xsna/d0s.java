package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: FolderSublistsLoaderImpl.kt */
/* loaded from: classes18.dex */
public final class d0s {
    public final Object a;
    public final Object b;
    public final Object c;

    public d0s() {
        this.a = new ConcurrentLinkedQueue();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.b = reentrantLock;
        this.c = reentrantLock.newCondition();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public void a() {
        ros0 ros0Var = ((yos0) this.a).d;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = ((SharedPreferences) ros0Var.e.getValue()).edit();
        edit.putLong("pref_key_last_open_vk_video_at_discovery_popup_show_after_close", currentTimeMillis);
        edit.apply();
    }

    public io.reactivex.rxjava3.internal.operators.observable.l2 b(int i) {
        io.reactivex.rxjava3.core.t w = ((a1w) this.a).C(this, new jum0(i)).w();
        io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) this.b;
        com.vk.movika.sdk.base.hooks.f fVar = new com.vk.movika.sdk.base.hooks.f(new byo(1), 20);
        qVar.getClass();
        return io.reactivex.rxjava3.core.q.q(w, new io.reactivex.rxjava3.internal.operators.observable.i0(qVar, fVar).x(new q40(new c0s(i, this), 14))).r0((io.reactivex.rxjava3.core.w) this.c);
    }

    public d0s(a1w a1wVar, io.reactivex.rxjava3.core.q qVar) {
        this.a = a1wVar;
        this.b = qVar;
        this.c = asu0.a.c();
    }

    public d0s(yos0 yos0Var, Context context, VideoGrowthVideoParams videoGrowthVideoParams) {
        this.a = yos0Var;
        this.b = context;
        this.c = videoGrowthVideoParams;
    }
}
