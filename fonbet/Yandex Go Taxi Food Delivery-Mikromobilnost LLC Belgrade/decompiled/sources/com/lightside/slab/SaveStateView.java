package com.lightside.slab;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import android.view.View;
import com.lightside.slab.SaveStateView;
import defpackage.ins0;
import defpackage.jl40;
import defpackage.ny61;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/lightside/slab/SaveStateView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Lins0;", "slab", "<init>", "(Landroid/content/Context;Lins0;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "parcelable", "Lzy11;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lins0;", "SavedState", "slab_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SaveStateView extends View {
    private final ins0 slab;

    public SaveStateView(Context context, ins0 ins0Var) {
        super(context);
        this.slab = ins0Var;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        if (jl40.l(savedState.getSlabClassName(), this.slab.getClass().getName())) {
            ins0 ins0Var = this.slab;
            String instanceId = savedState.getInstanceId();
            Bundle bundle = savedState.getBundle();
            ins0Var.getClass();
            String str = ins0Var.y;
            if (str != null) {
                str.equals(instanceId);
            }
            ins0Var.y = instanceId;
            ins0Var.w = bundle;
        }
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        ins0 ins0Var = this.slab;
        ins0Var.i(bundle);
        String str = ins0Var.y;
        if (str == null) {
            str = UUID.randomUUID().toString();
            ins0Var.y = str;
        }
        return new SavedState(super.onSaveInstanceState(), this.slab.getClass().getName(), str, bundle);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B+\b\u0010\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/lightside/slab/SaveStateView$SavedState;", "Landroid/view/AbsSavedState;", "Landroid/os/Parcel;", "inParcel", "<init>", "(Landroid/os/Parcel;)V", "Landroid/os/Parcelable;", "superState", "", "clsName", "instanceId", "Landroid/os/Bundle;", "bundle", "(Landroid/os/Parcelable;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "slabClassName", "Ljava/lang/String;", "getSlabClassName", "()Ljava/lang/String;", "getInstanceId", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "Companion", "com/lightside/slab/b", "slab_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {
        private final Bundle bundle;
        private final String instanceId;
        private final String slabClassName;
        public static final b Companion = new b();
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.lightside.slab.SaveStateView$SavedState$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SaveStateView.SavedState createFromParcel(Parcel inParcel) {
                return new SaveStateView.SavedState(inParcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SaveStateView.SavedState[] newArray(int size) {
                return new SaveStateView.SavedState[size];
            }
        };

        public SavedState(Parcel parcel) {
            super(parcel);
            String readString = parcel.readString();
            if (readString == null) {
                ny61.r("Can't read slabClassName");
                throw null;
            }
            this.slabClassName = readString;
            String readString2 = parcel.readString();
            if (readString2 == null) {
                ny61.r("Can't read instanceId");
                throw null;
            }
            this.instanceId = readString2;
            Bundle readBundle = parcel.readBundle(SavedState.class.getClassLoader());
            if (readBundle != null) {
                this.bundle = readBundle;
            } else {
                ny61.r("Can't read bundle");
                throw null;
            }
        }

        public final Bundle getBundle() {
            return this.bundle;
        }

        public final String getInstanceId() {
            return this.instanceId;
        }

        public final String getSlabClassName() {
            return this.slabClassName;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeString(this.slabClassName);
            dest.writeString(this.instanceId);
            dest.writeBundle(this.bundle);
        }

        public SavedState(Parcelable parcelable, String str, String str2, Bundle bundle) {
            super(parcelable);
            this.slabClassName = str;
            this.instanceId = str2;
            this.bundle = bundle;
        }
    }
}
