package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class g401 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        int D = SafeParcelReader.D(parcel);
        String str = null;
        Integer num = null;
        String str2 = null;
        long j = 0;
        String str3 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                j = SafeParcelReader.z(parcel, readInt);
            } else if (c == 4) {
                num = SafeParcelReader.x(parcel, readInt);
            } else if (c == 5) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c != 6) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                str3 = SafeParcelReader.i(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        Pattern pattern = o0a.a;
        if (str3 != null) {
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException unused) {
            }
            return new MediaError(str, j, num, str2, jSONObject);
        }
        jSONObject = null;
        return new MediaError(str, j, num, str2, jSONObject);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaError[i];
    }
}
