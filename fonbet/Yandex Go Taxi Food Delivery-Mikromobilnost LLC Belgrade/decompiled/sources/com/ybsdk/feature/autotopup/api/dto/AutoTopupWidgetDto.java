package com.ybsdk.feature.autotopup.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003()*BS\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "payload", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$Payload;", "switchState", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$SwitchState;", "buttonState", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$ButtonState;", "themes", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "Lcom/ybsdk/feature/autotopup/api/dto/TopupWidgetTheme;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$Payload;Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$SwitchState;Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$ButtonState;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getPayload", "()Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$Payload;", "getSwitchState", "()Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$SwitchState;", "getButtonState", "()Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$ButtonState;", "getThemes", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Payload", "SwitchState", "ButtonState", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupWidgetDto {
    private final ButtonState buttonState;
    private final String description;
    private final Payload payload;
    private final SwitchState switchState;
    private final Themes<TopupWidgetTheme> themes;
    private final String title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$ButtonState;", "", "text", "", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonState {
        private final String action;
        private final String text;

        public ButtonState(@Json(name = "text") String str, @Json(name = "action") String str2) {
            this.text = str;
            this.action = str2;
        }

        public static /* synthetic */ ButtonState copy$default(ButtonState buttonState, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buttonState.text;
            }
            if ((i & 2) != 0) {
                str2 = buttonState.action;
            }
            return buttonState.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        public final ButtonState copy(@Json(name = "text") String text, @Json(name = "action") String action) {
            return new ButtonState(text, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonState)) {
                return false;
            }
            ButtonState buttonState = (ButtonState) other;
            return jl40.l(this.text, buttonState.text) && jl40.l(this.action, buttonState.action);
        }

        public final String getAction() {
            return this.action;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("ButtonState(text=", this.text, ", action=", this.action, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$Payload;", "", "autoTopupId", "", "type", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupType;", "agreementId", "paymentMethodInfo", "Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "threshold", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupType;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getAutoTopupId", "()Ljava/lang/String;", "getType", "()Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupType;", "getAgreementId", "getPaymentMethodInfo", "()Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getThreshold", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payload {
        private final String agreementId;
        private final String autoTopupId;
        private final Money money;
        private final PaymentMethodInfoDto paymentMethodInfo;
        private final Money threshold;
        private final AutoTopupType type;

        public Payload(@Json(name = "autotopup_id") String str, @Json(name = "type") AutoTopupType autoTopupType, @Json(name = "agreement_id") String str2, @Json(name = "payment_method_info") PaymentMethodInfoDto paymentMethodInfoDto, @Json(name = "money") Money money, @Json(name = "threshold") Money money2) {
            this.autoTopupId = str;
            this.type = autoTopupType;
            this.agreementId = str2;
            this.paymentMethodInfo = paymentMethodInfoDto;
            this.money = money;
            this.threshold = money2;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, String str, AutoTopupType autoTopupType, String str2, PaymentMethodInfoDto paymentMethodInfoDto, Money money, Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = payload.autoTopupId;
            }
            if ((i & 2) != 0) {
                autoTopupType = payload.type;
            }
            if ((i & 4) != 0) {
                str2 = payload.agreementId;
            }
            if ((i & 8) != 0) {
                paymentMethodInfoDto = payload.paymentMethodInfo;
            }
            if ((i & 16) != 0) {
                money = payload.money;
            }
            if ((i & 32) != 0) {
                money2 = payload.threshold;
            }
            Money money3 = money;
            Money money4 = money2;
            return payload.copy(str, autoTopupType, str2, paymentMethodInfoDto, money3, money4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAutoTopupId() {
            return this.autoTopupId;
        }

        /* renamed from: component2, reason: from getter */
        public final AutoTopupType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentMethodInfoDto getPaymentMethodInfo() {
            return this.paymentMethodInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final Money getMoney() {
            return this.money;
        }

        /* renamed from: component6, reason: from getter */
        public final Money getThreshold() {
            return this.threshold;
        }

        public final Payload copy(@Json(name = "autotopup_id") String autoTopupId, @Json(name = "type") AutoTopupType type, @Json(name = "agreement_id") String agreementId, @Json(name = "payment_method_info") PaymentMethodInfoDto paymentMethodInfo, @Json(name = "money") Money money, @Json(name = "threshold") Money threshold) {
            return new Payload(autoTopupId, type, agreementId, paymentMethodInfo, money, threshold);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return jl40.l(this.autoTopupId, payload.autoTopupId) && this.type == payload.type && jl40.l(this.agreementId, payload.agreementId) && jl40.l(this.paymentMethodInfo, payload.paymentMethodInfo) && jl40.l(this.money, payload.money) && jl40.l(this.threshold, payload.threshold);
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public final String getAutoTopupId() {
            return this.autoTopupId;
        }

        public final Money getMoney() {
            return this.money;
        }

        public final PaymentMethodInfoDto getPaymentMethodInfo() {
            return this.paymentMethodInfo;
        }

        public final Money getThreshold() {
            return this.threshold;
        }

        public final AutoTopupType getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.autoTopupId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            AutoTopupType autoTopupType = this.type;
            int hashCode2 = (hashCode + (autoTopupType == null ? 0 : autoTopupType.hashCode())) * 31;
            String str2 = this.agreementId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            PaymentMethodInfoDto paymentMethodInfoDto = this.paymentMethodInfo;
            int hashCode4 = (hashCode3 + (paymentMethodInfoDto == null ? 0 : paymentMethodInfoDto.hashCode())) * 31;
            Money money = this.money;
            int hashCode5 = (hashCode4 + (money == null ? 0 : money.hashCode())) * 31;
            Money money2 = this.threshold;
            return hashCode5 + (money2 != null ? money2.hashCode() : 0);
        }

        public String toString() {
            return "Payload(autoTopupId=" + this.autoTopupId + ", type=" + this.type + ", agreementId=" + this.agreementId + ", paymentMethodInfo=" + this.paymentMethodInfo + ", money=" + this.money + ", threshold=" + this.threshold + Extension.C_BRAKE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupWidgetDto$SwitchState;", "", "<init>", "(Ljava/lang/String;I)V", "ON", "OFF", "feature-autotopup-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SwitchState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SwitchState[] $VALUES;
        public static final SwitchState ON = new SwitchState("ON", 0);
        public static final SwitchState OFF = new SwitchState("OFF", 1);

        private static final /* synthetic */ SwitchState[] $values() {
            return new SwitchState[]{ON, OFF};
        }

        static {
            SwitchState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private SwitchState(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SwitchState valueOf(String str) {
            return (SwitchState) Enum.valueOf(SwitchState.class, str);
        }

        public static SwitchState[] values() {
            return (SwitchState[]) $VALUES.clone();
        }
    }

    public AutoTopupWidgetDto(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "payload") Payload payload, @Json(name = "switch") SwitchState switchState, @Json(name = "button") ButtonState buttonState, @Json(name = "themes") Themes<TopupWidgetTheme> themes) {
        this.title = str;
        this.description = str2;
        this.payload = payload;
        this.switchState = switchState;
        this.buttonState = buttonState;
        this.themes = themes;
    }

    public static /* synthetic */ AutoTopupWidgetDto copy$default(AutoTopupWidgetDto autoTopupWidgetDto, String str, String str2, Payload payload, SwitchState switchState, ButtonState buttonState, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTopupWidgetDto.title;
        }
        if ((i & 2) != 0) {
            str2 = autoTopupWidgetDto.description;
        }
        if ((i & 4) != 0) {
            payload = autoTopupWidgetDto.payload;
        }
        if ((i & 8) != 0) {
            switchState = autoTopupWidgetDto.switchState;
        }
        if ((i & 16) != 0) {
            buttonState = autoTopupWidgetDto.buttonState;
        }
        if ((i & 32) != 0) {
            themes = autoTopupWidgetDto.themes;
        }
        ButtonState buttonState2 = buttonState;
        Themes themes2 = themes;
        return autoTopupWidgetDto.copy(str, str2, payload, switchState, buttonState2, themes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final Payload getPayload() {
        return this.payload;
    }

    /* renamed from: component4, reason: from getter */
    public final SwitchState getSwitchState() {
        return this.switchState;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonState getButtonState() {
        return this.buttonState;
    }

    public final Themes<TopupWidgetTheme> component6() {
        return this.themes;
    }

    public final AutoTopupWidgetDto copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "payload") Payload payload, @Json(name = "switch") SwitchState switchState, @Json(name = "button") ButtonState buttonState, @Json(name = "themes") Themes<TopupWidgetTheme> themes) {
        return new AutoTopupWidgetDto(title, description, payload, switchState, buttonState, themes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupWidgetDto)) {
            return false;
        }
        AutoTopupWidgetDto autoTopupWidgetDto = (AutoTopupWidgetDto) other;
        return jl40.l(this.title, autoTopupWidgetDto.title) && jl40.l(this.description, autoTopupWidgetDto.description) && jl40.l(this.payload, autoTopupWidgetDto.payload) && this.switchState == autoTopupWidgetDto.switchState && jl40.l(this.buttonState, autoTopupWidgetDto.buttonState) && jl40.l(this.themes, autoTopupWidgetDto.themes);
    }

    public final ButtonState getButtonState() {
        return this.buttonState;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Payload getPayload() {
        return this.payload;
    }

    public final SwitchState getSwitchState() {
        return this.switchState;
    }

    public final Themes<TopupWidgetTheme> getThemes() {
        return this.themes;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Payload payload = this.payload;
        int hashCode3 = (hashCode2 + (payload == null ? 0 : payload.hashCode())) * 31;
        SwitchState switchState = this.switchState;
        int hashCode4 = (hashCode3 + (switchState == null ? 0 : switchState.hashCode())) * 31;
        ButtonState buttonState = this.buttonState;
        int hashCode5 = (hashCode4 + (buttonState == null ? 0 : buttonState.hashCode())) * 31;
        Themes<TopupWidgetTheme> themes = this.themes;
        return hashCode5 + (themes != null ? themes.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Payload payload = this.payload;
        SwitchState switchState = this.switchState;
        ButtonState buttonState = this.buttonState;
        Themes<TopupWidgetTheme> themes = this.themes;
        StringBuilder v = b64.v("AutoTopupWidgetDto(title=", str, ", description=", str2, ", payload=");
        v.append(payload);
        v.append(", switchState=");
        v.append(switchState);
        v.append(", buttonState=");
        v.append(buttonState);
        v.append(", themes=");
        v.append(themes);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
