package defpackage;

import android.view.View;

/* loaded from: classes15.dex */
public final class l4j0 {
    public String a;
    public String b;

    public static l4j0 a(View view) {
        Object tag = view.getTag(e9h0.messaging_analytics_view_id);
        if (tag instanceof l4j0) {
            return (l4j0) tag;
        }
        l4j0 l4j0Var = new l4j0();
        view.setTag(e9h0.messaging_analytics_view_id, l4j0Var);
        return l4j0Var;
    }
}
