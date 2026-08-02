package xsna;

import android.content.Context;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.music.player.PlayerTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dz40;

/* compiled from: PodcastRenderProvider.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class wib0 extends FunctionReferenceImpl implements izs<sy40, dz40.n.c> {
    @Override // xsna.izs
    public final dz40.n.c invoke(sy40 sy40Var) {
        sy40 sy40Var2 = sy40Var;
        ((djb0) this.receiver).getClass();
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
            String obj = ucp.i(drm0.p0(sb.toString()).toString()).toString();
            MusicTrack musicTrack2 = playerTrack.b;
            Episode episode = musicTrack2.w;
            long j = episode != null ? episode.d : 0L;
            String str5 = null;
            if (j > 0) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                str5 = pq3.c(context, musicTrack2.f * 1000, j).toString();
            } else {
                if (musicTrack2.z > 0) {
                    str5 = pvo0.j(((int) r10) * 1000, false, false);
                }
            }
            arrayList.add(new dz40.o.c(str, Jb, str2, obj, str5, playerTrack.b.Lb()));
        }
        return new dz40.n.c(arrayList, sy40Var2.g);
    }
}
