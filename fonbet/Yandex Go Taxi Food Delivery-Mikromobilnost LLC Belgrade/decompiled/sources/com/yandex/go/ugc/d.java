package com.yandex.go.ugc;

import android.net.Uri;
import com.yandex.go.ugc.entities.UGCItemExperiment;
import defpackage.cvu0;
import defpackage.ds11;
import defpackage.evu0;
import defpackage.gw00;
import defpackage.hlx0;
import defpackage.ih01;
import defpackage.jl40;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ String a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ ds11 w;

    public d(String str, f fVar, Uri uri, ds11 ds11Var) {
        this.a = str;
        this.b = fVar;
        this.c = uri;
        this.w = ds11Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        LinkedHashMap linkedHashMap;
        Uri uri;
        Uri uri2;
        boolean z;
        List W;
        List W2;
        Iterator it = ((UGCItemExperiment) obj).c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((WebViewFromDeeplinkExperiment.a) obj2).a, this.a)) {
                break;
            }
        }
        WebViewFromDeeplinkExperiment.a aVar = (WebViewFromDeeplinkExperiment.a) obj2;
        f fVar = this.b;
        Uri uri3 = this.c;
        if (aVar != null) {
            String query = uri3.getQuery();
            if (query != null) {
                W = evu0.W(query, new String[]{"&"}, (r2 & 4) != 0 ? 0 : 2);
                List list = W;
                int d = gw00.d(tcc.n(list, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    W2 = evu0.W((String) it2.next(), new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
                    Pair pair = new Pair((String) W2.get(0), (String) W2.get(1));
                    linkedHashMap2.put(pair.c(), pair.f());
                }
                linkedHashMap = new LinkedHashMap(linkedHashMap2);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.remove("id");
            linkedHashMap.remove("presentation_mode");
            if (linkedHashMap.isEmpty()) {
                uri = uri3;
            } else {
                Uri parse = Uri.parse(aVar.b);
                List<String> pathSegments = parse.getPathSegments();
                String X = pathSegments != null ? kotlin.collections.a.X(pathSegments, "/", null, null, null, 62) : null;
                String query2 = parse.getQuery();
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (cvu0.x(str, "{", false) && cvu0.s(str, "}", false)) {
                        if (X != null) {
                            uri2 = uri3;
                            z = true;
                            if (evu0.y(X, str, false)) {
                                X = cvu0.v(X, str, str2, false);
                            }
                        } else {
                            uri2 = uri3;
                            z = true;
                        }
                        if (query2 != null && evu0.y(query2, str, false) == z) {
                            query2 = cvu0.v(query2, str, str2, false);
                        }
                    } else {
                        uri2 = uri3;
                        if (!queryParameterNames.contains(str)) {
                            arrayList.add(str + "=" + str2);
                        }
                    }
                    uri3 = uri2;
                }
                uri = uri3;
                aVar = WebViewFromDeeplinkExperiment.a.a(aVar, new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(X).encodedQuery(kotlin.collections.a.X(kotlin.collections.a.m0(arrayList, scc.h(query2)), "&", null, null, null, 62)).build().toString());
            }
            WebViewFromDeeplinkExperiment.a aVar2 = aVar;
            hlx0 hlx0Var = fVar.I;
            String uri4 = uri.toString();
            ih01 ih01Var = (ih01) hlx0Var.x;
            ih01Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("url_id", uri4);
            ih01Var.a.a("Ugc.IdFounded", hashMap, 1, new HashMap());
            tje.N(fVar.o(), null, null, new UgcDeeplinkRouterImpl$onLaunch$1$1(this.b, this.a, aVar2, this.c, this.w, null), 3);
        } else {
            hlx0 hlx0Var2 = fVar.I;
            String uri5 = uri3.toString();
            ih01 ih01Var2 = (ih01) hlx0Var2.x;
            ih01Var2.getClass();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("url_id", uri5);
            ih01Var2.a.a("Ugc.IdNotFound", hashMap2, 1, new HashMap());
        }
        return zy11.a;
    }
}
