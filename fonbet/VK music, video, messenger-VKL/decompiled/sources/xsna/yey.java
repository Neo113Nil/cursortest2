package xsna;

import com.unity3d.ads.BuildConfig;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.conversations.ButtonColor;
import com.vk.im.engine.models.conversations.ButtonType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: KeyboardApiParser.kt */
/* loaded from: classes2.dex */
public final class yey {

    /* compiled from: KeyboardApiParser.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonType.values().length];
            try {
                iArr[ButtonType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonType.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonType.VKPAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonType.VKAPP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonType.LOCATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonType.CALLBACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonType.MODAL_VIEW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BotButton a(JSONObject jSONObject, boolean z, Peer peer) {
        ButtonType buttonType;
        ButtonType buttonType2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("action");
        String string = jSONObject2.getString("type");
        String lowerCase = string != null ? string.toLowerCase(Locale.ROOT) : null;
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -504325460:
                    if (lowerCase.equals("open_app")) {
                        buttonType2 = ButtonType.VKAPP;
                        buttonType = buttonType2;
                        break;
                    }
                    break;
                case -172220347:
                    if (lowerCase.equals("callback")) {
                        buttonType2 = ButtonType.CALLBACK;
                        buttonType = buttonType2;
                        break;
                    }
                    break;
                case 3556653:
                    if (lowerCase.equals("text")) {
                        buttonType2 = ButtonType.TEXT;
                        buttonType = buttonType2;
                        break;
                    }
                    break;
                case 112273875:
                    if (lowerCase.equals("vkpay")) {
                        buttonType2 = ButtonType.VKPAY;
                        buttonType = buttonType2;
                        break;
                    }
                    break;
                case 435214860:
                    if (lowerCase.equals("open_modal_view")) {
                        buttonType2 = ButtonType.MODAL_VIEW;
                        buttonType = buttonType2;
                        break;
                    }
                    break;
                case 1546100943:
                    if (lowerCase.equals("open_link")) {
                        buttonType2 = ButtonType.LINK;
                        buttonType = buttonType2;
                        break;
                    }
                    break;
                case 1901043637:
                    if (lowerCase.equals("location")) {
                        buttonType2 = ButtonType.LOCATION;
                        buttonType = buttonType2;
                        break;
                    }
                    break;
            }
            if (buttonType != null) {
                return null;
            }
            switch (a.$EnumSwitchMapping$0[buttonType.ordinal()]) {
                case 1:
                    String optString = jSONObject2.optString("label", "");
                    String optString2 = jSONObject2.optString("payload", "");
                    ButtonColor c = c(jSONObject.getString("color"));
                    if (c == null) {
                        c = ButtonColor.DEFAULT;
                    }
                    return new BotButton.Text(buttonType, optString2, 0, optString, c, z, peer, 4, null);
                case 2:
                    return new BotButton.Link(buttonType, null, 0, jSONObject2.optString("label", ""), jSONObject2.optString("link", ""), ButtonColor.DEFAULT, z, peer, 6, null);
                case 3:
                    return new BotButton.VkPay(buttonType, null, 0, jSONObject2.getString("hash"), z, peer, 6, null);
                case 4:
                    return new BotButton.VkApps(buttonType, null, 0, jSONObject2.getInt("app_id"), jSONObject2.optString("owner_id", null), jSONObject2.optString("hash", ""), jSONObject2.getString("label"), z, peer, 6, null);
                case 5:
                    return new BotButton.Location(buttonType, jSONObject2.optString("payload", ""), 0, z, peer, 4, null);
                case 6:
                    String optString3 = jSONObject2.optString("payload", "");
                    String optString4 = jSONObject2.optString("label", "");
                    ButtonColor c2 = c(jSONObject.getString("color"));
                    if (c2 == null) {
                        c2 = ButtonColor.DEFAULT;
                    }
                    return new BotButton.Callback(buttonType, optString3, 0, z, peer, optString4, c2, false, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, null);
                case 7:
                    String optString5 = jSONObject2.optString("label", "");
                    String optString6 = jSONObject2.optString("link", "");
                    ButtonColor c3 = c(jSONObject.getString("color"));
                    if (c3 == null) {
                        c3 = ButtonColor.DEFAULT;
                    }
                    return new BotButton.ModalView(buttonType, null, 0, optString5, optString6, c3, z, peer, 6, null);
                default:
                    return BotButton.Unsupported.g;
            }
        }
        buttonType = null;
        if (buttonType != null) {
        }
    }

    public static BotKeyboard b(JSONObject jSONObject, Peer peer) {
        Object next;
        if (jSONObject != null) {
            if (jSONObject.has("author_id")) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer = Peer.a.b(jSONObject.getLong("author_id"));
            }
            Peer peer2 = peer;
            JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            ArrayList arrayList = new ArrayList();
            boolean optBoolean = jSONObject.optBoolean("inline");
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONArray jSONArray = optJSONArray.getJSONArray(i);
                ArrayList arrayList2 = new ArrayList();
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    try {
                        BotButton a2 = a(jSONArray.getJSONObject(i2), optBoolean, peer2);
                        if (a2 != null) {
                            arrayList2.add(a2);
                        }
                    } catch (Exception unused) {
                        arrayList2.add(BotButton.Unsupported.g);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(arrayList2);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int size = ((List) next).size();
                    do {
                        Object next2 = it.next();
                        int size2 = ((List) next2).size();
                        if (size < size2) {
                            next = next2;
                            size = size2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            List list = (List) next;
            int size3 = list != null ? list.size() : 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List list2 = (List) it2.next();
                int size4 = size3 / list2.size();
                if (size4 > 1) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((BotButton) it3.next()).Db(size4);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new BotKeyboard(peer2, jSONObject.optBoolean("one_time"), optBoolean, size3, arrayList);
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static ButtonColor c(String str) {
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -314765822:
                    if (lowerCase.equals("primary")) {
                        return ButtonColor.PRIMARY;
                    }
                    break;
                case 747805177:
                    if (lowerCase.equals("positive")) {
                        return ButtonColor.POSITIVE;
                    }
                    break;
                case 921111605:
                    if (lowerCase.equals("negative")) {
                        return ButtonColor.NEGATIVE;
                    }
                    break;
                case 1544803905:
                    if (lowerCase.equals(BuildConfig.FLAVOR)) {
                        return ButtonColor.DEFAULT;
                    }
                    break;
            }
        }
        return null;
    }
}
