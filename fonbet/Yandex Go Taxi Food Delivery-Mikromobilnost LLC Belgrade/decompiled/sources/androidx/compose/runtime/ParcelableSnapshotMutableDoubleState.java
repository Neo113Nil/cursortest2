package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.u2t0;
import defpackage.ud90;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableDoubleState;", "Lu2t0;", "Landroid/os/Parcelable;", "", "value", "<init>", "(D)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Companion", "ud90", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ParcelableSnapshotMutableDoubleState extends u2t0 implements Parcelable {
    public static final ud90 Companion = new ud90();
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new Parcelable.Creator<ParcelableSnapshotMutableDoubleState>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableDoubleState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableDoubleState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableDoubleState[] newArray(int size) {
            return new ParcelableSnapshotMutableDoubleState[size];
        }
    };

    public ParcelableSnapshotMutableDoubleState(double d) {
        super(d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // defpackage.px40, defpackage.m3u0
    public Double getValue() {
        return Double.valueOf(getDoubleValue());
    }

    @Override // defpackage.oz40
    public /* bridge */ /* synthetic */ void setValue(Object obj) {
        setValue(((Number) obj).doubleValue());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeDouble(getDoubleValue());
    }

    @Override // defpackage.m3u0
    public /* bridge */ /* synthetic */ Object getValue() {
        return getValue();
    }

    @Override // defpackage.px40
    public void setValue(double d) {
        setDoubleValue(d);
    }
}
