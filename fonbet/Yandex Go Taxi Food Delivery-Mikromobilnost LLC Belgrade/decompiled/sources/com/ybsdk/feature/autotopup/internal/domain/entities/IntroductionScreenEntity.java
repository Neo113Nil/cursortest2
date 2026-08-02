package com.ybsdk.feature.autotopup.internal.domain.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.vfc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJB\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\u0015J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u001d¨\u0006/"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/domain/entities/IntroductionScreenEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "image", "", "title", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "button", "", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/IntroductionItemEntity;", "items", "<init>", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "component4", "()Ljava/util/List;", "copy", "(Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;Ljava/util/List;)Lcom/ybsdk/feature/autotopup/internal/domain/entities/IntroductionScreenEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getImage", "Ljava/lang/String;", "getTitle", "Lcom/ybsdk/core/common/domain/entities/ActionButtonEntity;", "getButton", "Ljava/util/List;", "getItems", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IntroductionScreenEntity implements Parcelable {
    public static final Parcelable.Creator<IntroductionScreenEntity> CREATOR = new Creator();
    private final ActionButtonEntity button;
    private final ThemedImageUrlEntity image;
    private final List<IntroductionItemEntity> items;
    private final String title;

    public IntroductionScreenEntity(ThemedImageUrlEntity themedImageUrlEntity, String str, ActionButtonEntity actionButtonEntity, List<IntroductionItemEntity> list) {
        this.image = themedImageUrlEntity;
        this.title = str;
        this.button = actionButtonEntity;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntroductionScreenEntity copy$default(IntroductionScreenEntity introductionScreenEntity, ThemedImageUrlEntity themedImageUrlEntity, String str, ActionButtonEntity actionButtonEntity, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            themedImageUrlEntity = introductionScreenEntity.image;
        }
        if ((i & 2) != 0) {
            str = introductionScreenEntity.title;
        }
        if ((i & 4) != 0) {
            actionButtonEntity = introductionScreenEntity.button;
        }
        if ((i & 8) != 0) {
            list = introductionScreenEntity.items;
        }
        return introductionScreenEntity.copy(themedImageUrlEntity, str, actionButtonEntity, list);
    }

    /* renamed from: component1, reason: from getter */
    public final ThemedImageUrlEntity getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final ActionButtonEntity getButton() {
        return this.button;
    }

    public final List<IntroductionItemEntity> component4() {
        return this.items;
    }

    public final IntroductionScreenEntity copy(ThemedImageUrlEntity image, String title, ActionButtonEntity button, List<IntroductionItemEntity> items) {
        return new IntroductionScreenEntity(image, title, button, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntroductionScreenEntity)) {
            return false;
        }
        IntroductionScreenEntity introductionScreenEntity = (IntroductionScreenEntity) other;
        return jl40.l(this.image, introductionScreenEntity.image) && jl40.l(this.title, introductionScreenEntity.title) && jl40.l(this.button, introductionScreenEntity.button) && jl40.l(this.items, introductionScreenEntity.items);
    }

    public final ActionButtonEntity getButton() {
        return this.button;
    }

    public final ThemedImageUrlEntity getImage() {
        return this.image;
    }

    public final List<IntroductionItemEntity> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        ThemedImageUrlEntity themedImageUrlEntity = this.image;
        int b = unr0.b((themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode()) * 31, 31, this.title);
        ActionButtonEntity actionButtonEntity = this.button;
        return this.items.hashCode() + ((b + (actionButtonEntity != null ? actionButtonEntity.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "IntroductionScreenEntity(image=" + this.image + ", title=" + this.title + ", button=" + this.button + ", items=" + this.items + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.image, flags);
        dest.writeString(this.title);
        dest.writeParcelable(this.button, flags);
        Iterator t = vfc.t(dest, this.items);
        while (t.hasNext()) {
            ((IntroductionItemEntity) t.next()).writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IntroductionScreenEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntroductionScreenEntity createFromParcel(Parcel parcel) {
            ThemedImageUrlEntity themedImageUrlEntity = (ThemedImageUrlEntity) parcel.readParcelable(IntroductionScreenEntity.class.getClassLoader());
            String readString = parcel.readString();
            ActionButtonEntity actionButtonEntity = (ActionButtonEntity) parcel.readParcelable(IntroductionScreenEntity.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = oo31.d(IntroductionItemEntity.CREATOR, parcel, arrayList, i, 1);
            }
            return new IntroductionScreenEntity(themedImageUrlEntity, readString, actionButtonEntity, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntroductionScreenEntity[] newArray(int i) {
            return new IntroductionScreenEntity[i];
        }
    }
}
