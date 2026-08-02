package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.superapp.discovery.map.impl.analytics.generated.SuperMapAnalytics$SuperMapSearchActionType;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.List;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class e8w0 {
    public final SuperMapAnalytics$SuperMapSearchActionType a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final String i;
    public final MapBuilder j;

    public e8w0(SuperMapAnalytics$SuperMapSearchActionType superMapAnalytics$SuperMapSearchActionType, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7) {
        this.a = superMapAnalytics$SuperMapSearchActionType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = list;
        this.i = str7;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("type", superMapAnalytics$SuperMapSearchActionType.getEventValue());
        if (str != null) {
            mapBuilder.put(Constants.DEEPLINK, str);
        }
        if (str2 != null) {
            mapBuilder.put("oid", str2);
        }
        if (str3 != null) {
            mapBuilder.put(LaunchBrowserActivity.KEY_URI, str3);
        }
        if (str4 != null) {
            mapBuilder.put("query", str4);
        }
        if (str5 != null) {
            mapBuilder.put("stop_id", str5);
        }
        if (str6 != null) {
            mapBuilder.put("stop_name", str6);
        }
        if (list != null) {
            mapBuilder.put("position", list);
        }
        if (str7 != null) {
            mapBuilder.put("line_id", str7);
        }
        this.j = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8w0)) {
            return false;
        }
        e8w0 e8w0Var = (e8w0) obj;
        return this.a == e8w0Var.a && jl40.l(this.b, e8w0Var.b) && jl40.l(this.c, e8w0Var.c) && jl40.l(this.d, e8w0Var.d) && jl40.l(this.e, e8w0Var.e) && jl40.l(this.f, e8w0Var.f) && jl40.l(this.g, e8w0Var.g) && jl40.l(this.h, e8w0Var.h) && jl40.l(this.i, e8w0Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.h;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.i;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperMapSearchAction(type=");
        sb.append(this.a);
        sb.append(", deeplink=");
        sb.append(this.b);
        sb.append(", oid=");
        g8e.D(sb, this.c, ", uri=", this.d, ", query=");
        g8e.D(sb, this.e, ", stopId=", this.f, ", stopName=");
        tse0.x(this.g, ", position=", ", lineId=", sb, this.h);
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
