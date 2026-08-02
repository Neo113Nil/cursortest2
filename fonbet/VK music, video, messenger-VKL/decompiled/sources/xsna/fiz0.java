package xsna;

import org.json.JSONObject;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class fiz0 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public String e;
    public boolean f = false;

    public fiz0(float f, float f2, int i) {
        this.a = i;
        this.b = i <= 0 ? -1 : Integer.numberOfTrailingZeros(i);
        this.c = f;
        this.d = f2;
    }

    public static String a(fiz0 fiz0Var) {
        JSONObject jSONObject;
        if (fiz0Var != null) {
            try {
                jSONObject = new JSONObject();
                int i = fiz0Var.a;
                if (i != -1) {
                    jSONObject.put("clickArea", i);
                }
                float f = fiz0Var.c;
                if (f != 1.0f) {
                    jSONObject.put("xRelative", f);
                }
                float f2 = fiz0Var.d;
                if (f2 != 1.0f) {
                    jSONObject.put("yRelative", f2);
                }
                jSONObject.putOpt("message", fiz0Var.e);
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject != null && jSONObject.length() > 0) {
                return jSONObject.toString();
            }
        }
        return null;
    }

    public final boolean b() {
        return this.f && this.b != -1;
    }

    public final int c() {
        return this.b;
    }
}
