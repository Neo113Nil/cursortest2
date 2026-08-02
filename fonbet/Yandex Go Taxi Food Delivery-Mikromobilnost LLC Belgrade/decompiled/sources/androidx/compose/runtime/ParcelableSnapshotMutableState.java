package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d3t0;
import defpackage.e3t0;
import defpackage.jl40;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.x4c;
import defpackage.xw91;
import defpackage.yd90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Ld3t0;", "Landroid/os/Parcelable;", "value", "Le3t0;", "policy", "<init>", "(Ljava/lang/Object;Le3t0;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "yd90", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableState<T> extends d3t0 implements Parcelable {
    private static final int PolicyNeverEquals = 0;
    private static final int PolicyReferentialEquality = 2;
    private static final int PolicyStructuralEquality = 1;
    public static final yd90 Companion = new yd90();
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader loader) {
            e3t0 e3t0Var;
            if (loader == null) {
                loader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
            }
            Object readValue = parcel.readValue(loader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                e3t0Var = x4c.Q;
            } else if (readInt == 1) {
                e3t0Var = ngd0.F;
            } else {
                if (readInt != 2) {
                    ny61.r(oyr.j(readInt, "Unsupported MutableState policy ", " was restored"));
                    return null;
                }
                e3t0Var = xw91.D;
            }
            return new ParcelableSnapshotMutableState<>(readValue, e3t0Var);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableState<Object>[] newArray(int size) {
            return new ParcelableSnapshotMutableState[size];
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    };

    public ParcelableSnapshotMutableState(T t, e3t0 e3t0Var) {
        super(t, e3t0Var);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int i;
        parcel.writeValue(getValue());
        e3t0 policy = getPolicy();
        if (jl40.l(policy, x4c.Q)) {
            i = 0;
        } else if (jl40.l(policy, ngd0.F)) {
            i = 1;
        } else {
            if (!jl40.l(policy, xw91.D)) {
                ny61.r("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i = 2;
        }
        parcel.writeInt(i);
    }
}
