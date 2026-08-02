package com.yandex.messaging.activity.calls;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.messaging.ChatRequest;
import defpackage.nzs;
import defpackage.r020;
import defpackage.tse0;
import defpackage.xvz;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b'\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b\r\u0010,¨\u0006/"}, d2 = {"Lcom/yandex/messaging/activity/calls/MessengerCallFeedbackArguments;", "Landroid/os/Parcelable;", "Lcom/yandex/messaging/ChatRequest;", "chatRequest", "", ClidProvider.TIMESTAMP, "", "callGuid", "", "hadVideo", "meetingId", "", "meetingEndReason", "isCallInitiator", "<init>", "(Lcom/yandex/messaging/ChatRequest;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/yandex/messaging/ChatRequest;", "getChatRequest", "()Lcom/yandex/messaging/ChatRequest;", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/String;", "getCallGuid", "()Ljava/lang/String;", "Z", "getHadVideo", "()Z", "getMeetingId", "Ljava/lang/Integer;", "getMeetingEndReason", "()Ljava/lang/Integer;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Companion", "r020", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerCallFeedbackArguments implements Parcelable {
    public static final int $stable = 8;
    private static final String CALL_FEEDBACK_ARGUMENTS = "call_feedback_arguments";
    private final String callGuid;
    private final ChatRequest chatRequest;
    private final boolean hadVideo;
    private final Boolean isCallInitiator;
    private final Integer meetingEndReason;
    private final String meetingId;
    private final Long timestamp;
    public static final r020 Companion = new r020();
    public static final Parcelable.Creator<MessengerCallFeedbackArguments> CREATOR = new Creator();

    public MessengerCallFeedbackArguments(ChatRequest chatRequest, Long l, String str, boolean z, String str2, Integer num, Boolean bool) {
        this.chatRequest = chatRequest;
        this.timestamp = l;
        this.callGuid = str;
        this.hadVideo = z;
        this.meetingId = str2;
        this.meetingEndReason = num;
        this.isCallInitiator = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getCallGuid() {
        return this.callGuid;
    }

    public final ChatRequest getChatRequest() {
        return this.chatRequest;
    }

    public final boolean getHadVideo() {
        return this.hadVideo;
    }

    public final Integer getMeetingEndReason() {
        return this.meetingEndReason;
    }

    public final String getMeetingId() {
        return this.meetingId;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: isCallInitiator, reason: from getter */
    public final Boolean getIsCallInitiator() {
        return this.isCallInitiator;
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CALL_FEEDBACK_ARGUMENTS, this);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.chatRequest, flags);
        Long l = this.timestamp;
        if (l == null) {
            dest.writeInt(0);
        } else {
            xvz.z(dest, 1, l);
        }
        dest.writeString(this.callGuid);
        dest.writeInt(this.hadVideo ? 1 : 0);
        dest.writeString(this.meetingId);
        Integer num = this.meetingEndReason;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        Boolean bool = this.isCallInitiator;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MessengerCallFeedbackArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessengerCallFeedbackArguments createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            ChatRequest chatRequest = (ChatRequest) parcel.readParcelable(MessengerCallFeedbackArguments.class.getClassLoader());
            Boolean bool = null;
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() == 0 ? z2 : true);
            }
            return new MessengerCallFeedbackArguments(chatRequest, valueOf, readString, z, readString2, valueOf2, bool);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessengerCallFeedbackArguments[] newArray(int i) {
            return new MessengerCallFeedbackArguments[i];
        }
    }
}
