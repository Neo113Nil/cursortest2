package com.ybsdk.feature.pin.internal.screens.createpin;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import com.ybsdk.feature.pin.api.entities.ReissueActionType;
import com.ybsdk.feature.pin.internal.entities.PinTokenEntity;
import defpackage.dzh0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(JZ\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u001a\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010(¨\u0006?"}, d2 = {"Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/pin/internal/entities/PinTokenEntity;", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lcom/ybsdk/feature/pin/api/entities/ReissueActionType;", "reissueActionType", "Lcom/ybsdk/feature/pin/api/entities/PinScenario;", "scenario", "Lcom/ybsdk/feature/pin/internal/screens/createpin/OnFinishStrategy;", "onFinishStrategy", "", "show2faLogoutButton", "", "verificationToken", "Lcom/ybsdk/core/utils/text/Text;", "toolbarText", "<init>", "(Lcom/ybsdk/feature/pin/internal/entities/PinTokenEntity;Lcom/ybsdk/feature/pin/api/entities/ReissueActionType;Lcom/ybsdk/feature/pin/api/entities/PinScenario;Lcom/ybsdk/feature/pin/internal/screens/createpin/OnFinishStrategy;ZLjava/lang/String;Lcom/ybsdk/core/utils/text/Text;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/pin/internal/entities/PinTokenEntity;", "component2", "()Lcom/ybsdk/feature/pin/api/entities/ReissueActionType;", "component3", "()Lcom/ybsdk/feature/pin/api/entities/PinScenario;", "component4", "()Lcom/ybsdk/feature/pin/internal/screens/createpin/OnFinishStrategy;", "component5", "()Z", "component6", "()Ljava/lang/String;", "component7", "()Lcom/ybsdk/core/utils/text/Text;", "copy", "(Lcom/ybsdk/feature/pin/internal/entities/PinTokenEntity;Lcom/ybsdk/feature/pin/api/entities/ReissueActionType;Lcom/ybsdk/feature/pin/api/entities/PinScenario;Lcom/ybsdk/feature/pin/internal/screens/createpin/OnFinishStrategy;ZLjava/lang/String;Lcom/ybsdk/core/utils/text/Text;)Lcom/ybsdk/feature/pin/internal/screens/createpin/CreatePinScreenParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pin/internal/entities/PinTokenEntity;", "getToken", "Lcom/ybsdk/feature/pin/api/entities/ReissueActionType;", "getReissueActionType", "Lcom/ybsdk/feature/pin/api/entities/PinScenario;", "getScenario", "Lcom/ybsdk/feature/pin/internal/screens/createpin/OnFinishStrategy;", "getOnFinishStrategy", "Z", "getShow2faLogoutButton", "Ljava/lang/String;", "getVerificationToken", "Lcom/ybsdk/core/utils/text/Text;", "getToolbarText", "feature-pin_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreatePinScreenParams implements ScreenParams {
    public static final Parcelable.Creator<CreatePinScreenParams> CREATOR = new Creator();
    private final OnFinishStrategy onFinishStrategy;
    private final ReissueActionType reissueActionType;
    private final PinScenario scenario;
    private final boolean show2faLogoutButton;
    private final PinTokenEntity token;
    private final Text toolbarText;
    private final String verificationToken;

    public /* synthetic */ CreatePinScreenParams(PinTokenEntity pinTokenEntity, ReissueActionType reissueActionType, PinScenario pinScenario, OnFinishStrategy onFinishStrategy, boolean z, String str, Text text, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : pinTokenEntity, (i & 2) != 0 ? ReissueActionType.NONE : reissueActionType, pinScenario, (i & 8) != 0 ? OnFinishStrategy.EXIT : onFinishStrategy, z, (i & 32) != 0 ? null : str, (i & 64) != 0 ? new Text.Resource(dzh0.ybsdk_pin_first_pin_set_title) : text);
    }

    public static /* synthetic */ CreatePinScreenParams copy$default(CreatePinScreenParams createPinScreenParams, PinTokenEntity pinTokenEntity, ReissueActionType reissueActionType, PinScenario pinScenario, OnFinishStrategy onFinishStrategy, boolean z, String str, Text text, int i, Object obj) {
        if ((i & 1) != 0) {
            pinTokenEntity = createPinScreenParams.token;
        }
        if ((i & 2) != 0) {
            reissueActionType = createPinScreenParams.reissueActionType;
        }
        if ((i & 4) != 0) {
            pinScenario = createPinScreenParams.scenario;
        }
        if ((i & 8) != 0) {
            onFinishStrategy = createPinScreenParams.onFinishStrategy;
        }
        if ((i & 16) != 0) {
            z = createPinScreenParams.show2faLogoutButton;
        }
        if ((i & 32) != 0) {
            str = createPinScreenParams.verificationToken;
        }
        if ((i & 64) != 0) {
            text = createPinScreenParams.toolbarText;
        }
        String str2 = str;
        Text text2 = text;
        boolean z2 = z;
        PinScenario pinScenario2 = pinScenario;
        return createPinScreenParams.copy(pinTokenEntity, reissueActionType, pinScenario2, onFinishStrategy, z2, str2, text2);
    }

    /* renamed from: component1, reason: from getter */
    public final PinTokenEntity getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final ReissueActionType getReissueActionType() {
        return this.reissueActionType;
    }

    /* renamed from: component3, reason: from getter */
    public final PinScenario getScenario() {
        return this.scenario;
    }

    /* renamed from: component4, reason: from getter */
    public final OnFinishStrategy getOnFinishStrategy() {
        return this.onFinishStrategy;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShow2faLogoutButton() {
        return this.show2faLogoutButton;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVerificationToken() {
        return this.verificationToken;
    }

    /* renamed from: component7, reason: from getter */
    public final Text getToolbarText() {
        return this.toolbarText;
    }

    public final CreatePinScreenParams copy(PinTokenEntity token, ReissueActionType reissueActionType, PinScenario scenario, OnFinishStrategy onFinishStrategy, boolean show2faLogoutButton, String verificationToken, Text toolbarText) {
        return new CreatePinScreenParams(token, reissueActionType, scenario, onFinishStrategy, show2faLogoutButton, verificationToken, toolbarText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePinScreenParams)) {
            return false;
        }
        CreatePinScreenParams createPinScreenParams = (CreatePinScreenParams) other;
        return jl40.l(this.token, createPinScreenParams.token) && this.reissueActionType == createPinScreenParams.reissueActionType && this.scenario == createPinScreenParams.scenario && this.onFinishStrategy == createPinScreenParams.onFinishStrategy && this.show2faLogoutButton == createPinScreenParams.show2faLogoutButton && jl40.l(this.verificationToken, createPinScreenParams.verificationToken) && jl40.l(this.toolbarText, createPinScreenParams.toolbarText);
    }

    public final OnFinishStrategy getOnFinishStrategy() {
        return this.onFinishStrategy;
    }

    public final ReissueActionType getReissueActionType() {
        return this.reissueActionType;
    }

    public final PinScenario getScenario() {
        return this.scenario;
    }

    public final boolean getShow2faLogoutButton() {
        return this.show2faLogoutButton;
    }

    public final PinTokenEntity getToken() {
        return this.token;
    }

    public final Text getToolbarText() {
        return this.toolbarText;
    }

    public final String getVerificationToken() {
        return this.verificationToken;
    }

    public int hashCode() {
        PinTokenEntity pinTokenEntity = this.token;
        int e = unr0.e((this.onFinishStrategy.hashCode() + ((this.scenario.hashCode() + ((this.reissueActionType.hashCode() + ((pinTokenEntity == null ? 0 : pinTokenEntity.hashCode()) * 31)) * 31)) * 31)) * 31, 31, this.show2faLogoutButton);
        String str = this.verificationToken;
        return this.toolbarText.hashCode() + ((e + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        PinTokenEntity pinTokenEntity = this.token;
        ReissueActionType reissueActionType = this.reissueActionType;
        PinScenario pinScenario = this.scenario;
        OnFinishStrategy onFinishStrategy = this.onFinishStrategy;
        boolean z = this.show2faLogoutButton;
        String str = this.verificationToken;
        Text text = this.toolbarText;
        StringBuilder sb = new StringBuilder("CreatePinScreenParams(token=");
        sb.append(pinTokenEntity);
        sb.append(", reissueActionType=");
        sb.append(reissueActionType);
        sb.append(", scenario=");
        sb.append(pinScenario);
        sb.append(", onFinishStrategy=");
        sb.append(onFinishStrategy);
        sb.append(", show2faLogoutButton=");
        unr0.A(", verificationToken=", str, ", toolbarText=", sb, z);
        sb.append(text);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        PinTokenEntity pinTokenEntity = this.token;
        if (pinTokenEntity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pinTokenEntity.writeToParcel(dest, flags);
        }
        dest.writeString(this.reissueActionType.name());
        dest.writeString(this.scenario.name());
        dest.writeString(this.onFinishStrategy.name());
        dest.writeInt(this.show2faLogoutButton ? 1 : 0);
        dest.writeString(this.verificationToken);
        dest.writeParcelable(this.toolbarText, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreatePinScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreatePinScreenParams createFromParcel(Parcel parcel) {
            return new CreatePinScreenParams(parcel.readInt() == 0 ? null : PinTokenEntity.CREATOR.createFromParcel(parcel), ReissueActionType.valueOf(parcel.readString()), PinScenario.valueOf(parcel.readString()), OnFinishStrategy.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString(), (Text) parcel.readParcelable(CreatePinScreenParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreatePinScreenParams[] newArray(int i) {
            return new CreatePinScreenParams[i];
        }
    }

    public CreatePinScreenParams(PinTokenEntity pinTokenEntity, ReissueActionType reissueActionType, PinScenario pinScenario, OnFinishStrategy onFinishStrategy, boolean z, String str, Text text) {
        this.token = pinTokenEntity;
        this.reissueActionType = reissueActionType;
        this.scenario = pinScenario;
        this.onFinishStrategy = onFinishStrategy;
        this.show2faLogoutButton = z;
        this.verificationToken = str;
        this.toolbarText = text;
    }
}
