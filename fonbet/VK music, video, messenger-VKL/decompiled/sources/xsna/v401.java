package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.VideoInfo;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class v401 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        MediaInfo mediaInfo = null;
        long[] jArr = null;
        String str = null;
        ArrayList arrayList = null;
        AdBreakStatus adBreakStatus = null;
        VideoInfo videoInfo = null;
        MediaLiveSeekableRange mediaLiveSeekableRange = null;
        MediaQueueData mediaQueueData = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        double d = 0.0d;
        double d2 = 0.0d;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    mediaInfo = (MediaInfo) SafeParcelReader.h(parcel, readInt, MediaInfo.CREATOR);
                    break;
                case 3:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 5:
                    d = SafeParcelReader.r(parcel, readInt);
                    break;
                case 6:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 7:
                    i3 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\b':
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\t':
                    j3 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\n':
                    d2 = SafeParcelReader.r(parcel, readInt);
                    break;
                case 11:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\f':
                    jArr = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\r':
                    i4 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 14:
                    i5 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 15:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 16:
                    i6 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 17:
                    arrayList = SafeParcelReader.m(parcel, readInt, MediaQueueItem.CREATOR);
                    break;
                case 18:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 19:
                    adBreakStatus = (AdBreakStatus) SafeParcelReader.h(parcel, readInt, AdBreakStatus.CREATOR);
                    break;
                case 20:
                    videoInfo = (VideoInfo) SafeParcelReader.h(parcel, readInt, VideoInfo.CREATOR);
                    break;
                case 21:
                    mediaLiveSeekableRange = (MediaLiveSeekableRange) SafeParcelReader.h(parcel, readInt, MediaLiveSeekableRange.CREATOR);
                    break;
                case 22:
                    mediaQueueData = (MediaQueueData) SafeParcelReader.h(parcel, readInt, MediaQueueData.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new MediaStatus(mediaInfo, j, i, d, i2, i3, j2, j3, d2, z, jArr, i4, i5, str, i6, arrayList, z2, adBreakStatus, videoInfo, mediaLiveSeekableRange, mediaQueueData);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaStatus[i];
    }
}
