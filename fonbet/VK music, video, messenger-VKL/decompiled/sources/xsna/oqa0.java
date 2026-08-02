package xsna;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: PixelsProcessing.java */
/* loaded from: classes8.dex */
public class oqa0 implements one.video.player.f {
    public final boolean a;

    @NonNull
    public final ArrayList b = new ArrayList();

    @NonNull
    public final a c = new a();

    @NonNull
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final ArrayDeque<sht0> f = new ArrayDeque<>(4);

    /* compiled from: PixelsProcessing.java */
    public class a extends LinkedHashMap<Uri, Map<Integer, List<zpa0>>> {
        public a() {
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<Uri, Map<Integer, List<zpa0>>> entry) {
            return size() > 4;
        }
    }

    public oqa0(boolean z) {
        this.a = z;
    }

    public final void C(@NonNull OneVideoPlayer oneVideoPlayer) {
        sht0 j = oneVideoPlayer.j();
        if (j != null) {
            Uri uri = j.b;
            this.d.add(uri);
            this.e.remove(uri);
            if (this.a) {
                this.f.add(j);
            }
        }
        E(7, oneVideoPlayer, j);
        E(6, oneVideoPlayer, j);
    }

    public final void E(int i, @NonNull OneVideoPlayer oneVideoPlayer, @Nullable sht0 sht0Var) {
        if (sht0Var == null) {
            return;
        }
        long currentPosition = oneVideoPlayer.getCurrentPosition();
        Map<Integer, List<zpa0>> orDefault = this.c.getOrDefault(sht0Var.b, Collections.EMPTY_MAP);
        List<zpa0> list = orDefault != null ? orDefault.get(Integer.valueOf(i)) : null;
        if (list != null) {
            for (zpa0 zpa0Var : list) {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    pqa0 pqa0Var = (pqa0) it.next();
                    if (pqa0Var.b(zpa0Var)) {
                        pqa0Var.a(zpa0Var, currentPosition);
                    }
                }
            }
        }
    }

    public final void F(@NonNull Collection<zpa0> collection, @NonNull Uri uri) {
        a aVar = this.c;
        Map<Integer, List<zpa0>> map = aVar.get(uri);
        if (map != null) {
            map.clear();
        }
        for (zpa0 zpa0Var : collection) {
            Map<Integer, List<zpa0>> map2 = aVar.get(uri);
            if (map2 == null) {
                map2 = new HashMap<>();
                aVar.put(uri, map2);
            }
            List<zpa0> list = map2.get(Integer.valueOf(zpa0Var.b));
            if (list == null) {
                list = new ArrayList<>();
                map2.put(Integer.valueOf(zpa0Var.b), list);
            }
            list.add(zpa0Var);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void a(@NonNull OneVideoPlayer.DiscontinuityReason discontinuityReason, @NonNull OneVideoPlayer oneVideoPlayer, @NonNull deb0 deb0Var, @NonNull deb0 deb0Var2) {
        boolean z = Math.abs(oneVideoPlayer.getDuration() - deb0Var2.b) < 1000;
        if (discontinuityReason != OneVideoPlayer.DiscontinuityReason.SEEK || z) {
            return;
        }
        E(7, oneVideoPlayer, oneVideoPlayer.j());
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void f(@NonNull OneVideoPlayer oneVideoPlayer) {
        sht0 pollFirst = this.f.pollFirst();
        if (pollFirst == null || !this.d.remove(pollFirst.b)) {
            return;
        }
        E(4, oneVideoPlayer, pollFirst);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void h(@NonNull OneVideoPlayer oneVideoPlayer) {
        E(3, oneVideoPlayer, oneVideoPlayer.j());
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void j(@NonNull OneVideoPlayer oneVideoPlayer) {
        C(oneVideoPlayer);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void q(@NonNull OneVideoPlaybackException oneVideoPlaybackException, @Nullable sht0 sht0Var, @NonNull OneVideoPlayer oneVideoPlayer) {
        E(4, oneVideoPlayer, sht0Var);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void r(@NonNull OneVideoPlayer oneVideoPlayer) {
        sht0 j = oneVideoPlayer.j();
        if (j == null || this.e.contains(j.b)) {
            return;
        }
        E(5, oneVideoPlayer, j);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void s(@NonNull OneVideoPlayer oneVideoPlayer) {
        sht0 j = oneVideoPlayer.j();
        E(0, oneVideoPlayer, j);
        if (j != null && this.e.contains(j.b) && oneVideoPlayer.f0()) {
            C(oneVideoPlayer);
        }
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void w(@NonNull BaseVideoPlayer baseVideoPlayer) {
        sht0 j = baseVideoPlayer.j();
        if (j != null) {
            this.e.add(j.b);
            sht0 pollFirst = this.f.pollFirst();
            if (this.a && pollFirst != null) {
                E(4, baseVideoPlayer, pollFirst);
            }
        }
        E(1, baseVideoPlayer, j);
    }

    @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
    public final void x(@NonNull OneVideoPlayer oneVideoPlayer) {
        E(2, oneVideoPlayer, oneVideoPlayer.j());
    }
}
