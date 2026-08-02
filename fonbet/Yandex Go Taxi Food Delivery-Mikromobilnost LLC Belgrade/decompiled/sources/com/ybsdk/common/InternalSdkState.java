package com.ybsdk.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.common.entities.SessionEntity$ActionReason;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB-\b\u0004\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\r !\"#$%&'()*+,¨\u0006-"}, d2 = {"Lcom/ybsdk/common/InternalSdkState;", "Landroid/os/Parcelable;", "applications", "", "Lcom/ybsdk/common/entities/SessionApplicationEntity;", "source", "Lcom/ybsdk/common/StartSessionCallSource;", "sessionStateAction", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "<init>", "(Ljava/util/List;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "getApplications", "()Ljava/util/List;", "getSource", "()Lcom/ybsdk/common/StartSessionCallSource;", "getSessionStateAction", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "getRequiredApplications", "Ok", "Unauthenticated", "UpdateRequired", "SmsAuthorization", "AccountUpgrade", "YbRegistration", "OpenProduct", "Support", "StartSessionDeeplink", "RequestNewAmToken", "ApplicationStatusCheck", "Error", "PinInput", "PinTokenClear", "Lcom/ybsdk/common/InternalSdkState$AccountUpgrade;", "Lcom/ybsdk/common/InternalSdkState$ApplicationStatusCheck;", "Lcom/ybsdk/common/InternalSdkState$Error;", "Lcom/ybsdk/common/InternalSdkState$Ok;", "Lcom/ybsdk/common/InternalSdkState$OpenProduct;", "Lcom/ybsdk/common/InternalSdkState$PinInput;", "Lcom/ybsdk/common/InternalSdkState$RequestNewAmToken;", "Lcom/ybsdk/common/InternalSdkState$SmsAuthorization;", "Lcom/ybsdk/common/InternalSdkState$StartSessionDeeplink;", "Lcom/ybsdk/common/InternalSdkState$Support;", "Lcom/ybsdk/common/InternalSdkState$Unauthenticated;", "Lcom/ybsdk/common/InternalSdkState$UpdateRequired;", "Lcom/ybsdk/common/InternalSdkState$YbRegistration;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class InternalSdkState implements Parcelable {
    private final List<SessionApplicationEntity> applications;
    private final SessionEntity$Action sessionStateAction;
    private final StartSessionCallSource source;

    public /* synthetic */ InternalSdkState(List list, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.a : list, startSessionCallSource, (i & 4) != 0 ? null : sessionEntity$Action, null);
    }

    public List<SessionApplicationEntity> getApplications() {
        return this.applications;
    }

    public final List<SessionApplicationEntity> getRequiredApplications() {
        List<SessionApplicationEntity> applications = getApplications();
        ArrayList arrayList = new ArrayList();
        for (Object obj : applications) {
            SessionApplicationEntity sessionApplicationEntity = (SessionApplicationEntity) obj;
            if (sessionApplicationEntity.getType() != ApplicationTypeEntity.UNKNOWN && sessionApplicationEntity.getRequired()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public SessionEntity$Action getSessionStateAction() {
        return this.sessionStateAction;
    }

    public StartSessionCallSource getSource() {
        return this.source;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$PinInput;", "Lcom/ybsdk/common/InternalSdkState;", "source", "Lcom/ybsdk/common/StartSessionCallSource;", "sessionStateAction", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "<init>", "(Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "getSource", "()Lcom/ybsdk/common/StartSessionCallSource;", "getSessionStateAction", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "PinTokenRetry", "PinTokenReissue", "Lcom/ybsdk/common/InternalSdkState$PinInput$PinTokenReissue;", "Lcom/ybsdk/common/InternalSdkState$PinInput$PinTokenRetry;", "Lcom/ybsdk/common/InternalSdkState$PinTokenClear;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class PinInput extends InternalSdkState {
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;

        private PinInput(StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0018¨\u0006*"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$PinInput$PinTokenReissue;", "Lcom/ybsdk/common/InternalSdkState$PinInput;", "Lcom/ybsdk/common/entities/SessionEntity$ActionReason;", "actionReason", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Lcom/ybsdk/common/entities/SessionEntity$ActionReason;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/common/entities/SessionEntity$ActionReason;", "component2", "()Lcom/ybsdk/common/StartSessionCallSource;", "component3", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Lcom/ybsdk/common/entities/SessionEntity$ActionReason;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$PinInput$PinTokenReissue;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/common/entities/SessionEntity$ActionReason;", "getActionReason", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PinTokenReissue extends PinInput {
            public static final Parcelable.Creator<PinTokenReissue> CREATOR = new Creator();
            private final SessionEntity$ActionReason actionReason;
            private final SessionEntity$Action sessionStateAction;
            private final StartSessionCallSource source;

            public PinTokenReissue(SessionEntity$ActionReason sessionEntity$ActionReason, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
                super(startSessionCallSource, sessionEntity$Action, null);
                this.actionReason = sessionEntity$ActionReason;
                this.source = startSessionCallSource;
                this.sessionStateAction = sessionEntity$Action;
            }

            public static /* synthetic */ PinTokenReissue copy$default(PinTokenReissue pinTokenReissue, SessionEntity$ActionReason sessionEntity$ActionReason, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
                if ((i & 1) != 0) {
                    sessionEntity$ActionReason = pinTokenReissue.actionReason;
                }
                if ((i & 2) != 0) {
                    startSessionCallSource = pinTokenReissue.source;
                }
                if ((i & 4) != 0) {
                    sessionEntity$Action = pinTokenReissue.sessionStateAction;
                }
                return pinTokenReissue.copy(sessionEntity$ActionReason, startSessionCallSource, sessionEntity$Action);
            }

            /* renamed from: component1, reason: from getter */
            public final SessionEntity$ActionReason getActionReason() {
                return this.actionReason;
            }

            /* renamed from: component2, reason: from getter */
            public final StartSessionCallSource getSource() {
                return this.source;
            }

            /* renamed from: component3, reason: from getter */
            public final SessionEntity$Action getSessionStateAction() {
                return this.sessionStateAction;
            }

            public final PinTokenReissue copy(SessionEntity$ActionReason actionReason, StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
                return new PinTokenReissue(actionReason, source, sessionStateAction);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PinTokenReissue)) {
                    return false;
                }
                PinTokenReissue pinTokenReissue = (PinTokenReissue) other;
                return this.actionReason == pinTokenReissue.actionReason && jl40.l(this.source, pinTokenReissue.source) && this.sessionStateAction == pinTokenReissue.sessionStateAction;
            }

            public final SessionEntity$ActionReason getActionReason() {
                return this.actionReason;
            }

            @Override // com.ybsdk.common.InternalSdkState.PinInput, com.ybsdk.common.InternalSdkState
            public SessionEntity$Action getSessionStateAction() {
                return this.sessionStateAction;
            }

            @Override // com.ybsdk.common.InternalSdkState.PinInput, com.ybsdk.common.InternalSdkState
            public StartSessionCallSource getSource() {
                return this.source;
            }

            public int hashCode() {
                SessionEntity$ActionReason sessionEntity$ActionReason = this.actionReason;
                int hashCode = sessionEntity$ActionReason == null ? 0 : sessionEntity$ActionReason.hashCode();
                return this.sessionStateAction.hashCode() + ((this.source.hashCode() + (hashCode * 31)) * 31);
            }

            public String toString() {
                return "PinTokenReissue(actionReason=" + this.actionReason + ", source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                SessionEntity$ActionReason sessionEntity$ActionReason = this.actionReason;
                if (sessionEntity$ActionReason == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(sessionEntity$ActionReason.name());
                }
                dest.writeParcelable(this.source, flags);
                dest.writeString(this.sessionStateAction.name());
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PinTokenReissue> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PinTokenReissue createFromParcel(Parcel parcel) {
                    return new PinTokenReissue(parcel.readInt() == 0 ? null : SessionEntity$ActionReason.valueOf(parcel.readString()), (StartSessionCallSource) parcel.readParcelable(PinTokenReissue.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PinTokenReissue[] newArray(int i) {
                    return new PinTokenReissue[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0016¨\u0006("}, d2 = {"Lcom/ybsdk/common/InternalSdkState$PinInput$PinTokenRetry;", "Lcom/ybsdk/common/InternalSdkState$PinInput;", "", "pinAttemptsLeft", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(ILcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Lcom/ybsdk/common/StartSessionCallSource;", "component3", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(ILcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$PinInput$PinTokenRetry;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getPinAttemptsLeft", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PinTokenRetry extends PinInput {
            public static final Parcelable.Creator<PinTokenRetry> CREATOR = new Creator();
            private final int pinAttemptsLeft;
            private final SessionEntity$Action sessionStateAction;
            private final StartSessionCallSource source;

            public PinTokenRetry(int i, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
                super(startSessionCallSource, sessionEntity$Action, null);
                this.pinAttemptsLeft = i;
                this.source = startSessionCallSource;
                this.sessionStateAction = sessionEntity$Action;
            }

            public static /* synthetic */ PinTokenRetry copy$default(PinTokenRetry pinTokenRetry, int i, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = pinTokenRetry.pinAttemptsLeft;
                }
                if ((i2 & 2) != 0) {
                    startSessionCallSource = pinTokenRetry.source;
                }
                if ((i2 & 4) != 0) {
                    sessionEntity$Action = pinTokenRetry.sessionStateAction;
                }
                return pinTokenRetry.copy(i, startSessionCallSource, sessionEntity$Action);
            }

            /* renamed from: component1, reason: from getter */
            public final int getPinAttemptsLeft() {
                return this.pinAttemptsLeft;
            }

            /* renamed from: component2, reason: from getter */
            public final StartSessionCallSource getSource() {
                return this.source;
            }

            /* renamed from: component3, reason: from getter */
            public final SessionEntity$Action getSessionStateAction() {
                return this.sessionStateAction;
            }

            public final PinTokenRetry copy(int pinAttemptsLeft, StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
                return new PinTokenRetry(pinAttemptsLeft, source, sessionStateAction);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PinTokenRetry)) {
                    return false;
                }
                PinTokenRetry pinTokenRetry = (PinTokenRetry) other;
                return this.pinAttemptsLeft == pinTokenRetry.pinAttemptsLeft && jl40.l(this.source, pinTokenRetry.source) && this.sessionStateAction == pinTokenRetry.sessionStateAction;
            }

            public final int getPinAttemptsLeft() {
                return this.pinAttemptsLeft;
            }

            @Override // com.ybsdk.common.InternalSdkState.PinInput, com.ybsdk.common.InternalSdkState
            public SessionEntity$Action getSessionStateAction() {
                return this.sessionStateAction;
            }

            @Override // com.ybsdk.common.InternalSdkState.PinInput, com.ybsdk.common.InternalSdkState
            public StartSessionCallSource getSource() {
                return this.source;
            }

            public int hashCode() {
                return this.sessionStateAction.hashCode() + ((this.source.hashCode() + (Integer.hashCode(this.pinAttemptsLeft) * 31)) * 31);
            }

            public String toString() {
                return "PinTokenRetry(pinAttemptsLeft=" + this.pinAttemptsLeft + ", source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.pinAttemptsLeft);
                dest.writeParcelable(this.source, flags);
                dest.writeString(this.sessionStateAction.name());
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PinTokenRetry> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PinTokenRetry createFromParcel(Parcel parcel) {
                    return new PinTokenRetry(parcel.readInt(), (StartSessionCallSource) parcel.readParcelable(PinTokenRetry.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PinTokenRetry[] newArray(int i) {
                    return new PinTokenRetry[i];
                }
            }
        }

        public /* synthetic */ PinInput(StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, DefaultConstructorMarker defaultConstructorMarker) {
            this(startSessionCallSource, sessionEntity$Action);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$AccountUpgrade;", "Lcom/ybsdk/common/InternalSdkState;", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/common/StartSessionCallSource;", "component2", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$AccountUpgrade;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountUpgrade extends InternalSdkState {
        public static final Parcelable.Creator<AccountUpgrade> CREATOR = new Creator();
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;

        public AccountUpgrade(StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        public static /* synthetic */ AccountUpgrade copy$default(AccountUpgrade accountUpgrade, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                startSessionCallSource = accountUpgrade.source;
            }
            if ((i & 2) != 0) {
                sessionEntity$Action = accountUpgrade.sessionStateAction;
            }
            return accountUpgrade.copy(startSessionCallSource, sessionEntity$Action);
        }

        /* renamed from: component1, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final AccountUpgrade copy(StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new AccountUpgrade(source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountUpgrade)) {
                return false;
            }
            AccountUpgrade accountUpgrade = (AccountUpgrade) other;
            return jl40.l(this.source, accountUpgrade.source) && this.sessionStateAction == accountUpgrade.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.sessionStateAction.hashCode() + (this.source.hashCode() * 31);
        }

        public String toString() {
            return "AccountUpgrade(source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<AccountUpgrade> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountUpgrade createFromParcel(Parcel parcel) {
                return new AccountUpgrade((StartSessionCallSource) parcel.readParcelable(AccountUpgrade.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AccountUpgrade[] newArray(int i) {
                return new AccountUpgrade[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0019¨\u0006+"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$ApplicationStatusCheck;", "Lcom/ybsdk/common/InternalSdkState;", "", "Lcom/ybsdk/common/entities/SessionApplicationEntity;", "applications", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Ljava/util/List;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Lcom/ybsdk/common/StartSessionCallSource;", "component3", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Ljava/util/List;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$ApplicationStatusCheck;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getApplications", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ApplicationStatusCheck extends InternalSdkState {
        public static final Parcelable.Creator<ApplicationStatusCheck> CREATOR = new Creator();
        private final List<SessionApplicationEntity> applications;
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;

        public ApplicationStatusCheck(List<SessionApplicationEntity> list, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.applications = list;
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApplicationStatusCheck copy$default(ApplicationStatusCheck applicationStatusCheck, List list, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                list = applicationStatusCheck.applications;
            }
            if ((i & 2) != 0) {
                startSessionCallSource = applicationStatusCheck.source;
            }
            if ((i & 4) != 0) {
                sessionEntity$Action = applicationStatusCheck.sessionStateAction;
            }
            return applicationStatusCheck.copy(list, startSessionCallSource, sessionEntity$Action);
        }

        public final List<SessionApplicationEntity> component1() {
            return this.applications;
        }

        /* renamed from: component2, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final ApplicationStatusCheck copy(List<SessionApplicationEntity> applications, StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new ApplicationStatusCheck(applications, source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApplicationStatusCheck)) {
                return false;
            }
            ApplicationStatusCheck applicationStatusCheck = (ApplicationStatusCheck) other;
            return jl40.l(this.applications, applicationStatusCheck.applications) && jl40.l(this.source, applicationStatusCheck.source) && this.sessionStateAction == applicationStatusCheck.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public List<SessionApplicationEntity> getApplications() {
            return this.applications;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.sessionStateAction.hashCode() + ((this.source.hashCode() + (this.applications.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "ApplicationStatusCheck(applications=" + this.applications + ", source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator t = vfc.t(dest, this.applications);
            while (t.hasNext()) {
                ((SessionApplicationEntity) t.next()).writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<ApplicationStatusCheck> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApplicationStatusCheck createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(SessionApplicationEntity.CREATOR, parcel, arrayList, i, 1);
                }
                return new ApplicationStatusCheck(arrayList, (StartSessionCallSource) parcel.readParcelable(ApplicationStatusCheck.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ApplicationStatusCheck[] newArray(int i) {
                return new ApplicationStatusCheck[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$Error;", "Lcom/ybsdk/common/InternalSdkState;", "", "t", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "<init>", "(Ljava/lang/Throwable;Lcom/ybsdk/common/StartSessionCallSource;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Throwable;", "component2", "()Lcom/ybsdk/common/StartSessionCallSource;", "copy", "(Ljava/lang/Throwable;Lcom/ybsdk/common/StartSessionCallSource;)Lcom/ybsdk/common/InternalSdkState$Error;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getT", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends InternalSdkState {
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        private final StartSessionCallSource source;
        private final Throwable t;

        public Error(Throwable th, StartSessionCallSource startSessionCallSource) {
            super(null, startSessionCallSource, null, 5, null);
            this.t = th;
            this.source = startSessionCallSource;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, StartSessionCallSource startSessionCallSource, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.t;
            }
            if ((i & 2) != 0) {
                startSessionCallSource = error.source;
            }
            return error.copy(th, startSessionCallSource);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getT() {
            return this.t;
        }

        /* renamed from: component2, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        public final Error copy(Throwable t, StartSessionCallSource source) {
            return new Error(t, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return jl40.l(this.t, error.t) && jl40.l(this.source, error.source);
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public final Throwable getT() {
            return this.t;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.t.hashCode() * 31);
        }

        public String toString() {
            return "Error(t=" + this.t + ", source=" + this.source + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeSerializable(this.t);
            dest.writeParcelable(this.source, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error((Throwable) parcel.readSerializable(), (StartSessionCallSource) parcel.readParcelable(Error.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u001bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u001d¨\u0006/"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$Ok;", "Lcom/ybsdk/common/InternalSdkState;", "", "Lcom/ybsdk/common/entities/SessionApplicationEntity;", "applications", "", "startLandingUrl", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/common/StartSessionCallSource;", "component4", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$Ok;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getApplications", "Ljava/lang/String;", "getStartLandingUrl", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Ok extends InternalSdkState {
        public static final Parcelable.Creator<Ok> CREATOR = new Creator();
        private final List<SessionApplicationEntity> applications;
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;
        private final String startLandingUrl;

        public Ok(List<SessionApplicationEntity> list, String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.applications = list;
            this.startLandingUrl = str;
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ok copy$default(Ok ok, List list, String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ok.applications;
            }
            if ((i & 2) != 0) {
                str = ok.startLandingUrl;
            }
            if ((i & 4) != 0) {
                startSessionCallSource = ok.source;
            }
            if ((i & 8) != 0) {
                sessionEntity$Action = ok.sessionStateAction;
            }
            return ok.copy(list, str, startSessionCallSource, sessionEntity$Action);
        }

        public final List<SessionApplicationEntity> component1() {
            return this.applications;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStartLandingUrl() {
            return this.startLandingUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final Ok copy(List<SessionApplicationEntity> applications, String startLandingUrl, StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new Ok(applications, startLandingUrl, source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ok)) {
                return false;
            }
            Ok ok = (Ok) other;
            return jl40.l(this.applications, ok.applications) && jl40.l(this.startLandingUrl, ok.startLandingUrl) && jl40.l(this.source, ok.source) && this.sessionStateAction == ok.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public List<SessionApplicationEntity> getApplications() {
            return this.applications;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public final String getStartLandingUrl() {
            return this.startLandingUrl;
        }

        public int hashCode() {
            int hashCode = this.applications.hashCode() * 31;
            String str = this.startLandingUrl;
            return this.sessionStateAction.hashCode() + ((this.source.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public String toString() {
            List<SessionApplicationEntity> list = this.applications;
            String str = this.startLandingUrl;
            StartSessionCallSource startSessionCallSource = this.source;
            SessionEntity$Action sessionEntity$Action = this.sessionStateAction;
            StringBuilder s = xvz.s("Ok(applications=", list, ", startLandingUrl=", str, ", source=");
            s.append(startSessionCallSource);
            s.append(", sessionStateAction=");
            s.append(sessionEntity$Action);
            s.append(Extension.C_BRAKE);
            return s.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator t = vfc.t(dest, this.applications);
            while (t.hasNext()) {
                ((SessionApplicationEntity) t.next()).writeToParcel(dest, flags);
            }
            dest.writeString(this.startLandingUrl);
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Ok> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ok createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = oo31.d(SessionApplicationEntity.CREATOR, parcel, arrayList, i, 1);
                }
                return new Ok(arrayList, parcel.readString(), (StartSessionCallSource) parcel.readParcelable(Ok.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ok[] newArray(int i) {
                return new Ok[i];
            }
        }

        public /* synthetic */ Ok(List list, String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : str, startSessionCallSource, sessionEntity$Action);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001c¨\u0006."}, d2 = {"Lcom/ybsdk/common/InternalSdkState$OpenProduct;", "Lcom/ybsdk/common/InternalSdkState;", "Lcom/ybsdk/api/entities/YBProduct;", CreateApplicationWithProductJsonAdapter.productKey, "", "startLandingUrl", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Lcom/ybsdk/api/entities/YBProduct;Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/api/entities/YBProduct;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/common/StartSessionCallSource;", "component4", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Lcom/ybsdk/api/entities/YBProduct;Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$OpenProduct;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/api/entities/YBProduct;", "getProduct", "Ljava/lang/String;", "getStartLandingUrl", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenProduct extends InternalSdkState {
        public static final Parcelable.Creator<OpenProduct> CREATOR = new Creator();
        private final YBProduct product;
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;
        private final String startLandingUrl;

        public OpenProduct(YBProduct yBProduct, String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.product = yBProduct;
            this.startLandingUrl = str;
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        public static /* synthetic */ OpenProduct copy$default(OpenProduct openProduct, YBProduct yBProduct, String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                yBProduct = openProduct.product;
            }
            if ((i & 2) != 0) {
                str = openProduct.startLandingUrl;
            }
            if ((i & 4) != 0) {
                startSessionCallSource = openProduct.source;
            }
            if ((i & 8) != 0) {
                sessionEntity$Action = openProduct.sessionStateAction;
            }
            return openProduct.copy(yBProduct, str, startSessionCallSource, sessionEntity$Action);
        }

        /* renamed from: component1, reason: from getter */
        public final YBProduct getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStartLandingUrl() {
            return this.startLandingUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final OpenProduct copy(YBProduct product, String startLandingUrl, StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new OpenProduct(product, startLandingUrl, source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenProduct)) {
                return false;
            }
            OpenProduct openProduct = (OpenProduct) other;
            return this.product == openProduct.product && jl40.l(this.startLandingUrl, openProduct.startLandingUrl) && jl40.l(this.source, openProduct.source) && this.sessionStateAction == openProduct.sessionStateAction;
        }

        public final YBProduct getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public final String getStartLandingUrl() {
            return this.startLandingUrl;
        }

        public int hashCode() {
            return this.sessionStateAction.hashCode() + ((this.source.hashCode() + unr0.b(this.product.hashCode() * 31, 31, this.startLandingUrl)) * 31);
        }

        public String toString() {
            return "OpenProduct(product=" + this.product + ", startLandingUrl=" + this.startLandingUrl + ", source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product.name());
            dest.writeString(this.startLandingUrl);
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<OpenProduct> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenProduct createFromParcel(Parcel parcel) {
                return new OpenProduct(YBProduct.valueOf(parcel.readString()), parcel.readString(), (StartSessionCallSource) parcel.readParcelable(OpenProduct.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenProduct[] newArray(int i) {
                return new OpenProduct[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$PinTokenClear;", "Lcom/ybsdk/common/InternalSdkState$PinInput;", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/common/StartSessionCallSource;", "component2", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$PinTokenClear;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PinTokenClear extends PinInput {
        public static final Parcelable.Creator<PinTokenClear> CREATOR = new Creator();
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;

        public PinTokenClear(StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(startSessionCallSource, sessionEntity$Action, null);
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        public static /* synthetic */ PinTokenClear copy$default(PinTokenClear pinTokenClear, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                startSessionCallSource = pinTokenClear.source;
            }
            if ((i & 2) != 0) {
                sessionEntity$Action = pinTokenClear.sessionStateAction;
            }
            return pinTokenClear.copy(startSessionCallSource, sessionEntity$Action);
        }

        /* renamed from: component1, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final PinTokenClear copy(StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new PinTokenClear(source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinTokenClear)) {
                return false;
            }
            PinTokenClear pinTokenClear = (PinTokenClear) other;
            return jl40.l(this.source, pinTokenClear.source) && this.sessionStateAction == pinTokenClear.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState.PinInput, com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState.PinInput, com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.sessionStateAction.hashCode() + (this.source.hashCode() * 31);
        }

        public String toString() {
            return "PinTokenClear(source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<PinTokenClear> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PinTokenClear createFromParcel(Parcel parcel) {
                return new PinTokenClear((StartSessionCallSource) parcel.readParcelable(PinTokenClear.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PinTokenClear[] newArray(int i) {
                return new PinTokenClear[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$RequestNewAmToken;", "Lcom/ybsdk/common/InternalSdkState;", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/common/StartSessionCallSource;", "component2", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$RequestNewAmToken;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestNewAmToken extends InternalSdkState {
        public static final Parcelable.Creator<RequestNewAmToken> CREATOR = new Creator();
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;

        public RequestNewAmToken(StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        public static /* synthetic */ RequestNewAmToken copy$default(RequestNewAmToken requestNewAmToken, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                startSessionCallSource = requestNewAmToken.source;
            }
            if ((i & 2) != 0) {
                sessionEntity$Action = requestNewAmToken.sessionStateAction;
            }
            return requestNewAmToken.copy(startSessionCallSource, sessionEntity$Action);
        }

        /* renamed from: component1, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final RequestNewAmToken copy(StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new RequestNewAmToken(source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestNewAmToken)) {
                return false;
            }
            RequestNewAmToken requestNewAmToken = (RequestNewAmToken) other;
            return jl40.l(this.source, requestNewAmToken.source) && this.sessionStateAction == requestNewAmToken.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.sessionStateAction.hashCode() + (this.source.hashCode() * 31);
        }

        public String toString() {
            return "RequestNewAmToken(source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<RequestNewAmToken> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RequestNewAmToken createFromParcel(Parcel parcel) {
                return new RequestNewAmToken((StartSessionCallSource) parcel.readParcelable(RequestNewAmToken.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RequestNewAmToken[] newArray(int i) {
                return new RequestNewAmToken[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/common/InternalSdkState$SmsAuthorization;", "Lcom/ybsdk/common/InternalSdkState;", "", "trackId", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/common/StartSessionCallSource;", "component3", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$SmsAuthorization;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTrackId", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SmsAuthorization extends InternalSdkState {
        public static final Parcelable.Creator<SmsAuthorization> CREATOR = new Creator();
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;
        private final String trackId;

        public SmsAuthorization(String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.trackId = str;
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        public static /* synthetic */ SmsAuthorization copy$default(SmsAuthorization smsAuthorization, String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                str = smsAuthorization.trackId;
            }
            if ((i & 2) != 0) {
                startSessionCallSource = smsAuthorization.source;
            }
            if ((i & 4) != 0) {
                sessionEntity$Action = smsAuthorization.sessionStateAction;
            }
            return smsAuthorization.copy(str, startSessionCallSource, sessionEntity$Action);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTrackId() {
            return this.trackId;
        }

        /* renamed from: component2, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final SmsAuthorization copy(String trackId, StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new SmsAuthorization(trackId, source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SmsAuthorization)) {
                return false;
            }
            SmsAuthorization smsAuthorization = (SmsAuthorization) other;
            return jl40.l(this.trackId, smsAuthorization.trackId) && jl40.l(this.source, smsAuthorization.source) && this.sessionStateAction == smsAuthorization.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public final String getTrackId() {
            return this.trackId;
        }

        public int hashCode() {
            return this.sessionStateAction.hashCode() + ((this.source.hashCode() + (this.trackId.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "SmsAuthorization(trackId=" + this.trackId + ", source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.trackId);
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SmsAuthorization> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SmsAuthorization createFromParcel(Parcel parcel) {
                return new SmsAuthorization(parcel.readString(), (StartSessionCallSource) parcel.readParcelable(SmsAuthorization.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SmsAuthorization[] newArray(int i) {
                return new SmsAuthorization[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006+"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$StartSessionDeeplink;", "Lcom/ybsdk/common/InternalSdkState;", "", Constants.DEEPLINK, "supportUrl", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/common/StartSessionCallSource;", "component4", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$StartSessionDeeplink;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeeplink", "getSupportUrl", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StartSessionDeeplink extends InternalSdkState {
        public static final Parcelable.Creator<StartSessionDeeplink> CREATOR = new Creator();
        private final String deeplink;
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;
        private final String supportUrl;

        public StartSessionDeeplink(String str, String str2, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.deeplink = str;
            this.supportUrl = str2;
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        public static /* synthetic */ StartSessionDeeplink copy$default(StartSessionDeeplink startSessionDeeplink, String str, String str2, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startSessionDeeplink.deeplink;
            }
            if ((i & 2) != 0) {
                str2 = startSessionDeeplink.supportUrl;
            }
            if ((i & 4) != 0) {
                startSessionCallSource = startSessionDeeplink.source;
            }
            if ((i & 8) != 0) {
                sessionEntity$Action = startSessionDeeplink.sessionStateAction;
            }
            return startSessionDeeplink.copy(str, str2, startSessionCallSource, sessionEntity$Action);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSupportUrl() {
            return this.supportUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final StartSessionDeeplink copy(String deeplink, String supportUrl, StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new StartSessionDeeplink(deeplink, supportUrl, source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartSessionDeeplink)) {
                return false;
            }
            StartSessionDeeplink startSessionDeeplink = (StartSessionDeeplink) other;
            return jl40.l(this.deeplink, startSessionDeeplink.deeplink) && jl40.l(this.supportUrl, startSessionDeeplink.supportUrl) && jl40.l(this.source, startSessionDeeplink.source) && this.sessionStateAction == startSessionDeeplink.sessionStateAction;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public final String getSupportUrl() {
            return this.supportUrl;
        }

        public int hashCode() {
            String str = this.deeplink;
            return this.sessionStateAction.hashCode() + ((this.source.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.supportUrl)) * 31);
        }

        public String toString() {
            String str = this.deeplink;
            String str2 = this.supportUrl;
            StartSessionCallSource startSessionCallSource = this.source;
            SessionEntity$Action sessionEntity$Action = this.sessionStateAction;
            StringBuilder v = b64.v("StartSessionDeeplink(deeplink=", str, ", supportUrl=", str2, ", source=");
            v.append(startSessionCallSource);
            v.append(", sessionStateAction=");
            v.append(sessionEntity$Action);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.deeplink);
            dest.writeString(this.supportUrl);
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<StartSessionDeeplink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartSessionDeeplink createFromParcel(Parcel parcel) {
                return new StartSessionDeeplink(parcel.readString(), parcel.readString(), (StartSessionCallSource) parcel.readParcelable(StartSessionDeeplink.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartSessionDeeplink[] newArray(int i) {
                return new StartSessionDeeplink[i];
            }
        }

        public /* synthetic */ StartSessionDeeplink(String str, String str2, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, startSessionCallSource, sessionEntity$Action);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/common/InternalSdkState$Support;", "Lcom/ybsdk/common/InternalSdkState;", "", "supportUrl", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/common/StartSessionCallSource;", "component3", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$Support;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSupportUrl", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Support extends InternalSdkState {
        public static final Parcelable.Creator<Support> CREATOR = new Creator();
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;
        private final String supportUrl;

        public Support(String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.supportUrl = str;
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        public static /* synthetic */ Support copy$default(Support support, String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                str = support.supportUrl;
            }
            if ((i & 2) != 0) {
                startSessionCallSource = support.source;
            }
            if ((i & 4) != 0) {
                sessionEntity$Action = support.sessionStateAction;
            }
            return support.copy(str, startSessionCallSource, sessionEntity$Action);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSupportUrl() {
            return this.supportUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final Support copy(String supportUrl, StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new Support(supportUrl, source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Support)) {
                return false;
            }
            Support support = (Support) other;
            return jl40.l(this.supportUrl, support.supportUrl) && jl40.l(this.source, support.source) && this.sessionStateAction == support.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public final String getSupportUrl() {
            return this.supportUrl;
        }

        public int hashCode() {
            return this.sessionStateAction.hashCode() + ((this.source.hashCode() + (this.supportUrl.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Support(supportUrl=" + this.supportUrl + ", source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.supportUrl);
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Support> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Support createFromParcel(Parcel parcel) {
                return new Support(parcel.readString(), (StartSessionCallSource) parcel.readParcelable(Support.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Support[] newArray(int i) {
                return new Support[i];
            }
        }

        public /* synthetic */ Support(String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, startSessionCallSource, sessionEntity$Action);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$Unauthenticated;", "Lcom/ybsdk/common/InternalSdkState;", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "<init>", "(Lcom/ybsdk/common/StartSessionCallSource;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/common/StartSessionCallSource;", "copy", "(Lcom/ybsdk/common/StartSessionCallSource;)Lcom/ybsdk/common/InternalSdkState$Unauthenticated;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Unauthenticated extends InternalSdkState {
        public static final Parcelable.Creator<Unauthenticated> CREATOR = new Creator();
        private final StartSessionCallSource source;

        public Unauthenticated(StartSessionCallSource startSessionCallSource) {
            super(null, startSessionCallSource, null, 5, null);
            this.source = startSessionCallSource;
        }

        public static /* synthetic */ Unauthenticated copy$default(Unauthenticated unauthenticated, StartSessionCallSource startSessionCallSource, int i, Object obj) {
            if ((i & 1) != 0) {
                startSessionCallSource = unauthenticated.source;
            }
            return unauthenticated.copy(startSessionCallSource);
        }

        /* renamed from: component1, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        public final Unauthenticated copy(StartSessionCallSource source) {
            return new Unauthenticated(source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unauthenticated) && jl40.l(this.source, ((Unauthenticated) other).source);
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return "Unauthenticated(source=" + this.source + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.source, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unauthenticated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unauthenticated createFromParcel(Parcel parcel) {
                return new Unauthenticated((StartSessionCallSource) parcel.readParcelable(Unauthenticated.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unauthenticated[] newArray(int i) {
                return new Unauthenticated[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ybsdk/common/InternalSdkState$UpdateRequired;", "Lcom/ybsdk/common/InternalSdkState;", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/common/StartSessionCallSource;", "component2", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$UpdateRequired;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class UpdateRequired extends InternalSdkState {
        public static final Parcelable.Creator<UpdateRequired> CREATOR = new Creator();
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;

        public UpdateRequired(StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        public static /* synthetic */ UpdateRequired copy$default(UpdateRequired updateRequired, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                startSessionCallSource = updateRequired.source;
            }
            if ((i & 2) != 0) {
                sessionEntity$Action = updateRequired.sessionStateAction;
            }
            return updateRequired.copy(startSessionCallSource, sessionEntity$Action);
        }

        /* renamed from: component1, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final UpdateRequired copy(StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new UpdateRequired(source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateRequired)) {
                return false;
            }
            UpdateRequired updateRequired = (UpdateRequired) other;
            return jl40.l(this.source, updateRequired.source) && this.sessionStateAction == updateRequired.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.sessionStateAction.hashCode() + (this.source.hashCode() * 31);
        }

        public String toString() {
            return "UpdateRequired(source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UpdateRequired> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateRequired createFromParcel(Parcel parcel) {
                return new UpdateRequired((StartSessionCallSource) parcel.readParcelable(UpdateRequired.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UpdateRequired[] newArray(int i) {
                return new UpdateRequired[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001c¨\u0006."}, d2 = {"Lcom/ybsdk/common/InternalSdkState$YbRegistration;", "Lcom/ybsdk/common/InternalSdkState;", "Lcom/ybsdk/api/entities/YBProduct;", CreateApplicationWithProductJsonAdapter.productKey, "", "startLandingUrl", "Lcom/ybsdk/common/StartSessionCallSource;", "source", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "sessionStateAction", "<init>", "(Lcom/ybsdk/api/entities/YBProduct;Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/api/entities/YBProduct;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/common/StartSessionCallSource;", "component4", "()Lcom/ybsdk/common/entities/SessionEntity$Action;", "copy", "(Lcom/ybsdk/api/entities/YBProduct;Ljava/lang/String;Lcom/ybsdk/common/StartSessionCallSource;Lcom/ybsdk/common/entities/SessionEntity$Action;)Lcom/ybsdk/common/InternalSdkState$YbRegistration;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/api/entities/YBProduct;", "getProduct", "Ljava/lang/String;", "getStartLandingUrl", "Lcom/ybsdk/common/StartSessionCallSource;", "getSource", "Lcom/ybsdk/common/entities/SessionEntity$Action;", "getSessionStateAction", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class YbRegistration extends InternalSdkState {
        public static final Parcelable.Creator<YbRegistration> CREATOR = new Creator();
        private final YBProduct product;
        private final SessionEntity$Action sessionStateAction;
        private final StartSessionCallSource source;
        private final String startLandingUrl;

        public YbRegistration(YBProduct yBProduct, String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
            super(null, startSessionCallSource, null, 5, null);
            this.product = yBProduct;
            this.startLandingUrl = str;
            this.source = startSessionCallSource;
            this.sessionStateAction = sessionEntity$Action;
        }

        public static /* synthetic */ YbRegistration copy$default(YbRegistration ybRegistration, YBProduct yBProduct, String str, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, int i, Object obj) {
            if ((i & 1) != 0) {
                yBProduct = ybRegistration.product;
            }
            if ((i & 2) != 0) {
                str = ybRegistration.startLandingUrl;
            }
            if ((i & 4) != 0) {
                startSessionCallSource = ybRegistration.source;
            }
            if ((i & 8) != 0) {
                sessionEntity$Action = ybRegistration.sessionStateAction;
            }
            return ybRegistration.copy(yBProduct, str, startSessionCallSource, sessionEntity$Action);
        }

        /* renamed from: component1, reason: from getter */
        public final YBProduct getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStartLandingUrl() {
            return this.startLandingUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final StartSessionCallSource getSource() {
            return this.source;
        }

        /* renamed from: component4, reason: from getter */
        public final SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        public final YbRegistration copy(YBProduct product, String startLandingUrl, StartSessionCallSource source, SessionEntity$Action sessionStateAction) {
            return new YbRegistration(product, startLandingUrl, source, sessionStateAction);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof YbRegistration)) {
                return false;
            }
            YbRegistration ybRegistration = (YbRegistration) other;
            return this.product == ybRegistration.product && jl40.l(this.startLandingUrl, ybRegistration.startLandingUrl) && jl40.l(this.source, ybRegistration.source) && this.sessionStateAction == ybRegistration.sessionStateAction;
        }

        public final YBProduct getProduct() {
            return this.product;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public SessionEntity$Action getSessionStateAction() {
            return this.sessionStateAction;
        }

        @Override // com.ybsdk.common.InternalSdkState
        public StartSessionCallSource getSource() {
            return this.source;
        }

        public final String getStartLandingUrl() {
            return this.startLandingUrl;
        }

        public int hashCode() {
            return this.sessionStateAction.hashCode() + ((this.source.hashCode() + unr0.b(this.product.hashCode() * 31, 31, this.startLandingUrl)) * 31);
        }

        public String toString() {
            return "YbRegistration(product=" + this.product + ", startLandingUrl=" + this.startLandingUrl + ", source=" + this.source + ", sessionStateAction=" + this.sessionStateAction + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.product.name());
            dest.writeString(this.startLandingUrl);
            dest.writeParcelable(this.source, flags);
            dest.writeString(this.sessionStateAction.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<YbRegistration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final YbRegistration createFromParcel(Parcel parcel) {
                return new YbRegistration(YBProduct.valueOf(parcel.readString()), parcel.readString(), (StartSessionCallSource) parcel.readParcelable(YbRegistration.class.getClassLoader()), SessionEntity$Action.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final YbRegistration[] newArray(int i) {
                return new YbRegistration[i];
            }
        }
    }

    private InternalSdkState(List<SessionApplicationEntity> list, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action) {
        this.applications = list;
        this.source = startSessionCallSource;
        this.sessionStateAction = sessionEntity$Action;
    }

    public /* synthetic */ InternalSdkState(List list, StartSessionCallSource startSessionCallSource, SessionEntity$Action sessionEntity$Action, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, startSessionCallSource, sessionEntity$Action);
    }
}
