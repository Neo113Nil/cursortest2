package xsna;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.messages.MsgSendSource;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.pq8;

/* compiled from: MsgSendSourceJSONSerializer.kt */
/* loaded from: classes2.dex */
public final class az30 {

    /* compiled from: MsgSendSourceJSONSerializer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgSendSource.Type.values().length];
            try {
                iArr[MsgSendSource.Type.UserInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgSendSource.Type.BotKbd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgSendSource.Type.Carousel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MsgSendSource.Type.MarusiaSource.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MsgSendSource a(JSONObject jSONObject) {
        Enum valueOf;
        MsgSendSource.Type type;
        String optString = jSONObject.optString("type");
        if (optString != null) {
            try {
                valueOf = Enum.valueOf(MsgSendSource.Type.class, optString.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
            }
            type = (MsgSendSource.Type) valueOf;
            if (type != null) {
                return null;
            }
            int i = a.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return MsgSendSource.e.a;
            }
            if (i == 2) {
                BotButton a2 = u28.a(jSONObject);
                if (a2 == null) {
                    return null;
                }
                return new MsgSendSource.a(a2, qq8.a(jSONObject));
            }
            if (i != 3) {
                if (i == 4) {
                    return new MsgSendSource.d(jSONObject.optString("skill"), jSONObject.optString(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK));
                }
                throw new NoWhenBranchMatchedException();
            }
            BotButton a3 = u28.a(jSONObject);
            if (a3 == null) {
                return null;
            }
            return new MsgSendSource.c(a3, (pq8.a) qq8.a(jSONObject));
        }
        valueOf = null;
        type = (MsgSendSource.Type) valueOf;
        if (type != null) {
        }
    }

    public static JSONObject b(MsgSendSource msgSendSource) {
        w9y w9yVar;
        JSONObject jSONObject;
        if (msgSendSource instanceof MsgSendSource.e) {
            return yq.d("type", "UserInput");
        }
        int i = 11;
        if (!(msgSendSource instanceof MsgSendSource.a)) {
            if (msgSendSource instanceof MsgSendSource.c) {
                MsgSendSource.c cVar = (MsgSendSource.c) msgSendSource;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", MsgSendSource.Type.Carousel);
                jSONObject2.put("bot_button", u28.b(cVar.a).toString());
                pq8.a aVar = cVar.c;
                jSONObject2.put("button_position_info", String.valueOf(aVar != null ? d370.C(new l00(aVar, i)) : null));
                return jSONObject2;
            }
            if (!(msgSendSource instanceof MsgSendSource.d)) {
                if (msgSendSource instanceof MsgSendSource.b) {
                    return new JSONObject();
                }
                throw new NoWhenBranchMatchedException();
            }
            MsgSendSource.d dVar = (MsgSendSource.d) msgSendSource;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", MsgSendSource.Type.MarusiaSource);
            jSONObject3.put("skill", dVar.a);
            jSONObject3.put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, dVar.b);
            return jSONObject3;
        }
        MsgSendSource.a aVar2 = (MsgSendSource.a) msgSendSource;
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("type", MsgSendSource.Type.BotKbd);
        jSONObject4.put("bot_button", u28.b(aVar2.a).toString());
        pq8 pq8Var = aVar2.b;
        if (pq8Var != null) {
            if (pq8Var instanceof pq8.a) {
                jSONObject = d370.C(new l00((pq8.a) pq8Var, i));
            } else {
                if (pq8Var instanceof pq8.c) {
                    pq8.c cVar2 = (pq8.c) pq8Var;
                    w9yVar = new w9y();
                    w9yVar.c(Integer.valueOf(cVar2.a()), "type_id");
                    w9yVar.d(Long.valueOf(cVar2.b.b), "dialog_id");
                    w9yVar.c(Integer.valueOf(cVar2.c), "msg_cnv_id");
                    w9yVar.c(Integer.valueOf(cVar2.a), "position_in_keyboard");
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    if (!(pq8Var instanceof pq8.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pq8.b bVar = (pq8.b) pq8Var;
                    w9yVar = new w9y();
                    w9yVar.c(2, "type_id");
                    w9yVar.d(Long.valueOf(bVar.b.b), "dialog_id");
                    w9yVar.c(Integer.valueOf(bVar.a), "position_in_keyboard");
                    s3q0 s3q0Var2 = s3q0.a;
                }
                jSONObject = w9yVar.a;
            }
            r3 = jSONObject;
        }
        jSONObject4.put("button_position_info", String.valueOf(r3));
        return jSONObject4;
    }
}
