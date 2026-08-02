package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.common.resources.DrawableResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/api/AccountListBranding;", "Landroid/os/Parcelable;", "Yandex", "Custom", "Lcom/yandex/passport/api/AccountListBranding$Custom;", "Lcom/yandex/passport/api/AccountListBranding$Yandex;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface AccountListBranding extends Parcelable {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/yandex/passport/api/AccountListBranding$Custom;", "Lcom/yandex/passport/api/AccountListBranding;", "Lcom/yandex/passport/common/resources/DrawableResource;", "resource", "<init>", "(ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1-lwcMDYM", "component1", "copy-Y4JcNrc", "(I)Lcom/yandex/passport/api/AccountListBranding$Custom;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getResource-lwcMDYM", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Custom implements AccountListBranding {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Custom> CREATOR = new Creator();
        private final int resource;

        private Custom(int i) {
            this.resource = i;
        }

        /* renamed from: copy-Y4JcNrc$default, reason: not valid java name */
        public static /* synthetic */ Custom m227copyY4JcNrc$default(Custom custom, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = custom.resource;
            }
            return custom.m229copyY4JcNrc(i);
        }

        /* renamed from: component1-lwcMDYM, reason: not valid java name and from getter */
        public final int getResource() {
            return this.resource;
        }

        /* renamed from: copy-Y4JcNrc, reason: not valid java name */
        public final Custom m229copyY4JcNrc(int resource) {
            return new Custom(resource, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Custom) && DrawableResource.m269equalsimpl0(this.resource, ((Custom) other).resource);
        }

        /* renamed from: getResource-lwcMDYM, reason: not valid java name */
        public final int m230getResourcelwcMDYM() {
            return this.resource;
        }

        public int hashCode() {
            return DrawableResource.m271hashCodeimpl(this.resource);
        }

        public String toString() {
            return "Custom(resource=" + ((Object) DrawableResource.m272toStringimpl(this.resource)) + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(DrawableResource.m264boximpl(this.resource), flags);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Custom> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                return new Custom(((DrawableResource) parcel.readParcelable(Custom.class.getClassLoader())).m274unboximpl(), null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i) {
                return new Custom[i];
            }
        }

        public /* synthetic */ Custom(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/passport/api/AccountListBranding$Yandex;", "Lcom/yandex/passport/api/AccountListBranding;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Yandex implements AccountListBranding {
        public static final int $stable = 0;
        public static final Yandex INSTANCE = new Yandex();
        public static final Parcelable.Creator<Yandex> CREATOR = new Creator();

        private Yandex() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Yandex> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Yandex createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Yandex.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Yandex[] newArray(int i) {
                return new Yandex[i];
            }
        }
    }
}
