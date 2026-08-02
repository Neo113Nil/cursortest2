package com.ybsdk.feature.transfer.version2.api.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/TransferQuickActionEntity;", "Landroid/os/Parcelable;", "", "title", "", "actions", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "icon", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;)Lcom/ybsdk/feature/transfer/version2/api/entities/TransferQuickActionEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getActions", "Lcom/ybsdk/core/common/domain/entities/ThemedImageUrlEntity;", "getIcon", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransferQuickActionEntity implements Parcelable {
    public static final Parcelable.Creator<TransferQuickActionEntity> CREATOR = new Creator();
    private final List<String> actions;
    private final ThemedImageUrlEntity icon;
    private final String title;

    public TransferQuickActionEntity(String str, List<String> list, ThemedImageUrlEntity themedImageUrlEntity) {
        this.title = str;
        this.actions = list;
        this.icon = themedImageUrlEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransferQuickActionEntity copy$default(TransferQuickActionEntity transferQuickActionEntity, String str, List list, ThemedImageUrlEntity themedImageUrlEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transferQuickActionEntity.title;
        }
        if ((i & 2) != 0) {
            list = transferQuickActionEntity.actions;
        }
        if ((i & 4) != 0) {
            themedImageUrlEntity = transferQuickActionEntity.icon;
        }
        return transferQuickActionEntity.copy(str, list, themedImageUrlEntity);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<String> component2() {
        return this.actions;
    }

    /* renamed from: component3, reason: from getter */
    public final ThemedImageUrlEntity getIcon() {
        return this.icon;
    }

    public final TransferQuickActionEntity copy(String title, List<String> actions, ThemedImageUrlEntity icon) {
        return new TransferQuickActionEntity(title, actions, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferQuickActionEntity)) {
            return false;
        }
        TransferQuickActionEntity transferQuickActionEntity = (TransferQuickActionEntity) other;
        return jl40.l(this.title, transferQuickActionEntity.title) && jl40.l(this.actions, transferQuickActionEntity.actions) && jl40.l(this.icon, transferQuickActionEntity.icon);
    }

    public final List<String> getActions() {
        return this.actions;
    }

    public final ThemedImageUrlEntity getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.icon.hashCode() + unr0.c(this.title.hashCode() * 31, 31, this.actions);
    }

    public String toString() {
        String str = this.title;
        List<String> list = this.actions;
        ThemedImageUrlEntity themedImageUrlEntity = this.icon;
        StringBuilder r = xvz.r("TransferQuickActionEntity(title=", str, ", actions=", list, ", icon=");
        r.append(themedImageUrlEntity);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeStringList(this.actions);
        dest.writeParcelable(this.icon, flags);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransferQuickActionEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferQuickActionEntity createFromParcel(Parcel parcel) {
            return new TransferQuickActionEntity(parcel.readString(), parcel.createStringArrayList(), (ThemedImageUrlEntity) parcel.readParcelable(TransferQuickActionEntity.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferQuickActionEntity[] newArray(int i) {
            return new TransferQuickActionEntity[i];
        }
    }
}
