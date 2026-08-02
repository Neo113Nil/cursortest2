package xsna;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.globalactions.GlobalActionCard;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class ha01 implements Parcelable.Creator<GlobalActionCard> {
    @Override // android.os.Parcelable.Creator
    public final GlobalActionCard createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        String str = null;
        Bitmap bitmap = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bitmap bitmap2 = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    bitmap = (Bitmap) SafeParcelReader.h(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 4:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    bitmap2 = (Bitmap) SafeParcelReader.h(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 7:
                    pendingIntent = (PendingIntent) SafeParcelReader.h(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case '\b':
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        GlobalActionCard globalActionCard = new GlobalActionCard();
        globalActionCard.b = i;
        globalActionCard.c = str;
        globalActionCard.d = bitmap;
        globalActionCard.e = str2;
        globalActionCard.f = str3;
        globalActionCard.g = str4;
        globalActionCard.h = bitmap2;
        globalActionCard.i = pendingIntent;
        return globalActionCard;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GlobalActionCard[] newArray(int i) {
        return new GlobalActionCard[i];
    }
}
