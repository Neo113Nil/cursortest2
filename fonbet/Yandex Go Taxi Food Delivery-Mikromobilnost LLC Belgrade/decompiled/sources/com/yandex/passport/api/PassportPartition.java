package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.evu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.unr0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006$"}, d2 = {"Lcom/yandex/passport/api/PassportPartition;", "Landroid/os/Parcelable;", "", "value", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel-impl", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "writeToParcel", "describeContents-impl", "(Ljava/lang/String;)I", "describeContents", "toString-impl", "toString", "hashCode-impl", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "isEmpty-impl", "(Ljava/lang/String;)Z", "isEmpty", "Companion", "com/yandex/passport/api/q1", "com/yandex/passport/api/p1", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportPartition implements Parcelable {
    private final String value;
    public static final q1 Companion = new q1();
    public static final Parcelable.Creator<PassportPartition> CREATOR = new Creator();
    private static final String DEFAULT = m232constructorimpl("default");
    private static final String EMPTY_STRING = "_!EMPTY#_";
    private static final String EMPTY = m232constructorimpl(EMPTY_STRING);
    private static final String YANGO = m232constructorimpl("yango");
    private static final String YANGO_ISRAEL = m232constructorimpl("yango-israel");
    private static final String YANGO_FRANCE = m232constructorimpl("yango-france");
    private static final String YANGO_NORWAY = m232constructorimpl("yango-norway");
    private static final String DELIVERY_CLUB = m232constructorimpl("delivery-club");
    private static final String TOLOKA = m232constructorimpl("toloka");
    private static final String METEUM = m232constructorimpl("meteum");

    private /* synthetic */ PassportPartition(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PassportPartition m231boximpl(String str) {
        return new PassportPartition(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m232constructorimpl(String str) {
        if (!evu0.J(str)) {
            return str;
        }
        ny61.r("Blank partitions are not allowed");
        return null;
    }

    /* renamed from: describeContents-impl, reason: not valid java name */
    public static final int m233describeContentsimpl(String str) {
        return 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m234equalsimpl(String str, Object obj) {
        return (obj instanceof PassportPartition) && jl40.l(str, ((PassportPartition) obj).m240unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m235equalsimpl0(String str, String str2) {
        return jl40.l(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m236hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m237isEmptyimpl(String str) {
        return jl40.l(str, EMPTY_STRING);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m238toStringimpl(String str) {
        return unr0.l(')', "PassportPartition(value=", str);
    }

    /* renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m239writeToParcelimpl(String str, Parcel parcel, int i) {
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m233describeContentsimpl(this.value);
    }

    public boolean equals(Object obj) {
        return m234equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m236hashCodeimpl(this.value);
    }

    public String toString() {
        return m238toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m240unboximpl() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m239writeToParcelimpl(this.value, parcel, i);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PassportPartition> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PassportPartition createFromParcel(Parcel parcel) {
            return PassportPartition.m231boximpl(m241createFromParcelKKcZdI(parcel));
        }

        /* renamed from: createFromParcel-KK-cZdI, reason: not valid java name */
        public final String m241createFromParcelKKcZdI(Parcel parcel) {
            return PassportPartition.m232constructorimpl(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PassportPartition[] newArray(int i) {
            return new PassportPartition[i];
        }
    }
}
