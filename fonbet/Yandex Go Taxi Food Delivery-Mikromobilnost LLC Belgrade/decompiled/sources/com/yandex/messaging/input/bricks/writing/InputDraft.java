package com.yandex.messaging.input.bricks.writing;

import android.text.TextUtils;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import defpackage.jxi;
import java.util.List;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR.\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0017\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b \u0010\u001dR&\u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0003\u001a\u0004\b#\u0010\b\"\u0004\b$\u0010\nR.\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010,\u0012\u0004\b'\u0010\u0003\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R,\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b0\u0010\u0003\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u0010\u0003\u001a\u0004\b5\u0010\u001b\"\u0004\b7\u0010\u001dR$\u00108\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b9\u0010\u0003\u001a\u0004\b8\u0010\u001b\"\u0004\b:\u0010\u001dR\u0011\u0010;\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b<\u0010\u001bR\u0011\u0010=\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b>\u0010\u001bR\u0011\u0010?\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b?\u0010\u001b¨\u0006@"}, d2 = {"Lcom/yandex/messaging/input/bricks/writing/InputDraft;", "", "<init>", "()V", "text", "", "getText$annotations", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "forwardChatId", "getForwardChatId$annotations", "getForwardChatId", "setForwardChatId", "forwardMessageTimestamps", "", "Lcom/yandex/messaging/internal/ServerMessageRef;", "getForwardMessageTimestamps$annotations", "getForwardMessageTimestamps", "()[Lcom/yandex/messaging/internal/ServerMessageRef;", "setForwardMessageTimestamps", "([Lcom/yandex/messaging/internal/ServerMessageRef;)V", "[Lcom/yandex/messaging/internal/ServerMessageRef;", "isReply", "", "isReply$annotations", "()Z", "setReply", "(Z)V", "isQuote", "isQuote$annotations", "setQuote", "quotedText", "getQuotedText$annotations", "getQuotedText", "setQuotedText", "forwardMessages", "Lcom/yandex/messaging/internal/entities/ForwardMessageRef;", "getForwardMessages$annotations", "getForwardMessages", "()[Lcom/yandex/messaging/internal/entities/ForwardMessageRef;", "setForwardMessages", "([Lcom/yandex/messaging/internal/entities/ForwardMessageRef;)V", "[Lcom/yandex/messaging/internal/entities/ForwardMessageRef;", "attachments", "", "Lcom/yandex/messaging/internal/view/attach/AttachInfo;", "getAttachments$annotations", "getAttachments", "()Ljava/util/List;", "setAttachments", "(Ljava/util/List;)V", "isStarred", "isStarred$annotations", "setStarred", "isSilent", "isSilent$annotations", "setSilent", "hasAttachments", "getHasAttachments", "hasForwards", "getHasForwards", "isEmpty", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InputDraft {
    public static final int $stable = 8;
    private List<? extends AttachInfo> attachments;
    private String forwardChatId;
    private ServerMessageRef[] forwardMessageTimestamps = new ServerMessageRef[0];
    private ForwardMessageRef[] forwardMessages = new ForwardMessageRef[0];
    private boolean isQuote;
    private boolean isReply;
    private boolean isSilent;
    private boolean isStarred;
    private String quotedText;
    private String text;

    @Json(name = "attachments")
    public static /* synthetic */ void getAttachments$annotations() {
    }

    @jxi
    @Json(name = "forward_chat_id")
    public static /* synthetic */ void getForwardChatId$annotations() {
    }

    @jxi
    @Json(name = "forward_messages_timestamps")
    public static /* synthetic */ void getForwardMessageTimestamps$annotations() {
    }

    @Json(name = "forwards")
    public static /* synthetic */ void getForwardMessages$annotations() {
    }

    @Json(name = "quoted_text")
    public static /* synthetic */ void getQuotedText$annotations() {
    }

    @Json(name = "text")
    public static /* synthetic */ void getText$annotations() {
    }

    @Json(name = "is_quote")
    public static /* synthetic */ void isQuote$annotations() {
    }

    @Json(name = "is_reply")
    public static /* synthetic */ void isReply$annotations() {
    }

    @Json(name = "is_silent")
    public static /* synthetic */ void isSilent$annotations() {
    }

    @Json(name = "is_starred")
    public static /* synthetic */ void isStarred$annotations() {
    }

    public final List<AttachInfo> getAttachments() {
        return this.attachments;
    }

    public final String getForwardChatId() {
        return this.forwardChatId;
    }

    public final ServerMessageRef[] getForwardMessageTimestamps() {
        return this.forwardMessageTimestamps;
    }

    public final ForwardMessageRef[] getForwardMessages() {
        return this.forwardMessages;
    }

    public final boolean getHasAttachments() {
        List<? extends AttachInfo> list = this.attachments;
        return !(list == null || list.isEmpty());
    }

    public final boolean getHasForwards() {
        ServerMessageRef[] serverMessageRefArr;
        String str = this.forwardChatId;
        if (str != null && str.length() != 0 && (serverMessageRefArr = this.forwardMessageTimestamps) != null && serverMessageRefArr.length != 0) {
            return true;
        }
        ForwardMessageRef[] forwardMessageRefArr = this.forwardMessages;
        return (forwardMessageRefArr == null || forwardMessageRefArr.length == 0) ? false : true;
    }

    public final String getQuotedText() {
        return this.quotedText;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isEmpty() {
        return (!TextUtils.isEmpty(this.text) || getHasForwards() || getHasAttachments() || this.isStarred) ? false : true;
    }

    /* renamed from: isQuote, reason: from getter */
    public final boolean getIsQuote() {
        return this.isQuote;
    }

    /* renamed from: isReply, reason: from getter */
    public final boolean getIsReply() {
        return this.isReply;
    }

    /* renamed from: isSilent, reason: from getter */
    public final boolean getIsSilent() {
        return this.isSilent;
    }

    /* renamed from: isStarred, reason: from getter */
    public final boolean getIsStarred() {
        return this.isStarred;
    }

    public final void setAttachments(List<? extends AttachInfo> list) {
        this.attachments = list;
    }

    public final void setForwardChatId(String str) {
        this.forwardChatId = str;
    }

    public final void setForwardMessageTimestamps(ServerMessageRef[] serverMessageRefArr) {
        this.forwardMessageTimestamps = serverMessageRefArr;
    }

    public final void setForwardMessages(ForwardMessageRef[] forwardMessageRefArr) {
        this.forwardMessages = forwardMessageRefArr;
    }

    public final void setQuote(boolean z) {
        this.isQuote = z;
    }

    public final void setQuotedText(String str) {
        this.quotedText = str;
    }

    public final void setReply(boolean z) {
        this.isReply = z;
    }

    public final void setSilent(boolean z) {
        this.isSilent = z;
    }

    public final void setStarred(boolean z) {
        this.isStarred = z;
    }

    public final void setText(String str) {
        this.text = str;
    }
}
