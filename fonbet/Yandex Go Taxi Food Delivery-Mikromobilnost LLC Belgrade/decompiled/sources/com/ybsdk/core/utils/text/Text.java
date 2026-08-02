package com.ybsdk.core.utils.text;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import defpackage.vfc;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/utils/text/Text;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Empty", "Constant", "Resource", "Plural", "Formatted", "Join", "WithHtmlLink", "com/ybsdk/core/utils/text/b", "Lcom/ybsdk/core/utils/text/Text$Constant;", "Lcom/ybsdk/core/utils/text/Text$Empty;", "Lcom/ybsdk/core/utils/text/Text$Formatted;", "Lcom/ybsdk/core/utils/text/Text$Join;", "Lcom/ybsdk/core/utils/text/Text$Plural;", "Lcom/ybsdk/core/utils/text/Text$Resource;", "Lcom/ybsdk/core/utils/text/Text$WithHtmlLink;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Text implements Parcelable {
    public static final b Companion = new b();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B\u001f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006$"}, d2 = {"Lcom/ybsdk/core/utils/text/Text$Formatted;", "Lcom/ybsdk/core/utils/text/Text;", "", "stringResId", "", "Lcom/ybsdk/core/utils/text/Text$Formatted$Arg;", "args", "<init>", "(ILjava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/ybsdk/core/utils/text/Text$Formatted;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getStringResId", "Ljava/util/List;", "getArgs", "Arg", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class Formatted extends Text {
        public static final Parcelable.Creator<Formatted> CREATOR = new Creator();
        private final List<Arg> args;
        private final int stringResId;

        /* JADX WARN: Multi-variable type inference failed */
        public Formatted(int i, List<? extends Arg> list) {
            super(null);
            this.stringResId = i;
            this.args = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Formatted copy$default(Formatted formatted, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = formatted.stringResId;
            }
            if ((i2 & 2) != 0) {
                list = formatted.args;
            }
            return formatted.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStringResId() {
            return this.stringResId;
        }

        public final List<Arg> component2() {
            return this.args;
        }

        public final Formatted copy(int stringResId, List<? extends Arg> args) {
            return new Formatted(stringResId, args);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Formatted)) {
                return false;
            }
            Formatted formatted = (Formatted) other;
            return this.stringResId == formatted.stringResId && jl40.l(this.args, formatted.args);
        }

        public final List<Arg> getArgs() {
            return this.args;
        }

        public final int getStringResId() {
            return this.stringResId;
        }

        public int hashCode() {
            return this.args.hashCode() + (Integer.hashCode(this.stringResId) * 31);
        }

        public String toString() {
            return "Formatted(stringResId=" + this.stringResId + ", args=" + this.args + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.stringResId);
            Iterator t = vfc.t(dest, this.args);
            while (t.hasNext()) {
                dest.writeParcelable((Parcelable) t.next(), flags);
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/core/utils/text/Text$Formatted$Arg;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "IntArg", "StringArg", "TextArg", "com/ybsdk/core/utils/text/c", "Lcom/ybsdk/core/utils/text/Text$Formatted$Arg$IntArg;", "Lcom/ybsdk/core/utils/text/Text$Formatted$Arg$StringArg;", "Lcom/ybsdk/core/utils/text/Text$Formatted$Arg$TextArg;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class Arg implements Parcelable {
            public static final c Companion = new c();

            public /* synthetic */ Arg(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/utils/text/Text$Formatted$Arg$IntArg;", "Lcom/ybsdk/core/utils/text/Text$Formatted$Arg;", "", "arg", "<init>", "(I)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "copy", "(I)Lcom/ybsdk/core/utils/text/Text$Formatted$Arg$IntArg;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getArg", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class IntArg extends Arg {
                public static final Parcelable.Creator<IntArg> CREATOR = new Creator();
                private final int arg;

                public IntArg(int i) {
                    super(null);
                    this.arg = i;
                }

                public static /* synthetic */ IntArg copy$default(IntArg intArg, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = intArg.arg;
                    }
                    return intArg.copy(i);
                }

                /* renamed from: component1, reason: from getter */
                public final int getArg() {
                    return this.arg;
                }

                public final IntArg copy(int arg) {
                    return new IntArg(arg);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof IntArg) && this.arg == ((IntArg) other).arg;
                }

                public final int getArg() {
                    return this.arg;
                }

                public int hashCode() {
                    return Integer.hashCode(this.arg);
                }

                public String toString() {
                    return oyr.j(this.arg, "IntArg(arg=", Extension.C_BRAKE);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(this.arg);
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<IntArg> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final IntArg createFromParcel(Parcel parcel) {
                        return new IntArg(parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final IntArg[] newArray(int i) {
                        return new IntArg[i];
                    }
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/utils/text/Text$Formatted$Arg$StringArg;", "Lcom/ybsdk/core/utils/text/Text$Formatted$Arg;", "", "arg", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/core/utils/text/Text$Formatted$Arg$StringArg;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArg", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class StringArg extends Arg {
                public static final Parcelable.Creator<StringArg> CREATOR = new Creator();
                private final String arg;

                public StringArg(String str) {
                    super(null);
                    this.arg = str;
                }

                public static /* synthetic */ StringArg copy$default(StringArg stringArg, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = stringArg.arg;
                    }
                    return stringArg.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getArg() {
                    return this.arg;
                }

                public final StringArg copy(String arg) {
                    return new StringArg(arg);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof StringArg) && jl40.l(this.arg, ((StringArg) other).arg);
                }

                public final String getArg() {
                    return this.arg;
                }

                public int hashCode() {
                    return this.arg.hashCode();
                }

                public String toString() {
                    return oyr.p("StringArg(arg=", this.arg, Extension.C_BRAKE);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.arg);
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<StringArg> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final StringArg createFromParcel(Parcel parcel) {
                        return new StringArg(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final StringArg[] newArray(int i) {
                        return new StringArg[i];
                    }
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/core/utils/text/Text$Formatted$Arg$TextArg;", "Lcom/ybsdk/core/utils/text/Text$Formatted$Arg;", "Lcom/ybsdk/core/utils/text/Text;", "arg", "<init>", "(Lcom/ybsdk/core/utils/text/Text;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "copy", "(Lcom/ybsdk/core/utils/text/Text;)Lcom/ybsdk/core/utils/text/Text$Formatted$Arg$TextArg;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getArg", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class TextArg extends Arg {
                public static final Parcelable.Creator<TextArg> CREATOR = new Creator();
                private final Text arg;

                public TextArg(Text text) {
                    super(null);
                    this.arg = text;
                }

                public static /* synthetic */ TextArg copy$default(TextArg textArg, Text text, int i, Object obj) {
                    if ((i & 1) != 0) {
                        text = textArg.arg;
                    }
                    return textArg.copy(text);
                }

                /* renamed from: component1, reason: from getter */
                public final Text getArg() {
                    return this.arg;
                }

                public final TextArg copy(Text arg) {
                    return new TextArg(arg);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TextArg) && jl40.l(this.arg, ((TextArg) other).arg);
                }

                public final Text getArg() {
                    return this.arg;
                }

                public int hashCode() {
                    return this.arg.hashCode();
                }

                public String toString() {
                    return "TextArg(arg=" + this.arg + Extension.C_BRAKE;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.writeParcelable(this.arg, flags);
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<TextArg> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final TextArg createFromParcel(Parcel parcel) {
                        return new TextArg((Text) parcel.readParcelable(TextArg.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final TextArg[] newArray(int i) {
                        return new TextArg[i];
                    }
                }
            }

            private Arg() {
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Formatted> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Formatted createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = vfc.e(Formatted.class, parcel, arrayList, i, 1);
                }
                return new Formatted(readInt, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Formatted[] newArray(int i) {
                return new Formatted[i];
            }
        }
    }

    public /* synthetic */ Text(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/core/utils/text/Text$Constant;", "Lcom/ybsdk/core/utils/text/Text;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/CharSequence;", "copy", "(Ljava/lang/CharSequence;)Lcom/ybsdk/core/utils/text/Text$Constant;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "getText", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Constant extends Text {
        public static final Parcelable.Creator<Constant> CREATOR = new Creator();
        private final CharSequence text;

        public Constant(CharSequence charSequence) {
            super(null);
            this.text = charSequence;
        }

        public static /* synthetic */ Constant copy$default(Constant constant, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = constant.text;
            }
            return constant.copy(charSequence);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        public final Constant copy(CharSequence text) {
            return new Constant(text);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Constant) && jl40.l(this.text, ((Constant) other).text);
        }

        public final CharSequence getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return b64.h(this.text, "Constant(text=", Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            TextUtils.writeToParcel(this.text, dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Constant> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Constant createFromParcel(Parcel parcel) {
                return new Constant((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Constant[] newArray(int i) {
                return new Constant[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/core/utils/text/Text$Empty;", "Lcom/ybsdk/core/utils/text/Text;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Empty extends Text {
        public static final Empty INSTANCE = new Empty();
        public static final Parcelable.Creator<Empty> CREATOR = new Creator();

        private Empty() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Empty> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Empty createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Empty.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Empty[] newArray(int i) {
                return new Empty[i];
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/core/utils/text/Text$Join;", "Lcom/ybsdk/core/utils/text/Text;", "", "texts", "", "separator", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/ybsdk/core/utils/text/Text$Join;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTexts", "Ljava/lang/String;", "getSeparator", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class Join extends Text {
        public static final Parcelable.Creator<Join> CREATOR = new Creator();
        private final String separator;
        private final List<Text> texts;

        /* JADX WARN: Multi-variable type inference failed */
        public Join(List<? extends Text> list, String str) {
            super(null);
            this.texts = list;
            this.separator = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Join copy$default(Join join, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = join.texts;
            }
            if ((i & 2) != 0) {
                str = join.separator;
            }
            return join.copy(list, str);
        }

        public final List<Text> component1() {
            return this.texts;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSeparator() {
            return this.separator;
        }

        public final Join copy(List<? extends Text> texts, String separator) {
            return new Join(texts, separator);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Join)) {
                return false;
            }
            Join join = (Join) other;
            return jl40.l(this.texts, join.texts) && jl40.l(this.separator, join.separator);
        }

        public final String getSeparator() {
            return this.separator;
        }

        public final List<Text> getTexts() {
            return this.texts;
        }

        public int hashCode() {
            return this.separator.hashCode() + (this.texts.hashCode() * 31);
        }

        public String toString() {
            return xvz.i("Join(texts=", ", separator=", this.separator, Extension.C_BRAKE, this.texts);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator t = vfc.t(dest, this.texts);
            while (t.hasNext()) {
                dest.writeParcelable((Parcelable) t.next(), flags);
            }
            dest.writeString(this.separator);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Join> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Join createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = vfc.e(Join.class, parcel, arrayList, i, 1);
                }
                return new Join(arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Join[] newArray(int i) {
                return new Join[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/core/utils/text/Text$Plural;", "Lcom/ybsdk/core/utils/text/Text;", "", "pluralsResId", "quantity", "<init>", "(II)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "copy", "(II)Lcom/ybsdk/core/utils/text/Text$Plural;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getPluralsResId", "getQuantity", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class Plural extends Text {
        public static final Parcelable.Creator<Plural> CREATOR = new Creator();
        private final int pluralsResId;
        private final int quantity;

        public Plural(int i, int i2) {
            super(null);
            this.pluralsResId = i;
            this.quantity = i2;
        }

        public static /* synthetic */ Plural copy$default(Plural plural, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = plural.pluralsResId;
            }
            if ((i3 & 2) != 0) {
                i2 = plural.quantity;
            }
            return plural.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPluralsResId() {
            return this.pluralsResId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }

        public final Plural copy(int pluralsResId, int quantity) {
            return new Plural(pluralsResId, quantity);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plural)) {
                return false;
            }
            Plural plural = (Plural) other;
            return this.pluralsResId == plural.pluralsResId && this.quantity == plural.quantity;
        }

        public final int getPluralsResId() {
            return this.pluralsResId;
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public int hashCode() {
            return Integer.hashCode(this.quantity) + (Integer.hashCode(this.pluralsResId) * 31);
        }

        public String toString() {
            return b64.d(this.pluralsResId, this.quantity, "Plural(pluralsResId=", ", quantity=", Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.pluralsResId);
            dest.writeInt(this.quantity);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Plural> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Plural createFromParcel(Parcel parcel) {
                return new Plural(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Plural[] newArray(int i) {
                return new Plural[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/core/utils/text/Text$Resource;", "Lcom/ybsdk/core/utils/text/Text;", "", "stringResId", "<init>", "(I)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "copy", "(I)Lcom/ybsdk/core/utils/text/Text$Resource;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getStringResId", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Resource extends Text {
        public static final Parcelable.Creator<Resource> CREATOR = new Creator();
        private final int stringResId;

        public Resource(int i) {
            super(null);
            this.stringResId = i;
        }

        public static /* synthetic */ Resource copy$default(Resource resource, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = resource.stringResId;
            }
            return resource.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStringResId() {
            return this.stringResId;
        }

        public final Resource copy(int stringResId) {
            return new Resource(stringResId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Resource) && this.stringResId == ((Resource) other).stringResId;
        }

        public final int getStringResId() {
            return this.stringResId;
        }

        public int hashCode() {
            return Integer.hashCode(this.stringResId);
        }

        public String toString() {
            return oyr.j(this.stringResId, "Resource(stringResId=", Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.stringResId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Resource> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Resource createFromParcel(Parcel parcel) {
                return new Resource(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Resource[] newArray(int i) {
                return new Resource[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J.\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006$"}, d2 = {"Lcom/ybsdk/core/utils/text/Text$WithHtmlLink;", "Lcom/ybsdk/core/utils/text/Text;", "origin", "textToLink", "", "link", "<init>", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/utils/text/Text;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Ljava/lang/String;)Lcom/ybsdk/core/utils/text/Text$WithHtmlLink;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/utils/text/Text;", "getOrigin", "getTextToLink", "Ljava/lang/String;", "getLink", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class WithHtmlLink extends Text {
        public static final Parcelable.Creator<WithHtmlLink> CREATOR = new Creator();
        private final String link;
        private final Text origin;
        private final Text textToLink;

        public WithHtmlLink(Text text, Text text2, String str) {
            super(null);
            this.origin = text;
            this.textToLink = text2;
            this.link = str;
        }

        public static /* synthetic */ WithHtmlLink copy$default(WithHtmlLink withHtmlLink, Text text, Text text2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                text = withHtmlLink.origin;
            }
            if ((i & 2) != 0) {
                text2 = withHtmlLink.textToLink;
            }
            if ((i & 4) != 0) {
                str = withHtmlLink.link;
            }
            return withHtmlLink.copy(text, text2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Text getOrigin() {
            return this.origin;
        }

        /* renamed from: component2, reason: from getter */
        public final Text getTextToLink() {
            return this.textToLink;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        public final WithHtmlLink copy(Text origin, Text textToLink, String link) {
            return new WithHtmlLink(origin, textToLink, link);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WithHtmlLink)) {
                return false;
            }
            WithHtmlLink withHtmlLink = (WithHtmlLink) other;
            return jl40.l(this.origin, withHtmlLink.origin) && jl40.l(this.textToLink, withHtmlLink.textToLink) && jl40.l(this.link, withHtmlLink.link);
        }

        public final String getLink() {
            return this.link;
        }

        public final Text getOrigin() {
            return this.origin;
        }

        public final Text getTextToLink() {
            return this.textToLink;
        }

        public int hashCode() {
            return this.link.hashCode() + n.c(this.textToLink, this.origin.hashCode() * 31, 31);
        }

        public String toString() {
            Text text = this.origin;
            Text text2 = this.textToLink;
            return oyr.t(n.p("WithHtmlLink(origin=", text, ", textToLink=", text2, ", link="), this.link, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.origin, flags);
            dest.writeParcelable(this.textToLink, flags);
            dest.writeString(this.link);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WithHtmlLink> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithHtmlLink createFromParcel(Parcel parcel) {
                return new WithHtmlLink((Text) parcel.readParcelable(WithHtmlLink.class.getClassLoader()), (Text) parcel.readParcelable(WithHtmlLink.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithHtmlLink[] newArray(int i) {
                return new WithHtmlLink[i];
            }
        }
    }

    private Text() {
    }
}
