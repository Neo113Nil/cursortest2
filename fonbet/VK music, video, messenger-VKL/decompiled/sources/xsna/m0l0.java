package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StepCounterInfo.kt */
/* loaded from: classes18.dex */
public final class m0l0 {
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    public final int a;
    public final float b;
    public final long c;
    public final int d;
    public final float e;
    public final String f;
    public final List<s0l0> g;

    /* compiled from: StepCounterInfo.kt */
    public static final class a {
        public static m0l0 a(JSONObject jSONObject) {
            int optInt = jSONObject.optInt("steps", 0);
            float f = 1000;
            float optInt2 = jSONObject.optInt("distance", 0) / f;
            Date parse = m0l0.h.parse(jSONObject.getString("date"));
            return new m0l0(optInt, optInt2, parse != null ? parse.getTime() : 0L, jSONObject.optInt("manual_steps", 0), jSONObject.optInt("manual_distance", 0) / f, (String) null, 96);
        }

        public static JSONArray b(List list, boolean z) {
            JSONArray jSONArray = new JSONArray();
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    m0l0 m0l0Var = (m0l0) obj;
                    if (m0l0Var.b > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || m0l0Var.a >= 1) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            for (m0l0 m0l0Var2 : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("steps", m0l0Var2.a);
                float f = 1000;
                jSONObject.put("distance", Float.valueOf(m0l0Var2.b * f));
                jSONObject.put("date", m0l0.h.format(new Date(m0l0Var2.c)));
                jSONObject.put("manual_steps", m0l0Var2.d);
                jSONObject.put("manual_distance", Float.valueOf(m0l0Var2.e * f));
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        }
    }

    public /* synthetic */ m0l0(int i, float f, long j, int i2, float f2, String str, int i3) {
        this(i, f, j, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? 0.0f : f2, (i3 & 32) != 0 ? null : str, (List<s0l0>) null);
    }

    public static m0l0 a(m0l0 m0l0Var, int i, float f, int i2, float f2, List list, int i3) {
        if ((i3 & 1) != 0) {
            i = m0l0Var.a;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            f = m0l0Var.b;
        }
        float f3 = f;
        long j = m0l0Var.c;
        String str = m0l0Var.f;
        if ((i3 & 64) != 0) {
            list = m0l0Var.g;
        }
        return new m0l0(i4, f3, j, i2, f2, str, (List<s0l0>) list);
    }

    public final List<s0l0> b() {
        return this.g;
    }

    public final float c() {
        return this.b;
    }

    public final float d() {
        return this.e;
    }

    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0l0)) {
            return false;
        }
        m0l0 m0l0Var = (m0l0) obj;
        return this.a == m0l0Var.a && Float.compare(this.b, m0l0Var.b) == 0 && this.c == m0l0Var.c && this.d == m0l0Var.d && Float.compare(this.e, m0l0Var.e) == 0 && epx.f(this.f, m0l0Var.f) && epx.f(this.g, m0l0Var.g);
    }

    public final int f() {
        return this.a;
    }

    public final long g() {
        return this.c;
    }

    public final boolean h() {
        return this.e > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || this.d > 0;
    }

    public final int hashCode() {
        int a2 = io.reactivex.rxjava3.subjects.b.a(this.e, shy.a(this.d, bh10.a(io.reactivex.rxjava3.subjects.b.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31), 31);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<s0l0> list = this.g;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepCounterInfo(steps=");
        sb.append(this.a);
        sb.append(", distanceKm=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", manualSteps=");
        sb.append(this.d);
        sb.append(", manualDistanceKm=");
        sb.append(this.e);
        sb.append(", source=");
        sb.append(this.f);
        sb.append(", detailInfo=");
        return ms9.a(')', sb, this.g);
    }

    public m0l0(int i, float f, long j, int i2, float f2, String str, List<s0l0> list) {
        this.a = i;
        this.b = f;
        this.c = j;
        this.d = i2;
        this.e = f2;
        this.f = str;
        this.g = list;
    }
}
