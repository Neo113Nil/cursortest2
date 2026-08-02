package xsna;

import com.vk.dto.music.Playlist;
import java.util.ArrayList;

/* compiled from: PagedTracksData.kt */
/* loaded from: classes4.dex */
public final class ta90 {
    public final int a;
    public final int b;
    public final int c;
    public final Playlist d;
    public final ArrayList e;

    public ta90(int i, int i2, int i3, Playlist playlist, ArrayList arrayList) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = playlist;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta90)) {
            return false;
        }
        ta90 ta90Var = (ta90) obj;
        return this.a == ta90Var.a && this.b == ta90Var.b && this.c == ta90Var.c && epx.f(this.d, ta90Var.d) && this.e.equals(ta90Var.e);
    }

    public final int hashCode() {
        int a = shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        Playlist playlist = this.d;
        return this.e.hashCode() + ((a + (playlist == null ? 0 : playlist.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagedTracksData(offset=");
        sb.append(this.a);
        sb.append(", nextOffset=");
        sb.append(this.b);
        sb.append(", totalCount=");
        sb.append(this.c);
        sb.append(", playlist=");
        sb.append(this.d);
        sb.append(", tracks=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
    }
}
