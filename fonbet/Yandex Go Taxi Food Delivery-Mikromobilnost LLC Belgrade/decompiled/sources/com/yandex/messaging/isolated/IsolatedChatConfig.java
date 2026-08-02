package com.yandex.messaging.isolated;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.messaging.sdk.MessengerTimelineGestureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/yandex/messaging/isolated/IsolatedChatConfig;", "Landroid/os/Parcelable;", "", "showEmojiButton", "showInput", "showAttachmentButton", "showScrollToBottomFab", "Lcom/yandex/messaging/sdk/MessengerTimelineGestureConfig;", "timelineGestureConfig", "fadingEdgeEnabled", "", "fadingEdgeLength", "allowMakeStarredMessages", "allowSilentMessages", "showMetadataPanel", "Lcom/yandex/messaging/isolated/IsolatedTranslatorConfig;", "translatorConfig", "<init>", "(ZZZZLcom/yandex/messaging/sdk/MessengerTimelineGestureConfig;ZIZZZLcom/yandex/messaging/isolated/IsolatedTranslatorConfig;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Z", "getShowEmojiButton", "()Z", "getShowInput", "getShowAttachmentButton", "getShowScrollToBottomFab", "Lcom/yandex/messaging/sdk/MessengerTimelineGestureConfig;", "getTimelineGestureConfig", "()Lcom/yandex/messaging/sdk/MessengerTimelineGestureConfig;", "getFadingEdgeEnabled", CA20Status.STATUS_USER_I, "getFadingEdgeLength", "getAllowMakeStarredMessages", "getAllowSilentMessages", "getShowMetadataPanel", "Lcom/yandex/messaging/isolated/IsolatedTranslatorConfig;", "getTranslatorConfig", "()Lcom/yandex/messaging/isolated/IsolatedTranslatorConfig;", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IsolatedChatConfig implements Parcelable {
    public static final Parcelable.Creator<IsolatedChatConfig> CREATOR = new Creator();
    private final boolean allowMakeStarredMessages;
    private final boolean allowSilentMessages;
    private final boolean fadingEdgeEnabled;
    private final int fadingEdgeLength;
    private final boolean showAttachmentButton;
    private final boolean showEmojiButton;
    private final boolean showInput;
    private final boolean showMetadataPanel;
    private final boolean showScrollToBottomFab;
    private final MessengerTimelineGestureConfig timelineGestureConfig;
    private final IsolatedTranslatorConfig translatorConfig;

    public /* synthetic */ IsolatedChatConfig(boolean z, boolean z2, boolean z3, boolean z4, MessengerTimelineGestureConfig messengerTimelineGestureConfig, boolean z5, int i, boolean z6, boolean z7, boolean z8, IsolatedTranslatorConfig isolatedTranslatorConfig, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? true : z4, (i2 & 16) != 0 ? MessengerTimelineGestureConfig.AllEnabledConfig.INSTANCE : messengerTimelineGestureConfig, (i2 & 32) != 0 ? false : z5, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? true : z6, (i2 & 256) != 0 ? false : z7, (i2 & 512) != 0 ? true : z8, (i2 & 1024) != 0 ? null : isolatedTranslatorConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean getAllowMakeStarredMessages() {
        return this.allowMakeStarredMessages;
    }

    public final boolean getAllowSilentMessages() {
        return this.allowSilentMessages;
    }

    public final boolean getFadingEdgeEnabled() {
        return this.fadingEdgeEnabled;
    }

    public final int getFadingEdgeLength() {
        return this.fadingEdgeLength;
    }

    public final boolean getShowAttachmentButton() {
        return this.showAttachmentButton;
    }

    public final boolean getShowEmojiButton() {
        return this.showEmojiButton;
    }

    public final boolean getShowInput() {
        return this.showInput;
    }

    public final boolean getShowMetadataPanel() {
        return this.showMetadataPanel;
    }

    public final boolean getShowScrollToBottomFab() {
        return this.showScrollToBottomFab;
    }

    public final MessengerTimelineGestureConfig getTimelineGestureConfig() {
        return this.timelineGestureConfig;
    }

    public final IsolatedTranslatorConfig getTranslatorConfig() {
        return this.translatorConfig;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.showEmojiButton ? 1 : 0);
        dest.writeInt(this.showInput ? 1 : 0);
        dest.writeInt(this.showAttachmentButton ? 1 : 0);
        dest.writeInt(this.showScrollToBottomFab ? 1 : 0);
        dest.writeParcelable(this.timelineGestureConfig, flags);
        dest.writeInt(this.fadingEdgeEnabled ? 1 : 0);
        dest.writeInt(this.fadingEdgeLength);
        dest.writeInt(this.allowMakeStarredMessages ? 1 : 0);
        dest.writeInt(this.allowSilentMessages ? 1 : 0);
        dest.writeInt(this.showMetadataPanel ? 1 : 0);
        IsolatedTranslatorConfig isolatedTranslatorConfig = this.translatorConfig;
        if (isolatedTranslatorConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            isolatedTranslatorConfig.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IsolatedChatConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IsolatedChatConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            MessengerTimelineGestureConfig messengerTimelineGestureConfig;
            boolean z6;
            boolean z7;
            int i;
            boolean z8;
            boolean z9;
            boolean z10 = false;
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z10 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z11 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            MessengerTimelineGestureConfig messengerTimelineGestureConfig2 = (MessengerTimelineGestureConfig) parcel.readParcelable(IsolatedChatConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z5 = z4;
                messengerTimelineGestureConfig = messengerTimelineGestureConfig2;
                z6 = z5;
            } else {
                z5 = z4;
                messengerTimelineGestureConfig = messengerTimelineGestureConfig2;
                z6 = z;
            }
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                z7 = z5;
                i = readInt;
                z8 = z7;
            } else {
                z7 = z5;
                i = readInt;
                z8 = z;
            }
            if (parcel.readInt() != 0) {
                z9 = z7;
            } else {
                z9 = z7;
                z7 = z;
            }
            if (parcel.readInt() == 0) {
                z9 = z;
            }
            return new IsolatedChatConfig(z10, z11, z2, z3, messengerTimelineGestureConfig, z6, i, z8, z7, z9, parcel.readInt() == 0 ? null : IsolatedTranslatorConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IsolatedChatConfig[] newArray(int i) {
            return new IsolatedChatConfig[i];
        }
    }

    public IsolatedChatConfig(boolean z, boolean z2, boolean z3, boolean z4, MessengerTimelineGestureConfig messengerTimelineGestureConfig, boolean z5, int i, boolean z6, boolean z7, boolean z8, IsolatedTranslatorConfig isolatedTranslatorConfig) {
        this.showEmojiButton = z;
        this.showInput = z2;
        this.showAttachmentButton = z3;
        this.showScrollToBottomFab = z4;
        this.timelineGestureConfig = messengerTimelineGestureConfig;
        this.fadingEdgeEnabled = z5;
        this.fadingEdgeLength = i;
        this.allowMakeStarredMessages = z6;
        this.allowSilentMessages = z7;
        this.showMetadataPanel = z8;
        this.translatorConfig = isolatedTranslatorConfig;
    }

    public IsolatedChatConfig() {
        this(false, false, false, false, null, false, 0, false, false, false, null, 2047, null);
    }
}
