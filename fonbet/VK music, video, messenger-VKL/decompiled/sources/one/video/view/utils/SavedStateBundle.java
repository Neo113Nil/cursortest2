package one.video.view.utils;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: SavedStateBundle.kt */
/* loaded from: classes8.dex */
public final class SavedStateBundle extends View.BaseSavedState {
    public static final a CREATOR = new a();
    public final Bundle b;

    /* compiled from: SavedStateBundle.kt */
    public static final class a implements Parcelable.Creator<SavedStateBundle> {
        @Override // android.os.Parcelable.Creator
        public final SavedStateBundle createFromParcel(Parcel parcel) {
            return new SavedStateBundle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SavedStateBundle[] newArray(int i) {
            return new SavedStateBundle[i];
        }
    }

    public SavedStateBundle(Parcelable parcelable, Bundle bundle) {
        super(parcelable);
        this.b = bundle;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.b);
    }

    public SavedStateBundle(Parcel parcel) {
        super(parcel);
        this.b = parcel.readBundle(SavedStateBundle.class.getClassLoader());
    }
}
