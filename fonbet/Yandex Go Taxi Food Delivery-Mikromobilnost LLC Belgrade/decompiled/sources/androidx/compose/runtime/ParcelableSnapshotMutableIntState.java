package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wd90;
import defpackage.y2t0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Ly2t0;", "Landroid/os/Parcelable;", "", "value", "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "wd90", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableIntState extends y2t0 implements Parcelable {
    public static final wd90 Companion = new wd90();
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new Parcelable.Creator<ParcelableSnapshotMutableIntState>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableIntState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableIntState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableIntState(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableIntState[] newArray(int size) {
            return new ParcelableSnapshotMutableIntState[size];
        }
    };

    public ParcelableSnapshotMutableIntState(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // defpackage.yx40, defpackage.n6w, defpackage.m3u0
    public Integer getValue() {
        return Integer.valueOf(getIntValue());
    }

    @Override // defpackage.oz40
    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        setValue(((Number) obj).intValue());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(getIntValue());
    }

    @Override // defpackage.m3u0
    public /* bridge */ /* synthetic */ Object getValue() {
        return getValue();
    }

    @Override // defpackage.yx40
    public void setValue(int i) {
        setIntValue(i);
    }
}
