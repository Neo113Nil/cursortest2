package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.clips.sdk.shared.questionnarie.QuestionDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionLayoutDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionRootLayoutDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionTargetDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionValueDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionnaireDto;
import com.vk.clips.sdk.shared.questionnarie.QuestionnaireTriggerDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: QuestionnairesParser.kt */
/* loaded from: classes14.dex */
public final class fqe0 {
    public static final a a = new a();

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<QuestionnaireDto> {
        @Override // xsna.aay
        public final QuestionnaireDto a(JSONObject jSONObject) {
            return fqe0.a(jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static QuestionnaireDto a(JSONObject jSONObject) {
        ArrayList arrayList;
        List list;
        List list2;
        String str;
        JSONArray jSONArray;
        String str2;
        String str3;
        ArrayList arrayList2;
        List list3;
        String str4;
        JSONArray jSONArray2;
        int i;
        List list4;
        String str5;
        String string = jSONObject.getString("id");
        String string2 = jSONObject.getString("start_question_code");
        String str6 = TtmlNode.TAG_LAYOUT;
        JSONObject optJSONObject = jSONObject.optJSONObject(TtmlNode.TAG_LAYOUT);
        QuestionRootLayoutDto questionRootLayoutDto = optJSONObject == null ? null : new QuestionRootLayoutDto(optJSONObject.getString("title"), optJSONObject.getString("text"), optJSONObject.getString("completion_title"), optJSONObject.getString("completion_text"));
        JSONArray optJSONArray = jSONObject.optJSONArray("questions");
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            int i2 = 0;
            while (i2 < length) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    String string3 = optJSONObject2.getString("type");
                    String string4 = optJSONObject2.getString("code");
                    JSONObject jSONObject2 = optJSONObject2.getJSONObject(str6);
                    str = str6;
                    jSONArray = optJSONArray;
                    QuestionLayoutDto questionLayoutDto = new QuestionLayoutDto(jSONObject2.getString("text"), jSONObject2.optString("like", ""), jSONObject2.optString("dislike", ""));
                    String str7 = "values";
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("values");
                    if (optJSONArray2 != null) {
                        arrayList2 = new ArrayList(optJSONArray2.length());
                        int length2 = optJSONArray2.length();
                        int i3 = 0;
                        while (i3 < length2) {
                            String str8 = string;
                            JSONObject optJSONObject3 = optJSONArray2.optJSONObject(i3);
                            JSONArray jSONArray3 = optJSONArray2;
                            if (optJSONObject3 != null) {
                                str5 = string2;
                                arrayList2.add(new QuestionValueDto(optJSONObject3.getString("value"), optJSONObject3.getString("text")));
                            } else {
                                str5 = string2;
                            }
                            i3++;
                            optJSONArray2 = jSONArray3;
                            string = str8;
                            string2 = str5;
                        }
                    } else {
                        arrayList2 = null;
                    }
                    str2 = string;
                    str3 = string2;
                    List list5 = arrayList2;
                    if (arrayList2 == null) {
                        list5 = EmptyList.b;
                    }
                    List list6 = list5;
                    JSONArray optJSONArray3 = optJSONObject2.optJSONArray("targets");
                    if (optJSONArray3 != null) {
                        list3 = new ArrayList(optJSONArray3.length());
                        int length3 = optJSONArray3.length();
                        int i4 = 0;
                        while (i4 < length3) {
                            JSONObject optJSONObject4 = optJSONArray3.optJSONObject(i4);
                            if (optJSONObject4 != null) {
                                String string5 = optJSONObject4.getString("next_question_code");
                                JSONArray optJSONArray4 = optJSONObject4.optJSONArray(str7);
                                if (optJSONArray4 == null) {
                                    list4 = EmptyList.b;
                                    str4 = str7;
                                    jSONArray2 = optJSONArray3;
                                    i = length3;
                                } else {
                                    str4 = str7;
                                    ArrayList arrayList3 = new ArrayList();
                                    jSONArray2 = optJSONArray3;
                                    i = length3;
                                    int i5 = 0;
                                    for (int length4 = optJSONArray4.length(); i5 < length4; length4 = length4) {
                                        i5 = wq.b(optJSONArray4, i5, arrayList3, i5, 1);
                                    }
                                    list4 = arrayList3;
                                }
                                list3.add(new QuestionTargetDto(string5, (List<String>) list4));
                            } else {
                                str4 = str7;
                                jSONArray2 = optJSONArray3;
                                i = length3;
                            }
                            i4++;
                            str7 = str4;
                            optJSONArray3 = jSONArray2;
                            length3 = i;
                        }
                    } else {
                        list3 = 0;
                    }
                    if (list3 == 0) {
                        list3 = EmptyList.b;
                    }
                    arrayList.add(new QuestionDto(string3, string4, questionLayoutDto, list6, list3));
                } else {
                    str = str6;
                    jSONArray = optJSONArray;
                    str2 = string;
                    str3 = string2;
                }
                i2++;
                str6 = str;
                optJSONArray = jSONArray;
                string = str2;
                string2 = str3;
            }
        } else {
            arrayList = null;
        }
        String str9 = string;
        String str10 = string2;
        List list7 = arrayList;
        if (arrayList == null) {
            list7 = EmptyList.b;
        }
        List list8 = list7;
        JSONArray optJSONArray5 = jSONObject.optJSONArray("triggers");
        if (optJSONArray5 != null) {
            list = new ArrayList(optJSONArray5.length());
            int length5 = optJSONArray5.length();
            for (int i6 = 0; i6 < length5; i6++) {
                JSONObject optJSONObject5 = optJSONArray5.optJSONObject(i6);
                if (optJSONObject5 != null) {
                    String string6 = optJSONObject5.getString("type");
                    JSONArray optJSONArray6 = optJSONObject5.optJSONArray("item_ids");
                    if (optJSONArray6 == null) {
                        list2 = EmptyList.b;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        int length6 = optJSONArray6.length();
                        for (int i7 = 0; i7 < length6; i7 = wq.b(optJSONArray6, i7, arrayList4, i7, 1)) {
                        }
                        list2 = arrayList4;
                    }
                    list.add(new QuestionnaireTriggerDto(string6, (List<String>) list2));
                }
            }
        } else {
            list = 0;
        }
        if (list == 0) {
            list = EmptyList.b;
        }
        return new QuestionnaireDto(str9, str10, questionRootLayoutDto, list8, list);
    }
}
