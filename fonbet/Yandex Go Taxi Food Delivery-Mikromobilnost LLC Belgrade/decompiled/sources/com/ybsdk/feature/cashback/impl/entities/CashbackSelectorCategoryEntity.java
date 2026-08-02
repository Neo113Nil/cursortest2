package com.ybsdk.feature.cashback.impl.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.entities.types.CashbackSelectionType;
import com.ybsdk.feature.cashback.impl.entities.types.CategoryID;
import defpackage.ayg0;
import defpackage.ccv;
import defpackage.gav0;
import defpackage.jl40;
import defpackage.job1;
import defpackage.jv8;
import defpackage.n;
import defpackage.nbv;
import defpackage.pbv;
import defpackage.rbv;
import defpackage.rev;
import defpackage.unr0;
import defpackage.vfv;
import defpackage.x4e;
import defpackage.xm11;
import defpackage.xvz;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(JV\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ\u001a\u00100\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b:\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\b\u0010\u0010(R\u001d\u0010=\u001a\u00020<8\u0006¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010B\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/entities/CashbackSelectorCategoryEntity;", "Landroid/os/Parcelable;", "Lgav0;", "Lxm11;", "Lcom/ybsdk/feature/cashback/impl/entities/types/CategoryID;", "categoryId", "Lcom/ybsdk/core/utils/text/Text;", "title", "subtitle", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "imageUrl", "Lcom/ybsdk/feature/cashback/impl/entities/types/CashbackSelectionType;", "type", "", "percent", "", "isSelected", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/feature/cashback/impl/entities/types/CashbackSelectionType;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component4", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1-UWxl-Ug", "()Ljava/lang/String;", "component1", "component2", "()Lcom/ybsdk/core/utils/text/Text;", "component3", "component5", "()Lcom/ybsdk/feature/cashback/impl/entities/types/CashbackSelectionType;", "component6", "component7", "()Z", "copy-Fk0G6VU", "(Ljava/lang/String;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/utils/text/Text;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Lcom/ybsdk/feature/cashback/impl/entities/types/CashbackSelectionType;Ljava/lang/String;Z)Lcom/ybsdk/feature/cashback/impl/entities/CashbackSelectorCategoryEntity;", "copy", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCategoryId-UWxl-Ug", "Lcom/ybsdk/core/utils/text/Text;", "getTitle", "getSubtitle", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "Lcom/ybsdk/feature/cashback/impl/entities/types/CashbackSelectionType;", "getType", "getPercent", "Z", "Lrbv;", "image", "Lrbv;", "getImage", "()Lrbv;", "getImage$annotations", "()V", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CashbackSelectorCategoryEntity implements Parcelable, gav0, xm11 {
    public static final Parcelable.Creator<CashbackSelectorCategoryEntity> CREATOR = new Creator();
    private final String categoryId;
    private final rbv image;
    private final ThemedImageUrlEntity imageUrl;
    private final boolean isSelected;
    private final String percent;
    private final Text subtitle;
    private final Text title;
    private final CashbackSelectionType type;

    private CashbackSelectorCategoryEntity(String str, Text text, Text text2, ThemedImageUrlEntity themedImageUrlEntity, CashbackSelectionType cashbackSelectionType, String str2, boolean z) {
        this.categoryId = str;
        this.title = text;
        this.subtitle = text2;
        this.imageUrl = themedImageUrlEntity;
        this.type = cashbackSelectionType;
        this.percent = str2;
        this.isSelected = z;
        rbv f = job1.f(themedImageUrlEntity, new jv8(6));
        this.image = f == null ? new nbv(ayg0.ybsdk_cashback_item_placeholder, null) : f;
    }

    /* renamed from: component4, reason: from getter */
    private final ThemedImageUrlEntity getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: copy-Fk0G6VU$default, reason: not valid java name */
    public static /* synthetic */ CashbackSelectorCategoryEntity m377copyFk0G6VU$default(CashbackSelectorCategoryEntity cashbackSelectorCategoryEntity, String str, Text text, Text text2, ThemedImageUrlEntity themedImageUrlEntity, CashbackSelectionType cashbackSelectionType, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashbackSelectorCategoryEntity.categoryId;
        }
        if ((i & 2) != 0) {
            text = cashbackSelectorCategoryEntity.title;
        }
        if ((i & 4) != 0) {
            text2 = cashbackSelectorCategoryEntity.subtitle;
        }
        if ((i & 8) != 0) {
            themedImageUrlEntity = cashbackSelectorCategoryEntity.imageUrl;
        }
        if ((i & 16) != 0) {
            cashbackSelectionType = cashbackSelectorCategoryEntity.type;
        }
        if ((i & 32) != 0) {
            str2 = cashbackSelectorCategoryEntity.percent;
        }
        if ((i & 64) != 0) {
            z = cashbackSelectorCategoryEntity.isSelected;
        }
        String str3 = str2;
        boolean z2 = z;
        CashbackSelectionType cashbackSelectionType2 = cashbackSelectionType;
        Text text3 = text2;
        return cashbackSelectorCategoryEntity.m379copyFk0G6VU(str, text, text3, themedImageUrlEntity, cashbackSelectionType2, str3, z2);
    }

    public static /* synthetic */ void getImage$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rbv image$lambda$0(String str) {
        return new pbv(str, (ccv) null, rev.m, new ccv(ayg0.ybsdk_cashback_item_placeholder), (vfv) null, 50);
    }

    /* renamed from: component1-UWxl-Ug, reason: not valid java name and from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final Text getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final CashbackSelectionType getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPercent() {
        return this.percent;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: copy-Fk0G6VU, reason: not valid java name */
    public final CashbackSelectorCategoryEntity m379copyFk0G6VU(String categoryId, Text title, Text subtitle, ThemedImageUrlEntity imageUrl, CashbackSelectionType type, String percent, boolean isSelected) {
        return new CashbackSelectorCategoryEntity(categoryId, title, subtitle, imageUrl, type, percent, isSelected, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashbackSelectorCategoryEntity)) {
            return false;
        }
        CashbackSelectorCategoryEntity cashbackSelectorCategoryEntity = (CashbackSelectorCategoryEntity) other;
        return CategoryID.m401equalsimpl0(this.categoryId, cashbackSelectorCategoryEntity.categoryId) && jl40.l(this.title, cashbackSelectorCategoryEntity.title) && jl40.l(this.subtitle, cashbackSelectorCategoryEntity.subtitle) && jl40.l(this.imageUrl, cashbackSelectorCategoryEntity.imageUrl) && this.type == cashbackSelectorCategoryEntity.type && jl40.l(this.percent, cashbackSelectorCategoryEntity.percent) && this.isSelected == cashbackSelectorCategoryEntity.isSelected;
    }

    /* renamed from: getCategoryId-UWxl-Ug, reason: not valid java name */
    public final String m380getCategoryIdUWxlUg() {
        return this.categoryId;
    }

    public final rbv getImage() {
        return this.image;
    }

    public final String getPercent() {
        return this.percent;
    }

    public final Text getSubtitle() {
        return this.subtitle;
    }

    public final Text getTitle() {
        return this.title;
    }

    @Override // defpackage.xm11
    public CashbackSelectionType getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + unr0.b((this.type.hashCode() + xvz.c(this.imageUrl, n.c(this.subtitle, n.c(this.title, CategoryID.m402hashCodeimpl(this.categoryId) * 31, 31), 31), 31)) * 31, 31, this.percent);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        String m403toStringimpl = CategoryID.m403toStringimpl(this.categoryId);
        Text text = this.title;
        Text text2 = this.subtitle;
        ThemedImageUrlEntity themedImageUrlEntity = this.imageUrl;
        CashbackSelectionType cashbackSelectionType = this.type;
        String str = this.percent;
        boolean z = this.isSelected;
        StringBuilder sb = new StringBuilder("CashbackSelectorCategoryEntity(categoryId=");
        sb.append(m403toStringimpl);
        sb.append(", title=");
        sb.append(text);
        sb.append(", subtitle=");
        sb.append(text2);
        sb.append(", imageUrl=");
        sb.append(themedImageUrlEntity);
        sb.append(", type=");
        sb.append(cashbackSelectionType);
        sb.append(", percent=");
        sb.append(str);
        sb.append(", isSelected=");
        return x4e.i(sb, z, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        CategoryID.m404writeToParcelimpl(this.categoryId, dest, flags);
        dest.writeParcelable(this.title, flags);
        dest.writeParcelable(this.subtitle, flags);
        dest.writeParcelable(this.imageUrl, flags);
        dest.writeString(this.type.name());
        dest.writeString(this.percent);
        dest.writeInt(this.isSelected ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CashbackSelectorCategoryEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashbackSelectorCategoryEntity createFromParcel(Parcel parcel) {
            return new CashbackSelectorCategoryEntity(CategoryID.CREATOR.createFromParcel(parcel).m405unboximpl(), (Text) parcel.readParcelable(CashbackSelectorCategoryEntity.class.getClassLoader()), (Text) parcel.readParcelable(CashbackSelectorCategoryEntity.class.getClassLoader()), (ThemedImageUrlEntity) parcel.readParcelable(CashbackSelectorCategoryEntity.class.getClassLoader()), CashbackSelectionType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashbackSelectorCategoryEntity[] newArray(int i) {
            return new CashbackSelectorCategoryEntity[i];
        }
    }

    public /* synthetic */ CashbackSelectorCategoryEntity(String str, Text text, Text text2, ThemedImageUrlEntity themedImageUrlEntity, CashbackSelectionType cashbackSelectionType, String str2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, text, text2, themedImageUrlEntity, cashbackSelectionType, str2, z);
    }
}
