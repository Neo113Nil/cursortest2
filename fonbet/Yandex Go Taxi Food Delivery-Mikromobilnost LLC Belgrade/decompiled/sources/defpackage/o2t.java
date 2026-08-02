package defpackage;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.internal.identity.zzek;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class o2t {
    public final int a;
    public final int b;
    public final List c;
    public final Location d;

    public o2t(int i, int i2, ArrayList arrayList, Location location) {
        this.a = i;
        this.b = i2;
        this.c = arrayList;
        this.d = location;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o2t a(Intent intent) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (intent != null) {
            int intExtra = intent.getIntExtra("gms_error_code", -1);
            int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
            if (intExtra2 != -1) {
                if (intExtra2 != 1 && intExtra2 != 2) {
                    if (intExtra2 == 4) {
                        intExtra2 = 4;
                    }
                }
                arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
                if (arrayList != null) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        byte[] bArr = (byte[]) arrayList.get(i);
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(bArr, 0, bArr.length);
                        obtain.setDataPosition(0);
                        zzek createFromParcel = zzek.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        arrayList2.add(createFromParcel);
                    }
                }
                Location location = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
                if (arrayList2 == null || intExtra != -1) {
                    return new o2t(intExtra, intExtra2, arrayList2, location);
                }
            }
            intExtra2 = -1;
            arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
            if (arrayList != null) {
            }
            Location location2 = (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location");
            if (arrayList2 == null) {
            }
            return new o2t(intExtra, intExtra2, arrayList2, location2);
        }
        return null;
    }
}
