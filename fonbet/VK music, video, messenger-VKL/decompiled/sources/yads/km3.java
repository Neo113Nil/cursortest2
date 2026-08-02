package yads;

import com.unity3d.ads.BuildConfig;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public enum km3 implements ge1 {
    c(BuildConfig.FLAVOR),
    d("loading"),
    e("hidden");

    public final String b;

    km3(String str) {
        this.b = str;
    }

    @Override // yads.ge1
    public final String a() {
        return String.format("state: %s", Arrays.copyOf(new Object[]{JSONObject.quote(this.b)}, 1));
    }
}
