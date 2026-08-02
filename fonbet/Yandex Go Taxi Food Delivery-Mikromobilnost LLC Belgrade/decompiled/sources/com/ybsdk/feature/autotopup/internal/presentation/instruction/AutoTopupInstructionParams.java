package com.ybsdk.feature.autotopup.internal.presentation.instruction;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.internal.domain.entities.ConfirmInstructionEntity;
import com.ybsdk.feature.autotopup.internal.domain.entities.IntroductionScreenEntity;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001:\u000267B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"JP\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010)\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\"¨\u00068"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/IntroductionScreenEntity;", "introductionScreen", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/ConfirmInstructionEntity;", "confirmInstruction", "", "autoTopupId", "twoFactorScreenTitle", "Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupInfoEntity;", "infoEntity", "", "autoFundEnabled", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/domain/entities/IntroductionScreenEntity;Lcom/ybsdk/feature/autotopup/internal/domain/entities/ConfirmInstructionEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupInfoEntity;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/autotopup/internal/domain/entities/IntroductionScreenEntity;", "component2", "()Lcom/ybsdk/feature/autotopup/internal/domain/entities/ConfirmInstructionEntity;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupInfoEntity;", "component6", "()Ljava/lang/Boolean;", "copy", "(Lcom/ybsdk/feature/autotopup/internal/domain/entities/IntroductionScreenEntity;Lcom/ybsdk/feature/autotopup/internal/domain/entities/ConfirmInstructionEntity;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupInfoEntity;Ljava/lang/Boolean;)Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/IntroductionScreenEntity;", "getIntroductionScreen", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/ConfirmInstructionEntity;", "getConfirmInstruction", "Ljava/lang/String;", "getAutoTopupId", "getTwoFactorScreenTitle", "Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupInfoEntity;", "getInfoEntity", "Ljava/lang/Boolean;", "getAutoFundEnabled", "SaveAutoTopupInfoEntity", "SaveAutoTopupMe2Me", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupInstructionParams implements ScreenParams {
    public static final Parcelable.Creator<AutoTopupInstructionParams> CREATOR = new Creator();
    private final Boolean autoFundEnabled;
    private final String autoTopupId;
    private final ConfirmInstructionEntity confirmInstruction;
    private final SaveAutoTopupInfoEntity infoEntity;
    private final IntroductionScreenEntity introductionScreen;
    private final String twoFactorScreenTitle;

    public AutoTopupInstructionParams(IntroductionScreenEntity introductionScreenEntity, ConfirmInstructionEntity confirmInstructionEntity, String str, String str2, SaveAutoTopupInfoEntity saveAutoTopupInfoEntity, Boolean bool) {
        this.introductionScreen = introductionScreenEntity;
        this.confirmInstruction = confirmInstructionEntity;
        this.autoTopupId = str;
        this.twoFactorScreenTitle = str2;
        this.infoEntity = saveAutoTopupInfoEntity;
        this.autoFundEnabled = bool;
    }

    public static /* synthetic */ AutoTopupInstructionParams copy$default(AutoTopupInstructionParams autoTopupInstructionParams, IntroductionScreenEntity introductionScreenEntity, ConfirmInstructionEntity confirmInstructionEntity, String str, String str2, SaveAutoTopupInfoEntity saveAutoTopupInfoEntity, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            introductionScreenEntity = autoTopupInstructionParams.introductionScreen;
        }
        if ((i & 2) != 0) {
            confirmInstructionEntity = autoTopupInstructionParams.confirmInstruction;
        }
        if ((i & 4) != 0) {
            str = autoTopupInstructionParams.autoTopupId;
        }
        if ((i & 8) != 0) {
            str2 = autoTopupInstructionParams.twoFactorScreenTitle;
        }
        if ((i & 16) != 0) {
            saveAutoTopupInfoEntity = autoTopupInstructionParams.infoEntity;
        }
        if ((i & 32) != 0) {
            bool = autoTopupInstructionParams.autoFundEnabled;
        }
        SaveAutoTopupInfoEntity saveAutoTopupInfoEntity2 = saveAutoTopupInfoEntity;
        Boolean bool2 = bool;
        return autoTopupInstructionParams.copy(introductionScreenEntity, confirmInstructionEntity, str, str2, saveAutoTopupInfoEntity2, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final IntroductionScreenEntity getIntroductionScreen() {
        return this.introductionScreen;
    }

    /* renamed from: component2, reason: from getter */
    public final ConfirmInstructionEntity getConfirmInstruction() {
        return this.confirmInstruction;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTwoFactorScreenTitle() {
        return this.twoFactorScreenTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final SaveAutoTopupInfoEntity getInfoEntity() {
        return this.infoEntity;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getAutoFundEnabled() {
        return this.autoFundEnabled;
    }

    public final AutoTopupInstructionParams copy(IntroductionScreenEntity introductionScreen, ConfirmInstructionEntity confirmInstruction, String autoTopupId, String twoFactorScreenTitle, SaveAutoTopupInfoEntity infoEntity, Boolean autoFundEnabled) {
        return new AutoTopupInstructionParams(introductionScreen, confirmInstruction, autoTopupId, twoFactorScreenTitle, infoEntity, autoFundEnabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupInstructionParams)) {
            return false;
        }
        AutoTopupInstructionParams autoTopupInstructionParams = (AutoTopupInstructionParams) other;
        return jl40.l(this.introductionScreen, autoTopupInstructionParams.introductionScreen) && jl40.l(this.confirmInstruction, autoTopupInstructionParams.confirmInstruction) && jl40.l(this.autoTopupId, autoTopupInstructionParams.autoTopupId) && jl40.l(this.twoFactorScreenTitle, autoTopupInstructionParams.twoFactorScreenTitle) && jl40.l(this.infoEntity, autoTopupInstructionParams.infoEntity) && jl40.l(this.autoFundEnabled, autoTopupInstructionParams.autoFundEnabled);
    }

    public final Boolean getAutoFundEnabled() {
        return this.autoFundEnabled;
    }

    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    public final ConfirmInstructionEntity getConfirmInstruction() {
        return this.confirmInstruction;
    }

    public final SaveAutoTopupInfoEntity getInfoEntity() {
        return this.infoEntity;
    }

    public final IntroductionScreenEntity getIntroductionScreen() {
        return this.introductionScreen;
    }

    public final String getTwoFactorScreenTitle() {
        return this.twoFactorScreenTitle;
    }

    public int hashCode() {
        int hashCode = (this.confirmInstruction.hashCode() + (this.introductionScreen.hashCode() * 31)) * 31;
        String str = this.autoTopupId;
        int hashCode2 = (this.infoEntity.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.twoFactorScreenTitle)) * 31;
        Boolean bool = this.autoFundEnabled;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        IntroductionScreenEntity introductionScreenEntity = this.introductionScreen;
        ConfirmInstructionEntity confirmInstructionEntity = this.confirmInstruction;
        String str = this.autoTopupId;
        String str2 = this.twoFactorScreenTitle;
        SaveAutoTopupInfoEntity saveAutoTopupInfoEntity = this.infoEntity;
        Boolean bool = this.autoFundEnabled;
        StringBuilder sb = new StringBuilder("AutoTopupInstructionParams(introductionScreen=");
        sb.append(introductionScreenEntity);
        sb.append(", confirmInstruction=");
        sb.append(confirmInstructionEntity);
        sb.append(", autoTopupId=");
        g8e.D(sb, str, ", twoFactorScreenTitle=", str2, ", infoEntity=");
        sb.append(saveAutoTopupInfoEntity);
        sb.append(", autoFundEnabled=");
        sb.append(bool);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.introductionScreen.writeToParcel(dest, flags);
        this.confirmInstruction.writeToParcel(dest, flags);
        dest.writeString(this.autoTopupId);
        dest.writeString(this.twoFactorScreenTitle);
        this.infoEntity.writeToParcel(dest, flags);
        Boolean bool = this.autoFundEnabled;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            nzs.k(dest, 1, bool);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001c¨\u0006."}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupInfoEntity;", "Landroid/os/Parcelable;", "", "agreementId", "amount", "threshold", "Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupMe2Me;", "paymentMethod", "Lcom/ybsdk/feature/autotopup/api/AutoTopupType;", "autoTopupType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupMe2Me;Lcom/ybsdk/feature/autotopup/api/AutoTopupType;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupMe2Me;", "component5", "()Lcom/ybsdk/feature/autotopup/api/AutoTopupType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupMe2Me;Lcom/ybsdk/feature/autotopup/api/AutoTopupType;)Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupInfoEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getAmount", "getThreshold", "Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupMe2Me;", "getPaymentMethod", "Lcom/ybsdk/feature/autotopup/api/AutoTopupType;", "getAutoTopupType", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveAutoTopupInfoEntity implements Parcelable {
        public static final Parcelable.Creator<SaveAutoTopupInfoEntity> CREATOR = new Creator();
        private final String agreementId;
        private final String amount;
        private final AutoTopupType autoTopupType;
        private final SaveAutoTopupMe2Me paymentMethod;
        private final String threshold;

        public SaveAutoTopupInfoEntity(String str, String str2, String str3, SaveAutoTopupMe2Me saveAutoTopupMe2Me, AutoTopupType autoTopupType) {
            this.agreementId = str;
            this.amount = str2;
            this.threshold = str3;
            this.paymentMethod = saveAutoTopupMe2Me;
            this.autoTopupType = autoTopupType;
        }

        public static /* synthetic */ SaveAutoTopupInfoEntity copy$default(SaveAutoTopupInfoEntity saveAutoTopupInfoEntity, String str, String str2, String str3, SaveAutoTopupMe2Me saveAutoTopupMe2Me, AutoTopupType autoTopupType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = saveAutoTopupInfoEntity.agreementId;
            }
            if ((i & 2) != 0) {
                str2 = saveAutoTopupInfoEntity.amount;
            }
            if ((i & 4) != 0) {
                str3 = saveAutoTopupInfoEntity.threshold;
            }
            if ((i & 8) != 0) {
                saveAutoTopupMe2Me = saveAutoTopupInfoEntity.paymentMethod;
            }
            if ((i & 16) != 0) {
                autoTopupType = saveAutoTopupInfoEntity.autoTopupType;
            }
            AutoTopupType autoTopupType2 = autoTopupType;
            String str4 = str3;
            return saveAutoTopupInfoEntity.copy(str, str2, str4, saveAutoTopupMe2Me, autoTopupType2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final String getThreshold() {
            return this.threshold;
        }

        /* renamed from: component4, reason: from getter */
        public final SaveAutoTopupMe2Me getPaymentMethod() {
            return this.paymentMethod;
        }

        /* renamed from: component5, reason: from getter */
        public final AutoTopupType getAutoTopupType() {
            return this.autoTopupType;
        }

        public final SaveAutoTopupInfoEntity copy(String agreementId, String amount, String threshold, SaveAutoTopupMe2Me paymentMethod, AutoTopupType autoTopupType) {
            return new SaveAutoTopupInfoEntity(agreementId, amount, threshold, paymentMethod, autoTopupType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveAutoTopupInfoEntity)) {
                return false;
            }
            SaveAutoTopupInfoEntity saveAutoTopupInfoEntity = (SaveAutoTopupInfoEntity) other;
            return jl40.l(this.agreementId, saveAutoTopupInfoEntity.agreementId) && jl40.l(this.amount, saveAutoTopupInfoEntity.amount) && jl40.l(this.threshold, saveAutoTopupInfoEntity.threshold) && jl40.l(this.paymentMethod, saveAutoTopupInfoEntity.paymentMethod) && this.autoTopupType == saveAutoTopupInfoEntity.autoTopupType;
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final AutoTopupType getAutoTopupType() {
            return this.autoTopupType;
        }

        public final SaveAutoTopupMe2Me getPaymentMethod() {
            return this.paymentMethod;
        }

        public final String getThreshold() {
            return this.threshold;
        }

        public int hashCode() {
            return this.autoTopupType.hashCode() + ((this.paymentMethod.hashCode() + unr0.b(unr0.b(this.agreementId.hashCode() * 31, 31, this.amount), 31, this.threshold)) * 31);
        }

        public String toString() {
            String str = this.agreementId;
            String str2 = this.amount;
            String str3 = this.threshold;
            SaveAutoTopupMe2Me saveAutoTopupMe2Me = this.paymentMethod;
            AutoTopupType autoTopupType = this.autoTopupType;
            StringBuilder v = b64.v("SaveAutoTopupInfoEntity(agreementId=", str, ", amount=", str2, ", threshold=");
            v.append(str3);
            v.append(", paymentMethod=");
            v.append(saveAutoTopupMe2Me);
            v.append(", autoTopupType=");
            v.append(autoTopupType);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.agreementId);
            dest.writeString(this.amount);
            dest.writeString(this.threshold);
            this.paymentMethod.writeToParcel(dest, flags);
            dest.writeString(this.autoTopupType.name());
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SaveAutoTopupInfoEntity> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SaveAutoTopupInfoEntity createFromParcel(Parcel parcel) {
                return new SaveAutoTopupInfoEntity(parcel.readString(), parcel.readString(), parcel.readString(), SaveAutoTopupMe2Me.CREATOR.createFromParcel(parcel), AutoTopupType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SaveAutoTopupInfoEntity[] newArray(int i) {
                return new SaveAutoTopupInfoEntity[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ^\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b1\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b2\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b3\u0010\u001a¨\u00064"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupMe2Me;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/utils/text/Text;", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "logo", "selectedLogo", "ybSuggestId", "ybId", "id", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component4", "component5", "component6", "component7", "copy", "(Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/autotopup/internal/presentation/instruction/AutoTopupInstructionParams$SaveAutoTopupMe2Me;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getTitle", "Ljava/lang/String;", "getDescription", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getLogo", "getSelectedLogo", "getYbSuggestId", "getYbId", "getId", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveAutoTopupMe2Me implements Parcelable {
        public static final Parcelable.Creator<SaveAutoTopupMe2Me> CREATOR = new Creator();
        private final String description;
        private final String id;
        private final ThemedImageUrlEntity logo;
        private final ThemedImageUrlEntity selectedLogo;
        private final Text title;
        private final String ybId;
        private final String ybSuggestId;

        public SaveAutoTopupMe2Me(Text text, String str, ThemedImageUrlEntity themedImageUrlEntity, ThemedImageUrlEntity themedImageUrlEntity2, String str2, String str3, String str4) {
            this.title = text;
            this.description = str;
            this.logo = themedImageUrlEntity;
            this.selectedLogo = themedImageUrlEntity2;
            this.ybSuggestId = str2;
            this.ybId = str3;
            this.id = str4;
        }

        public static /* synthetic */ SaveAutoTopupMe2Me copy$default(SaveAutoTopupMe2Me saveAutoTopupMe2Me, Text text, String str, ThemedImageUrlEntity themedImageUrlEntity, ThemedImageUrlEntity themedImageUrlEntity2, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                text = saveAutoTopupMe2Me.title;
            }
            if ((i & 2) != 0) {
                str = saveAutoTopupMe2Me.description;
            }
            if ((i & 4) != 0) {
                themedImageUrlEntity = saveAutoTopupMe2Me.logo;
            }
            if ((i & 8) != 0) {
                themedImageUrlEntity2 = saveAutoTopupMe2Me.selectedLogo;
            }
            if ((i & 16) != 0) {
                str2 = saveAutoTopupMe2Me.ybSuggestId;
            }
            if ((i & 32) != 0) {
                str3 = saveAutoTopupMe2Me.ybId;
            }
            if ((i & 64) != 0) {
                str4 = saveAutoTopupMe2Me.id;
            }
            String str5 = str3;
            String str6 = str4;
            String str7 = str2;
            ThemedImageUrlEntity themedImageUrlEntity3 = themedImageUrlEntity;
            return saveAutoTopupMe2Me.copy(text, str, themedImageUrlEntity3, themedImageUrlEntity2, str7, str5, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final Text getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final ThemedImageUrlEntity getLogo() {
            return this.logo;
        }

        /* renamed from: component4, reason: from getter */
        public final ThemedImageUrlEntity getSelectedLogo() {
            return this.selectedLogo;
        }

        /* renamed from: component5, reason: from getter */
        public final String getYbSuggestId() {
            return this.ybSuggestId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getYbId() {
            return this.ybId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final SaveAutoTopupMe2Me copy(Text title, String description, ThemedImageUrlEntity logo, ThemedImageUrlEntity selectedLogo, String ybSuggestId, String ybId, String id) {
            return new SaveAutoTopupMe2Me(title, description, logo, selectedLogo, ybSuggestId, ybId, id);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveAutoTopupMe2Me)) {
                return false;
            }
            SaveAutoTopupMe2Me saveAutoTopupMe2Me = (SaveAutoTopupMe2Me) other;
            return jl40.l(this.title, saveAutoTopupMe2Me.title) && jl40.l(this.description, saveAutoTopupMe2Me.description) && jl40.l(this.logo, saveAutoTopupMe2Me.logo) && jl40.l(this.selectedLogo, saveAutoTopupMe2Me.selectedLogo) && jl40.l(this.ybSuggestId, saveAutoTopupMe2Me.ybSuggestId) && jl40.l(this.ybId, saveAutoTopupMe2Me.ybId) && jl40.l(this.id, saveAutoTopupMe2Me.id);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getId() {
            return this.id;
        }

        public final ThemedImageUrlEntity getLogo() {
            return this.logo;
        }

        public final ThemedImageUrlEntity getSelectedLogo() {
            return this.selectedLogo;
        }

        public final Text getTitle() {
            return this.title;
        }

        public final String getYbId() {
            return this.ybId;
        }

        public final String getYbSuggestId() {
            return this.ybSuggestId;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ThemedImageUrlEntity themedImageUrlEntity = this.logo;
            int hashCode3 = (hashCode2 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
            ThemedImageUrlEntity themedImageUrlEntity2 = this.selectedLogo;
            int hashCode4 = (hashCode3 + (themedImageUrlEntity2 == null ? 0 : themedImageUrlEntity2.hashCode())) * 31;
            String str2 = this.ybSuggestId;
            return this.id.hashCode() + unr0.b((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.ybId);
        }

        public String toString() {
            Text text = this.title;
            String str = this.description;
            ThemedImageUrlEntity themedImageUrlEntity = this.logo;
            ThemedImageUrlEntity themedImageUrlEntity2 = this.selectedLogo;
            String str2 = this.ybSuggestId;
            String str3 = this.ybId;
            String str4 = this.id;
            StringBuilder sb = new StringBuilder("SaveAutoTopupMe2Me(title=");
            sb.append(text);
            sb.append(", description=");
            sb.append(str);
            sb.append(", logo=");
            sb.append(themedImageUrlEntity);
            sb.append(", selectedLogo=");
            sb.append(themedImageUrlEntity2);
            sb.append(", ybSuggestId=");
            g8e.D(sb, str2, ", ybId=", str3, ", id=");
            return oyr.t(sb, str4, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.title, flags);
            dest.writeString(this.description);
            dest.writeParcelable(this.logo, flags);
            dest.writeParcelable(this.selectedLogo, flags);
            dest.writeString(this.ybSuggestId);
            dest.writeString(this.ybId);
            dest.writeString(this.id);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SaveAutoTopupMe2Me> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SaveAutoTopupMe2Me createFromParcel(Parcel parcel) {
                return new SaveAutoTopupMe2Me((Text) parcel.readParcelable(SaveAutoTopupMe2Me.class.getClassLoader()), parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(SaveAutoTopupMe2Me.class.getClassLoader()), (ThemedImageUrlEntity) parcel.readParcelable(SaveAutoTopupMe2Me.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SaveAutoTopupMe2Me[] newArray(int i) {
                return new SaveAutoTopupMe2Me[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoTopupInstructionParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTopupInstructionParams createFromParcel(Parcel parcel) {
            Boolean valueOf;
            IntroductionScreenEntity createFromParcel = IntroductionScreenEntity.CREATOR.createFromParcel(parcel);
            ConfirmInstructionEntity createFromParcel2 = ConfirmInstructionEntity.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            SaveAutoTopupInfoEntity createFromParcel3 = SaveAutoTopupInfoEntity.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoTopupInstructionParams(createFromParcel, createFromParcel2, readString, readString2, createFromParcel3, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoTopupInstructionParams[] newArray(int i) {
            return new AutoTopupInstructionParams[i];
        }
    }
}
