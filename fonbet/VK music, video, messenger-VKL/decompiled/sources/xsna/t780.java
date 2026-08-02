package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.ArrayList;
import kotlin.collections.EmptyList;

/* compiled from: OnMediaAudioPlayerDelegate.kt */
/* loaded from: classes4.dex */
public final class t780 {
    public final osj0 a;
    public final boolean b;
    public final cs4 c;
    public int d;
    public long e;
    public Object f = EmptyList.b;
    public l880 g;
    public String h;

    public t780(osj0 osj0Var, boolean z, cs4 cs4Var) {
        this.a = osj0Var;
        this.b = z;
        this.c = cs4Var;
    }

    public final void a(v780 v780Var) {
        Iterable iterable;
        if (v780Var instanceof j880) {
            iterable = ((j880) v780Var).j;
        } else if (v780Var instanceof x880) {
            iterable = e43.m(((x880) v780Var).j);
        } else if (v780Var instanceof s880) {
            Playlist playlist = ((s880) v780Var).j;
            iterable = playlist != null ? playlist.y : null;
        } else {
            iterable = EmptyList.b;
        }
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!((MusicTrack) obj).B()) {
                arrayList.add(obj);
            }
        }
        this.f = arrayList;
    }

    public final void b() {
        this.d = 0;
        this.e = 0L;
    }

    public final void c() {
        if (this.b) {
            this.d++;
        }
        this.e = 0L;
    }
}
