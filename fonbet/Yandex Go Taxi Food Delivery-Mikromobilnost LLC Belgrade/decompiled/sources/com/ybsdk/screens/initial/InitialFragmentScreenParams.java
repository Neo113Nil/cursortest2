package com.ybsdk.screens.initial;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.common.InternalSdkState;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/screens/initial/InitialFragmentScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "<init>", "()V", "dropBackStack", "", "getDropBackStack", "()Z", "ResponsePreloaded", "Default", "VerificationToken", "Lcom/ybsdk/screens/initial/InitialFragmentScreenParams$Default;", "Lcom/ybsdk/screens/initial/InitialFragmentScreenParams$ResponsePreloaded;", "Lcom/ybsdk/screens/initial/InitialFragmentScreenParams$VerificationToken;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InitialFragmentScreenParams implements ScreenParams {
    private final boolean dropBackStack;

    private InitialFragmentScreenParams() {
        this.dropBackStack = true;
    }

    public boolean getDropBackStack() {
        return this.dropBackStack;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/screens/initial/InitialFragmentScreenParams$Default;", "Lcom/ybsdk/screens/initial/InitialFragmentScreenParams;", "", "dropBackStack", "<init>", "(Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Z", "copy", "(Z)Lcom/ybsdk/screens/initial/InitialFragmentScreenParams$Default;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getDropBackStack", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Default extends InitialFragmentScreenParams {
        public static final Parcelable.Creator<Default> CREATOR = new Creator();
        private final boolean dropBackStack;

        public /* synthetic */ Default(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public static /* synthetic */ Default copy$default(Default r0, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = r0.dropBackStack;
            }
            return r0.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getDropBackStack() {
            return this.dropBackStack;
        }

        public final Default copy(boolean dropBackStack) {
            return new Default(dropBackStack);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Default) && this.dropBackStack == ((Default) other).dropBackStack;
        }

        @Override // com.ybsdk.screens.initial.InitialFragmentScreenParams
        public boolean getDropBackStack() {
            return this.dropBackStack;
        }

        public int hashCode() {
            return Boolean.hashCode(this.dropBackStack);
        }

        public String toString() {
            return nzs.b("Default(dropBackStack=", Extension.C_BRAKE, this.dropBackStack);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.dropBackStack ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Default> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                return new Default(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default() {
            this(false, 1, null);
        }

        public Default(boolean z) {
            super(null);
            this.dropBackStack = z;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ybsdk/screens/initial/InitialFragmentScreenParams$ResponsePreloaded;", "Lcom/ybsdk/screens/initial/InitialFragmentScreenParams;", "Lcom/ybsdk/common/InternalSdkState;", "internalSdkState", "", "dropBackStack", "<init>", "(Lcom/ybsdk/common/InternalSdkState;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/common/InternalSdkState;", "component2", "()Z", "copy", "(Lcom/ybsdk/common/InternalSdkState;Z)Lcom/ybsdk/screens/initial/InitialFragmentScreenParams$ResponsePreloaded;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/common/InternalSdkState;", "getInternalSdkState", "Z", "getDropBackStack", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ResponsePreloaded extends InitialFragmentScreenParams {
        public static final Parcelable.Creator<ResponsePreloaded> CREATOR = new Creator();
        private final boolean dropBackStack;
        private final InternalSdkState internalSdkState;

        public ResponsePreloaded(InternalSdkState internalSdkState, boolean z) {
            super(null);
            this.internalSdkState = internalSdkState;
            this.dropBackStack = z;
        }

        public static /* synthetic */ ResponsePreloaded copy$default(ResponsePreloaded responsePreloaded, InternalSdkState internalSdkState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                internalSdkState = responsePreloaded.internalSdkState;
            }
            if ((i & 2) != 0) {
                z = responsePreloaded.dropBackStack;
            }
            return responsePreloaded.copy(internalSdkState, z);
        }

        /* renamed from: component1, reason: from getter */
        public final InternalSdkState getInternalSdkState() {
            return this.internalSdkState;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDropBackStack() {
            return this.dropBackStack;
        }

        public final ResponsePreloaded copy(InternalSdkState internalSdkState, boolean dropBackStack) {
            return new ResponsePreloaded(internalSdkState, dropBackStack);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResponsePreloaded)) {
                return false;
            }
            ResponsePreloaded responsePreloaded = (ResponsePreloaded) other;
            return jl40.l(this.internalSdkState, responsePreloaded.internalSdkState) && this.dropBackStack == responsePreloaded.dropBackStack;
        }

        @Override // com.ybsdk.screens.initial.InitialFragmentScreenParams
        public boolean getDropBackStack() {
            return this.dropBackStack;
        }

        public final InternalSdkState getInternalSdkState() {
            return this.internalSdkState;
        }

        public int hashCode() {
            return Boolean.hashCode(this.dropBackStack) + (this.internalSdkState.hashCode() * 31);
        }

        public String toString() {
            return "ResponsePreloaded(internalSdkState=" + this.internalSdkState + ", dropBackStack=" + this.dropBackStack + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.internalSdkState, flags);
            dest.writeInt(this.dropBackStack ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ResponsePreloaded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResponsePreloaded createFromParcel(Parcel parcel) {
                return new ResponsePreloaded((InternalSdkState) parcel.readParcelable(ResponsePreloaded.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResponsePreloaded[] newArray(int i) {
                return new ResponsePreloaded[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/screens/initial/InitialFragmentScreenParams$VerificationToken;", "Lcom/ybsdk/screens/initial/InitialFragmentScreenParams;", "", "verificationToken", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/screens/initial/InitialFragmentScreenParams$VerificationToken;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVerificationToken", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VerificationToken extends InitialFragmentScreenParams {
        public static final Parcelable.Creator<VerificationToken> CREATOR = new Creator();
        private final String verificationToken;

        public VerificationToken(String str) {
            super(null);
            this.verificationToken = str;
        }

        public static /* synthetic */ VerificationToken copy$default(VerificationToken verificationToken, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verificationToken.verificationToken;
            }
            return verificationToken.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVerificationToken() {
            return this.verificationToken;
        }

        public final VerificationToken copy(String verificationToken) {
            return new VerificationToken(verificationToken);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerificationToken) && jl40.l(this.verificationToken, ((VerificationToken) other).verificationToken);
        }

        public final String getVerificationToken() {
            return this.verificationToken;
        }

        public int hashCode() {
            return this.verificationToken.hashCode();
        }

        public String toString() {
            return oyr.p("VerificationToken(verificationToken=", this.verificationToken, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.verificationToken);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerificationToken> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationToken createFromParcel(Parcel parcel) {
                return new VerificationToken(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationToken[] newArray(int i) {
                return new VerificationToken[i];
            }
        }
    }

    public /* synthetic */ InitialFragmentScreenParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
