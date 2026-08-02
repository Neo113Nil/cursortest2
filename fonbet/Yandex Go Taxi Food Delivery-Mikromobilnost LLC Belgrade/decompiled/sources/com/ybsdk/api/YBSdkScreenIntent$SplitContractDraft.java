package com.ybsdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.vh51;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001+B-\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b\t\u0010\u001b¨\u0006,"}, d2 = {"com/ybsdk/api/YBSdkScreenIntent$SplitContractDraft", "Lvh51;", "Landroid/os/Parcelable;", "Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft$Cart;", "cart", "", "planConstructor", "merchantID", "", "isPrepayment", "<init>", "(Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft$Cart;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft$Cart;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Boolean;", "Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft;", "copy", "(Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft$Cart;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft$Cart;", "getCart", "Ljava/lang/String;", "getPlanConstructor", "getMerchantID", "Ljava/lang/Boolean;", "Cart", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class YBSdkScreenIntent$SplitContractDraft extends vh51 implements Parcelable {
    public static final Parcelable.Creator<YBSdkScreenIntent$SplitContractDraft> CREATOR = new Creator();
    private final Cart cart;
    private final Boolean isPrepayment;
    private final String merchantID;
    private final String planConstructor;

    public YBSdkScreenIntent$SplitContractDraft(Cart cart, String str, String str2) {
        this(cart, str, str2, null, 8, null);
    }

    public static /* synthetic */ YBSdkScreenIntent$SplitContractDraft copy$default(YBSdkScreenIntent$SplitContractDraft yBSdkScreenIntent$SplitContractDraft, Cart cart, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            cart = yBSdkScreenIntent$SplitContractDraft.cart;
        }
        if ((i & 2) != 0) {
            str = yBSdkScreenIntent$SplitContractDraft.planConstructor;
        }
        if ((i & 4) != 0) {
            str2 = yBSdkScreenIntent$SplitContractDraft.merchantID;
        }
        if ((i & 8) != 0) {
            bool = yBSdkScreenIntent$SplitContractDraft.isPrepayment;
        }
        return yBSdkScreenIntent$SplitContractDraft.copy(cart, str, str2, bool);
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

    public final YBSdkScreenIntent$SplitContractDraft copy(Cart cart, String planConstructor, String merchantID, Boolean isPrepayment) {
        return new YBSdkScreenIntent$SplitContractDraft(cart, planConstructor, merchantID, isPrepayment);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YBSdkScreenIntent$SplitContractDraft)) {
            return false;
        }
        YBSdkScreenIntent$SplitContractDraft yBSdkScreenIntent$SplitContractDraft = (YBSdkScreenIntent$SplitContractDraft) other;
        return jl40.l(this.cart, yBSdkScreenIntent$SplitContractDraft.cart) && jl40.l(this.planConstructor, yBSdkScreenIntent$SplitContractDraft.planConstructor) && jl40.l(this.merchantID, yBSdkScreenIntent$SplitContractDraft.merchantID) && jl40.l(this.isPrepayment, yBSdkScreenIntent$SplitContractDraft.isPrepayment);
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

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft$Cart;", "Landroid/os/Parcelable;", "", "Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft$Cart$Item;", "items", "Ljava/math/BigDecimal;", "totalAmount", "<init>", "(Ljava/util/List;Ljava/math/BigDecimal;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/util/List;", "component2", "()Ljava/math/BigDecimal;", "copy", "(Ljava/util/List;Ljava/math/BigDecimal;)Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft$Cart;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Ljava/math/BigDecimal;", "getTotalAmount", "Item", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft$Cart$Item;", "Landroid/os/Parcelable;", "", "title", "Ljava/math/BigDecimal;", "count", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/math/BigDecimal;", "copy", "(Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/ybsdk/api/YBSdkScreenIntent$SplitContractDraft$Cart$Item;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/math/BigDecimal;", "getCount", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    public static final class Creator implements Parcelable.Creator<YBSdkScreenIntent$SplitContractDraft> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$SplitContractDraft createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Cart createFromParcel = Cart.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new YBSdkScreenIntent$SplitContractDraft(createFromParcel, readString, readString2, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YBSdkScreenIntent$SplitContractDraft[] newArray(int i) {
            return new YBSdkScreenIntent$SplitContractDraft[i];
        }
    }

    public YBSdkScreenIntent$SplitContractDraft(Cart cart, String str, String str2, Boolean bool) {
        this.cart = cart;
        this.planConstructor = str;
        this.merchantID = str2;
        this.isPrepayment = bool;
    }

    public /* synthetic */ YBSdkScreenIntent$SplitContractDraft(Cart cart, String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cart, str, str2, (i & 8) != 0 ? null : bool);
    }
}
