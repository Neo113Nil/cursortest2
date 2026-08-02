package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.firebase.messaging.RemoteMessage;

/* compiled from: RemoteMessageCreator.java */
/* loaded from: classes13.dex */
public final class ovf0 implements Parcelable.Creator<RemoteMessage> {
    @Override // android.os.Parcelable.Creator
    @Nullable
    public final RemoteMessage createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                bundle = SafeParcelReader.b(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new RemoteMessage(bundle);
    }

    @Override // android.os.Parcelable.Creator
    @Nullable
    public final RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
