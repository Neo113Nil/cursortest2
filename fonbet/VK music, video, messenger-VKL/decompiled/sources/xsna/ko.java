package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.money.Fee;
import com.vk.dto.money.MoneyCard;
import com.vk.dto.money.MoneyGetCardsResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AccountGetPushSettings.kt */
/* loaded from: classes14.dex */
public final class ko extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(int i) {
        super("account.getPushSettings");
        this.s = i;
        switch (i) {
            case 1:
                super("money.getCards");
                C(1, "p2p_cards");
                C(1, "with_p2p_fee");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        Collection collection;
        MoneyCard moneyCard;
        MoneyCard moneyCard2;
        switch (this.s) {
            case 0:
                return jSONObject.getJSONObject("response").getJSONObject("settings");
            case 1:
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                Serializer.c<MoneyGetCardsResult> cVar = MoneyGetCardsResult.CREATOR;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("cards");
                JSONArray optJSONArray = optJSONObject2 != null ? optJSONObject2.optJSONArray("items") : null;
                if (optJSONArray != null) {
                    collection = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                        if (optJSONObject3 != null) {
                            MoneyCard moneyCard3 = MoneyCard.f;
                            String optString = optJSONObject3.optString("id");
                            String optString2 = optJSONObject3.optString("number");
                            String optString3 = optJSONObject3.optString("type");
                            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("fee");
                            collection.add(new MoneyCard(optString, optString2, optString3, optJSONObject4 != null ? new Fee(optJSONObject4.optInt("min_amount"), optJSONObject4.optInt("add_amount"), optJSONObject4.optInt("free_amount_min"), optJSONObject4.optDouble("percent"), optJSONObject4.optInt("free_amount_rest")) : null));
                        }
                    }
                } else {
                    collection = 0;
                }
                if (collection == 0) {
                    collection = EmptyList.b;
                }
                String optString4 = optJSONObject.optString("selected_card");
                if (!drm0.N(optString4) || collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ?? next = it.next();
                            if (epx.f(((MoneyCard) next).b, optString4)) {
                                moneyCard = next;
                            }
                        } else {
                            moneyCard = null;
                        }
                    }
                    moneyCard2 = moneyCard;
                    if (moneyCard2 == null) {
                        moneyCard2 = MoneyCard.f;
                    }
                } else {
                    moneyCard2 = (MoneyCard) collection.get(0);
                }
                return new MoneyGetCardsResult(collection, moneyCard2);
            default:
                JSONObject optJSONObject5 = jSONObject.optJSONObject("response");
                Map e = vj90.e(optJSONObject5);
                JSONArray optJSONArray2 = optJSONObject5 != null ? optJSONObject5.optJSONArray("data") : null;
                if (optJSONArray2 == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList(optJSONArray2.length());
                int length2 = optJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    arrayList.add(com.vkontakte.android.attachments.a.c(optJSONArray2.getJSONObject(i2), e, null));
                }
                return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko(ArrayList arrayList) {
        super("wall.parseAttachedLink");
        this.s = 2;
        K("links", kvf.a(arrayList).toString());
        K("fields", "video_files");
        K("extended", "1");
    }
}
