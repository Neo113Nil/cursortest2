package com.yandex.go.platform.js_api;

import defpackage.bax;
import defpackage.evu0;
import defpackage.gax;
import defpackage.iyw;
import defpackage.jj91;
import defpackage.mbx;
import java.util.LinkedHashMap;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class b implements gax, mbx {
    public final LinkedHashMap a;

    public b(int i) {
        this.a = new LinkedHashMap();
    }

    @Override // defpackage.mbx
    public final String a() {
        StringBuilder sb = new StringBuilder();
        kotlin.collections.a.W(this.a.values(), sb, "\n", JsApiRoot$asScript$1.w, 60);
        return sb.toString();
    }

    public final iyw c(String str) {
        List W;
        W = evu0.W(str, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        if (!W.isEmpty()) {
            bax baxVar = (bax) this.a.get(W.get(0));
            if (baxVar != null) {
                return baxVar.b(W.subList(1, W.size()));
            }
        }
        return jj91.a;
    }

    @Override // defpackage.gax
    public final String d() {
        return null;
    }

    @Override // defpackage.gax
    public final LinkedHashMap getChildren() {
        return this.a;
    }

    public b() {
        this(0);
    }
}
