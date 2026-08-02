package xsna;

import org.json.JSONObject;

/* compiled from: AppsGetSections.kt */
/* loaded from: classes14.dex */
public final class af3 extends pug0<a> {
    public static final b t = new b();

    /* compiled from: AppsGetSections.kt */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    /* compiled from: AppsGetSections.kt */
    public static final class b extends aay<a> {
        @Override // xsna.aay
        public final a a(JSONObject jSONObject) {
            return new a(jSONObject.getInt("id"), jSONObject.getString("name"));
        }
    }
}
