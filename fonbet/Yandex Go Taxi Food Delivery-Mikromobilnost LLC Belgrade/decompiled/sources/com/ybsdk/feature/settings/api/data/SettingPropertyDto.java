package com.ybsdk.feature.settings.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J<\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto;", "", "type", "Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto$Type;", "booleanValue", "", "action", "", "analyticAction", "<init>", "(Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto$Type;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto$Type;", "getBooleanValue", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Ljava/lang/String;", "getAnalyticAction", "component1", "component2", "component3", "component4", "copy", "(Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto$Type;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto;", "equals", "other", "hashCode", "", "toString", "Type", "feature-settings-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SettingPropertyDto {
    private final String action;
    private final String analyticAction;
    private final Boolean booleanValue;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto$Type;", "", "<init>", "(Ljava/lang/String;I)V", "SWITCH", "GOTO", "EDIT", "SOON", "UNKNOWN", JCP.RAW_PREFIX, "feature-settings-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type SWITCH = new Type("SWITCH", 0);
        public static final Type GOTO = new Type("GOTO", 1);
        public static final Type EDIT = new Type("EDIT", 2);
        public static final Type SOON = new Type("SOON", 3);
        public static final Type UNKNOWN = new Type("UNKNOWN", 4);
        public static final Type NONE = new Type(JCP.RAW_PREFIX, 5);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SWITCH, GOTO, EDIT, SOON, UNKNOWN, NONE};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Type(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public SettingPropertyDto(@Json(name = "type") Type type, @Json(name = "boolean_value") Boolean bool, @Json(name = "action") String str, @Json(name = "analytic_action") String str2) {
        this.type = type;
        this.booleanValue = bool;
        this.action = str;
        this.analyticAction = str2;
    }

    public static /* synthetic */ SettingPropertyDto copy$default(SettingPropertyDto settingPropertyDto, Type type, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            type = settingPropertyDto.type;
        }
        if ((i & 2) != 0) {
            bool = settingPropertyDto.booleanValue;
        }
        if ((i & 4) != 0) {
            str = settingPropertyDto.action;
        }
        if ((i & 8) != 0) {
            str2 = settingPropertyDto.analyticAction;
        }
        return settingPropertyDto.copy(type, bool, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAnalyticAction() {
        return this.analyticAction;
    }

    public final SettingPropertyDto copy(@Json(name = "type") Type type, @Json(name = "boolean_value") Boolean booleanValue, @Json(name = "action") String action, @Json(name = "analytic_action") String analyticAction) {
        return new SettingPropertyDto(type, booleanValue, action, analyticAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingPropertyDto)) {
            return false;
        }
        SettingPropertyDto settingPropertyDto = (SettingPropertyDto) other;
        return this.type == settingPropertyDto.type && jl40.l(this.booleanValue, settingPropertyDto.booleanValue) && jl40.l(this.action, settingPropertyDto.action) && jl40.l(this.analyticAction, settingPropertyDto.analyticAction);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAnalyticAction() {
        return this.analyticAction;
    }

    public final Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Boolean bool = this.booleanValue;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.action;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticAction;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Type type = this.type;
        Boolean bool = this.booleanValue;
        String str = this.action;
        String str2 = this.analyticAction;
        StringBuilder sb = new StringBuilder("SettingPropertyDto(type=");
        sb.append(type);
        sb.append(", booleanValue=");
        sb.append(bool);
        sb.append(", action=");
        return g8e.r(sb, str, ", analyticAction=", str2, Extension.C_BRAKE);
    }
}
