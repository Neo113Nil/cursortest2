package xsna;

import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.pullfromtopofrecycler.coordinator.PullFromTopLinearLayout;
import xsna.cse;

/* compiled from: RxExt.kt */
/* loaded from: classes16.dex */
public final class ese implements izs {
    public static final ese c = new ese(0);
    public static final ese d = new ese(1);
    public static final ese e = new ese(2);
    public final /* synthetic */ int b;

    public /* synthetic */ ese(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (obj != null) {
                    return (cse.a.C2680a) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.vk.clips.playlists.ClipsPlaylistsEventsSource.ClipsPlaylistEvent.ClipsAdded");
            case 1:
                return Boolean.valueOf(obj instanceof PullFromTopLinearLayout);
            default:
                return Boolean.valueOf(obj instanceof AttachWall);
        }
    }
}
