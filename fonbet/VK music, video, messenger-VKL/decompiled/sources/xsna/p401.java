package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class p401 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        MediaQueueContainerMetadata mediaQueueContainerMetadata = null;
        ArrayList arrayList = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    mediaQueueContainerMetadata = (MediaQueueContainerMetadata) SafeParcelReader.h(parcel, readInt, MediaQueueContainerMetadata.CREATOR);
                    break;
                case 7:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\b':
                    arrayList = SafeParcelReader.m(parcel, readInt, MediaQueueItem.CREATOR);
                    break;
                case '\t':
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\n':
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 11:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        MediaQueueData mediaQueueData = new MediaQueueData();
        mediaQueueData.b = str;
        mediaQueueData.c = str2;
        mediaQueueData.d = i;
        mediaQueueData.e = str3;
        mediaQueueData.f = mediaQueueContainerMetadata;
        mediaQueueData.g = i2;
        mediaQueueData.h = arrayList;
        mediaQueueData.i = i3;
        mediaQueueData.j = j;
        mediaQueueData.k = z;
        return mediaQueueData;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaQueueData[i];
    }
}
