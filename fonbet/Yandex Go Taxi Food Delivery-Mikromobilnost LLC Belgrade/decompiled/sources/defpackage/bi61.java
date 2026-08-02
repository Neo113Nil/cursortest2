package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class bi61 {
    public final t171 a;
    public z471 b;

    public bi61(t171 t171Var) {
        this.a = t171Var;
    }

    public final void a(Uri uri, View view) {
        LinkedHashMap linkedHashMap;
        ui21 ui21Var;
        View.OnClickListener onClickListener;
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("position");
            t171 t171Var = null;
            Integer l = queryParameter2 != null ? bvu0.l(10, queryParameter2) : null;
            if (l == null) {
                t171Var = this.a;
            } else {
                z471 z471Var = this.b;
                if (z471Var != null && (linkedHashMap = z471Var.b) != null) {
                    t171Var = (t171) linkedHashMap.get(l);
                }
            }
            if (t171Var == null || (ui21Var = t171Var.b) == null || (onClickListener = (View.OnClickListener) ui21Var.a.get(queryParameter)) == null) {
                return;
            }
            onClickListener.onClick(view);
        }
    }
}
