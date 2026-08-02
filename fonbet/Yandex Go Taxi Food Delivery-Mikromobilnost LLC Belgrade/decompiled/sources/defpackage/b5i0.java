package defpackage;

import com.yandex.browser.rtm.Environment;
import com.yandex.browser.rtm.ErrorLevel;
import com.yandex.browser.rtm.Platform;
import com.yandex.browser.rtm.Silent;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b5i0 extends y4i0 {
    public final String q;
    public String r;
    public final String s;
    public ErrorLevel t;
    public Silent u;
    public String v;
    public String w;
    public final i5i0 x;
    public String y;
    public LinkedHashMap z;

    public b5i0(String str, k5i0 k5i0Var, String str2, String str3, String str4, Platform platform, Environment environment, String str5, i5i0 i5i0Var) {
        super(k5i0Var, str2, str3, str4, platform, environment, i5i0Var);
        this.q = str;
        this.r = null;
        this.s = str5;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = i5i0Var;
        this.y = null;
        if (jl40.A(str)) {
            ny61.g("Message must not be empty");
            throw null;
        }
    }

    @Override // defpackage.y4i0
    public final String a() {
        return "690.2354";
    }

    @Override // defpackage.y4i0
    public final LinkedHashMap b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.y;
        if (str != null) {
            linkedHashMap.put("table", str);
        }
        String str2 = this.w;
        if (str2 != null) {
            linkedHashMap.put("reqid", str2);
        }
        return linkedHashMap;
    }

    @Override // defpackage.y4i0
    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.s;
        if (str != null) {
            linkedHashMap.put("-ua", str);
        }
        String str2 = this.r;
        kn2 kn2Var = new kn2(21, linkedHashMap, this);
        if (str2 != null && str2.length() > 0) {
            kn2Var.invoke(str2);
        }
        ErrorLevel errorLevel = this.t;
        if (errorLevel != null) {
            linkedHashMap.put("-level", errorLevel.getTag());
        }
        Silent silent = this.u;
        if (silent != null) {
            linkedHashMap.put("-silent", silent.getTag());
        }
        String str3 = this.v;
        if (str3 != null) {
            linkedHashMap.put("-url", str3);
        }
        LinkedHashMap linkedHashMap2 = this.z;
        if (linkedHashMap2 != null) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        return linkedHashMap;
    }

    @Override // defpackage.y4i0
    public final Map d() {
        int i = this.x.e;
        String str = this.q;
        if (i != -1) {
            str = gvu0.A0(500, str);
        }
        return g8e.z("-msg", str);
    }
}
