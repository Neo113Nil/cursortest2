package xsna;

import com.vk.dto.music.MusicTrack;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.ok.android.utils.Logger;

/* compiled from: PromoTrackControllerImpl.kt */
/* loaded from: classes3.dex */
public final class e6e0 implements d6e0, w8i {
    public final io.reactivex.rxjava3.disposables.g b = new io.reactivex.rxjava3.disposables.g();
    public final bpn0 c = new bpn0(new lo10(this, 25));

    /* compiled from: PromoTrackControllerImpl.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    @Override // xsna.d6e0
    public final void a(MusicTrack musicTrack) {
        Integer valueOf = musicTrack != null ? Integer.valueOf(musicTrack.N) : null;
        if (valueOf == null || valueOf.intValue() <= 0) {
            return;
        }
        io.reactivex.rxjava3.disposables.g gVar = this.b;
        if (hg1.d(gVar.a()) || ((com.vk.music.pref.a) this.c.getValue()).r0().contains(Long.valueOf(valueOf.intValue()))) {
            return;
        }
        ix4 ix4Var = k840.b;
        int intValue = valueOf.intValue();
        ix4Var.getClass();
        tfx tfxVar = new tfx("audio.getSpecialProject", new gr(3), new dn(4));
        tfx.l(tfxVar, "special_project_id", intValue, 0, 0, 12);
        gVar.b(new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.y0(yfb.x(tfxVar), null, null, 3), new bi3(this, 5)).subscribe(new ubq(new d0w(valueOf, 21), 27), new jw80(new a(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 9)));
    }
}
