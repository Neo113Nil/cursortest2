package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
class ActionMenuPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator<ActionMenuPresenter$SavedState> CREATOR = new Parcelable.Creator<ActionMenuPresenter$SavedState>() { // from class: androidx.appcompat.widget.ActionMenuPresenter$SavedState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActionMenuPresenter$SavedState createFromParcel(Parcel parcel) {
            return new ActionMenuPresenter$SavedState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActionMenuPresenter$SavedState[] newArray(int i) {
            return new ActionMenuPresenter$SavedState[i];
        }
    };
    public int openSubMenuId;

    public ActionMenuPresenter$SavedState(Parcel parcel) {
        this.openSubMenuId = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.openSubMenuId);
    }

    public ActionMenuPresenter$SavedState() {
    }
}
