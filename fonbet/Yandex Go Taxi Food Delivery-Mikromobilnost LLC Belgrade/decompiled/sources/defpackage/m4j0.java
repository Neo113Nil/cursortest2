package defpackage;

import android.view.View;

/* loaded from: classes15.dex */
public final class m4j0 {
    public final String a;
    public final String b;

    public m4j0(String str, String str2) {
        this.a = str;
        this.b = str2 != null ? str2.replace("/", "\\/") : "none";
    }

    public static m4j0 a(View view) {
        Object tag = view.getTag(e9h0.messaging_analytics_view_name);
        if (tag instanceof m4j0) {
            return (m4j0) tag;
        }
        return null;
    }
}
