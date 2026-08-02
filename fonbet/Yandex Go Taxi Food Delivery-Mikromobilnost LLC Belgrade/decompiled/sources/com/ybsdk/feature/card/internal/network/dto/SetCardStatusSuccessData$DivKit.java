package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.l2r0;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"com/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$DivKit", "Ll2r0;", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "actionType", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "divkitMainBlock", "", "closeAction", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;)V", "component1", "()Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "component2", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component3", "()Ljava/lang/String;", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$DivKit;", "copy", "(Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;)Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$DivKit;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "getActionType", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getDivkitMainBlock", "Ljava/lang/String;", "getCloseAction", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SetCardStatusSuccessData$DivKit implements l2r0 {
    private final SetCardStatusSuccessData$ActionType actionType;
    private final String closeAction;
    private final DivDataDto divkitMainBlock;

    public SetCardStatusSuccessData$DivKit(@Json(name = "action_type") SetCardStatusSuccessData$ActionType setCardStatusSuccessData$ActionType, @Json(name = "divkit_main_block") DivDataDto divDataDto, @Json(name = "close_action") String str) {
        this.actionType = setCardStatusSuccessData$ActionType;
        this.divkitMainBlock = divDataDto;
        this.closeAction = str;
    }

    public static /* synthetic */ SetCardStatusSuccessData$DivKit copy$default(SetCardStatusSuccessData$DivKit setCardStatusSuccessData$DivKit, SetCardStatusSuccessData$ActionType setCardStatusSuccessData$ActionType, DivDataDto divDataDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            setCardStatusSuccessData$ActionType = setCardStatusSuccessData$DivKit.actionType;
        }
        if ((i & 2) != 0) {
            divDataDto = setCardStatusSuccessData$DivKit.divkitMainBlock;
        }
        if ((i & 4) != 0) {
            str = setCardStatusSuccessData$DivKit.closeAction;
        }
        return setCardStatusSuccessData$DivKit.copy(setCardStatusSuccessData$ActionType, divDataDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final SetCardStatusSuccessData$ActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getDivkitMainBlock() {
        return this.divkitMainBlock;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCloseAction() {
        return this.closeAction;
    }

    public final SetCardStatusSuccessData$DivKit copy(@Json(name = "action_type") SetCardStatusSuccessData$ActionType actionType, @Json(name = "divkit_main_block") DivDataDto divkitMainBlock, @Json(name = "close_action") String closeAction) {
        return new SetCardStatusSuccessData$DivKit(actionType, divkitMainBlock, closeAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetCardStatusSuccessData$DivKit)) {
            return false;
        }
        SetCardStatusSuccessData$DivKit setCardStatusSuccessData$DivKit = (SetCardStatusSuccessData$DivKit) other;
        return this.actionType == setCardStatusSuccessData$DivKit.actionType && jl40.l(this.divkitMainBlock, setCardStatusSuccessData$DivKit.divkitMainBlock) && jl40.l(this.closeAction, setCardStatusSuccessData$DivKit.closeAction);
    }

    public final SetCardStatusSuccessData$ActionType getActionType() {
        return this.actionType;
    }

    public String getCloseAction() {
        return this.closeAction;
    }

    public final DivDataDto getDivkitMainBlock() {
        return this.divkitMainBlock;
    }

    public int hashCode() {
        int hashCode = this.actionType.hashCode() * 31;
        DivDataDto divDataDto = this.divkitMainBlock;
        int hashCode2 = (hashCode + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        String str = this.closeAction;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        SetCardStatusSuccessData$ActionType setCardStatusSuccessData$ActionType = this.actionType;
        DivDataDto divDataDto = this.divkitMainBlock;
        String str = this.closeAction;
        StringBuilder sb = new StringBuilder("DivKit(actionType=");
        sb.append(setCardStatusSuccessData$ActionType);
        sb.append(", divkitMainBlock=");
        sb.append(divDataDto);
        sb.append(", closeAction=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
