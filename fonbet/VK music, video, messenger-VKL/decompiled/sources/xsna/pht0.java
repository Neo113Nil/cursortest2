package xsna;

import android.net.Uri;
import com.ironsource.X3;
import com.vk.common.links.AwayLink;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.attachments.VideoSnippetAttachment;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;

/* compiled from: VideoSnippetAttachmentParser.kt */
/* loaded from: classes7.dex */
public final class pht0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, com.vk.dto.newsfeed.ButtonAction] */
    public static final VideoSnippetAttachment a(JSONObject jSONObject, Map<UserId, Owner> map) {
        String str;
        String str2;
        Owner owner;
        VideoFileOld b = com.vk.dto.common.c.b(jSONObject.getJSONObject("video"));
        if (map != null && (owner = map.get(b.b)) != null) {
            b.f1(owner);
        }
        String optString = jSONObject.optString("description");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        JSONObject optJSONObject = jSONObject.optJSONObject("button");
        AwayLink awayLink = null;
        if (optJSONObject != null) {
            str = optJSONObject.optString("title");
            str2 = optJSONObject.optString("url");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("action");
            ref$ObjectRef.element = optJSONObject2 != null ? new ButtonAction(optJSONObject2) : 0;
        } else {
            str = "";
            str2 = "";
        }
        if (jSONObject.has("link_url")) {
            str = jSONObject.optString("button");
            str2 = jSONObject.optString("link_url");
            ref$ObjectRef.element = new ButtonAction(jSONObject);
        }
        String str3 = str2;
        String str4 = str;
        if (jSONObject.has("url")) {
            awayLink = new AwayLink(jSONObject.getString("url"), AwayLink.a.a(jSONObject));
        } else if (jSONObject.has("link_url")) {
            awayLink = new AwayLink(jSONObject.getString("link_url"), AwayLink.a.a(jSONObject));
        }
        String optString2 = jSONObject.optString("target");
        String optString3 = jSONObject.optString("title");
        String optString4 = jSONObject.optString("caption");
        if (optString4 == null || optString4.length() == 0) {
            if (jSONObject.has(X3.j.D)) {
                optString4 = jSONObject.optString(X3.j.D);
            } else if (awayLink != null) {
                optString4 = Uri.parse(awayLink.b).getAuthority();
            }
        }
        return new VideoSnippetAttachment(b, awayLink, optString3, optString, optString4, optString2, str4, str3, (ButtonAction) ref$ObjectRef.element);
    }
}
