package defpackage;

import com.yandex.browser.rtm.Environment;
import com.yandex.browser.rtm.EventValueType;
import com.yandex.browser.rtm.Platform;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class c5i0 extends y4i0 {
    public final String q;
    public final String r;
    public final EventValueType s;
    public Boolean t;
    public String u;
    public HashMap v;
    public final i5i0 w;

    public c5i0(String str, String str2, EventValueType eventValueType, k5i0 k5i0Var, String str3, String str4, String str5, Platform platform, Environment environment, i5i0 i5i0Var) {
        super(k5i0Var, str3, str4, str5, platform, environment, i5i0Var);
        this.q = str;
        this.r = str2;
        this.s = eventValueType;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = i5i0Var;
        if (jl40.A(str)) {
            ny61.g("Name must not be empty");
            throw null;
        }
    }

    @Override // defpackage.y4i0
    public final String a() {
        return "690.32";
    }

    @Override // defpackage.y4i0
    public final LinkedHashMap b() {
        LinkedHashMap l = b.l(new Pair("table", "rum_events"));
        String str = this.u;
        if (str != null) {
            l.put("reqid", str);
        }
        return l;
    }

    @Override // defpackage.y4i0
    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.t;
        if (bool != null) {
            linkedHashMap.put("-loggedin", bool.booleanValue() ? "1" : "0");
        }
        HashMap hashMap = this.v;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        return linkedHashMap;
    }

    @Override // defpackage.y4i0
    public final Map d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = this.w.f;
        String str = this.q;
        if (i != -1) {
            str = gvu0.A0(500, str);
        }
        linkedHashMap.put("-name", str);
        String str2 = this.r;
        if (str2 != null) {
            linkedHashMap.put("-value", str2);
            linkedHashMap.put("-type", this.s.getTag());
        }
        return linkedHashMap;
    }
}
