package com.ybsdk.feature.transactions.impl.ui.screens.feed;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/ui/screens/feed/TransactionsFeedScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/feature/transactions/api/entities/TransactionsFeedFilterEntity;", "filter", "", "showTabbar", "hideFilters", "<init>", "(Lcom/ybsdk/feature/transactions/api/entities/TransactionsFeedFilterEntity;ZZ)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/ybsdk/feature/transactions/api/entities/TransactionsFeedFilterEntity;", "getFilter", "()Lcom/ybsdk/feature/transactions/api/entities/TransactionsFeedFilterEntity;", "Z", "getShowTabbar", "()Z", "getHideFilters", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransactionsFeedScreenParams implements ScreenParams {
    public static final Parcelable.Creator<TransactionsFeedScreenParams> CREATOR = new Creator();
    private final TransactionsFeedFilterEntity filter;
    private final boolean hideFilters;
    private final boolean showTabbar;

    public TransactionsFeedScreenParams(TransactionsFeedFilterEntity transactionsFeedFilterEntity, boolean z, boolean z2) {
        this.filter = transactionsFeedFilterEntity;
        this.showTabbar = z;
        this.hideFilters = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TransactionsFeedFilterEntity getFilter() {
        return this.filter;
    }

    public final boolean getHideFilters() {
        return this.hideFilters;
    }

    public final boolean getShowTabbar() {
        return this.showTabbar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.filter, flags);
        dest.writeInt(this.showTabbar ? 1 : 0);
        dest.writeInt(this.hideFilters ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TransactionsFeedScreenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionsFeedScreenParams createFromParcel(Parcel parcel) {
            return new TransactionsFeedScreenParams((TransactionsFeedFilterEntity) parcel.readParcelable(TransactionsFeedScreenParams.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionsFeedScreenParams[] newArray(int i) {
            return new TransactionsFeedScreenParams[i];
        }
    }
}
