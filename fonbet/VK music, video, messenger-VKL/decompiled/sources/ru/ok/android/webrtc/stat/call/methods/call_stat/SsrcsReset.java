package ru.ok.android.webrtc.stat.call.methods.call_stat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.webrtc.stat.rtc.Ssrc;
import xsna.c5g;
import xsna.epx;
import xsna.j5g;

/* loaded from: classes9.dex */
public final class SsrcsReset {
    public Set a = EmptySet.b;

    public final boolean shouldReset(List<? extends Ssrc> list) {
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Ssrc) it.next()).ssrc));
        }
        Set S0 = j5g.S0(arrayList);
        boolean z = !epx.f(S0, this.a);
        this.a = S0;
        return z;
    }
}
