package xsna;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class xvy0 extends ohz0 {
    public final int a;

    public xvy0(int i) {
        this.a = i;
    }

    @Override // xsna.ohz0
    public final njz0 d(String str, jkz0 jkz0Var, njz0 njz0Var, u6z0 u6z0Var, s3z0.a aVar, s3z0 s3z0Var, ArrayList arrayList, xla xlaVar) {
        JSONObject b = ohz0.b(str, aVar, s3z0Var, arrayList, xlaVar, uez0.c);
        if (b == null) {
            xlaVar.b(iaz0.j);
            return null;
        }
        JSONObject optJSONObject = b.optJSONObject(u6z0Var.h);
        if (optJSONObject == null) {
            xlaVar.b(iaz0.m);
            return null;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("banners");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            xlaVar.b(iaz0.r);
            return null;
        }
        JSONObject optJSONObject2 = optJSONArray.optJSONObject(0);
        if (optJSONObject2 == null) {
            xlaVar.b(iaz0.r);
            return null;
        }
        ipy0 ipy0Var = new ipy0();
        String optString = optJSONObject2.optString("id");
        if (TextUtils.isEmpty(optString)) {
            optString = optJSONObject2.optString("bannerID", ipy0Var.F);
        }
        ipy0Var.F = optString;
        String optString2 = optJSONObject2.optString("type");
        if (!TextUtils.isEmpty(optString2)) {
            ipy0Var.E = optString2;
        }
        if (optJSONObject2.optJSONArray("statistics") != null) {
            new zdz0(jkz0Var).b(ipy0Var.a, optJSONObject2, this.a);
        }
        if (!ipy0Var.a.p()) {
            xlaVar.b(iaz0.i);
            return null;
        }
        lxy0 lxy0Var = new lxy0();
        lxy0Var.b = ipy0Var;
        return lxy0Var;
    }
}
