package com.yandex.passport.common.core;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.unr0;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006 "}, d2 = {"Lcom/yandex/passport/common/core/Partition;", "Landroid/os/Parcelable;", "", "value", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel-impl", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "writeToParcel", "describeContents-impl", "(Ljava/lang/String;)I", "describeContents", "toString-impl", "toString", "hashCode-impl", "hashCode", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "com/yandex/passport/common/core/b", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Partition implements Parcelable {
    private static final String EMPTY;
    private static final List<Partition> EMPTY_LIST;
    private static final String EMPTY_STRING = "_!EMPTY#_";
    private final String value;
    public static final b Companion = new b();
    public static final Parcelable.Creator<Partition> CREATOR = new Creator();
    private static final String DEFAULT = m250constructorimpl("default");

    static {
        String m250constructorimpl = m250constructorimpl(EMPTY_STRING);
        EMPTY = m250constructorimpl;
        EMPTY_LIST = Collections.singletonList(m249boximpl(m250constructorimpl));
    }

    private /* synthetic */ Partition(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Partition m249boximpl(String str) {
        return new Partition(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m250constructorimpl(String str) {
        return str;
    }

    /* renamed from: describeContents-impl, reason: not valid java name */
    public static final int m251describeContentsimpl(String str) {
        return 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m252equalsimpl(String str, Object obj) {
        return (obj instanceof Partition) && jl40.l(str, ((Partition) obj).m257unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m253equalsimpl0(String str, String str2) {
        return jl40.l(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m254hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m255toStringimpl(String str) {
        return unr0.l(')', "Partition(value=", str);
    }

    /* renamed from: writeToParcel-impl, reason: not valid java name */
    public static final void m256writeToParcelimpl(String str, Parcel parcel, int i) {
        parcel.writeString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return m251describeContentsimpl(this.value);
    }

    public boolean equals(Object obj) {
        return m252equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m254hashCodeimpl(this.value);
    }

    public String toString() {
        return m255toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m257unboximpl() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        m256writeToParcelimpl(this.value, parcel, i);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Partition> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Partition createFromParcel(Parcel parcel) {
            return Partition.m249boximpl(m258createFromParcele4JGZUc(parcel));
        }

        /* renamed from: createFromParcel-e4JGZUc, reason: not valid java name */
        public final String m258createFromParcele4JGZUc(Parcel parcel) {
            return Partition.m250constructorimpl(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Partition[] newArray(int i) {
            return new Partition[i];
        }
    }
}
