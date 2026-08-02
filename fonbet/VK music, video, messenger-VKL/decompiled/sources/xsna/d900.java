package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LpAttachApiParser.kt */
/* loaded from: classes2.dex */
public final class d900 {
    public static final Set<String> a = rl3.y0(new String[]{"sticker", "audio_message"});

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static AttachWithId a(JSONObject jSONObject) throws VKApiIllegalResponseException {
        int i;
        String optString = jSONObject.optString("type", "");
        if (optString != null) {
            int hashCode = optString.hashCode();
            if (hashCode != -1890252483) {
                if (hashCode != -932326641) {
                    if (hashCode == 1316097182 && optString.equals("audio_message")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(optString);
                        AttachAudioMsg attachAudioMsg = new AttachAudioMsg();
                        attachAudioMsg.b = 0;
                        attachAudioMsg.c = AttachSyncState.DONE;
                        attachAudioMsg.e = jSONObject2.getLong("id");
                        attachAudioMsg.d = new UserId(jSONObject2.getLong("owner_id"));
                        attachAudioMsg.C0(jSONObject2.getInt("duration"));
                        JSONArray jSONArray = jSONObject2.getJSONArray("waveform");
                        byte[] bArr = new byte[jSONArray.length()];
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            bArr[i2] = (byte) (jSONArray.getInt(i2) & 255);
                        }
                        attachAudioMsg.g = bArr;
                        attachAudioMsg.h = jSONObject2.getString("link_ogg");
                        attachAudioMsg.i = jSONObject2.getString("link_mp3");
                        attachAudioMsg.l = jSONObject2.has("transcript") ? jSONObject2.getString("transcript") : "";
                        String string = jSONObject2.has("transcript_state") ? jSONObject2.getString("transcript_state") : "unavailable";
                        switch (string.hashCode()) {
                            case -1715163493:
                                if (string.equals("uninitialized")) {
                                    i = -1;
                                    break;
                                }
                                i = 0;
                                break;
                            case -753541113:
                                if (string.equals("in_progress")) {
                                    i = 1;
                                    break;
                                }
                                i = 0;
                                break;
                            case -665462704:
                                string.equals("unavailable");
                                i = 0;
                                break;
                            case 3089282:
                                if (string.equals("done")) {
                                    i = 2;
                                    break;
                                }
                                i = 0;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        attachAudioMsg.m = i;
                        attachAudioMsg.n = jSONObject2.has("transcript_update_time");
                        attachAudioMsg.p = jSONObject2.has("transcript_rate_enabled") ? jSONObject2.getBoolean("transcript_rate_enabled") : false;
                        attachAudioMsg.j = "";
                        attachAudioMsg.k = jSONObject2.optString("access_key", "");
                        return attachAudioMsg;
                    }
                } else if (optString.equals("ugc_sticker")) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(optString);
                    AttachUgcSticker attachUgcSticker = new AttachUgcSticker(0, null, null, 0L, null, 31, null);
                    attachUgcSticker.b = 0;
                    attachUgcSticker.c = AttachSyncState.DONE;
                    attachUgcSticker.e = jSONObject3.getLong("id");
                    attachUgcSticker.d = new UserId(jSONObject3.getLong("owner_id"));
                    Serializer.c<UGCStickerModel> cVar = UGCStickerModel.CREATOR;
                    attachUgcSticker.f = UGCStickerModel.a.a(jSONObject3);
                    return attachUgcSticker;
                }
            } else if (optString.equals("sticker")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(optString);
                AttachSticker attachSticker = new AttachSticker();
                attachSticker.b = 0;
                attachSticker.c = AttachSyncState.DONE;
                attachSticker.e = jSONObject4.getLong("sticker_id");
                attachSticker.f = jSONObject4.getInt("product_id");
                StickerItem stickerItem = StickerItem.l;
                attachSticker.g = StickerItem.a.a(jSONObject4);
                attachSticker.h = "";
                return attachSticker;
            }
        }
        throw new VKApiIllegalResponseException(go9.b("Illegal attachment type=", optString));
    }

    public static ArrayList b(JSONObject jSONObject) throws VKApiIllegalResponseException {
        JSONArray jSONArray = new JSONArray(jSONObject.optString("attachments", ""));
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                arrayList.add(a(jSONArray.getJSONObject(i)));
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }
        return arrayList;
    }
}
