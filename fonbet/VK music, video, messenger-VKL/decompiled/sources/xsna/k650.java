package xsna;

import com.vk.dto.music.MusicTrack;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MusicSnippetsFeature.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class k650 extends FunctionReferenceImpl implements izs<yj40, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(yj40 yj40Var) {
        yj40 yj40Var2 = yj40Var;
        l650 l650Var = (l650) this.receiver;
        if (yj40Var2 instanceof fa50) {
            tx4 U = l650Var.U();
            fa50 fa50Var = (fa50) yj40Var2;
            MusicTrack musicTrack = fa50Var.b;
            MusicTrack musicTrack2 = fa50Var.a;
            U.a().b(musicTrack, musicTrack2, new sx4(U, musicTrack, musicTrack2, 0));
        } else if (yj40Var2 instanceof yd50) {
            tx4 U2 = l650Var.U();
            yd50 yd50Var = (yd50) yj40Var2;
            MusicTrack musicTrack3 = yd50Var.c;
            MusicTrack musicTrack4 = yd50Var.a;
            U2.a().b(musicTrack3, musicTrack4, new sx4(U2, musicTrack3, musicTrack4, 0));
        } else {
            l650Var.getClass();
        }
        return s3q0.a;
    }
}
