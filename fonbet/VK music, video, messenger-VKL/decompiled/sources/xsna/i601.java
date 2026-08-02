package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class i601 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList<String> arrayList = null;
        int i = 0;
        int i2 = 0;
        long j = 0;
        String str5 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\t':
                    arrayList = SafeParcelReader.k(parcel, readInt);
                    break;
                case '\n':
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        Pattern pattern = o0a.a;
        if (str5 != null) {
            try {
                jSONObject = new JSONObject(str5);
            } catch (JSONException unused) {
            }
            return new MediaTrack(j, i, str, str2, str3, str4, i2, arrayList, jSONObject);
        }
        jSONObject = null;
        return new MediaTrack(j, i, str, str2, str3, str4, i2, arrayList, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaTrack[i];
    }
}
