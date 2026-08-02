package xsna;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.core.utils.newtork.d;
import com.vk.log.L;
import com.vkontakte.android.VKApplication;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.yx2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class db3 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ db3(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 1:
                String str = (String) obj;
                Set<String> set = yx2.g;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    boolean optBoolean = jSONObject.optBoolean("api_methods_priority_backoff_enabled", true);
                    ArrayList arrayList = new ArrayList();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    JSONArray optJSONArray = jSONObject.optJSONArray(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                    if (optJSONArray != null) {
                        arrayList.addAll(qaj0.a(optJSONArray));
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("exceptions");
                    if (optJSONArray2 != null) {
                        linkedHashSet.addAll(qaj0.a(optJSONArray2));
                    } else {
                        linkedHashSet.addAll(yx2.g);
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("stat_exceptions");
                    if (optJSONArray3 != null) {
                        linkedHashSet2.addAll(qaj0.a(optJSONArray3));
                    } else {
                        linkedHashSet2.addAll(yx2.h);
                    }
                    JSONArray optJSONArray4 = jSONObject.optJSONArray("heavy");
                    if (optJSONArray4 != null) {
                        linkedHashSet3.addAll(qaj0.a(optJSONArray4));
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("request_limit");
                    return new yx2(optBoolean, arrayList, linkedHashSet, linkedHashSet2, linkedHashSet3, new yx2.a(optJSONObject != null ? optJSONObject.optInt("count", 4) : 4, optJSONObject != null ? optJSONObject.optLong("time", 1000L) : 1000L));
                } catch (Exception e) {
                    L.i(e);
                    return yx2.i;
                }
            case 2:
                VKApplication.a aVar = VKApplication.c;
                return Boolean.valueOf(((com.vk.core.utils.newtork.d) obj) instanceof d.a);
            default:
                VKApplication.a aVar2 = VKApplication.c;
                com.vk.toggle.b.A.u(new jb3((gzs) obj, 8), null);
                return s3q0.a;
        }
    }
}
