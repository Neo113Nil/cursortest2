package xsna;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.core.serialize.Serializer;
import com.vk.dto.articles.Article;
import com.vk.dto.articles.ArticleDonut;
import com.vk.dto.articles.ArticleTts;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionPerformClick;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.article.ArticleTtsInfo;
import com.vk.dto.music.playlist.MarusiaTrackMeta;
import com.vk.dto.newsfeed.CommentDonut;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.photo.Photo;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.dto.status.StatusImageParticipants;
import com.vk.dto.status.StatusImagePopup;
import com.vk.dto.status.StatusImagePopupAnimation;
import com.vk.dto.status.StatusImagePopupBackground;
import com.vk.dto.status.StatusImagePopupPhoto;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.header.HeaderTooltip;
import io.appmetrica.analytics.impl.L2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: Parsers.kt */
/* loaded from: classes15.dex */
public final class vj90 {
    public static final Article a(JSONObject jSONObject, Owner owner) {
        String str;
        Photo photo;
        UserId userId;
        int i;
        String str2;
        ArticleDonut articleDonut;
        String str3;
        UserId userId2;
        Owner owner2;
        ArticleTts articleTts;
        ArticleDonut.Placeholder placeholder;
        UserId userId3 = new UserId(jSONObject.optLong("owner_id"));
        Owner owner3 = owner == null ? new Owner(userId3, jSONObject.optString("owner_name"), null, jSONObject.optString("owner_photo"), null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194292, null) : owner;
        int optInt = jSONObject.optInt("id");
        String optString = jSONObject.optString("access_key");
        long optLong = jSONObject.optLong("published_date");
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("subtitle");
        String optString4 = jSONObject.optString("url");
        String optString5 = jSONObject.optString("view_url");
        String optString6 = jSONObject.optString("state");
        JSONObject optJSONObject = jSONObject.optJSONObject("photo");
        if (optJSONObject != null) {
            str = optString2;
            photo = new Photo(optJSONObject);
        } else {
            str = optString2;
            photo = null;
        }
        int optInt2 = jSONObject.optInt("views");
        boolean optBoolean = jSONObject.optBoolean("is_favorite");
        boolean optBoolean2 = jSONObject.optBoolean("can_report", true);
        boolean optBoolean3 = jSONObject.optBoolean("no_footer", false);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("donut");
        if (optJSONObject2 != null) {
            boolean optBoolean4 = optJSONObject2.optBoolean("is_donut");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("placeholder");
            if (optJSONObject3 != null) {
                String optString7 = optJSONObject3.optString("text");
                userId = userId3;
                String optString8 = optJSONObject3.optString("description");
                i = optInt;
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("button");
                placeholder = new ArticleDonut.Placeholder(optString7, optString8, optJSONObject4 != null ? new LinkButton(optJSONObject4) : null);
            } else {
                userId = userId3;
                i = optInt;
                placeholder = null;
            }
            str2 = str;
            articleDonut = new ArticleDonut(optBoolean4, placeholder);
        } else {
            userId = userId3;
            i = optInt;
            str2 = str;
            articleDonut = null;
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("marusya_tts");
        if (optJSONObject5 != null) {
            Serializer.c<ArticleTts> cVar = ArticleTts.CREATOR;
            int optInt3 = jSONObject.optInt("id");
            String optString9 = jSONObject.optString("url");
            Serializer.c<MarusiaTrackMeta> cVar2 = MarusiaTrackMeta.CREATOR;
            MarusiaTrackMeta a = MarusiaTrackMeta.a.a(optJSONObject5);
            String optString10 = optJSONObject5.optString("stream_id");
            boolean optBoolean5 = optJSONObject5.optBoolean("support_streaming");
            UserId userId4 = userId;
            owner2 = owner3;
            str3 = str2;
            userId2 = userId4;
            articleTts = new ArticleTts(a, new ArticleTtsInfo(optInt3, userId4, optString9, optString10, optBoolean5));
        } else {
            str3 = str2;
            userId2 = userId;
            owner2 = owner3;
            articleTts = null;
        }
        return new Article(i, userId2, optString, optLong, str3, optString3, owner2, optString4, optString5, optString6, photo, optInt2, optBoolean, optBoolean2, optBoolean3, articleDonut, articleTts, cqm0.a(jSONObject.optString("lead_description")), jSONObject.optInt("time_to_read"), jSONObject.optBoolean("can_edit"));
    }

    public static final CommentDonut b(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("is_don");
        JSONObject optJSONObject = jSONObject.optJSONObject("placeholder");
        CommentDonut.Placeholder placeholder = null;
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("text");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("button");
            placeholder = new CommentDonut.Placeholder(optString, optJSONObject2 != null ? new LinkButton(optJSONObject2) : null);
        }
        return new CommentDonut(optBoolean, placeholder);
    }

    public static Description c(JSONObject jSONObject, Map map) {
        Text text;
        ImagePhoto imagePhoto;
        JSONObject optJSONObject = jSONObject.optJSONObject("text");
        if (optJSONObject != null) {
            Serializer.c<Text> cVar = Text.CREATOR;
            text = Text.a.a(optJSONObject);
        } else {
            text = null;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("icon");
        if (optJSONObject2 != null) {
            Serializer.c<ImagePhoto> cVar2 = ImagePhoto.CREATOR;
            imagePhoto = ImagePhoto.a.a(optJSONObject2, null);
        } else {
            imagePhoto = null;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("action");
        HeaderAction a = optJSONObject3 != null ? HeaderAction.a.a(optJSONObject3, map) : null;
        JSONObject optJSONObject4 = jSONObject.optJSONObject("tooltip");
        return new Description(text, imagePhoto, a, optJSONObject4 != null ? new HeaderTooltip(optJSONObject4.optString("text")) : null, cqm0.a(jSONObject.optString("accessibility_text")), jSONObject.optBoolean("is_animable"), false, false, PsExtractor.AUDIO_STREAM, null);
    }

    public static final void d(JSONObject jSONObject, LinkedHashMap linkedHashMap) {
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        if (jSONObject != null && (optJSONArray2 = jSONObject.optJSONArray("profiles")) != null) {
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i);
                if (optJSONObject != null) {
                    Serializer.c<Owner> cVar = Owner.CREATOR;
                    Owner f = Owner.a.f(optJSONObject);
                    linkedHashMap.put(f.b, f);
                }
            }
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("groups")) == null) {
            return;
        }
        int length2 = optJSONArray.length();
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
            if (optJSONObject2 != null) {
                Serializer.c<Owner> cVar2 = Owner.CREATOR;
                Owner d = Owner.a.d(optJSONObject2);
                linkedHashMap.put(d.b, d);
            }
        }
    }

    public static /* synthetic */ Map e(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(jSONObject, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String, xsna.zcl] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public static PostDonut f(JSONObject jSONObject) {
        PostDonut.Placeholder placeholder;
        DonutPostingSettings donutPostingSettings;
        boolean optBoolean = jSONObject.optBoolean("is_donut");
        JSONObject optJSONObject = jSONObject.optJSONObject("placeholder");
        PostDonut.Paywall paywall = 0;
        PostDonut.Snippet snippet = null;
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("text");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("button");
            placeholder = new PostDonut.Placeholder(optString, optJSONObject2 != null ? new LinkButton(optJSONObject2) : null);
        } else {
            placeholder = null;
        }
        Integer valueOf = jSONObject.has("paid_duration") ? Integer.valueOf(jSONObject.optInt("paid_duration")) : null;
        String optString2 = jSONObject.optString("edit_mode");
        JSONArray optJSONArray = jSONObject.optJSONArray("durations");
        if (optJSONArray != null) {
            Serializer.c<DonutPostingSettings> cVar = DonutPostingSettings.CREATOR;
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (optJSONObject3 != null) {
                    arrayList.add(new DonutPostingSettings.Duration(optJSONObject3.optInt("id"), optJSONObject3.optString("name")));
                }
            }
            donutPostingSettings = new DonutPostingSettings(arrayList);
        } else {
            donutPostingSettings = null;
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("paywall");
        if (optJSONObject4 != null) {
            String optString3 = optJSONObject4.optString("text");
            String optString4 = optJSONObject4.optString("hint_text");
            JSONObject optJSONObject5 = optJSONObject4.optJSONObject("snippet");
            if (optJSONObject5 != null) {
                PostDonut.PaywallSnippetIcon.a aVar = PostDonut.PaywallSnippetIcon.Companion;
                String optString5 = optJSONObject5.optString("icon");
                aVar.getClass();
                PostDonut.PaywallSnippetIcon a = PostDonut.PaywallSnippetIcon.a.a(optString5);
                String optString6 = optJSONObject5.optString("title");
                String optString7 = optJSONObject5.optString("subtitle");
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject("button");
                LinkButton linkButton = optJSONObject6 != null ? new LinkButton(optJSONObject6) : null;
                JSONArray optJSONArray2 = optJSONObject5.optJSONArray("photos");
                snippet = new PostDonut.Snippet(a, optString6, optString7, linkButton, optJSONArray2 != null ? new Image(optJSONArray2, paywall, 2, paywall) : null);
            }
            paywall = new PostDonut.Paywall(optString3, optString4, snippet);
        }
        return new PostDonut(optBoolean, placeholder, valueOf, optString2, donutPostingSettings, paywall, Integer.valueOf(jSONObject.optInt("donut_level_id")), Boolean.valueOf(jSONObject.optBoolean("is_level_supported")), jSONObject.optString("photo_avg_color"), jSONObject.optString("price"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static StatusImagePopup g(JSONObject jSONObject) {
        StatusImagePopupBackground statusImagePopupBackground;
        StatusImagePopupPhoto statusImagePopupPhoto;
        StatusImageParticipants statusImageParticipants;
        ArrayList arrayList;
        Action action;
        StatusImagePopupBackground.Theme theme;
        StatusImagePopupBackground.Theme theme2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONArray optJSONArray = jSONObject2.optJSONArray("profiles");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                Serializer.c<Owner> cVar = Owner.CREATOR;
                Owner f = Owner.a.f(jSONObject3);
                linkedHashMap.put(f.b, f);
            }
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("groups");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject jSONObject4 = optJSONArray2.getJSONObject(i2);
                Serializer.c<Owner> cVar2 = Owner.CREATOR;
                Owner d = Owner.a.d(jSONObject4);
                linkedHashMap.put(d.b, d);
            }
        }
        JSONObject jSONObject5 = jSONObject2.getJSONObject("popup");
        Serializer.c<StatusImagePopup> cVar3 = StatusImagePopup.CREATOR;
        JSONObject optJSONObject = jSONObject5.optJSONObject(L2.g);
        String str = null;
        Object[] objArr = 0;
        if (optJSONObject != null) {
            Serializer.c<StatusImagePopupBackground> cVar4 = StatusImagePopupBackground.CREATOR;
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("light");
            if (optJSONObject2 != null) {
                Serializer.c<StatusImagePopupBackground.Theme> cVar5 = StatusImagePopupBackground.Theme.CREATOR;
                theme = StatusImagePopupBackground.Theme.a.a(optJSONObject2);
            } else {
                theme = null;
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("dark");
            if (optJSONObject3 != null) {
                Serializer.c<StatusImagePopupBackground.Theme> cVar6 = StatusImagePopupBackground.Theme.CREATOR;
                theme2 = StatusImagePopupBackground.Theme.a.a(optJSONObject3);
            } else {
                theme2 = null;
            }
            statusImagePopupBackground = new StatusImagePopupBackground(theme, theme2);
        } else {
            statusImagePopupBackground = null;
        }
        JSONObject optJSONObject4 = jSONObject5.optJSONObject("animation");
        StatusImagePopupAnimation statusImagePopupAnimation = optJSONObject4 != null ? new StatusImagePopupAnimation(optJSONObject4.optString("url"), optJSONObject4.optLong("duration"), optJSONObject4.optInt("width"), optJSONObject4.optInt("height"), optJSONObject4.optLong("delay")) : null;
        JSONObject optJSONObject5 = jSONObject5.optJSONObject("photo");
        if (optJSONObject5 != null) {
            Serializer.c<StatusImagePopupPhoto> cVar7 = StatusImagePopupPhoto.CREATOR;
            String optString = optJSONObject5.optString("type");
            JSONArray optJSONArray3 = optJSONObject5.optJSONArray("images");
            statusImagePopupPhoto = new StatusImagePopupPhoto(optString, optJSONArray3 != null ? new Image(optJSONArray3, str, 2, objArr == true ? 1 : 0) : Image.d);
        } else {
            statusImagePopupPhoto = null;
        }
        String a = cqm0.a(jSONObject5.optString("title"));
        String a2 = cqm0.a(jSONObject5.optString("text"));
        JSONObject optJSONObject6 = jSONObject5.optJSONObject(SignalingProtocol.KEY_PARTICIPANTS);
        if (optJSONObject6 != null) {
            Serializer.c<StatusImageParticipants> cVar8 = StatusImageParticipants.CREATOR;
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray4 = optJSONObject6.optJSONArray("items");
            if (optJSONArray4 != null) {
                int length3 = optJSONArray4.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    Owner owner = (Owner) linkedHashMap.get(new UserId(optJSONArray4.getLong(i3)));
                    if (owner != null) {
                        arrayList2.add(owner);
                    }
                }
            }
            statusImageParticipants = new StatusImageParticipants(arrayList2, optJSONObject6.optInt("count"), optJSONObject6.optInt(X3.i.l), cqm0.a(optJSONObject6.optString("text")));
        } else {
            statusImageParticipants = null;
        }
        JSONArray optJSONArray5 = jSONObject5.optJSONArray("buttons");
        Serializer.c<LinkButton> cVar9 = LinkButton.CREATOR;
        if (optJSONArray5 != null) {
            ArrayList arrayList3 = new ArrayList(optJSONArray5.length());
            int length4 = optJSONArray5.length();
            for (int i4 = 0; i4 < length4; i4++) {
                JSONObject optJSONObject7 = optJSONArray5.optJSONObject(i4);
                if (optJSONObject7 != null) {
                    arrayList3.add(new LinkButton(optJSONObject7));
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        String a3 = cqm0.a(jSONObject5.optString("terms"));
        boolean optBoolean = jSONObject5.optBoolean("can_close", true);
        JSONObject optJSONObject8 = jSONObject5.optJSONObject("close_action");
        if (optJSONObject8 != null) {
            Action.b bVar = Action.b;
            action = Action.a.a(optJSONObject8);
        } else {
            action = null;
        }
        return new StatusImagePopup(statusImagePopupBackground, statusImagePopupAnimation, statusImagePopupPhoto, a, a2, statusImageParticipants, arrayList, a3, optBoolean, action instanceof ActionPerformClick ? (ActionPerformClick) action : null);
    }
}
