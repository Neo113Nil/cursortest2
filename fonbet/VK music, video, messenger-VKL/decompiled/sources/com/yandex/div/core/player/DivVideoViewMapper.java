package com.yandex.div.core.player;

import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div2.rd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import xsna.epx;
import xsna.j5g;

/* compiled from: DivVideoViewMapper.kt */
/* loaded from: classes7.dex */
public final class DivVideoViewMapper {
    private final WeakHashMap<DivVideoView, rd> currentViews = new WeakHashMap<>();

    public final void addView(DivVideoView divVideoView, rd rdVar) {
        this.currentViews.put(divVideoView, rdVar);
    }

    public final DivPlayer getPlayer(rd rdVar) {
        Set<Map.Entry<DivVideoView, rd>> entrySet = this.currentViews.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (epx.f(entry.getValue(), rdVar) || epx.f(((rd) entry.getValue()).t, rdVar.t)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            DivPlayerView playerView = ((DivVideoView) ((Map.Entry) it.next()).getKey()).getPlayerView();
            DivPlayer attachedPlayer = playerView != null ? playerView.getAttachedPlayer() : null;
            if (attachedPlayer != null) {
                arrayList2.add(attachedPlayer);
            }
        }
        return (DivPlayer) j5g.a0(arrayList2);
    }
}
