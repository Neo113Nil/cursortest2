package com.ybsdk.feature.autotopup.internal.domain.entities;

import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import defpackage.aa4;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n;
import defpackage.unr0;
import defpackage.xvz;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0011KBu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0096\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b0\u0010'J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b\u000b\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bB\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010)R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bH\u0010+R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010-¨\u0006L"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntity;", "", "Lcom/ybsdk/core/utils/text/Text;", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "amount", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "logo", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntity$Status;", ACSPConstants.STATUS, "", "isLogoWithStatus", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "primaryButton", "secondaryButton", "", "failedPaymentId", "Laa4;", "loadingData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequest;", "saveAutoTopupRequest", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/RegularAutotopupEntity;", "regularAutotopup", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntity$Status;ZLcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Ljava/lang/String;Laa4;Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequest;Lcom/ybsdk/feature/autotopup/internal/domain/entities/RegularAutotopupEntity;)V", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "component2", "component3", "component4", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component5", "()Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntity$Status;", "component6", "()Z", "component7", "()Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "component8", "component9", "()Ljava/lang/String;", "component10", "()Laa4;", "component11", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequest;", "component12", "()Lcom/ybsdk/feature/autotopup/internal/domain/entities/RegularAutotopupEntity;", "copy", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntity$Status;ZLcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Ljava/lang/String;Laa4;Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequest;Lcom/ybsdk/feature/autotopup/internal/domain/entities/RegularAutotopupEntity;)Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntity;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getTitle", "getDescription", "getAmount", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getLogo", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntity$Status;", "getStatus", "Z", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "getPrimaryButton", "getSecondaryButton", "Ljava/lang/String;", "getFailedPaymentId", "Laa4;", "getLoadingData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SaveAutoTopupRequest;", "getSaveAutoTopupRequest", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/RegularAutotopupEntity;", "getRegularAutotopup", "Status", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutotopupPaymentStatusResultDataEntity {
    private final Text amount;
    private final Text description;
    private final String failedPaymentId;
    private final boolean isLogoWithStatus;
    private final aa4 loadingData;
    private final ThemedImageUrlEntity logo;
    private final ActionButtonEntity primaryButton;
    private final RegularAutotopupEntity regularAutotopup;
    private final SaveAutoTopupRequest saveAutoTopupRequest;
    private final ActionButtonEntity secondaryButton;
    private final Status status;
    private final Text title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusResultDataEntity$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "TIMEOUT", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status ERROR = new Status("ERROR", 1);
        public static final Status TIMEOUT = new Status("TIMEOUT", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, ERROR, TIMEOUT};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public AutotopupPaymentStatusResultDataEntity(Text text, Text text2, Text text3, ThemedImageUrlEntity themedImageUrlEntity, Status status, boolean z, ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2, String str, aa4 aa4Var, SaveAutoTopupRequest saveAutoTopupRequest, RegularAutotopupEntity regularAutotopupEntity) {
        this.title = text;
        this.description = text2;
        this.amount = text3;
        this.logo = themedImageUrlEntity;
        this.status = status;
        this.isLogoWithStatus = z;
        this.primaryButton = actionButtonEntity;
        this.secondaryButton = actionButtonEntity2;
        this.failedPaymentId = str;
        this.loadingData = aa4Var;
        this.saveAutoTopupRequest = saveAutoTopupRequest;
        this.regularAutotopup = regularAutotopupEntity;
    }

    public static /* synthetic */ AutotopupPaymentStatusResultDataEntity copy$default(AutotopupPaymentStatusResultDataEntity autotopupPaymentStatusResultDataEntity, Text text, Text text2, Text text3, ThemedImageUrlEntity themedImageUrlEntity, Status status, boolean z, ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2, String str, aa4 aa4Var, SaveAutoTopupRequest saveAutoTopupRequest, RegularAutotopupEntity regularAutotopupEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            text = autotopupPaymentStatusResultDataEntity.title;
        }
        if ((i & 2) != 0) {
            text2 = autotopupPaymentStatusResultDataEntity.description;
        }
        if ((i & 4) != 0) {
            text3 = autotopupPaymentStatusResultDataEntity.amount;
        }
        if ((i & 8) != 0) {
            themedImageUrlEntity = autotopupPaymentStatusResultDataEntity.logo;
        }
        if ((i & 16) != 0) {
            status = autotopupPaymentStatusResultDataEntity.status;
        }
        if ((i & 32) != 0) {
            z = autotopupPaymentStatusResultDataEntity.isLogoWithStatus;
        }
        if ((i & 64) != 0) {
            actionButtonEntity = autotopupPaymentStatusResultDataEntity.primaryButton;
        }
        if ((i & 128) != 0) {
            actionButtonEntity2 = autotopupPaymentStatusResultDataEntity.secondaryButton;
        }
        if ((i & 256) != 0) {
            str = autotopupPaymentStatusResultDataEntity.failedPaymentId;
        }
        if ((i & 512) != 0) {
            aa4Var = autotopupPaymentStatusResultDataEntity.loadingData;
        }
        if ((i & 1024) != 0) {
            saveAutoTopupRequest = autotopupPaymentStatusResultDataEntity.saveAutoTopupRequest;
        }
        if ((i & 2048) != 0) {
            regularAutotopupEntity = autotopupPaymentStatusResultDataEntity.regularAutotopup;
        }
        SaveAutoTopupRequest saveAutoTopupRequest2 = saveAutoTopupRequest;
        RegularAutotopupEntity regularAutotopupEntity2 = regularAutotopupEntity;
        String str2 = str;
        aa4 aa4Var2 = aa4Var;
        ActionButtonEntity actionButtonEntity3 = actionButtonEntity;
        ActionButtonEntity actionButtonEntity4 = actionButtonEntity2;
        Status status2 = status;
        boolean z2 = z;
        return autotopupPaymentStatusResultDataEntity.copy(text, text2, text3, themedImageUrlEntity, status2, z2, actionButtonEntity3, actionButtonEntity4, str2, aa4Var2, saveAutoTopupRequest2, regularAutotopupEntity2);
    }

    /* renamed from: component1, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final aa4 getLoadingData() {
        return this.loadingData;
    }

    /* renamed from: component11, reason: from getter */
    public final SaveAutoTopupRequest getSaveAutoTopupRequest() {
        return this.saveAutoTopupRequest;
    }

    /* renamed from: component12, reason: from getter */
    public final RegularAutotopupEntity getRegularAutotopup() {
        return this.regularAutotopup;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final Text getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final ThemedImageUrlEntity getLogo() {
        return this.logo;
    }

    /* renamed from: component5, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLogoWithStatus() {
        return this.isLogoWithStatus;
    }

    /* renamed from: component7, reason: from getter */
    public final ActionButtonEntity getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component8, reason: from getter */
    public final ActionButtonEntity getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component9, reason: from getter */
    public final String getFailedPaymentId() {
        return this.failedPaymentId;
    }

    public final AutotopupPaymentStatusResultDataEntity copy(Text title, Text description, Text amount, ThemedImageUrlEntity logo, Status status, boolean isLogoWithStatus, ActionButtonEntity primaryButton, ActionButtonEntity secondaryButton, String failedPaymentId, aa4 loadingData, SaveAutoTopupRequest saveAutoTopupRequest, RegularAutotopupEntity regularAutotopup) {
        return new AutotopupPaymentStatusResultDataEntity(title, description, amount, logo, status, isLogoWithStatus, primaryButton, secondaryButton, failedPaymentId, loadingData, saveAutoTopupRequest, regularAutotopup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotopupPaymentStatusResultDataEntity)) {
            return false;
        }
        AutotopupPaymentStatusResultDataEntity autotopupPaymentStatusResultDataEntity = (AutotopupPaymentStatusResultDataEntity) other;
        return jl40.l(this.title, autotopupPaymentStatusResultDataEntity.title) && jl40.l(this.description, autotopupPaymentStatusResultDataEntity.description) && jl40.l(this.amount, autotopupPaymentStatusResultDataEntity.amount) && jl40.l(this.logo, autotopupPaymentStatusResultDataEntity.logo) && this.status == autotopupPaymentStatusResultDataEntity.status && this.isLogoWithStatus == autotopupPaymentStatusResultDataEntity.isLogoWithStatus && jl40.l(this.primaryButton, autotopupPaymentStatusResultDataEntity.primaryButton) && jl40.l(this.secondaryButton, autotopupPaymentStatusResultDataEntity.secondaryButton) && jl40.l(this.failedPaymentId, autotopupPaymentStatusResultDataEntity.failedPaymentId) && jl40.l(this.loadingData, autotopupPaymentStatusResultDataEntity.loadingData) && jl40.l(this.saveAutoTopupRequest, autotopupPaymentStatusResultDataEntity.saveAutoTopupRequest) && jl40.l(this.regularAutotopup, autotopupPaymentStatusResultDataEntity.regularAutotopup);
    }

    public final Text getAmount() {
        return this.amount;
    }

    public final Text getDescription() {
        return this.description;
    }

    public final String getFailedPaymentId() {
        return this.failedPaymentId;
    }

    public final aa4 getLoadingData() {
        return this.loadingData;
    }

    public final ThemedImageUrlEntity getLogo() {
        return this.logo;
    }

    public final ActionButtonEntity getPrimaryButton() {
        return this.primaryButton;
    }

    public final RegularAutotopupEntity getRegularAutotopup() {
        return this.regularAutotopup;
    }

    public final SaveAutoTopupRequest getSaveAutoTopupRequest() {
        return this.saveAutoTopupRequest;
    }

    public final ActionButtonEntity getSecondaryButton() {
        return this.secondaryButton;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        Text text = this.title;
        int c = n.c(this.description, (text == null ? 0 : text.hashCode()) * 31, 31);
        Text text2 = this.amount;
        int hashCode = (this.primaryButton.hashCode() + unr0.e((this.status.hashCode() + xvz.c(this.logo, (c + (text2 == null ? 0 : text2.hashCode())) * 31, 31)) * 31, 31, this.isLogoWithStatus)) * 31;
        ActionButtonEntity actionButtonEntity = this.secondaryButton;
        int hashCode2 = (hashCode + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31;
        String str = this.failedPaymentId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        aa4 aa4Var = this.loadingData;
        int hashCode4 = (hashCode3 + (aa4Var == null ? 0 : aa4Var.hashCode())) * 31;
        SaveAutoTopupRequest saveAutoTopupRequest = this.saveAutoTopupRequest;
        int hashCode5 = (hashCode4 + (saveAutoTopupRequest == null ? 0 : saveAutoTopupRequest.hashCode())) * 31;
        RegularAutotopupEntity regularAutotopupEntity = this.regularAutotopup;
        return hashCode5 + (regularAutotopupEntity != null ? regularAutotopupEntity.hashCode() : 0);
    }

    public final boolean isLogoWithStatus() {
        return this.isLogoWithStatus;
    }

    public String toString() {
        Text text = this.title;
        Text text2 = this.description;
        Text text3 = this.amount;
        ThemedImageUrlEntity themedImageUrlEntity = this.logo;
        Status status = this.status;
        boolean z = this.isLogoWithStatus;
        ActionButtonEntity actionButtonEntity = this.primaryButton;
        ActionButtonEntity actionButtonEntity2 = this.secondaryButton;
        String str = this.failedPaymentId;
        aa4 aa4Var = this.loadingData;
        SaveAutoTopupRequest saveAutoTopupRequest = this.saveAutoTopupRequest;
        RegularAutotopupEntity regularAutotopupEntity = this.regularAutotopup;
        StringBuilder p = n.p("AutotopupPaymentStatusResultDataEntity(title=", text, ", description=", text2, ", amount=");
        p.append(text3);
        p.append(", logo=");
        p.append(themedImageUrlEntity);
        p.append(", status=");
        p.append(status);
        p.append(", isLogoWithStatus=");
        p.append(z);
        p.append(", primaryButton=");
        p.append(actionButtonEntity);
        p.append(", secondaryButton=");
        p.append(actionButtonEntity2);
        p.append(", failedPaymentId=");
        p.append(str);
        p.append(", loadingData=");
        p.append(aa4Var);
        p.append(", saveAutoTopupRequest=");
        p.append(saveAutoTopupRequest);
        p.append(", regularAutotopup=");
        p.append(regularAutotopupEntity);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
