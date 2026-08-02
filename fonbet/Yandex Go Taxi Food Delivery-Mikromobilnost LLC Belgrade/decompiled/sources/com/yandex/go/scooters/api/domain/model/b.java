package com.yandex.go.scooters.api.domain.model;

import com.yandex.go.scooters.api.domain.model.ScootersSlowdown;
import defpackage.jl40;
import defpackage.tse0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class b {
    public final List a;

    public /* synthetic */ b(List list) {
        this.a = list;
    }

    public static final boolean a(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((ScootersSlowdown) it.next()).b == ScootersSlowdown.Reason.RIDING_TOGETHER) {
                return true;
            }
        }
        return false;
    }

    public static String b(List list) {
        return tse0.k("ScootersSlowdownsInfo(slowdowns=", Extension.C_BRAKE, list);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return jl40.l(this.a, ((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b(this.a);
    }
}
