package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.l2r0;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\f¨\u0006\u001f"}, d2 = {"com/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$Deeplink", "Ll2r0;", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "actionType", "", "action", "closeAction", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "component2", "()Ljava/lang/String;", "component3", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$Deeplink;", "copy", "(Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$Deeplink;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "getActionType", "Ljava/lang/String;", "getAction", "getCloseAction", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SetCardStatusSuccessData$Deeplink implements l2r0 {
    private final String action;
    private final SetCardStatusSuccessData$ActionType actionType;
    private final String closeAction;

    public SetCardStatusSuccessData$Deeplink(@Json(name = "action_type") SetCardStatusSuccessData$ActionType setCardStatusSuccessData$ActionType, @Json(name = "action") String str, @Json(name = "close_action") String str2) {
        this.actionType = setCardStatusSuccessData$ActionType;
        this.action = str;
        this.closeAction = str2;
    }

    public static /* synthetic */ SetCardStatusSuccessData$Deeplink copy$default(SetCardStatusSuccessData$Deeplink setCardStatusSuccessData$Deeplink, SetCardStatusSuccessData$ActionType setCardStatusSuccessData$ActionType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            setCardStatusSuccessData$ActionType = setCardStatusSuccessData$Deeplink.actionType;
        }
        if ((i & 2) != 0) {
            str = setCardStatusSuccessData$Deeplink.action;
        }
        if ((i & 4) != 0) {
            str2 = setCardStatusSuccessData$Deeplink.closeAction;
        }
        return setCardStatusSuccessData$Deeplink.copy(setCardStatusSuccessData$ActionType, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final SetCardStatusSuccessData$ActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCloseAction() {
        return this.closeAction;
    }

    public final SetCardStatusSuccessData$Deeplink copy(@Json(name = "action_type") SetCardStatusSuccessData$ActionType actionType, @Json(name = "action") String action, @Json(name = "close_action") String closeAction) {
        return new SetCardStatusSuccessData$Deeplink(actionType, action, closeAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetCardStatusSuccessData$Deeplink)) {
            return false;
        }
        SetCardStatusSuccessData$Deeplink setCardStatusSuccessData$Deeplink = (SetCardStatusSuccessData$Deeplink) other;
        return this.actionType == setCardStatusSuccessData$Deeplink.actionType && jl40.l(this.action, setCardStatusSuccessData$Deeplink.action) && jl40.l(this.closeAction, setCardStatusSuccessData$Deeplink.closeAction);
    }

    public final String getAction() {
        return this.action;
    }

    public final SetCardStatusSuccessData$ActionType getActionType() {
        return this.actionType;
    }

    public String getCloseAction() {
        return this.closeAction;
    }

    public int hashCode() {
        int hashCode = this.actionType.hashCode() * 31;
        String str = this.action;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.closeAction;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        SetCardStatusSuccessData$ActionType setCardStatusSuccessData$ActionType = this.actionType;
        String str = this.action;
        String str2 = this.closeAction;
        StringBuilder sb = new StringBuilder("Deeplink(actionType=");
        sb.append(setCardStatusSuccessData$ActionType);
        sb.append(", action=");
        sb.append(str);
        sb.append(", closeAction=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
