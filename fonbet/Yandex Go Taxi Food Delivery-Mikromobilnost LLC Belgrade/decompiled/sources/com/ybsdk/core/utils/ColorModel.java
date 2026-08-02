package com.ybsdk.core.utils;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.rje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/core/utils/ColorModel;", "Landroid/os/Parcelable;", "get", "", "context", "Landroid/content/Context;", "Attr", "Hex", "Raw", "LateInitColor", "Lcom/ybsdk/core/utils/ColorModel$Attr;", "Lcom/ybsdk/core/utils/ColorModel$Hex;", "Lcom/ybsdk/core/utils/ColorModel$LateInitColor;", "Lcom/ybsdk/core/utils/ColorModel$Raw;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ColorModel extends Parcelable {
    int get(Context context);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lcom/ybsdk/core/utils/ColorModel$Attr;", "Lcom/ybsdk/core/utils/ColorModel;", "", "attr", "<init>", "(I)V", "Landroid/content/Context;", "context", "get", "(Landroid/content/Context;)I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "copy", "(I)Lcom/ybsdk/core/utils/ColorModel$Attr;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getAttr", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Attr implements ColorModel {
        public static final Parcelable.Creator<Attr> CREATOR = new Creator();
        private final int attr;

        public Attr(int i) {
            this.attr = i;
        }

        public static /* synthetic */ Attr copy$default(Attr attr, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = attr.attr;
            }
            return attr.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAttr() {
            return this.attr;
        }

        public final Attr copy(int attr) {
            return new Attr(attr);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Attr) && this.attr == ((Attr) other).attr;
        }

        @Override // com.ybsdk.core.utils.ColorModel
        public int get(Context context) {
            return rje.a(context, this.attr);
        }

        public final int getAttr() {
            return this.attr;
        }

        public int hashCode() {
            return Integer.hashCode(this.attr);
        }

        public String toString() {
            return oyr.j(this.attr, "Attr(attr=", Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.attr);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attr> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attr createFromParcel(Parcel parcel) {
                return new Attr(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attr[] newArray(int i) {
                return new Attr[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011¨\u0006\""}, d2 = {"Lcom/ybsdk/core/utils/ColorModel$Hex;", "Lcom/ybsdk/core/utils/ColorModel;", "", "color", "<init>", "(I)V", "Landroid/content/Context;", "context", "get", "(Landroid/content/Context;)I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "copy", "(I)Lcom/ybsdk/core/utils/ColorModel$Hex;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getColor", "Companion", "com/ybsdk/core/utils/b", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Hex implements ColorModel {
        private final int color;
        public static final b Companion = new b();
        public static final Parcelable.Creator<Hex> CREATOR = new Creator();

        public Hex(int i) {
            this.color = i;
        }

        public static /* synthetic */ Hex copy$default(Hex hex, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = hex.color;
            }
            return hex.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        public final Hex copy(int color) {
            return new Hex(color);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Hex) && this.color == ((Hex) other).color;
        }

        @Override // com.ybsdk.core.utils.ColorModel
        public int get(Context context) {
            return this.color;
        }

        public final int getColor() {
            return this.color;
        }

        public int hashCode() {
            return Integer.hashCode(this.color);
        }

        public String toString() {
            return oyr.j(this.color, "Hex(color=", Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.color);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Hex> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Hex createFromParcel(Parcel parcel) {
                return new Hex(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Hex[] newArray(int i) {
                return new Hex[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ybsdk/core/utils/ColorModel$LateInitColor;", "Lcom/ybsdk/core/utils/ColorModel;", "Lcom/ybsdk/core/utils/ColorModel$LateInitColor$LateInitColorCallback;", "initCallback", "<init>", "(Lcom/ybsdk/core/utils/ColorModel$LateInitColor$LateInitColorCallback;)V", "Landroid/content/Context;", "context", "", "get", "(Landroid/content/Context;)I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/ColorModel$LateInitColor$LateInitColorCallback;", "copy", "(Lcom/ybsdk/core/utils/ColorModel$LateInitColor$LateInitColorCallback;)Lcom/ybsdk/core/utils/ColorModel$LateInitColor;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/ColorModel$LateInitColor$LateInitColorCallback;", "getInitCallback", "LateInitColorCallback", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LateInitColor implements ColorModel {
        public static final Parcelable.Creator<LateInitColor> CREATOR = new Creator();
        private final LateInitColorCallback initCallback;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/utils/ColorModel$LateInitColor$LateInitColorCallback;", "Landroid/os/Parcelable;", "get", "", "context", "Landroid/content/Context;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface LateInitColorCallback extends Parcelable {
            int get(Context context);
        }

        public LateInitColor(LateInitColorCallback lateInitColorCallback) {
            this.initCallback = lateInitColorCallback;
        }

        public static /* synthetic */ LateInitColor copy$default(LateInitColor lateInitColor, LateInitColorCallback lateInitColorCallback, int i, Object obj) {
            if ((i & 1) != 0) {
                lateInitColorCallback = lateInitColor.initCallback;
            }
            return lateInitColor.copy(lateInitColorCallback);
        }

        /* renamed from: component1, reason: from getter */
        public final LateInitColorCallback getInitCallback() {
            return this.initCallback;
        }

        public final LateInitColor copy(LateInitColorCallback initCallback) {
            return new LateInitColor(initCallback);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LateInitColor) && jl40.l(this.initCallback, ((LateInitColor) other).initCallback);
        }

        @Override // com.ybsdk.core.utils.ColorModel
        public int get(Context context) {
            return this.initCallback.get(context);
        }

        public final LateInitColorCallback getInitCallback() {
            return this.initCallback;
        }

        public int hashCode() {
            return this.initCallback.hashCode();
        }

        public String toString() {
            return "LateInitColor(initCallback=" + this.initCallback + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.initCallback, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LateInitColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LateInitColor createFromParcel(Parcel parcel) {
                return new LateInitColor((LateInitColorCallback) parcel.readParcelable(LateInitColor.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LateInitColor[] newArray(int i) {
                return new LateInitColor[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011¨\u0006 "}, d2 = {"Lcom/ybsdk/core/utils/ColorModel$Raw;", "Lcom/ybsdk/core/utils/ColorModel;", "", "value", "<init>", "(I)V", "Landroid/content/Context;", "context", "get", "(Landroid/content/Context;)I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "copy", "(I)Lcom/ybsdk/core/utils/ColorModel$Raw;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getValue", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Raw implements ColorModel {
        public static final Parcelable.Creator<Raw> CREATOR = new Creator();
        private final int value;

        public Raw(int i) {
            this.value = i;
        }

        public static /* synthetic */ Raw copy$default(Raw raw, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = raw.value;
            }
            return raw.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final Raw copy(int value) {
            return new Raw(value);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Raw) && this.value == ((Raw) other).value;
        }

        @Override // com.ybsdk.core.utils.ColorModel
        public int get(Context context) {
            return this.value;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return oyr.j(this.value, "Raw(value=", Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.value);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Raw> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Raw createFromParcel(Parcel parcel) {
                return new Raw(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Raw[] newArray(int i) {
                return new Raw[i];
            }
        }
    }
}
