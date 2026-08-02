package defpackage;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class gyf0 extends mtb1 {
    public final String a;

    public gyf0(String str) {
        this.a = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        ny61.g("authenticationResponseJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
