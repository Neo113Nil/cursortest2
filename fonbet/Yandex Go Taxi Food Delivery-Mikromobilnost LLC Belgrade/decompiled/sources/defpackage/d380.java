package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public class d380 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public d380(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final List a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public LinkedHashMap e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("order_id", this.a);
        linkedHashMap.put(Constants.KEY_SERVICE, this.b);
        linkedHashMap.put("order_status", this.c);
        List list = this.d;
        if (!list.isEmpty()) {
            linkedHashMap.put("button_list", list);
        }
        return linkedHashMap;
    }

    public /* synthetic */ d380(String str, String str2, String str3) {
        this(str, str2, str3, EmptyList.a);
    }
}
