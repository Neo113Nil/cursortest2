package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import java.util.List;
import java.util.Set;
import xsna.cse;
import xsna.kqe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class eue implements izs {
    public final /* synthetic */ List b;
    public final /* synthetic */ com.vk.clips.playlists.di.a c;
    public final /* synthetic */ ClipsPlaylist d;
    public final /* synthetic */ Set e;

    public /* synthetic */ eue(List list, com.vk.clips.playlists.di.a aVar, ClipsPlaylist clipsPlaylist, Set set) {
        this.b = list;
        this.c = aVar;
        this.d = clipsPlaylist;
        this.e = set;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ClipsPlaylist clipsPlaylist = (ClipsPlaylist) obj;
        ad0.D(clipsPlaylist.f, clipsPlaylist.b, this.b);
        io.reactivex.rxjava3.subjects.f<kqe> fVar = iqe.a;
        iqe.a.onNext(new kqe.a(this.d.f));
        this.c.a.a(new cse.a.b(clipsPlaylist, this.e));
        return s3q0.a;
    }
}
