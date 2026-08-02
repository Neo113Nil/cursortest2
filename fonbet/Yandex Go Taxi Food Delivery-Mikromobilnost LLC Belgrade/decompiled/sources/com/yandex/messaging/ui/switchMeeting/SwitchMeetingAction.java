package com.yandex.messaging.ui.switchMeeting;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.messaging.telemost.domain.entities.CreateMeetingParams;
import com.yandex.messaging.telemost.domain.entities.OpenMeetingParams;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/messaging/ui/switchMeeting/SwitchMeetingAction;", "Landroid/os/Parcelable;", "OpenMeeting", "CreateMeeting", "Lcom/yandex/messaging/ui/switchMeeting/SwitchMeetingAction$CreateMeeting;", "Lcom/yandex/messaging/ui/switchMeeting/SwitchMeetingAction$OpenMeeting;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SwitchMeetingAction extends Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/ui/switchMeeting/SwitchMeetingAction$CreateMeeting;", "Lcom/yandex/messaging/ui/switchMeeting/SwitchMeetingAction;", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams;", "params", "<init>", "(Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams;", "copy", "(Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams;)Lcom/yandex/messaging/ui/switchMeeting/SwitchMeetingAction$CreateMeeting;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/messaging/telemost/domain/entities/CreateMeetingParams;", "getParams", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreateMeeting implements SwitchMeetingAction {
        public static final int $stable = 8;
        public static final Parcelable.Creator<CreateMeeting> CREATOR = new Creator();
        private final CreateMeetingParams params;

        public CreateMeeting(CreateMeetingParams createMeetingParams) {
            this.params = createMeetingParams;
        }

        public static /* synthetic */ CreateMeeting copy$default(CreateMeeting createMeeting, CreateMeetingParams createMeetingParams, int i, Object obj) {
            if ((i & 1) != 0) {
                createMeetingParams = createMeeting.params;
            }
            return createMeeting.copy(createMeetingParams);
        }

        /* renamed from: component1, reason: from getter */
        public final CreateMeetingParams getParams() {
            return this.params;
        }

        public final CreateMeeting copy(CreateMeetingParams params) {
            return new CreateMeeting(params);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateMeeting) && jl40.l(this.params, ((CreateMeeting) other).params);
        }

        public final CreateMeetingParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        public String toString() {
            return "CreateMeeting(params=" + this.params + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.params, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CreateMeeting> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateMeeting createFromParcel(Parcel parcel) {
                return new CreateMeeting((CreateMeetingParams) parcel.readParcelable(CreateMeeting.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreateMeeting[] newArray(int i) {
                return new CreateMeeting[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yandex/messaging/ui/switchMeeting/SwitchMeetingAction$OpenMeeting;", "Lcom/yandex/messaging/ui/switchMeeting/SwitchMeetingAction;", "Lcom/yandex/messaging/telemost/domain/entities/OpenMeetingParams;", "params", "<init>", "(Lcom/yandex/messaging/telemost/domain/entities/OpenMeetingParams;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/yandex/messaging/telemost/domain/entities/OpenMeetingParams;", "copy", "(Lcom/yandex/messaging/telemost/domain/entities/OpenMeetingParams;)Lcom/yandex/messaging/ui/switchMeeting/SwitchMeetingAction$OpenMeeting;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/messaging/telemost/domain/entities/OpenMeetingParams;", "getParams", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenMeeting implements SwitchMeetingAction {
        public static final int $stable = 0;
        public static final Parcelable.Creator<OpenMeeting> CREATOR = new Creator();
        private final OpenMeetingParams params;

        public OpenMeeting(OpenMeetingParams openMeetingParams) {
            this.params = openMeetingParams;
        }

        public static /* synthetic */ OpenMeeting copy$default(OpenMeeting openMeeting, OpenMeetingParams openMeetingParams, int i, Object obj) {
            if ((i & 1) != 0) {
                openMeetingParams = openMeeting.params;
            }
            return openMeeting.copy(openMeetingParams);
        }

        /* renamed from: component1, reason: from getter */
        public final OpenMeetingParams getParams() {
            return this.params;
        }

        public final OpenMeeting copy(OpenMeetingParams params) {
            return new OpenMeeting(params);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenMeeting) && jl40.l(this.params, ((OpenMeeting) other).params);
        }

        public final OpenMeetingParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        public String toString() {
            return "OpenMeeting(params=" + this.params + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.params.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OpenMeeting> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenMeeting createFromParcel(Parcel parcel) {
                return new OpenMeeting(OpenMeetingParams.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenMeeting[] newArray(int i) {
                return new OpenMeeting[i];
            }
        }
    }
}
