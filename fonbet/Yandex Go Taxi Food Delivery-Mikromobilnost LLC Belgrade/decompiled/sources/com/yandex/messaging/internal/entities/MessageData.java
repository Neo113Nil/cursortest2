package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class MessageData {

    @Json(name = "ai_bot_actions")
    public List<AiBotAction> aiBotActions;

    @Json(name = "detention_reason")
    @MessageDetentionReason
    public int detentionReason;

    @Json(name = "hidden_by_moderation")
    public boolean hiddenByModeration;

    @Json(name = "is_silent")
    public boolean isSilent;

    @Json(name = "last_edit_timestamp")
    public long lastEditTimestamp;

    @Json(name = "layout_suggests")
    public List<List<Suggest>> layoutSuggestsRows;

    @Json(name = "moderation_action_user_choice")
    public Boolean moderationUserChoice;

    @Json(name = "notification_behaviour")
    public int notificationBehaviour;

    @Json(name = "notification_text")
    public String notificationText;

    @Json(name = "payloadId")
    public String payloadId;

    @Json(name = "persistent_suggests")
    public Boolean persistentSuggests;

    @Json(name = "reactions")
    public MessageReactions reactions;

    @Json(name = "reactions_version")
    public long reactionsVersion;

    @Json(name = "regular_suggests")
    public List<Suggest> regularSuggests;

    @Json(name = "text")
    public String text;

    @Json(name = "textSpans")
    public List<MessageSpan> textSpans;

    @Json(name = "type")
    public int type;

    @Json(name = "disable_web_page_preview")
    public Boolean urlPreviewDisabled;

    public MessageData(int i, String str) {
        this.type = i;
        this.text = str;
    }

    public MessageData() {
    }
}
