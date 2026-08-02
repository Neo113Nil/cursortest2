package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.domain.action.DonutVideoAction;

/* compiled from: DonutChipSpanFactoryArgs.kt */
/* loaded from: classes18.dex */
public final class azn {
    public final String a;
    public final DonutPriceTemplate b;
    public final String c;
    public final DonutVideoAction d;

    public azn(String str, DonutPriceTemplate donutPriceTemplate, String str2, DonutVideoAction donutVideoAction) {
        this.a = str;
        this.b = donutPriceTemplate;
        this.c = str2;
        this.d = donutVideoAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azn)) {
            return false;
        }
        azn aznVar = (azn) obj;
        return epx.f(this.a, aznVar.a) && epx.f(this.b, aznVar.b) && epx.f(this.c, aznVar.c) && epx.f(this.d, aznVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        DonutPriceTemplate donutPriceTemplate = this.b;
        int a = urd0.a((hashCode + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31, 31, this.c);
        DonutVideoAction donutVideoAction = this.d;
        return a + (donutVideoAction != null ? donutVideoAction.hashCode() : 0);
    }

    public final String toString() {
        return "DonutChipSpanFactoryArgs(text=" + this.a + ", donutPriceTemplate=" + this.b + ", contentDescription=" + this.c + ", action=" + this.d + ')';
    }
}
