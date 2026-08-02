package defpackage;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.div.state.db.StateEntry;
import kotlin.Result;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class jne implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jne(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Object failure;
        String str;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wrb0 wrb0Var = (wrb0) obj2;
                ym11.e(1, wrb0Var);
                wrb0Var.invoke(new Result((Boolean) obj));
                break;
            case 1:
                is11 is11Var = (is11) obj2;
                String str2 = (String) obj;
                is11Var.getClass();
                try {
                    if (str2 == null) {
                        str2 = "";
                    }
                    failure = new JSONArray(str2);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                JSONArray jSONArray = (JSONArray) failure;
                if (jSONArray != null) {
                    int min = Math.min(jSONArray.length(), 50);
                    for (int i2 = 0; i2 < min; i2++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("name");
                            if (evu0.J(optString)) {
                                optString = null;
                            }
                            hlx0 hlx0Var = is11Var.b;
                            String str3 = is11Var.a;
                            String str4 = is11Var.c;
                            String host = optString != null ? Uri.parse(optString).getHost() : null;
                            if (optString == null || (str = Uri.parse(optString).getEncodedPath()) == null || evu0.J(str)) {
                                str = null;
                            }
                            String optString2 = optJSONObject.optString("initiator_type");
                            if (evu0.J(optString2)) {
                                optString2 = null;
                            }
                            Long valueOf = optJSONObject.has("start_time") ? Long.valueOf(optJSONObject.optLong("start_time")) : null;
                            Long valueOf2 = optJSONObject.has("duration") ? Long.valueOf(optJSONObject.optLong("duration")) : null;
                            Long valueOf3 = optJSONObject.has("response_end") ? Long.valueOf(optJSONObject.optLong("response_end")) : null;
                            MapBuilder p = hlx0Var.p(str3, str4);
                            MapBuilder mapBuilder = new MapBuilder();
                            mapBuilder.put("resource_index", Integer.valueOf(i2));
                            if (host != null && host.length() != 0) {
                                mapBuilder.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, host);
                            }
                            if (str != null && str.length() != 0) {
                                mapBuilder.put(StateEntry.COLUMN_PATH, str);
                            }
                            if (optString2 != null && optString2.length() != 0) {
                                mapBuilder.put("initiator_type", optString2);
                            }
                            if (valueOf != null) {
                                mapBuilder.put("start_offset_ms", Long.valueOf(valueOf.longValue()));
                            }
                            if (valueOf2 != null) {
                                mapBuilder.put("duration_ms", Long.valueOf(valueOf2.longValue()));
                            }
                            if (valueOf3 != null) {
                                mapBuilder.put("response_end_ms", Long.valueOf(valueOf3.longValue()));
                            }
                            hlx0Var.A("Ugc.ResourceLoaded", b.n(p, mapBuilder.j()));
                        }
                    }
                    break;
                }
                break;
            default:
                wrb0 wrb0Var2 = (wrb0) obj2;
                ym11.e(1, wrb0Var2);
                wrb0Var2.invoke(new Result((String) obj));
                break;
        }
    }
}
