package xsna;

import com.vk.dto.music.MusicTrack;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.k840;

/* compiled from: TrackDownloadingStateListenerImpl.kt */
/* loaded from: classes3.dex */
public final class ifp0 implements jb50 {
    public final hfp0 a;

    /* compiled from: TrackDownloadingStateListenerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<yj40, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(yj40 yj40Var) {
            ((ifp0) this.receiver).getClass();
            i0q0.f(new wmd0(yj40Var, 13));
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public ifp0(MusicTrack musicTrack, gco gcoVar) {
        a aVar = new a(1, this, ifp0.class, "post", "post(Lcom/vk/music/events/MusicEvent;)V", 0);
        s750 s750Var = k840.a.e;
        hfp0 hfp0Var = new hfp0(musicTrack, gcoVar, aVar, s750Var == null ? null : s750Var);
        this.a = hfp0Var;
        MusicTrack b = kq40.b(musicTrack);
        hfp0Var.b.invoke(new ib50(hfp0Var.d, b));
        hfp0Var.d = b;
    }

    @Override // xsna.jb50
    public final synchronized void a(float f) {
        hfp0.b(this.a, f);
    }

    @Override // xsna.jb50
    public final synchronized void b() {
        hfp0.c(this.a, null, 3);
    }

    @Override // xsna.jb50
    public final synchronized void c() {
        hfp0.a(this.a);
    }

    @Override // xsna.jb50
    public final synchronized void e(Exception exc) {
        hfp0.c(this.a, exc, 2);
    }

    @Override // xsna.jb50
    public final void d() {
    }
}
