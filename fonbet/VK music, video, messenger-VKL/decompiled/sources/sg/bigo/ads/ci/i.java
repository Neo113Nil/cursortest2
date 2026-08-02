package sg.bigo.ads.ci;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.an.f;

/* loaded from: classes9.dex */
public final class i extends sg.bigo.ads.an.e {
    public String a;
    private Map<String, j> b;

    public i(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.an.e
    public final String a() {
        return "bigoad_slots.dat";
    }

    @Override // sg.bigo.ads.an.e
    public final String b() {
        return "SlotData";
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Map<String, j> map = this.b;
        if (map != null) {
            for (j jVar : map.values()) {
                if (sb.length() > 0) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append(jVar);
            }
        }
        return "SlotData[" + sb.toString() + ']';
    }

    @Nullable
    public final n a(String str) {
        Map<String, j> map = this.b;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        List<j> a = sg.bigo.ads.an.n.a(parcel, new f.a<j>() { // from class: sg.bigo.ads.ci.i.1
            @Override // sg.bigo.ads.an.f.a
            public final /* synthetic */ j a() {
                return new j();
            }
        });
        HashMap hashMap = new HashMap();
        for (j jVar : a) {
            hashMap.put(jVar.l(), jVar);
        }
        this.b = hashMap;
        this.a = sg.bigo.ads.an.n.a(parcel, "");
    }

    @Nullable
    public final n a(@NonNull sg.bigo.ads.api.b bVar) {
        n i = bVar.i();
        return i != null ? i : a(bVar.d());
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        Map<String, j> map = this.b;
        if (map != null) {
            arrayList.addAll(map.values());
        }
        sg.bigo.ads.an.n.a(parcel, arrayList);
        parcel.writeString(this.a);
    }

    public final void a(@NonNull JSONArray jSONArray, String str) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            j jVar = new j();
            if (jVar.a(optJSONObject)) {
                hashMap.put(jVar.l(), jVar);
            }
        }
        this.b = hashMap;
        this.a = str;
    }
}
