package com.yandex.bricks;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import android.view.View;
import java.util.Objects;

/* loaded from: classes11.dex */
class SaveStateView extends View {
    private final Brick mBrick;

    public SaveStateView(Context context, Brick brick) {
        super(context);
        this.mBrick = brick;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        if (savedState.brickClassName.equals(this.mBrick.getClass().getName())) {
            this.mBrick.setRestoredInstanceState(savedState.instanceId, savedState.bundle);
        }
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        String saveInstanceState = this.mBrick.saveInstanceState(bundle);
        return new SavedState(super.onSaveInstanceState(), this.mBrick.getClass().getName(), saveInstanceState, bundle);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.yandex.bricks.SaveStateView.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        final String brickClassName;
        final Bundle bundle;
        final String instanceId;

        public SavedState(Parcel parcel) {
            super(parcel);
            String readString = parcel.readString();
            Objects.requireNonNull(readString);
            this.brickClassName = readString;
            String readString2 = parcel.readString();
            Objects.requireNonNull(readString2);
            this.instanceId = readString2;
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            Objects.requireNonNull(readBundle);
            this.bundle = readBundle;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.brickClassName);
            parcel.writeString(this.instanceId);
            parcel.writeBundle(this.bundle);
        }

        public SavedState(Parcelable parcelable, String str, String str2, Bundle bundle) {
            super(parcelable);
            this.brickClassName = str;
            this.instanceId = str2;
            this.bundle = bundle;
        }
    }
}
