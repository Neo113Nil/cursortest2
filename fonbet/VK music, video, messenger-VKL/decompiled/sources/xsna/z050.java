package xsna;

import android.content.Context;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.y050;

/* compiled from: MusicPlaylistLauncherImpl.kt */
/* loaded from: classes.dex */
public final class z050 implements y050 {
    public static void b(DisplayMusicPlaylistFragment.a aVar, y050.b bVar) {
        String n = bVar.n();
        if (n != null) {
            aVar.B(n);
        }
        String b = bVar.b();
        if (b != null) {
            aVar.y(b);
        }
        SearchStatsLoggingInfo a = bVar.a();
        if (a != null) {
            aVar.C(a);
        }
        aVar.z(bVar.c());
    }

    @Override // xsna.y050
    public final void a(Context context, y050.b bVar) {
        if (bVar instanceof y050.b.a) {
            y050.b.a aVar = (y050.b.a) bVar;
            DisplayMusicPlaylistFragment.a aVar2 = new DisplayMusicPlaylistFragment.a(aVar.d());
            b(aVar2, aVar);
            aVar2.k(context);
            return;
        }
        if (!(bVar instanceof y050.b.C4065b)) {
            throw new NoWhenBranchMatchedException();
        }
        y050.b.C4065b c4065b = (y050.b.C4065b) bVar;
        DisplayMusicPlaylistFragment.a aVar3 = new DisplayMusicPlaylistFragment.a(c4065b.e(), c4065b.f(), c4065b.d());
        b(aVar3, c4065b);
        aVar3.k(context);
    }
}
