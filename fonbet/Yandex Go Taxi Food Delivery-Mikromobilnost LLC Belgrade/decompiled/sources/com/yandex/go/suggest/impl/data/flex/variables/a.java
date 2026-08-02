package com.yandex.go.suggest.impl.data.flex.variables;

import core.network.mapi.exception.MapiClientException;
import defpackage.d3q0;
import defpackage.klc;
import defpackage.kq90;
import defpackage.r2q0;
import defpackage.s1m;
import defpackage.tje;
import defpackage.u1m;
import defpackage.uu00;
import defpackage.vu00;
import defpackage.ywl;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class a implements s1m {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.s1m
    public final ywl b(kq90 kq90Var, ywl ywlVar, ywl ywlVar2, ywl ywlVar3) {
        return ywlVar3;
    }

    @Override // defpackage.s1m
    public final Object c(klc klcVar, u1m u1mVar, kq90 kq90Var, ywl ywlVar, Throwable th, Continuation continuation) {
        if ((kq90Var instanceof d3q0) && (((d3q0) kq90Var).a instanceof r2q0) && (th instanceof MapiClientException)) {
            vu00 vu00Var = ((MapiClientException) th).getDetails().a;
            uu00 uu00Var = vu00Var instanceof uu00 ? (uu00) vu00Var : null;
            if (uu00Var != null) {
                JSONObject jSONObject = new JSONObject(uu00Var.d);
                ArrayList arrayList = new ArrayList();
                if (jSONObject.has("sections")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("sections");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2.has("raw")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("raw");
                            if (jSONObject3.has("id")) {
                                arrayList.add(jSONObject3.getString("id"));
                            }
                        }
                    }
                    b bVar = this.a;
                    bVar.getClass();
                    if (!arrayList.isEmpty()) {
                        tje.N(bVar.c, bVar.d, null, new SuperappSuggestSectionsStateRepository$markSearchSectionError$1(bVar, arrayList, null), 2);
                    }
                }
            }
        }
        return ywlVar;
    }
}
