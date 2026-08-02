package xsna;

import android.util.ArrayMap;
import android.util.SparseArray;
import com.vk.api.parsers.BadgesParsers;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveType;
import com.vk.log.L;
import com.vkontakte.android.attachments.PodcastAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FaveResponseEntries.kt */
/* loaded from: classes18.dex */
public final class iqq {
    public final List<FaveItem> a;
    public final Integer b;
    public final int c;
    public final String d;

    /* compiled from: FaveResponseEntries.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
        public static iqq a(JSONObject jSONObject) {
            Integer num;
            EmptyList emptyList;
            JSONArray jSONArray;
            int i;
            int i2;
            Collection collection;
            FaveType faveType;
            Object b;
            Object articleAttachment;
            CallProducerButton callProducerButton;
            ArrayList arrayList;
            JSONArray jSONArray2;
            Map e = vj90.e(jSONObject);
            ArrayMap r = tci.r(jSONObject);
            SparseArray<BadgeItem> b2 = BadgesParsers.b(jSONObject);
            JSONArray jSONArray3 = jSONObject.getJSONArray("items");
            if (jSONArray3 != null) {
                ?? arrayList2 = new ArrayList(jSONArray3.length());
                int length = jSONArray3.length();
                int i3 = 0;
                while (i3 < length) {
                    JSONObject optJSONObject = jSONArray3.optJSONObject(i3);
                    if (optJSONObject != null) {
                        Serializer.c<FaveItem> cVar = FaveItem.CREATOR;
                        String optString = optJSONObject.optString("type");
                        boolean optBoolean = optJSONObject.optBoolean("seen");
                        long optLong = optJSONObject.optLong("added_date");
                        JSONArray jSONArray4 = optJSONObject.getJSONArray("tags");
                        if (jSONArray4 != null) {
                            collection = new ArrayList(jSONArray4.length());
                            int length2 = jSONArray4.length();
                            int i4 = 0;
                            while (i4 < length2) {
                                JSONObject optJSONObject2 = jSONArray4.optJSONObject(i4);
                                if (optJSONObject2 != null) {
                                    Serializer.c<FaveTag> cVar2 = FaveTag.CREATOR;
                                    jSONArray2 = jSONArray4;
                                    collection.add(FaveTag.a.a(optJSONObject2));
                                } else {
                                    jSONArray2 = jSONArray4;
                                }
                                i4++;
                                jSONArray4 = jSONArray2;
                            }
                        } else {
                            collection = 0;
                        }
                        if (collection == 0) {
                            collection = EmptyList.b;
                        }
                        FaveType.Companion.getClass();
                        FaveType[] values = FaveType.values();
                        int length3 = values.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length3) {
                                faveType = values[i5];
                                FaveType[] faveTypeArr = values;
                                if (!epx.f(faveType.h(), optString)) {
                                    i5++;
                                    values = faveTypeArr;
                                }
                            } else {
                                faveType = null;
                            }
                        }
                        if (faveType == null) {
                            throw new IllegalStateException(zr.a("Can't convert ", optString, " to favable"));
                        }
                        JSONArray jSONArray5 = jSONArray3;
                        switch (nqq.$EnumSwitchMapping$0[faveType.ordinal()]) {
                            case 1:
                                i = length;
                                jSONArray = jSONArray5;
                                i2 = i3;
                                b = p6c0.b(optJSONObject.getJSONObject(FaveType.POST.h()), r, b2, e, 16);
                                arrayList2.add(new FaveItem(optString, optBoolean, optLong, new ArrayList(collection), (gmq) b));
                                break;
                            case 2:
                            case 3:
                                i = length;
                                jSONArray = jSONArray5;
                                i2 = i3;
                                b = com.vkontakte.android.attachments.a.c(optJSONObject, e, null);
                                arrayList2.add(new FaveItem(optString, optBoolean, optLong, new ArrayList(collection), (gmq) b));
                                break;
                            case 4:
                                i = length;
                                jSONArray = jSONArray5;
                                i2 = i3;
                                JSONObject jSONObject2 = optJSONObject.getJSONObject(FaveType.ARTICLE.h());
                                articleAttachment = new ArticleAttachment(vj90.a(jSONObject2, (Owner) ((LinkedHashMap) e).get(new UserId(jSONObject2.optLong("owner_id", 0L)))));
                                b = articleAttachment;
                                arrayList2.add(new FaveItem(optString, optBoolean, optLong, new ArrayList(collection), (gmq) b));
                                break;
                            case 5:
                                i = length;
                                jSONArray = jSONArray5;
                                i2 = i3;
                                try {
                                    b = SnippetAttachment.Ib(optJSONObject.getJSONObject(FaveType.LINK.h()), e);
                                } catch (Throwable th) {
                                    L.g("Can't correct parse link for fave", th);
                                    String string = optJSONObject.getJSONObject(FaveType.LINK.h()).getString("url");
                                    if (string == null || string.length() == 0) {
                                        L.l("Can't create fave link without link!");
                                    }
                                    b = gnq.g(null, string, true);
                                }
                                arrayList2.add(new FaveItem(optString, optBoolean, optLong, new ArrayList(collection), (gmq) b));
                                break;
                            case 6:
                                i = length;
                                jSONArray = jSONArray5;
                                Good good = new Good(optJSONObject.getJSONObject(FaveType.PRODUCT.h()), e);
                                JSONObject optJSONObject3 = optJSONObject.optJSONObject("product_extras");
                                if (optJSONObject3 != null) {
                                    CallProducerButton.a aVar = CallProducerButton.n;
                                    JSONArray optJSONArray = optJSONObject3.optJSONArray("buttons");
                                    if (optJSONArray != null) {
                                        int length4 = optJSONArray.length();
                                        arrayList = new ArrayList(length4);
                                        i2 = i3;
                                        for (int i6 = 0; i6 < length4; i6++) {
                                            JSONObject optJSONObject4 = optJSONArray.optJSONObject(i6);
                                            if (optJSONObject4 != null) {
                                                try {
                                                    arrayList.add(aVar.a(optJSONObject4));
                                                } catch (Exception e2) {
                                                    L.i(e2);
                                                    s3q0 s3q0Var = s3q0.a;
                                                }
                                            }
                                        }
                                    } else {
                                        i2 = i3;
                                        arrayList = null;
                                    }
                                    if (arrayList != null) {
                                        callProducerButton = (CallProducerButton) j5g.a0(arrayList);
                                        articleAttachment = new FaveMarketItem(good, callProducerButton);
                                        b = articleAttachment;
                                        arrayList2.add(new FaveItem(optString, optBoolean, optLong, new ArrayList(collection), (gmq) b));
                                        break;
                                    }
                                } else {
                                    i2 = i3;
                                }
                                callProducerButton = null;
                                articleAttachment = new FaveMarketItem(good, callProducerButton);
                                b = articleAttachment;
                                arrayList2.add(new FaveItem(optString, optBoolean, optLong, new ArrayList(collection), (gmq) b));
                            case 7:
                                i = length;
                                jSONArray = jSONArray5;
                                JSONObject jSONObject3 = optJSONObject.getJSONObject(FaveType.PODCAST.h());
                                if (jSONObject3 != null) {
                                    MusicTrack musicTrack = new MusicTrack(jSONObject3);
                                    b = new PodcastAttachment(musicTrack, (Owner) ((LinkedHashMap) e).get(musicTrack.c));
                                } else {
                                    b = null;
                                }
                                i2 = i3;
                                arrayList2.add(new FaveItem(optString, optBoolean, optLong, new ArrayList(collection), (gmq) b));
                                break;
                            case 8:
                                JSONObject jSONObject4 = optJSONObject.getJSONObject(FaveType.NARRATIVE.h());
                                i = length;
                                jSONArray = jSONArray5;
                                Owner owner = (Owner) ((LinkedHashMap) e).get(new UserId(jSONObject4.optLong("owner_id", 0L)));
                                Serializer.c<Narrative> cVar3 = Narrative.CREATOR;
                                b = Narrative.a.c(jSONObject4, owner, r);
                                i2 = i3;
                                arrayList2.add(new FaveItem(optString, optBoolean, optLong, new ArrayList(collection), (gmq) b));
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        jSONArray = jSONArray3;
                        i = length;
                        i2 = i3;
                    }
                    i3 = i2 + 1;
                    length = i;
                    jSONArray3 = jSONArray;
                }
                num = null;
                emptyList = arrayList2;
            } else {
                num = null;
                emptyList = null;
            }
            if (emptyList == null) {
                emptyList = EmptyList.b;
            }
            int optInt = jSONObject.optInt("count_of_pages", -1);
            int optInt2 = jSONObject.optInt("count");
            String optString2 = jSONObject.optString("next_from");
            if (optInt >= 0) {
                num = Integer.valueOf(optInt);
            }
            return new iqq(optInt2, optString2, emptyList, num);
        }
    }

    public iqq(int i, String str, List list, Integer num) {
        this.a = list;
        this.b = num;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqq)) {
            return false;
        }
        iqq iqqVar = (iqq) obj;
        return epx.f(this.a, iqqVar.a) && epx.f(this.b, iqqVar.b) && this.c == iqqVar.c && epx.f(this.d, iqqVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int a2 = shy.a(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.d;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveGetResult(items=");
        sb.append(this.a);
        sb.append(", countOfPages=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.d, ')');
    }
}
