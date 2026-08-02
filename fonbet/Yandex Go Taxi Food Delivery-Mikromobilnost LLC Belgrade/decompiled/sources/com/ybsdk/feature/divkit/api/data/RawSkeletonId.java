package com.ybsdk.feature.divkit.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/feature/divkit/api/data/RawSkeletonId;", "Landroid/os/Parcelable;", "", "value", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel-impl", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "writeToParcel", "describeContents-impl", "(Ljava/lang/String;)I", "describeContents", "toString-impl", "toString", "hashCode-impl", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RawSkeletonId implements Parcelable {
    public static final Parcelable.Creator<RawSkeletonId> CREATOR = new Creator();
    private final String value;

    private /* synthetic */ RawSkeletonId(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ RawSkeletonId m431boximpl(String str) {
        return new RawSkeletonId(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m432constructorimpl(String str) {
        return str;
    }

    /* renamed from: describeContents-impl, reason: not valid java name */
    public static final int m433describeContentsimpl(String str) {
        return 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m434equalsimpl(String str, Object obj) {
        return (obj instanceof RawSkeletonId) && jl40.l(str, ((RawSkeletonId) obj).m439unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m435equalsimpl0(String str, String str2) {
        return jl40.l(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m436hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m437toStringimpl(String str) {
        return oyr.p("RawSkeletonId(value=", str, Extension.C_BRAKE);
    }

    /* renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m438writeToParcelimpl(String str, Parcel parcel, int i) {
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m433describeContentsimpl(this.value);
    }

    public boolean equals(Object obj) {
        return m434equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m436hashCodeimpl(this.value);
    }

    public String toString() {
        return m437toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m439unboximpl() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m438writeToParcelimpl(this.value, parcel, i);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<RawSkeletonId> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ RawSkeletonId createFromParcel(Parcel parcel) {
            return RawSkeletonId.m431boximpl(m440createFromParcelKoqVNRo(parcel));
        }

        /* renamed from: createFromParcel-KoqVNRo, reason: not valid java name */
        public final String m440createFromParcelKoqVNRo(Parcel parcel) {
            return RawSkeletonId.m432constructorimpl(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RawSkeletonId[] newArray(int i) {
            return new RawSkeletonId[i];
        }
    }
}
