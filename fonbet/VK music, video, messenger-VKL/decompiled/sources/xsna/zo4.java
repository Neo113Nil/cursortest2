package xsna;

import android.text.TextUtils;
import com.vk.dto.money.MoneyTransferLinks;
import com.vk.dto.music.MusicTrack;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AudioGetById.java */
/* loaded from: classes14.dex */
public final class zo4 extends rsg0 {
    public final /* synthetic */ int s = 2;

    public zo4() {
        super("money.getTransferLinks");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = jSONObject.optJSONArray("response");
                    if (optJSONArray == null) {
                        return arrayList;
                    }
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(new MusicTrack(optJSONArray.getJSONObject(i)));
                    }
                    return arrayList;
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                return new ft(jSONObject2.getString("link"), jSONObject2.getString("version"), jSONObject2.getString("hash"));
            default:
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                return new MoneyTransferLinks(optJSONObject.optString("public_link"), optJSONObject.optString("anonymous_link"));
        }
    }

    public zo4(String str) {
        super("account.getZSTDDict");
        if (str != null) {
            K("version", str);
        }
    }

    public zo4(List list) {
        super("audio.getById");
        K("audios", TextUtils.join(StringUtils.COMMA, list));
    }
}
