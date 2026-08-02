package xsna;

import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ThumbListBuildStrategy.kt */
/* loaded from: classes2.dex */
public interface mso0 {

    /* compiled from: ThumbListBuildStrategy.kt */
    public static final class a implements mso0 {
        public static final a a = new a();

        @Override // xsna.mso0
        public final List<Thumb> a(AttachPlaylist attachPlaylist) {
            Thumb thumb = attachPlaylist.b.m;
            return thumb != null ? Collections.singletonList(thumb) : EmptyList.b;
        }
    }

    /* compiled from: ThumbListBuildStrategy.kt */
    public static final class b implements mso0 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // xsna.mso0
        public final List<Thumb> a(AttachPlaylist attachPlaylist) {
            Playlist playlist = attachPlaylist.b;
            Thumb thumb = playlist.m;
            return thumb != null ? Collections.singletonList(thumb) : rli0.A(rli0.y(rli0.m(new ulp0(new i5g(playlist.y), new hxm0(3))), this.a));
        }
    }

    List<Thumb> a(AttachPlaylist attachPlaylist);
}
