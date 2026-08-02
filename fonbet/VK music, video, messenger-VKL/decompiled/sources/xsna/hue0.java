package xsna;

import com.vk.dto.music.Thumb;
import com.vk.music.player.PlayerTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dz40;

/* compiled from: RadioRenderProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class hue0 extends FunctionReferenceImpl implements izs<sy40, dz40.n.d> {
    @Override // xsna.izs
    public final dz40.n.d invoke(sy40 sy40Var) {
        sy40 sy40Var2 = sy40Var;
        ((jue0) this.receiver).getClass();
        List<PlayerTrack> list = sy40Var2.f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (PlayerTrack playerTrack : list) {
            String str = playerTrack.f;
            Thumb Jb = playerTrack.b.Jb();
            if (Jb == null) {
                Jb = lso0.a;
            }
            String str2 = playerTrack.b.d;
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new dz40.o.d(str, Jb, str2));
        }
        return new dz40.n.d(arrayList, sy40Var2.g);
    }
}
