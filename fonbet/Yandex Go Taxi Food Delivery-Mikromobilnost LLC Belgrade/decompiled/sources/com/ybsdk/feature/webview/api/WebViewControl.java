package com.ybsdk.feature.webview.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.utils.ColorModel;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ln41;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014¨\u0006'"}, d2 = {"Lcom/ybsdk/feature/webview/api/WebViewControl;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/webview/api/WebViewControl$Type;", "type", "Lcom/ybsdk/core/utils/ColorModel;", "color", "<init>", "(Lcom/ybsdk/feature/webview/api/WebViewControl$Type;Lcom/ybsdk/core/utils/ColorModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/webview/api/WebViewControl$Type;", "component2", "()Lcom/ybsdk/core/utils/ColorModel;", "copy", "(Lcom/ybsdk/feature/webview/api/WebViewControl$Type;Lcom/ybsdk/core/utils/ColorModel;)Lcom/ybsdk/feature/webview/api/WebViewControl;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/webview/api/WebViewControl$Type;", "getType", "Lcom/ybsdk/core/utils/ColorModel;", "getColor", "Companion", "Type", "ln41", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WebViewControl implements Parcelable {
    private final ColorModel color;
    private final Type type;
    public static final ln41 Companion = new ln41();
    public static final Parcelable.Creator<WebViewControl> CREATOR = new Creator();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/webview/api/WebViewControl$Type;", "", "<init>", "(Ljava/lang/String;I)V", "CROSS", "ARROW", "feature-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CROSS = new Type("CROSS", 0);
        public static final Type ARROW = new Type("ARROW", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{CROSS, ARROW};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WebViewControl(Type type, ColorModel colorModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, colorModel);
        if ((i & 2) != 0) {
            Companion.getClass();
            colorModel = ln41.a();
        }
    }

    public static /* synthetic */ WebViewControl copy$default(WebViewControl webViewControl, Type type, ColorModel colorModel, int i, Object obj) {
        if ((i & 1) != 0) {
            type = webViewControl.type;
        }
        if ((i & 2) != 0) {
            colorModel = webViewControl.color;
        }
        return webViewControl.copy(type, colorModel);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorModel getColor() {
        return this.color;
    }

    public final WebViewControl copy(Type type, ColorModel color) {
        return new WebViewControl(type, color);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewControl)) {
            return false;
        }
        WebViewControl webViewControl = (WebViewControl) other;
        return this.type == webViewControl.type && jl40.l(this.color, webViewControl.color);
    }

    public final ColorModel getColor() {
        return this.color;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return this.color.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "WebViewControl(type=" + this.type + ", color=" + this.color + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type.name());
        dest.writeParcelable(this.color, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WebViewControl> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebViewControl createFromParcel(Parcel parcel) {
            return new WebViewControl(Type.valueOf(parcel.readString()), (ColorModel) parcel.readParcelable(WebViewControl.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WebViewControl[] newArray(int i) {
            return new WebViewControl[i];
        }
    }

    public WebViewControl(Type type, ColorModel colorModel) {
        this.type = type;
        this.color = colorModel;
    }
}
