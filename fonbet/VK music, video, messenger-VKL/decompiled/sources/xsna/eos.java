package xsna;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.privacy.ListFriends;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: FriendsDelete.java */
/* loaded from: classes14.dex */
public final class eos extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eos(String str) {
        super(str);
        this.s = 2;
    }

    public void F0(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("ref", str);
    }

    public void H0(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        K("track_code", str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        ox6 ox6Var;
        ArrayList arrayList3;
        String str;
        String str2;
        JSONObject optJSONObject;
        switch (this.s) {
            case 0:
                try {
                    return Integer.valueOf(jSONObject.getJSONObject("response").getInt("success"));
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                List<T> list2 = tav0.a(jSONObject2.optJSONObject("bestFriends"), new ci3(29)).b;
                List<T> list3 = tav0.a(jSONObject2.optJSONObject("hints"), new nyq(3)).b;
                JSONArray optJSONArray = jSONObject2.optJSONArray("conversations");
                if (optJSONArray != null) {
                    arrayList = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject(SignalingProtocol.KEY_CONVERSATION);
                        if (optJSONObject2 != null) {
                            long optLong = optJSONObject2.optLong("id");
                            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("chat_settings");
                            if (optJSONObject3 == null || (str = optJSONObject3.optString("title")) == null) {
                                str = "";
                            }
                            String str3 = str;
                            int optInt = optJSONObject3 != null ? optJSONObject3.optInt("friends_count") : 0;
                            if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject("photo")) == null) {
                                str2 = null;
                            } else {
                                float f = iah0.f().density;
                                str2 = optJSONObject.optString("photo_base", optJSONObject.optString((f >= 2.0f || fnj.b(vx2.d.getContext())) ? "photo_200" : f > 1.0f ? "photo_100" : "photo_50"));
                            }
                            ox6Var = new ox6(optInt, str3, str2, optLong);
                        } else {
                            ox6Var = null;
                        }
                        JSONArray optJSONArray2 = jSONObject3.optJSONArray("friends");
                        if (optJSONArray2 != null) {
                            arrayList3 = new ArrayList(optJSONArray2.length());
                            int length2 = optJSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                arrayList3.add(new UserProfile(optJSONArray2.getJSONObject(i2)));
                            }
                        } else {
                            arrayList3 = null;
                        }
                        mnh0 mnh0Var = (ox6Var == null || arrayList3 == null) ? null : new mnh0();
                        if (mnh0Var != null) {
                            arrayList.add(mnh0Var);
                        }
                    }
                } else {
                    arrayList = new ArrayList();
                }
                JSONObject optJSONObject4 = jSONObject2.optJSONObject("friendsLists");
                JSONArray optJSONArray3 = optJSONObject4 != null ? optJSONObject4.optJSONArray("items") : null;
                Serializer.c<ListFriends> cVar = ListFriends.CREATOR;
                if (optJSONArray3 != null) {
                    arrayList2 = new ArrayList(optJSONArray3.length());
                    int length3 = optJSONArray3.length();
                    for (int i3 = 0; i3 < length3; i3++) {
                        JSONObject optJSONObject5 = optJSONArray3.optJSONObject(i3);
                        if (optJSONObject5 != null) {
                            arrayList2.add(ListFriends.a.a(optJSONObject5));
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null || (list = j5g.O0(arrayList2)) == null) {
                    list = EmptyList.b;
                }
                return new lqs(list2, list3, arrayList, list);
            case 2:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
            default:
                ArrayList E = dz5.E(jSONObject.optJSONArray("response"));
                return E != null ? E : EmptyList.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eos() {
        super("execute.bestFriendsGet");
        this.s = 1;
        C(1, "extended");
        C(5, "func_v");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eos(UserId userId, int i) {
        super("friends.delete");
        this.s = i;
        switch (i) {
            case 3:
                super("store.getStickerPacksAvailableForGift");
                F(userId, "user_id");
                break;
            default:
                F(userId, "user_id");
                break;
        }
    }
}
