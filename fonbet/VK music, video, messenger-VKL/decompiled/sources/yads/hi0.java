package yads;

import com.yandex.div.DivDataTag;
import com.yandex.div2.j3;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import xsna.epx;
import xsna.fw3;

/* loaded from: classes10.dex */
public final class hi0 {
    public final String a;
    public final JSONObject b;
    public final JSONObject c;
    public final List d;
    public final j3 e;
    public final DivDataTag f;
    public final Set g;
    public final yf0 h;

    public hi0(String str, JSONObject jSONObject, JSONObject jSONObject2, List list, j3 j3Var, DivDataTag divDataTag, Set set, yf0 yf0Var) {
        this.a = str;
        this.b = jSONObject;
        this.c = jSONObject2;
        this.d = list;
        this.e = j3Var;
        this.f = divDataTag;
        this.g = set;
        this.h = yf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi0)) {
            return false;
        }
        hi0 hi0Var = (hi0) obj;
        return epx.f(this.a, hi0Var.a) && epx.f(this.b, hi0Var.b) && epx.f(this.c, hi0Var.c) && epx.f(this.d, hi0Var.d) && epx.f(this.e, hi0Var.e) && epx.f(this.f, hi0Var.f) && epx.f(this.g, hi0Var.g) && epx.f(this.h, hi0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.c;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        List list = this.d;
        return this.h.hashCode() + fw3.b((this.f.hashCode() + ((this.e.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        return "DivKitDesign(target=" + this.a + ", card=" + this.b + ", templates=" + this.c + ", images=" + this.d + ", divData=" + this.e + ", divDataTag=" + this.f + ", divAssets=" + this.g + ", designAnalytics=" + this.h + ")";
    }
}
