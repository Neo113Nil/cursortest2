package androidx.appcompat.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
class AppCompatDelegateImpl$PanelFeatureState$SavedState implements Parcelable {
    public static final Parcelable.Creator<AppCompatDelegateImpl$PanelFeatureState$SavedState> CREATOR = new Parcelable.ClassLoaderCreator<AppCompatDelegateImpl$PanelFeatureState$SavedState>() { // from class: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState.1
        @Override // android.os.Parcelable.Creator
        public AppCompatDelegateImpl$PanelFeatureState$SavedState createFromParcel(Parcel parcel) {
            return AppCompatDelegateImpl$PanelFeatureState$SavedState.readFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public AppCompatDelegateImpl$PanelFeatureState$SavedState[] newArray(int i) {
            return new AppCompatDelegateImpl$PanelFeatureState$SavedState[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public AppCompatDelegateImpl$PanelFeatureState$SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return AppCompatDelegateImpl$PanelFeatureState$SavedState.readFromParcel(parcel, classLoader);
        }
    };
    int featureId;
    boolean isOpen;
    Bundle menuState;

    public static AppCompatDelegateImpl$PanelFeatureState$SavedState readFromParcel(Parcel parcel, ClassLoader classLoader) {
        AppCompatDelegateImpl$PanelFeatureState$SavedState appCompatDelegateImpl$PanelFeatureState$SavedState = new AppCompatDelegateImpl$PanelFeatureState$SavedState();
        appCompatDelegateImpl$PanelFeatureState$SavedState.featureId = parcel.readInt();
        boolean z = parcel.readInt() == 1;
        appCompatDelegateImpl$PanelFeatureState$SavedState.isOpen = z;
        if (z) {
            appCompatDelegateImpl$PanelFeatureState$SavedState.menuState = parcel.readBundle(classLoader);
        }
        return appCompatDelegateImpl$PanelFeatureState$SavedState;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.featureId);
        parcel.writeInt(this.isOpen ? 1 : 0);
        if (this.isOpen) {
            parcel.writeBundle(this.menuState);
        }
    }
}
