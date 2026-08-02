package xsna;

import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.search.integration.api.di.SearchComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class f7f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ f7f(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((CameraClipsComponent) this.c.a(fpf0.a(CameraClipsComponent.class))).c4();
            case 1:
                return ((SearchComponent) this.c.mo408a(fpf0.a(SearchComponent.class))).V3();
            default:
                return (ClipsPlaylistsComponent) this.c.mo408a(fpf0.a(ClipsPlaylistsComponent.class));
        }
    }
}
