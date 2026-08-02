package xsna;

import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.music.reactions.Reaction;
import com.vk.music.player.PlayerTrack;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dz40;

/* compiled from: MusicRenderProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class f450 extends FunctionReferenceImpl implements izs<sy40, dz40.n.b> {
    @Override // xsna.izs
    public final dz40.n.b invoke(sy40 sy40Var) {
        boolean z;
        MusicTrack musicTrack;
        String str;
        sy40 sy40Var2 = sy40Var;
        ((m450) this.receiver).getClass();
        List<PlayerTrack> list = sy40Var2.f;
        boolean z2 = sy40Var2.r;
        List<PlayerTrack> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (PlayerTrack playerTrack : list2) {
            Map<MusicTrack, Reaction> map = sy40Var2.A;
            MusicTrack musicTrack2 = playerTrack.b;
            String str2 = playerTrack.f;
            Thumb Jb = musicTrack2.Jb();
            if (Jb == null) {
                Jb = lso0.a;
            }
            String b = m450.b(musicTrack2);
            ucp ucpVar = ucp.a;
            StringBuilder sb = new StringBuilder();
            List<Artist> list3 = musicTrack2.t;
            if (list3 != null) {
                str = s490.i(list3);
            } else {
                str = musicTrack2.h;
                if (str == null) {
                    str = "";
                }
            }
            sb.append(str);
            sb.append(' ');
            sb.append(s490.c(musicTrack2.u));
            arrayList.add(new dz40.o.b(str2, Jb, b, ucp.i(drm0.p0(sb.toString()).toString()).toString(), musicTrack2.Lb(), map.get(playerTrack.b)));
        }
        List<String> list4 = sy40Var2.g;
        if (!z2) {
            PlayerTrack playerTrack2 = sy40Var2.d;
            jnj jnjVar = (playerTrack2 == null || (musicTrack = playerTrack2.b) == null) ? null : new jnj(musicTrack.V);
            if ((jnjVar == null || !jnj.c(jnjVar.a)) && (jnjVar == null || !jnj.e(jnjVar.a))) {
                z = true;
                return new dz40.n.b(arrayList, list4, new dz40.n.e(z, z2));
            }
        }
        z = false;
        return new dz40.n.b(arrayList, list4, new dz40.n.e(z, z2));
    }
}
