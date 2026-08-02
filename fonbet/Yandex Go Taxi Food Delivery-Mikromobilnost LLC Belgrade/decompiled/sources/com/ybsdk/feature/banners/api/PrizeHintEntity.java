package com.ybsdk.feature.banners.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/banners/api/PrizeHintEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/banners/api/PrizeHintId;", "prizeHintId", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1-kyR0wrU", "()Ljava/lang/String;", "component1", "component2", "copy-9-6W-4E", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/banners/api/PrizeHintEntity;", "copy", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPrizeHintId-kyR0wrU", "getText", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PrizeHintEntity implements Parcelable {
    public static final Parcelable.Creator<PrizeHintEntity> CREATOR = new Creator();
    private final String prizeHintId;
    private final String text;

    private PrizeHintEntity(String str, String str2) {
        this.prizeHintId = str;
        this.text = str2;
    }

    /* renamed from: copy-9-6W-4E$default, reason: not valid java name */
    public static /* synthetic */ PrizeHintEntity m363copy96W4E$default(PrizeHintEntity prizeHintEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prizeHintEntity.prizeHintId;
        }
        if ((i & 2) != 0) {
            str2 = prizeHintEntity.text;
        }
        return prizeHintEntity.m365copy96W4E(str, str2);
    }

    /* renamed from: component1-kyR0wrU, reason: not valid java name and from getter */
    public final String getPrizeHintId() {
        return this.prizeHintId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: copy-9-6W-4E, reason: not valid java name */
    public final PrizeHintEntity m365copy96W4E(String prizeHintId, String text) {
        return new PrizeHintEntity(prizeHintId, text, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrizeHintEntity)) {
            return false;
        }
        PrizeHintEntity prizeHintEntity = (PrizeHintEntity) other;
        return PrizeHintId.m371equalsimpl0(this.prizeHintId, prizeHintEntity.prizeHintId) && jl40.l(this.text, prizeHintEntity.text);
    }

    /* renamed from: getPrizeHintId-kyR0wrU, reason: not valid java name */
    public final String m366getPrizeHintIdkyR0wrU() {
        return this.prizeHintId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (PrizeHintId.m372hashCodeimpl(this.prizeHintId) * 31);
    }

    public String toString() {
        return unr0.p("PrizeHintEntity(prizeHintId=", PrizeHintId.m373toStringimpl(this.prizeHintId), ", text=", this.text, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        PrizeHintId.m374writeToParcelimpl(this.prizeHintId, dest, flags);
        dest.writeString(this.text);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PrizeHintEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrizeHintEntity createFromParcel(Parcel parcel) {
            return new PrizeHintEntity(PrizeHintId.CREATOR.createFromParcel(parcel).m375unboximpl(), parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrizeHintEntity[] newArray(int i) {
            return new PrizeHintEntity[i];
        }
    }

    public /* synthetic */ PrizeHintEntity(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
