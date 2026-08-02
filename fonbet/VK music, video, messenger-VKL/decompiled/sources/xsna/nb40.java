package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.music.MusicTrack;
import com.vk.lists.ListDataSet;
import com.vk.music.player.PlayerTrack;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MusicBigPlayerDiffCallback.kt */
/* loaded from: classes3.dex */
public final class nb40 extends m.b {
    public final List<whp0> b;
    public final ArrayList c;

    public nb40(ListDataSet.ArrayListImpl arrayListImpl, ArrayList arrayList) {
        this.b = arrayListImpl;
        this.c = arrayList;
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areContentsTheSame(int i, int i2) {
        PlayerTrack playerTrack;
        PlayerTrack playerTrack2;
        whp0 whp0Var = this.b.get(i);
        whp0 whp0Var2 = (whp0) this.c.get(i2);
        MusicTrack musicTrack = null;
        xhp0 xhp0Var = whp0Var instanceof xhp0 ? (xhp0) whp0Var : null;
        MusicTrack musicTrack2 = (xhp0Var == null || (playerTrack2 = xhp0Var.a) == null) ? null : playerTrack2.b;
        xhp0 xhp0Var2 = whp0Var2 instanceof xhp0 ? (xhp0) whp0Var2 : null;
        if (xhp0Var2 != null && (playerTrack = xhp0Var2.a) != null) {
            musicTrack = playerTrack.b;
        }
        return epx.f(musicTrack2, musicTrack);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final boolean areItemsTheSame(int i, int i2) {
        PlayerTrack playerTrack;
        PlayerTrack playerTrack2;
        PlayerTrack playerTrack3;
        MusicTrack musicTrack;
        PlayerTrack playerTrack4;
        MusicTrack musicTrack2;
        whp0 whp0Var = this.b.get(i);
        whp0 whp0Var2 = (whp0) this.c.get(i2);
        if (whp0Var == whp0Var2) {
            return true;
        }
        String str = null;
        xhp0 xhp0Var = whp0Var instanceof xhp0 ? (xhp0) whp0Var : null;
        xhp0 xhp0Var2 = whp0Var2 instanceof xhp0 ? (xhp0) whp0Var2 : null;
        String Fb = (xhp0Var == null || (playerTrack4 = xhp0Var.a) == null || (musicTrack2 = playerTrack4.b) == null) ? null : musicTrack2.Fb();
        String Fb2 = (xhp0Var2 == null || (playerTrack3 = xhp0Var2.a) == null || (musicTrack = playerTrack3.b) == null) ? null : musicTrack.Fb();
        String str2 = (xhp0Var == null || (playerTrack2 = xhp0Var.a) == null) ? null : playerTrack2.f;
        if (xhp0Var2 != null && (playerTrack = xhp0Var2.a) != null) {
            str = playerTrack.f;
        }
        return epx.f(str2, str) && epx.f(Fb, Fb2);
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getNewListSize() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.m.b
    public final int getOldListSize() {
        return this.b.size();
    }
}
