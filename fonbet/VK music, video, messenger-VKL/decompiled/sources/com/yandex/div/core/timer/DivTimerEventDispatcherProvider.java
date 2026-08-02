package com.yandex.div.core.timer;

import com.yandex.div.DivDataTag;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.j3;
import com.yandex.div2.xc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.c5g;

/* compiled from: DivTimerEventDispatcherProvider.kt */
/* loaded from: classes7.dex */
public final class DivTimerEventDispatcherProvider {
    private final Map<String, DivTimerEventDispatcher> controllers = Collections.synchronizedMap(new LinkedHashMap());
    private final DivActionBinder divActionBinder;
    private final ErrorCollectors errorCollectors;

    public DivTimerEventDispatcherProvider(DivActionBinder divActionBinder, ErrorCollectors errorCollectors) {
        this.divActionBinder = divActionBinder;
        this.errorCollectors = errorCollectors;
    }

    private final void invalidateTimersSet(DivTimerEventDispatcher divTimerEventDispatcher, List<xc> list, ErrorCollector errorCollector, ExpressionResolver expressionResolver) {
        List<xc> list2 = list;
        for (xc xcVar : list2) {
            if (divTimerEventDispatcher.getTimerController(xcVar.c) == null) {
                divTimerEventDispatcher.addTimerController(toTimerController(xcVar, errorCollector, expressionResolver));
            }
        }
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((xc) it.next()).c);
        }
        divTimerEventDispatcher.setActiveTimerIds(arrayList);
    }

    private final TimerController toTimerController(xc xcVar, ErrorCollector errorCollector, ExpressionResolver expressionResolver) {
        return new TimerController(xcVar, this.divActionBinder, errorCollector, expressionResolver);
    }

    public final DivTimerEventDispatcher getOrCreate$div_release(DivDataTag divDataTag, j3 j3Var, ExpressionResolver expressionResolver) {
        List<xc> list = j3Var.d;
        if (list == null) {
            return null;
        }
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(divDataTag, j3Var);
        Map<String, DivTimerEventDispatcher> map = this.controllers;
        String id = divDataTag.getId();
        DivTimerEventDispatcher divTimerEventDispatcher = map.get(id);
        if (divTimerEventDispatcher == null) {
            divTimerEventDispatcher = new DivTimerEventDispatcher(orCreate);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                divTimerEventDispatcher.addTimerController(toTimerController((xc) it.next(), orCreate, expressionResolver));
            }
            map.put(id, divTimerEventDispatcher);
        }
        DivTimerEventDispatcher divTimerEventDispatcher2 = divTimerEventDispatcher;
        invalidateTimersSet(divTimerEventDispatcher2, list, orCreate, expressionResolver);
        return divTimerEventDispatcher2;
    }
}
