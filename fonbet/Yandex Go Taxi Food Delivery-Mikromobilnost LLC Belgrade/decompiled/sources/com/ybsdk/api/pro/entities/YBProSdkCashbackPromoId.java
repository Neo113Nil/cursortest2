package com.ybsdk.api.pro.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/api/pro/entities/YBProSdkCashbackPromoId;", "Landroid/os/Parcelable;", "", "id", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString-impl", "toString", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel-impl", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "writeToParcel", "describeContents-impl", "(Ljava/lang/String;)I", "describeContents", "hashCode-impl", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBProSdkCashbackPromoId implements Parcelable {
    public static final Parcelable.Creator<YBProSdkCashbackPromoId> CREATOR = new Creator();
    private final String id;

    private /* synthetic */ YBProSdkCashbackPromoId(String str) {
        this.id = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ YBProSdkCashbackPromoId m353boximpl(String str) {
        return new YBProSdkCashbackPromoId(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m354constructorimpl(String str) {
        return str;
    }

    /* renamed from: describeContents-impl, reason: not valid java name */
    public static final int m355describeContentsimpl(String str) {
        return 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m356equalsimpl(String str, Object obj) {
        return (obj instanceof YBProSdkCashbackPromoId) && jl40.l(str, ((YBProSdkCashbackPromoId) obj).getId());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m357equalsimpl0(String str, String str2) {
        return jl40.l(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m358hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m359toStringimpl(String str) {
        return str;
    }

    /* renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m360writeToParcelimpl(String str, Parcel parcel, int i) {
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m355describeContentsimpl(this.id);
    }

    public boolean equals(Object obj) {
        return m356equalsimpl(this.id, obj);
    }

    public int hashCode() {
        return m358hashCodeimpl(this.id);
    }

    public String toString() {
        return m359toStringimpl(this.id);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m360writeToParcelimpl(this.id, parcel, i);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<YBProSdkCashbackPromoId> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ YBProSdkCashbackPromoId createFromParcel(Parcel parcel) {
            return YBProSdkCashbackPromoId.m353boximpl(m362createFromParcel2_XGi1c(parcel));
        }

        /* renamed from: createFromParcel-2_XGi1c, reason: not valid java name */
        public final String m362createFromParcel2_XGi1c(Parcel parcel) {
            return YBProSdkCashbackPromoId.m354constructorimpl(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBProSdkCashbackPromoId[] newArray(int i) {
            return new YBProSdkCashbackPromoId[i];
        }
    }
}
