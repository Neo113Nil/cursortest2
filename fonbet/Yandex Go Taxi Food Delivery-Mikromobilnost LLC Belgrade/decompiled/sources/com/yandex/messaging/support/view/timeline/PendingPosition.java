package com.yandex.messaging.support.view.timeline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.z83;

/* loaded from: classes15.dex */
public final class PendingPosition implements Parcelable {
    public static final Parcelable.Creator<PendingPosition> CREATOR = new Parcelable.Creator<PendingPosition>() { // from class: com.yandex.messaging.support.view.timeline.PendingPosition.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingPosition createFromParcel(Parcel parcel) {
            return new PendingPosition(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PendingPosition[] newArray(int i) {
            return new PendingPosition[i];
        }
    };
    private boolean anchoredToBottom;
    int bottomOffset;
    boolean bottomOffsetSpecified;
    int bottomPosition;
    int preserveOffset;
    boolean preserveOffsetSpecified;
    int preservePosition;
    int topPosition;
    int visiblePosition;

    public PendingPosition(Parcel parcel) {
        this.visiblePosition = parcel.readInt();
        this.bottomPosition = parcel.readInt();
        this.bottomOffset = parcel.readInt();
        this.topPosition = parcel.readInt();
        this.anchoredToBottom = parcel.readInt() != 0;
        this.preservePosition = parcel.readInt();
        this.preserveOffset = parcel.readInt();
        this.preserveOffsetSpecified = parcel.readInt() != 0;
    }

    private int recalculatePositionOnItemsAdded(int i, int i2, int i3) {
        return i >= i2 ? i + i3 : i;
    }

    private int recalculatePositionOnItemsRemoved(int i, int i2, int i3) {
        return i >= i2 ? i - i3 : i;
    }

    public PendingPosition copy() {
        PendingPosition pendingPosition = new PendingPosition();
        pendingPosition.visiblePosition = this.visiblePosition;
        pendingPosition.bottomPosition = this.bottomPosition;
        pendingPosition.bottomOffset = this.bottomOffset;
        pendingPosition.topPosition = this.topPosition;
        pendingPosition.anchoredToBottom = this.anchoredToBottom;
        pendingPosition.preservePosition = this.preservePosition;
        pendingPosition.preserveOffset = this.preserveOffset;
        pendingPosition.preserveOffsetSpecified = this.preserveOffsetSpecified;
        return pendingPosition;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean hasValidBottomPosition(RecyclerView.k kVar) {
        int i = this.bottomPosition;
        return i != -1 && i >= 0 && i < kVar.b();
    }

    public boolean hasValidPreservePosition(RecyclerView.k kVar) {
        int i = this.preservePosition;
        return i != -1 && i >= 0 && i < kVar.b();
    }

    public boolean hasValidTopPosition(RecyclerView.k kVar) {
        int i = this.topPosition;
        return i != -1 && i >= 0 && i < kVar.b();
    }

    public boolean hasValidVisiblePosition(RecyclerView.k kVar) {
        int i = this.visiblePosition;
        return i != -1 && i >= 0 && i < kVar.b();
    }

    public boolean isEmpty() {
        return this.visiblePosition == -1 && this.bottomPosition == -1 && this.topPosition == -1 && this.preservePosition == -1;
    }

    public void makeAnchoredAtBottom() {
        reset();
        this.bottomPosition = 0;
        this.bottomOffset = 0;
        this.anchoredToBottom = true;
    }

    public void makeAtBottom(int i, int i2) {
        reset();
        this.bottomPosition = i;
        this.bottomOffset = i2;
        this.bottomOffsetSpecified = true;
    }

    public void makeAtTop(int i) {
        reset();
        this.topPosition = i;
    }

    public void makePreserve(int i) {
        reset();
        this.preservePosition = i;
    }

    public void makePreserveWithOffset(int i, int i2) {
        reset();
        this.preservePosition = i;
        this.preserveOffset = i2;
        this.preserveOffsetSpecified = true;
    }

    public void makeVisible(int i) {
        reset();
        this.visiblePosition = i;
    }

    public void onItemsAdded(int i, int i2) {
        if (this.anchoredToBottom) {
            z83.h("only anchor to first item supported", this.bottomOffset == 0);
            z83.h("only anchor to first item supported", this.bottomPosition == 0);
            return;
        }
        int i3 = this.visiblePosition;
        if (i3 != -1) {
            this.visiblePosition = recalculatePositionOnItemsAdded(i3, i, i2);
            return;
        }
        int i4 = this.bottomPosition;
        if (i4 != -1) {
            this.bottomPosition = recalculatePositionOnItemsAdded(i4, i, i2);
            return;
        }
        int i5 = this.topPosition;
        if (i5 != -1) {
            this.topPosition = recalculatePositionOnItemsAdded(i5, i, i2);
            return;
        }
        int i6 = this.preservePosition;
        if (i6 != -1) {
            this.preservePosition = recalculatePositionOnItemsAdded(i6, i, i2);
        }
    }

    public void onItemsRemoved(int i, int i2) {
        if (this.anchoredToBottom) {
            z83.h("only anchor to first item supported", this.bottomOffset == 0);
            z83.h("only anchor to first item supported", this.bottomPosition == 0);
            return;
        }
        int i3 = this.visiblePosition;
        if (i3 != -1) {
            this.visiblePosition = recalculatePositionOnItemsRemoved(i3, i, i2);
            return;
        }
        int i4 = this.bottomPosition;
        if (i4 != -1) {
            this.bottomPosition = recalculatePositionOnItemsRemoved(i4, i, i2);
            return;
        }
        int i5 = this.topPosition;
        if (i5 != -1) {
            this.topPosition = recalculatePositionOnItemsRemoved(i5, i, i2);
            return;
        }
        int i6 = this.preservePosition;
        if (i6 != -1) {
            this.preservePosition = recalculatePositionOnItemsRemoved(i6, i, i2);
        }
    }

    public void reset() {
        this.visiblePosition = -1;
        this.topPosition = -1;
        this.bottomPosition = -1;
        this.preservePosition = -1;
        this.bottomOffset = 0;
        this.bottomOffsetSpecified = false;
        this.preserveOffset = 0;
        this.preserveOffsetSpecified = false;
        this.anchoredToBottom = false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.visiblePosition);
        parcel.writeInt(this.bottomPosition);
        parcel.writeInt(this.bottomOffset);
        parcel.writeInt(this.topPosition);
        parcel.writeInt(this.anchoredToBottom ? 1 : 0);
        parcel.writeInt(this.preservePosition);
        parcel.writeInt(this.preserveOffset);
        parcel.writeInt(this.preserveOffsetSpecified ? 1 : 0);
    }

    public void makeAtBottom(int i) {
        reset();
        this.bottomPosition = i;
    }

    public PendingPosition() {
        reset();
    }
}
