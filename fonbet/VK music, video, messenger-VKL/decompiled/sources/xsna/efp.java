package xsna;

import android.util.SparseArray;
import com.vk.dto.stickers.StickerItem;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: EmptyChatWelcomeStickersGet.kt */
/* loaded from: classes2.dex */
public final class efp<Result> implements k7r0 {
    public final /* synthetic */ SparseArray<StickerItem> b;

    public efp(SparseArray<StickerItem> sparseArray) {
        this.b = sparseArray;
    }

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("response");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            StickerItem stickerItem = StickerItem.l;
            StickerItem a = StickerItem.a.a(jSONObject2);
            this.b.put(a.b, a);
            arrayList.add(s3q0.a);
        }
        return arrayList;
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
