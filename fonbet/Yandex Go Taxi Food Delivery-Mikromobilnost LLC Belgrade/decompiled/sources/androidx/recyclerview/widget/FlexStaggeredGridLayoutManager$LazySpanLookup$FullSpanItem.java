package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes10.dex */
class FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new Parcelable.Creator<FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem>() { // from class: androidx.recyclerview.widget.FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem createFromParcel(Parcel parcel) {
            return new FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[] newArray(int i) {
            return new FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
        }
    };
    int mGapDir;
    int[] mGapPerSpan;
    boolean mHasUnwantedGapAfter;
    int mPosition;

    public FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel parcel) {
        this.mPosition = parcel.readInt();
        this.mGapDir = parcel.readInt();
        this.mHasUnwantedGapAfter = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.mGapPerSpan = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getGapForSpan(int i) {
        int[] iArr = this.mGapPerSpan;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    public String toString() {
        return "FullSpanItem{mPosition=" + this.mPosition + ", mGapDir=" + this.mGapDir + ", mHasUnwantedGapAfter=" + this.mHasUnwantedGapAfter + ", mGapPerSpan=" + Arrays.toString(this.mGapPerSpan) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mPosition);
        parcel.writeInt(this.mGapDir);
        parcel.writeInt(this.mHasUnwantedGapAfter ? 1 : 0);
        int[] iArr = this.mGapPerSpan;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.mGapPerSpan);
        }
    }

    public FlexStaggeredGridLayoutManager$LazySpanLookup$FullSpanItem() {
    }
}
