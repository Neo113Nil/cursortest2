package yads;

import android.net.Uri;
import android.view.View;
import com.ironsource.X3;
import java.util.LinkedHashMap;
import xsna.arm0;

/* loaded from: classes10.dex */
public final class ai0 {
    public final pu a;
    public qu b;

    public ai0(pu puVar) {
        this.a = puVar;
    }

    public final void a(Uri uri, View view) {
        LinkedHashMap linkedHashMap;
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter(X3.i.L);
            pu puVar = null;
            Integer m = queryParameter2 != null ? arm0.m(10, queryParameter2) : null;
            if (m == null) {
                puVar = this.a;
            } else {
                qu quVar = this.b;
                if (quVar != null && (linkedHashMap = quVar.b) != null) {
                    puVar = (pu) linkedHashMap.get(m);
                }
            }
            if (puVar != null) {
                puVar.a(view, queryParameter);
            }
        }
    }
}
