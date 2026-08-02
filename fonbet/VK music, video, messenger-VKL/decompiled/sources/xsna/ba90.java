package xsna;

import com.unity3d.ads.BuildConfig;
import org.json.JSONObject;

/* compiled from: PageSizeConfig.kt */
/* loaded from: classes18.dex */
public final class ba90 implements bxx {
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* compiled from: PageSizeConfig.kt */
    public static final class a {
        public static ba90 a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("newsfeed");
            JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("top") : null;
            Integer valueOf = optJSONObject2 != null ? Integer.valueOf(optJSONObject2.optInt("first")) : null;
            int i = 20;
            int intValue = (valueOf == null || valueOf.intValue() == 0) ? 20 : valueOf.intValue();
            Integer valueOf2 = optJSONObject2 != null ? Integer.valueOf(optJSONObject2.optInt(BuildConfig.FLAVOR)) : null;
            if (valueOf2 != null && valueOf2.intValue() != 0) {
                i = valueOf2.intValue();
            }
            JSONObject optJSONObject3 = optJSONObject != null ? optJSONObject.optJSONObject("recent") : null;
            Integer valueOf3 = optJSONObject3 != null ? Integer.valueOf(optJSONObject3.optInt("first")) : null;
            int i2 = 25;
            int intValue2 = (valueOf3 == null || valueOf3.intValue() == 0) ? 25 : valueOf3.intValue();
            Integer valueOf4 = optJSONObject3 != null ? Integer.valueOf(optJSONObject3.optInt(BuildConfig.FLAVOR)) : null;
            if (valueOf4 != null && valueOf4.intValue() != 0) {
                i2 = valueOf4.intValue();
            }
            return new ba90(intValue, i, intValue2, i2);
        }
    }

    public ba90(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("first", this.b);
        jSONObject3.put(BuildConfig.FLAVOR, this.c);
        s3q0 s3q0Var = s3q0.a;
        jSONObject2.put("top", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("first", this.d);
        jSONObject4.put(BuildConfig.FLAVOR, this.e);
        jSONObject2.put("recent", jSONObject4);
        jSONObject.put("newsfeed", jSONObject2);
        return jSONObject;
    }
}
