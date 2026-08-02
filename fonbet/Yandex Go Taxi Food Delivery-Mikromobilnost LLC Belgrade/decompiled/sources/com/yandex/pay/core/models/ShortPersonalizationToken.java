package com.yandex.pay.core.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001e"}, d2 = {"Lcom/yandex/pay/core/models/ShortPersonalizationToken;", "Landroid/os/Parcelable;", "", "value", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel-impl", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "writeToParcel", "describeContents-impl", "(Ljava/lang/String;)I", "describeContents", "toString-impl", "toString", "hashCode-impl", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShortPersonalizationToken implements Parcelable {
    public static final Parcelable.Creator<ShortPersonalizationToken> CREATOR = new Creator();
    private final String value;

    private /* synthetic */ ShortPersonalizationToken(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ShortPersonalizationToken m325boximpl(String str) {
        return new ShortPersonalizationToken(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m326constructorimpl(String str) {
        return str;
    }

    /* renamed from: describeContents-impl, reason: not valid java name */
    public static final int m327describeContentsimpl(String str) {
        return 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m328equalsimpl(String str, Object obj) {
        return (obj instanceof ShortPersonalizationToken) && jl40.l(str, ((ShortPersonalizationToken) obj).m333unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m329equalsimpl0(String str, String str2) {
        return jl40.l(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m330hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m331toStringimpl(String str) {
        return oyr.p("ShortPersonalizationToken(value=", str, Extension.C_BRAKE);
    }

    /* renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m332writeToParcelimpl(String str, Parcel parcel, int i) {
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m327describeContentsimpl(this.value);
    }

    public boolean equals(Object obj) {
        return m328equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m330hashCodeimpl(this.value);
    }

    public String toString() {
        return m331toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m333unboximpl() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m332writeToParcelimpl(this.value, parcel, i);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShortPersonalizationToken> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ShortPersonalizationToken createFromParcel(Parcel parcel) {
            return ShortPersonalizationToken.m325boximpl(m334createFromParcelMiTdBWA(parcel));
        }

        /* renamed from: createFromParcel-MiTdBWA, reason: not valid java name */
        public final String m334createFromParcelMiTdBWA(Parcel parcel) {
            return ShortPersonalizationToken.m326constructorimpl(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShortPersonalizationToken[] newArray(int i) {
            return new ShortPersonalizationToken[i];
        }
    }
}
