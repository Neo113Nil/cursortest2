package sg.bigo.ads.ci;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.r;
import xsna.h5s;

/* loaded from: classes9.dex */
public final class e extends f {
    public final r a;
    public final sg.bigo.ads.az.a b;
    public final sg.bigo.ads.db.a c;
    public final sg.bigo.ads.cr.a g;

    public e(@NonNull Context context) {
        super(context);
        this.a = new r();
        this.b = new sg.bigo.ads.az.a();
        this.c = new sg.bigo.ads.db.a();
        this.g = new sg.bigo.ads.cr.a();
    }

    @Override // sg.bigo.ads.an.e
    public final void a(Context context) {
        super.a(context);
        if (!TextUtils.isEmpty(this.w)) {
            try {
                d(new JSONObject(this.w));
            } catch (JSONException unused) {
            }
        }
        if (!TextUtils.isEmpty(this.v)) {
            try {
                a(new JSONObject(this.v));
            } catch (JSONException unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.u)) {
            try {
                b(new JSONObject(this.u));
            } catch (JSONException unused3) {
            }
        }
        if (TextUtils.isEmpty(this.x)) {
            return;
        }
        try {
            c(new JSONObject(this.x));
        } catch (JSONException unused4) {
        }
    }

    @Override // sg.bigo.ads.an.e
    public final String b() {
        return "GlobalConfigData";
    }

    @Override // sg.bigo.ads.ci.f
    public final void c(JSONObject jSONObject) {
        this.c.a(jSONObject);
    }

    @Override // sg.bigo.ads.ci.f
    public final void d(JSONObject jSONObject) {
        this.g.a(jSONObject);
    }

    @Override // sg.bigo.ads.ai.j
    @NonNull
    public final r m() {
        return this.a;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalConfigData{huaweiAdIdInfo=");
        sb.append(this.h);
        sb.append(", googleAdIdInfo=");
        sb.append(this.i);
        sb.append(", location=");
        sb.append(this.j);
        sb.append(", state=");
        sb.append(this.m);
        sb.append(", configId=");
        sb.append(this.n);
        sb.append(", interval=");
        sb.append(this.o);
        sb.append(", token='");
        sb.append(this.p);
        sb.append("', antiBan='");
        sb.append(this.q);
        sb.append("', strategy=");
        sb.append(this.r);
        sb.append(", abflags='");
        sb.append(this.s);
        sb.append("', country='");
        sb.append(this.t);
        sb.append("', creatives='");
        sb.append(this.u);
        sb.append("', trackConfig='");
        sb.append(this.v);
        sb.append("', callbackConfig='");
        sb.append(this.w);
        sb.append("', reportConfig='");
        sb.append(this.x);
        sb.append("', appCheckConfig='");
        sb.append(this.y);
        sb.append("', uid='");
        sb.append(this.z);
        sb.append("', maxRequestNum=");
        sb.append(this.A);
        sb.append(", negFeedbackState=");
        sb.append(this.B);
        sb.append(", omUrl='");
        sb.append(this.C);
        sb.append("', globalSwitch=");
        sb.append(this.E.a);
        sb.append(", bannerJsUrl='");
        sb.append(this.D);
        sb.append("', reqCountry='");
        sb.append(this.L);
        sb.append("', appFlag='");
        return h5s.c(this.O, "'}", sb);
    }

    @Override // sg.bigo.ads.ci.f
    public final void a(JSONObject jSONObject) {
        this.a.a(jSONObject);
    }

    @Override // sg.bigo.ads.ci.f
    public final void b(JSONObject jSONObject) {
        this.b.a(jSONObject);
    }
}
