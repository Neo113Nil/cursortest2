package xsna;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.InfoBar;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.p4g;

/* compiled from: InfoBarParser.kt */
/* loaded from: classes2.dex */
public final class lvw {

    /* compiled from: InfoBarParser.kt */
    public static final class a extends Exception {
    }

    public static InfoBar.Background a(JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        String optString = jSONObject.optString("light", null);
        String optString2 = jSONObject.optString("dark", null);
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        InfoBar.Image c = optJSONArray != null ? c(optJSONArray) : null;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("fill_colors");
        if (optJSONArray2 != null) {
            arrayList = new ArrayList(optJSONArray2.length());
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                String optString3 = jSONObject2.optString("color", null);
                InfoBar.Theme.a aVar = InfoBar.Theme.Companion;
                String optString4 = jSONObject2.optString("theme", null);
                aVar.getClass();
                arrayList.add(new InfoBar.Background.FillColors(optString3, InfoBar.Theme.a.a(optString4)));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = arrayList;
        }
        return new InfoBar.Background(optString, optString2, c, arrayList2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList b(JSONArray jSONArray) {
        InfoBar.ButtonType buttonType;
        String optString;
        String optString2;
        InfoBar.ButtonLayout buttonLayout;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("type");
            if (string != null) {
                switch (string.hashCode()) {
                    case -1756351616:
                        if (string.equals("friend_add")) {
                            buttonType = InfoBar.ButtonType.FRIEND_ADD;
                            break;
                        }
                        break;
                    case -1683528123:
                        if (string.equals("reject_mr")) {
                            buttonType = InfoBar.ButtonType.MESSAGE_REQUEST_DECLINE;
                            break;
                        }
                        break;
                    case -1294767602:
                        if (string.equals("edu_account_login")) {
                            buttonType = InfoBar.ButtonType.OPEN_EDU_AUTH;
                            break;
                        }
                        break;
                    case -483444309:
                        if (string.equals("antispam")) {
                            buttonType = InfoBar.ButtonType.ANTISPAM;
                            break;
                        }
                        break;
                    case -472936247:
                        if (string.equals("hide_banner")) {
                            buttonType = InfoBar.ButtonType.HIDE_BANNER;
                            break;
                        }
                        break;
                    case -256926552:
                        if (string.equals("business_notify")) {
                            buttonType = InfoBar.ButtonType.OPEN_BUSINESS_NOTIFICATION_INFO;
                            break;
                        }
                        break;
                    case -172220347:
                        if (string.equals("callback")) {
                            buttonType = InfoBar.ButtonType.CALLBACK;
                            break;
                        }
                        break;
                    case 3321850:
                        if (string.equals("link")) {
                            buttonType = InfoBar.ButtonType.LINK;
                            break;
                        }
                        break;
                    case 3536713:
                        if (string.equals("spam")) {
                            buttonType = InfoBar.ButtonType.SPAM;
                            break;
                        }
                        break;
                    case 106852524:
                        if (string.equals("popup")) {
                            buttonType = InfoBar.ButtonType.POPUP;
                            break;
                        }
                        break;
                    case 1062436214:
                        if (string.equals("gifts_link")) {
                            buttonType = InfoBar.ButtonType.GIFTS_LINK;
                            break;
                        }
                        break;
                }
                InfoBar.ButtonType buttonType2 = buttonType;
                optString = jSONObject.optString("link", "");
                if (drm0.N(optString) && buttonType2 == InfoBar.ButtonType.OPEN_BUSINESS_NOTIFICATION_INFO) {
                    optString = "https://vk.me/products/notify/c1V97Q";
                }
                String str = optString;
                JSONObject optJSONObject = jSONObject.optJSONObject("popup");
                InfoBar.PopUp popUp = optJSONObject == null ? new InfoBar.PopUp(epx.f(optJSONObject.getString(TtmlNode.TAG_STYLE), "outage") ? InfoBar.Style.OUTAGE : InfoBar.Style.UNKNOWN, optJSONObject.getString("title"), optJSONObject.getString("text"), optJSONObject.getString("button_text")) : null;
                String string2 = jSONObject.getString("text");
                optString2 = jSONObject.optString(TtmlNode.TAG_LAYOUT, "");
                if (optString2 != null) {
                    int hashCode = optString2.hashCode();
                    if (hashCode != -1174796206) {
                        if (hashCode != -817598092) {
                            if (hashCode == -314765822 && optString2.equals("primary")) {
                                buttonLayout = InfoBar.ButtonLayout.PRIMARY;
                            }
                        } else if (optString2.equals(X3.i.Y)) {
                            buttonLayout = InfoBar.ButtonLayout.SECONDARY;
                        }
                    } else if (optString2.equals("tertiary")) {
                        buttonLayout = InfoBar.ButtonLayout.TERTIARY;
                    }
                    InfoBar.ButtonLayout buttonLayout2 = buttonLayout;
                    InfoBar.ButtonStyle buttonStyle = epx.f(jSONObject.optString(TtmlNode.TAG_STYLE), "destructive") ? InfoBar.ButtonStyle.DESTRUCTIVE : InfoBar.ButtonStyle.DEFAULT;
                    String optString3 = jSONObject.optString("callback_data", "");
                    boolean z = jSONObject.has("hide_on_action") ? jSONObject.getBoolean("hide_on_action") : false;
                    String optString4 = jSONObject.optString("icon_type", "");
                    arrayList.add(new InfoBar.Button(string2, buttonLayout2, buttonType2, buttonStyle, str, optString3, z, popUp, epx.f(optString4, "gift") ? InfoBar.ButtonIcon.GIFT : epx.f(optString4, "gift_outline") ? InfoBar.ButtonIcon.GIFT_OUTLINE : InfoBar.ButtonIcon.UNKNOWN));
                }
                buttonLayout = InfoBar.ButtonLayout.PRIMARY;
                InfoBar.ButtonLayout buttonLayout22 = buttonLayout;
                InfoBar.ButtonStyle buttonStyle2 = epx.f(jSONObject.optString(TtmlNode.TAG_STYLE), "destructive") ? InfoBar.ButtonStyle.DESTRUCTIVE : InfoBar.ButtonStyle.DEFAULT;
                String optString32 = jSONObject.optString("callback_data", "");
                if (jSONObject.has("hide_on_action")) {
                }
                String optString42 = jSONObject.optString("icon_type", "");
                arrayList.add(new InfoBar.Button(string2, buttonLayout22, buttonType2, buttonStyle2, str, optString32, z, popUp, epx.f(optString42, "gift") ? InfoBar.ButtonIcon.GIFT : epx.f(optString42, "gift_outline") ? InfoBar.ButtonIcon.GIFT_OUTLINE : InfoBar.ButtonIcon.UNKNOWN));
            }
            buttonType = InfoBar.ButtonType.UNKNOWN;
            InfoBar.ButtonType buttonType22 = buttonType;
            optString = jSONObject.optString("link", "");
            if (drm0.N(optString)) {
                optString = "https://vk.me/products/notify/c1V97Q";
            }
            String str2 = optString;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("popup");
            if (optJSONObject2 == null) {
            }
            InfoBar.PopUp popUp2 = optJSONObject2 == null ? new InfoBar.PopUp(epx.f(optJSONObject2.getString(TtmlNode.TAG_STYLE), "outage") ? InfoBar.Style.OUTAGE : InfoBar.Style.UNKNOWN, optJSONObject2.getString("title"), optJSONObject2.getString("text"), optJSONObject2.getString("button_text")) : null;
            String string22 = jSONObject.getString("text");
            optString2 = jSONObject.optString(TtmlNode.TAG_LAYOUT, "");
            if (optString2 != null) {
            }
            buttonLayout = InfoBar.ButtonLayout.PRIMARY;
            InfoBar.ButtonLayout buttonLayout222 = buttonLayout;
            InfoBar.ButtonStyle buttonStyle22 = epx.f(jSONObject.optString(TtmlNode.TAG_STYLE), "destructive") ? InfoBar.ButtonStyle.DESTRUCTIVE : InfoBar.ButtonStyle.DEFAULT;
            String optString322 = jSONObject.optString("callback_data", "");
            if (jSONObject.has("hide_on_action")) {
            }
            String optString422 = jSONObject.optString("icon_type", "");
            arrayList.add(new InfoBar.Button(string22, buttonLayout222, buttonType22, buttonStyle22, str2, optString322, z, popUp2, epx.f(optString422, "gift") ? InfoBar.ButtonIcon.GIFT : epx.f(optString422, "gift_outline") ? InfoBar.ButtonIcon.GIFT_OUTLINE : InfoBar.ButtonIcon.UNKNOWN));
        }
        return arrayList;
    }

    public static InfoBar.Image c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String optString = jSONObject.optString("url", null);
            int optInt = jSONObject.optInt("width", 0);
            int optInt2 = jSONObject.optInt("height", 0);
            String optString2 = jSONObject.optString("theme", null);
            Image image = new Image(optInt, optInt2, optString, jSONObject.optBoolean("is_base", false));
            arrayList3.add(epx.f(optString2, "light") ? Boolean.valueOf(arrayList.add(image)) : epx.f(optString2, "dark") ? Boolean.valueOf(arrayList2.add(image)) : s3q0.a);
        }
        return new InfoBar.Image(new ImageList(arrayList), new ImageList(arrayList2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x017f, code lost:
    
        if (r1 == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InfoBar.Payload d(JSONObject jSONObject) {
        String str;
        boolean z;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        InfoBar.Payload.GiftsBirthdays.InfoBarBirthdaysData infoBarBirthdaysData;
        JSONArray jSONArray;
        List list;
        int i;
        JSONArray jSONArray2;
        String string = jSONObject.getString("type");
        if (string != null) {
            int hashCode = string.hashCode();
            InfoBar.Image image = null;
            if (hashCode != -1847644774) {
                if (hashCode != -1081138978) {
                    if (hashCode == -531262825 && string.equals("gifts_holidays")) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("trailing_image");
                        if (optJSONObject != null && (jSONArray2 = optJSONObject.getJSONArray("images")) != null) {
                            image = c(jSONArray2);
                        }
                        return new InfoBar.Payload.GiftsHolidays(string, image);
                    }
                } else if (string.equals("max_ad")) {
                    return new InfoBar.Payload.MaxAd(string, jSONObject.optString("erid"), jSONObject.optString(X3.i.F0), f370.x(jSONObject, "hide_after_views_count"));
                }
            } else if (string.equals("gifts_birthdays")) {
                String string2 = jSONObject.getString("ref");
                JSONArray jSONArray3 = jSONObject.getJSONArray("birthday_users");
                ArrayList arrayList3 = new ArrayList(jSONArray3.length());
                int length = jSONArray3.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArray3.getJSONObject(i2);
                    arrayList3.add(new InfoBar.Payload.GiftsBirthdays.User(new UserId(jSONObject2.getLong("id")), jSONObject2.optString("first_name", null), jSONObject2.optString("last_name", null), jSONObject2.optString("photo_base", null)));
                }
                boolean z2 = jSONObject.has("is_today_birthday") ? jSONObject.getBoolean("is_today_birthday") : true;
                ArrayList arrayList4 = arrayList3;
                ArrayList arrayList5 = new ArrayList();
                JSONArray optJSONArray = jSONObject.optJSONArray("other_birthday_user_ids");
                if (optJSONArray != null) {
                    int length2 = optJSONArray.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        UserId[] userIdArr = {new UserId(optJSONArray.getLong(i3))};
                        p4g.a aVar = p4g.a;
                        g5g.A(arrayList5, userIdArr);
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("modal_info");
                if (optJSONObject2 != null) {
                    String optString = optJSONObject2.optString("title");
                    String optString2 = optJSONObject2.optString("subtitle");
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("users_blocks");
                    if (optJSONArray2 != null) {
                        ArrayList arrayList6 = new ArrayList(optJSONArray2.length());
                        int length3 = optJSONArray2.length();
                        int i4 = 0;
                        while (i4 < length3) {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i4);
                            String str3 = string2;
                            String optString3 = jSONObject3.optString("title");
                            boolean z3 = z2;
                            ArrayList arrayList7 = new ArrayList();
                            String str4 = string;
                            JSONArray optJSONArray3 = jSONObject3.optJSONArray("user_ids");
                            if (optJSONArray3 != null) {
                                int length4 = optJSONArray3.length();
                                i = i4;
                                int i5 = 0;
                                while (i5 < length4) {
                                    arrayList7.add(new UserId(optJSONArray3.getLong(i5)));
                                    i5++;
                                    arrayList4 = arrayList4;
                                    arrayList5 = arrayList5;
                                    optJSONArray3 = optJSONArray3;
                                }
                            } else {
                                i = i4;
                            }
                            ArrayList arrayList8 = arrayList5;
                            ArrayList arrayList9 = arrayList4;
                            arrayList6.add(new InfoBar.Payload.GiftsBirthdays.BirthdaysGroup(optString3, arrayList7));
                            i4 = i + 1;
                            string2 = str3;
                            z2 = z3;
                            string = str4;
                            arrayList4 = arrayList9;
                            arrayList5 = arrayList8;
                        }
                        str = string2;
                        z = z2;
                        str2 = string;
                        arrayList = arrayList5;
                        arrayList2 = arrayList4;
                        list = j5g.O0(arrayList6);
                    } else {
                        str = string2;
                        z = z2;
                        str2 = string;
                        arrayList = arrayList5;
                        arrayList2 = arrayList4;
                    }
                    list = EmptyList.b;
                    infoBarBirthdaysData = new InfoBar.Payload.GiftsBirthdays.InfoBarBirthdaysData(optString, optString2, list);
                } else {
                    str = string2;
                    z = z2;
                    str2 = string;
                    arrayList = arrayList5;
                    arrayList2 = arrayList4;
                    infoBarBirthdaysData = null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("trailing_image");
                return new InfoBar.Payload.GiftsBirthdays(str2, arrayList2, z, str, arrayList, infoBarBirthdaysData, (optJSONObject3 == null || (jSONArray = optJSONObject3.getJSONArray("images")) == null) ? null : c(jSONArray));
            }
        }
        throw new a("Unknown InfoBar.Payload type: ".concat(string));
    }
}
