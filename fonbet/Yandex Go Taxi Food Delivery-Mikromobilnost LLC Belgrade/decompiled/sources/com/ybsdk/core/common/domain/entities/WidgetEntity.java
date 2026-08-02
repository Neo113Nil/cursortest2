package com.ybsdk.core.common.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0005ABCDEBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010*Jj\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010\"J\u0010\u0010/\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b/\u0010\u001eJ\u001a\u00102\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b;\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b@\u0010*¨\u0006F"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/WidgetEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Condition;", "condition", "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Button;", "button", "action", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;", "type", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;", "darkTheme", "lightTheme", "<init>", "(Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Condition;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Button;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;)V", "Ljava/math/BigDecimal;", "amount", "", "matchesAmount", "(Ljava/math/BigDecimal;)Z", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Condition;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Button;", "component5", "component6", "()Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;", "component7", "()Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;", "component8", "copy", "(Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Condition;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Button;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;)Lcom/ybsdk/core/common/domain/entities/WidgetEntity;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Condition;", "getCondition", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Button;", "getButton", "getAction", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;", "getType", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;", "getDarkTheme", "getLightTheme", "Condition", PlusPayUiKitInflaterFactory.NAME_BUTTON, "Theme", "Image", "Type", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WidgetEntity implements Parcelable {
    public static final Parcelable.Creator<WidgetEntity> CREATOR = new Creator();
    private final String action;
    private final Button button;
    private final Condition condition;
    private final Theme darkTheme;
    private final String description;
    private final Theme lightTheme;
    private final String title;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Type;", "", "<init>", "(Ljava/lang/String;I)V", "LIMIT", "INFO", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type LIMIT = new Type("LIMIT", 0);
        public static final Type INFO = new Type("INFO", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{LIMIT, INFO};
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

    public WidgetEntity(Condition condition, String str, String str2, Button button, String str3, Type type, Theme theme, Theme theme2) {
        this.condition = condition;
        this.title = str;
        this.description = str2;
        this.button = button;
        this.action = str3;
        this.type = type;
        this.darkTheme = theme;
        this.lightTheme = theme2;
    }

    public static /* synthetic */ WidgetEntity copy$default(WidgetEntity widgetEntity, Condition condition, String str, String str2, Button button, String str3, Type type, Theme theme, Theme theme2, int i, Object obj) {
        if ((i & 1) != 0) {
            condition = widgetEntity.condition;
        }
        if ((i & 2) != 0) {
            str = widgetEntity.title;
        }
        if ((i & 4) != 0) {
            str2 = widgetEntity.description;
        }
        if ((i & 8) != 0) {
            button = widgetEntity.button;
        }
        if ((i & 16) != 0) {
            str3 = widgetEntity.action;
        }
        if ((i & 32) != 0) {
            type = widgetEntity.type;
        }
        if ((i & 64) != 0) {
            theme = widgetEntity.darkTheme;
        }
        if ((i & 128) != 0) {
            theme2 = widgetEntity.lightTheme;
        }
        Theme theme3 = theme;
        Theme theme4 = theme2;
        String str4 = str3;
        Type type2 = type;
        return widgetEntity.copy(condition, str, str2, button, str4, type2, theme3, theme4);
    }

    /* renamed from: component1, reason: from getter */
    public final Condition getCondition() {
        return this.condition;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final Theme getDarkTheme() {
        return this.darkTheme;
    }

    /* renamed from: component8, reason: from getter */
    public final Theme getLightTheme() {
        return this.lightTheme;
    }

    public final WidgetEntity copy(Condition condition, String title, String description, Button button, String action, Type type, Theme darkTheme, Theme lightTheme) {
        return new WidgetEntity(condition, title, description, button, action, type, darkTheme, lightTheme);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetEntity)) {
            return false;
        }
        WidgetEntity widgetEntity = (WidgetEntity) other;
        return jl40.l(this.condition, widgetEntity.condition) && jl40.l(this.title, widgetEntity.title) && jl40.l(this.description, widgetEntity.description) && jl40.l(this.button, widgetEntity.button) && jl40.l(this.action, widgetEntity.action) && this.type == widgetEntity.type && jl40.l(this.darkTheme, widgetEntity.darkTheme) && jl40.l(this.lightTheme, widgetEntity.lightTheme);
    }

    public final String getAction() {
        return this.action;
    }

    public final Button getButton() {
        return this.button;
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final Theme getDarkTheme() {
        return this.darkTheme;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Theme getLightTheme() {
        return this.lightTheme;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int b = unr0.b(this.condition.hashCode() * 31, 31, this.title);
        String str = this.description;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Button button = this.button;
        int hashCode2 = (hashCode + (button == null ? 0 : button.hashCode())) * 31;
        String str2 = this.action;
        int hashCode3 = (this.type.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Theme theme = this.darkTheme;
        int hashCode4 = (hashCode3 + (theme == null ? 0 : theme.hashCode())) * 31;
        Theme theme2 = this.lightTheme;
        return hashCode4 + (theme2 != null ? theme2.hashCode() : 0);
    }

    public final boolean matchesAmount(BigDecimal amount) {
        BigDecimal amount2;
        BigDecimal amount3;
        MoneyEntity lowerLimit = this.condition.getLowerLimit();
        if (lowerLimit != null && (amount3 = lowerLimit.getAmount()) != null && amount3.compareTo(amount) >= 0) {
            return false;
        }
        MoneyEntity upperLimit = this.condition.getUpperLimit();
        return upperLimit == null || (amount2 = upperLimit.getAmount()) == null || amount2.compareTo(amount) >= 0;
    }

    public String toString() {
        return "WidgetEntity(condition=" + this.condition + ", title=" + this.title + ", description=" + this.description + ", button=" + this.button + ", action=" + this.action + ", type=" + this.type + ", darkTheme=" + this.darkTheme + ", lightTheme=" + this.lightTheme + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.condition.writeToParcel(dest, flags);
        dest.writeString(this.title);
        dest.writeString(this.description);
        Button button = this.button;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, flags);
        }
        dest.writeString(this.action);
        dest.writeString(this.type.name());
        Theme theme = this.darkTheme;
        if (theme == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            theme.writeToParcel(dest, flags);
        }
        Theme theme2 = this.lightTheme;
        if (theme2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            theme2.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Button;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Button;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {
        public static final Parcelable.Creator<Button> CREATOR = new Creator();
        private final String text;

        public Button(String str) {
            this.text = str;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = button.text;
            }
            return button.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Button copy(String text) {
            return new Button(text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Button) && jl40.l(this.text, ((Button) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return oyr.p("Button(text=", this.text, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.text);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i) {
                return new Button[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Condition;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "lowerLimit", "upperLimit", "<init>", "(Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component2", "copy", "(Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;)Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Condition;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getLowerLimit", "getUpperLimit", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Condition implements Parcelable {
        public static final Parcelable.Creator<Condition> CREATOR = new Creator();
        private final MoneyEntity lowerLimit;
        private final MoneyEntity upperLimit;

        public Condition(MoneyEntity moneyEntity, MoneyEntity moneyEntity2) {
            this.lowerLimit = moneyEntity;
            this.upperLimit = moneyEntity2;
        }

        public static /* synthetic */ Condition copy$default(Condition condition, MoneyEntity moneyEntity, MoneyEntity moneyEntity2, int i, Object obj) {
            if ((i & 1) != 0) {
                moneyEntity = condition.lowerLimit;
            }
            if ((i & 2) != 0) {
                moneyEntity2 = condition.upperLimit;
            }
            return condition.copy(moneyEntity, moneyEntity2);
        }

        /* renamed from: component1, reason: from getter */
        public final MoneyEntity getLowerLimit() {
            return this.lowerLimit;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyEntity getUpperLimit() {
            return this.upperLimit;
        }

        public final Condition copy(MoneyEntity lowerLimit, MoneyEntity upperLimit) {
            return new Condition(lowerLimit, upperLimit);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Condition)) {
                return false;
            }
            Condition condition = (Condition) other;
            return jl40.l(this.lowerLimit, condition.lowerLimit) && jl40.l(this.upperLimit, condition.upperLimit);
        }

        public final MoneyEntity getLowerLimit() {
            return this.lowerLimit;
        }

        public final MoneyEntity getUpperLimit() {
            return this.upperLimit;
        }

        public int hashCode() {
            MoneyEntity moneyEntity = this.lowerLimit;
            int hashCode = (moneyEntity == null ? 0 : moneyEntity.hashCode()) * 31;
            MoneyEntity moneyEntity2 = this.upperLimit;
            return hashCode + (moneyEntity2 != null ? moneyEntity2.hashCode() : 0);
        }

        public String toString() {
            return "Condition(lowerLimit=" + this.lowerLimit + ", upperLimit=" + this.upperLimit + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            MoneyEntity moneyEntity = this.lowerLimit;
            if (moneyEntity == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                moneyEntity.writeToParcel(dest, flags);
            }
            MoneyEntity moneyEntity2 = this.upperLimit;
            if (moneyEntity2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                moneyEntity2.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Condition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Condition createFromParcel(Parcel parcel) {
                return new Condition(parcel.readInt() == 0 ? null : MoneyEntity.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MoneyEntity.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Condition[] newArray(int i) {
                return new Condition[i];
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image$Type;", "type", "", "url", "<init>", "(Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image$Type;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image$Type;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image$Type;Ljava/lang/String;)Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image$Type;", "getType", "Ljava/lang/String;", "getUrl", "Type", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image implements Parcelable {
        public static final Parcelable.Creator<Image> CREATOR = new Creator();
        private final Type type;
        private final String url;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image$Type;", "", "<init>", "(Ljava/lang/String;I)V", "TITLE", "BACKGROUND", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type TITLE = new Type("TITLE", 0);
            public static final Type BACKGROUND = new Type("BACKGROUND", 1);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{TITLE, BACKGROUND};
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

        public Image(Type type, String str) {
            this.type = type;
            this.url = str;
        }

        public static /* synthetic */ Image copy$default(Image image, Type type, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                type = image.type;
            }
            if ((i & 2) != 0) {
                str = image.url;
            }
            return image.copy(type, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Image copy(Type type, String url) {
            return new Image(type, url);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return this.type == image.type && jl40.l(this.url, image.url);
        }

        public final Type getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return "Image(type=" + this.type + ", url=" + this.url + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.type.name());
            dest.writeString(this.url);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                return new Image(Type.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i) {
                return new Image[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001e¨\u00061"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;", "Landroid/os/Parcelable;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "titleTextColor", "descTextColor", "delimiterColor", "buttonBackgroundColor", "buttonTextColor", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image;)Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Theme;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getTitleTextColor", "getDescTextColor", "getDelimiterColor", "getButtonBackgroundColor", "getButtonTextColor", "Lcom/ybsdk/core/common/domain/entities/WidgetEntity$Image;", "getImage", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Theme implements Parcelable {
        public static final Parcelable.Creator<Theme> CREATOR = new Creator();
        private final String backgroundColor;
        private final String buttonBackgroundColor;
        private final String buttonTextColor;
        private final String delimiterColor;
        private final String descTextColor;
        private final Image image;
        private final String titleTextColor;

        public Theme(String str, String str2, String str3, String str4, String str5, String str6, Image image) {
            this.backgroundColor = str;
            this.titleTextColor = str2;
            this.descTextColor = str3;
            this.delimiterColor = str4;
            this.buttonBackgroundColor = str5;
            this.buttonTextColor = str6;
            this.image = image;
        }

        public static /* synthetic */ Theme copy$default(Theme theme, String str, String str2, String str3, String str4, String str5, String str6, Image image, int i, Object obj) {
            if ((i & 1) != 0) {
                str = theme.backgroundColor;
            }
            if ((i & 2) != 0) {
                str2 = theme.titleTextColor;
            }
            if ((i & 4) != 0) {
                str3 = theme.descTextColor;
            }
            if ((i & 8) != 0) {
                str4 = theme.delimiterColor;
            }
            if ((i & 16) != 0) {
                str5 = theme.buttonBackgroundColor;
            }
            if ((i & 32) != 0) {
                str6 = theme.buttonTextColor;
            }
            if ((i & 64) != 0) {
                image = theme.image;
            }
            String str7 = str6;
            Image image2 = image;
            String str8 = str5;
            String str9 = str3;
            return theme.copy(str, str2, str9, str4, str8, str7, image2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitleTextColor() {
            return this.titleTextColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDescTextColor() {
            return this.descTextColor;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDelimiterColor() {
            return this.delimiterColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getButtonBackgroundColor() {
            return this.buttonBackgroundColor;
        }

        /* renamed from: component6, reason: from getter */
        public final String getButtonTextColor() {
            return this.buttonTextColor;
        }

        /* renamed from: component7, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        public final Theme copy(String backgroundColor, String titleTextColor, String descTextColor, String delimiterColor, String buttonBackgroundColor, String buttonTextColor, Image image) {
            return new Theme(backgroundColor, titleTextColor, descTextColor, delimiterColor, buttonBackgroundColor, buttonTextColor, image);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Theme)) {
                return false;
            }
            Theme theme = (Theme) other;
            return jl40.l(this.backgroundColor, theme.backgroundColor) && jl40.l(this.titleTextColor, theme.titleTextColor) && jl40.l(this.descTextColor, theme.descTextColor) && jl40.l(this.delimiterColor, theme.delimiterColor) && jl40.l(this.buttonBackgroundColor, theme.buttonBackgroundColor) && jl40.l(this.buttonTextColor, theme.buttonTextColor) && jl40.l(this.image, theme.image);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getButtonBackgroundColor() {
            return this.buttonBackgroundColor;
        }

        public final String getButtonTextColor() {
            return this.buttonTextColor;
        }

        public final String getDelimiterColor() {
            return this.delimiterColor;
        }

        public final String getDescTextColor() {
            return this.descTextColor;
        }

        public final Image getImage() {
            return this.image;
        }

        public final String getTitleTextColor() {
            return this.titleTextColor;
        }

        public int hashCode() {
            int b = unr0.b(this.backgroundColor.hashCode() * 31, 31, this.titleTextColor);
            String str = this.descTextColor;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.delimiterColor;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonBackgroundColor;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonTextColor;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Image image = this.image;
            return hashCode4 + (image != null ? image.hashCode() : 0);
        }

        public String toString() {
            String str = this.backgroundColor;
            String str2 = this.titleTextColor;
            String str3 = this.descTextColor;
            String str4 = this.delimiterColor;
            String str5 = this.buttonBackgroundColor;
            String str6 = this.buttonTextColor;
            Image image = this.image;
            StringBuilder v = b64.v("Theme(backgroundColor=", str, ", titleTextColor=", str2, ", descTextColor=");
            g8e.D(v, str3, ", delimiterColor=", str4, ", buttonBackgroundColor=");
            g8e.D(v, str5, ", buttonTextColor=", str6, ", image=");
            v.append(image);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.backgroundColor);
            dest.writeString(this.titleTextColor);
            dest.writeString(this.descTextColor);
            dest.writeString(this.delimiterColor);
            dest.writeString(this.buttonBackgroundColor);
            dest.writeString(this.buttonTextColor);
            Image image = this.image;
            if (image == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                image.writeToParcel(dest, flags);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Theme> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Theme createFromParcel(Parcel parcel) {
                return new Theme(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Theme[] newArray(int i) {
                return new Theme[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WidgetEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WidgetEntity createFromParcel(Parcel parcel) {
            return new WidgetEntity(Condition.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readString(), Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Theme.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Theme.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WidgetEntity[] newArray(int i) {
            return new WidgetEntity[i];
        }
    }
}
