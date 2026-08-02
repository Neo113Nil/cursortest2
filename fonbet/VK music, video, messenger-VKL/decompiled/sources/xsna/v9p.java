package xsna;

import androidx.media3.common.audio.AudioProcessor;
import com.google.common.collect.ImmutableList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Effects.java */
/* loaded from: classes12.dex */
public final class v9p {
    public static final v9p c;
    public final ImmutableList<AudioProcessor> a;
    public final ImmutableList<p8p> b;

    static {
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        c = new v9p(gVar, gVar);
    }

    public v9p(List<AudioProcessor> list, List<p8p> list2) {
        this.a = ImmutableList.m(list);
        this.b = ImmutableList.m(list2);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        ImmutableList<AudioProcessor> immutableList = this.a;
        boolean isEmpty = immutableList.isEmpty();
        ImmutableList<p8p> immutableList2 = this.b;
        if (isEmpty && immutableList2.isEmpty()) {
            return jSONObject;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < immutableList.size(); i++) {
            jSONArray.put(immutableList.get(i).getClass().getSimpleName());
        }
        try {
            jSONObject.put("audio", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (int i2 = 0; i2 < immutableList2.size(); i2++) {
                jSONArray2.put(immutableList2.get(i2).getClass().getSimpleName());
            }
            jSONObject.put("video", jSONArray2);
            return jSONObject;
        } catch (JSONException e) {
            ahn.G("JSON conversion failed.", e);
            return new JSONObject();
        }
    }

    public final String toString() {
        return a().toString();
    }
}
