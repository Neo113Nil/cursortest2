package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class l401 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        int readInt;
        int D = SafeParcelReader.D(parcel);
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        long j = 0;
        long j2 = 0;
        String str = null;
        MediaInfo mediaInfo = null;
        MediaQueueData mediaQueueData = null;
        Boolean bool = null;
        long[] jArr = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (true) {
            double d2 = d;
            while (parcel.dataPosition() < D) {
                readInt = parcel.readInt();
                switch ((char) readInt) {
                    case 2:
                        mediaInfo = (MediaInfo) SafeParcelReader.h(parcel, readInt, MediaInfo.CREATOR);
                        break;
                    case 3:
                        mediaQueueData = (MediaQueueData) SafeParcelReader.h(parcel, readInt, MediaQueueData.CREATOR);
                        break;
                    case 4:
                        bool = SafeParcelReader.p(parcel, readInt);
                        break;
                    case 5:
                        j = SafeParcelReader.z(parcel, readInt);
                        break;
                    case 6:
                        break;
                    case 7:
                        jArr = SafeParcelReader.f(parcel, readInt);
                        break;
                    case '\b':
                        str = SafeParcelReader.i(parcel, readInt);
                        break;
                    case '\t':
                        str2 = SafeParcelReader.i(parcel, readInt);
                        break;
                    case '\n':
                        str3 = SafeParcelReader.i(parcel, readInt);
                        break;
                    case 11:
                        str4 = SafeParcelReader.i(parcel, readInt);
                        break;
                    case '\f':
                        str5 = SafeParcelReader.i(parcel, readInt);
                        break;
                    case '\r':
                        j2 = SafeParcelReader.z(parcel, readInt);
                        break;
                    default:
                        SafeParcelReader.C(parcel, readInt);
                        break;
                }
            }
            SafeParcelReader.n(parcel, D);
            Pattern pattern = o0a.a;
            if (str != null) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException unused) {
                }
                return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d2, jArr, jSONObject, str2, str3, str4, str5, j2);
            }
            jSONObject = null;
            return new MediaLoadRequestData(mediaInfo, mediaQueueData, bool, j, d2, jArr, jSONObject, str2, str3, str4, str5, j2);
            d = SafeParcelReader.r(parcel, readInt);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaLoadRequestData[i];
    }
}
