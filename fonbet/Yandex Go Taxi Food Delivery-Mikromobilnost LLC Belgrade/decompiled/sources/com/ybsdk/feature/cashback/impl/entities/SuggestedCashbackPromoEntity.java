package com.ybsdk.feature.cashback.impl.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.entities.types.PromoID;
import com.ybsdk.feature.cashback.impl.entities.types.PromoType;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.n;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"JR\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010\u0019J\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010\u0017J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b0\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u0017R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\"¨\u00068"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/entities/SuggestedCashbackPromoEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/cashback/impl/entities/types/PromoID;", "promoId", "Lcom/ybsdk/feature/cashback/impl/entities/types/PromoType;", "promoType", "Lcom/ybsdk/core/utils/text/Text;", "title", "subtitle", "", "maxCategories", "", "Lcom/ybsdk/feature/cashback/impl/entities/CashbackSelectorCategoryEntity;", "categories", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;ILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1-y5i_914", "()Ljava/lang/String;", "component1", "component2-bAW3nNs", "component2", "component3", "()Lcom/ybsdk/core/utils/text/Text;", "component4", "component5", "component6", "()Ljava/util/List;", "copy-b6wil7M", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;ILjava/util/List;)Lcom/ybsdk/feature/cashback/impl/entities/SuggestedCashbackPromoEntity;", "copy", "", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPromoId-y5i_914", "getPromoType-bAW3nNs", "Lcom/ybsdk/core/utils/text/Text;", "getTitle", "getSubtitle", CA20Status.STATUS_USER_I, "getMaxCategories", "Ljava/util/List;", "getCategories", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SuggestedCashbackPromoEntity implements Parcelable {
    public static final Parcelable.Creator<SuggestedCashbackPromoEntity> CREATOR = new Creator();
    private final List<CashbackSelectorCategoryEntity> categories;
    private final int maxCategories;
    private final String promoId;
    private final String promoType;
    private final Text subtitle;
    private final Text title;

    private SuggestedCashbackPromoEntity(String str, String str2, Text text, Text text2, int i, List<CashbackSelectorCategoryEntity> list) {
        this.promoId = str;
        this.promoType = str2;
        this.title = text;
        this.subtitle = text2;
        this.maxCategories = i;
        this.categories = list;
    }

    /* renamed from: copy-b6wil7M$default, reason: not valid java name */
    public static /* synthetic */ SuggestedCashbackPromoEntity m381copyb6wil7M$default(SuggestedCashbackPromoEntity suggestedCashbackPromoEntity, String str, String str2, Text text, Text text2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = suggestedCashbackPromoEntity.promoId;
        }
        if ((i2 & 2) != 0) {
            str2 = suggestedCashbackPromoEntity.promoType;
        }
        if ((i2 & 4) != 0) {
            text = suggestedCashbackPromoEntity.title;
        }
        if ((i2 & 8) != 0) {
            text2 = suggestedCashbackPromoEntity.subtitle;
        }
        if ((i2 & 16) != 0) {
            i = suggestedCashbackPromoEntity.maxCategories;
        }
        if ((i2 & 32) != 0) {
            list = suggestedCashbackPromoEntity.categories;
        }
        int i3 = i;
        List list2 = list;
        return suggestedCashbackPromoEntity.m384copyb6wil7M(str, str2, text, text2, i3, list2);
    }

    /* renamed from: component1-y5i_914, reason: not valid java name and from getter */
    public final String getPromoId() {
        return this.promoId;
    }

    /* renamed from: component2-bAW3nNs, reason: not valid java name and from getter */
    public final String getPromoType() {
        return this.promoType;
    }

    /* renamed from: component3, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final Text getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxCategories() {
        return this.maxCategories;
    }

    public final List<CashbackSelectorCategoryEntity> component6() {
        return this.categories;
    }

    /* renamed from: copy-b6wil7M, reason: not valid java name */
    public final SuggestedCashbackPromoEntity m384copyb6wil7M(String promoId, String promoType, Text title, Text subtitle, int maxCategories, List<CashbackSelectorCategoryEntity> categories) {
        return new SuggestedCashbackPromoEntity(promoId, promoType, title, subtitle, maxCategories, categories, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestedCashbackPromoEntity)) {
            return false;
        }
        SuggestedCashbackPromoEntity suggestedCashbackPromoEntity = (SuggestedCashbackPromoEntity) other;
        return PromoID.m411equalsimpl0(this.promoId, suggestedCashbackPromoEntity.promoId) && PromoType.m421equalsimpl0(this.promoType, suggestedCashbackPromoEntity.promoType) && jl40.l(this.title, suggestedCashbackPromoEntity.title) && jl40.l(this.subtitle, suggestedCashbackPromoEntity.subtitle) && this.maxCategories == suggestedCashbackPromoEntity.maxCategories && jl40.l(this.categories, suggestedCashbackPromoEntity.categories);
    }

    public final List<CashbackSelectorCategoryEntity> getCategories() {
        return this.categories;
    }

    public final int getMaxCategories() {
        return this.maxCategories;
    }

    /* renamed from: getPromoId-y5i_914, reason: not valid java name */
    public final String m385getPromoIdy5i_914() {
        return this.promoId;
    }

    /* renamed from: getPromoType-bAW3nNs, reason: not valid java name */
    public final String m386getPromoTypebAW3nNs() {
        return this.promoType;
    }

    public final Text getSubtitle() {
        return this.subtitle;
    }

    public final Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.categories.hashCode() + oyr.b(this.maxCategories, n.c(this.subtitle, n.c(this.title, (PromoType.m422hashCodeimpl(this.promoType) + (PromoID.m412hashCodeimpl(this.promoId) * 31)) * 31, 31), 31), 31);
    }

    public String toString() {
        String m413toStringimpl = PromoID.m413toStringimpl(this.promoId);
        String m423toStringimpl = PromoType.m423toStringimpl(this.promoType);
        Text text = this.title;
        Text text2 = this.subtitle;
        int i = this.maxCategories;
        List<CashbackSelectorCategoryEntity> list = this.categories;
        StringBuilder v = b64.v("SuggestedCashbackPromoEntity(promoId=", m413toStringimpl, ", promoType=", m423toStringimpl, ", title=");
        ly3.C(v, text, ", subtitle=", text2, ", maxCategories=");
        v.append(i);
        v.append(", categories=");
        v.append(list);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        PromoID.m414writeToParcelimpl(this.promoId, dest, flags);
        PromoType.m424writeToParcelimpl(this.promoType, dest, flags);
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.subtitle, flags);
        dest.writeInt(this.maxCategories);
        Iterator t = vfc.t(dest, this.categories);
        while (t.hasNext()) {
            ((CashbackSelectorCategoryEntity) t.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SuggestedCashbackPromoEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuggestedCashbackPromoEntity createFromParcel(Parcel parcel) {
            String m415unboximpl = PromoID.CREATOR.createFromParcel(parcel).m415unboximpl();
            String m425unboximpl = PromoType.CREATOR.createFromParcel(parcel).m425unboximpl();
            Text text = (Text) parcel.readParcelable(SuggestedCashbackPromoEntity.class.getClassLoader());
            Text text2 = (Text) parcel.readParcelable(SuggestedCashbackPromoEntity.class.getClassLoader());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = oo31.d(CashbackSelectorCategoryEntity.CREATOR, parcel, arrayList, i, 1);
            }
            return new SuggestedCashbackPromoEntity(m415unboximpl, m425unboximpl, text, text2, readInt, arrayList, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuggestedCashbackPromoEntity[] newArray(int i) {
            return new SuggestedCashbackPromoEntity[i];
        }
    }

    public /* synthetic */ SuggestedCashbackPromoEntity(String str, String str2, Text text, Text text2, int i, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, text, text2, i, list);
    }
}
