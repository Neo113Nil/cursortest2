package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class fwc implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializer.StreamParcelable d;

    public /* synthetic */ fwc(Object obj, Serializer.StreamParcelable streamParcelable, int i) {
        this.b = i;
        this.c = obj;
        this.d = streamParcelable;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((gwc) this.c).a((SdkVideoFile) this.d);
                break;
            case 1:
                vh40 vh40Var = (vh40) this.c;
                Playlist playlist = (Playlist) this.d;
                vh40Var.c.a(playlist);
                vh40Var.g.c(playlist.Ib());
                break;
            default:
                ((kr60) this.c).c(new yo60.h(new NewsfeedExternalAction.c.f0((Post) this.d)));
                break;
        }
    }
}
