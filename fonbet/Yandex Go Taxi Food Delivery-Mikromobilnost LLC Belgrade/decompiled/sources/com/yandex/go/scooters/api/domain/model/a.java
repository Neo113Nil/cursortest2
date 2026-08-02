package com.yandex.go.scooters.api.domain.model;

import com.yandex.go.scooters.api.domain.model.ScootersSlowdown;
import defpackage.jl40;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class a {
    public static ScootersSlowdown.Reason a(String str) {
        Object obj;
        Iterator<E> it = ScootersSlowdown.Reason.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((ScootersSlowdown.Reason) obj).getReasonName(), str)) {
                break;
            }
        }
        return (ScootersSlowdown.Reason) obj;
    }
}
