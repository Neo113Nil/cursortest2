package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.dto.action_button.ActionButtonDonutGoal;
import com.vk.dto.action_button.ActionButtonDonutLevel;
import com.vk.dto.action_button.ActionButtonProgress;
import com.vk.dto.common.actions.Action;
import com.vk.internal.api.GsonHolder;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import org.json.JSONObject;

/* compiled from: ActionButtonAttachmentParser.kt */
/* loaded from: classes7.dex */
public final class ou {
    public static final ActionButtonAttachment a(JSONObject jSONObject) {
        ActionButtonDonutGoal actionButtonDonutGoal;
        ActionButtonDonutLevel actionButtonDonutLevel;
        Integer x;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("title");
        JSONObject optJSONObject = jSONObject.optJSONObject("action");
        if (optJSONObject == null) {
            throw new IllegalArgumentException("jsonObject doesn't contain required 'action' field");
        }
        Action.b bVar = Action.b;
        Action a = Action.a.a(optJSONObject);
        if (a == null) {
            throw new IllegalStateException("action can't be null");
        }
        String optString3 = optJSONObject.optString("action_title");
        JSONObject optJSONObject2 = jSONObject.optJSONObject(NotificationCompat.CATEGORY_PROGRESS);
        ActionButtonProgress actionButtonProgress = (optJSONObject2 == null || (x = f370.x(optJSONObject2, "percentage")) == null) ? null : new ActionButtonProgress(x.intValue());
        JSONObject optJSONObject3 = jSONObject.optJSONObject("donut_goal");
        if (optJSONObject3 != null) {
            Long z = f370.z(optJSONObject3, "goal_id");
            actionButtonDonutGoal = z != null ? new ActionButtonDonutGoal(z.longValue()) : null;
        } else {
            actionButtonDonutGoal = null;
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("donut_level");
        if (optJSONObject4 != null) {
            Long z2 = f370.z(optJSONObject4, "level_id");
            actionButtonDonutLevel = z2 != null ? new ActionButtonDonutLevel(z2.longValue()) : null;
        } else {
            actionButtonDonutLevel = null;
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("vk_ticket");
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto = optJSONObject5 != null ? (WallActionButtonVkTicketDto) GsonHolder.a().fromJson(optJSONObject5.toString(), WallActionButtonVkTicketDto.class) : null;
        JSONObject optJSONObject6 = jSONObject.optJSONObject("subtitle");
        return new ActionButtonAttachment(optString, optString2, a, actionButtonProgress, actionButtonDonutGoal, actionButtonDonutLevel, optJSONObject6 != null ? (NewsfeedNewsfeedItemHeaderTextDto) GsonHolder.a().fromJson(optJSONObject6.toString(), NewsfeedNewsfeedItemHeaderTextDto.class) : null, optString3, jSONObject.optString("accessibility_title"), wallActionButtonVkTicketDto);
    }
}
