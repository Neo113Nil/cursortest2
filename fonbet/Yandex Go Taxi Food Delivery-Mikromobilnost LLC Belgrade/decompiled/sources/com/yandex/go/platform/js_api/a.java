package com.yandex.go.platform.js_api;

import defpackage.bax;
import defpackage.gax;
import defpackage.iyw;
import defpackage.jj91;
import defpackage.oyr;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes13.dex */
public final class a implements gax, bax {
    public final String a;
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final String d;

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.d = str2 != null ? oyr.f('.', str2, str) : str;
    }

    @Override // defpackage.mbx
    public final String a() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        String str2 = this.b;
        if (str2 == null || str2.length() == 0) {
            sb.append("window." + str + "={\n");
        } else {
            sb.append(str + ": {\n");
        }
        kotlin.collections.a.W(this.c.values(), sb, ",\n", JsApiInnerObject$asScript$1.w, 60);
        sb.append("\n}");
        return sb.toString();
    }

    @Override // defpackage.bax
    public final iyw b(List list) {
        if (!list.isEmpty()) {
            bax baxVar = (bax) this.c.get(list.get(0));
            if (baxVar != null) {
                return baxVar.b(list.subList(1, list.size()));
            }
        }
        return jj91.a;
    }

    @Override // defpackage.gax
    public final String d() {
        return this.d;
    }

    @Override // defpackage.gax
    public final LinkedHashMap getChildren() {
        return this.c;
    }
}
