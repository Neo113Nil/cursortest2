package xsna;

import android.content.Context;
import com.vk.clips.sdk.models.SdkTrendingHashtag;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.d4e;
import xsna.naf;
import xsna.t5e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cyc implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cyc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        int i = this.b;
        Long l = null;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        int i2 = 0;
        switch (i) {
            case 0:
                Context context = (Context) obj5;
                int i3 = ClipFeedListFragment.a2;
                new naf.a(context, ((SdkTrendingHashtag) obj4).b, (String) obj, new dyc((ClipFeedListFragment) obj3, context, (SdkVideoFile) obj2, i2)).I0(null);
                return s3q0.a;
            case 1:
                h5e h5eVar = (h5e) obj5;
                FavoriteFolderId favoriteFolderId = (FavoriteFolderId) obj4;
                List list = (List) obj3;
                String str2 = (String) obj2;
                e4e e4eVar = h5eVar.c;
                e4eVar.g(new d4e.a.f((u2e) obj));
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((VideoFile) it.next()).r1());
                }
                e4eVar.g(new d4e.a.c(favoriteFolderId, arrayList));
                h5eVar.b.d(new t5e.f(str2, list.size()), null);
                if (favoriteFolderId instanceof FavoriteFolderId.Alias.AllClips) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        h5e.j((VideoFile) it2.next(), false);
                    }
                }
                return s3q0.a;
            default:
                MusicTrack musicTrack = (MusicTrack) obj5;
                com.vk.music.track.a aVar = (com.vk.music.track.a) obj3;
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = (MusicPlaybackLaunchContext) obj2;
                UserId c = o25.a().c();
                int parseInt = Integer.parseInt((String) obj);
                musicTrack.c = c;
                musicTrack.b = parseInt;
                boolean z = parseInt == Integer.parseInt((String) j5g.Y((ArrayList) obj4));
                if (!musicTrack.l) {
                    String str3 = musicTrack.Z;
                    if (str3 != null && (str = (String) j5g.a0(drm0.b0(str3, new char[]{'_'}, 0, 6))) != null) {
                        l = arm0.n(str);
                    }
                    if (l != null) {
                        musicTrack.c = new UserId(l.longValue());
                    }
                }
                return aVar.e1(musicTrack, musicPlaybackLaunchContext, z);
        }
    }
}
