package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.tlo0;
import xsna.vre;
import xsna.zzc;

/* compiled from: ClipsPlaylistUiStateMapper.kt */
/* loaded from: classes16.dex */
public final class wre implements izs<vre.b, wow<zzc>> {
    public final /* synthetic */ xre b;

    public wre(xre xreVar) {
        this.b = xreVar;
    }

    @Override // xsna.izs
    public final wow<zzc> invoke(vre.b bVar) {
        String a;
        zzc.a c4211a;
        List<VideoFile> list = bVar.f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (VideoFile videoFile : list) {
            VideoRestriction O = videoFile.O();
            String a1 = videoFile.a1();
            if (O != null) {
                c4211a = new zzc.a.b(new zzc.b.C4212b(videoFile.getTitle()), oq.d(tlo0.Companion, O.c.replace('\n', ' ')), O.g);
            } else {
                String j1 = videoFile.j1();
                zzc.b c4212b = (j1 == null || j1.length() == 0) ? zzc.b.a.a : new zzc.b.C4212b(n420.b(j1));
                Image image = videoFile.getImage();
                xre xreVar = this.b;
                boolean d = ((qwe) xreVar.b.getValue()).d(videoFile);
                int L8 = videoFile.L8();
                if (((mhd) xreVar.c.getValue()).h()) {
                    long j = L8;
                    Pair c = xpm0.c(j);
                    double doubleValue = ((Number) c.d()).doubleValue();
                    String str = (String) c.g();
                    if (doubleValue >= 100.0d || (j < 1000000 && doubleValue >= 10.0d)) {
                        doubleValue = Math.floor(doubleValue);
                    }
                    a = xpm0.a.format(doubleValue) + str;
                } else {
                    a = xpm0.a(L8);
                }
                tlo0.Companion.getClass();
                tlo0.e a2 = tlo0.a.a(R.plurals.clips_playlist_ui_views, L8, a);
                int l1 = videoFile.l1();
                c4211a = new zzc.a.C4211a(c4212b, image, a2, l1 > 0 ? tlo0.a.a(R.plurals.clips_playlist_ui_likes, l1, xpm0.a(l1)) : new tlo0.f(R.string.clips_playlist_ui_no_likes), d);
            }
            arrayList.add(new zzc(a1, c4211a));
        }
        return new wow<>(arrayList);
    }
}
