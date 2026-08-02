package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class o401 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        String str = null;
        ArrayList arrayList = null;
        int i = 0;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c == 3) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 4) {
                arrayList2 = SafeParcelReader.m(parcel, readInt, MediaMetadata.CREATOR);
            } else if (c == 5) {
                arrayList = SafeParcelReader.m(parcel, readInt, WebImage.CREATOR);
            } else if (c != 6) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                d = SafeParcelReader.r(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        MediaQueueContainerMetadata mediaQueueContainerMetadata = new MediaQueueContainerMetadata();
        mediaQueueContainerMetadata.b = i;
        mediaQueueContainerMetadata.c = str;
        mediaQueueContainerMetadata.d = arrayList2;
        mediaQueueContainerMetadata.e = arrayList;
        mediaQueueContainerMetadata.f = d;
        return mediaQueueContainerMetadata;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueContainerMetadata[i];
    }
}
