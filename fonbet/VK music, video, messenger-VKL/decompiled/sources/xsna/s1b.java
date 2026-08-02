package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MessageSource;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.reactions.ItemReactions;
import com.vk.im.engine.models.attaches.AttachComments;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.attaches.AuthorAd;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.PaidReaction;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChannelMessageApiParser.kt */
/* loaded from: classes2.dex */
public final class s1b {
    public static MsgFromChannel a(JSONObject jSONObject, f1e0 f1e0Var) throws VKApiException {
        try {
            return c(jSONObject, f1e0Var);
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }

    public static ArrayList b(JSONArray jSONArray, f1e0 f1e0Var) throws VKApiException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                arrayList.add(c(jSONArray.getJSONObject(i), f1e0Var));
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0320, code lost:
    
        if (r4 == null) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List<com.vk.dto.attaches.Attach>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MsgFromChannel c(JSONObject jSONObject, f1e0 f1e0Var) {
        long j;
        long j2;
        MsgFromChannel.b bVar;
        MsgFromChannel.ExternalViewTracking externalViewTracking;
        MsgTextFormat msgTextFormat;
        int i;
        long j3;
        ?? r1;
        int i2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        long j4 = jSONObject.getLong("channel_id");
        int i3 = jSONObject.getInt("cmid");
        ArrayList<Attach> arrayList = new ArrayList(1);
        try {
            w04.F(jSONObject, f1e0Var, arrayList);
            Object b0 = j5g.b0(0, arrayList);
            AttachWall attachWall = b0 instanceof AttachWall ? (AttachWall) b0 : null;
            if (jSONObject.has("cm_payload")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("cm_payload");
                j2 = 1000;
                JSONObject optJSONObject5 = jSONObject2.optJSONObject("geo");
                JSONObject optJSONObject6 = jSONObject2.optJSONObject("counters");
                Long valueOf = jSONObject2.has("publish_date") ? Long.valueOf(jSONObject2.getLong("publish_date")) : null;
                j = j4;
                UserId userId = new UserId(jSONObject.optLong("channel_id", 0L));
                long j5 = jSONObject.has("time") ? jSONObject.getLong("time") : 0L;
                if (optJSONObject5 != null) {
                    i2 = 0;
                    arrayList.add(0, w04.q(optJSONObject5));
                } else {
                    i2 = 0;
                }
                String optString = jSONObject.optString("text", "");
                int optInt = jSONObject.optInt("cmid", i2);
                long j6 = j5;
                UserId userId2 = new UserId(jSONObject.optLong("author_id", 0L));
                String optString2 = jSONObject2.optString("post_type");
                if (optString2 == null) {
                    optString2 = "post";
                }
                String str = optString2;
                JSONObject optJSONObject7 = jSONObject2.optJSONObject("donut");
                PostDonut f = optJSONObject7 != null ? vj90.f(optJSONObject7) : null;
                JSONObject optJSONObject8 = jSONObject2.optJSONObject("ads_info");
                AuthorAd authorAd = optJSONObject8 == null ? null : new AuthorAd(optJSONObject8.has("advertiser_info_url") ? optJSONObject8.getString("advertiser_info_url") : "", optJSONObject8.has("ad_marker") ? optJSONObject8.getString("ad_marker") : "");
                String optString3 = jSONObject2.optString("track_code", "");
                String optString4 = jSONObject2.optString("deleted_reason");
                String optString5 = jSONObject2.optString("deleted_details");
                AttachComments k = (optJSONObject6 == null || (optJSONObject4 = optJSONObject6.optJSONObject("comments")) == null) ? null : w04.k(optJSONObject4);
                Serializer.c<Peer> cVar = Peer.CREATOR;
                Peer b = Peer.a.b(jSONObject2.optLong("signer_id", 0L));
                boolean optBoolean = jSONObject2.optBoolean("marked_as_ads");
                PaidReaction paidReaction = (optJSONObject6 == null || (optJSONObject3 = optJSONObject6.optJSONObject("paid_reactions")) == null) ? null : new PaidReaction(optJSONObject3.getInt("count"), optJSONObject3.optInt("user_count"));
                ItemReactions p = optJSONObject6 != null ? tci.p(optJSONObject6, null) : null;
                int i4 = (optJSONObject6 == null || (optJSONObject2 = optJSONObject6.optJSONObject("reposts")) == null) ? 0 : optJSONObject2.has("count") ? optJSONObject2.getInt("count") : 0;
                int i5 = (optJSONObject6 == null || (optJSONObject = optJSONObject6.optJSONObject("views")) == null) ? 0 : optJSONObject.has("count") ? optJSONObject.getInt("count") : 0;
                long longValue = (valueOf != null ? valueOf.longValue() : j6) * 1000;
                JSONObject optJSONObject9 = jSONObject2.optJSONObject("textlive");
                bVar = new MsgFromChannel.b(optString, "", userId, optInt, userId2, str, f, authorAd, optString3, optString4, optString5, k, b, optBoolean, paidReaction, p, i4, i5, longValue, optJSONObject9 != null ? new AttachWall.TextLive(optJSONObject9.optString("title"), optJSONObject9.getString("url")) : null, esv.b(userId), esv.a(userId).b, false, false, jSONObject2.optBoolean("fake_news"), jSONObject2.optBoolean("is_donut_photos"));
                f1e0Var.c(com.vk.dto.common.a.a(userId2));
                f1e0Var.c(b);
            } else {
                j = j4;
                j2 = 1000;
                if (attachWall == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bVar = new MsgFromChannel.b(attachWall.m, attachWall.n, attachWall.d, attachWall.e, attachWall.f, attachWall.r, attachWall.s, attachWall.j, attachWall.C, attachWall.D, attachWall.E, attachWall.v, attachWall.B, attachWall.h, null, attachWall.x, attachWall.w, attachWall.y, attachWall.p, attachWall.t, attachWall.k, attachWall.l, false, attachWall.z, false, false);
            }
            if (attachWall != null && (r1 = attachWall.o) != 0) {
                arrayList = r1;
            }
            for (Attach attach : arrayList) {
                if (attach instanceof AttachForMediaViewer) {
                    AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) attach;
                    j3 = j;
                    attachForMediaViewer.Q1(j3);
                    attachForMediaViewer.d2(i3);
                } else {
                    j3 = j;
                }
                j = j3;
            }
            long j7 = j;
            if (jSONObject.has("research")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("research");
                ArrayList O = f370.O(jSONObject3.getJSONArray("urls"));
                JSONArray jSONArray = jSONObject3.getJSONArray("events");
                ArrayList arrayList2 = new ArrayList(jSONArray.length());
                int i6 = 0;
                for (int length = jSONArray.length(); i6 < length; length = length) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i6);
                    arrayList2.add(new MsgFromChannel.ExternalViewTracking.ViewEvent(jSONObject4.getLong("source_id"), jSONObject4.getString("item_id")));
                    i6++;
                }
                externalViewTracking = new MsgFromChannel.ExternalViewTracking(O, arrayList2);
            } else {
                externalViewTracking = MsgFromChannel.ExternalViewTracking.d;
            }
            MsgFromChannel.ExternalViewTracking externalViewTracking2 = externalViewTracking;
            Serializer.c<MsgFromChannel> cVar2 = MsgFromChannel.CREATOR;
            Serializer.c<Peer> cVar3 = Peer.CREATOR;
            Long z = f370.z(jSONObject, "parent_id");
            Peer b2 = Peer.a.b(z != null ? z.longValue() : 0L);
            long j8 = jSONObject.getLong("time") * j2;
            Peer b3 = Peer.a.b(jSONObject.getLong("author_id"));
            boolean optBoolean2 = jSONObject.optBoolean("is_pinned");
            JSONObject optJSONObject10 = jSONObject.optJSONObject("format_data");
            if (optJSONObject10 != null) {
                String optString6 = optJSONObject10.optString("version");
                bpn0 bpn0Var = cqm0.a;
                try {
                    i = Integer.parseInt(optString6);
                } catch (Throwable unused) {
                    i = 0;
                }
                optJSONObject10.put("version", i);
                MsgTextFormat msgTextFormat2 = MsgTextFormat.d;
                msgTextFormat = MsgTextFormat.a.b(optJSONObject10);
            }
            msgTextFormat = MsgTextFormat.d;
            long optLong = jSONObject.optLong("update_time", 0L);
            Long valueOf2 = Long.valueOf(optLong);
            if (optLong == 0) {
                valueOf2 = null;
            }
            Long valueOf3 = valueOf2 != null ? Long.valueOf(valueOf2.longValue() * j2) : null;
            boolean optBoolean3 = jSONObject.optBoolean("mute_notifications");
            String optString7 = jSONObject.optString("guid");
            String str2 = optString7.length() > 0 ? optString7 : null;
            MsgSyncState msgSyncState = MsgSyncState.DONE;
            MessageSource messageSource = MessageSource.UNDEFINED;
            gkx0 gkx0Var = gkx0.d;
            gkx0 gkx0Var2 = gkx0.c;
            MsgFromChannel a = MsgFromChannel.a.a(0, j7, b2, i3, j8, b3, gkx0Var, false, false, gkx0Var2, gkx0Var2, bVar, msgTextFormat, arrayList, valueOf3, 0, null, false, optBoolean2, optBoolean3, str2, msgSyncState, null, messageSource, externalViewTracking2);
            f1e0Var.c(Peer.a.b(a.c));
            return a;
        } catch (JSONException e) {
            throw new VKApiIllegalResponseException(e);
        }
    }
}
