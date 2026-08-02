package com.ybsdk.core.stories;

import com.ybsdk.core.stories.StoriesComponentView;
import defpackage.a961;
import defpackage.asc;
import defpackage.jl40;
import defpackage.r501;
import defpackage.scc;
import defpackage.wrc;
import defpackage.zrc;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a implements asc {
    public final /* synthetic */ StoriesComponentView a;

    public a(StoriesComponentView storiesComponentView) {
        this.a = storiesComponentView;
    }

    @Override // defpackage.asc
    public final void p(zrc zrcVar) {
        Map map;
        StoriesComponentView.a aVar;
        Map map2;
        StoriesComponentView.a aVar2;
        StoriesComponentView.a aVar3;
        StoriesComponentView.a aVar4;
        Map map3;
        a961 a961Var;
        StoriesComponentView storiesComponentView = this.a;
        map = storiesComponentView.storiesLoadingStates;
        aVar = storiesComponentView.currentState;
        if (jl40.l(map.get(Integer.valueOf(aVar.a)), zrcVar)) {
            return;
        }
        map2 = storiesComponentView.storiesLoadingStates;
        aVar2 = storiesComponentView.currentState;
        map2.put(Integer.valueOf(aVar2.a), zrcVar);
        wrc wrcVar = zrcVar instanceof wrc ? (wrc) zrcVar : null;
        if (wrcVar != null) {
            aVar3 = storiesComponentView.currentState;
            int i = aVar3.a;
            aVar4 = storiesComponentView.currentState;
            if (i == scc.f(aVar4.b)) {
                map3 = storiesComponentView.storiesLoadingStates;
                Collection values = map3.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (!(((zrc) it.next()) instanceof wrc)) {
                            break;
                        }
                    }
                }
                a961Var = storiesComponentView.binding;
                a961Var.h.render(r501.a(wrcVar.a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
            }
        }
        storiesComponentView.setStory();
    }
}
