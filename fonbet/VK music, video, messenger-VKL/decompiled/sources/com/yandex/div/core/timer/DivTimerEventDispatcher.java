package com.yandex.div.core.timer;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.s3q0;
import xsna.zr;

/* compiled from: DivTimerEventDispatcher.kt */
/* loaded from: classes7.dex */
public final class DivTimerEventDispatcher {
    private final ErrorCollector errorCollector;
    private final Map<String, TimerController> timerControllers = new LinkedHashMap();
    private final Set<String> activeTimerIds = new LinkedHashSet();

    public DivTimerEventDispatcher(ErrorCollector errorCollector) {
        this.errorCollector = errorCollector;
    }

    public final void addTimerController(TimerController timerController) {
        String str = timerController.getDivTimer().c;
        if (this.timerControllers.containsKey(str)) {
            return;
        }
        this.timerControllers.put(str, timerController);
    }

    public final void changeState(String str, String str2) {
        s3q0 s3q0Var;
        TimerController timerController = getTimerController(str);
        if (timerController != null) {
            timerController.applyCommand(str2);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            this.errorCollector.logError(new IllegalArgumentException(zr.a("Timer with id '", str, "' does not exist!")));
        }
    }

    public final TimerController getTimerController(String str) {
        if (this.activeTimerIds.contains(str)) {
            return this.timerControllers.get(str);
        }
        return null;
    }

    public final void onAttach(Div2View div2View) {
        Iterator<T> it = this.activeTimerIds.iterator();
        while (it.hasNext()) {
            TimerController timerController = this.timerControllers.get((String) it.next());
            if (timerController != null && !timerController.isAttachedToView(div2View)) {
                timerController.onAttach(div2View);
            }
        }
    }

    public final void onDetach(Div2View div2View) {
        Iterator<T> it = this.timerControllers.values().iterator();
        while (it.hasNext()) {
            ((TimerController) it.next()).onDetach(div2View);
        }
    }

    public final void setActiveTimerIds(List<String> list) {
        Map<String, TimerController> map = this.timerControllers;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, TimerController> entry : map.entrySet()) {
            if (!list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((TimerController) it.next()).reset();
        }
        this.activeTimerIds.clear();
        this.activeTimerIds.addAll(list);
    }
}
