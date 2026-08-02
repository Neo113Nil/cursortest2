package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.money.MoneyTransfer;
import com.vk.dto.money.TransferUserProfile;
import com.vk.dto.user.UserProfile;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: MoneyGetTransferList.java */
/* loaded from: classes15.dex */
public final class m730 extends pug0<MoneyTransfer> {

    /* compiled from: MoneyGetTransferList.java */
    public class a extends aay<MoneyTransfer> {
        public final /* synthetic */ HashMap a;

        public a(HashMap hashMap) {
            this.a = hashMap;
        }

        @Override // xsna.aay
        public final MoneyTransfer a(JSONObject jSONObject) throws JSONException {
            MoneyTransfer moneyTransfer = new MoneyTransfer(jSONObject);
            String valueOf = !moneyTransfer.f.isEmpty() ? moneyTransfer.f : String.valueOf(moneyTransfer.d);
            HashMap hashMap = this.a;
            UserProfile userProfile = (UserProfile) hashMap.get(valueOf);
            moneyTransfer.g = userProfile;
            if (userProfile == null) {
                moneyTransfer.g = new UserProfile();
            }
            UserProfile userProfile2 = (UserProfile) hashMap.get(!moneyTransfer.e.isEmpty() ? moneyTransfer.e : String.valueOf(moneyTransfer.i));
            moneyTransfer.h = userProfile2;
            if (userProfile2 == null) {
                moneyTransfer.h = new UserProfile();
            }
            return moneyTransfer;
        }
    }

    public m730(int i, UserId userId, int i2, int i3, int i4) {
        super("money.getTransferList");
        C(i, "type");
        if (userId.b != 0) {
            F(userId, "receiver_id");
        }
        C(i2, SignalingProtocol.KEY_OFFSET);
        C(i3, "count");
        C(1, "extended");
        C(i4, CommonUrlParts.REQUEST_ID);
        K("fields", "first_name_gen, last_name_gen, first_name_dat, last_name_dat,is_nft,photo_base");
    }

    @Override // xsna.pug0, xsna.oer0, xsna.k7r0
    /* renamed from: F0 */
    public final VKList<MoneyTransfer> a(JSONObject jSONObject) throws JSONException {
        JSONArray optJSONArray = jSONObject.getJSONObject("response").optJSONArray("profiles");
        JSONArray optJSONArray2 = jSONObject.getJSONObject("response").optJSONArray("groups");
        HashMap hashMap = new HashMap();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                TransferUserProfile transferUserProfile = new TransferUserProfile(optJSONArray.getJSONObject(i));
                String str = transferUserProfile.h0;
                if (str == null) {
                    str = String.valueOf(transferUserProfile.c.b);
                }
                hashMap.put(str, transferUserProfile);
            }
        }
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                UserProfile userProfile = new UserProfile(new Group(optJSONArray2.getJSONObject(i2)));
                hashMap.put(String.valueOf(userProfile.c), userProfile);
            }
        }
        return new VKList<>(jSONObject.getJSONObject("response"), new a(hashMap));
    }
}
