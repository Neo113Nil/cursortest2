package xsna;

import java.util.ArrayList;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DigestHashesByPackageGet.kt */
/* loaded from: classes14.dex */
public final class fym extends rsg0 {
    public final /* synthetic */ int s = 1;

    public fym(int i, String str) {
        super("masks.getEffects");
        C(0, "model_version");
        C(i, "code_version");
        if (str != null) {
            K("effect_ids", str);
        }
        R("extended", true);
        R("need_counters", true);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                JSONArray optJSONArray = jSONObject.getJSONObject("response").optJSONArray("valid_hashes");
                ArrayList H = optJSONArray != null ? dz5.H(optJSONArray) : null;
                return H == null ? EmptyList.b : H;
            default:
                return new gi10(jSONObject.getJSONObject("response")).a;
        }
    }

    public fym(String str, String str2) {
        super("auth.getDigestHashesByPackage");
        K("package", str);
        K("expected_digest_hash", str2);
    }
}
