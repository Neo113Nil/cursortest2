package com.yandex.messaging.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/sdk/MessengerTimelineGestureConfig;", "Landroid/os/Parcelable;", "canClick", "", "getCanClick", "()Z", "canLongClick", "getCanLongClick", "canSwipe", "getCanSwipe", "AllEnabledConfig", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MessengerTimelineGestureConfig extends Parcelable {
    boolean getCanClick();

    boolean getCanLongClick();

    boolean getCanSwipe();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/sdk/MessengerTimelineGestureConfig$AllEnabledConfig;", "Lcom/yandex/messaging/sdk/MessengerTimelineGestureConfig;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "getCanClick", "()Z", "canClick", "getCanLongClick", "canLongClick", "getCanSwipe", "canSwipe", "messaging-core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AllEnabledConfig implements MessengerTimelineGestureConfig {
        public static final AllEnabledConfig INSTANCE = new AllEnabledConfig();
        public static final Parcelable.Creator<AllEnabledConfig> CREATOR = new Creator();

        private AllEnabledConfig() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.yandex.messaging.sdk.MessengerTimelineGestureConfig
        public boolean getCanClick() {
            return true;
        }

        @Override // com.yandex.messaging.sdk.MessengerTimelineGestureConfig
        public boolean getCanLongClick() {
            return true;
        }

        @Override // com.yandex.messaging.sdk.MessengerTimelineGestureConfig
        public boolean getCanSwipe() {
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AllEnabledConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllEnabledConfig createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AllEnabledConfig.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AllEnabledConfig[] newArray(int i) {
                return new AllEnabledConfig[i];
            }
        }
    }
}
