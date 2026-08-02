package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.l2r0;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u000212BS\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\\\u0010\u001b\u001a\u00020\u001a2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b/\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b0\u0010\u0014¨\u00063"}, d2 = {"com/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState", "Ll2r0;", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "actionType", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$StateType;", "stateType", "", "title", "subtitle", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$ButtonData;", "primaryButton", "secondaryButton", "closeAction", "<init>", "(Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$StateType;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$ButtonData;Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$ButtonData;Ljava/lang/String;)V", "component1", "()Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "component2", "()Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$StateType;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$ButtonData;", "component6", "component7", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState;", "copy", "(Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$StateType;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$ButtonData;Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$ButtonData;Ljava/lang/String;)Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$ActionType;", "getActionType", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$StateType;", "getStateType", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$ButtonData;", "getPrimaryButton", "getSecondaryButton", "getCloseAction", "StateType", "ButtonData", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SetCardStatusSuccessData$SetResultState implements l2r0 {
    private final SetCardStatusSuccessData$ActionType actionType;
    private final String closeAction;
    private final ButtonData primaryButton;
    private final ButtonData secondaryButton;
    private final StateType stateType;
    private final String subtitle;
    private final String title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$ButtonData;", "", "title", "", "action", "startIcon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTitle", "()Ljava/lang/String;", "getAction", "getStartIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ButtonData {
        private final String action;
        private final Themes<String> startIcon;
        private final String title;

        public ButtonData(@Json(name = "title") String str, @Json(name = "action") String str2, @Json(name = "start_icon") Themes<String> themes) {
            this.title = str;
            this.action = str2;
            this.startIcon = themes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ButtonData copy$default(ButtonData buttonData, String str, String str2, Themes themes, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buttonData.title;
            }
            if ((i & 2) != 0) {
                str2 = buttonData.action;
            }
            if ((i & 4) != 0) {
                themes = buttonData.startIcon;
            }
            return buttonData.copy(str, str2, themes);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final Themes<String> component3() {
            return this.startIcon;
        }

        public final ButtonData copy(@Json(name = "title") String title, @Json(name = "action") String action, @Json(name = "start_icon") Themes<String> startIcon) {
            return new ButtonData(title, action, startIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonData)) {
                return false;
            }
            ButtonData buttonData = (ButtonData) other;
            return jl40.l(this.title, buttonData.title) && jl40.l(this.action, buttonData.action) && jl40.l(this.startIcon, buttonData.startIcon);
        }

        public final String getAction() {
            return this.action;
        }

        public final Themes<String> getStartIcon() {
            return this.startIcon;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b = unr0.b(this.title.hashCode() * 31, 31, this.action);
            Themes<String> themes = this.startIcon;
            return b + (themes == null ? 0 : themes.hashCode());
        }

        public String toString() {
            String str = this.title;
            String str2 = this.action;
            return smw0.l(b64.v("ButtonData(title=", str, ", action=", str2, ", startIcon="), this.startIcon, Extension.C_BRAKE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SetCardStatusSuccessData$SetResultState$StateType;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class StateType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ StateType[] $VALUES;

        @Json(name = "SUCCESS")
        public static final StateType SUCCESS = new StateType("SUCCESS", 0);

        @Json(name = "FAIL")
        public static final StateType FAIL = new StateType("FAIL", 1);

        private static final /* synthetic */ StateType[] $values() {
            return new StateType[]{SUCCESS, FAIL};
        }

        static {
            StateType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private StateType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static StateType valueOf(String str) {
            return (StateType) Enum.valueOf(StateType.class, str);
        }

        public static StateType[] values() {
            return (StateType[]) $VALUES.clone();
        }
    }

    public SetCardStatusSuccessData$SetResultState(@Json(name = "action_type") SetCardStatusSuccessData$ActionType setCardStatusSuccessData$ActionType, @Json(name = "state_type") StateType stateType, @Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "primary_button") ButtonData buttonData, @Json(name = "secondary_button") ButtonData buttonData2, @Json(name = "close_action") String str3) {
        this.actionType = setCardStatusSuccessData$ActionType;
        this.stateType = stateType;
        this.title = str;
        this.subtitle = str2;
        this.primaryButton = buttonData;
        this.secondaryButton = buttonData2;
        this.closeAction = str3;
    }

    public static /* synthetic */ SetCardStatusSuccessData$SetResultState copy$default(SetCardStatusSuccessData$SetResultState setCardStatusSuccessData$SetResultState, SetCardStatusSuccessData$ActionType setCardStatusSuccessData$ActionType, StateType stateType, String str, String str2, ButtonData buttonData, ButtonData buttonData2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            setCardStatusSuccessData$ActionType = setCardStatusSuccessData$SetResultState.actionType;
        }
        if ((i & 2) != 0) {
            stateType = setCardStatusSuccessData$SetResultState.stateType;
        }
        if ((i & 4) != 0) {
            str = setCardStatusSuccessData$SetResultState.title;
        }
        if ((i & 8) != 0) {
            str2 = setCardStatusSuccessData$SetResultState.subtitle;
        }
        if ((i & 16) != 0) {
            buttonData = setCardStatusSuccessData$SetResultState.primaryButton;
        }
        if ((i & 32) != 0) {
            buttonData2 = setCardStatusSuccessData$SetResultState.secondaryButton;
        }
        if ((i & 64) != 0) {
            str3 = setCardStatusSuccessData$SetResultState.closeAction;
        }
        ButtonData buttonData3 = buttonData2;
        String str4 = str3;
        ButtonData buttonData4 = buttonData;
        String str5 = str;
        return setCardStatusSuccessData$SetResultState.copy(setCardStatusSuccessData$ActionType, stateType, str5, str2, buttonData4, buttonData3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final SetCardStatusSuccessData$ActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component2, reason: from getter */
    public final StateType getStateType() {
        return this.stateType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonData getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonData getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCloseAction() {
        return this.closeAction;
    }

    public final SetCardStatusSuccessData$SetResultState copy(@Json(name = "action_type") SetCardStatusSuccessData$ActionType actionType, @Json(name = "state_type") StateType stateType, @Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "primary_button") ButtonData primaryButton, @Json(name = "secondary_button") ButtonData secondaryButton, @Json(name = "close_action") String closeAction) {
        return new SetCardStatusSuccessData$SetResultState(actionType, stateType, title, subtitle, primaryButton, secondaryButton, closeAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetCardStatusSuccessData$SetResultState)) {
            return false;
        }
        SetCardStatusSuccessData$SetResultState setCardStatusSuccessData$SetResultState = (SetCardStatusSuccessData$SetResultState) other;
        return this.actionType == setCardStatusSuccessData$SetResultState.actionType && this.stateType == setCardStatusSuccessData$SetResultState.stateType && jl40.l(this.title, setCardStatusSuccessData$SetResultState.title) && jl40.l(this.subtitle, setCardStatusSuccessData$SetResultState.subtitle) && jl40.l(this.primaryButton, setCardStatusSuccessData$SetResultState.primaryButton) && jl40.l(this.secondaryButton, setCardStatusSuccessData$SetResultState.secondaryButton) && jl40.l(this.closeAction, setCardStatusSuccessData$SetResultState.closeAction);
    }

    public final SetCardStatusSuccessData$ActionType getActionType() {
        return this.actionType;
    }

    public String getCloseAction() {
        return this.closeAction;
    }

    public final ButtonData getPrimaryButton() {
        return this.primaryButton;
    }

    public final ButtonData getSecondaryButton() {
        return this.secondaryButton;
    }

    public final StateType getStateType() {
        return this.stateType;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b((this.stateType.hashCode() + (this.actionType.hashCode() * 31)) * 31, 31, this.title), 31, this.subtitle);
        ButtonData buttonData = this.primaryButton;
        int hashCode = (b + (buttonData == null ? 0 : buttonData.hashCode())) * 31;
        ButtonData buttonData2 = this.secondaryButton;
        int hashCode2 = (hashCode + (buttonData2 == null ? 0 : buttonData2.hashCode())) * 31;
        String str = this.closeAction;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        SetCardStatusSuccessData$ActionType setCardStatusSuccessData$ActionType = this.actionType;
        StateType stateType = this.stateType;
        String str = this.title;
        String str2 = this.subtitle;
        ButtonData buttonData = this.primaryButton;
        ButtonData buttonData2 = this.secondaryButton;
        String str3 = this.closeAction;
        StringBuilder sb = new StringBuilder("SetResultState(actionType=");
        sb.append(setCardStatusSuccessData$ActionType);
        sb.append(", stateType=");
        sb.append(stateType);
        sb.append(", title=");
        g8e.D(sb, str, ", subtitle=", str2, ", primaryButton=");
        sb.append(buttonData);
        sb.append(", secondaryButton=");
        sb.append(buttonData2);
        sb.append(", closeAction=");
        return oyr.t(sb, str3, Extension.C_BRAKE);
    }
}
