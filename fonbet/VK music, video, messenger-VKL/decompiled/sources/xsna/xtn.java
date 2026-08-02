package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.base.Document;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: DocsSearch.java */
/* loaded from: classes14.dex */
public final class xtn extends rsg0<a> {
    public final UserId s;
    public final int t;
    public final int u;
    public final String v;

    /* compiled from: DocsSearch.java */
    public static class a {
        public final List<Document> a;
        public final int b;
        public final boolean c;
        public final String d;
        public final int e;

        public a(int i, String str, int i2, boolean z, List list) {
            this.a = list;
            this.b = i;
            this.c = z;
            this.d = str;
            this.e = i2;
        }
    }

    public xtn(int i, UserId userId, int i2, @NonNull String str) {
        super("docs.search");
        K(CampaignEx.JSON_KEY_AD_Q, str);
        C(1, "search_own");
        K(SignalingProtocol.KEY_OFFSET, String.valueOf(i));
        C(i2, "count");
        this.v = str;
        this.t = i;
        this.u = i2;
        this.s = userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    @Override // xsna.oer0, xsna.k7r0
    @Nullable
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        ArrayList arrayList;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("response");
            int optInt = optJSONObject.optInt("count");
            JSONArray optJSONArray = optJSONObject.optJSONArray("items");
            if (optJSONArray == null) {
                arrayList = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(optJSONArray.length());
                for (int i = 0; i != optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null) {
                        arrayList2.add(new Document(optJSONObject2));
                    }
                }
                arrayList = arrayList2;
            }
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext() && ((Document) it.next()).h.equals(this.s)) {
                i2++;
            }
            return new a(i2, this.v, optInt, this.t + this.u < optInt, arrayList);
        } catch (Exception unused) {
            return null;
        }
    }
}
