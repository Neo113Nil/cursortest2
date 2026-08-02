package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.groups.AgeLimits;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.GroupDeactivation;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.engine.models.groups.GroupStatus;
import com.vk.im.engine.models.groups.GroupType;
import com.vk.im.engine.models.groups.WarningNotification;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GroupApiParser.kt */
/* loaded from: classes2.dex */
public final class ygu {
    /* JADX WARN: Removed duplicated region for block: B:100:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070 A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5 A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8 A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb A[Catch: JSONException -> 0x01f8, TRY_ENTER, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0158 A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0 A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d5 A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7 A[Catch: JSONException -> 0x01f8, TryCatch #0 {JSONException -> 0x01f8, blocks: (B:3:0x0006, B:5:0x002d, B:12:0x0041, B:14:0x0049, B:16:0x0068, B:18:0x0070, B:22:0x007c, B:24:0x0084, B:27:0x008f, B:29:0x0097, B:32:0x00a4, B:34:0x00aa, B:36:0x00b4, B:37:0x00cf, B:39:0x00d5, B:40:0x00e0, B:42:0x00e8, B:43:0x00f1, B:46:0x00fb, B:47:0x0104, B:50:0x0137, B:52:0x0158, B:65:0x018e, B:68:0x019d, B:70:0x01c0, B:71:0x01c6, B:73:0x01d5, B:75:0x01dd, B:76:0x01e8, B:91:0x00b7, B:93:0x00bf, B:94:0x00c2, B:96:0x00ca, B:97:0x00cd, B:105:0x004d, B:108:0x0056, B:109:0x0059, B:112:0x0062, B:113:0x0065), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Group a(JSONObject jSONObject) throws VKApiException {
        GroupType groupType;
        boolean z;
        JSONObject optJSONObject;
        try {
            int optInt = jSONObject.optInt("trust_mark", 0);
            long abs = Math.abs(jSONObject.getLong("id"));
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("screen_name");
            ImageList a = pr5.a(jSONObject);
            String string3 = jSONObject.getString("type");
            if (string3 != null) {
                int hashCode = string3.hashCode();
                if (hashCode != 3433103) {
                    if (hashCode != 96891546) {
                        if (hashCode == 98629247 && string3.equals("group")) {
                            groupType = GroupType.GROUP;
                            GroupType groupType2 = groupType;
                            boolean z2 = (!jSONObject.has("verified") ? jSONObject.getInt("verified") : 0) != 1;
                            boolean z3 = (!jSONObject.has("is_messages_blocked") ? jSONObject.getInt("is_messages_blocked") : 0) != 0;
                            boolean z4 = (!jSONObject.has("can_send_notify") ? jSONObject.getInt("can_send_notify") : 1) != 1;
                            JSONObject optJSONObject2 = jSONObject.optJSONObject("online_status");
                            String optString = optJSONObject2 == null ? optJSONObject2.optString("status") : null;
                            GroupStatus groupStatus = optString != null ? GroupStatus.NONE : optString.equals(eok.ONLINE_EXTRAS_KEY) ? GroupStatus.ONLINE : optString.equals("answer_mark") ? GroupStatus.ANSWER_MARK : GroupStatus.NONE;
                            JSONObject optJSONObject3 = jSONObject.optJSONObject("online_status");
                            int optInt2 = optJSONObject3 == null ? optJSONObject3.optInt("minutes", 0) : 0;
                            int i = !jSONObject.has("members_count") ? jSONObject.getInt("members_count") : 0;
                            String string4 = !jSONObject.has("activity") ? jSONObject.getString("activity") : "";
                            boolean optBoolean = jSONObject.optBoolean("is_nft_photo");
                            int optInt3 = jSONObject.optInt("member_status", 0);
                            AdminLevel.a aVar = AdminLevel.Companion;
                            Integer valueOf = Integer.valueOf(jSONObject.optInt("admin_level", 0));
                            aVar.getClass();
                            AdminLevel a2 = AdminLevel.a.a(valueOf);
                            String optString2 = jSONObject.optString("description", "");
                            boolean z5 = jSONObject.optInt("can_message", 0) != 1;
                            GroupPrivacy.a aVar2 = GroupPrivacy.Companion;
                            int optInt4 = jSONObject.optInt("is_closed", 1);
                            aVar2.getClass();
                            GroupPrivacy a3 = GroupPrivacy.a.a(optInt4);
                            String optString3 = jSONObject.optString("url", "");
                            GroupDeactivation groupDeactivation = !myc0.f(jSONObject.optString("deactivated")) ? new GroupDeactivation(jSONObject.optString("deactivated"), jSONObject.optString("deactivated_message"), jSONObject.optString("deactivated_type")) : null;
                            boolean z6 = optInt != 2;
                            boolean z7 = optInt != 3;
                            if (optInt != 4 && optInt != 5) {
                                z = false;
                                boolean z8 = jSONObject.optInt("can_post_donut", 0) != 1;
                                AgeLimits.a aVar3 = AgeLimits.Companion;
                                Integer valueOf2 = Integer.valueOf(jSONObject.optInt("age_limits", AgeLimits.NO_AGE_RESTRICTION.h()));
                                aVar3.getClass();
                                AgeLimits a4 = AgeLimits.a.a(valueOf2);
                                WarningNotification.a aVar4 = WarningNotification.Companion;
                                JSONObject optJSONObject4 = jSONObject.optJSONObject("warning_notification");
                                int optInt5 = optJSONObject4 == null ? optJSONObject4.optInt("id") : 0;
                                aVar4.getClass();
                                WarningNotification a5 = WarningNotification.a.a(optInt5);
                                JSONObject optJSONObject5 = jSONObject.optJSONObject("donut_community_management");
                                return new Group(abs, string, string2, a, groupType2, z2, z3, z4, groupStatus, optInt2, 0L, i, string4, optBoolean, optInt3, a2, optString2, z5, a3, optString3, groupDeactivation, z6, z7, z, z8, a4, a5, (optJSONObject5 != null || (optJSONObject = optJSONObject5.optJSONObject("settings")) == null) ? false : optJSONObject.optBoolean("need_show_onboarding"), jSONObject.optBoolean("is_monetization_available"));
                            }
                            z = true;
                            if (jSONObject.optInt("can_post_donut", 0) != 1) {
                            }
                            AgeLimits.a aVar32 = AgeLimits.Companion;
                            Integer valueOf22 = Integer.valueOf(jSONObject.optInt("age_limits", AgeLimits.NO_AGE_RESTRICTION.h()));
                            aVar32.getClass();
                            AgeLimits a42 = AgeLimits.a.a(valueOf22);
                            WarningNotification.a aVar42 = WarningNotification.Companion;
                            JSONObject optJSONObject42 = jSONObject.optJSONObject("warning_notification");
                            if (optJSONObject42 == null) {
                            }
                            aVar42.getClass();
                            WarningNotification a52 = WarningNotification.a.a(optInt5);
                            JSONObject optJSONObject52 = jSONObject.optJSONObject("donut_community_management");
                            return new Group(abs, string, string2, a, groupType2, z2, z3, z4, groupStatus, optInt2, 0L, i, string4, optBoolean, optInt3, a2, optString2, z5, a3, optString3, groupDeactivation, z6, z7, z, z8, a42, a52, (optJSONObject52 != null || (optJSONObject = optJSONObject52.optJSONObject("settings")) == null) ? false : optJSONObject.optBoolean("need_show_onboarding"), jSONObject.optBoolean("is_monetization_available"));
                        }
                    } else if (string3.equals(NotificationCompat.CATEGORY_EVENT)) {
                        groupType = GroupType.EVENT;
                        GroupType groupType22 = groupType;
                        if ((!jSONObject.has("verified") ? jSONObject.getInt("verified") : 0) != 1) {
                        }
                        if ((!jSONObject.has("is_messages_blocked") ? jSONObject.getInt("is_messages_blocked") : 0) != 0) {
                        }
                        if ((!jSONObject.has("can_send_notify") ? jSONObject.getInt("can_send_notify") : 1) != 1) {
                        }
                        JSONObject optJSONObject22 = jSONObject.optJSONObject("online_status");
                        if (optJSONObject22 == null) {
                        }
                        if (optString != null) {
                        }
                        JSONObject optJSONObject32 = jSONObject.optJSONObject("online_status");
                        if (optJSONObject32 == null) {
                        }
                        if (!jSONObject.has("members_count")) {
                        }
                        if (!jSONObject.has("activity")) {
                        }
                        boolean optBoolean2 = jSONObject.optBoolean("is_nft_photo");
                        int optInt32 = jSONObject.optInt("member_status", 0);
                        AdminLevel.a aVar5 = AdminLevel.Companion;
                        Integer valueOf3 = Integer.valueOf(jSONObject.optInt("admin_level", 0));
                        aVar5.getClass();
                        AdminLevel a22 = AdminLevel.a.a(valueOf3);
                        String optString22 = jSONObject.optString("description", "");
                        if (jSONObject.optInt("can_message", 0) != 1) {
                        }
                        GroupPrivacy.a aVar22 = GroupPrivacy.Companion;
                        int optInt42 = jSONObject.optInt("is_closed", 1);
                        aVar22.getClass();
                        GroupPrivacy a32 = GroupPrivacy.a.a(optInt42);
                        String optString32 = jSONObject.optString("url", "");
                        if (!myc0.f(jSONObject.optString("deactivated"))) {
                        }
                        if (optInt != 2) {
                        }
                        if (optInt != 3) {
                        }
                        if (optInt != 4) {
                            z = false;
                            if (jSONObject.optInt("can_post_donut", 0) != 1) {
                            }
                            AgeLimits.a aVar322 = AgeLimits.Companion;
                            Integer valueOf222 = Integer.valueOf(jSONObject.optInt("age_limits", AgeLimits.NO_AGE_RESTRICTION.h()));
                            aVar322.getClass();
                            AgeLimits a422 = AgeLimits.a.a(valueOf222);
                            WarningNotification.a aVar422 = WarningNotification.Companion;
                            JSONObject optJSONObject422 = jSONObject.optJSONObject("warning_notification");
                            if (optJSONObject422 == null) {
                            }
                            aVar422.getClass();
                            WarningNotification a522 = WarningNotification.a.a(optInt5);
                            JSONObject optJSONObject522 = jSONObject.optJSONObject("donut_community_management");
                            return new Group(abs, string, string2, a, groupType22, z2, z3, z4, groupStatus, optInt2, 0L, i, string4, optBoolean2, optInt32, a22, optString22, z5, a32, optString32, groupDeactivation, z6, z7, z, z8, a422, a522, (optJSONObject522 != null || (optJSONObject = optJSONObject522.optJSONObject("settings")) == null) ? false : optJSONObject.optBoolean("need_show_onboarding"), jSONObject.optBoolean("is_monetization_available"));
                        }
                        z = true;
                        if (jSONObject.optInt("can_post_donut", 0) != 1) {
                        }
                        AgeLimits.a aVar3222 = AgeLimits.Companion;
                        Integer valueOf2222 = Integer.valueOf(jSONObject.optInt("age_limits", AgeLimits.NO_AGE_RESTRICTION.h()));
                        aVar3222.getClass();
                        AgeLimits a4222 = AgeLimits.a.a(valueOf2222);
                        WarningNotification.a aVar4222 = WarningNotification.Companion;
                        JSONObject optJSONObject4222 = jSONObject.optJSONObject("warning_notification");
                        if (optJSONObject4222 == null) {
                        }
                        aVar4222.getClass();
                        WarningNotification a5222 = WarningNotification.a.a(optInt5);
                        JSONObject optJSONObject5222 = jSONObject.optJSONObject("donut_community_management");
                        return new Group(abs, string, string2, a, groupType22, z2, z3, z4, groupStatus, optInt2, 0L, i, string4, optBoolean2, optInt32, a22, optString22, z5, a32, optString32, groupDeactivation, z6, z7, z, z8, a4222, a5222, (optJSONObject5222 != null || (optJSONObject = optJSONObject5222.optJSONObject("settings")) == null) ? false : optJSONObject.optBoolean("need_show_onboarding"), jSONObject.optBoolean("is_monetization_available"));
                    }
                } else if (string3.equals("page")) {
                    groupType = GroupType.PAGE;
                    GroupType groupType222 = groupType;
                    if ((!jSONObject.has("verified") ? jSONObject.getInt("verified") : 0) != 1) {
                    }
                    if ((!jSONObject.has("is_messages_blocked") ? jSONObject.getInt("is_messages_blocked") : 0) != 0) {
                    }
                    if ((!jSONObject.has("can_send_notify") ? jSONObject.getInt("can_send_notify") : 1) != 1) {
                    }
                    JSONObject optJSONObject222 = jSONObject.optJSONObject("online_status");
                    if (optJSONObject222 == null) {
                    }
                    if (optString != null) {
                    }
                    JSONObject optJSONObject322 = jSONObject.optJSONObject("online_status");
                    if (optJSONObject322 == null) {
                    }
                    if (!jSONObject.has("members_count")) {
                    }
                    if (!jSONObject.has("activity")) {
                    }
                    boolean optBoolean22 = jSONObject.optBoolean("is_nft_photo");
                    int optInt322 = jSONObject.optInt("member_status", 0);
                    AdminLevel.a aVar52 = AdminLevel.Companion;
                    Integer valueOf32 = Integer.valueOf(jSONObject.optInt("admin_level", 0));
                    aVar52.getClass();
                    AdminLevel a222 = AdminLevel.a.a(valueOf32);
                    String optString222 = jSONObject.optString("description", "");
                    if (jSONObject.optInt("can_message", 0) != 1) {
                    }
                    GroupPrivacy.a aVar222 = GroupPrivacy.Companion;
                    int optInt422 = jSONObject.optInt("is_closed", 1);
                    aVar222.getClass();
                    GroupPrivacy a322 = GroupPrivacy.a.a(optInt422);
                    String optString322 = jSONObject.optString("url", "");
                    if (!myc0.f(jSONObject.optString("deactivated"))) {
                    }
                    if (optInt != 2) {
                    }
                    if (optInt != 3) {
                    }
                    if (optInt != 4) {
                    }
                    z = true;
                    if (jSONObject.optInt("can_post_donut", 0) != 1) {
                    }
                    AgeLimits.a aVar32222 = AgeLimits.Companion;
                    Integer valueOf22222 = Integer.valueOf(jSONObject.optInt("age_limits", AgeLimits.NO_AGE_RESTRICTION.h()));
                    aVar32222.getClass();
                    AgeLimits a42222 = AgeLimits.a.a(valueOf22222);
                    WarningNotification.a aVar42222 = WarningNotification.Companion;
                    JSONObject optJSONObject42222 = jSONObject.optJSONObject("warning_notification");
                    if (optJSONObject42222 == null) {
                    }
                    aVar42222.getClass();
                    WarningNotification a52222 = WarningNotification.a.a(optInt5);
                    JSONObject optJSONObject52222 = jSONObject.optJSONObject("donut_community_management");
                    return new Group(abs, string, string2, a, groupType222, z2, z3, z4, groupStatus, optInt2, 0L, i, string4, optBoolean22, optInt322, a222, optString222, z5, a322, optString322, groupDeactivation, z6, z7, z, z8, a42222, a52222, (optJSONObject52222 != null || (optJSONObject = optJSONObject52222.optJSONObject("settings")) == null) ? false : optJSONObject.optBoolean("need_show_onboarding"), jSONObject.optBoolean("is_monetization_available"));
                }
            }
            groupType = GroupType.GROUP;
            GroupType groupType2222 = groupType;
            if ((!jSONObject.has("verified") ? jSONObject.getInt("verified") : 0) != 1) {
            }
            if ((!jSONObject.has("is_messages_blocked") ? jSONObject.getInt("is_messages_blocked") : 0) != 0) {
            }
            if ((!jSONObject.has("can_send_notify") ? jSONObject.getInt("can_send_notify") : 1) != 1) {
            }
            JSONObject optJSONObject2222 = jSONObject.optJSONObject("online_status");
            if (optJSONObject2222 == null) {
            }
            if (optString != null) {
            }
            JSONObject optJSONObject3222 = jSONObject.optJSONObject("online_status");
            if (optJSONObject3222 == null) {
            }
            if (!jSONObject.has("members_count")) {
            }
            if (!jSONObject.has("activity")) {
            }
            boolean optBoolean222 = jSONObject.optBoolean("is_nft_photo");
            int optInt3222 = jSONObject.optInt("member_status", 0);
            AdminLevel.a aVar522 = AdminLevel.Companion;
            Integer valueOf322 = Integer.valueOf(jSONObject.optInt("admin_level", 0));
            aVar522.getClass();
            AdminLevel a2222 = AdminLevel.a.a(valueOf322);
            String optString2222 = jSONObject.optString("description", "");
            if (jSONObject.optInt("can_message", 0) != 1) {
            }
            GroupPrivacy.a aVar2222 = GroupPrivacy.Companion;
            int optInt4222 = jSONObject.optInt("is_closed", 1);
            aVar2222.getClass();
            GroupPrivacy a3222 = GroupPrivacy.a.a(optInt4222);
            String optString3222 = jSONObject.optString("url", "");
            if (!myc0.f(jSONObject.optString("deactivated"))) {
            }
            if (optInt != 2) {
            }
            if (optInt != 3) {
            }
            if (optInt != 4) {
            }
            z = true;
            if (jSONObject.optInt("can_post_donut", 0) != 1) {
            }
            AgeLimits.a aVar322222 = AgeLimits.Companion;
            Integer valueOf222222 = Integer.valueOf(jSONObject.optInt("age_limits", AgeLimits.NO_AGE_RESTRICTION.h()));
            aVar322222.getClass();
            AgeLimits a422222 = AgeLimits.a.a(valueOf222222);
            WarningNotification.a aVar422222 = WarningNotification.Companion;
            JSONObject optJSONObject422222 = jSONObject.optJSONObject("warning_notification");
            if (optJSONObject422222 == null) {
            }
            aVar422222.getClass();
            WarningNotification a522222 = WarningNotification.a.a(optInt5);
            JSONObject optJSONObject522222 = jSONObject.optJSONObject("donut_community_management");
            return new Group(abs, string, string2, a, groupType2222, z2, z3, z4, groupStatus, optInt2, 0L, i, string4, optBoolean222, optInt3222, a2222, optString2222, z5, a3222, optString3222, groupDeactivation, z6, z7, z, z8, a422222, a522222, (optJSONObject522222 != null || (optJSONObject = optJSONObject522222.optJSONObject("settings")) == null) ? false : optJSONObject.optBoolean("need_show_onboarding"), jSONObject.optBoolean("is_monetization_available"));
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }
}
