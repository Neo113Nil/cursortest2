package com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorRegexEntity;", "Landroid/os/Parcelable;", "Lkotlin/text/Regex;", "regex", "", "hint", "<init>", "(Lkotlin/text/Regex;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lkotlin/text/Regex;", "component2", "()Ljava/lang/String;", "copy", "(Lkotlin/text/Regex;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/RequisiteFieldValidatorRegexEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/text/Regex;", "getRegex", "Ljava/lang/String;", "getHint", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisiteFieldValidatorRegexEntity implements Parcelable {
    public static final Parcelable.Creator<RequisiteFieldValidatorRegexEntity> CREATOR = new Creator();
    private final String hint;
    private final Regex regex;

    public RequisiteFieldValidatorRegexEntity(Regex regex, String str) {
        this.regex = regex;
        this.hint = str;
    }

    public static /* synthetic */ RequisiteFieldValidatorRegexEntity copy$default(RequisiteFieldValidatorRegexEntity requisiteFieldValidatorRegexEntity, Regex regex, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            regex = requisiteFieldValidatorRegexEntity.regex;
        }
        if ((i & 2) != 0) {
            str = requisiteFieldValidatorRegexEntity.hint;
        }
        return requisiteFieldValidatorRegexEntity.copy(regex, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Regex getRegex() {
        return this.regex;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    public final RequisiteFieldValidatorRegexEntity copy(Regex regex, String hint) {
        return new RequisiteFieldValidatorRegexEntity(regex, hint);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisiteFieldValidatorRegexEntity)) {
            return false;
        }
        RequisiteFieldValidatorRegexEntity requisiteFieldValidatorRegexEntity = (RequisiteFieldValidatorRegexEntity) other;
        return jl40.l(this.regex, requisiteFieldValidatorRegexEntity.regex) && jl40.l(this.hint, requisiteFieldValidatorRegexEntity.hint);
    }

    public final String getHint() {
        return this.hint;
    }

    public final Regex getRegex() {
        return this.regex;
    }

    public int hashCode() {
        return this.hint.hashCode() + (this.regex.hashCode() * 31);
    }

    public String toString() {
        return "RequisiteFieldValidatorRegexEntity(regex=" + this.regex + ", hint=" + this.hint + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.regex);
        dest.writeString(this.hint);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RequisiteFieldValidatorRegexEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisiteFieldValidatorRegexEntity createFromParcel(Parcel parcel) {
            return new RequisiteFieldValidatorRegexEntity((Regex) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequisiteFieldValidatorRegexEntity[] newArray(int i) {
            return new RequisiteFieldValidatorRegexEntity[i];
        }
    }
}
