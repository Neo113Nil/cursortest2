package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.oyr;
import defpackage.uc20;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\u0002J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/api/ProgressSize;", "Landroid/os/Parcelable;", "Lcom/yandex/passport/api/n3;", "toSize", "()Lcom/yandex/passport/api/n3;", "Default", "WrapContent", "FullSize", "Custom", "Lcom/yandex/passport/api/ProgressSize$Custom;", "Lcom/yandex/passport/api/ProgressSize$Default;", "Lcom/yandex/passport/api/ProgressSize$FullSize;", "Lcom/yandex/passport/api/ProgressSize$WrapContent;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ProgressSize extends Parcelable {
    n3 toSize();

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lcom/yandex/passport/api/ProgressSize$Custom;", "Lcom/yandex/passport/api/ProgressSize;", "", "widthPx", "heightPx", "<init>", "(II)V", "Lcom/yandex/passport/api/n3;", "toSize", "()Lcom/yandex/passport/api/n3;", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "component2", "copy", "(II)Lcom/yandex/passport/api/ProgressSize$Custom;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getWidthPx", "getHeightPx", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class Custom implements ProgressSize {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Custom> CREATOR = new Creator();
        private final int heightPx;
        private final int widthPx;

        public Custom(int i, int i2) {
            this.widthPx = i;
            this.heightPx = i2;
        }

        public static /* synthetic */ Custom copy$default(Custom custom, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = custom.widthPx;
            }
            if ((i3 & 2) != 0) {
                i2 = custom.heightPx;
            }
            return custom.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidthPx() {
            return this.widthPx;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeightPx() {
            return this.heightPx;
        }

        public final Custom copy(int widthPx, int heightPx) {
            return new Custom(widthPx, heightPx);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return this.widthPx == custom.widthPx && this.heightPx == custom.heightPx;
        }

        public final int getHeightPx() {
            return this.heightPx;
        }

        public final int getWidthPx() {
            return this.widthPx;
        }

        public int hashCode() {
            return Integer.hashCode(this.heightPx) + (Integer.hashCode(this.widthPx) * 31);
        }

        @Override // com.yandex.passport.api.ProgressSize
        public n3 toSize() {
            return new n3(this.widthPx, this.heightPx);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Custom(widthPx=");
            sb.append(this.widthPx);
            sb.append(", heightPx=");
            return oyr.s(sb, this.heightPx, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.widthPx);
            dest.writeInt(this.heightPx);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Custom> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                return new Custom(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i) {
                return new Custom[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/passport/api/ProgressSize$Default;", "Lcom/yandex/passport/api/ProgressSize;", "<init>", "()V", "Lcom/yandex/passport/api/n3;", "toSize", "()Lcom/yandex/passport/api/n3;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements ProgressSize {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();
        public static final Parcelable.Creator<Default> CREATOR = new Creator();

        private Default() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.yandex.passport.api.ProgressSize
        public n3 toSize() {
            return new n3((int) (uc20.a().density * 50.0f), (int) (50.0f * uc20.a().density));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Default> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Default.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/passport/api/ProgressSize$FullSize;", "Lcom/yandex/passport/api/ProgressSize;", "<init>", "()V", "Lcom/yandex/passport/api/n3;", "toSize", "()Lcom/yandex/passport/api/n3;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class FullSize implements ProgressSize {
        public static final int $stable = 0;
        public static final FullSize INSTANCE = new FullSize();
        public static final Parcelable.Creator<FullSize> CREATOR = new Creator();

        private FullSize() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.yandex.passport.api.ProgressSize
        public n3 toSize() {
            return new n3(-1, -1);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FullSize> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullSize createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FullSize.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FullSize[] newArray(int i) {
                return new FullSize[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/passport/api/ProgressSize$WrapContent;", "Lcom/yandex/passport/api/ProgressSize;", "<init>", "()V", "Lcom/yandex/passport/api/n3;", "toSize", "()Lcom/yandex/passport/api/n3;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class WrapContent implements ProgressSize {
        public static final int $stable = 0;
        public static final WrapContent INSTANCE = new WrapContent();
        public static final Parcelable.Creator<WrapContent> CREATOR = new Creator();

        private WrapContent() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.yandex.passport.api.ProgressSize
        public n3 toSize() {
            return new n3(-2, -2);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WrapContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WrapContent createFromParcel(Parcel parcel) {
                parcel.readInt();
                return WrapContent.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WrapContent[] newArray(int i) {
                return new WrapContent[i];
            }
        }
    }
}
