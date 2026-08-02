package xsna;

import com.ironsource.X3;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.OccupationType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.InvisibleLastSeenStatus;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserSex;
import com.vk.dto.user.VisibleStatus;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserDeactivationStatus;
import com.vk.im.engine.models.users.UserNameCase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserApiParser.kt */
/* loaded from: classes2.dex */
public final class jgq0 {
    public static final Object a;
    public static final Object b;

    /* compiled from: UserApiParser.kt */
    public static final class a {
        public final User a;
        public final String b;

        public a(User user, String str) {
            this.a = user;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserWithTrackcodeApiModel(user=");
            sb.append(this.a);
            sb.append(", trackcode=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: UserApiParser.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UsersOnlineInfoDto.StatusDto.values().length];
            try {
                iArr[UsersOnlineInfoDto.StatusDto.RECENTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UsersOnlineInfoDto.StatusDto.LAST_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UsersOnlineInfoDto.StatusDto.LAST_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UsersOnlineInfoDto.StatusDto.LONG_AGO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UsersOnlineInfoDto.StatusDto.NOT_SHOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: UserApiParser.kt */
    public static final class c {
    }

    static {
        UserNameCase userNameCase = UserNameCase.NOM;
        Pair pair = new Pair(userNameCase, "first_name");
        UserNameCase userNameCase2 = UserNameCase.GEN;
        Pair pair2 = new Pair(userNameCase2, "first_name_gen");
        UserNameCase userNameCase3 = UserNameCase.ACC;
        Pair pair3 = new Pair(userNameCase3, "first_name_acc");
        UserNameCase userNameCase4 = UserNameCase.DAT;
        a = pn00.k(pair, pair2, pair3, new Pair(userNameCase4, "first_name_dat"));
        b = pn00.k(new Pair(userNameCase, "last_name"), new Pair(userNameCase2, "last_name_gen"), new Pair(userNameCase3, "last_name_acc"), new Pair(userNameCase4, "last_name_dat"));
    }

    public static OnlineInfo a(UsersOnlineInfoDto usersOnlineInfoDto) {
        InvisibleLastSeenStatus invisibleLastSeenStatus;
        if (usersOnlineInfoDto == null) {
            return null;
        }
        if (usersOnlineInfoDto.f() == null) {
            long intValue = usersOnlineInfoDto.e() != null ? r0.intValue() * 1000 : 0L;
            Boolean j = usersOnlineInfoDto.j();
            boolean booleanValue = j != null ? j.booleanValue() : false;
            Integer d = usersOnlineInfoDto.d();
            int intValue2 = d != null ? d.intValue() : 0;
            Boolean i = usersOnlineInfoDto.i();
            return new VisibleStatus(intValue, booleanValue, intValue2, epx.f(i, Boolean.TRUE) ? Platform.MOBILE : epx.f(i, Boolean.FALSE) ? Platform.WEB : Platform.NONE);
        }
        UsersOnlineInfoDto.StatusDto f = usersOnlineInfoDto.f();
        int i2 = f == null ? -1 : b.$EnumSwitchMapping$0[f.ordinal()];
        if (i2 == -1) {
            invisibleLastSeenStatus = InvisibleLastSeenStatus.NONE;
        } else if (i2 == 1) {
            invisibleLastSeenStatus = InvisibleLastSeenStatus.RECENTLY;
        } else if (i2 == 2) {
            invisibleLastSeenStatus = InvisibleLastSeenStatus.LAST_WEEK;
        } else if (i2 == 3) {
            invisibleLastSeenStatus = InvisibleLastSeenStatus.LAST_MONTH;
        } else if (i2 == 4) {
            invisibleLastSeenStatus = InvisibleLastSeenStatus.LONG_AGO;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            invisibleLastSeenStatus = InvisibleLastSeenStatus.NOT_SHOW;
        }
        return new InvisibleStatus(invisibleLastSeenStatus);
    }

    public static int[] b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        List a2 = n6j.a(0, "\\.", str);
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return j5g.N0(arrayList);
    }

    public static UserDeactivationStatus c(String str) {
        return epx.f(str, "deleted") ? UserDeactivationStatus.DELETED : epx.f(str, "banned") ? UserDeactivationStatus.BANNED : UserDeactivationStatus.UNKNOWN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static String d(JSONObject jSONObject, UserNameCase userNameCase) {
        return jSONObject.optString((String) a.get(userNameCase), "");
    }

    public static final ArrayList e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(f(jSONArray.getJSONObject(i), 3));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01c7 A[Catch: JSONException -> 0x0256, TryCatch #0 {JSONException -> 0x0256, blocks: (B:3:0x0006, B:5:0x0017, B:7:0x0020, B:10:0x003c, B:11:0x0043, B:14:0x0066, B:17:0x0073, B:20:0x008a, B:22:0x00ca, B:24:0x00e0, B:26:0x00e8, B:27:0x00f1, B:29:0x00f9, B:30:0x0102, B:32:0x010a, B:33:0x0113, B:35:0x011b, B:36:0x0124, B:39:0x0132, B:41:0x0138, B:43:0x0143, B:45:0x014b, B:47:0x0151, B:49:0x015c, B:51:0x0162, B:53:0x016a, B:55:0x0174, B:62:0x0188, B:65:0x0191, B:67:0x01b1, B:69:0x01b7, B:71:0x01bf, B:74:0x01c7, B:76:0x01d2, B:78:0x01dd, B:79:0x01e7, B:82:0x01f4, B:84:0x0211, B:85:0x0213, B:88:0x0222, B:91:0x022f, B:100:0x0196, B:103:0x019f, B:104:0x01a2, B:107:0x01ab, B:108:0x01ae, B:119:0x00d1, B:121:0x00d9, B:127:0x0242, B:128:0x0255, B:129:0x0258, B:130:0x026b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d2 A[Catch: JSONException -> 0x0256, TryCatch #0 {JSONException -> 0x0256, blocks: (B:3:0x0006, B:5:0x0017, B:7:0x0020, B:10:0x003c, B:11:0x0043, B:14:0x0066, B:17:0x0073, B:20:0x008a, B:22:0x00ca, B:24:0x00e0, B:26:0x00e8, B:27:0x00f1, B:29:0x00f9, B:30:0x0102, B:32:0x010a, B:33:0x0113, B:35:0x011b, B:36:0x0124, B:39:0x0132, B:41:0x0138, B:43:0x0143, B:45:0x014b, B:47:0x0151, B:49:0x015c, B:51:0x0162, B:53:0x016a, B:55:0x0174, B:62:0x0188, B:65:0x0191, B:67:0x01b1, B:69:0x01b7, B:71:0x01bf, B:74:0x01c7, B:76:0x01d2, B:78:0x01dd, B:79:0x01e7, B:82:0x01f4, B:84:0x0211, B:85:0x0213, B:88:0x0222, B:91:0x022f, B:100:0x0196, B:103:0x019f, B:104:0x01a2, B:107:0x01ab, B:108:0x01ae, B:119:0x00d1, B:121:0x00d9, B:127:0x0242, B:128:0x0255, B:129:0x0258, B:130:0x026b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd A[Catch: JSONException -> 0x0256, TryCatch #0 {JSONException -> 0x0256, blocks: (B:3:0x0006, B:5:0x0017, B:7:0x0020, B:10:0x003c, B:11:0x0043, B:14:0x0066, B:17:0x0073, B:20:0x008a, B:22:0x00ca, B:24:0x00e0, B:26:0x00e8, B:27:0x00f1, B:29:0x00f9, B:30:0x0102, B:32:0x010a, B:33:0x0113, B:35:0x011b, B:36:0x0124, B:39:0x0132, B:41:0x0138, B:43:0x0143, B:45:0x014b, B:47:0x0151, B:49:0x015c, B:51:0x0162, B:53:0x016a, B:55:0x0174, B:62:0x0188, B:65:0x0191, B:67:0x01b1, B:69:0x01b7, B:71:0x01bf, B:74:0x01c7, B:76:0x01d2, B:78:0x01dd, B:79:0x01e7, B:82:0x01f4, B:84:0x0211, B:85:0x0213, B:88:0x0222, B:91:0x022f, B:100:0x0196, B:103:0x019f, B:104:0x01a2, B:107:0x01ab, B:108:0x01ae, B:119:0x00d1, B:121:0x00d9, B:127:0x0242, B:128:0x0255, B:129:0x0258, B:130:0x026b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0211 A[Catch: JSONException -> 0x0256, TryCatch #0 {JSONException -> 0x0256, blocks: (B:3:0x0006, B:5:0x0017, B:7:0x0020, B:10:0x003c, B:11:0x0043, B:14:0x0066, B:17:0x0073, B:20:0x008a, B:22:0x00ca, B:24:0x00e0, B:26:0x00e8, B:27:0x00f1, B:29:0x00f9, B:30:0x0102, B:32:0x010a, B:33:0x0113, B:35:0x011b, B:36:0x0124, B:39:0x0132, B:41:0x0138, B:43:0x0143, B:45:0x014b, B:47:0x0151, B:49:0x015c, B:51:0x0162, B:53:0x016a, B:55:0x0174, B:62:0x0188, B:65:0x0191, B:67:0x01b1, B:69:0x01b7, B:71:0x01bf, B:74:0x01c7, B:76:0x01d2, B:78:0x01dd, B:79:0x01e7, B:82:0x01f4, B:84:0x0211, B:85:0x0213, B:88:0x0222, B:91:0x022f, B:100:0x0196, B:103:0x019f, B:104:0x01a2, B:107:0x01ab, B:108:0x01ae, B:119:0x00d1, B:121:0x00d9, B:127:0x0242, B:128:0x0255, B:129:0x0258, B:130:0x026b), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static User f(JSONObject jSONObject, Integer num) {
        String str;
        String str2;
        OccupationType occupationType;
        JSONObject optJSONObject;
        SocialButtonType a2;
        try {
            UserId userId = new UserId(jSONObject.getLong("id"));
            if (!fkq0.d(userId)) {
                throw new VKApiIllegalResponseException("Illegal userId value: " + userId);
            }
            if (jSONObject.optBoolean("is_cached", false)) {
                throw new VKApiIllegalResponseException("There is no cached user with id:" + userId.b);
            }
            int[] b2 = b(f370.D(jSONObject, "bdate"));
            long j = userId.b;
            Long z = f370.z(jSONObject, "contact_id");
            String str3 = "";
            String string = jSONObject.has(X3.j.D) ? jSONObject.getString(X3.j.D) : "";
            UserSex.a aVar = UserSex.Companion;
            Integer valueOf = Integer.valueOf(jSONObject.optInt("sex", 0));
            aVar.getClass();
            UserSex a3 = UserSex.a.a(valueOf);
            ImageList a4 = pr5.a(jSONObject);
            boolean z2 = jSONObject.optInt("blacklisted") != 0;
            boolean z3 = jSONObject.optInt("blacklisted_by_me") != 0;
            UserDeactivationStatus c2 = c(jSONObject.optString("deactivated"));
            boolean z4 = jSONObject.optInt("verified") != 0;
            OnlineInfo h = h(jSONObject);
            UserNameCase userNameCase = UserNameCase.NOM;
            String d = d(jSONObject, userNameCase);
            String g = g(jSONObject, userNameCase);
            UserNameCase userNameCase2 = UserNameCase.ACC;
            String d2 = d(jSONObject, userNameCase2);
            String g2 = g(jSONObject, userNameCase2);
            UserNameCase userNameCase3 = UserNameCase.GEN;
            String d3 = d(jSONObject, userNameCase3);
            String g3 = g(jSONObject, userNameCase3);
            UserNameCase userNameCase4 = UserNameCase.DAT;
            String d4 = d(jSONObject, userNameCase4);
            String g4 = g(jSONObject, userNameCase4);
            boolean optBoolean = jSONObject.optBoolean("can_call", false);
            boolean optBoolean2 = jSONObject.optBoolean("is_service", false);
            boolean optBoolean3 = jSONObject.optBoolean("is_service_account", false);
            int intValue = num != null ? num.intValue() : jSONObject.has("friend_status") ? jSONObject.getInt("friend_status") : 0;
            String string2 = jSONObject.has("mobile_phone") ? jSONObject.getString("mobile_phone") : "";
            boolean z5 = jSONObject.has("is_closed") ? jSONObject.getBoolean("is_closed") : false;
            boolean z6 = jSONObject.has("can_access_closed") ? jSONObject.getBoolean("can_access_closed") : true;
            boolean z7 = jSONObject.has("can_invite_to_chats") ? jSONObject.getBoolean("can_invite_to_chats") : true;
            ImageStatus b3 = com.vk.dto.user.a.b(jSONObject);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("country");
            if (optJSONObject2 != null) {
                str = optJSONObject2.has("title") ? optJSONObject2.getString("title") : "";
            } else {
                str = "";
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("city");
            if (optJSONObject3 != null) {
                str2 = optJSONObject3.has("title") ? optJSONObject3.getString("title") : "";
            } else {
                str2 = "";
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("occupation");
            String string3 = optJSONObject4 != null ? optJSONObject4.has("type") ? optJSONObject4.getString("type") : "" : null;
            if (string3 != null) {
                int hashCode = string3.hashCode();
                if (hashCode != -907977868) {
                    if (hashCode != 3655441) {
                        if (hashCode == 189328014 && string3.equals("university")) {
                            occupationType = OccupationType.UNIVERSITY;
                        }
                    } else if (string3.equals("work")) {
                        occupationType = OccupationType.WORK;
                    }
                } else if (string3.equals("school")) {
                    occupationType = OccupationType.SCHOOL;
                }
                OccupationType occupationType2 = occupationType;
                optJSONObject = jSONObject.optJSONObject("occupation");
                if (optJSONObject != null && optJSONObject.has("name")) {
                    str3 = optJSONObject.getString("name");
                }
                String str4 = str3;
                Integer R = b2 == null ? rl3.R(0, b2) : null;
                Integer R2 = b2 == null ? rl3.R(1, b2) : null;
                Integer R3 = b2 == null ? rl3.R(2, b2) : null;
                boolean z8 = jSONObject.optInt("can_send_friend_request", 1) == 0;
                boolean optBoolean4 = jSONObject.optBoolean("is_nft");
                boolean optBoolean5 = jSONObject.optBoolean("is_verified");
                SocialButtonType.a aVar2 = SocialButtonType.Companion;
                String optString = jSONObject.optString("social_button_type");
                aVar2.getClass();
                a2 = SocialButtonType.a.a(optString);
                if (a2 == null) {
                    a2 = SocialButtonType.ADD;
                }
                return new User(j, z, null, null, string, a3, a4, z2, z3, c2, z4, optBoolean5, h, d, g, d2, g2, d3, g3, d4, g4, optBoolean, optBoolean2, optBoolean3, intValue, string2, z5, z6, z7, false, b3, null, str, str2, occupationType2, str4, R, R2, R3, z8, jSONObject.optInt("can_write_private_message", 1) == 0, optBoolean4, a2, jSONObject.optInt("is_adult") != 1, -2147483636, 0, null);
            }
            occupationType = OccupationType.UNKNOWN;
            OccupationType occupationType22 = occupationType;
            optJSONObject = jSONObject.optJSONObject("occupation");
            if (optJSONObject != null) {
                str3 = optJSONObject.getString("name");
            }
            String str42 = str3;
            if (b2 == null) {
            }
            if (b2 == null) {
            }
            if (b2 == null) {
            }
            if (jSONObject.optInt("can_send_friend_request", 1) == 0) {
            }
            boolean optBoolean42 = jSONObject.optBoolean("is_nft");
            boolean optBoolean52 = jSONObject.optBoolean("is_verified");
            SocialButtonType.a aVar22 = SocialButtonType.Companion;
            String optString2 = jSONObject.optString("social_button_type");
            aVar22.getClass();
            a2 = SocialButtonType.a.a(optString2);
            if (a2 == null) {
            }
            return new User(j, z, null, null, string, a3, a4, z2, z3, c2, z4, optBoolean52, h, d, g, d2, g2, d3, g3, d4, g4, optBoolean, optBoolean2, optBoolean3, intValue, string2, z5, z6, z7, false, b3, null, str, str2, occupationType22, str42, R, R2, R3, z8, jSONObject.optInt("can_write_private_message", 1) == 0, optBoolean42, a2, jSONObject.optInt("is_adult") != 1, -2147483636, 0, null);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static String g(JSONObject jSONObject, UserNameCase userNameCase) {
        return jSONObject.optString((String) b.get(userNameCase), "");
    }

    public static final OnlineInfo h(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("online_info");
        if (optJSONObject == null) {
            return VisibleStatus.f;
        }
        if (optJSONObject.getBoolean("visible")) {
            return new VisibleStatus(optJSONObject.optLong("last_seen") * 1000, optJSONObject.optBoolean("is_online"), optJSONObject.optInt("app_id"), optJSONObject.optBoolean("is_mobile") ? Platform.MOBILE : Platform.WEB);
        }
        InvisibleLastSeenStatus.a aVar = InvisibleLastSeenStatus.Companion;
        String optString = optJSONObject.optString("status");
        aVar.getClass();
        return new InvisibleStatus(InvisibleLastSeenStatus.a.b(optString));
    }
}
