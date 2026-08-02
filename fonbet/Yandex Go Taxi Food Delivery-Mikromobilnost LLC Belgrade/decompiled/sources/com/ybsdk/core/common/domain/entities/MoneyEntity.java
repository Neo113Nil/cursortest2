package com.ybsdk.core.common.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.v530;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006'"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "Landroid/os/Parcelable;", "Ljava/math/BigDecimal;", "amount", "", "currency", "formattedAmount", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/math/BigDecimal;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "getAmount", "Ljava/lang/String;", "getCurrency", "getFormattedAmount", "Companion", "v530", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MoneyEntity implements Parcelable {
    private final BigDecimal amount;
    private final String currency;
    private final String formattedAmount;
    private static final v530 Companion = new v530();
    public static final Parcelable.Creator<MoneyEntity> CREATOR = new Creator();

    public MoneyEntity(BigDecimal bigDecimal, String str, String str2) {
        this.amount = bigDecimal;
        this.currency = str;
        this.formattedAmount = str2;
    }

    public static /* synthetic */ MoneyEntity copy$default(MoneyEntity moneyEntity, BigDecimal bigDecimal, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = moneyEntity.amount;
        }
        if ((i & 2) != 0) {
            str = moneyEntity.currency;
        }
        if ((i & 4) != 0) {
            str2 = moneyEntity.formattedAmount;
        }
        return moneyEntity.copy(bigDecimal, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormattedAmount() {
        return this.formattedAmount;
    }

    public final MoneyEntity copy(BigDecimal amount, String currency, String formattedAmount) {
        return new MoneyEntity(amount, currency, formattedAmount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MoneyEntity)) {
            return false;
        }
        MoneyEntity moneyEntity = (MoneyEntity) other;
        return jl40.l(this.amount, moneyEntity.amount) && jl40.l(this.currency, moneyEntity.currency) && jl40.l(this.formattedAmount, moneyEntity.formattedAmount);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getFormattedAmount() {
        return this.formattedAmount;
    }

    public int hashCode() {
        return this.formattedAmount.hashCode() + unr0.b(this.amount.hashCode() * 31, 31, this.currency);
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.currency;
        String str2 = this.formattedAmount;
        StringBuilder sb = new StringBuilder("MoneyEntity(amount=");
        sb.append(bigDecimal);
        sb.append(", currency=");
        sb.append(str);
        sb.append(", formattedAmount=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Companion.getClass();
        dest.writeSerializable(getAmount());
        dest.writeString(getCurrency());
        dest.writeString(getFormattedAmount());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MoneyEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MoneyEntity createFromParcel(Parcel parcel) {
            MoneyEntity.Companion.getClass();
            return new MoneyEntity((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MoneyEntity[] newArray(int i) {
            return new MoneyEntity[i];
        }
    }
}
