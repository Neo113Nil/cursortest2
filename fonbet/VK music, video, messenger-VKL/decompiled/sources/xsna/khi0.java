package xsna;

import android.content.Context;
import android.net.Uri;
import com.yandex.div.internal.Log;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: SendBeaconManager.kt */
/* loaded from: classes7.dex */
public final class khi0 {
    public final mhi0 a;

    public khi0(Context context, ihi0 ihi0Var) {
        this.a = new mhi0(context, ihi0Var);
    }

    public final void a(Uri uri, Map<String, String> map, JSONObject jSONObject) {
        mhi0 mhi0Var = this.a;
        mhi0Var.getClass();
        Log.d("SendBeaconWorker", "Adding url " + uri);
        mhi0Var.b.post(new lhi0(mhi0Var, uri, map, jSONObject, 0));
    }
}
