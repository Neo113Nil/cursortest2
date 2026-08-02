package io.appmetrica.analytics.impl;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.epx;
import xsna.vu5;

/* loaded from: classes8.dex */
public final class Ed {
    public final List a;
    public final long b;

    public Ed(List list, long j) {
        this.a = list;
        this.b = j;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C5013md> list = this.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (C5013md c5013md : list) {
                c5013md.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c5013md.a);
                    jSONObject.put(X3.i.r, c5013md.b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ed)) {
            return false;
        }
        Ed ed = (Ed) obj;
        return epx.f(this.a, ed.a) && this.b == ed.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModulesStatus(modulesStatus=");
        sb.append(this.a);
        sb.append(", lastSendTime=");
        return vu5.a(')', this.b, sb);
    }
}
