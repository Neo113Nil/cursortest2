package com.ybsdk.screens.notice.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.api.DepositType;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.smw0;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/api/DepositType;", "topupType", "Ljava/math/BigDecimal;", "money", "", "currency", "<init>", "(Lcom/ybsdk/api/DepositType;Ljava/math/BigDecimal;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/api/DepositType;", "component2", "()Ljava/math/BigDecimal;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/api/DepositType;Ljava/math/BigDecimal;Ljava/lang/String;)Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/api/DepositType;", "getTopupType", "Ljava/math/BigDecimal;", "getMoney", "Ljava/lang/String;", "getCurrency", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TopupValueEntity implements Parcelable {
    public static final Parcelable.Creator<TopupValueEntity> CREATOR = new Creator();
    private final String currency;
    private final BigDecimal money;
    private final DepositType topupType;

    public TopupValueEntity(DepositType depositType, BigDecimal bigDecimal, String str) {
        this.topupType = depositType;
        this.money = bigDecimal;
        this.currency = str;
    }

    public static /* synthetic */ TopupValueEntity copy$default(TopupValueEntity topupValueEntity, DepositType depositType, BigDecimal bigDecimal, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            depositType = topupValueEntity.topupType;
        }
        if ((i & 2) != 0) {
            bigDecimal = topupValueEntity.money;
        }
        if ((i & 4) != 0) {
            str = topupValueEntity.currency;
        }
        return topupValueEntity.copy(depositType, bigDecimal, str);
    }

    /* renamed from: component1, reason: from getter */
    public final DepositType getTopupType() {
        return this.topupType;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final TopupValueEntity copy(DepositType topupType, BigDecimal money, String currency) {
        return new TopupValueEntity(topupType, money, currency);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupValueEntity)) {
            return false;
        }
        TopupValueEntity topupValueEntity = (TopupValueEntity) other;
        return this.topupType == topupValueEntity.topupType && jl40.l(this.money, topupValueEntity.money) && jl40.l(this.currency, topupValueEntity.currency);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final BigDecimal getMoney() {
        return this.money;
    }

    public final DepositType getTopupType() {
        return this.topupType;
    }

    public int hashCode() {
        return this.currency.hashCode() + smw0.f(this.money, this.topupType.hashCode() * 31, 31);
    }

    public String toString() {
        DepositType depositType = this.topupType;
        BigDecimal bigDecimal = this.money;
        String str = this.currency;
        StringBuilder sb = new StringBuilder("TopupValueEntity(topupType=");
        sb.append(depositType);
        sb.append(", money=");
        sb.append(bigDecimal);
        sb.append(", currency=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.topupType.name());
        dest.writeSerializable(this.money);
        dest.writeString(this.currency);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TopupValueEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopupValueEntity createFromParcel(Parcel parcel) {
            return new TopupValueEntity(DepositType.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopupValueEntity[] newArray(int i) {
            return new TopupValueEntity[i];
        }
    }
}
