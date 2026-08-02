package com.ybsdk.screens.registration.codeconfirmation.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.api.pro.entities.RegistrationType$OngoingOperation;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.network.dto.CreateApplicationWithProductJsonAdapter;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFinishStrategy;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationTarget;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import com.ybsdk.screens.registration.domain.RegistrationPhone;
import defpackage.dzh0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0016B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0003\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "header", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "signOutEnabled", "", "avatarSignOutEnabled", "requestKey", "", "<init>", "(Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;ZZLjava/lang/String;)V", "getHeader", "()Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "getSignOutEnabled", "()Z", "getAvatarSignOutEnabled", "getRequestKey", "()Ljava/lang/String;", "Authorization", "Registration", "ChangePhone", "HeaderImage", "HeaderText", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$Authorization;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$ChangePhone;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$Registration;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CodeConfirmationParams implements ScreenParams {
    private final boolean avatarSignOutEnabled;
    private final HeaderText header;
    private final String requestKey;
    private final boolean signOutEnabled;

    public /* synthetic */ CodeConfirmationParams(HeaderText headerText, boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(headerText, z, (i & 4) != 0 ? false : z2, str, null);
    }

    public boolean getAvatarSignOutEnabled() {
        return this.avatarSignOutEnabled;
    }

    public HeaderText getHeader() {
        return this.header;
    }

    public String getRequestKey() {
        return this.requestKey;
    }

    public boolean getSignOutEnabled() {
        return this.signOutEnabled;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;", "Landroid/os/Parcelable;", "Url", "Resource", "CloseButton", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage$CloseButton;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage$Resource;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage$Url;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface HeaderImage extends Parcelable {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage$CloseButton;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CloseButton implements HeaderImage {
            public static final CloseButton INSTANCE = new CloseButton();
            public static final Parcelable.Creator<CloseButton> CREATOR = new Creator();

            private CloseButton() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CloseButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CloseButton createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return CloseButton.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CloseButton[] newArray(int i) {
                    return new CloseButton[i];
                }
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage$Resource;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;", "", "drawableRes", "<init>", "(I)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "copy", "(I)Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage$Resource;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getDrawableRes", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Resource implements HeaderImage {
            public static final Parcelable.Creator<Resource> CREATOR = new Creator();
            private final int drawableRes;

            public Resource(int i) {
                this.drawableRes = i;
            }

            public static /* synthetic */ Resource copy$default(Resource resource, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = resource.drawableRes;
                }
                return resource.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDrawableRes() {
                return this.drawableRes;
            }

            public final Resource copy(int drawableRes) {
                return new Resource(drawableRes);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Resource) && this.drawableRes == ((Resource) other).drawableRes;
            }

            public final int getDrawableRes() {
                return this.drawableRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.drawableRes);
            }

            public String toString() {
                return oyr.j(this.drawableRes, "Resource(drawableRes=", Extension.C_BRAKE);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.drawableRes);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Resource> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Resource createFromParcel(Parcel parcel) {
                    return new Resource(parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Resource[] newArray(int i) {
                    return new Resource[i];
                }
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage$Url;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;", "", "url", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage$Url;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Url implements HeaderImage {
            public static final Parcelable.Creator<Url> CREATOR = new Creator();
            private final String url;

            public Url(String str) {
                this.url = str;
            }

            public static /* synthetic */ Url copy$default(Url url, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = url.url;
                }
                return url.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final Url copy(String url) {
                return new Url(url);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Url) && jl40.l(this.url, ((Url) other).url);
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            public String toString() {
                return oyr.p("Url(url=", this.url, Extension.C_BRAKE);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeString(this.url);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Url> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Url createFromParcel(Parcel parcel) {
                    return new Url(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Url[] newArray(int i) {
                    return new Url[i];
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "Landroid/os/Parcelable;", "header", "Lcom/ybsdk/core/utils/text/Text;", "<init>", "(Lcom/ybsdk/core/utils/text/Text;)V", "getHeader", "()Lcom/ybsdk/core/utils/text/Text;", "ActivationText", "TwoFAText", "ConfirmNumber", "UniversalText", "ConfirmChangePhoneText", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$ActivationText;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$ConfirmChangePhoneText;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$ConfirmNumber;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$TwoFAText;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$UniversalText;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class HeaderText implements Parcelable {
        private final Text header;

        private HeaderText(Text text) {
            this.header = text;
        }

        public Text getHeader() {
            return this.header;
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$ActivationText;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "Lcom/ybsdk/core/utils/text/Text;", "header", "<init>", "(Lcom/ybsdk/core/utils/text/Text;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/ybsdk/core/utils/text/Text;", "getHeader", "()Lcom/ybsdk/core/utils/text/Text;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ActivationText extends HeaderText {
            public static final Parcelable.Creator<ActivationText> CREATOR = new Creator();
            private final Text header;

            public ActivationText(Text text, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_phone_title) : text);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams.HeaderText
            public Text getHeader() {
                return this.header;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeParcelable(this.header, flags);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ActivationText> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ActivationText createFromParcel(Parcel parcel) {
                    return new ActivationText((Text) parcel.readParcelable(ActivationText.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ActivationText[] newArray(int i) {
                    return new ActivationText[i];
                }
            }

            public ActivationText() {
                this(null, 1, null);
            }

            public ActivationText(Text text) {
                super(text, null);
                this.header = text;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$ConfirmChangePhoneText;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "Lcom/ybsdk/core/utils/text/Text;", "header", "<init>", "(Lcom/ybsdk/core/utils/text/Text;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "copy", "(Lcom/ybsdk/core/utils/text/Text;)Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$ConfirmChangePhoneText;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getHeader", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConfirmChangePhoneText extends HeaderText {
            public static final Parcelable.Creator<ConfirmChangePhoneText> CREATOR = new Creator();
            private final Text header;

            public ConfirmChangePhoneText(Text text, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_change_phone_title) : text);
            }

            public static /* synthetic */ ConfirmChangePhoneText copy$default(ConfirmChangePhoneText confirmChangePhoneText, Text text, int i, Object obj) {
                if ((i & 1) != 0) {
                    text = confirmChangePhoneText.header;
                }
                return confirmChangePhoneText.copy(text);
            }

            /* renamed from: component1, reason: from getter */
            public final Text getHeader() {
                return this.header;
            }

            public final ConfirmChangePhoneText copy(Text header) {
                return new ConfirmChangePhoneText(header);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfirmChangePhoneText) && jl40.l(this.header, ((ConfirmChangePhoneText) other).header);
            }

            @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams.HeaderText
            public Text getHeader() {
                return this.header;
            }

            public int hashCode() {
                return this.header.hashCode();
            }

            public String toString() {
                return "ConfirmChangePhoneText(header=" + this.header + Extension.C_BRAKE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeParcelable(this.header, flags);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ConfirmChangePhoneText> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ConfirmChangePhoneText createFromParcel(Parcel parcel) {
                    return new ConfirmChangePhoneText((Text) parcel.readParcelable(ConfirmChangePhoneText.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ConfirmChangePhoneText[] newArray(int i) {
                    return new ConfirmChangePhoneText[i];
                }
            }

            public ConfirmChangePhoneText() {
                this(null, 1, null);
            }

            public ConfirmChangePhoneText(Text text) {
                super(text, null);
                this.header = text;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$ConfirmNumber;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "Lcom/ybsdk/core/utils/text/Text;", "header", "<init>", "(Lcom/ybsdk/core/utils/text/Text;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "copy", "(Lcom/ybsdk/core/utils/text/Text;)Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$ConfirmNumber;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getHeader", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConfirmNumber extends HeaderText {
            public static final Parcelable.Creator<ConfirmNumber> CREATOR = new Creator();
            private final Text header;

            public ConfirmNumber(Text text, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_account_title) : text);
            }

            public static /* synthetic */ ConfirmNumber copy$default(ConfirmNumber confirmNumber, Text text, int i, Object obj) {
                if ((i & 1) != 0) {
                    text = confirmNumber.header;
                }
                return confirmNumber.copy(text);
            }

            /* renamed from: component1, reason: from getter */
            public final Text getHeader() {
                return this.header;
            }

            public final ConfirmNumber copy(Text header) {
                return new ConfirmNumber(header);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ConfirmNumber) && jl40.l(this.header, ((ConfirmNumber) other).header);
            }

            @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams.HeaderText
            public Text getHeader() {
                return this.header;
            }

            public int hashCode() {
                return this.header.hashCode();
            }

            public String toString() {
                return "ConfirmNumber(header=" + this.header + Extension.C_BRAKE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeParcelable(this.header, flags);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ConfirmNumber> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ConfirmNumber createFromParcel(Parcel parcel) {
                    return new ConfirmNumber((Text) parcel.readParcelable(ConfirmNumber.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ConfirmNumber[] newArray(int i) {
                    return new ConfirmNumber[i];
                }
            }

            public ConfirmNumber() {
                this(null, 1, null);
            }

            public ConfirmNumber(Text text) {
                super(text, null);
                this.header = text;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$TwoFAText;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "Lcom/ybsdk/core/utils/text/Text;", "header", "<init>", "(Lcom/ybsdk/core/utils/text/Text;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "copy", "(Lcom/ybsdk/core/utils/text/Text;)Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$TwoFAText;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getHeader", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class TwoFAText extends HeaderText {
            public static final Parcelable.Creator<TwoFAText> CREATOR = new Creator();
            private final Text header;

            public TwoFAText(Text text, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_confirm_account_title) : text);
            }

            public static /* synthetic */ TwoFAText copy$default(TwoFAText twoFAText, Text text, int i, Object obj) {
                if ((i & 1) != 0) {
                    text = twoFAText.header;
                }
                return twoFAText.copy(text);
            }

            /* renamed from: component1, reason: from getter */
            public final Text getHeader() {
                return this.header;
            }

            public final TwoFAText copy(Text header) {
                return new TwoFAText(header);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TwoFAText) && jl40.l(this.header, ((TwoFAText) other).header);
            }

            @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams.HeaderText
            public Text getHeader() {
                return this.header;
            }

            public int hashCode() {
                return this.header.hashCode();
            }

            public String toString() {
                return "TwoFAText(header=" + this.header + Extension.C_BRAKE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeParcelable(this.header, flags);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<TwoFAText> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TwoFAText createFromParcel(Parcel parcel) {
                    return new TwoFAText((Text) parcel.readParcelable(TwoFAText.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TwoFAText[] newArray(int i) {
                    return new TwoFAText[i];
                }
            }

            public TwoFAText() {
                this(null, 1, null);
            }

            public TwoFAText(Text text) {
                super(text, null);
                this.header = text;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$UniversalText;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "Lcom/ybsdk/core/utils/text/Text;", "header", "<init>", "(Lcom/ybsdk/core/utils/text/Text;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "copy", "(Lcom/ybsdk/core/utils/text/Text;)Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText$UniversalText;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getHeader", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UniversalText extends HeaderText {
            public static final Parcelable.Creator<UniversalText> CREATOR = new Creator();
            private final Text header;

            public UniversalText(Text text, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? unr0.h(Text.Companion, dzh0.ybsdk_sms_code_confirmation_enter_code_title) : text);
            }

            public static /* synthetic */ UniversalText copy$default(UniversalText universalText, Text text, int i, Object obj) {
                if ((i & 1) != 0) {
                    text = universalText.header;
                }
                return universalText.copy(text);
            }

            /* renamed from: component1, reason: from getter */
            public final Text getHeader() {
                return this.header;
            }

            public final UniversalText copy(Text header) {
                return new UniversalText(header);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UniversalText) && jl40.l(this.header, ((UniversalText) other).header);
            }

            @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams.HeaderText
            public Text getHeader() {
                return this.header;
            }

            public int hashCode() {
                return this.header.hashCode();
            }

            public String toString() {
                return "UniversalText(header=" + this.header + Extension.C_BRAKE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeParcelable(this.header, flags);
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<UniversalText> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UniversalText createFromParcel(Parcel parcel) {
                    return new UniversalText((Text) parcel.readParcelable(UniversalText.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UniversalText[] newArray(int i) {
                    return new UniversalText[i];
                }
            }

            public UniversalText() {
                this(null, 1, null);
            }

            public UniversalText(Text text) {
                super(text, null);
                this.header = text;
            }
        }

        public /* synthetic */ HeaderText(Text text, DefaultConstructorMarker defaultConstructorMarker) {
            this(text);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b1\u0010$J\u0084\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b4\u0010$J\u0010\u00105\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b5\u0010\u001eJ\u001a\u00108\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010(R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bD\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010-R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bI\u0010(R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bK\u00100R\u001a\u0010\u0014\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bL\u0010$¨\u0006M"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$Authorization;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "header", "Lcom/ybsdk/core/utils/text/Text;", "headerSubtitle", "", "trackId", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;", "headerImage", "", "signOutEnabled", "avatarSignOutEnabled", "", Constants.KEY_MESSAGE, "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy;", "finishStrategy", "codeAutoFillEnabled", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationTarget;", "confirmationTarget", "requestKey", "<init>", "(Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;ZZLjava/lang/Integer;Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy;ZLcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationTarget;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "component2", "()Lcom/ybsdk/core/utils/text/Text;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;", "component5", "()Z", "component6", "component7", "()Ljava/lang/Integer;", "component8", "()Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy;", "component9", "component10", "()Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationTarget;", "component11", "copy", "(Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;ZZLjava/lang/Integer;Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy;ZLcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationTarget;Ljava/lang/String;)Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$Authorization;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderText;", "getHeader", "Lcom/ybsdk/core/utils/text/Text;", "getHeaderSubtitle", "Ljava/lang/String;", "getTrackId", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;", "getHeaderImage", "Z", "getSignOutEnabled", "getAvatarSignOutEnabled", "Ljava/lang/Integer;", "getMessage", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationFinishStrategy;", "getFinishStrategy", "getCodeAutoFillEnabled", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationTarget;", "getConfirmationTarget", "getRequestKey", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Authorization extends CodeConfirmationParams {
        public static final Parcelable.Creator<Authorization> CREATOR = new Creator();
        private final boolean avatarSignOutEnabled;
        private final boolean codeAutoFillEnabled;
        private final CodeConfirmationTarget confirmationTarget;
        private final CodeConfirmationFinishStrategy finishStrategy;
        private final HeaderText header;
        private final HeaderImage headerImage;
        private final Text headerSubtitle;
        private final Integer message;
        private final String requestKey;
        private final boolean signOutEnabled;
        private final String trackId;

        public /* synthetic */ Authorization(HeaderText headerText, Text text, String str, HeaderImage headerImage, boolean z, boolean z2, Integer num, CodeConfirmationFinishStrategy codeConfirmationFinishStrategy, boolean z3, CodeConfirmationTarget codeConfirmationTarget, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(headerText, text, str, headerImage, (i & 16) != 0 ? false : z, z2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? CodeConfirmationFinishStrategy.None.INSTANCE : codeConfirmationFinishStrategy, (i & 256) != 0 ? true : z3, (i & 512) != 0 ? CodeConfirmationTarget.YbAuthorization.INSTANCE : codeConfirmationTarget, (i & 1024) != 0 ? "request_key_authorization" : str2);
        }

        public static /* synthetic */ Authorization copy$default(Authorization authorization, HeaderText headerText, Text text, String str, HeaderImage headerImage, boolean z, boolean z2, Integer num, CodeConfirmationFinishStrategy codeConfirmationFinishStrategy, boolean z3, CodeConfirmationTarget codeConfirmationTarget, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                headerText = authorization.header;
            }
            if ((i & 2) != 0) {
                text = authorization.headerSubtitle;
            }
            if ((i & 4) != 0) {
                str = authorization.trackId;
            }
            if ((i & 8) != 0) {
                headerImage = authorization.headerImage;
            }
            if ((i & 16) != 0) {
                z = authorization.signOutEnabled;
            }
            if ((i & 32) != 0) {
                z2 = authorization.avatarSignOutEnabled;
            }
            if ((i & 64) != 0) {
                num = authorization.message;
            }
            if ((i & 128) != 0) {
                codeConfirmationFinishStrategy = authorization.finishStrategy;
            }
            if ((i & 256) != 0) {
                z3 = authorization.codeAutoFillEnabled;
            }
            if ((i & 512) != 0) {
                codeConfirmationTarget = authorization.confirmationTarget;
            }
            if ((i & 1024) != 0) {
                str2 = authorization.requestKey;
            }
            CodeConfirmationTarget codeConfirmationTarget2 = codeConfirmationTarget;
            String str3 = str2;
            CodeConfirmationFinishStrategy codeConfirmationFinishStrategy2 = codeConfirmationFinishStrategy;
            boolean z4 = z3;
            boolean z5 = z2;
            Integer num2 = num;
            boolean z6 = z;
            String str4 = str;
            return authorization.copy(headerText, text, str4, headerImage, z6, z5, num2, codeConfirmationFinishStrategy2, z4, codeConfirmationTarget2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final HeaderText getHeader() {
            return this.header;
        }

        /* renamed from: component10, reason: from getter */
        public final CodeConfirmationTarget getConfirmationTarget() {
            return this.confirmationTarget;
        }

        /* renamed from: component11, reason: from getter */
        public final String getRequestKey() {
            return this.requestKey;
        }

        /* renamed from: component2, reason: from getter */
        public final Text getHeaderSubtitle() {
            return this.headerSubtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTrackId() {
            return this.trackId;
        }

        /* renamed from: component4, reason: from getter */
        public final HeaderImage getHeaderImage() {
            return this.headerImage;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSignOutEnabled() {
            return this.signOutEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getAvatarSignOutEnabled() {
            return this.avatarSignOutEnabled;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getMessage() {
            return this.message;
        }

        /* renamed from: component8, reason: from getter */
        public final CodeConfirmationFinishStrategy getFinishStrategy() {
            return this.finishStrategy;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getCodeAutoFillEnabled() {
            return this.codeAutoFillEnabled;
        }

        public final Authorization copy(HeaderText header, Text headerSubtitle, String trackId, HeaderImage headerImage, boolean signOutEnabled, boolean avatarSignOutEnabled, Integer message, CodeConfirmationFinishStrategy finishStrategy, boolean codeAutoFillEnabled, CodeConfirmationTarget confirmationTarget, String requestKey) {
            return new Authorization(header, headerSubtitle, trackId, headerImage, signOutEnabled, avatarSignOutEnabled, message, finishStrategy, codeAutoFillEnabled, confirmationTarget, requestKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Authorization)) {
                return false;
            }
            Authorization authorization = (Authorization) other;
            return jl40.l(this.header, authorization.header) && jl40.l(this.headerSubtitle, authorization.headerSubtitle) && jl40.l(this.trackId, authorization.trackId) && jl40.l(this.headerImage, authorization.headerImage) && this.signOutEnabled == authorization.signOutEnabled && this.avatarSignOutEnabled == authorization.avatarSignOutEnabled && jl40.l(this.message, authorization.message) && jl40.l(this.finishStrategy, authorization.finishStrategy) && this.codeAutoFillEnabled == authorization.codeAutoFillEnabled && jl40.l(this.confirmationTarget, authorization.confirmationTarget) && jl40.l(this.requestKey, authorization.requestKey);
        }

        @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams
        public boolean getAvatarSignOutEnabled() {
            return this.avatarSignOutEnabled;
        }

        public final boolean getCodeAutoFillEnabled() {
            return this.codeAutoFillEnabled;
        }

        public final CodeConfirmationTarget getConfirmationTarget() {
            return this.confirmationTarget;
        }

        public final CodeConfirmationFinishStrategy getFinishStrategy() {
            return this.finishStrategy;
        }

        @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams
        public HeaderText getHeader() {
            return this.header;
        }

        public final HeaderImage getHeaderImage() {
            return this.headerImage;
        }

        public final Text getHeaderSubtitle() {
            return this.headerSubtitle;
        }

        public final Integer getMessage() {
            return this.message;
        }

        @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams
        public String getRequestKey() {
            return this.requestKey;
        }

        @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams
        public boolean getSignOutEnabled() {
            return this.signOutEnabled;
        }

        public final String getTrackId() {
            return this.trackId;
        }

        public int hashCode() {
            int hashCode = this.header.hashCode() * 31;
            Text text = this.headerSubtitle;
            int b = unr0.b((hashCode + (text == null ? 0 : text.hashCode())) * 31, 31, this.trackId);
            HeaderImage headerImage = this.headerImage;
            int e = unr0.e(unr0.e((b + (headerImage == null ? 0 : headerImage.hashCode())) * 31, 31, this.signOutEnabled), 31, this.avatarSignOutEnabled);
            Integer num = this.message;
            return this.requestKey.hashCode() + ((this.confirmationTarget.hashCode() + unr0.e((this.finishStrategy.hashCode() + ((e + (num != null ? num.hashCode() : 0)) * 31)) * 31, 31, this.codeAutoFillEnabled)) * 31);
        }

        public String toString() {
            HeaderText headerText = this.header;
            Text text = this.headerSubtitle;
            String str = this.trackId;
            HeaderImage headerImage = this.headerImage;
            boolean z = this.signOutEnabled;
            boolean z2 = this.avatarSignOutEnabled;
            Integer num = this.message;
            CodeConfirmationFinishStrategy codeConfirmationFinishStrategy = this.finishStrategy;
            boolean z3 = this.codeAutoFillEnabled;
            CodeConfirmationTarget codeConfirmationTarget = this.confirmationTarget;
            String str2 = this.requestKey;
            StringBuilder sb = new StringBuilder("Authorization(header=");
            sb.append(headerText);
            sb.append(", headerSubtitle=");
            sb.append(text);
            sb.append(", trackId=");
            sb.append(str);
            sb.append(", headerImage=");
            sb.append(headerImage);
            sb.append(", signOutEnabled=");
            nnm.v(", avatarSignOutEnabled=", ", message=", sb, z, z2);
            sb.append(num);
            sb.append(", finishStrategy=");
            sb.append(codeConfirmationFinishStrategy);
            sb.append(", codeAutoFillEnabled=");
            sb.append(z3);
            sb.append(", confirmationTarget=");
            sb.append(codeConfirmationTarget);
            sb.append(", requestKey=");
            return oyr.t(sb, str2, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.header, flags);
            dest.writeParcelable(this.headerSubtitle, flags);
            dest.writeString(this.trackId);
            dest.writeParcelable(this.headerImage, flags);
            dest.writeInt(this.signOutEnabled ? 1 : 0);
            dest.writeInt(this.avatarSignOutEnabled ? 1 : 0);
            Integer num = this.message;
            if (num == null) {
                dest.writeInt(0);
            } else {
                tse0.v(dest, 1, num);
            }
            dest.writeParcelable(this.finishStrategy, flags);
            dest.writeInt(this.codeAutoFillEnabled ? 1 : 0);
            dest.writeParcelable(this.confirmationTarget, flags);
            dest.writeString(this.requestKey);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Authorization> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Authorization createFromParcel(Parcel parcel) {
                boolean z;
                HeaderText headerText = (HeaderText) parcel.readParcelable(Authorization.class.getClassLoader());
                Text text = (Text) parcel.readParcelable(Authorization.class.getClassLoader());
                String readString = parcel.readString();
                HeaderImage headerImage = (HeaderImage) parcel.readParcelable(Authorization.class.getClassLoader());
                boolean z2 = false;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new Authorization(headerText, text, readString, headerImage, z3, z2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (CodeConfirmationFinishStrategy) parcel.readParcelable(Authorization.class.getClassLoader()), parcel.readInt() == 0 ? z : true, (CodeConfirmationTarget) parcel.readParcelable(Authorization.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Authorization[] newArray(int i) {
                return new Authorization[i];
            }
        }

        public Authorization(HeaderText headerText, Text text, String str, HeaderImage headerImage, boolean z, boolean z2, Integer num, CodeConfirmationFinishStrategy codeConfirmationFinishStrategy, boolean z3, CodeConfirmationTarget codeConfirmationTarget, String str2) {
            super(headerText, z, false, str2, 4, null);
            this.header = headerText;
            this.headerSubtitle = text;
            this.trackId = str;
            this.headerImage = headerImage;
            this.signOutEnabled = z;
            this.avatarSignOutEnabled = z2;
            this.message = num;
            this.finishStrategy = codeConfirmationFinishStrategy;
            this.codeAutoFillEnabled = z3;
            this.confirmationTarget = codeConfirmationTarget;
            this.requestKey = str2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b+\u0010\u0016¨\u0006,"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$ChangePhone;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams;", "", "applicationId", "", "isSignOutEnabled", "forceNavigateToInitialViewModelOnResult", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;", "headerImage", "requestKey", "<init>", "(Ljava/lang/String;ZZLcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;", "component5", "copy", "(Ljava/lang/String;ZZLcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;Ljava/lang/String;)Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$ChangePhone;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplicationId", "Z", "getForceNavigateToInitialViewModelOnResult", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$HeaderImage;", "getHeaderImage", "getRequestKey", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChangePhone extends CodeConfirmationParams {
        public static final Parcelable.Creator<ChangePhone> CREATOR = new Creator();
        private final String applicationId;
        private final boolean forceNavigateToInitialViewModelOnResult;
        private final HeaderImage headerImage;
        private final boolean isSignOutEnabled;
        private final String requestKey;

        public ChangePhone(String str, boolean z, boolean z2, HeaderImage headerImage, String str2) {
            super(new HeaderText.ConfirmChangePhoneText(null, 1, null), z, false, str2, 4, null);
            this.applicationId = str;
            this.isSignOutEnabled = z;
            this.forceNavigateToInitialViewModelOnResult = z2;
            this.headerImage = headerImage;
            this.requestKey = str2;
        }

        public static /* synthetic */ ChangePhone copy$default(ChangePhone changePhone, String str, boolean z, boolean z2, HeaderImage headerImage, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = changePhone.applicationId;
            }
            if ((i & 2) != 0) {
                z = changePhone.isSignOutEnabled;
            }
            if ((i & 4) != 0) {
                z2 = changePhone.forceNavigateToInitialViewModelOnResult;
            }
            if ((i & 8) != 0) {
                headerImage = changePhone.headerImage;
            }
            if ((i & 16) != 0) {
                str2 = changePhone.requestKey;
            }
            String str3 = str2;
            boolean z3 = z2;
            return changePhone.copy(str, z, z3, headerImage, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSignOutEnabled() {
            return this.isSignOutEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getForceNavigateToInitialViewModelOnResult() {
            return this.forceNavigateToInitialViewModelOnResult;
        }

        /* renamed from: component4, reason: from getter */
        public final HeaderImage getHeaderImage() {
            return this.headerImage;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRequestKey() {
            return this.requestKey;
        }

        public final ChangePhone copy(String applicationId, boolean isSignOutEnabled, boolean forceNavigateToInitialViewModelOnResult, HeaderImage headerImage, String requestKey) {
            return new ChangePhone(applicationId, isSignOutEnabled, forceNavigateToInitialViewModelOnResult, headerImage, requestKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangePhone)) {
                return false;
            }
            ChangePhone changePhone = (ChangePhone) other;
            return jl40.l(this.applicationId, changePhone.applicationId) && this.isSignOutEnabled == changePhone.isSignOutEnabled && this.forceNavigateToInitialViewModelOnResult == changePhone.forceNavigateToInitialViewModelOnResult && jl40.l(this.headerImage, changePhone.headerImage) && jl40.l(this.requestKey, changePhone.requestKey);
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final boolean getForceNavigateToInitialViewModelOnResult() {
            return this.forceNavigateToInitialViewModelOnResult;
        }

        public final HeaderImage getHeaderImage() {
            return this.headerImage;
        }

        @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams
        public String getRequestKey() {
            return this.requestKey;
        }

        public int hashCode() {
            int e = unr0.e(unr0.e(this.applicationId.hashCode() * 31, 31, this.isSignOutEnabled), 31, this.forceNavigateToInitialViewModelOnResult);
            HeaderImage headerImage = this.headerImage;
            return this.requestKey.hashCode() + ((e + (headerImage == null ? 0 : headerImage.hashCode())) * 31);
        }

        public final boolean isSignOutEnabled() {
            return this.isSignOutEnabled;
        }

        public String toString() {
            String str = this.applicationId;
            boolean z = this.isSignOutEnabled;
            boolean z2 = this.forceNavigateToInitialViewModelOnResult;
            HeaderImage headerImage = this.headerImage;
            String str2 = this.requestKey;
            StringBuilder l = oo31.l("ChangePhone(applicationId=", str, ", isSignOutEnabled=", ", forceNavigateToInitialViewModelOnResult=", z);
            l.append(z2);
            l.append(", headerImage=");
            l.append(headerImage);
            l.append(", requestKey=");
            return oyr.t(l, str2, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.applicationId);
            dest.writeInt(this.isSignOutEnabled ? 1 : 0);
            dest.writeInt(this.forceNavigateToInitialViewModelOnResult ? 1 : 0);
            dest.writeParcelable(this.headerImage, flags);
            dest.writeString(this.requestKey);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChangePhone> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangePhone createFromParcel(Parcel parcel) {
                boolean z;
                String readString = parcel.readString();
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new ChangePhone(readString, z2, parcel.readInt() == 0 ? z : true, (HeaderImage) parcel.readParcelable(ChangePhone.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChangePhone[] newArray(int i) {
                return new ChangePhone[i];
            }
        }

        public /* synthetic */ ChangePhone(String str, boolean z, boolean z2, HeaderImage headerImage, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, z2, headerImage, (i & 16) != 0 ? "request_key_authorization" : str2);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJb\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u001a\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010$R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010&R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b=\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b>\u0010\u001c¨\u0006?"}, d2 = {"Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$Registration;", "Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams;", "", "applicationId", "Lcom/ybsdk/screens/registration/domain/RegistrationPhone;", "phone", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity;", "otpRequestEntity", "", "standaloneRegistration", "Lcom/ybsdk/api/entities/YBProduct;", CreateApplicationWithProductJsonAdapter.productKey, "Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;", "ongoingOperation", "requestKey", "registrationDeeplink", "<init>", "(Ljava/lang/String;Lcom/ybsdk/screens/registration/domain/RegistrationPhone;Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity;ZLcom/ybsdk/api/entities/YBProduct;Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/screens/registration/domain/RegistrationPhone;", "component3", "()Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity;", "component4", "()Z", "component5", "()Lcom/ybsdk/api/entities/YBProduct;", "component6", "()Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;", "component7", "component8", "copy", "(Ljava/lang/String;Lcom/ybsdk/screens/registration/domain/RegistrationPhone;Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity;ZLcom/ybsdk/api/entities/YBProduct;Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/screens/registration/codeconfirmation/presentation/CodeConfirmationParams$Registration;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApplicationId", "Lcom/ybsdk/screens/registration/domain/RegistrationPhone;", "getPhone", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity;", "getOtpRequestEntity", "Z", "getStandaloneRegistration", "Lcom/ybsdk/api/entities/YBProduct;", "getProduct", "Lcom/ybsdk/api/pro/entities/RegistrationType$OngoingOperation;", "getOngoingOperation", "getRequestKey", "getRegistrationDeeplink", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Registration extends CodeConfirmationParams {
        public static final Parcelable.Creator<Registration> CREATOR = new Creator();
        private final String applicationId;
        private final RegistrationType$OngoingOperation ongoingOperation;
        private final OtpResponseDataEntity otpRequestEntity;
        private final RegistrationPhone phone;
        private final YBProduct product;
        private final String registrationDeeplink;
        private final String requestKey;
        private final boolean standaloneRegistration;

        public Registration(String str, RegistrationPhone registrationPhone, OtpResponseDataEntity otpResponseDataEntity, boolean z, YBProduct yBProduct, RegistrationType$OngoingOperation registrationType$OngoingOperation, String str2, String str3) {
            super(new HeaderText.ActivationText(null, 1, null), false, false, str2, 4, null);
            this.applicationId = str;
            this.phone = registrationPhone;
            this.otpRequestEntity = otpResponseDataEntity;
            this.standaloneRegistration = z;
            this.product = yBProduct;
            this.ongoingOperation = registrationType$OngoingOperation;
            this.requestKey = str2;
            this.registrationDeeplink = str3;
        }

        public static /* synthetic */ Registration copy$default(Registration registration, String str, RegistrationPhone registrationPhone, OtpResponseDataEntity otpResponseDataEntity, boolean z, YBProduct yBProduct, RegistrationType$OngoingOperation registrationType$OngoingOperation, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registration.applicationId;
            }
            if ((i & 2) != 0) {
                registrationPhone = registration.phone;
            }
            if ((i & 4) != 0) {
                otpResponseDataEntity = registration.otpRequestEntity;
            }
            if ((i & 8) != 0) {
                z = registration.standaloneRegistration;
            }
            if ((i & 16) != 0) {
                yBProduct = registration.product;
            }
            if ((i & 32) != 0) {
                registrationType$OngoingOperation = registration.ongoingOperation;
            }
            if ((i & 64) != 0) {
                str2 = registration.requestKey;
            }
            if ((i & 128) != 0) {
                str3 = registration.registrationDeeplink;
            }
            String str4 = str2;
            String str5 = str3;
            YBProduct yBProduct2 = yBProduct;
            RegistrationType$OngoingOperation registrationType$OngoingOperation2 = registrationType$OngoingOperation;
            return registration.copy(str, registrationPhone, otpResponseDataEntity, z, yBProduct2, registrationType$OngoingOperation2, str4, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* renamed from: component2, reason: from getter */
        public final RegistrationPhone getPhone() {
            return this.phone;
        }

        /* renamed from: component3, reason: from getter */
        public final OtpResponseDataEntity getOtpRequestEntity() {
            return this.otpRequestEntity;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getStandaloneRegistration() {
            return this.standaloneRegistration;
        }

        /* renamed from: component5, reason: from getter */
        public final YBProduct getProduct() {
            return this.product;
        }

        /* renamed from: component6, reason: from getter */
        public final RegistrationType$OngoingOperation getOngoingOperation() {
            return this.ongoingOperation;
        }

        /* renamed from: component7, reason: from getter */
        public final String getRequestKey() {
            return this.requestKey;
        }

        /* renamed from: component8, reason: from getter */
        public final String getRegistrationDeeplink() {
            return this.registrationDeeplink;
        }

        public final Registration copy(String applicationId, RegistrationPhone phone, OtpResponseDataEntity otpRequestEntity, boolean standaloneRegistration, YBProduct product, RegistrationType$OngoingOperation ongoingOperation, String requestKey, String registrationDeeplink) {
            return new Registration(applicationId, phone, otpRequestEntity, standaloneRegistration, product, ongoingOperation, requestKey, registrationDeeplink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Registration)) {
                return false;
            }
            Registration registration = (Registration) other;
            return jl40.l(this.applicationId, registration.applicationId) && jl40.l(this.phone, registration.phone) && jl40.l(this.otpRequestEntity, registration.otpRequestEntity) && this.standaloneRegistration == registration.standaloneRegistration && this.product == registration.product && this.ongoingOperation == registration.ongoingOperation && jl40.l(this.requestKey, registration.requestKey) && jl40.l(this.registrationDeeplink, registration.registrationDeeplink);
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final RegistrationType$OngoingOperation getOngoingOperation() {
            return this.ongoingOperation;
        }

        public final OtpResponseDataEntity getOtpRequestEntity() {
            return this.otpRequestEntity;
        }

        public final RegistrationPhone getPhone() {
            return this.phone;
        }

        public final YBProduct getProduct() {
            return this.product;
        }

        public final String getRegistrationDeeplink() {
            return this.registrationDeeplink;
        }

        @Override // com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams
        public String getRequestKey() {
            return this.requestKey;
        }

        public final boolean getStandaloneRegistration() {
            return this.standaloneRegistration;
        }

        public int hashCode() {
            int b = unr0.b((this.ongoingOperation.hashCode() + ((this.product.hashCode() + unr0.e((this.otpRequestEntity.hashCode() + ((this.phone.hashCode() + (this.applicationId.hashCode() * 31)) * 31)) * 31, 31, this.standaloneRegistration)) * 31)) * 31, 31, this.requestKey);
            String str = this.registrationDeeplink;
            return b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.applicationId;
            RegistrationPhone registrationPhone = this.phone;
            OtpResponseDataEntity otpResponseDataEntity = this.otpRequestEntity;
            boolean z = this.standaloneRegistration;
            YBProduct yBProduct = this.product;
            RegistrationType$OngoingOperation registrationType$OngoingOperation = this.ongoingOperation;
            String str2 = this.requestKey;
            String str3 = this.registrationDeeplink;
            StringBuilder sb = new StringBuilder("Registration(applicationId=");
            sb.append(str);
            sb.append(", phone=");
            sb.append(registrationPhone);
            sb.append(", otpRequestEntity=");
            sb.append(otpResponseDataEntity);
            sb.append(", standaloneRegistration=");
            sb.append(z);
            sb.append(", product=");
            sb.append(yBProduct);
            sb.append(", ongoingOperation=");
            sb.append(registrationType$OngoingOperation);
            sb.append(", requestKey=");
            return g8e.r(sb, str2, ", registrationDeeplink=", str3, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.applicationId);
            dest.writeParcelable(this.phone, flags);
            this.otpRequestEntity.writeToParcel(dest, flags);
            dest.writeInt(this.standaloneRegistration ? 1 : 0);
            dest.writeString(this.product.name());
            dest.writeString(this.ongoingOperation.name());
            dest.writeString(this.requestKey);
            dest.writeString(this.registrationDeeplink);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Registration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Registration createFromParcel(Parcel parcel) {
                return new Registration(parcel.readString(), (RegistrationPhone) parcel.readParcelable(Registration.class.getClassLoader()), OtpResponseDataEntity.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, YBProduct.valueOf(parcel.readString()), RegistrationType$OngoingOperation.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Registration[] newArray(int i) {
                return new Registration[i];
            }
        }

        public /* synthetic */ Registration(String str, RegistrationPhone registrationPhone, OtpResponseDataEntity otpResponseDataEntity, boolean z, YBProduct yBProduct, RegistrationType$OngoingOperation registrationType$OngoingOperation, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, registrationPhone, otpResponseDataEntity, z, yBProduct, registrationType$OngoingOperation, (i & 64) != 0 ? "request_key_authorization" : str2, str3);
        }
    }

    private CodeConfirmationParams(HeaderText headerText, boolean z, boolean z2, String str) {
        this.header = headerText;
        this.signOutEnabled = z;
        this.avatarSignOutEnabled = z2;
        this.requestKey = str;
    }

    public /* synthetic */ CodeConfirmationParams(HeaderText headerText, boolean z, boolean z2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(headerText, z, z2, str);
    }
}
