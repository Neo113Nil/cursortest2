package xsna;

import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayerTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dz40;
import xsna.fm50;

/* compiled from: RenderProvider.kt */
/* loaded from: classes3.dex */
public abstract class oyf0<T extends fm50<sy40>> {
    public static dz40.g a(sy40 sy40Var) {
        List<PlayerTrack> list = sy40Var.f;
        List<PlayerTrack> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlayerTrack) it.next()).b.Kb(1200));
        }
        Iterator<PlayerTrack> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            PlayerTrack next = it2.next();
            PlayerTrack playerTrack = sy40Var.d;
            if (playerTrack != null && epx.f(next.f, playerTrack.f)) {
                break;
            }
            i++;
        }
        if (i < 0) {
            i = 0;
        }
        return new dz40.g(arrayList, i, sy40Var.j == LoopMode.LIST);
    }
}
