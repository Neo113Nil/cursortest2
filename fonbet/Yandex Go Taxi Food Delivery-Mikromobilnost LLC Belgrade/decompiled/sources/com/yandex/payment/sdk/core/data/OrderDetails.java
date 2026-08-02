package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/payment/sdk/core/data/OrderDetails;", "Landroid/os/Parcelable;", "<init>", "()V", "Strict", "Json", "Lcom/yandex/payment/sdk/core/data/OrderDetails$Json;", "Lcom/yandex/payment/sdk/core/data/OrderDetails$Strict;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class OrderDetails implements Parcelable {
    public /* synthetic */ OrderDetails(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/payment/sdk/core/data/OrderDetails$Json;", "Lcom/yandex/payment/sdk/core/data/OrderDetails;", "", Constants.KEY_DATA, "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/payment/sdk/core/data/OrderDetails$Json;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getData", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Json extends OrderDetails {
        public static final Parcelable.Creator<Json> CREATOR = new Creator();
        private final String data;

        public Json(String str) {
            super(null);
            this.data = str;
        }

        public static /* synthetic */ Json copy$default(Json json2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = json2.data;
            }
            return json2.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getData() {
            return this.data;
        }

        public final Json copy(String data) {
            return new Json(data);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Json) && jl40.l(this.data, ((Json) other).data);
        }

        public final String getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return oyr.p("Json(data=", this.data, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.data);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Json> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Json createFromParcel(Parcel parcel) {
                return new Json(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Json[] newArray(int i) {
                return new Json[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\fJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u0014¨\u0006("}, d2 = {"Lcom/yandex/payment/sdk/core/data/OrderDetails$Strict;", "Lcom/yandex/payment/sdk/core/data/OrderDetails;", "", "currency", "Ljava/math/BigDecimal;", "amount", "priceStatus", "label", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/payment/sdk/core/data/OrderDetails$Strict;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency", "Ljava/math/BigDecimal;", "getAmount", "getPriceStatus", "getLabel", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Strict extends OrderDetails {
        public static final Parcelable.Creator<Strict> CREATOR = new Creator();
        private final BigDecimal amount;
        private final String currency;
        private final String label;
        private final String priceStatus;

        public /* synthetic */ Strict(String str, BigDecimal bigDecimal, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : bigDecimal, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public static /* synthetic */ Strict copy$default(Strict strict, String str, BigDecimal bigDecimal, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = strict.currency;
            }
            if ((i & 2) != 0) {
                bigDecimal = strict.amount;
            }
            if ((i & 4) != 0) {
                str2 = strict.priceStatus;
            }
            if ((i & 8) != 0) {
                str3 = strict.label;
            }
            return strict.copy(str, bigDecimal, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPriceStatus() {
            return this.priceStatus;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Strict copy(String currency, BigDecimal amount, String priceStatus, String label) {
            return new Strict(currency, amount, priceStatus, label);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Strict)) {
                return false;
            }
            Strict strict = (Strict) other;
            return jl40.l(this.currency, strict.currency) && jl40.l(this.amount, strict.amount) && jl40.l(this.priceStatus, strict.priceStatus) && jl40.l(this.label, strict.label);
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPriceStatus() {
            return this.priceStatus;
        }

        public int hashCode() {
            int hashCode = this.currency.hashCode() * 31;
            BigDecimal bigDecimal = this.amount;
            int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            String str = this.priceStatus;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.currency;
            BigDecimal bigDecimal = this.amount;
            String str2 = this.priceStatus;
            String str3 = this.label;
            StringBuilder sb = new StringBuilder("Strict(currency=");
            sb.append(str);
            sb.append(", amount=");
            sb.append(bigDecimal);
            sb.append(", priceStatus=");
            return g8e.r(sb, str2, ", label=", str3, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.currency);
            dest.writeSerializable(this.amount);
            dest.writeString(this.priceStatus);
            dest.writeString(this.label);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Strict> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Strict createFromParcel(Parcel parcel) {
                return new Strict(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Strict[] newArray(int i) {
                return new Strict[i];
            }
        }

        public Strict(String str, BigDecimal bigDecimal, String str2, String str3) {
            super(null);
            this.currency = str;
            this.amount = bigDecimal;
            this.priceStatus = str2;
            this.label = str3;
        }
    }

    private OrderDetails() {
    }
}
