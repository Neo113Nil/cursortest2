package xsna;

import com.vk.dto.music.Thumb;
import com.vk.music.player.PlayerTrack;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gfp0;

/* compiled from: RadioRenderProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class fue0 extends FunctionReferenceImpl implements izs<sy40, gfp0.d> {
    @Override // xsna.izs
    public final gfp0.d invoke(sy40 sy40Var) {
        ((jue0) this.receiver).getClass();
        PlayerTrack playerTrack = sy40Var.d;
        if (playerTrack == null) {
            return gfp0.d.d;
        }
        String str = playerTrack.f;
        Thumb Jb = playerTrack.b.Jb();
        if (Jb == null) {
            Jb = lso0.a;
        }
        String str2 = playerTrack.b.d;
        if (str2 == null) {
            str2 = "";
        }
        return new gfp0.d(str, Jb, str2);
    }
}
