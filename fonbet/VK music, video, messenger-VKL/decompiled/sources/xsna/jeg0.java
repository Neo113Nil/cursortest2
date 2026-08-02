package xsna;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: ResumableUploadStartRequest.java */
/* loaded from: classes13.dex */
public final class jeg0 extends ceg0 {
    public final JSONObject m;

    public jeg0(@NonNull nhl0 nhl0Var, @NonNull vhr vhrVar, @Nullable JSONObject jSONObject, @NonNull String str) {
        super(nhl0Var, vhrVar);
        this.m = jSONObject;
        if (TextUtils.isEmpty(str)) {
            this.a = new IllegalArgumentException("mContentType is null or empty");
        }
        m("X-Goog-Upload-Protocol", "resumable");
        m("X-Goog-Upload-Command", "start");
        m("X-Goog-Upload-Header-Content-Type", str);
    }

    @Override // xsna.a560
    @Nullable
    public final JSONObject c() {
        return this.m;
    }

    @Override // xsna.a560
    @NonNull
    public final Map<String, String> f() {
        HashMap hashMap = new HashMap();
        String path = this.b.b.getPath();
        if (path == null) {
            path = "";
        } else if (path.startsWith(DomExceptionUtils.SEPARATOR)) {
            path = path.substring(1);
        }
        hashMap.put("name", path);
        hashMap.put("uploadType", "resumable");
        return hashMap;
    }

    @Override // xsna.a560
    @NonNull
    public final Uri i() {
        nhl0 nhl0Var = this.b;
        String authority = nhl0Var.b.getAuthority();
        Uri.Builder buildUpon = nhl0Var.a.buildUpon();
        buildUpon.appendPath("b");
        buildUpon.appendPath(authority);
        buildUpon.appendPath("o");
        return buildUpon.build();
    }
}
