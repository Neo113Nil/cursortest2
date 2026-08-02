package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TrackDownloadStateHandler.kt */
/* loaded from: classes3.dex */
public final class hfp0 {
    public final gco a;
    public final FunctionReferenceImpl b;
    public final u750 c;
    public MusicTrack d;

    /* JADX WARN: Multi-variable type inference failed */
    public hfp0(MusicTrack musicTrack, gco gcoVar, izs<? super yj40, s3q0> izsVar, u750 u750Var) {
        this.a = gcoVar;
        this.b = (FunctionReferenceImpl) izsVar;
        this.c = u750Var;
        this.d = musicTrack;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public static void a(hfp0 hfp0Var) {
        MusicTrack zb = MusicTrack.zb(hfp0Var.d, 0, null, 0, 0, null, false, null, DownloadingState.Downloaded.b, false, false, null, null, null, -1, 1048571);
        hfp0Var.b.invoke(new ib50(hfp0Var.d, zb));
        hfp0Var.d = zb;
        hfp0Var.c.Q0(zb.Fb());
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public static void b(hfp0 hfp0Var, float f) {
        MusicTrack zb = MusicTrack.zb(hfp0Var.d, 0, null, 0, 0, null, false, null, new DownloadingState.Downloading(f), false, false, null, null, null, -1, 1048571);
        hfp0Var.b.invoke(new ib50(hfp0Var.d, zb));
        hfp0Var.d = zb;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public static void c(hfp0 hfp0Var, Throwable th, int i) {
        if ((i & 1) != 0) {
            th = null;
        }
        MusicTrack a = kq40.a(hfp0Var.d);
        hfp0Var.b.invoke(new ib50(hfp0Var.d, a));
        hfp0Var.d = a;
        if (th != null) {
            hfp0Var.a.a(a, th);
            u750 u750Var = hfp0Var.c;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            u750Var.t0(message);
        }
    }
}
