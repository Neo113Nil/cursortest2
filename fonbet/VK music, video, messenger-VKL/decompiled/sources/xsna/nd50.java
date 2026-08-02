package xsna;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.HashMap;
import java.util.LinkedList;
import xsna.k840;
import xsna.kd50;

/* compiled from: MusicTrackModelImpl.java */
/* loaded from: classes3.dex */
public final class nd50 extends tq70<kd50.a> implements kd50 {
    public MusicTrack d;
    public final u2b0 e;
    public final b25 f;
    public final HashMap g = new HashMap();
    public final io.reactivex.rxjava3.disposables.c h = k840.a.h.a.a.b0(mb50.class).subscribe(new a());

    /* compiled from: MusicTrackModelImpl.java */
    public class a implements io.reactivex.rxjava3.functions.f<mb50> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(mb50 mb50Var) throws Throwable {
            mb50 mb50Var2 = mb50Var;
            bn40.e(mb50Var2);
            boolean z = mb50Var2 instanceof yd50;
            nd50 nd50Var = nd50.this;
            if (z) {
                nd50Var.y(new ld50(this, mb50Var2));
            } else if (mb50Var2 instanceof fa50) {
                nd50Var.y(new md50(this, mb50Var2));
            }
        }
    }

    public nd50(u2b0 u2b0Var, b25 b25Var) {
        this.e = u2b0Var;
        this.f = b25Var;
    }

    public static void E(nd50 nd50Var, MusicTrack musicTrack, VKApiExecutionException vKApiExecutionException) {
        nd50Var.g.remove(musicTrack.Fb());
        bn40.c(vKApiExecutionException, new Object[0]);
        nd50Var.y(new j630(nd50Var, vKApiExecutionException));
    }

    public static void F(nd50 nd50Var, MusicTrack musicTrack, int i) {
        b25 b25Var = nd50Var.f;
        u2b0 u2b0Var = nd50Var.e;
        bn40.f(musicTrack.l ? "audio.restore" : lhg.a(i, "audio.add request success with result: "));
        nd50Var.g.remove(musicTrack.Fb());
        MusicTrack Ab = musicTrack.Ab();
        musicTrack.U = true;
        musicTrack.l = false;
        if (musicTrack.equals(u2b0Var.b())) {
            MusicTrack b = u2b0Var.b();
            b.c = b25Var.c();
            b.b = i;
        }
        musicTrack.c = b25Var.c();
        musicTrack.b = i;
        k840.a.h.b(new fa50(Ab, musicTrack, false));
        nd50Var.y(new e8(nd50Var, musicTrack));
    }

    @Override // xsna.kd50
    public final void U(@NonNull zoi0 zoi0Var) {
        LinkedList linkedList = this.c;
        if (linkedList != null) {
            linkedList.remove(zoi0Var);
        }
    }

    @Override // xsna.i80
    @NonNull
    public final Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("target", this.d);
        return bundle;
    }

    @Override // xsna.kd50
    public final boolean i(@Nullable MusicTrack musicTrack) {
        if (!musicTrack.Tb()) {
            return ((this.f.a(musicTrack.c) && !musicTrack.l) || musicTrack.Vb() || musicTrack.Ub() || musicTrack.B() || musicTrack.Sb()) ? false : true;
        }
        if (musicTrack.U || musicTrack.B()) {
            return false;
        }
        return (musicTrack.Tb() || (musicTrack.Wb() && musicTrack.b > 0)) && !musicTrack.Rb();
    }

    @Override // xsna.kd50
    public final void o1(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        bn40.f("musicTrack: ", musicTrack, ", refer.source: ", MusicPlaybackLaunchContext.Mb(musicPlaybackLaunchContext));
        String Fb = musicTrack.Fb();
        HashMap hashMap = this.g;
        if (hashMap.containsKey(Fb)) {
            return;
        }
        boolean h = jnj.h(musicTrack.V);
        hashMap.put(musicTrack.Fb(), musicTrack.l ? h ? new jx2(yfb.x(new qxi().g(musicTrack.b, musicTrack.c, musicPlaybackLaunchContext.t())), new pd50(this, musicTrack)).a() : new jx2(yfb.x(new ix4().k(musicTrack.b, musicTrack.c)), new od50(this, musicTrack)).a() : h ? new jx2(yfb.x(new qxi().c(musicTrack.b, musicTrack.c, musicPlaybackLaunchContext.t())), new rd50(this, musicTrack)).a() : new jx2(yfb.x(new ix4().y(musicTrack.b, musicTrack.c, musicPlaybackLaunchContext.t(), musicTrack.r, musicTrack.y)), new qd50(this, musicTrack)).a());
    }

    @Override // xsna.i80
    public final void release() {
        this.h.dispose();
    }

    @Override // xsna.i80
    public final void u(@NonNull Bundle bundle) {
        this.d = (MusicTrack) bundle.getParcelable("target");
    }
}
