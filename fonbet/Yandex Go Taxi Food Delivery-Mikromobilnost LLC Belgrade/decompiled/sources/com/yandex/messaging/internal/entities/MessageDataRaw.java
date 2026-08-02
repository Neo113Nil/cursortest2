package com.yandex.messaging.internal.entities;

import androidx.core.provider.FontsContractCompat$Columns;
import com.squareup.moshi.Json;
import com.yandex.messaging.core.net.entities.directives.Button;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.core.net.entities.proto.calls.CallInfo;
import com.yandex.messaging.core.net.entities.proto.message.DepartmentInfo;
import com.yandex.messaging.core.net.entities.proto.message.GroupInfo;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.internal.entities.PollMessageData;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public class MessageDataRaw {

    @Json(name = "actions")
    public Button[] actions;

    @Json(name = "ai_bot_actions")
    public List<AiBotAction> aiBotActions;

    @Json(name = "animated")
    public boolean animated;

    @Json(name = "answerVotes")
    public PollInfoResponse.AnswerVotes[] answerVotes;

    @Json(name = "answers")
    public String[] answers;

    @Json(name = "avatar_id")
    public String avatarId;

    @Json(name = "inline_buttons")
    public Button[][] buttons;

    @Json(name = "call_info")
    public CallInfo callInfo;

    @Json(name = "call_type")
    public Integer callType = 0;

    @Json(name = "card")
    public Map card;

    @Json(name = "departments")
    public DepartmentInfo[] departments;

    @Json(name = DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION)
    public String description;

    @Json(name = "detention_reason")
    @MessageDetentionReason
    public int detentionReason;

    @Json(name = "duration")
    public int duration;

    @Json(name = "duration_seconds")
    public long durationSeconds;

    @Json(name = "duration_video")
    public long durationVideoMs;

    @Json(name = FontsContractCompat$Columns.FILE_ID)
    public String fileId;

    @Json(name = "filename")
    public String fileName;

    @Json(name = "file_source")
    public Integer fileSource;

    @Json(name = "gallery_preview_id")
    public String galleryPreviewId;

    @Json(name = "generic_message_text")
    public String genericMessageText;

    @Json(name = "removed_group_size")
    public int groupSize;

    @Json(name = "groups")
    public GroupInfo[] groups;

    @Json(name = "guests")
    public String[] guestsGuids;

    @Json(name = "guid")
    public String guid;

    @Json(name = "guids")
    public String[] guids;

    @Json(name = "height")
    public Integer height;

    @Json(name = "hidden_by_moderation")
    public boolean hiddenByModeration;

    @Json(name = "sticker_id")
    public String id;

    @Json(name = "initiator")
    public String initiator;

    @Json(name = "is_anonymous")
    public boolean isAnonymous;

    @Json(name = "is_multiselect")
    public boolean isMultiselect;

    @Json(name = "is_silent")
    public boolean isSilent;

    @Json(name = "items")
    public PlainMessage.Item[] items;

    @Json(name = "last_edit_timestamp")
    public long lastEditTimestamp;

    @Json(name = "layout_suggests")
    public List<List<Suggest>> layoutSuggestsRows;

    @Json(name = "meeting_id")
    public String meetingId;

    @Json(name = "message_history_ids")
    public String[] messageIds;

    @Json(name = "moderation_action_user_choice")
    public Boolean moderationActionUserChoice;

    @Json(name = "my_choices")
    public int[] myChoices;

    @Json(name = "name")
    public String name;

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

    @Json(name = CRLReasonCodeExtension.REASON)
    public Integer reason;

    @Json(name = "recognized_text")
    public String recognizedText;

    @Json(name = "regular_suggests")
    public List<Suggest> regularSuggests;

    @Json(name = "sticker_set_id")
    public String setId;

    @Json(name = "size")
    public Long size;

    @Json(name = "text")
    public String text;

    @Json(name = "textSpans")
    public List<MessageSpan> textSpans;

    @Json(name = "thumbHash")
    public byte[] thumbHash;

    @Json(name = "title")
    public String title;

    @Json(name = "type")
    public int type;

    @Json(name = "disable_web_page_preview")
    public Boolean urlPreviewDisabled;

    @Json(name = "results")
    public PollMessageData.VoteResult voteResult;

    @Json(name = CSPDirectoryConstants.SUBDIRECTORY_USERS)
    public ReducedUserInfo voters;

    @Json(name = "was_recognized")
    public boolean wasRecognized;

    @Json(name = "waveform")
    public byte[] waveform;

    @Json(name = "width")
    public Integer width;
}
