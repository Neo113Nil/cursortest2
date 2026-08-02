package xsna;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: NetworkRequestCompat.kt */
/* loaded from: classes12.dex */
public final class c560 {
    public static final int[] a = {13, 15, 14};

    public static final int[] a(NetworkRequest networkRequest) {
        int[] capabilities;
        if (Build.VERSION.SDK_INT >= 31) {
            capabilities = networkRequest.getCapabilities();
            return capabilities;
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            if (networkRequest.hasCapability(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return j5g.N0(arrayList);
    }

    public static final int[] b(NetworkRequest networkRequest) {
        int[] transportTypes;
        if (Build.VERSION.SDK_INT >= 31) {
            transportTypes = networkRequest.getTransportTypes();
            return transportTypes;
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            if (networkRequest.hasTransport(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return j5g.N0(arrayList);
    }
}
