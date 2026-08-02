package com.ybsdk.feature.pdf.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.x4e;
import defpackage.xvz;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Base", "DepositTerms", "CreditTerms", "LoadFromUrl", "LoadById", "SplitContractDraft", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$Base;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$CreditTerms;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$DepositTerms;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$LoadById;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$LoadFromUrl;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft;", "feature-pdf-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PdfLoaderScreenParams extends ScreenParams {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b\b\u0010\u001a¨\u0006*"}, d2 = {"Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft$Cart;", "cart", "", "planConstructor", "merchantID", "", "isPrepayment", "<init>", "(Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft$Cart;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft$Cart;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Boolean;", "copy", "(Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft$Cart;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft$Cart;", "getCart", "Ljava/lang/String;", "getPlanConstructor", "getMerchantID", "Ljava/lang/Boolean;", "Cart", "feature-pdf-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SplitContractDraft implements PdfLoaderScreenParams {
        public static final Parcelable.Creator<SplitContractDraft> CREATOR = new Creator();
        private final Cart cart;
        private final Boolean isPrepayment;
        private final String merchantID;
        private final String planConstructor;

        public SplitContractDraft(Cart cart, String str, String str2, Boolean bool) {
            this.cart = cart;
            this.planConstructor = str;
            this.merchantID = str2;
            this.isPrepayment = bool;
        }

        public static /* synthetic */ SplitContractDraft copy$default(SplitContractDraft splitContractDraft, Cart cart, String str, String str2, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                cart = splitContractDraft.cart;
            }
            if ((i & 2) != 0) {
                str = splitContractDraft.planConstructor;
            }
            if ((i & 4) != 0) {
                str2 = splitContractDraft.merchantID;
            }
            if ((i & 8) != 0) {
                bool = splitContractDraft.isPrepayment;
            }
            return splitContractDraft.copy(cart, str, str2, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Cart getCart() {
            return this.cart;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPlanConstructor() {
            return this.planConstructor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMerchantID() {
            return this.merchantID;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getIsPrepayment() {
            return this.isPrepayment;
        }

        public final SplitContractDraft copy(Cart cart, String planConstructor, String merchantID, Boolean isPrepayment) {
            return new SplitContractDraft(cart, planConstructor, merchantID, isPrepayment);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitContractDraft)) {
                return false;
            }
            SplitContractDraft splitContractDraft = (SplitContractDraft) other;
            return jl40.l(this.cart, splitContractDraft.cart) && jl40.l(this.planConstructor, splitContractDraft.planConstructor) && jl40.l(this.merchantID, splitContractDraft.merchantID) && jl40.l(this.isPrepayment, splitContractDraft.isPrepayment);
        }

        public final Cart getCart() {
            return this.cart;
        }

        public final String getMerchantID() {
            return this.merchantID;
        }

        public final String getPlanConstructor() {
            return this.planConstructor;
        }

        public int hashCode() {
            int b = unr0.b(unr0.b(this.cart.hashCode() * 31, 31, this.planConstructor), 31, this.merchantID);
            Boolean bool = this.isPrepayment;
            return b + (bool == null ? 0 : bool.hashCode());
        }

        public final Boolean isPrepayment() {
            return this.isPrepayment;
        }

        public String toString() {
            return "SplitContractDraft(cart=" + this.cart + ", planConstructor=" + this.planConstructor + ", merchantID=" + this.merchantID + ", isPrepayment=" + this.isPrepayment + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.cart.writeToParcel(dest, flags);
            dest.writeString(this.planConstructor);
            dest.writeString(this.merchantID);
            Boolean bool = this.isPrepayment;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                nzs.k(dest, 1, bool);
            }
        }

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft$Cart;", "Landroid/os/Parcelable;", "", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft$Cart$Item;", "items", "Ljava/math/BigDecimal;", "totalAmount", "<init>", "(Ljava/util/List;Ljava/math/BigDecimal;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Ljava/math/BigDecimal;", "copy", "(Ljava/util/List;Ljava/math/BigDecimal;)Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft$Cart;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Ljava/math/BigDecimal;", "getTotalAmount", "Item", "feature-pdf-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Cart implements Parcelable {
            public static final Parcelable.Creator<Cart> CREATOR = new Creator();
            private final List<Item> items;
            private final BigDecimal totalAmount;

            public Cart(List<Item> list, BigDecimal bigDecimal) {
                this.items = list;
                this.totalAmount = bigDecimal;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Cart copy$default(Cart cart, List list, BigDecimal bigDecimal, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = cart.items;
                }
                if ((i & 2) != 0) {
                    bigDecimal = cart.totalAmount;
                }
                return cart.copy(list, bigDecimal);
            }

            public final List<Item> component1() {
                return this.items;
            }

            /* renamed from: component2, reason: from getter */
            public final BigDecimal getTotalAmount() {
                return this.totalAmount;
            }

            public final Cart copy(List<Item> items, BigDecimal totalAmount) {
                return new Cart(items, totalAmount);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Cart)) {
                    return false;
                }
                Cart cart = (Cart) other;
                return jl40.l(this.items, cart.items) && jl40.l(this.totalAmount, cart.totalAmount);
            }

            public final List<Item> getItems() {
                return this.items;
            }

            public final BigDecimal getTotalAmount() {
                return this.totalAmount;
            }

            public int hashCode() {
                return this.totalAmount.hashCode() + (this.items.hashCode() * 31);
            }

            public String toString() {
                return "Cart(items=" + this.items + ", totalAmount=" + this.totalAmount + Extension.C_BRAKE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Iterator t = vfc.t(dest, this.items);
                while (t.hasNext()) {
                    ((Item) t.next()).writeToParcel(dest, flags);
                }
                dest.writeSerializable(this.totalAmount);
            }

            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft$Cart$Item;", "Landroid/os/Parcelable;", "", "title", "Ljava/math/BigDecimal;", "count", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$SplitContractDraft$Cart$Item;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/math/BigDecimal;", "getCount", "feature-pdf-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Item implements Parcelable {
                public static final Parcelable.Creator<Item> CREATOR = new Creator();
                private final BigDecimal count;
                private final String title;

                public Item(String str, BigDecimal bigDecimal) {
                    this.title = str;
                    this.count = bigDecimal;
                }

                public static /* synthetic */ Item copy$default(Item item, String str, BigDecimal bigDecimal, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = item.title;
                    }
                    if ((i & 2) != 0) {
                        bigDecimal = item.count;
                    }
                    return item.copy(str, bigDecimal);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final BigDecimal getCount() {
                    return this.count;
                }

                public final Item copy(String title, BigDecimal count) {
                    return new Item(title, count);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Item)) {
                        return false;
                    }
                    Item item = (Item) other;
                    return jl40.l(this.title, item.title) && jl40.l(this.count, item.count);
                }

                public final BigDecimal getCount() {
                    return this.count;
                }

                public final String getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    return this.count.hashCode() + (this.title.hashCode() * 31);
                }

                public String toString() {
                    return "Item(title=" + this.title + ", count=" + this.count + Extension.C_BRAKE;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.title);
                    dest.writeSerializable(this.count);
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Item> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Item createFromParcel(Parcel parcel) {
                        return new Item(parcel.readString(), (BigDecimal) parcel.readSerializable());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Item[] newArray(int i) {
                        return new Item[i];
                    }
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Cart> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cart createFromParcel(Parcel parcel) {
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = oo31.d(Item.CREATOR, parcel, arrayList, i, 1);
                    }
                    return new Cart(arrayList, (BigDecimal) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cart[] newArray(int i) {
                    return new Cart[i];
                }
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SplitContractDraft> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplitContractDraft createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Cart createFromParcel = Cart.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SplitContractDraft(createFromParcel, readString, readString2, valueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SplitContractDraft[] newArray(int i) {
                return new SplitContractDraft[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J^\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b\u0005\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b*\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b+\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b,\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b-\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$Base;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams;", "", "fileName", "", "isSharingEnabled", "agreementId", "reportType", "reportVersion", "operationId", "operationTimestamp", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$Base;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileName", "Z", "getAgreementId", "getReportType", "getReportVersion", "getOperationId", "getOperationTimestamp", "feature-pdf-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Base implements PdfLoaderScreenParams {
        public static final Parcelable.Creator<Base> CREATOR = new Creator();
        private final String agreementId;
        private final String fileName;
        private final boolean isSharingEnabled;
        private final String operationId;
        private final String operationTimestamp;
        private final String reportType;
        private final String reportVersion;

        public Base(String str, boolean z, String str2, String str3, String str4, String str5, String str6) {
            this.fileName = str;
            this.isSharingEnabled = z;
            this.agreementId = str2;
            this.reportType = str3;
            this.reportVersion = str4;
            this.operationId = str5;
            this.operationTimestamp = str6;
        }

        public static /* synthetic */ Base copy$default(Base base, String str, boolean z, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = base.fileName;
            }
            if ((i & 2) != 0) {
                z = base.isSharingEnabled;
            }
            if ((i & 4) != 0) {
                str2 = base.agreementId;
            }
            if ((i & 8) != 0) {
                str3 = base.reportType;
            }
            if ((i & 16) != 0) {
                str4 = base.reportVersion;
            }
            if ((i & 32) != 0) {
                str5 = base.operationId;
            }
            if ((i & 64) != 0) {
                str6 = base.operationTimestamp;
            }
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            String str10 = str2;
            return base.copy(str, z, str10, str3, str9, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSharingEnabled() {
            return this.isSharingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getReportType() {
            return this.reportType;
        }

        /* renamed from: component5, reason: from getter */
        public final String getReportVersion() {
            return this.reportVersion;
        }

        /* renamed from: component6, reason: from getter */
        public final String getOperationId() {
            return this.operationId;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOperationTimestamp() {
            return this.operationTimestamp;
        }

        public final Base copy(String fileName, boolean isSharingEnabled, String agreementId, String reportType, String reportVersion, String operationId, String operationTimestamp) {
            return new Base(fileName, isSharingEnabled, agreementId, reportType, reportVersion, operationId, operationTimestamp);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Base)) {
                return false;
            }
            Base base = (Base) other;
            return jl40.l(this.fileName, base.fileName) && this.isSharingEnabled == base.isSharingEnabled && jl40.l(this.agreementId, base.agreementId) && jl40.l(this.reportType, base.reportType) && jl40.l(this.reportVersion, base.reportVersion) && jl40.l(this.operationId, base.operationId) && jl40.l(this.operationTimestamp, base.operationTimestamp);
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getOperationId() {
            return this.operationId;
        }

        public final String getOperationTimestamp() {
            return this.operationTimestamp;
        }

        public final String getReportType() {
            return this.reportType;
        }

        public final String getReportVersion() {
            return this.reportVersion;
        }

        public int hashCode() {
            String str = this.fileName;
            int e = unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.isSharingEnabled);
            String str2 = this.agreementId;
            int b = unr0.b(unr0.b((e + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.reportType), 31, this.reportVersion);
            String str3 = this.operationId;
            int hashCode = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.operationTimestamp;
            return hashCode + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean isSharingEnabled() {
            return this.isSharingEnabled;
        }

        public String toString() {
            String str = this.fileName;
            boolean z = this.isSharingEnabled;
            String str2 = this.agreementId;
            String str3 = this.reportType;
            String str4 = this.reportVersion;
            String str5 = this.operationId;
            String str6 = this.operationTimestamp;
            StringBuilder l = oo31.l("Base(fileName=", str, ", isSharingEnabled=", ", agreementId=", z);
            g8e.D(l, str2, ", reportType=", str3, ", reportVersion=");
            g8e.D(l, str4, ", operationId=", str5, ", operationTimestamp=");
            return oyr.t(l, str6, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.fileName);
            dest.writeInt(this.isSharingEnabled ? 1 : 0);
            dest.writeString(this.agreementId);
            dest.writeString(this.reportType);
            dest.writeString(this.reportVersion);
            dest.writeString(this.operationId);
            dest.writeString(this.operationTimestamp);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Base> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Base createFromParcel(Parcel parcel) {
                return new Base(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Base[] newArray(int i) {
                return new Base[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J0\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$CreditTerms;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams;", "", "fileName", "", "isSharingEnabled", "agreementId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$CreditTerms;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileName", "Z", "getAgreementId", "feature-pdf-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CreditTerms implements PdfLoaderScreenParams {
        public static final Parcelable.Creator<CreditTerms> CREATOR = new Creator();
        private final String agreementId;
        private final String fileName;
        private final boolean isSharingEnabled;

        public CreditTerms(String str, boolean z, String str2) {
            this.fileName = str;
            this.isSharingEnabled = z;
            this.agreementId = str2;
        }

        public static /* synthetic */ CreditTerms copy$default(CreditTerms creditTerms, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = creditTerms.fileName;
            }
            if ((i & 2) != 0) {
                z = creditTerms.isSharingEnabled;
            }
            if ((i & 4) != 0) {
                str2 = creditTerms.agreementId;
            }
            return creditTerms.copy(str, z, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSharingEnabled() {
            return this.isSharingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        public final CreditTerms copy(String fileName, boolean isSharingEnabled, String agreementId) {
            return new CreditTerms(fileName, isSharingEnabled, agreementId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreditTerms)) {
                return false;
            }
            CreditTerms creditTerms = (CreditTerms) other;
            return jl40.l(this.fileName, creditTerms.fileName) && this.isSharingEnabled == creditTerms.isSharingEnabled && jl40.l(this.agreementId, creditTerms.agreementId);
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public int hashCode() {
            String str = this.fileName;
            return this.agreementId.hashCode() + unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.isSharingEnabled);
        }

        public final boolean isSharingEnabled() {
            return this.isSharingEnabled;
        }

        public String toString() {
            String str = this.fileName;
            boolean z = this.isSharingEnabled;
            return oyr.t(oo31.l("CreditTerms(fileName=", str, ", isSharingEnabled=", ", agreementId=", z), this.agreementId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.fileName);
            dest.writeInt(this.isSharingEnabled ? 1 : 0);
            dest.writeString(this.agreementId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CreditTerms> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreditTerms createFromParcel(Parcel parcel) {
                return new CreditTerms(parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CreditTerms[] newArray(int i) {
                return new CreditTerms[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J0\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$DepositTerms;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams;", "", "fileName", "", "isSharingEnabled", "agreementId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZLjava/lang/String;)Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$DepositTerms;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileName", "Z", "getAgreementId", "feature-pdf-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DepositTerms implements PdfLoaderScreenParams {
        public static final Parcelable.Creator<DepositTerms> CREATOR = new Creator();
        private final String agreementId;
        private final String fileName;
        private final boolean isSharingEnabled;

        public DepositTerms(String str, boolean z, String str2) {
            this.fileName = str;
            this.isSharingEnabled = z;
            this.agreementId = str2;
        }

        public static /* synthetic */ DepositTerms copy$default(DepositTerms depositTerms, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = depositTerms.fileName;
            }
            if ((i & 2) != 0) {
                z = depositTerms.isSharingEnabled;
            }
            if ((i & 4) != 0) {
                str2 = depositTerms.agreementId;
            }
            return depositTerms.copy(str, z, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsSharingEnabled() {
            return this.isSharingEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        public final DepositTerms copy(String fileName, boolean isSharingEnabled, String agreementId) {
            return new DepositTerms(fileName, isSharingEnabled, agreementId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepositTerms)) {
                return false;
            }
            DepositTerms depositTerms = (DepositTerms) other;
            return jl40.l(this.fileName, depositTerms.fileName) && this.isSharingEnabled == depositTerms.isSharingEnabled && jl40.l(this.agreementId, depositTerms.agreementId);
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public int hashCode() {
            String str = this.fileName;
            return this.agreementId.hashCode() + unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.isSharingEnabled);
        }

        public final boolean isSharingEnabled() {
            return this.isSharingEnabled;
        }

        public String toString() {
            String str = this.fileName;
            boolean z = this.isSharingEnabled;
            return oyr.t(oo31.l("DepositTerms(fileName=", str, ", isSharingEnabled=", ", agreementId=", z), this.agreementId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.fileName);
            dest.writeInt(this.isSharingEnabled ? 1 : 0);
            dest.writeString(this.agreementId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DepositTerms> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositTerms createFromParcel(Parcel parcel) {
                return new DepositTerms(parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositTerms[] newArray(int i) {
                return new DepositTerms[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJJ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0015R%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006+"}, d2 = {"Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$LoadById;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams;", "", "id", "", "lifetimeInSeconds", "target", "", "additionalData", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;)Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$LoadById;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/lang/Long;", "getLifetimeInSeconds", "getTarget", "Ljava/util/Map;", "getAdditionalData", "feature-pdf-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadById implements PdfLoaderScreenParams {
        public static final Parcelable.Creator<LoadById> CREATOR = new Creator();
        private final Map<String, String> additionalData;
        private final String id;
        private final Long lifetimeInSeconds;
        private final String target;

        public LoadById(String str, Long l, String str2, Map<String, String> map) {
            this.id = str;
            this.lifetimeInSeconds = l;
            this.target = str2;
            this.additionalData = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadById copy$default(LoadById loadById, String str, Long l, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadById.id;
            }
            if ((i & 2) != 0) {
                l = loadById.lifetimeInSeconds;
            }
            if ((i & 4) != 0) {
                str2 = loadById.target;
            }
            if ((i & 8) != 0) {
                map = loadById.additionalData;
            }
            return loadById.copy(str, l, str2, map);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getLifetimeInSeconds() {
            return this.lifetimeInSeconds;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTarget() {
            return this.target;
        }

        public final Map<String, String> component4() {
            return this.additionalData;
        }

        public final LoadById copy(String id, Long lifetimeInSeconds, String target, Map<String, String> additionalData) {
            return new LoadById(id, lifetimeInSeconds, target, additionalData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadById)) {
                return false;
            }
            LoadById loadById = (LoadById) other;
            return jl40.l(this.id, loadById.id) && jl40.l(this.lifetimeInSeconds, loadById.lifetimeInSeconds) && jl40.l(this.target, loadById.target) && jl40.l(this.additionalData, loadById.additionalData);
        }

        public final Map<String, String> getAdditionalData() {
            return this.additionalData;
        }

        public final String getId() {
            return this.id;
        }

        public final Long getLifetimeInSeconds() {
            return this.lifetimeInSeconds;
        }

        public final String getTarget() {
            return this.target;
        }

        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            Long l = this.lifetimeInSeconds;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.target;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, String> map = this.additionalData;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "LoadById(id=" + this.id + ", lifetimeInSeconds=" + this.lifetimeInSeconds + ", target=" + this.target + ", additionalData=" + this.additionalData + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            Long l = this.lifetimeInSeconds;
            if (l == null) {
                dest.writeInt(0);
            } else {
                xvz.z(dest, 1, l);
            }
            dest.writeString(this.target);
            Map<String, String> map = this.additionalData;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            Iterator s = x4e.s(dest, 1, map);
            while (s.hasNext()) {
                Map.Entry entry = (Map.Entry) s.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LoadById> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoadById createFromParcel(Parcel parcel) {
                String readString = parcel.readString();
                LinkedHashMap linkedHashMap = null;
                Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = xvz.b(parcel, linkedHashMap2, parcel.readString(), i, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new LoadById(readString, valueOf, readString2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoadById[] newArray(int i) {
                return new LoadById[i];
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b\u0006\u0010\u0016¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$LoadFromUrl;", "Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams;", "", "url", "fileName", "", "isSharingEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ybsdk/feature/pdf/api/PdfLoaderScreenParams$LoadFromUrl;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getFileName", "Z", "feature-pdf-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadFromUrl implements PdfLoaderScreenParams {
        public static final Parcelable.Creator<LoadFromUrl> CREATOR = new Creator();
        private final String fileName;
        private final boolean isSharingEnabled;
        private final String url;

        public LoadFromUrl(String str, String str2, boolean z) {
            this.url = str;
            this.fileName = str2;
            this.isSharingEnabled = z;
        }

        public static /* synthetic */ LoadFromUrl copy$default(LoadFromUrl loadFromUrl, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadFromUrl.url;
            }
            if ((i & 2) != 0) {
                str2 = loadFromUrl.fileName;
            }
            if ((i & 4) != 0) {
                z = loadFromUrl.isSharingEnabled;
            }
            return loadFromUrl.copy(str, str2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSharingEnabled() {
            return this.isSharingEnabled;
        }

        public final LoadFromUrl copy(String url, String fileName, boolean isSharingEnabled) {
            return new LoadFromUrl(url, fileName, isSharingEnabled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadFromUrl)) {
                return false;
            }
            LoadFromUrl loadFromUrl = (LoadFromUrl) other;
            return jl40.l(this.url, loadFromUrl.url) && jl40.l(this.fileName, loadFromUrl.fileName) && this.isSharingEnabled == loadFromUrl.isSharingEnabled;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            String str = this.fileName;
            return Boolean.hashCode(this.isSharingEnabled) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final boolean isSharingEnabled() {
            return this.isSharingEnabled;
        }

        public String toString() {
            String str = this.url;
            String str2 = this.fileName;
            return x4e.i(b64.v("LoadFromUrl(url=", str, ", fileName=", str2, ", isSharingEnabled="), this.isSharingEnabled, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.url);
            dest.writeString(this.fileName);
            dest.writeInt(this.isSharingEnabled ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LoadFromUrl> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoadFromUrl createFromParcel(Parcel parcel) {
                return new LoadFromUrl(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoadFromUrl[] newArray(int i) {
                return new LoadFromUrl[i];
            }
        }
    }
}
