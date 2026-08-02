package com.ybsdk.deeplink.generated;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001SB©\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010 J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010 JÀ\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010 J\u0010\u00104\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b4\u0010\u001eJ\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\bA\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\bB\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bC\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\bD\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\bE\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bF\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bG\u0010 R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bH\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bI\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\bJ\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\bK\u0010 R \u0010M\u001a\u00020L8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bQ\u0010R\u001a\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lcom/ybsdk/deeplink/generated/TransferStateAction;", "Lcom/ybsdk/feature/deeplink/api/BaseDeeplinkAction;", "", "scenario", "direction", "amount", "stateHeaderTitle", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "stateImageLight", "stateTitle", "stateDescription", "currency", "timeoutHeaderTitle", "timeoutImageLight", "timeoutTitle", "timeoutDescription", "targetAgreementId", "sourceAgreementId", "targetId", "planId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/deeplink/generated/TransferStateAction;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScenario", "getDirection", "getAmount", "getStateHeaderTitle", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getStateImageLight", "getStateTitle", "getStateDescription", "getCurrency", "getTimeoutHeaderTitle", "getTimeoutImageLight", "getTimeoutTitle", "getTimeoutDescription", "getTargetAgreementId", "getSourceAgreementId", "getTargetId", "getPlanId", "Landroid/net/Uri;", "deeplinkUri", "Landroid/net/Uri;", "getDeeplinkUri", "()Landroid/net/Uri;", "getDeeplinkUri$annotations", "()V", "htb1", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferStateAction implements BaseDeeplinkAction {
    public static final Parcelable.Creator<TransferStateAction> CREATOR = new Creator();
    private final String amount;
    private final String currency;
    private final Uri deeplinkUri;
    private final String direction;
    private final String planId;
    private final String scenario;
    private final String sourceAgreementId;
    private final String stateDescription;
    private final String stateHeaderTitle;
    private final ThemedImageUrlEntity stateImageLight;
    private final String stateTitle;
    private final String targetAgreementId;
    private final String targetId;
    private final String timeoutDescription;
    private final String timeoutHeaderTitle;
    private final ThemedImageUrlEntity timeoutImageLight;
    private final String timeoutTitle;

    public TransferStateAction(String str, String str2, String str3, String str4, ThemedImageUrlEntity themedImageUrlEntity, String str5, String str6, String str7, String str8, ThemedImageUrlEntity themedImageUrlEntity2, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.scenario = str;
        this.direction = str2;
        this.amount = str3;
        this.stateHeaderTitle = str4;
        this.stateImageLight = themedImageUrlEntity;
        this.stateTitle = str5;
        this.stateDescription = str6;
        this.currency = str7;
        this.timeoutHeaderTitle = str8;
        this.timeoutImageLight = themedImageUrlEntity2;
        this.timeoutTitle = str9;
        this.timeoutDescription = str10;
        this.targetAgreementId = str11;
        this.sourceAgreementId = str12;
        this.targetId = str13;
        this.planId = str14;
        Uri.Builder j = ly3.j("ybapp", "screen.open", "/transfer_state", "scenario", str);
        j.appendQueryParameter("direction", str2);
        j.appendQueryParameter("amount", str3);
        j.appendQueryParameter("state_header_title", str4);
        String lightUrl = themedImageUrlEntity.getLightUrl();
        if (lightUrl != null) {
            j.appendQueryParameter("state_image_light", lightUrl);
        }
        String darkUrl = themedImageUrlEntity.getDarkUrl();
        if (darkUrl != null) {
            j.appendQueryParameter("state_image_light_dark", darkUrl);
        }
        j.appendQueryParameter("state_title", str5);
        j.appendQueryParameter("state_description", str6);
        j.appendQueryParameter("currency", str7);
        if (str8 != null) {
            j.appendQueryParameter("timeout_header_title", str8);
        }
        if (themedImageUrlEntity2 != null) {
            String lightUrl2 = themedImageUrlEntity2.getLightUrl();
            if (lightUrl2 != null) {
                j.appendQueryParameter("timeout_image_light", lightUrl2);
            }
            String darkUrl2 = themedImageUrlEntity2.getDarkUrl();
            if (darkUrl2 != null) {
                j.appendQueryParameter("timeout_image_light_dark", darkUrl2);
            }
        }
        if (str9 != null) {
            j.appendQueryParameter("timeout_title", str9);
        }
        if (str10 != null) {
            j.appendQueryParameter("timeout_description", str10);
        }
        if (str11 != null) {
            j.appendQueryParameter("target_agreement_id", str11);
        }
        if (str12 != null) {
            j.appendQueryParameter("source_agreement_id", str12);
        }
        if (str13 != null) {
            j.appendQueryParameter("target_id", str13);
        }
        if (str14 != null) {
            j.appendQueryParameter("plan_id", str14);
        }
        this.deeplinkUri = j.build();
    }

    public static /* synthetic */ void getDeeplinkUri$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component10, reason: from getter */
    public final ThemedImageUrlEntity getTimeoutImageLight() {
        return this.timeoutImageLight;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTimeoutTitle() {
        return this.timeoutTitle;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTimeoutDescription() {
        return this.timeoutDescription;
    }

    /* renamed from: component13, reason: from getter */
    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    /* renamed from: component15, reason: from getter */
    public final String getTargetId() {
        return this.targetId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStateHeaderTitle() {
        return this.stateHeaderTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final ThemedImageUrlEntity getStateImageLight() {
        return this.stateImageLight;
    }

    /* renamed from: component6, reason: from getter */
    public final String getStateTitle() {
        return this.stateTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getStateDescription() {
        return this.stateDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTimeoutHeaderTitle() {
        return this.timeoutHeaderTitle;
    }

    public final TransferStateAction copy(String scenario, String direction, String amount, String stateHeaderTitle, ThemedImageUrlEntity stateImageLight, String stateTitle, String stateDescription, String currency, String timeoutHeaderTitle, ThemedImageUrlEntity timeoutImageLight, String timeoutTitle, String timeoutDescription, String targetAgreementId, String sourceAgreementId, String targetId, String planId) {
        return new TransferStateAction(scenario, direction, amount, stateHeaderTitle, stateImageLight, stateTitle, stateDescription, currency, timeoutHeaderTitle, timeoutImageLight, timeoutTitle, timeoutDescription, targetAgreementId, sourceAgreementId, targetId, planId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferStateAction)) {
            return false;
        }
        TransferStateAction transferStateAction = (TransferStateAction) other;
        return jl40.l(this.scenario, transferStateAction.scenario) && jl40.l(this.direction, transferStateAction.direction) && jl40.l(this.amount, transferStateAction.amount) && jl40.l(this.stateHeaderTitle, transferStateAction.stateHeaderTitle) && jl40.l(this.stateImageLight, transferStateAction.stateImageLight) && jl40.l(this.stateTitle, transferStateAction.stateTitle) && jl40.l(this.stateDescription, transferStateAction.stateDescription) && jl40.l(this.currency, transferStateAction.currency) && jl40.l(this.timeoutHeaderTitle, transferStateAction.timeoutHeaderTitle) && jl40.l(this.timeoutImageLight, transferStateAction.timeoutImageLight) && jl40.l(this.timeoutTitle, transferStateAction.timeoutTitle) && jl40.l(this.timeoutDescription, transferStateAction.timeoutDescription) && jl40.l(this.targetAgreementId, transferStateAction.targetAgreementId) && jl40.l(this.sourceAgreementId, transferStateAction.sourceAgreementId) && jl40.l(this.targetId, transferStateAction.targetId) && jl40.l(this.planId, transferStateAction.planId);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    @Override // com.ybsdk.feature.deeplink.api.BaseDeeplinkAction
    public Uri getDeeplinkUri() {
        return this.deeplinkUri;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final String getPlanId() {
        return this.planId;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final String getSourceAgreementId() {
        return this.sourceAgreementId;
    }

    public final String getStateDescription() {
        return this.stateDescription;
    }

    public final String getStateHeaderTitle() {
        return this.stateHeaderTitle;
    }

    public final ThemedImageUrlEntity getStateImageLight() {
        return this.stateImageLight;
    }

    public final String getStateTitle() {
        return this.stateTitle;
    }

    public final String getTargetAgreementId() {
        return this.targetAgreementId;
    }

    public final String getTargetId() {
        return this.targetId;
    }

    public final String getTimeoutDescription() {
        return this.timeoutDescription;
    }

    public final String getTimeoutHeaderTitle() {
        return this.timeoutHeaderTitle;
    }

    public final ThemedImageUrlEntity getTimeoutImageLight() {
        return this.timeoutImageLight;
    }

    public final String getTimeoutTitle() {
        return this.timeoutTitle;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(xvz.c(this.stateImageLight, unr0.b(unr0.b(unr0.b(this.scenario.hashCode() * 31, 31, this.direction), 31, this.amount), 31, this.stateHeaderTitle), 31), 31, this.stateTitle), 31, this.stateDescription), 31, this.currency);
        String str = this.timeoutHeaderTitle;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.timeoutImageLight;
        int hashCode2 = (hashCode + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        String str2 = this.timeoutTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timeoutDescription;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetAgreementId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sourceAgreementId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.targetId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.planId;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.scenario;
        String str2 = this.direction;
        String str3 = this.amount;
        String str4 = this.stateHeaderTitle;
        ThemedImageUrlEntity themedImageUrlEntity = this.stateImageLight;
        String str5 = this.stateTitle;
        String str6 = this.stateDescription;
        String str7 = this.currency;
        String str8 = this.timeoutHeaderTitle;
        ThemedImageUrlEntity themedImageUrlEntity2 = this.timeoutImageLight;
        String str9 = this.timeoutTitle;
        String str10 = this.timeoutDescription;
        String str11 = this.targetAgreementId;
        String str12 = this.sourceAgreementId;
        String str13 = this.targetId;
        String str14 = this.planId;
        StringBuilder v = b64.v("TransferStateAction(scenario=", str, ", direction=", str2, ", amount=");
        g8e.D(v, str3, ", stateHeaderTitle=", str4, ", stateImageLight=");
        v.append(themedImageUrlEntity);
        v.append(", stateTitle=");
        v.append(str5);
        v.append(", stateDescription=");
        g8e.D(v, str6, ", currency=", str7, ", timeoutHeaderTitle=");
        v.append(str8);
        v.append(", timeoutImageLight=");
        v.append(themedImageUrlEntity2);
        v.append(", timeoutTitle=");
        g8e.D(v, str9, ", timeoutDescription=", str10, ", targetAgreementId=");
        g8e.D(v, str11, ", sourceAgreementId=", str12, ", targetId=");
        return g8e.r(v, str13, ", planId=", str14, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.scenario);
        dest.writeString(this.direction);
        dest.writeString(this.amount);
        dest.writeString(this.stateHeaderTitle);
        dest.writeParcelable(this.stateImageLight, flags);
        dest.writeString(this.stateTitle);
        dest.writeString(this.stateDescription);
        dest.writeString(this.currency);
        dest.writeString(this.timeoutHeaderTitle);
        dest.writeParcelable(this.timeoutImageLight, flags);
        dest.writeString(this.timeoutTitle);
        dest.writeString(this.timeoutDescription);
        dest.writeString(this.targetAgreementId);
        dest.writeString(this.sourceAgreementId);
        dest.writeString(this.targetId);
        dest.writeString(this.planId);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferStateAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferStateAction createFromParcel(Parcel parcel) {
            return new TransferStateAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(TransferStateAction.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ThemedImageUrlEntity) parcel.readParcelable(TransferStateAction.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferStateAction[] newArray(int i) {
            return new TransferStateAction[i];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TransferStateAction(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, kotlin.jvm.internal.DefaultConstructorMarker r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto La
            java.lang.String r1 = "RUB"
            r10 = r1
            goto Lc
        La:
            r10 = r27
        Lc:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L13
            r11 = r2
            goto L15
        L13:
            r11 = r28
        L15:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L1b
            r12 = r2
            goto L1d
        L1b:
            r12 = r29
        L1d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L23
            r13 = r2
            goto L25
        L23:
            r13 = r30
        L25:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2b
            r14 = r2
            goto L2d
        L2b:
            r14 = r31
        L2d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L33
            r15 = r2
            goto L35
        L33:
            r15 = r32
        L35:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L3c
            r16 = r2
            goto L3e
        L3c:
            r16 = r33
        L3e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L45
            r17 = r2
            goto L47
        L45:
            r17 = r34
        L47:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L60
            r18 = r2
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r2 = r19
            goto L72
        L60:
            r18 = r35
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
        L72:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ybsdk.deeplink.generated.TransferStateAction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
