package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.attachment.AttachmentStyle;
import com.vk.feed.core.models.attachment.ChipAttachmentStyle;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketLinkAttachment;
import com.vkontakte.android.attachments.MarketMessageOwnerAttachment;
import com.vkontakte.android.attachments.NarrativeAttachment;
import com.vkontakte.android.attachments.SituationalThemeAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: AttachmentParsers.kt */
/* loaded from: classes7.dex */
public final class y64 {
    public static void a(ArrayList arrayList, NewsEntryWithAttachments.Cut cut) {
        Object obj;
        int h;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((EntryAttachment) obj).b instanceof eso0) {
                    break;
                }
            }
        }
        if (obj != null && (h = e43.h(arrayList)) >= 0) {
            int i = 0;
            while (true) {
                EntryAttachment entryAttachment = (EntryAttachment) arrayList.get(i);
                Attachment attachment = entryAttachment.b;
                if (attachment instanceof SnippetAttachment) {
                    SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
                    if (!snippetAttachment.Gb() && !snippetAttachment.Db() && snippetAttachment.B == null) {
                        arrayList.set(i, new EntryAttachment(new LinkAttachment(snippetAttachment), entryAttachment.c, null, null, 12, null));
                    }
                }
                if (i == h) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (cut.Ab()) {
            return;
        }
        if (arrayList.size() > 10) {
            arrayList.subList(10, arrayList.size()).clear();
        }
        g5g.K(arrayList);
    }

    public static int b(NewsEntryWithAttachments newsEntryWithAttachments) {
        NewsEntryWithAttachments.Cut Hb = newsEntryWithAttachments.Hb();
        List<EntryAttachment> Gb = newsEntryWithAttachments.Gb();
        int i = Hb.b;
        if (i >= 0) {
            return i;
        }
        Iterator<EntryAttachment> it = Gb.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            i2++;
            if ((it.next().c instanceof CompactAttachmentStyle) && (i3 = i3 + 1) >= Hb.c) {
                return i2;
            }
        }
        return Gb.size();
    }

    public static List c(NewsEntryWithAttachments newsEntryWithAttachments) {
        return newsEntryWithAttachments.Gb().subList(0, b(newsEntryWithAttachments));
    }

    public static List d(NewsEntryWithAttachments newsEntryWithAttachments) {
        int b = b(newsEntryWithAttachments);
        int i = 0;
        for (EntryAttachment entryAttachment : newsEntryWithAttachments.Gb()) {
            AttachmentStyle attachmentStyle = entryAttachment.c;
            if (!(attachmentStyle instanceof ChipAttachmentStyle) || ((ChipAttachmentStyle) attachmentStyle).c) {
                if (!(entryAttachment.b instanceof GeoAttachment)) {
                    i++;
                }
            }
        }
        return b <= i ? newsEntryWithAttachments.Gb().subList(b, i) : EmptyList.b;
    }

    public static ArrayList e(JSONObject jSONObject, Map map, NewsEntryWithAttachments.Cut cut) {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("attachments");
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList2.add(p6c0.c(optJSONObject, map));
                }
            }
            j5g.W(arrayList2, arrayList);
        }
        a(arrayList, cut);
        return arrayList;
    }

    public static NewsEntryWithAttachments.Cut f(JSONObject jSONObject) {
        return new NewsEntryWithAttachments.Cut(jSONObject.optInt("short_attach_count", -1), jSONObject.optInt("compact_attachments_before_cut", -1), (float) jSONObject.optDouble("short_text_rate", 1.0d), false, 8, null);
    }

    public static final DonutLinkAttachment g(JSONObject jSONObject, Map<UserId, Owner> map) {
        ArrayList arrayList;
        Owner owner;
        UserId userId = new UserId(jSONObject.getLong("owner_id"));
        Action action = null;
        Owner owner2 = map != null ? map.get(userId) : null;
        String optString = jSONObject.optString("text");
        JSONObject optJSONObject = jSONObject.optJSONObject("donors");
        int optInt = optJSONObject != null ? optJSONObject.optInt("count") : 0;
        int optInt2 = optJSONObject != null ? optJSONObject.optInt("friends_count") : 0;
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("friends") : null;
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                long j = optJSONArray.getLong(i);
                if (map != null && (owner = map.get(new UserId(j))) != null) {
                    arrayList.add(owner);
                }
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("button");
        LinkButton linkButton = optJSONObject2 != null ? new LinkButton(optJSONObject2) : null;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("action");
        if (optJSONObject3 != null) {
            Action.b bVar = Action.b;
            action = Action.a.a(optJSONObject3);
        }
        return new DonutLinkAttachment(owner2, userId, optString, optInt, optInt2, arrayList, linkButton, action);
    }

    public static final EventAttachment h(JSONObject jSONObject, Map<UserId, Owner> map) {
        ArrayList arrayList;
        Owner owner = map.get(new UserId(-Math.abs(jSONObject.getLong("id"))));
        if (owner == null) {
            throw new IllegalArgumentException("null owner");
        }
        int optInt = jSONObject.optInt("time");
        String optString = jSONObject.optString(RTCStatsConstants.KEY_ADDRESS);
        int optInt2 = jSONObject.optInt("member_status");
        boolean optBoolean = jSONObject.optBoolean("is_favorite");
        String optString2 = jSONObject.optString("text");
        String optString3 = jSONObject.optString("button_text");
        JSONArray optJSONArray = jSONObject.optJSONArray("friends");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Owner owner2 = map.get(new UserId(optJSONArray.getLong(i)));
                if (owner2 != null) {
                    arrayList.add(owner2);
                }
            }
        }
        return new EventAttachment(owner, optInt, optString, optInt2, optBoolean, optString2, optString3, arrayList);
    }

    public static final EventAttachment i(JSONObject jSONObject) {
        ArrayList arrayList;
        Serializer.c<Owner> cVar = Owner.CREATOR;
        Owner b = Owner.a.b(jSONObject.optJSONObject(NotificationCompat.CATEGORY_EVENT));
        int optInt = jSONObject.optInt("time");
        String optString = jSONObject.optString(RTCStatsConstants.KEY_ADDRESS);
        int optInt2 = jSONObject.optInt("member_status");
        boolean optBoolean = jSONObject.optBoolean("is_favorite");
        String optString2 = jSONObject.optString("text");
        String optString3 = jSONObject.optString("button_text");
        JSONArray optJSONArray = jSONObject.optJSONArray("friends");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    Serializer.c<Owner> cVar2 = Owner.CREATOR;
                    arrayList.add(Owner.a.b(optJSONObject));
                }
            }
        }
        return new EventAttachment(b, optInt, optString, optInt2, optBoolean, optString2, optString3, arrayList);
    }

    public static final MarketLinkAttachment j(JSONObject jSONObject, UserId userId, Map<UserId, Owner> map) {
        Owner owner;
        return new MarketLinkAttachment((map == null || (owner = map.get(userId)) == null) ? null : owner.c, jSONObject.optString("url"));
    }

    public static final MarketMessageOwnerAttachment k(JSONObject jSONObject, Map<UserId, Owner> map) {
        Owner owner;
        UserId userId = new UserId(jSONObject.optLong("owner_id"));
        return new MarketMessageOwnerAttachment(userId, (map == null || (owner = map.get(userId)) == null) ? null : owner.c);
    }

    public static final NarrativeAttachment l(JSONObject jSONObject, Owner owner) {
        Serializer.c<Narrative> cVar = Narrative.CREATOR;
        return new NarrativeAttachment(Narrative.a.c(jSONObject, owner, null));
    }

    public static final SituationalThemeAttachment m(JSONObject jSONObject) {
        return new SituationalThemeAttachment(jSONObject.optInt("id"), jSONObject.optString("title"), jSONObject.optString("description"), jSONObject.optString("link"), jSONObject.optBoolean("is_deleted"));
    }
}
