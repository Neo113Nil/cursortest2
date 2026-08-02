package com.ybsdk.feature.savings.internal.screens.goal;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.b64;
import defpackage.jl40;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u001c¨\u0006."}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/goal/SavingsAccountGoalParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "agreementId", "title", "subtitle", "Ljava/util/Date;", MetaDataField.DATE_FIELD, "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Date;", "component5", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;)Lcom/ybsdk/feature/savings/internal/screens/goal/SavingsAccountGoalParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getTitle", "getSubtitle", "Ljava/util/Date;", "getDate", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getAmount", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountGoalParams implements ScreenParams {
    public static final Parcelable.Creator<SavingsAccountGoalParams> CREATOR = new Creator();
    private final String agreementId;
    private final MoneyEntity amount;
    private final Date date;
    private final String subtitle;
    private final String title;

    public /* synthetic */ SavingsAccountGoalParams(String str, String str2, String str3, Date date, MoneyEntity moneyEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : date, (i & 16) != 0 ? null : moneyEntity);
    }

    public static /* synthetic */ SavingsAccountGoalParams copy$default(SavingsAccountGoalParams savingsAccountGoalParams, String str, String str2, String str3, Date date, MoneyEntity moneyEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountGoalParams.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = savingsAccountGoalParams.title;
        }
        if ((i & 4) != 0) {
            str3 = savingsAccountGoalParams.subtitle;
        }
        if ((i & 8) != 0) {
            date = savingsAccountGoalParams.date;
        }
        if ((i & 16) != 0) {
            moneyEntity = savingsAccountGoalParams.amount;
        }
        MoneyEntity moneyEntity2 = moneyEntity;
        String str4 = str3;
        return savingsAccountGoalParams.copy(str, str2, str4, date, moneyEntity2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    /* renamed from: component5, reason: from getter */
    public final MoneyEntity getAmount() {
        return this.amount;
    }

    public final SavingsAccountGoalParams copy(String agreementId, String title, String subtitle, Date date, MoneyEntity amount) {
        return new SavingsAccountGoalParams(agreementId, title, subtitle, date, amount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountGoalParams)) {
            return false;
        }
        SavingsAccountGoalParams savingsAccountGoalParams = (SavingsAccountGoalParams) other;
        return jl40.l(this.agreementId, savingsAccountGoalParams.agreementId) && jl40.l(this.title, savingsAccountGoalParams.title) && jl40.l(this.subtitle, savingsAccountGoalParams.subtitle) && jl40.l(this.date, savingsAccountGoalParams.date) && jl40.l(this.amount, savingsAccountGoalParams.amount);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final MoneyEntity getAmount() {
        return this.amount;
    }

    public final Date getDate() {
        return this.date;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.date;
        int hashCode4 = (hashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        MoneyEntity moneyEntity = this.amount;
        return hashCode4 + (moneyEntity != null ? moneyEntity.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.title;
        String str3 = this.subtitle;
        Date date = this.date;
        MoneyEntity moneyEntity = this.amount;
        StringBuilder v = b64.v("SavingsAccountGoalParams(agreementId=", str, ", title=", str2, ", subtitle=");
        v.append(str3);
        v.append(", date=");
        v.append(date);
        v.append(", amount=");
        v.append(moneyEntity);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.agreementId);
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeSerializable(this.date);
        dest.writeParcelable(this.amount, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SavingsAccountGoalParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountGoalParams createFromParcel(Parcel parcel) {
            return new SavingsAccountGoalParams(parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), (MoneyEntity) parcel.readParcelable(SavingsAccountGoalParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SavingsAccountGoalParams[] newArray(int i) {
            return new SavingsAccountGoalParams[i];
        }
    }

    public SavingsAccountGoalParams(String str, String str2, String str3, Date date, MoneyEntity moneyEntity) {
        this.agreementId = str;
        this.title = str2;
        this.subtitle = str3;
        this.date = date;
        this.amount = moneyEntity;
    }
}
