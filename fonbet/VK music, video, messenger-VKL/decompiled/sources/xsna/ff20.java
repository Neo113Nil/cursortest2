package xsna;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.base.Document;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.money.CardTransferMethod;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.dto.money.SbpTransferMethod;
import com.vk.dto.money.VkPayTransferMethod;
import com.vk.dto.music.Section;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: MessagesGetRecentGraffities.java */
@Deprecated
/* loaded from: classes15.dex */
public final class ff20 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff20(String str, int i) {
        super(str);
        this.s = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ?? r10;
        Serializer.StreamParcelableAdapter sbpTransferMethod;
        ?? r102;
        List list;
        ArrayList arrayList = null;
        switch (this.s) {
            case 0:
                ArrayList arrayList2 = new ArrayList();
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("response");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList2.add(new Document(jSONArray.getJSONObject(i)));
                    }
                } catch (Exception unused) {
                }
                return arrayList2;
            case 1:
                try {
                    Section section = new Section(jSONObject.getJSONObject("response").getJSONObject("block"));
                    VKList vKList = new VKList();
                    vKList.o(section.g);
                    ArrayList<VideoFile> arrayList3 = section.o;
                    if (arrayList3 != null) {
                        vKList.addAll(arrayList3);
                    }
                    vKList.n(section.n);
                    return vKList;
                } catch (Exception e) {
                    L.i(e);
                    return null;
                }
            case 2:
                return new thz(jSONObject.getJSONObject("response").getInt("list_id"));
            default:
                JSONArray optJSONArray = jSONObject.optJSONArray("items");
                if (optJSONArray != null) {
                    ArrayList arrayList4 = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                        if (optJSONObject != null) {
                            String string = optJSONObject.getString("type");
                            if (string != null) {
                                int hashCode = string.hashCode();
                                if (hashCode != 113665) {
                                    if (hashCode != 94431075) {
                                        if (hashCode == 112273875 && string.equals("vkpay")) {
                                            Serializer.c<VkPayTransferMethod> cVar = VkPayTransferMethod.CREATOR;
                                            String string2 = optJSONObject.getString("type");
                                            boolean optBoolean = optJSONObject.optBoolean("enabled");
                                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("receivers");
                                            if (optJSONArray2 != null) {
                                                list = new ArrayList(optJSONArray2.length());
                                                int length2 = optJSONArray2.length();
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                                                    if (optJSONObject2 != null) {
                                                        Serializer.c<MoneyReceiverInfo> cVar2 = MoneyReceiverInfo.CREATOR;
                                                        list.add(MoneyReceiverInfo.a.a(optJSONObject2));
                                                    }
                                                }
                                            } else {
                                                list = 0;
                                            }
                                            if (list == 0) {
                                                list = EmptyList.b;
                                            }
                                            sbpTransferMethod = new VkPayTransferMethod(string2, optBoolean, list, f370.D(optJSONObject, "status"), optJSONObject.optInt("balance", -1), optJSONObject.optString(InAppPurchaseMetaData.KEY_CURRENCY), optJSONObject.optInt("max_receive_amount"));
                                            arrayList4.add(sbpTransferMethod);
                                        }
                                    } else if (string.equals("cards")) {
                                        Serializer.c<CardTransferMethod> cVar3 = CardTransferMethod.CREATOR;
                                        String string3 = optJSONObject.getString("type");
                                        boolean optBoolean2 = optJSONObject.optBoolean("enabled");
                                        JSONArray optJSONArray3 = optJSONObject.optJSONArray("receivers");
                                        if (optJSONArray3 != null) {
                                            r102 = new ArrayList(optJSONArray3.length());
                                            int length3 = optJSONArray3.length();
                                            for (int i4 = 0; i4 < length3; i4++) {
                                                JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i4);
                                                if (optJSONObject3 != null) {
                                                    Serializer.c<MoneyReceiverInfo> cVar4 = MoneyReceiverInfo.CREATOR;
                                                    r102.add(MoneyReceiverInfo.a.a(optJSONObject3));
                                                }
                                            }
                                        } else {
                                            r102 = 0;
                                        }
                                        if (r102 == 0) {
                                            r102 = EmptyList.b;
                                        }
                                        sbpTransferMethod = new CardTransferMethod(string3, optBoolean2, r102);
                                        arrayList4.add(sbpTransferMethod);
                                    }
                                } else if (string.equals("sbp")) {
                                    String string4 = optJSONObject.getString("type");
                                    boolean optBoolean3 = optJSONObject.optBoolean("enabled");
                                    JSONArray optJSONArray4 = optJSONObject.optJSONArray("receivers");
                                    if (optJSONArray4 != null) {
                                        r10 = new ArrayList(optJSONArray4.length());
                                        int length4 = optJSONArray4.length();
                                        for (int i5 = 0; i5 < length4; i5++) {
                                            JSONObject optJSONObject4 = optJSONArray4.optJSONObject(i5);
                                            if (optJSONObject4 != null) {
                                                Serializer.c<MoneyReceiverInfo> cVar5 = MoneyReceiverInfo.CREATOR;
                                                r10.add(MoneyReceiverInfo.a.a(optJSONObject4));
                                            }
                                        }
                                    } else {
                                        r10 = 0;
                                    }
                                    if (r10 == 0) {
                                        r10 = EmptyList.b;
                                    }
                                    sbpTransferMethod = new SbpTransferMethod(string4, optBoolean3, r10);
                                    arrayList4.add(sbpTransferMethod);
                                }
                            }
                            throw new IllegalArgumentException("Unknown type");
                        }
                    }
                    arrayList = arrayList4;
                }
                return arrayList != null ? arrayList : EmptyList.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff20() {
        super("messages.getRecentGraffities");
        this.s = 0;
        C(20, SignalingProtocol.KEY_LIMIT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff20(bp4 bp4Var) {
        super("audio.getCatalogBlockById");
        this.s = 1;
    }
}
