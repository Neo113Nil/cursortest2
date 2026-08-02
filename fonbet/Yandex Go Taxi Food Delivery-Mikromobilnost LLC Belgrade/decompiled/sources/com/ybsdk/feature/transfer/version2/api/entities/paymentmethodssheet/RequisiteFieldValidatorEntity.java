package com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.vfc;
import defpackage.xvz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J0\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;", "Landroid/os/Parcelable;", "", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorRegexEntity;", "input", "unfocus", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInput", "getUnfocus", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisiteFieldValidatorEntity implements Parcelable {
    public static final Parcelable.Creator<RequisiteFieldValidatorEntity> CREATOR = new Creator();
    private final List<RequisiteFieldValidatorRegexEntity> input;
    private final List<RequisiteFieldValidatorRegexEntity> unfocus;

    public RequisiteFieldValidatorEntity(List<RequisiteFieldValidatorRegexEntity> list, List<RequisiteFieldValidatorRegexEntity> list2) {
        this.input = list;
        this.unfocus = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequisiteFieldValidatorEntity copy$default(RequisiteFieldValidatorEntity requisiteFieldValidatorEntity, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = requisiteFieldValidatorEntity.input;
        }
        if ((i & 2) != 0) {
            list2 = requisiteFieldValidatorEntity.unfocus;
        }
        return requisiteFieldValidatorEntity.copy(list, list2);
    }

    public final List<RequisiteFieldValidatorRegexEntity> component1() {
        return this.input;
    }

    public final List<RequisiteFieldValidatorRegexEntity> component2() {
        return this.unfocus;
    }

    public final RequisiteFieldValidatorEntity copy(List<RequisiteFieldValidatorRegexEntity> input, List<RequisiteFieldValidatorRegexEntity> unfocus) {
        return new RequisiteFieldValidatorEntity(input, unfocus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisiteFieldValidatorEntity)) {
            return false;
        }
        RequisiteFieldValidatorEntity requisiteFieldValidatorEntity = (RequisiteFieldValidatorEntity) other;
        return jl40.l(this.input, requisiteFieldValidatorEntity.input) && jl40.l(this.unfocus, requisiteFieldValidatorEntity.unfocus);
    }

    public final List<RequisiteFieldValidatorRegexEntity> getInput() {
        return this.input;
    }

    public final List<RequisiteFieldValidatorRegexEntity> getUnfocus() {
        return this.unfocus;
    }

    public int hashCode() {
        return this.unfocus.hashCode() + (this.input.hashCode() * 31);
    }

    public String toString() {
        return xvz.l("RequisiteFieldValidatorEntity(input=", this.input, ", unfocus=", this.unfocus, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Iterator t = vfc.t(dest, this.input);
        while (t.hasNext()) {
            ((RequisiteFieldValidatorRegexEntity) t.next()).writeToParcel(dest, flags);
        }
        Iterator t2 = vfc.t(dest, this.unfocus);
        while (t2.hasNext()) {
            ((RequisiteFieldValidatorRegexEntity) t2.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RequisiteFieldValidatorEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisiteFieldValidatorEntity createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = oo31.d(RequisiteFieldValidatorRegexEntity.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = oo31.d(RequisiteFieldValidatorRegexEntity.CREATOR, parcel, arrayList2, i, 1);
            }
            return new RequisiteFieldValidatorEntity(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisiteFieldValidatorEntity[] newArray(int i) {
            return new RequisiteFieldValidatorEntity[i];
        }
    }
}
