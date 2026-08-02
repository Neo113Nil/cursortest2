package xsna;

import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.music.player.PlayerTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dz40;

/* compiled from: AudioBookRenderProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj4 extends FunctionReferenceImpl implements izs<sy40, dz40.n.a> {
    @Override // xsna.izs
    public final dz40.n.a invoke(sy40 sy40Var) {
        sy40 sy40Var2 = sy40Var;
        ((oj4) this.receiver).getClass();
        List<PlayerTrack> list = sy40Var2.f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (PlayerTrack playerTrack : list) {
            String str = playerTrack.f;
            Thumb Jb = playerTrack.b.Jb();
            if (Jb == null) {
                Jb = lso0.a;
            }
            MusicTrack musicTrack = playerTrack.b;
            String str2 = musicTrack.d;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            ucp ucpVar = ucp.a;
            StringBuilder sb = new StringBuilder();
            List<Artist> list2 = musicTrack.t;
            if (list2 != null) {
                str3 = s490.i(list2);
            } else {
                String str4 = musicTrack.h;
                if (str4 != null) {
                    str3 = str4;
                }
            }
            sb.append(str3);
            sb.append(' ');
            sb.append(s490.c(musicTrack.u));
            arrayList.add(new dz40.o.a(str, Jb, str2, ucp.i(drm0.p0(sb.toString()).toString()).toString()));
        }
        return new dz40.n.a(arrayList, sy40Var2.g);
    }
}
