package com.yandex.div.core.view2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import xsna.apn;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivVisibilityTokenHolder.kt */
/* loaded from: classes7.dex */
public final class DivVisibilityTokenHolder {
    private final ConcurrentLinkedQueue<Map<CompositeLogId, apn>> tokens = new ConcurrentLinkedQueue<>();

    public final boolean add(Map<CompositeLogId, apn> map) {
        return this.tokens.add(map);
    }

    public final CompositeLogId getLogId(CompositeLogId compositeLogId) {
        Object obj;
        Set keySet;
        Iterator<T> it = this.tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Map) obj).containsKey(compositeLogId)) {
                break;
            }
        }
        Map map = (Map) obj;
        if (map != null && (keySet = map.keySet()) != null) {
            CompositeLogId[] compositeLogIdArr = (CompositeLogId[]) keySet.toArray(new CompositeLogId[0]);
            if (compositeLogIdArr != null) {
                for (CompositeLogId compositeLogId2 : compositeLogIdArr) {
                    if (epx.f(compositeLogId2, compositeLogId)) {
                        return compositeLogId2;
                    }
                }
            }
        }
        return null;
    }

    public final void remove(CompositeLogId compositeLogId, izs<? super Map<CompositeLogId, ? extends apn>, s3q0> izsVar) {
        Object obj;
        Iterator<T> it = this.tokens.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map) obj).remove(compositeLogId) != null) {
                    break;
                }
            }
        }
        Map map = (Map) obj;
        if (map != null && map.isEmpty()) {
            izsVar.invoke(map);
            this.tokens.remove(map);
        }
    }
}
