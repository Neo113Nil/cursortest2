package com.apollographql.apollo3.api.http;

import defpackage.dr31;
import defpackage.evu0;
import defpackage.f2r;
import defpackage.fc70;
import defpackage.hvu;
import defpackage.jpb;
import defpackage.ny61;
import defpackage.pq6;
import defpackage.qv10;
import defpackage.to2;
import defpackage.vvu;
import defpackage.w511;
import defpackage.wch;
import defpackage.yp6;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes.dex */
public final class b {
    public final String a;

    public b(String str) {
        this.a = str;
    }

    public final vvu a(to2 to2Var) {
        fc70 fc70Var = to2Var.a;
        com.apollographql.apollo3.api.c cVar = (com.apollographql.apollo3.api.c) to2Var.c.c(com.apollographql.apollo3.api.c.d);
        if (cVar == null) {
            cVar = com.apollographql.apollo3.api.c.e;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new hvu("X-APOLLO-OPERATION-ID", fc70Var.id()));
        arrayList.add(new hvu("X-APOLLO-OPERATION-NAME", fc70Var.name()));
        arrayList.add(new hvu(GlideBitmapDownloader.ACCEPT_HEADER, "multipart/mixed; deferSpec=20220824, application/json"));
        List list = to2Var.e;
        if (list != null) {
            arrayList.addAll(list);
        }
        Boolean bool = to2Var.f;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = to2Var.g;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        HttpMethod httpMethod = to2Var.d;
        if (httpMethod == null) {
            httpMethod = HttpMethod.Post;
        }
        int i = wch.a[httpMethod.ordinal()];
        String str = this.a;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return null;
            }
            String b = booleanValue2 ? fc70Var.b() : null;
            HttpMethod httpMethod2 = HttpMethod.Post;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            DefaultHttpRequestComposer$Companion$apqExtensionsWriter$1 defaultHttpRequestComposer$Companion$apqExtensionsWriter$1 = new DefaultHttpRequestComposer$Companion$apqExtensionsWriter$1(booleanValue, fc70Var.id());
            yp6 yp6Var = new yp6();
            pq6 pq6Var = new pq6(yp6Var);
            pq6Var.u();
            pq6Var.A1("operationName");
            pq6Var.r0(fc70Var.name());
            pq6Var.A1("variables");
            f2r f2rVar = new f2r(pq6Var);
            f2rVar.u();
            fc70Var.a(f2rVar, cVar);
            f2rVar.y();
            if (b != null) {
                pq6Var.A1("query");
                pq6Var.r0(b);
            }
            defaultHttpRequestComposer$Companion$apqExtensionsWriter$1.invoke(pq6Var);
            pq6Var.y();
            ByteString l0 = yp6Var.l0(yp6Var.b);
            LinkedHashMap linkedHashMap = f2rVar.b;
            return new vvu(httpMethod2, str, arrayList2, linkedHashMap.isEmpty() ? new jpb(l0) : new c(linkedHashMap, l0));
        }
        HttpMethod httpMethod3 = HttpMethod.Get;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("operationName", fc70Var.name());
        yp6 yp6Var2 = new yp6();
        f2r f2rVar2 = new f2r(new pq6(yp6Var2));
        f2rVar2.u();
        fc70Var.a(f2rVar2, cVar);
        f2rVar2.y();
        if (!f2rVar2.b.isEmpty()) {
            ny61.r("FileUpload and Http GET are not supported at the same time");
            return null;
        }
        linkedHashMap2.put("variables", yp6Var2.I0());
        if (booleanValue2) {
            linkedHashMap2.put("query", fc70Var.b());
        }
        if (booleanValue) {
            yp6 yp6Var3 = new yp6();
            pq6 pq6Var2 = new pq6(yp6Var3);
            pq6Var2.u();
            pq6Var2.A1("persistedQuery");
            pq6Var2.u();
            pq6Var2.A1("version");
            pq6Var2.Y0(1);
            pq6Var2.A1("sha256Hash");
            pq6Var2.r0(fc70Var.id());
            pq6Var2.y();
            pq6Var2.y();
            linkedHashMap2.put("extensions", yp6Var3.I0());
        }
        StringBuilder t = qv10.t(str);
        boolean y = evu0.y(str, "?", false);
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (y) {
                t.append('&');
            } else {
                t.append('?');
                y = true;
            }
            t.append(dr31.d((String) entry.getKey()));
            t.append('=');
            t.append(dr31.d((String) entry.getValue()));
        }
        String sb = t.toString();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        return new vvu(httpMethod3, sb, arrayList3, null);
    }
}
