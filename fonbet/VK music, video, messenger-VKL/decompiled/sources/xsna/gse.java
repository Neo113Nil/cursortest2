package xsna;

import com.vk.pullfromtopofrecycler.coordinator.PullFromTopLinearLayout;
import xsna.cse;

/* compiled from: RxExt.kt */
/* loaded from: classes16.dex */
public final class gse implements izs {
    public static final gse c = new gse(0);
    public static final gse d = new gse(1);
    public static final gse e = new gse(2);
    public final /* synthetic */ int b;

    public /* synthetic */ gse(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (obj != null) {
                    return (cse.a.b) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.vk.clips.playlists.ClipsPlaylistsEventsSource.ClipsPlaylistEvent.ClipsRemoved");
            case 1:
                return Boolean.valueOf(obj instanceof fc80);
            default:
                return Boolean.valueOf(obj instanceof PullFromTopLinearLayout);
        }
    }
}
