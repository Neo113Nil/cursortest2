package com.ybsdk.core.common.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fo4;
import defpackage.jl40;
import defpackage.ly3;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0012¨\u0006&"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/BalanceEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "balance", "plus", "cashback", "<init>", "(Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component2", "component3", "copy", "(Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;)Lcom/ybsdk/core/common/domain/entities/BalanceEntity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getBalance", "getPlus", "getCashback", "Companion", "fo4", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BalanceEntity implements Parcelable {
    private static final BalanceEntity EMPTY;
    private final MoneyEntity balance;
    private final MoneyEntity cashback;
    private final MoneyEntity plus;
    public static final fo4 Companion = new fo4();
    public static final Parcelable.Creator<BalanceEntity> CREATOR = new Creator();

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        EMPTY = new BalanceEntity(new MoneyEntity(bigDecimal, "", ""), new MoneyEntity(bigDecimal, "", ""), new MoneyEntity(bigDecimal, "", ""));
    }

    public BalanceEntity(MoneyEntity moneyEntity, MoneyEntity moneyEntity2, MoneyEntity moneyEntity3) {
        this.balance = moneyEntity;
        this.plus = moneyEntity2;
        this.cashback = moneyEntity3;
    }

    public static /* synthetic */ BalanceEntity copy$default(BalanceEntity balanceEntity, MoneyEntity moneyEntity, MoneyEntity moneyEntity2, MoneyEntity moneyEntity3, int i, Object obj) {
        if ((i & 1) != 0) {
            moneyEntity = balanceEntity.balance;
        }
        if ((i & 2) != 0) {
            moneyEntity2 = balanceEntity.plus;
        }
        if ((i & 4) != 0) {
            moneyEntity3 = balanceEntity.cashback;
        }
        return balanceEntity.copy(moneyEntity, moneyEntity2, moneyEntity3);
    }

    /* renamed from: component1, reason: from getter */
    public final MoneyEntity getBalance() {
        return this.balance;
    }

    /* renamed from: component2, reason: from getter */
    public final MoneyEntity getPlus() {
        return this.plus;
    }

    /* renamed from: component3, reason: from getter */
    public final MoneyEntity getCashback() {
        return this.cashback;
    }

    public final BalanceEntity copy(MoneyEntity balance, MoneyEntity plus, MoneyEntity cashback) {
        return new BalanceEntity(balance, plus, cashback);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BalanceEntity)) {
            return false;
        }
        BalanceEntity balanceEntity = (BalanceEntity) other;
        return jl40.l(this.balance, balanceEntity.balance) && jl40.l(this.plus, balanceEntity.plus) && jl40.l(this.cashback, balanceEntity.cashback);
    }

    public final MoneyEntity getBalance() {
        return this.balance;
    }

    public final MoneyEntity getCashback() {
        return this.cashback;
    }

    public final MoneyEntity getPlus() {
        return this.plus;
    }

    public int hashCode() {
        return this.cashback.hashCode() + ly3.d(this.plus, this.balance.hashCode() * 31, 31);
    }

    public String toString() {
        return "BalanceEntity(balance=" + this.balance + ", plus=" + this.plus + ", cashback=" + this.cashback + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.balance.writeToParcel(dest, flags);
        this.plus.writeToParcel(dest, flags);
        this.cashback.writeToParcel(dest, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<BalanceEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BalanceEntity createFromParcel(Parcel parcel) {
            Parcelable.Creator<MoneyEntity> creator = MoneyEntity.CREATOR;
            return new BalanceEntity(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BalanceEntity[] newArray(int i) {
            return new BalanceEntity[i];
        }
    }
}
