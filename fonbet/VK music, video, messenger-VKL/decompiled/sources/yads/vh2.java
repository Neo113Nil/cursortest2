package yads;

import android.content.Context;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.brm0;
import xsna.epx;

/* loaded from: classes10.dex */
public final class vh2 {
    public final wb3 a;
    public final p93 b;
    public final xq0 c;

    public /* synthetic */ vh2(Context context, wb3 wb3Var) {
        this(wb3Var, new p93(), new yq0(context));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:10|(5:12|(4:15|(4:17|18|(5:20|21|22|23|(2:28|(1:33)(1:32))(1:27))|(3:37|38|39)(1:41))(1:42)|40|13)|43|44|(20:46|47|48|49|50|(1:52)|53|(2:54|(2:56|(1:58)(1:78))(2:79|80))|59|(1:61)|62|(1:64)(1:77)|65|66|(1:68)(1:76)|69|(1:75)|71|72|73))|84|47|48|49|50|(0)|53|(3:54|(0)(0)|78)|59|(0)|62|(0)(0)|65|66|(0)(0)|69|(0)|71|72|73) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00bf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00c0, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final th2 a(JSONObject jSONObject) {
        MapBuilder mapBuilder;
        Object failure;
        Iterator<E> it;
        Object obj;
        bb0 bb0Var;
        String a;
        String optString;
        Object obj2;
        JSONObject jSONObject2 = jSONObject.has("deeplinkLaunchParams") ? jSONObject.getJSONObject("deeplinkLaunchParams") : jSONObject;
        String optString2 = jSONObject2.optString("package");
        if (optString2 == null || optString2.length() == 0 || optString2.equals("null")) {
            throw new a22("Native Ad json has not required attributes");
        }
        JSONObject optJSONObject = jSONObject2.optJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        xq0 xq0Var = this.c;
        xq0Var.getClass();
        if (optJSONObject != null) {
            MapBuilder mapBuilder2 = new MapBuilder();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!optJSONObject.isNull(next)) {
                    Object obj3 = optJSONObject.get(next);
                    if (obj3 instanceof JSONObject) {
                        vq0 vq0Var = xq0Var.a;
                        JSONObject jSONObject3 = (JSONObject) obj3;
                        vq0Var.getClass();
                        String optString3 = jSONObject3.optString("type");
                        try {
                            obj2 = jSONObject3.get("value");
                        } catch (JSONException unused) {
                            obj2 = null;
                        }
                        obj3 = (epx.f(optString3, "parcelable") && epx.f(obj2, "null")) ? wq0.a : (epx.f(optString3, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK) && (obj2 instanceof JSONObject)) ? new tq0(vq0Var.a, vq0Var.b.a((JSONObject) obj2), new uh2()) : null;
                    }
                    if (obj3 != null) {
                        mapBuilder2.put(next, obj3);
                    }
                }
            }
            MapBuilder h = mapBuilder2.h();
            if (!h.isEmpty()) {
                mapBuilder = h;
                failure = Integer.valueOf(jSONObject2.getInt("flags"));
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                Integer num = (Integer) failure;
                String a2 = ke1.a("launchMode", jSONObject2);
                bb0.b.getClass();
                it = bb0.f.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (brm0.w(((bb0) obj).name(), a2, true)) {
                        break;
                    }
                }
                bb0Var = (bb0) obj;
                if (bb0Var == null) {
                    bb0Var = bb0.c;
                }
                a = ke1.a("className", jSONObject2);
                if (a != null) {
                    this.a.getClass();
                    optString = wb3.a("url", jSONObject);
                } else {
                    optString = jSONObject.optString("url");
                }
                String str = optString;
                String a3 = ke1.a("deeplinkType", jSONObject);
                this.b.getClass();
                JSONArray optJSONArray = jSONObject.optJSONArray("trackingUrls");
                List a4 = optJSONArray != null ? null : p93.a(optJSONArray);
                this.b.getClass();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("fallbackTrackingUrls");
                return new th2(optString2, str, mapBuilder, num, bb0Var, a4, optJSONArray2 != null ? p93.a(optJSONArray2) : null, a3, a);
            }
        }
        mapBuilder = null;
        failure = Integer.valueOf(jSONObject2.getInt("flags"));
        if (failure instanceof Result.Failure) {
        }
        Integer num2 = (Integer) failure;
        String a22 = ke1.a("launchMode", jSONObject2);
        bb0.b.getClass();
        it = bb0.f.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        bb0Var = (bb0) obj;
        if (bb0Var == null) {
        }
        a = ke1.a("className", jSONObject2);
        if (a != null) {
        }
        String str2 = optString;
        String a32 = ke1.a("deeplinkType", jSONObject);
        this.b.getClass();
        JSONArray optJSONArray3 = jSONObject.optJSONArray("trackingUrls");
        if (optJSONArray3 != null) {
        }
        this.b.getClass();
        JSONArray optJSONArray22 = jSONObject.optJSONArray("fallbackTrackingUrls");
        return new th2(optString2, str2, mapBuilder, num2, bb0Var, a4, optJSONArray22 != null ? p93.a(optJSONArray22) : null, a32, a);
    }

    public vh2(wb3 wb3Var, p93 p93Var, yq0 yq0Var) {
        this.a = wb3Var;
        this.b = p93Var;
        this.c = yq0Var.a(this);
    }
}
