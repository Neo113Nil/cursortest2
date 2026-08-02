package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4714ao {
    public final Qn a;
    public final V b;
    public final List c;
    public final String d;
    public final String e;
    public final Map f;
    public final String g;
    public final Boolean h;

    public C4714ao(Qn qn, V v, ArrayList arrayList, String str, String str2, Map map, String str3, Boolean bool) {
        this.a = qn;
        this.b = v;
        this.c = arrayList;
        this.d = str;
        this.e = str2;
        this.f = map;
        this.g = str3;
        this.h = bool;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Qn qn = this.a;
        if (qn != null) {
            for (Nl nl : qn.c) {
                sb.append("at " + nl.a + "." + nl.e + "(" + nl.b + StringUtils.PROCESS_POSTFIX_DELIMITER + nl.c + StringUtils.PROCESS_POSTFIX_DELIMITER + nl.d + ")\n");
            }
        }
        return "UnhandledException{exception=" + this.a + "\n" + sb.toString() + '}';
    }
}
