package com.yandex.passport.common.resources;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001+B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000f\u001a\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u001d\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0005J\u001a\u0010!\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010\bR\u0011\u0010)\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b'\u0010(\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006,"}, d2 = {"Lcom/yandex/passport/common/resources/StringResource;", "Landroid/os/Parcelable;", "", "resId", "constructor-impl", "(I)I", "", "get-impl", "(I)Ljava/lang/String;", "get", "", "", "formatArgs", "getFormatted-impl", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getFormatted", "toString-impl", "toString", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel-impl", "(ILandroid/os/Parcel;I)V", "writeToParcel", "describeContents-impl", "describeContents", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", CA20Status.STATUS_USER_I, "getResId", "()I", "getString-impl", "string", "isValidResource-impl", "(I)Z", "isValidResource", "Companion", "com/yandex/passport/common/resources/b", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StringResource implements Parcelable {
    private static final int NO_RESOURCE = -1;
    private final int resId;
    public static final b Companion = new b();
    public static final Parcelable.Creator<StringResource> CREATOR = new Creator();

    private /* synthetic */ StringResource(int i) {
        this.resId = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StringResource m276boximpl(int i) {
        return new StringResource(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m277constructorimpl(int i) {
        return i;
    }

    /* renamed from: describeContents-impl, reason: not valid java name */
    public static final int m278describeContentsimpl(int i) {
        return 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m279equalsimpl(int i, Object obj) {
        return (obj instanceof StringResource) && i == ((StringResource) obj).m288unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m280equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final String m281getimpl(int i) {
        return i == -1 ? "" : com.yandex.passport.common.util.a.b().getResources().getString(i);
    }

    /* renamed from: getFormatted-impl, reason: not valid java name */
    public static final String m282getFormattedimpl(int i, Object... objArr) {
        return i == -1 ? "" : com.yandex.passport.common.util.a.b().getResources().getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: getString-impl, reason: not valid java name */
    public static final String m283getStringimpl(int i) {
        return m286toStringimpl(i);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m284hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: isValidResource-impl, reason: not valid java name */
    public static final boolean m285isValidResourceimpl(int i) {
        return i > 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m286toStringimpl(int i) {
        return m281getimpl(i);
    }

    /* renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m287writeToParcelimpl(int i, Parcel parcel, int i2) {
        parcel.writeInt(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m278describeContentsimpl(this.resId);
    }

    public boolean equals(Object obj) {
        return m279equalsimpl(this.resId, obj);
    }

    public final int getResId() {
        return this.resId;
    }

    public int hashCode() {
        return m284hashCodeimpl(this.resId);
    }

    public String toString() {
        return m286toStringimpl(this.resId);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m288unboximpl() {
        return this.resId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m287writeToParcelimpl(this.resId, parcel, i);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StringResource> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ StringResource createFromParcel(Parcel parcel) {
            return StringResource.m276boximpl(m289createFromParcelMX5SFvc(parcel));
        }

        /* renamed from: createFromParcel-MX5SFvc, reason: not valid java name */
        public final int m289createFromParcelMX5SFvc(Parcel parcel) {
            return StringResource.m277constructorimpl(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StringResource[] newArray(int i) {
            return new StringResource[i];
        }
    }
}
