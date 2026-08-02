package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.x4e;
import defpackage.xuf0;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JH\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/Vote;", "", "chatId", "", "messageTimestamp", "", "choices", "", "", "voteAction", "forwardMessageRef", "Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;", "<init>", "(Ljava/lang/String;J[Ljava/lang/Integer;ILcom/yandex/messaging/core/net/entities/proto/message/MessageRef;)V", "getChatId", "()Ljava/lang/String;", "getMessageTimestamp", "()J", "getChoices", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "getVoteAction", "()I", "getForwardMessageRef", "()Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;J[Ljava/lang/Integer;ILcom/yandex/messaging/core/net/entities/proto/message/MessageRef;)Lcom/yandex/messaging/core/net/entities/proto/message/Vote;", "equals", "", "other", "hashCode", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Vote {

    @Json(name = "ChatId")
    @xuf0(tag = 1)
    private final String chatId;

    @Json(name = "Choices")
    @xuf0(tag = 3)
    private final Integer[] choices;

    @Json(name = "ForwardMessageRef")
    @xuf0(tag = 5)
    private final MessageRef forwardMessageRef;

    @Json(name = "Timestamp")
    @xuf0(tag = 2)
    private final long messageTimestamp;

    @Json(name = "Action")
    @xuf0(tag = 4)
    private final int voteAction;

    public Vote(String str, long j, Integer[] numArr, int i, MessageRef messageRef) {
        this.chatId = str;
        this.messageTimestamp = j;
        this.choices = numArr;
        this.voteAction = i;
        this.forwardMessageRef = messageRef;
    }

    public static /* synthetic */ Vote copy$default(Vote vote, String str, long j, Integer[] numArr, int i, MessageRef messageRef, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = vote.chatId;
        }
        if ((i2 & 2) != 0) {
            j = vote.messageTimestamp;
        }
        if ((i2 & 4) != 0) {
            numArr = vote.choices;
        }
        if ((i2 & 8) != 0) {
            i = vote.voteAction;
        }
        if ((i2 & 16) != 0) {
            messageRef = vote.forwardMessageRef;
        }
        MessageRef messageRef2 = messageRef;
        Integer[] numArr2 = numArr;
        return vote.copy(str, j, numArr2, i, messageRef2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMessageTimestamp() {
        return this.messageTimestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer[] getChoices() {
        return this.choices;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVoteAction() {
        return this.voteAction;
    }

    /* renamed from: component5, reason: from getter */
    public final MessageRef getForwardMessageRef() {
        return this.forwardMessageRef;
    }

    public final Vote copy(String chatId, long messageTimestamp, Integer[] choices, int voteAction, MessageRef forwardMessageRef) {
        return new Vote(chatId, messageTimestamp, choices, voteAction, forwardMessageRef);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vote)) {
            return false;
        }
        Vote vote = (Vote) other;
        return jl40.l(this.chatId, vote.chatId) && this.messageTimestamp == vote.messageTimestamp && jl40.l(this.choices, vote.choices) && this.voteAction == vote.voteAction && jl40.l(this.forwardMessageRef, vote.forwardMessageRef);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final Integer[] getChoices() {
        return this.choices;
    }

    public final MessageRef getForwardMessageRef() {
        return this.forwardMessageRef;
    }

    public final long getMessageTimestamp() {
        return this.messageTimestamp;
    }

    public final int getVoteAction() {
        return this.voteAction;
    }

    public int hashCode() {
        int b = oyr.b(this.voteAction, (qv10.c(this.chatId.hashCode() * 31, 31, this.messageTimestamp) + Arrays.hashCode(this.choices)) * 31, 31);
        MessageRef messageRef = this.forwardMessageRef;
        return b + (messageRef == null ? 0 : messageRef.hashCode());
    }

    public String toString() {
        String str = this.chatId;
        long j = this.messageTimestamp;
        String arrays = Arrays.toString(this.choices);
        int i = this.voteAction;
        MessageRef messageRef = this.forwardMessageRef;
        StringBuilder l = x4e.l("Vote(chatId=", str, ", messageTimestamp=", j);
        l.append(", choices=");
        l.append(arrays);
        l.append(", voteAction=");
        l.append(i);
        l.append(", forwardMessageRef=");
        l.append(messageRef);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
