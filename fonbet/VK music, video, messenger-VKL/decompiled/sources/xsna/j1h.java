package xsna;

import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.documents.api.di.DocumentsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class j1h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ j1h(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((DocumentsComponent) this.c.mo408a(fpf0.a(DocumentsComponent.class))).F7();
            default:
                return (ClipsPlaylistsComponent) this.c.mo408a(fpf0.a(ClipsPlaylistsComponent.class));
        }
    }
}
