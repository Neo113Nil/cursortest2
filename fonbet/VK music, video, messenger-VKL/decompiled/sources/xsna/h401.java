package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.VastAdsRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class h401 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        MediaMetadata mediaMetadata = null;
        ArrayList arrayList = null;
        TextTrackStyle textTrackStyle = null;
        String str3 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        VastAdsRequest vastAdsRequest = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    mediaMetadata = (MediaMetadata) SafeParcelReader.h(parcel, readInt, MediaMetadata.CREATOR);
                    break;
                case 6:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 7:
                    arrayList = SafeParcelReader.m(parcel, readInt, MediaTrack.CREATOR);
                    break;
                case '\b':
                    textTrackStyle = (TextTrackStyle) SafeParcelReader.h(parcel, readInt, TextTrackStyle.CREATOR);
                    break;
                case '\t':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    arrayList2 = SafeParcelReader.m(parcel, readInt, AdBreakInfo.CREATOR);
                    break;
                case 11:
                    arrayList3 = SafeParcelReader.m(parcel, readInt, AdBreakClipInfo.CREATOR);
                    break;
                case '\f':
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    vastAdsRequest = (VastAdsRequest) SafeParcelReader.h(parcel, readInt, VastAdsRequest.CREATOR);
                    break;
                case 14:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 15:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 16:
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 17:
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 18:
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new MediaInfo(str, i, str2, mediaMetadata, j, arrayList, textTrackStyle, str3, arrayList2, arrayList3, str4, vastAdsRequest, j2, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaInfo[i];
    }
}
